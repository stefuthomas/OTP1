# HomeAssignment2

## a. What does the assertArrayEquals method do?
assertArrayEquals checks wether provided arrays are equal in length and that all corresponding elements are equal.

## b. What will happen if the arrays a1 and a2 are not equal in testSingleDimensionalArrayEquality?
If the arrays a1 and a2 are not equal in the testSingleDimensionalArrayEquality method, the JUnit test will fail, and an AssertionError will be thrown.

## c. How does the assertArrayEquals method handle multi-dimensional arrays as seen in testMultiDimensionalArrayEquality?
It checks wether the parent arrays have the same length and if the corresponding sub-arrays are equal. For the sub-arrays, assertArrayEquals uses the equals method of the array objects themselves. 
