#include<stdio.h>
int main()
{
	int burger,fry,pizza,sandwich,item,quantity,price=0,ch=1;
//	while(ch==1)
//	{
	printf("B = Burger\nF = French Fries\nP = Pizza\nS = Sandwiches");
	printf("\n\nPlease Order Your Food Items: ");
	scanf("%c",&item);
	if(item=='B')
	{
	printf("\n\nPlease enter the Quantity: ");
	scanf("%d",&quantity);
	burger=quantity*200;
	printf("The cost'll be %d",burger);
	}
	
	

//	}
return 0;
}
