#include<stdio.h>
void main()
{
	int num,rem;
	
	scanf("%d",&num);
	
	while(num!=0)
	{
		rem=num%10;
		num=num/10;
		printf("%d",rem);
	}
	
}
