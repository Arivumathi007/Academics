#include <iostream>
using namespace std;
class Book{
    private:
    string authorname;
    string bookname;
    string edition;
    string isbnno;
    float price;
    string genre;
    bool ValidateIsbnno(string _isbnno){
        long int isbn_sum=0;
        int j=10;
        for(int i=0;i<11;i++){
            int num=(int) _isbnno[i];              
            isbn_sum+=num*j;
            j--;
        }
        if((isbn_sum%11)==0)
        {
            cout << "Valid";
            return true;
        }
        else
        {
            return false;
        }
    }
    public:
    void displayDetails();

    Book(string _authorname, string _bookname, string _edition, string _isbnno, float _price, string _genre){
        if(ValidateIsbnno(_isbnno)){
        authorname=_authorname;
        bookname=_bookname;
        edition=_edition;
        isbnno=_isbnno;
        price=_price;
        genre= _genre;
        
        }
    }
    void displaydetails(){
        cout<<"authorname:"<<authorname<<"\n";
        cout<<"bookname:"<<bookname<<"\n";
        cout<<"edition:"<<edition<<"\n";
        cout<<"isbnno:"<<isbnno<<"\n";
        cout<<"price:"<<price<<"\n";
        cout<<"genre:"<<genre<<"\n";
}
};

int main() {
    
    string _authorname,_bookname,_edition,_genre,_isbnno;
    float _price;
    
        cout<<"Enter author name";
        cin>>_authorname;
        cout<<"Enter book name";
        cin>>_bookname;
        cout<<"Enter Edition";
        cin>>_edition;
        cout<<"Enter ISB Number.";
        cin>>_isbnno;
        cout<<"Enter Price";
        cin>>_price;
        cout<<"Enter Genre";
        cin>>_genre;
        Book s(_authorname,_bookname,_edition,_isbnno,_price,_genre);
        
        s.displaydetails();
        
        return 0;
}