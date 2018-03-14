#include <stdio.h>

int main(void) 
{
	float length,breadth,area;
	printf("enter the length and breadth values of the farm:");
	scanf("%f %f",&length,&breadth);
	area=length*breadth;
	printf("\n%0.5f",area);
	return 0;
}
