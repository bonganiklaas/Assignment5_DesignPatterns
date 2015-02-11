/* File: power.c
   This program shows how to use the pow function */

#include <stdio.h>
#include <math.h>

int main()
{
	int x, y, ans;

	printf("Please enter x: ");
	scanf("%d", &x);
	printf("Please enter y: ");
	scanf("%d", &y);
	ans = pow(x, y);
	printf("pow(x, y) = pow(%d, %d) = %d\n", x, y, ans);
}


/* To compile and link the math library do the following:
gcc -c power.c
gcc power.c -lm -o power
./power */
