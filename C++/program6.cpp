#include<iostream>
#include<conio.h>
using namespace std;

// Pass by reference
// it's possible to override external variables through memory directions
// by this way, it is possible the multiple returning

void newValue(int&, int&);
void toSquare(int vector[], int TAM);

void newValue(int& num1, int& num2) {
    cout<<"First value is: "<<num1<<endl;
    cout<<"Second value is: "<<num2<<endl;
    num1 = 100;
    num2 = 200;
}

// when you pass an array, you need to pass its length as a different parameter

void toSquare(int vector[], int LEN) {
    for (int i = 0; i<LEN; i++) {
        vector[i] *= vector[i];
        cout<<vector[i]<<endl;
    }
}

int main() {
    int num1, num2;                   // these are internal variables
    cout<<"Insert two numbers: ";
    cin>>num1>>num2;
    newValue(num1, num2);
    cout<<"New first value is: "<<num1<<endl;
    cout<<"New second value is: "<<num2<<endl;

    const int LEN = 5;
    int vector[LEN] = { 1, 2, 3, 4, 5 };
    toSquare(vector, LEN);
    // now vector is { 1, 4, 9, 16, 25 }
    // the new array is not return from the function because C++ passes the array like a pointer and modifies the reference

    getch();
    return 0;
}
