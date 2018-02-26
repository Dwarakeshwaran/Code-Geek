
#include <stdio.h>
#define MAX 100 

int main()
{
    char str[MAX];
    int i, space;
    printf("Enter any string: ");
    gets(str);
    i = 0;
    space = 0;
    while(str[i] != '\0')
    {
        if(str[i]==' ')
        {
            space++;
        }
        i++;
    }
    printf("Total number of space = %d", space);
    return 0;
}
