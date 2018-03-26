#include<stdio.h>
void main()
{
	int n,k,num[n],i;
	scanf("%d",&n);
	scanf("%d",&k);
	
	for(i=0;i<n;i++)
	{
		scanf("%d",&num[i]);
	}
	for(i=0;i<n;i++)
	{
		if(num[i]==k)
		printf("yes");
		else
		printf("no");
	}
}
