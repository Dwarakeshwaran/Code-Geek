#include <stdio.h>
int sumOfDigits();
int main()
{
    int firstNumber,lastNumber;
    int loopNumber;
    int sod;
    int count = 0;
    
    scanf("%d",&firstNumber);
    scanf("%d",&lastNumber);
    
    for(loopNumber=firstNumber;loopNumber<=lastNumber;loopNumber++)
    {
        sod = sumOfDigits(loopNumber);
        if(sod == 8)
        count++;
    }
    
    printf("%d",count);

    return 0;
}

sumOfDigits(int number)
{
  
    int remainder,result=0;
    
    while(number)
    {
        remainder = number%10;
        number = number/10;
        result = result+remainder;
    }
    
    return result;
}
