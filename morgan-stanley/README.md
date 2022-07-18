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