#include <iostream>
#include <vector>
#include <string>
#include <conio.h>
#include <math.h>
#include <time.h>     // aleatory numbers:   srand(time(NULL))   initialize    then   number = rand()%100;

using namespace std;

int main()
{
    float number1, number2;
    int numbers1[10];
    int numbers2[] = { 1, 3, 4, 7, 11 };
    int numbersMatrix1[2][3] = { 1, 2, 3, 4, 5, 6 };    // up: 1 2 3   down: 4 5 6
    int numbersMatrix2[2][3] = { {1, 2, 3}, {4, 5, 6} };    // up: 1 2 3   down: 4 5 6
    char word1[] = "word";
    char word2[] = { 'w', 'o', 'r', 'd' };     // it's the same, there're not strings
    // cin doesn't accept spaces; use   cin.getline(name, 20, '\n')
    // ... or   gets(name)   (this doesn't recognize the character limit assigned to the variable)
    cout << "... " << numbers2[1] << endl;
    numbers2[1] = 13;
    cout << "... " << numbers2[1] << endl;
    cout.precision(3);
    cout<< "Enter a numer: ";
    cin>> number1;
    cout<< "The number is " << number1 << endl;
    cout<< "Enter another numer: "; cin>>number2;
    cout<< "Number2 three times is " << number2 * 3 << endl;
    cout<< "Number2 powered three times is " << pow(number2, 3) << endl;
    cout<< "The square root of Number2 is " << sqrt(number2) << endl;

    if (number2 != 0) {
        cout<< "The first number to the second one is: " << number1/number2;
    }

    cout<< "\n\n\tAny key to exit";
    getch();
    return 0;
}