#include<stdio.h>

void DisplaySchedule(char chDiv)
{
    if(chDiv == 'A')
    {
        printf("Your exam is at 7:00 AM\n");
    }
    else if(chDiv == 'B')
    {
        printf("Your exam is at 8:30 AM\n");
    }
    else if(chDiv == 'C')
    {
        printf("Your exam is at 9:20 AM\n");
    }
    else if(chDiv == 'D')
    {
        printf("Your exam is at 10:30 AM\n");
    }
    else
    {
        printf("Enter correct division.\n");
    }
}

int main()
{
    char cValue = '\0';

    printf("Enter your division: ");
    scanf("%c", &cValue);

    DisplaySchedule(cValue);

    return 0;
}