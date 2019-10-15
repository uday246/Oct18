#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main()
{
// initalization
char *str1, str[20];
str1 = (char *)malloc(sizeof(char));
fgets(str, 20, stdin);
int n = (int)strlen(str);
for (int i = 0; i < n; ++i)
{
    for(int j=0;j<i;j++){
        printf("%c",str[j]);
    }
    for(int j=i;j<n-1;j++){
        printf("*");
    }
    printf("\n");
    
}

return 0;
}