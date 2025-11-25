package in.rudresh.bank;

import java.time.LocalDate;

public class Transaction {

	private int id;
	private String type; // DEPOSIT / WITHDRAW
	private double amount;
	private LocalDate date;

	public Transaction(int id, String type, double amount, LocalDate date) {
		this.id = id;
		this.type = type;
		this.amount = amount;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}

	public LocalDate getDate() {
		return date;
	}

	@Override
	public String toString() {
		return id + " | " + type + " | Amount: " + amount + " | Date: " + date;
	}
}
