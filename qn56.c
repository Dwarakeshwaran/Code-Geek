#include<stdio.h>
int main()
{
	int ch,press=0;
	while(press==0)
	
	{
	
	
	
		printf("\n1. Bill Details\n2. Talk Plan\n3. Deals and discount\n4. Internet Plan Details\n5. Voice, SMS & Roaming Packs\n6. Bill Pay/Recharge\n7. Best Offers\n8. What's new?");
		printf("\n\nEnter your Choice: ");
	
		scanf("%d",&ch);
		
		
	
		switch(ch)
		{
		case 1:
			printf("\nBill Details");
			break;
		case 2:
			printf("\nTalk Plan");
			break;
		case 3:
			printf("\nDeals and discount");
			break;
		case 4:
			printf("\nInternet Plan Details");
			break;
		case 5:
			printf("\nVoice, SMS & Roaming Packs");
			break;
		case 6:
			printf("\nBill Pay/Recharge");
			break;
		case 7:
			printf("\nBest Offers");
			break;
		case 8:
			printf("\nWhat's new?");
			break;
		default:
			printf("\nInvalid Option");
			break;
		}
	printf("\n\nPress 0 to Continue: ");
	scanf("%d",&press);
}
	
}
