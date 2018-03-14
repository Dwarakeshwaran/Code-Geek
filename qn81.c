#include <stdio.h>

int main() 
{
	int n1,n2,i;
	printf("Enter the two numbers:");
	for(i=1;i<=3;i++)
	{
	scanf("%d %d\n",&n1,&n2);
	if(n1>n2)
	{
		printf("\n%d\t",n1-n2);
	}
	else
	{
		printf("\n%d\t",n2-n1);
	}
	}
	return 0;
}
