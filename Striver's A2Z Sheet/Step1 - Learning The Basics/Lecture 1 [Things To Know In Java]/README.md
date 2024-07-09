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


| **Data Type** | **Size** | **Description** |
|----------|----------|----------|
| byte	 | 1 byte 	| Stores whole numbers from -128 to 127 |
| short 	| 2 bytes |	Stores whole numbers from -32,768 to 32,767 |
| int	 | 4 bytes	| Stores whole numbers from -2,147,483,648 to 2,147,483,647 |
| long 	| 8 bytes |	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| float	 | 4 bytes |	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits |
| double 	| 8 bytes |	Stores fractional numbers. Sufficient for storing 15 decimal digits |
| boolean 	| 1 bit 	| Stores true or false values |
| char	 | 2 bytes | Stores a single character/letter |



### If-Else Statements

The syntax of an if-then statement is:

```
if (condition) {
  // statements if the condition is true
}
else{
  //statements if the condition is false
}
```

Here, condition is a boolean expression:

- if condition evaluates to true, statements are executed.
- if condition evaluates to false, statements are skipped.



### For-Loop

Java for loop is used to run a block of code for a certain number of times. The syntax of for loop is:

```
for (initialExpression; testExpression; updateExpression) {
    // body of the loop
}
```

Here,
- The initialExpression initializes and/or declares variables and executes only once.
- The condition is evaluated. If the condition is true, the body of the for loop is executed.
- The updateExpression updates the value of initialExpression.
- The condition is evaluated again. The process continues until the condition is false.



### While-Loop

1. **While loop**
Java while loop is used to run a specific code until a certain condition is met. The syntax of the while loop is:

```
while (testExpression) {
    // body of loop
}
```

Here,
- A while loop evaluates the textExpression inside the parenthesis ().
- If the textExpression evaluates to true, the code inside the while loop is executed.
- The textExpression is evaluated again.
- This process continues until the textExpression is false.
- When the textExpression evaluates to false, the loop stops.

2. **do...while loop**
The do...while loop is similar to while loop. However, the body of do...while loop is executed once before the test expression is checked. For example,

```
do {
    // body of loop
} while(textExpression);
```

Here,
- The body of the loop is executed at first. Then the textExpression is evaluated.
- If the textExpression evaluates to true, the body of the loop inside the do statement is executed again.
- The textExpression is evaluated once again.
- If the textExpression evaluates to true, the body of the loop inside the do statement is executed again.
- This process continues until the textExpression evaluates to false. Then the loop stops.



### Switch-Statements

The switch statement allows us to execute a block of code among many alternatives.

Syntax:

```
switch (expression) {

  case value1:
    // code
    break;
  
  case value2:
    // code
    break;
  
  ...
  ...
  
  default:
    // default statements
  }
```

The expression is evaluated once and compared with the values of each case.
- If expression matches with value1, the code of case value1 are executed. Similarly, the code of case value2 is executed if expression matches with value2
- If there is no match, the code of the default case is executed

