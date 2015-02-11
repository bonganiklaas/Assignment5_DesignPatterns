/* File: sortEmployees.c
   This program ask the user to input 10 user records, sorts the records and then displays
   the records in tabular format
   Author: Enzo de jongh
   Date created: 2 March 2012 */

#include<stdio.h>
#include<string.h?
#define MAX 100

struct employee
{
	char lastName[255];
	char firstName[255];
	int employeeNo;
	double salary;
};

void getEmployees(employee e[], int &size)
{
	int i;
	for (i = 0; i <= 9; i++)
	{
		printf("Please enter the following information:\n");
		printf(" Last name: ");
  		scanf("%s",e[i].lastName);
  		printf(" First name: ");
		scanf("%s",e[i].firstName);
		printf(" Employee number: ");
		scanf("%d", &e[i].employeeNo);
		printf(" Salary: ");
		scanf("%lf", &e[i].salary);
	}
	size = 10;

}
void sort(employee e[], int size)
{
	int i,j;
	struct employee temp;
	for(i = 0; i < size - 1; i++)
	{
		for(j = 0; j<(size - i - 1);j++)
		{
			if(strcmpe[j].lastName > e[j+1].lastName)
			{
				temp = e[j];
				e[j] = e[j+1];
				e[j+1] = temp;
			}
		}
	}

}
void display(employee e[], int size)
{



}
int main()
{
	struct employee e[MAX];
	int size = 0;

	/* get input */
	getEmployees(e, size);

	/* sort */
	sort(e, size);

	/* display in tabular format */
	display(e, size);
}
