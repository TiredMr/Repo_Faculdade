#include <stdio.h>
#include <stdlib.h>

int main(){

    int p1, p2, c1, c2;

    scanf("%d", &p1);
    scanf("%d", &c1);
    scanf("%d", &p2);
    scanf("%d", &c2);

    if (p1 == c1 || p2 == c2)
    {
        printf("1");
    }else{
        printf("0");
    }
    
    return 0;

}