#include<stdio.h>

void main()
{
    char str[100];
    int k,i;
    gets(str);
    scanf("%d",&k);
    
    for(i=0;i<k;i++)
    {
        printf("%s\n",str);
    }
}
