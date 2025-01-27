import java.util.Scanner;

public class Demo042 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a lowercase character: ");
        char ch = sc.next().charAt(0);

        char upperCh = Character.toUpperCase(ch);
        System.out.println("The uppercase character is: " + upperCh);

        sc.close();
    }
}