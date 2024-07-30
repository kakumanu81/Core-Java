package com.codegnan.packages;

import java.io.FileNotFoundException;

class TooYoungException extends Exception {
	public TooYoungException(String message) {
		super(message);
	}
}

class TooOldException extends Exception {
	public TooOldException(String message) {
		super(message);
	}
}

public class MarriageEligibulityChecker {
	public void checkEligibulity(int age) throws TooYoungException, TooOldException {
		if (age < 18) {
			throw new TooYoungException("Marriage cannot be approved, age is below 18 years");
		} else if (age > 60) {
			throw new TooOldException("Marriage cannot be approved your age is already cross");
		} else {
			System.out.println("Marriage Approved. wait some time you will get match details ");
		}
	}

	public static void main(String[] args) {
		try {
			MarriageEligibulityChecker checker = new MarriageEligibulityChecker();
			checker.checkEligibulity(20);
			// checker.checkEligibulity(16);
			// checker.checkEligibulity(70);
		} catch (TooYoungException e) {
			System.out.println("Exception caught " + e.getMessage());
		} catch (TooOldException e) {
			System.out.println("Exception caught " + e.getMessage());
		}
	}
}
