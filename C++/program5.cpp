#include<iostream>
#include<conio.h>
using namespace std;

// template is generics

template <class TYPED>
void showAbsolute(TYPED number);

template <class TYPED>
void showAbsolute(TYPED number) {
    TYPED absoluteValue = number;
    if(number<0) {
        absoluteValue = number * -1;
    }
    cout<<"Absolute value for "<<number<<" is "<<absoluteValue<<endl;
}

int main() {
    int number1 = 44;
    int number2 = -44;
    float number3 = 44.12;
    float number4 = -44.12;
    double number5 = 44.123456789;
    double number6 = -44.123456789;
    showAbsolute(number1);
    showAbsolute(number2);
    showAbsolute(number3);
    showAbsolute(number4);
    showAbsolute(number5);
    showAbsolute(number6);
    getch();
    return 0;
}