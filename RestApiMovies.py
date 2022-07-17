import requests

BASE_URL_FORMAT = "https://jsonmock.hackerrank.com/api/movies?Year={}&page={}"


def checkIfMatch(title, query):
    # title bisa lower
    title = title.lower()

    beginWithAsterik = query[0] == "*"
    endWithAsterik = query[-1] == "*"

    # jika query tidak ada wilcard sama sekali, didepan dan dibelakang
    if not beginWithAsterik and not endWithAsterik:
        return title == query

    # jika query memiliki asterik didepan dan dibelakang
    if beginWithAsterik and endWithAsterik:
        # kita lihat query dari awal sampai akhir (mengignore asterik nya)
        sanitized_query = query[1:-1]
        return sanitized_query in title

    # jika query memiliki wildcard diawal querynya
    if beginWithAsterik:
        sanitized_query = query[1:]
        # bandingin ujungnya saja, jangan bandingin semuanya
        char_num = len(sanitized_query)
        # apakah query nya berakhir sama dengan sanitized query atau tidak
        return title[-char_num:] == sanitized_query

    # jika query memiliki wildcard diakhir query
    sanitized_query = query[:-1]
    char_num = len(sanitized_query)
    return title[:char_num] == sanitized_query


def getMovies(year, query):
    # Write your code here

    page = 1
    result = []  # list kosong

    # kita coba hit terus API nya, dengan perulangan terus menerus
    while True:
        url = BASE_URL_FORMAT.format(year, page)
        response = requests.get(url)
        body = response.json()

        # cek jika body yang bernilai kosong, maka kita break (keluar dari perulangan)
        if len(body.get("data", [])) == 0:
            break

        # Process data body nya
        data = body["data"]

        # ambil semua object data
        for datum in data:
            imdbID = datum.get("imdbID", "")
            title = datum.get("Title", "")

            if checkIfMatch(title, query):
                result.append([imdbID, title])

        page += 1

    return result
