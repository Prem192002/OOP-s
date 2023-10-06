
public class studentClass {
    static class Student{
        String name;
        int std;
        int roll;

    }
    
    public static void main(String args[]){
        
       
        Student a = new Student();
        a.name = "rahul";
        a.std=12;
        a.roll=1;
        

        Student b = new Student();
        b.name = "rohan";
        b.std = 12;
        b.roll = 2;
        System.out.println(a.name+" "+a.std+" "+a.roll);
        System.out.println(b.name+" "+b.std+" "+b.roll);

        
        
    }
    
}
