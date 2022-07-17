# Vending Machine

# Vending machine nya diisi mulai berapa pada awal hari, lalu dilihat pada akhir hari sisanya berapa

# Pada hari pertama hari ke-0 vending machine diisi 5 => [0, 5]
# Dan pada hari pertama juga (pada akhir hari) vending mechine sisanya adalah 3 => [0, 3]
# Dan pada besoknya vending mechine sisanya tinggal  2 => [1, 2]
# Jadi pada hari kedua tersebut isi vending mechine berkurang 1, dan pada hari kedua vending machine tidak diisi

# Produk pada awal hari bisa dicek dengan fillEvent
# Produk pada akhir hari bisa dicek dengan checkEvent

def getReport(checkEvents, fillEvents):
    # Write your code here
    eventMap = {}  # day -> [checkEvent, fillEvent]
    max_day = -1

    for [day, e] in checkEvents:
        eventMap[day] = [e]
        max_day = max(max_day, day)

    for [day, e] in fillEvents:
        if len(eventMap[day]) == 1:
            eventMap[day].append(0)
        eventMap[day][1] += e

    # iterasi max_day sampai ke 0
    num = 0
    sales = []
    for day in range(max_day+1):
        # tiap hari belum tentu ada fillEvent nya, jika ada fill, maka kita tambahin
        if len(eventMap[day]) > 1:
            num += eventMap[day][1]

        # sisa akhir hari
        remaining = eventMap[day][0]
        sales.append(num - remaining)
        num = remaining
    return sales
