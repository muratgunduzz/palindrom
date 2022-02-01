import java.util.Scanner;
public class palindrom {
    static boolean isPalindrom(int number) {
        int temp;
        for (int i = 0; i <= number; i++) {
            int lNumber = 0;
            int rNumber = 0;
            temp=i;
            while (i != 0 && i > 9 && temp >= 1) {
                lNumber = temp % 10;
                System.out.println("l "+lNumber);
                rNumber = (rNumber * 10) + lNumber;
                System.out.println("r "+rNumber);
                temp /= 10;
                // Girilen sayıya kadarki sayıların palindrom olup olmadığını yazdırdım.
                if (i == rNumber) {
                    System.out.println(rNumber + " is polindrom");
                    break;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = inp.nextInt();
        isPalindrom(number);
    }
}
