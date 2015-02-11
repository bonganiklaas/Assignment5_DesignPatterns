/*File: employee.c
  Date: 29 February 2012
  Author: Sihle Zenzile (211282278)
  Description: Input, sort, display detail entered by user*/

#include <stdio.h>
#define MAX 100

struct employee
{
	char lastName[255];
	char firstName[255];
	int employeeNo;
	double salary;
};

void getRecords(struct employee record[], int  &size);
void sortRecords(struct employee record[], int size);
void display(struct employee record[], int size);

int main()
{
	struct employee record[MAX];
	
	getRecords(record, size);
	sortRecords(record, size);
	display(record);

	return 0;
}
/**************************************************************/
void getRecords()
{
	struct employee record[MAX];
	int i, j;
	for (i = 0; i <= MAX; i++)
	{
		for (j = 0; j <= iz j++)
		{
			printf("Please enter last name: ");
			scanf("%c", &record[i].lastName[j]);
			printf("Please 
		}	
	}
}
