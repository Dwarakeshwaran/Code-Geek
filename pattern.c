
#include <stdio.h>

void printStar(int number);

int main()
{
    int line,star;
    int limit;
    int star_count;
    int space;
    
    scanf("%d",&limit);
    
    star_count = limit;
    
    for(line=1 ; line<=limit ; line++,printf("\n"))
    {
        for(star=1 ; star<=star_count ; star++)
        {
            if(star == star_count)
            {
                printStar(line);
                star_count--;
            }
            else
            printf(" ");
        }
    }
    
    star_count = limit;
    
    for(line=1 ; line<=limit ; line++,printf("\n"))
    {
        for(space=2 ; space<=line ; space++)
        printf(" ");
        
        printStar(star_count);
        star_count--;
    }

    return 0;
}

void printStar(int number)
{
    int i;
    
    for(i=0 ; i<number ; i++)
    printf("* ");
}
