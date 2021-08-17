#include <iostream>
#include <conio.h>
#include <string>
#include <cstring>
using namespace std;

struct user {
    char username[30];
    int age;
}
user1 = {"ghp", 30},
user2 = {"other"},
user3;

struct appAdmin {
    char username[30];
    int age;
};

struct app
{
    char name[10];
    char domain[20] = "";
    struct appAdmin appAdmin;
} apps[2];

struct myStructure
{
    char message[4096];
};

int main() {
    cout << user1.username << endl;
    user2.age = 70;
    cout << "User3 name: "; cin.getline(user3.username, 30, '\n');
    cout << "User3 age: "; cin >> user3.age;
    cout << "User3: " << user3.username << ", age: " << user3.age << endl;
    fflush(stdin);

    cout << "App name: " << endl;
    cin.getline(apps[0].name, 20, '\n');

    string domain = "www.abc.com/1234567";
    string usern = "ghpAdmin";
    myStructure mStr;
    strcpy(apps[0].domain, domain.c_str());
    strcpy(apps[0].appAdmin.username, usern.c_str());

    apps[0].appAdmin.age = 34;

    cout << "Data: " << apps[0].name << " app, " << apps[0].domain << " , manages by " << apps[0].appAdmin.username << " (" << apps[0].appAdmin.age << ")" << endl;
    getch();
    return 0;
}
