#include <stdio.h>
#include<string.h>
int main(void) 
{
	char str[30];
	int num,i;
	printf("enter the string:");
	scanf("%s",str);
	n=strlen(str);
	if(num%2==0)
	{
		str[num/2]='*';
		str[(num/2)-1]='*';
	}
	else
	{
		str[num/2]='*';
	}
	printf("\n%s",str);
	return 0;
}
