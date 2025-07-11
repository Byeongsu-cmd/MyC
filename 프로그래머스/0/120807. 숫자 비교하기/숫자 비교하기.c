#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num1, int num2) {
    if (num1>=0&&num1<=10000&&num2>=0&&num2<=10000&&num1==num2){
            return 1;} 
        else {
            return -1;
        }
    }