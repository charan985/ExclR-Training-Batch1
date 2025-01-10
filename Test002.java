import java.util.Scanner;

public class Test002 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Do you want to continue? (yes/no): ");
            String reply = scanner.nextLine();

            if (reply.equalsIgnoreCase("yes")) {
                System.out.println("Happy Sankranthi");
            } else {
                System.out.println("");
                break;
            }
        }

        scanner.close();
    }
}