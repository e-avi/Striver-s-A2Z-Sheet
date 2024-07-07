## User Input and Output

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

