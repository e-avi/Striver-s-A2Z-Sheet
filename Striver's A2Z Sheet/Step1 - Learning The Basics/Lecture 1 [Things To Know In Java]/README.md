### User Input and Output

1. **Input**

- For input we require Scanner class, which can be imported using the java.util.scanner package
```
import java.util.Scanner;
```

- Then, we need to create an object of the Scanner class. We can use the object to take input from the user.
```
// create an object of Scanner
Scanner scn = new Scanner(System.in);

// take input from the user
int number = scn.nextInt();
```

- Similarly, we can use nextLong(), nextFloat(), nextDouble(), and next() methods to get long, float, double, and string input respectively from the user.

2. **Output**

- In Java, you can simply use these statements to send output to standard output (screen)
```
System.out.println(); or

System.out.print(); or

System.out.printf();
```

- print() - It prints string inside the quotes.

- println() - It prints string inside the quotes similar like print() method. Then the cursor moves to the beginning of the next line.



### Data Types

| Data Type | Size | Description |
|----------|----------|----------|
| Byte | Data 1   | Data 2   |
| Short | Data 3   | Data 4   |
| Int | |
| Long ||
| Float ||
| Double ||
| Boolean ||
| Char ||


| Data Type | Size | Description |
|----------|----------|----------|
| byte	 | 1 byte 	| Stores whole numbers from -128 to 127 |
| short 	| 2 bytes |	Stores whole numbers from -32,768 to 32,767 |
| int	 | 4 bytes	| Stores whole numbers from -2,147,483,648 to 2,147,483,647 |
| long 	| 8 bytes |	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| float	 | 4 bytes |	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits |
| double 	| 8 bytes |	Stores fractional numbers. Sufficient for storing 15 decimal digits |
| boolean 	| 1 bit 	| Stores true or false values |
| char	 | 2 bytes | Stores a single character/letter |