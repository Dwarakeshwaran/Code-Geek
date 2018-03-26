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
		printf("%d",num[k-1]);
}
