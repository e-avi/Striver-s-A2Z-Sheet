### Pattern_22

1. Total number of rows and columns = 2*n-1
2. If subtracted from n, a demo matrix will be of 0s at the outermost layer, 1s at the send layer and so on
3. Calculate the top(i), bottom(j), right(2xn-2-j) and left(2xn-2-i)
4. The number in the matrix is always equivalent to the min(top,bottom,left,right)
5. Print the pattern after subratcting it from n to get the original result
