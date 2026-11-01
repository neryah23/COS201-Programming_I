import java.util.Scanner;

public class SimpleCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter the first number: ");
double firstNumber = input.nextDouble();

System.out.print("Enter the second number: ");
double secondNumber = input.nextDouble();

double sum = firstNumber + secondNumber;
double difference = firstNumber - secondNumber;
double product = firstNumber * secondNumber;

System.out.println("Sum: " + sum);
System.out.println("Difference: " + difference);
System.out.println("Product: " + product);

if (secondNumber != 0) {
double quotient = firstNumber / secondNumber;
System.out.println("Quotient: " + quotient);
} else {
System.out.println("Division is undefined for a zero divisor.");
}

input.close();
}
}