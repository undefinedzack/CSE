#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
#include<stdlib.h>

int main(){
    pid_t returnVal;
    
    //printf("This is fork pid=%d\n",getpid());
    returnVal=fork();

    if(returnVal<0){
        printf("fork failed.\n");
        exit(0);
    }
    else if(returnVal==0){
        printf("This is child process.\n");
        printf("This is fork pid=%d\n",getpid());
        sleep(10);
    }
    else{
        printf("This is parent process");
        printf("This is fork pid=%d\n",getpid());
        sleep(30);
    }
    return 0;
}