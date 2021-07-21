#include<stdio.h>
void main()
{
	int i, num[10],max;
	for(i=0;i<10;i++)
	{
	    scanf("%d",&num[i]);
	}
    max=num[0];
    for(i=0;i<10;i++)
	{
	    if(num[i]>max)
	    max=num[i];
	}
	
	printf("%d",max);
}
