#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
#include<stdlib.h>

int main(){
    pid_t ret_val;
    int arr[100],temp,num;
    ret_val=fork();
    if(ret_val<0){
        printf("fork failed\n");
    }

    else if(ret_val>0){//parentttttttttttttttttttttt
        wait();
        printf("this is parent process\n");
        printf("Enter the number: ");
        scanf("%d",&num);
        if(num%2==0){
            printf("The number is Even\n");  
        }
        else{
            printf("The number is odd\n");
        }
        sleep(70);
    }

    else if(ret_val==0){//child processssssssssss
        printf("This is child process\n");
        printf("Process id: %d\nParent Process Id: %d\n",getpid(),getppid());
        //inputttttttttttttttt
        for(int i=1;i<=10;i++){
            scanf("%d",&num);
            arr[i]=num;
        }

        //sortttttttttttttttttt
        for(int i=1;i<=9;i++){
            for(int j=i+1;j<=10;j++){
                if(arr[j]<arr[i]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        //output
        printf("The sorted:\n");
        for(int i=1;i<=10;i++){
            printf("%d\n",arr[i]);
        }
        

    }

    
}