﻿# Bank Management System
🏦 Bank Management System (Java + Swing + MySQL)
A desktop-based Bank Management System using Java Swing for GUI and MySQL for database operations. This system simulates basic ATM functionalities like deposit, withdrawal, mini statements, balance enquiry, and PIN change.

🚀 Features
User Registration: 3-step signup process (Signup1, Signup2, Signup3)

Login Authentication

Transaction Operations:

Deposit

Withdraw

Fast Cash

Balance Enquiry

Mini Statement

PIN Change

Auto-generated Card & PIN numbers

MySQL Database Integration

🗂️ Modules Summary
Class Name	Purpose
Signup1	Personal details form
Signup2	Additional information (PAN, Aadhar, income, etc.)
Signup3	Account type, card number generation, service selection
Login	Login screen (not shown above)
Transactions	Main ATM screen with all banking options
Deposit	Handles deposit operation
Withdrawl	Withdraw money and insert transaction
FastCash	Quick fixed-amount withdrawal
BalanceEnquiry	Show current balance calculated from transactions
MiniStatement	Displays last transactions and current balance
PinChange	Change ATM PIN and update across tables
Conn	JDBC connection setup with MySQL

🧰 Technologies Used
Java Swing – GUI

MySQL – Database

JDBC – Database Connectivity

JCalendar – Date Picker (for DOB)

🛠️ Setup Instructions
Clone the project

Import to IDE like NetBeans or IntelliJ

Setup MySQL database:

Create DB: bankmanagementsystem

Import tables: signup1, signup2, signup3, login, bank

Update DB credentials in Conn.java

Run Signup1.java to create a new account

Run Login.java to login and access features

✅ Notes
Validation checks are added for PIN change and signup forms.

Ensure correct database setup before running.
