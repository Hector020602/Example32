import java.util.Scanner;
public class Example32 {

    public static void main(String[] argv) {
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        System.out.println("Enter a number:");

        double x, y, n;
        n = inputValue.nextDouble();

        x = n;
        for (int i = 1; i <= 10; i++) {
            y = 0.5 * (x + n / x);
            x = y;
            System.out.println(x);

        }

    }

}
