#include<stdio.h>

int main()
{
	int i,j,rows;

	printf("Please enter number of rows:");
	scanf("%d", &rows);
	for(i = 1;rows>=i;rows--)
	{
		for(j = 1 ;j<=rows;j++)
		{
			printf( "*" );
		}
		printf("\n");
	}
	return 0;
}

