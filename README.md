# APCS Repo

### 0. Binary and Decimals
The "base" in base-x number system describes different ways to represent values, dictating how many unique digits can be used in each place value.

### 1. Binary definition
Binary is a system of counting or information storage using only 2 possible values - 1 or 0 - to store the state of something. It is important in computing because bits/transistors can each only store on/off or high/low voltage.

### 2. Algo for Binary -> Decimal
Determine the place value index (starting at 0) by counting from the rightmost digit of the given binary number, increasing by 1 per digit.\
To calculate the decimal representation of the number, calculate the sum of the result of each of the digits multiplied by 2 to the power of its respective place value index.

#### Example:
100\_2 -> decimal \
210 <- indicies

### 3. Algo for Decimal -> Binary
(A) Given a number in decimal representation, take the remainder of the decimal number divided by 2. Append this remainder output to the left of the existing binary number (or set it as the binary number if none exist).\
(B) If the quotient of the decimal number divided by 2 in step A is 1, append it to the left of the existing binary number. If the quotient of step A is greater than 1, repeat step A using that quotient as the decimal number. If the quotient of step A is 0, proceed.\
(C) The binary representation has been calculated.

#### Example:
12 -> binary\
12/2 = 6 r0\
6/2  = 3 r0\
3/2  = 1 r1\
          1\
\
From the bottom up: 1100\_2\
Therefore 12 = 1100\_2

### Notes:
This was harder to put into words than we originally thought. We didn't have enough time to come up with many examples.
