#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num1, int num2) {
    if((num1>=0&&num1<=100)&&(num2>=0&&num2<=100)){
        int answer = num1/num2;
        return answer;
        } else {
        printf ("잘못된 값을 입력했습니다.");
        }
}