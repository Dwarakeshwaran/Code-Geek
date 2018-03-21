#include<stdio.h>
void main()
{
	int size, num[1000],i,j,num1[1000];
	
	scanf("%d",&size);
	
	for(i=1;i<=size;i++)
	{
		scanf("%d",&num[i]);
		continue;
	}
	for(i=1;i<=size;i++)
	{
		num1[i]=i;
		
		if(num[i]!=num1[i])
		printf("\n%d",num[i]);
	}
}
