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

# Intelligent Substring

- There are two types of characters in a particular language: special and normal.
- A character is special if its values is 1 and normal if its value is 0.
- Given string s, return the longest substring of s that contains at most k normal characters.
- Whether a character is normal is determined by a 26-digit bit string named charValue.
- Each digit in charValue corresponds to a lowercase letter in the English alphabet.

Example:
s = 'abcde'
alphabet =abcdefghijklmnopqrstuvwxyz
charValue=10101111111111111111111111111

- The only normal characters in the language (according to charValue) are b and d.
- The string s contains both of these characters.
- For k = 2, the longest substring of s that contains at most k = 2 normal characters is 5 characters long, abcde, so the return value is 5.
- If k = 1 instead, then the possible substrings are ['b', 'd', 'ab', 'bc', 'cd', 'de', 'abc', 'cde']
- The longest substrings are 3 characters long, which would mean a return value of 3.

Function Description

getSpecialSubstring has the following parameter(s):
string s: the input string
int k: the maximum number of normal characters allowed in a substring


# Task Queue

- Task queues, which allow for asynchronous performance, are an important part of modern processing architectures.
- Information about a system consisting of several batch processing queues is given.

Each queue has three parameters:
1. the maximum number of tasks it can process in a single batch
2. the time it takes to process a single batch of task in that queue
3. the number of tasks the queue must process

Given this information, calculate the minimum time needed to process a set of tasks by the system.

Example:
n = 2
batchSize = [4,3]
processingTime = [6,5]
numTasks = [8,8]

Queue 0 can process a maximum of 4 tasks

# Distance Metric

- For each element in a given array, calculate the absolute value of index differences between it and all other elements of the same value.
- Return the resulting values in an array.
- For example, if the array elements at indices 2 and 3 are equal, the distance metric for element 2 is |2-3| = 1. For element 3 it is |3-2| = 1

Example:
n = 6
arr = [1,2,1,1,2,3]

The element arr[0] = 1. Similar elements are at indices 2 and 3.
The distance metric for arr[0]= |0-2| + |0-3| = 5
Similar logic follows:
The distance metric for arr[1] = |1-4| = 3
The distance metric for arr[2] = |2-0| + |2-3| = 3
The distance metric for arr[3] = |3-0| + |3-2| = 4
The distance metric for arr[4] = |4-1| = 3
The distance metric for arr[5] = 0
Thus, distance metrics = [5,3,3,4,3,0]

