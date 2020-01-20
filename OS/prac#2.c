#include<stdio.h>
#include<fcntl.h>
#include<stdlib.h>
#include<sys/stat.h>
#include<sys/types.h>
#include<unistd.h>
#include<sys/dir.h>
#include <dirent.h>

int main(){

	char buff[100];
	char *buffer;
	int one,two;
	DIR *t;
	buffer=getcwd(buff,sizeof(buff));
	struct dirent **files;
	struct stat p,s1,s2;
	printf(" The Current Working Directory is: %s\n",buffer);
	
	t=opendir(buff);
	if(t==NULL){
		printf("The directory isn't present\n");
		//printf("%d",errno);
	}
	
	else{
		printf("The directory is opened.\n");
		one=scandir(buff,&files,NULL,alphasort);
		two=one;
		while(one--){
			printf("File Name's: %s\n",files[one]->d_name);
			stat(files[one]->d_name,&p);
			printf("d.st_size:%ld\n",p.st_size);
			printf("d.st_mode:%d\n",p.st_mode);
			printf("d.st_nlink:%ld\n",p.st_nlink);
			printf("d.st_gid:%d\n\n",p.st_gid);
		}
		
		//For Duplicate files
		printf("Checking duplicate files\n");
		
		for(int i=1;i<two;i++){
			stat(files[i]->d_name,&s1);
			for(int j=i+1;j<two;j++)
			{
				stat(files[j]->d_name,&s2);
				if (s1.st_size==s2.st_size){
					if(s1.st_nlink==s2.st_gid){
						if(s1.st_gid==s2.st_mode){
							printf("duplicate file %s found\n",files[j]->d_name);
							unlink(files[j]->d_name);
							printf("files have been deleted\n");
						}
					}
				}
			}
		}
	}
		
			
	
	return 0;
}
	
	