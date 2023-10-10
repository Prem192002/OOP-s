import java.util.Scanner;

class algebra {

    public int Frac(int a, int b){
        int x=0;
        for(int i=1;i<=a && i<=b ;i=i+1){

            if(a%i==0 && b%i==0){
            x=i;
            }
        
        }
        return x;
    }
}

public class methods{
    public static void main(String[] args){
        algebra obj1 = new algebra();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = sc.nextInt();

        System.out.println("Enter the second number");
        int b = sc.nextInt();


        int res= obj1.Frac(a,b);
        System.out.println("the HCF of the number is :" + res);
    }
}




