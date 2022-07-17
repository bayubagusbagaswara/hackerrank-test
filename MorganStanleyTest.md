# Counting Binary Substrings

A substring is a group of configuos characters in a string. For instance, all substrings of `abc` are `[a, b, c, ab, bc, abcd].`

Given a binary representation of a number, determine (tentukan) the total number of substrings present that match the following conditions:

1. The 0's and 1's are grouped consecutively (e.g., 01, 10, 0011, 1100, 000111, etc).
2. The number of 0's in the substring is equal to the number of 1's in the substring.

As an example, consider the string 001101. The 4 substrings matching the two conditions include [0011, 01, 10, 01]. Note that 01 appears twice, from indices 1-2 and 4-5. There are other substrings, e.g. 001 and 011 that match the first condition but not the second.

## Function Description
Complete the function counting in the editor below.

counting has the following parameter(s):
`string s`: a string representation of a binary integer

## Returns

`int`: the number of substrings of `s` that satisfy the two conditions

## Constraint (Batasan)

- 5 <= |s| <= 500000 (minimal string bernilai 5)
- each `s[i]` is either (salah satu) '0' or '1' (karena biner)



