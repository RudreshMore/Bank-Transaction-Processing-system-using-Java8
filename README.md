# 🏦 Bank Transaction Processing System (Java 8)

The **Bank Transaction Processing System** is a Java 8 console-based application that simulates basic banking transaction analysis.  
It processes deposit and withdrawal transactions using **Java 8 functional programming features**.

This project demonstrates real-world usage of **Streams, Lambda Expressions, Collectors, Optional, Parallel Streams, and Date & Time API**.

---

## 🚀 Features

- View all bank transactions
- Calculate total deposits
- Calculate total withdrawals
- Compute account balance using `reduce()`
- Identify highest-value transaction
- Group transactions by type (Deposit / Withdraw)
- Generate monthly transaction summary
- Detect high-value (fraud-prone) transactions using `parallelStream()`
- Uses predefined transaction data (no manual transaction input)
- Menu-driven application for easy usage

---

## 🛠 Technologies Used

- **Java 8**
- Stream API
- Lambda Expressions
- Collectors (`groupingBy`, `counting`)
- Optional
- Parallel Streams
- Date & Time API (`LocalDate`)
- Object-Oriented Programming (OOP)

---

## 📌 Java 8 Concepts Implemented

- Functional Programming
- Stream operations (`filter`, `map`, `sorted`, `reduce`)
- Collectors API
- Optional for null-safe operations
- Parallel Stream for fraud detection
- Comparator for sorting
- Date handling using `LocalDate`

---

Sample Output:  

===== BANK TRANSACTION MENU =====
1. View All Transactions
2. Total Deposits
3. Total Withdrawals
4. Highest Transaction
5. Group by Type
6. Monthly Summary
7. Detect Fraud Transactions
8. Account Balance
9. Exit

Account Balance = ₹135000
⚠ Fraud Alert: Transaction ID 7 | Amount: 100000

