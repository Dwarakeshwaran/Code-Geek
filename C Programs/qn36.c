
#include <stdio.h>
#define MAX 100 

int main()
{
    char str[MAX];
    int i, Characters;
    printf("Enter any string: ");
    gets(str);
    i = 0;
    Characters = 0;
    while(str[i] != '\0')
    {
        if(str[i]>=32&&str[i]<=47||str[i]==64&&str[i]>=123&&str[i]<=126)
        {
            Characters++;
        }
        i++;
    }
    printf("Total number of Special Characters = %d", Characters);
    return 0;
}
