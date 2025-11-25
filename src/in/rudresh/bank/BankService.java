package in.rudresh.bank;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class BankService {

	private List<Transaction> list;

	public BankService(List<Transaction> list) {
		this.list = list;
	}

	// Show all
	public void showAll() {
		list.forEach(System.out::println);
	}

	// Total deposit
	public void totalDeposits() {
		double sum = list.stream().filter(t -> t.getType().equalsIgnoreCase("DEPOSIT")).map(Transaction::getAmount)
				.reduce(0.0, Double::sum);

		System.out.println("Total Deposits = ₹" + sum);
	}

	// Total withdrawal
	public void totalWithdrawals() {
		double sum = list.stream().filter(t -> t.getType().equalsIgnoreCase("WITHDRAW")).map(Transaction::getAmount)
				.reduce(0.0, Double::sum);

		System.out.println("Total Withdrawals = ₹" + sum);
	}

	// Highest transaction
	public void highestTransaction() {
		Optional<Transaction> t = list.stream().max(Comparator.comparing(Transaction::getAmount));

		System.out.println("Highest Transaction:\n" + t.orElse(null));
	}

	// Group by type
	public void groupByType() {
		Map<String, List<Transaction>> map = list.stream().collect(Collectors.groupingBy(Transaction::getType));

		System.out.println(map);
	}

	// Monthly summary
	public void monthlySummary(int month) {
		list.stream().filter(t -> t.getDate().getMonthValue() == month).forEach(System.out::println);
	}

	// Fraud detection (amount > 50,000)
	public void detectFraud() {
		list.parallelStream().filter(t -> t.getAmount() > 50000)
				.forEach(t -> System.out.println("Fraud Alert: " + t));
	}

	// Summary balance
	public void accountBalance() {
		double deposits = list.stream().filter(t -> t.getType().equalsIgnoreCase("DEPOSIT")).map(Transaction::getAmount)
				.reduce(0.0, Double::sum);

		double withdrawals = list.stream().filter(t -> t.getType().equalsIgnoreCase("WITHDRAW"))
				.map(Transaction::getAmount).reduce(0.0, Double::sum);

		System.out.println("Account Balance = ₹" + (deposits - withdrawals));
	}
}
