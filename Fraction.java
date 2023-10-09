class Method{
        int nume;
        int deno;

    public Method(int nume, int deno){
        this.nume=nume;
        this.deno=deno;
    }
    }
public class Fraction{

    
    public static void main(String[] args){
        Method a = new Method(55,22);
        System.out.println(a.nume+"/"+a.deno);
        int x=0;
        for(int i=1;i<=a.nume && i<=a.deno ;i=i+1){

            if(a.nume%i==0 && a.deno%i==0){
            x=i;
            }
        
        }
        int numerator = a.nume/x;
        int denominator = a.deno/x;

        System.out.println(numerator+"/"+denominator);

        // Method b = new Method(6,4);
        // System.out.println(b.nume+"/"+b.deno);
    }
    
}
