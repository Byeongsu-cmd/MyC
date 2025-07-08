#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num1, int num2) {
    if((num1>=-50000&&num1<=50000)&&(num2>=-50000&&num2<=50000)){
        int answer = num1-num2;
        return answer;
    }
     else{
        return 0;
    }
               
}
//조건이 있는 두 수의 차를 구하는 작업