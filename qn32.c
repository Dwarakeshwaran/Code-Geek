
#include <stdio.h>
#define MAX 100 

int main()
{
    char str[MAX];
    int i, words;
    printf("Enter any string: ");
    gets(str);
    i = 0;
    words = 1;
    while(str[i] != '\0')
    {
        if(str[i]==' ' || str[i]=='\n' || str[i]=='\t')
        {
            words++;
        }
        i++;
    }
    printf("Total number of words = %d", words);
    return 0;
}
