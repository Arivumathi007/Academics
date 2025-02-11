import java.util.Scanner;  

class Intro {  
    public static void main(String[] args) { 
        int r;  
        Scanner tt = new Scanner(System.in);  

        System.out.print("Enter a number: ");   
        r = tt.nextInt();  

        if (r % 2 == 0) {  
            System.out.print("EVEN " + r);  
        } else {  
            System.out.print("ODD " + r);  
        }  

        tt.close();  
    }  
}