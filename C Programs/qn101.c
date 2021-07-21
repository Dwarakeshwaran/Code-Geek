#include<stdio.h>
#include<string.h>
void main()
{
	char str[100],len;
	int num,i;
	
	gets(str);
	scanf("%d",&num);
	
	len=strlen(str);
	
	for(i=num;i<len;i++)
	{
		printf("%c",str[i]);
	}
}
