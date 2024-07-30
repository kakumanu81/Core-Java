package com.packages.exceptionhandling;



class Young_Voters extends Exception {
	public Young_Voters(String message) {
		super(message);
	}
}

class Old_Voters extends Exception {
	public Old_Voters(String message) {
		super(message);
	}
}

class Not_Eligible_Voter extends Exception {
	public Not_Eligible_Voter(String message) {
		super(message);
	}
}

public class VotersCatageory {
	public void checkEligibulity(int age) throws Young_Voters, Old_Voters, Not_Eligible_Voter {
		if (age >= 18 && age <= 60) {
			throw new Young_Voters("Your are the Young Voter");
		} else if (age > 60 && age < 100) {
			throw new Old_Voters("Your are the Old Voter");
		} else if (age < 18) {
			throw new Not_Eligible_Voter("Your Not Elgible gor Votes");
		} else {
			System.out.println("Normal Voters");
		}
	}

	public static void main(String[] args) {
		try {
			VotersCatageory checker = new VotersCatageory();
			checker.checkEligibulity(98);

		} catch (Young_Voters e) {
			System.out.println("Exception caught: " + e.getMessage());
		} catch (Old_Voters e) {
			System.out.println("Exception caught: " + e.getMessage());
		} catch (Not_Eligible_Voter e) {
			System.out.println("Exception caught:" + e.getMessage());
		}

	}

}
