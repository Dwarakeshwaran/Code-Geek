#include<stdio.h>
void main()
{
	int size,array[size],i,max;
	printf("Enter the size of the array: ");
	scanf("%d",&size);
	printf("Enter the elements in the array: \n");
	
	for(i=0;i<size;i++)
	{
		scanf("%d",&array[i]);
	}
	max=array[0];
	for(i=0;i<size;i++)
	{
		if(array[i]>max)
		max=array[i];
	}
	
	printf("%d",max);
}
