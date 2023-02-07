#include<stdio.h>
#include<string.h>
int main(){
	const int fnameSize = 100, maxLineSize = 1000;
	char finName[fnameSize], foutName[] = "\0", line[maxLineSize];		//input and output file and other strings
	int onOff = 0, i = 0, choose;
	
	printf("enter an input file name present in nearby source file : ");
	scanf("%s",&finName);		// file name input
	printf("please enter:\n\t1 to remove single line command:\n\t2 to remove multi line command:\n\t\t:->:->  ");
	scanf("%d",&choose);
	
	strcat(foutName, finName);
	strcat(foutName, "___temp.txt");		// if input file name is abc then output file will be abc___temp
	strcat(finName, ".txt");		// add file type
	FILE *inPtr = fopen(finName,"r"), *outPtr = fopen(foutName,"w");		// opening and creating files
	
	if(choose == 2){		// selectting single or multi line command
		
		while(fgets(line, maxLineSize+1, inPtr)){		// multi line command removing process
			for(i = 0; line[i] != '\0'; i++){
				if(onOff == 0){
					if(line[i] == '/' && line[i+1] == '*'){
//						printf("\n");
						fputc('\n', outPtr);
						onOff++;
						break;
					}else{
						fputc(line[i], outPtr);
//						printf("%c",line[i]);
					}
				}
				else{
					if(line[i] == '*' && line[i+1] == '/'){
						onOff--;
						i++;
						continue;
					}
				}
			}
		}
	}
	
	else{		// single line command removing process
		while(fgets(line, maxLineSize+1, inPtr)){
			for(i = 0; line[i] != '\0'; i++){
				if(line[i] == '/' && line[i+1] == '/'){
					fputc('\n', outPtr);
//					printf("\n");
					break;
				}else{
					fputc(line[i], outPtr);
//					printf("%c",line[i]);
				}
			}
		}
	}
	fclose(inPtr);
	fclose(outPtr);
	printf("process done.");
	
	return 0;
}
