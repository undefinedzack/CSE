#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
#include<stdlib.h>

int main(int argc, char *argv[]){
    int num;
    printf("PID of ex1.c= %d\n",getpid());
    char *args[]={"This","is","Ubuntu",NULL};
    //inputtttttttttttt
    for(int i=1;i<=10;i++){
        printf("enter num: ");
        scanf("%d",&num);
    }
    //prime number 
    
    for(int j=)
    execv("./ex2",args);
    printf("back to ex1.c\n");
    return 0;

}