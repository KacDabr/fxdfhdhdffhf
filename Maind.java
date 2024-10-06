import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Konto[] konta = new Konto[10];

        for (int i = 0; i < konta.length; i++) {
            konta[i] = new Konto(i, 100);
        }

        while (true) {
            System.out.print("Enter an id: ");
            int id = scanner.nextInt();

            if (id < 0 || id >= 10) {
                System.out.println("Invalid ID. Please try again.");
                continue;
            }

            Konto currentAccount = konta[id];
            int choice;

            do {
                System.out.println("\nMain menu");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");
                System.out.print("Enter a choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("The balance is " + currentAccount.getBalance());
                        break;
                    case 2:
                        System.out.print("Enter an amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        currentAccount.withdraw(withdrawAmount);
                        break;
                    case 3:
                        System.out.print("Enter an amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        currentAccount.deposit(depositAmount);
                        break;
                    case 4:
                        System.out.println("Exiting to ID selection...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } while (choice != 4);
        }
    }
}
