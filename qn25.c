#include<stdio.h>
void main()
{
	int size,i,j,n[size],val,median;
	scanf("%d",&size);
	
	median=size/2;
	for(i=0;i<size;i++)
	{
		scanf("%d",&n[i]);
	}
	for(i=0;i<size;i++)
	{
		for(j=i+1;j<size;j++)
		{
			if(n[i]>n[j])
			{
				val=n[j];
				n[j]=n[i];
				n[i]=val;
			}
		}
		printf("%d\n",n[i]);
		
	}	
	printf("%d",n[median]);
}
	
