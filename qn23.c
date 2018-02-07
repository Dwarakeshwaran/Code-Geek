#include<stdio.h>
void main()
{
	int size,array[size],i,min;
	printf("Enter the size of the array: ");
	scanf("%d",&size);
	printf("Enter the elements in the array: \n");
	
	for(i=0;i<size;i++)
	{
		scanf("%d",&array[i]);
	}
	min=array[0];
	for(i=0;i<size;i++)
	{
		if(array[i]<min)
		min=array[i];
	}
	
	printf("\n\n%d",min);
}
