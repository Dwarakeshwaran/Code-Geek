#include <stdio.h>
int main()
{
    char a[100];
    int i=0,n=1;
    printf("Enter the string: ");
   	gets(a);
    
    while(a[i]!='\0')
    {
		if(a[i]==' '||a[i]=='\n'||a[i]=='\t')
		{
		n++;
		}	
		
		i++;
    }
    
	printf("Word: %d",n);
    return 0;
}
