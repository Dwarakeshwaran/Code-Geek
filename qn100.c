#include<stdio.h>
void main()
{
	int num,rem,product=1;
	
	scanf("%d",&num);
	
	while(num!=0)
	{
		rem=num%10;
		num=num/10;
		product=product*rem;
	}
	
	printf("%d",product);
}
