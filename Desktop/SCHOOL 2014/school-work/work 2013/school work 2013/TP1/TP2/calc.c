/* File: calc.c
   This is Assignment 2 */

#include <stdio.h>

int main()
{
	float carPrice, deposit, tradeInValue, carFinanceRequired, interestRate, interestAmount, residualPercentage, residualAmount, monthlyRepayment, balanceOwing, totalRepayment;
	int termOfLoan, i;
	
	system("clear");
	printf("Loan Repayment Calculator\n\n");
	printf("Please enter the following information :-\n");
	printf("Car price: ");
	scanf("%f", &carPrice);
	printf("Deposit: ");
	scanf("%f", &deposit);
	printf("Trade-in value: ");
	scanf("%f", &tradeInValue);
	carFinanceRequired = carPrice - (deposit + tradeInValue);
	printf("Interest rate %%: ");
	scanf("%f", &interestRate);	
	printf("Residual %%: ");
	scanf("%f", &residualPercentage);
	residualAmount = 0;
	printf("Term of loan (in months): ");
	scanf("%d", &termOfLoan);

	/* Calculate monthly repayments */
	
	system("clear");
	printf("Loan calculation as follows:\n\n");
	printf("Car price: R%.2f\n", carPrice);
	printf("Deposit: R%.2f\n", deposit);
	printf("Trade-in value: R%.2f\n", tradeInValue);
	printf("Car Finance amount required: R%.2f\n", carFinanceRequired);
	printf("Interest rate: %.0f%%\n", interestRate);
	printf("Residual amount: R%.2f\n", residualAmount);
	printf("Term of loan (in months): %d\n\n", termOfLoan);

	monthlyRepayment = carFinanceRequired / termOfLoan;
	interestAmount = monthlyRepayment * interestRate / 100 / 12;
	printf("Month\tMonthly Repayment\tBalance owing\n");
	for (i = 1; i <= termOfLoan; i++)
	{
		balanceOwing = carFinanceRequired - (monthlyRepayment * i);
		printf("%d\tR%.2f\t\tR%.2f\n", i, monthlyRepayment+interestAmount, balanceOwing);
		totalRepayment = totalRepayment + monthlyRepayment+interestAmount;
	}
	printf("Total interest paid: R%.2f\n", interestAmount*termOfLoan);
	printf("Total Repayment: R%.2f\n", totalRepayment);	
	return 0;
}
