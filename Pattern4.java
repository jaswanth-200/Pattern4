import java.util.Scanner;

public class Pattern4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        // user input
        int n = sc.nextInt();
        int spaces;
        // Loop for rows
        for (int i = 1; i <= n * 2; i++) {
            if (i <= n) {
                spaces = n - i;
                // Printing spaces
                for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
                // Printing decreasing numbers
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }
                // Printing increasing numbers
                for (int j = 2; j <= i; j++) {
                    System.out.print(j);
                }
                
                // nextline
                System.out.println("");
            }
            else {
                spaces = i - n;
                // Printing spaces
                for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
                // Printing decreasing numbers
                for (int j = 2 * n - i; j >= 1; j--) {
                    System.out.print(j);
                }
                // Printing increasing numbers
                for (int j = 2; j <= 2 * n - i; j++) {
                    System.out.print(j);
                }
                System.out.println("");
            }
        }
    }
}
