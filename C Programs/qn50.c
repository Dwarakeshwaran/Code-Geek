#include<stdio.h>
#include<math.h>
void main()
{
    int num,i,res,power;
    
    scanf("%d",&num);
    
    for(i=1;i<=5;i++)
    {
        power=pow(2,i);
        printf("%d\n",power);
        if(num==power)
        {
        res=1;
        break;
        }
        else
        res=0;
    }
    
    if(res==1)
    printf("yes");
    else if(res==0)
    printf("no");
    
}
