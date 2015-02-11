/*	File name: double number.c
	Program discription: Receives ONE integer parameter and returns the twice that value
	Author: Alexander Daniels(210148861)
	Date created: 28 Feb 2012 */

#include<stdio.h>

int doubleNumber(); 	// Function prototype

int main()
{
	int num, ans;

	doubleNumber();

	return 0;
}

int doubleNumber()
{	
	int num, ans;
	printf("Please enter in a number: ");
	scanf("%d", num);
	ans=num*2;

	printf("%d",num " * 2= "%d",ans);

	return ans;
}
