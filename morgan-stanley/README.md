# Catatan

- Try-with-resources, sudah auto closable, jadi tidak perlu menutup secara manual
- Biasanya menutup file yang kebuka, menggunakan finally
```bash

try (resources) {
  
} 

```
- asd
- asd

# Soal Anagrams

- An anagram is a sequence of numbers that can be formed by rearranging the digits of a string
- Given a string that consists of only digits, modify the first half of the string so that it is an anagram of the second half.
- Determine the minimum number of operations needed to complete the task. 

The following is one operation's :
- Replace any digits in the string with any other digit(0 - 9)

Example:
s = '123122'
The first half is '123' and the second half is '122'. an anagram of the second half.

Function Description
Complete the function getAnagram in the editor below.

getAnagram has the following parameter:
    string s: a string of digits

Returns:
    int: the minimum number of operations needed to maka the string's first half an anagram of it second half

Sample Input
s = '123456'

Sample Output
3

Explanation
The first half, '123', can be converted to '456' in 3 operations.
Converting it to '465', '546', '654', etc. Would also work, but in all cases, it requires 3 operations

# Soal Office Design

- A company is repainting its office and would like to choose colors that work well together.
- They are presented with several various priced color options presented in a specific order so that each color complements the surrounding colors.
- The company has a limited budget and would like to select the greatest number of consecutive colors that fit within this budget.
- Given the prices of the colors and the company's budget, what is the maximum number of colors that can be purchased for this repainting project?

Example
```
prices = [2,3,5,1,1,2,1]
money = 7
```
All subarrays that sum to less than or equal to 7:
Length 1 subarrays are [2], [3], [5], [1], [1], [2], [1]
Length 2 - [2, 3], [5,1], [1,1], [1,2], [2,1]
Length 3 - [5,1,1], [1,1,2], [1,2,1]
Length 4 - [1,1,2,1]

Function Description
Complete the function getMaxColors in the editor below.

getMaxColors has the following parameters:
    int prices[n]: the prices of the various paint colors
    int money: the amount of money the company can spend on paints
Returns:
    int: the maximum number of colors the company can purchase

Sample Input
3       -> prices[] size n = 3
10      -> prices = [10, 10, 10]
10
10
5       -> money = 5

Sample Output
0       -> tidak ada color yang harganya <= 5

Sample Input
3       -> prices[] size n = 3
5       -> prices = [5, 10, 10]
10
10
5       -> money = 5

Sample Output
1       

Explanation
With the company budget of 5, only 1 color (the first) can be purchased.
Therefore, the answer is 1.