#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

void WriteAtEnd(char FileName[], char Data[])
{
    int fd = 0;
    int iRet = 0;

    fd = open(FileName, O_RDWR | O_APPEND);

    if(fd == -1)
    {
        printf("Unable to open file\n");
        return;
    }

    iRet = write(fd, Data, strlen(Data));

    printf("%d bytes gets successfully written\n", iRet);

    close(fd);
}

int main()
{
    char Fname[30] = {'\0'};
    char Arr[100] = {'\0'};

    printf("Enter the file name : ");
    scanf("%s", Fname);

    printf("Enter the string : ");
    scanf(" %[^\n]", Arr);

    WriteAtEnd(Fname, Arr);

    return 0;
}