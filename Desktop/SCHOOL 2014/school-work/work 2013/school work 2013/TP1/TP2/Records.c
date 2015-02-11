/*File: Records.c
  This program ask the user to input 10 user records, sorts the records and then display
  the records in tabular format 
  Date created: 2-03-2012  */
#include <stdio.h>

#define MAX 100;

struct employee()
{
	char lastName[255];
	char firstName[255];
	int employeeNo;
	double salary;	

};

void getEmployees(struct employee e[], int &size)

{ 
	int i;
	for (i = 1; i <= 10; i++)
	{
	    printf("Please enter the following information:\n");
	    printf("Last name: ");
	    scanf("%s", e[i]. lastName);
	    printf("First name: ");
	    scanf("%", e[i].firstName);
	    printf(
	} 
	printf("Please enter employee",  );
	scanf("%s"
}

void sort(employee e[], int size)
{

}

void display(employee e[], int size)
{

}


void main()
{
	struct employee e[MAX];
	int size = 0;
	
	/* get input */
	getEmployee(e, size);

    	/* sort */
	sort{e, size);

	/* display in tabular format */
	display (e, size);
}

