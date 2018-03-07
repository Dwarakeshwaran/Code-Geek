#include<stdio.h>
int main()
{
	int opr,spr,profit;//Variable Declaration
	/*
	opr->Original Price
	spr->Selling Price
	*/
	printf("Enter the Original Price: ");
	scanf("%d",&opr);
	printf("Enter the Selling Price:");
	scanf("%d",&spr);
	if(opr<spr)//Condition in order to find the profit
	{
		profit=spr-opr;//Formula for finding the Profit
		printf("The profit obtained is %d",profit);
	}
	else
	{
		printf("Loss");
	}
}
