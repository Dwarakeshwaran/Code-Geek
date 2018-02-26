
#include <stdio.h>
#define MAX 100 

int main()
{
    char str[MAX];
    int i, number;
    printf("Enter any string: ");
    gets(str);
    i = 0;
    number = 0;
    while(str[i] != '\0')
    {
        if(str[i]>='0'&&str[i]<='9')
        {
            number++;
        }
        i++;
    }
    printf("Total number of Numeric Characters = %d", number);
    return 0;
}
