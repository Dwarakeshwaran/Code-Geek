#include<stdio.h>
void main()
{
	int i,n[10],min;
	
	for(i=0;i<10;i++)
	{
		scanf("%d",&n[i]);
	}
	n[0]=min;
	for(i=0;i<10;i++)
	{
		if(n[i]<min)
		min=n[i];
				
	}
	printf("%d",min);
}
