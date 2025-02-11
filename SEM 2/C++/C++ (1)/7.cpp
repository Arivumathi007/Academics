#include <iostream>
using namespace std;

class Bankaccount{
    private:
      int accountNumber;
      string acccountHoldername;
      float balance;

    public:

      Bankaccount(){ //default constructor
        accountNumber=0;
        acccountHoldername="Unknown";
        balance=0;
      }  
      
      Bankaccount(int x,string y,float z){ //parameterized constructor
        accountNumber=x;
        acccountHoldername=y;
        balance=z;
      }

      void deposit(float bal){ //deposit function
         int amount;
         cout<<"Enter amount to be deposited:"<<endl;
         cin>>amount;
         if(amount<0){
         cout<<"Amount cant be negative"<<endl;
         }
         else{
         bal=bal+amount;
         cout<<bal;
          }
      }

      void withdraw(float bal){ //withdraw function
        int amount;
        cout<<"Enter amount to be withdrawn:"<<endl;
         cin>>amount;
        if(amount<0){
         cout<<"Enter amount greater than 0"<<endl;
         }
        else if(balance<amount){
            cout<<"insufficient balance"<<endl;
        }
        else{
        bal=bal-amount;
        cout<<bal;
        }
      }    

      void calculateInterest(float balance){ //calculating the interest function
        int principleamount=balance;
        int interest;
        int SI;
        cout<<"Enter interest:"<<endl;
        cin>>interest;
        SI=principleamount*interest/100;
        cout<<SI;
      }

      void display(){ //display function
        cout<<"The accountNumber is: "<<accountNumber<<endl;
        cout<<"The account Holder name is: "<<acccountHoldername<<endl;
        cout<<"The balance is: "<<balance;
      }
      
};

int main(){ //main function
    int a;
    string b;
    float c;
    cout<<"Enter account number:"<<endl;
    cin>>a;
    cout<<"Enter account holder name:"<<endl;
    cin>>b;
    cout<<"Enter balance:"<<endl;
    cin>>c;
    Bankaccount b1(a,b,c);
    int choice;
    cout<<"Enter a choice(1-4):";
    cin>>choice;
    switch(choice){
        case 1:
           b1.deposit(c);
           break;
        case 2:
           b1.withdraw(c);
           break;
        case 3:
           b1.calculateInterest(c);
           break;
        case 4:
           b1.display();
           break;
        default:
           cout<<"Enter a proper number from 1-4";
           break;
    }
    
}