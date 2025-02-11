#include <iostream>
using namespace std;

class Book{
    private:
    int bookID;
    string title;
    string author;
    float price;
    
    public:
    Book(){
        bookID=0;
        title="NULL";
        author="NULL";
        price=0;
        
    }
    Book(int _bookID,string _title,string _author,float _price){
        bookID=_bookID;
        title=_title;
        author=_author;
        price=_price;
    }
    ~Book(){
        cout<<"\nDestructor is called ";
    }
    float calculatePrice(){
        return price;
    }
    float calculatePrice(float discount){
        price-=(price*discount)/100;
        return price;
    }
    void DisplayDetails(){
        cout<<"Book ID :"<<bookID;
        cout<<"\n";
        cout<<"Book Name :"<<title;
        cout<<"\n";
        cout<<"Author of the Book :"<<author;
        cout<<"\n";
        cout<<"Price of the Book :"<<price;
        cout<<"\n";
    }
    void updateDetails(float _price){
        price=_price;
    }
    void updateDetails(string _author){
        author=_author;
    }
    
};
int main() {
    int _bookID;
    string _title;
    string _author;
    float _price;
    float discount;
    float priceafterdiscount;
    string updateauthor;
    float updateprice;

    cout<<"Enter Book ID :";
    cin>>_bookID;
    cout<<"Enter Book Title :";
    cin>>_title;
    cout<<"Enter Book Author :";
    cin>>_author;
    cout<<"Enter Book Price :";
    cin>>_price;

    Book b0;
    cout<<"\n";
    cout<<"Book object using default constructor :\n";
    b0.DisplayDetails();

    Book b1(_bookID,_title,_author,_price);
    cout<<"\n";
    cout<<"Book Object using Parametrised constructor :\n";
    b1.DisplayDetails();

    cout<<"Enter Author Name to be updated :";
    cin>>updateauthor;
    cout<<"Enter Price to be updated :";
    cin>>updateprice;
    cout<<"Enter the Discount :";
    cin>>discount;

    Book b3(_bookID,_title,_author,_price);
    b3.updateDetails(updateauthor);
    b3.updateDetails(updateprice);
    b3.calculatePrice(discount);
    b3.DisplayDetails();

    return 0;
}