package in.rudresh.bank;

import java.time.LocalDate;
import java.util.*;

public class BankApp {

	public static void main(String[] args) {

		List<Transaction> list = Arrays.asList(new Transaction(1, "DEPOSIT", 20000, LocalDate.of(2023, 1, 10)),
				new Transaction(2, "WITHDRAW", 5000, LocalDate.of(2023, 1, 12)),
				new Transaction(3, "DEPOSIT", 50000, LocalDate.of(2023, 2, 5)),
				new Transaction(4, "WITHDRAW", 15000, LocalDate.of(2023, 2, 20)),
				new Transaction(5, "DEPOSIT", 70000, LocalDate.of(2023, 3, 15)),
				new Transaction(6, "WITHDRAW", 35000, LocalDate.of(2023, 3, 25)),
				new Transaction(7, "DEPOSIT", 100000, LocalDate.of(2023, 4, 10)),
				new Transaction(8, "WITHDRAW", 2000, LocalDate.of(2023, 4, 12)));

		BankService service = new BankService(list);
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n===== BANK TRANSACTION MENU =====");
			System.out.println("1. View All Transactions");
			System.out.println("2. Total Deposits");
			System.out.println("3. Total Withdrawals");
			System.out.println("4. Highest Transaction");
			System.out.println("5. Group by Type");
			System.out.println("6. Monthly Summary");
			System.out.println("7. Detect Fraud Transactions");
			System.out.println("8. Account Balance");
			System.out.println("9. Exit");
			System.out.print("Enter choice: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				service.showAll();
				break;
			case 2:
				service.totalDeposits();
				break;
			case 3:
				service.totalWithdrawals();
				break;
			case 4:
				service.highestTransaction();
				break;
			case 5:
				service.groupByType();
				break;
			case 6:
				System.out.print("Enter Month (1–12): ");
				service.monthlySummary(sc.nextInt());
				break;
			case 7:
				service.detectFraud();
				break;
			case 8:
				service.accountBalance();
				break;
			case 9:
				System.out.println("Thanks for using Bank System!");
				return;
			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}
