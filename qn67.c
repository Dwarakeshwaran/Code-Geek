#include<stdio.h>
void main()
{
	int n,i;
	scanf("%d",&n);
	while(n%10!=0)
	{
		n++;
	}
	printf("%d",n);
}
