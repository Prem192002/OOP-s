class student{
    int roll;
    String name;

}


public class  Main {

    

    public static void main(String [] args){

        student obj1 = new student();
        obj1.roll=1;
        obj1.name="Rahul";
        System.out.println(obj1.roll);
        System.out.println(obj1.name);

        student obj2=new student();
        obj2.roll=2;
        obj2.name="rohan";
        System.out.println(obj2.roll);
        System.out.println(obj2.name);
    }
    
}
