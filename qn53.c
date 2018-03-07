#include<stdio.h>
void main()
{
	int sum=0,num,rem,res,i;
	scanf("%d",&num);
	while(num!=0)
	{
		rem=num%10;
		num=num/10;
		sum=sum+rem;
	}
	printf("%d",sum);
}
