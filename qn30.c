#include<stdio.h>
void main()
{
int h1,h2,m1,m2,hour,minute,sub;
scanf("%d%d%d%d",&h1,&m1,&h2,&m2);
if(h1==h2&&m1==m2)
{
hour=h1-h2;
minute=m1-m2;
if(hour==0)
hour=12;
printf("hr:%d\nmin:%d\n",hour,minute);
}
else if(h1==h2&&m1<m2)
{
hour=12;
sub=m1-m2;
minute=60+sub;
hour=hour-1;
if(hour==0)
hour=12;
printf("hr:%d\nmin:%d\n",hour,minute);
}
else if(h1==h2&&m1>m2)
{
hour=h1-h2;
minute=m1-m2;
if(hour==0)
hour=12;
printf("hr:%d\nmin:%d\n",hour,minute);
}
else if(h1<h2&&m1==m2)
{
sub=h1-h2;
hour=12+sub;
minute=m1-m2;
if(hour==0)
hour=12;
printf("hr:%d\nmin:%d\n",hour,minute);
}
else if(h1<h2&&m1<m2)
{
sub=m1-m2;
minute=60+sub;
{
sub=h1-h2;
hour=12+sub;
hour=hour-1;
}
if(hour==0)
hour=12;
printf("hr:%d\nmin:%d\n",hour,minute);
}
else if(h1<h2&&m1>m2)
{
sub=h1-h2;
hour=12+sub;
minute=m1-m2;
if(hour==0)
hour=12;
printf("hr:%d\nmin:%d\n",hour,minute);
}
else if(h1>h2&&m1==m2)
{
hour=h1-h2;
minute=m1-m2;
if(hour==0)
hour=12;
printf("hr:%d\nmin:%d\n",hour,minute);
}
else if(h1>h2&&m1<m2)
{
hour=h1-h2;
sub=m1-m2;
minute=60+sub;
hour=hour-1;
if(hour==0)
hour=12;
printf("hr:%d\nmin:%d\n",hour,minute);
}
else if(h1>h2&&m1>m2)
{
hour=h1-h2;
minute=m1-m2;
if(hour==0)
hour=12;
printf("hr:%d\nmin:%d\n",hour,minute);
}

}
