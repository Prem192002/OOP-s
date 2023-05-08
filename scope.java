class alg{
    int a = 10;
    int b= 50;  //class level scope can be accessed by any method within the class

    int add(){

        int p = 10;
        int q = 20;  //block level scope can be accessed only within the class
        int res = p+q;
        return res;
    }

    int sub(){
        int res = a+b;
        return res;
    }
}



public class scope {
    public static void main(String [] args){

        alg obj1 = new alg();

        int result1 = obj1.add();
        int result2= obj1.sub();
        System.out.println(result2);
        
    }
    
}
