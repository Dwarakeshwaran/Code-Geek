#include<stdio.h>
void main()
{
	int size, num[size], i,sum=0,k,temp;
	
	scanf("%d",&size);
	
	scanf("%d",&k);
	for(i=1;i<=size;i++)
	{
		scanf("%d",&num[i]);
		
	}


	for(i=1;i<=size;i++)
	{
		if(i==k)
		{
			i=k;
			temp=num[i];
			
		}
				
	}
	
	printf("%d",temp);
}
