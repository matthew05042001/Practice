# Practice1

This project is a Java application that calculates the average of a series of numbers entered by the user. The user specifies the number of test cases (numbers) they want to input, and the program calculates and displays the average, minimum, and maximum values.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine.

### Running the Program

1. **Clone the Repository**:
    ```sh
    git clone https://github.com/your-username/practice1.git
    cd practice1
    ```

2. **Compile the Program**:
    ```sh
    javac -d bin src/com/mycompany/practice1/Practice1.java
    ```

3. **Run the Program**:
    ```sh
    java -cp bin com.mycompany.practice1.Practice1
    ```

### How It Works

1. **User Input**:
    - The program prompts the user to enter the number of test cases.
    - The user then enters the specified number of values.

2. **Processing Data**:
    - The program stores the values in an array.
    - It calculates the sum of the values.
    - It calculates the average of the values.

3. **Output**:
    - The program prints each value as it is entered.
    - It displays the average value.
    - It shows the first entered value as the minimum (this should ideally be improved to find the true minimum value).
    - It shows the second-to-last entered value as the maximum (this should ideally be improved to find the true maximum value).

### Example

```plaintext
Enter number of test cases:
3
1#
12.5
2#
15.0
3#
10.0
Average  = 12.50
is the minimum 12.5
is the maximum 15.0
