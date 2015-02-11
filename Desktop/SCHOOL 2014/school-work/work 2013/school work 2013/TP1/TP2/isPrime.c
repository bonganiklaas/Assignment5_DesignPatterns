/* File: isPrime.c
   This program determines if a number is prime or not in C
   A prime number is any number that is only divsible by 1 and itself.
   Author: Enzo de Jongh
   Date created: 06 March 2012 */

#include<stdio.h>
#define true 1
#define false 0

bool isPrime(int num)
{
	int i;
	bool flag = true;

	for(i = 2; i <= (num / 2); i++)
	{
		if (num % i == 0)
		{
			flag = false;
			break;
		}
	}
	return flag;
}

int main()
{
	int num;

	printf("please enter a number: ");
	scanf("%d", &num);
	if (isPrime(num))
		printf("%d is a prime number\n",num);
	else
		printf("%d is NOT a prime number\n",num); 	
	return 0;
}
