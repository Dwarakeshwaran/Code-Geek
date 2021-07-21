#include <stdio.h>
int main()
{
    char a[100];
    int i=0,n=0;
    printf("Enter the string: ");
   	gets(a);
    
    while(a[i]!='\0')
    {
		if(a[i]==49||a[i]==48)
		{
			n++;	
		}	
		
		i++;
    }
    
	if(n<1)
	printf("yes");
	else
	printf("no");
    return 0;
}
