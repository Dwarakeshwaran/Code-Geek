#include<stdio.h>
void main()
{
	int size, num[size], i,sum=0;
	
	scanf("%d",&size);
	
	for(i=0;i<size;i++)
	{
		scanf("%d",&num[i]);
		sum=sum+num[i];
	}
	printf("%d",sum);
	
}