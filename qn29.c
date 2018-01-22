#include<stdio.h>
int main()
{
int hours,minutes;//Variable Declaration

printf("Input minutes: ");
scanf("%d",&minutes);
hours=minutes/60;//Formula for hours to minutes conversion
minutes=minutes%60;//Modulus(%) is getting the remaining minutes excluding the hours
printf("%d Hour(s), %d Minute(s).",hours,minutes);

return 0;
}
