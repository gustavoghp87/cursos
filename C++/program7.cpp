#include<iostream>
#include<conio.h>
using namespace std;

struct User {
    char name[30] = "";
    int age = 0;
};

User askForData(User);
void showData(User);

int main() {
    User user1 = askForData(user1);
    showData(user1);
    User user2 = askForData(user2);
    showData(user2);
    getch();
    return 0;
}

User askForData(User user) {
    fflush(stdin);
    cout<<"Name: "; cin.getline(user.name, 30, '\n');
    cout<<"Age: "; cin>>user.age;
    return user;
}

void showData(User user) {
    cout<<"\nName: "<<user.name<<endl;
    cout<<"Age: "<<user.age<<"\n\n"<<endl;
}
