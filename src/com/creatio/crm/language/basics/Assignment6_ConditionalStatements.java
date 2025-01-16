package com.creatio.crm.language.basics;

public class Assignment6_ConditionalStatements {

	public static void main(String[] args) {
		
		/*
		 * This assignment is to check whether the employee is eligible for loan or not.
		 * By checking various other sub conditions.
		 */
		
		
		//Customer details

		String customerName="John Doe";
		int creditScore = 720;
		double income = 55000.0;
		boolean isEmployed = true;
		double debtToIncomeRatio = 35.0;
		
		
		//If conditional statement is used to check creditscore is above 750 ,loan is approved
		
		if (creditScore > 750)
		{
			System.out.println("Loan is automatically approved");
		}
		
		/*
		 * else if is used to check next condition i.e creditscore is between 650 and 750 then additional checks will be performed
		 * Multiple if statement is used to check other details such as income,employmentstaus,debt to income ratio
		 */
		
		else if (creditScore >= 650 && creditScore <= 750)
		{
			if(income >= 55000.0)
			{
				if(isEmployed)
				{
					if(debtToIncomeRatio < 40)
					{
						System.out.println("Loan is approved");
					}
					else
					{
						System.out.println("DebtToIncome Ratio is less to approve loan");
					}
				}
				else
				{
					System.out.println("Unemployed staus is not eligible to approve loan");
				}
				
			}
			else
			{
				System.out.println("Income is less to approve loan");
			}
		}
		else
		{
			System.out.println("Loan is denied");
			
	    }

}
}
