#include<stdio.h>
void timeConvertor(int);

int main()
{
	int speed, hour, minutes, distance;
	int original_time, calculated_time;
	
	float time;
	
	scanf("%d %d:%d %d", &speed, &hour, &minutes, &distance);
	
	time = (float)distance / (float)speed;
	time = time * 60;
	
	hour = hour * 60;
	
	original_time = hour + minutes;
	
	calculated_time = time + original_time;
	

	
	if(calculated_time <= 570)
	{
		timeConvertor(calculated_time);
	}
	else
	{
		speed = speed + 20;
		time = (float)distance / (float)speed;
		time = time * 60;
		calculated_time = time + original_time;
		
		if(calculated_time <= 570)
		{
			timeConvertor(calculated_time);
		}
		else
		{
			printf("NO");
		}
	}
	
	
	
	
}

void timeConvertor(int time)
{
	int hour, minutes;
	
	hour = time/60;
	minutes = time - (hour*60);
	
	printf("%d:%d", hour, minutes);
	
}
