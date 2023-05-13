import java.util.Scanner;

class algebra {

    int sun(int a, int b){
        int ans = a+b;
        return ans;
    }
    
    
}

public class methods{
    public static void main(String[] args){
        algebra obj1 = new algebra();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1=sc.nextInt();

        System.out.println("Enter the second number");
        int num2=sc.nextInt();


        int alg = obj1.sun(num1,num2);
        System.out.println(alg);
    }
}




