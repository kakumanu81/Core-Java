package com.serilazationaanddesrialization;

import java.io.IOException;
import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

class BankAccount implements Serializable {

	private String account_number;
	private transient double balance;
	private transient String accountType;

	public BankAccount(String account_number, double balance, String accountType) {

		this.account_number = account_number;
		this.balance = balance;
		this.accountType = accountType;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void display_Account_Details() {
		System.out.println("Account Number : " + account_number);
		System.out.println("Balance : " + balance);
		System.out.println("Account Type : " + accountType);
	}

}

public class Trancent_KeyWord {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		BankAccount bank = new BankAccount("40364758825", 5000.0, "Savings");
		serilizaedBankAccount(bank);
		deserilizedBankAccount();

	}

	public static void serilizaedBankAccount(BankAccount account) {
		try {
			FileOutputStream fos = new FileOutputStream("BankAccount.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			account.display_Account_Details();
			oos.writeObject(account);
			oos.close();
			fos.close();
			System.out.println("Serilization sucssefull. serilizaed data is saved in backaccunt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void deserilizedBankAccount() throws IOException, ClassNotFoundException {
		try {
			FileInputStream fis = new FileInputStream("BankAccount.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			BankAccount Account = (BankAccount) ois.readObject();
			Account.display_Account_Details();
			fis.close();
			ois.close();
			System.out.println("deserilization succesfull data is saved");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
