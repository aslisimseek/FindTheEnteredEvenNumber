import java.util.Scanner;

public class FindTheEnteredEvenNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a Number..:");
        int userNumber = scanner.nextInt();

        for (int i = 1; i <= userNumber; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
