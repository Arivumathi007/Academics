#include <iostream>
using namespace std;
class weather{
    private:
        string sname;
        string sid;
        float temp;
        float hum;
        float pres;
        int validate(float temp, float hum, float pres){
            int sum=0;
                if (temp<=50&&temp>=-10){sum=sum+1;}
                if (hum<=100&&hum>=10){sum=sum+1;}
                if (pres<=1070&&pres>=870){sum=sum+1;}
                return sum;
            }
    public:
        weather(string sna,string si,float te,float hu,float pr){
            sname=sna;
            sid=si;
            temp=te;
            hum=hu;
            pres=pr;
        }
        void disp(){
            if (validate(temp,hum,pres)==3){
                cout<<sname<<"\n";
                cout<<sid<<"\n";
                cout<<temp<<"\n";
                cout<<hum<<"\n";
                cout<<pres;
        }
            else {cout<<"invalid values";}
        }
};

int main(){
    weather s("chennai","101",30,30,900);
    s.disp();
}