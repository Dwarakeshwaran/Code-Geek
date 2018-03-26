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
	
		if(num[k-1]%2!=0)
		printf("%d",num[k-1]);
		else
		printf("%d",num[k]);
	
}
