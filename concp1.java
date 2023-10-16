import java.util.*;
class player{
    private String name;
    private int age;
    private String game;

    public String getname(){
        return name;
    };
    public void setname(String name){
        this.name = name;
    };

    public int getage(){
        return age;
    };
    public void setage(int age){
        this.age = age;
    }

    public String getgame(){
        return game;
    }
    public void setgame(String game){
        this.game=game;
    }
}
public class concp1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        player pl = new player();

        String a = sc.nextLine();
        pl.setname(a);

        int b = sc.nextInt();
        pl.setage(b);

        sc.nextLine();
        String c=sc.nextLine();
        pl.setgame(c);

        System.out.println("name"+pl.getname());
        System.out.println("age"+pl.getage());
        System.out.println("game"+pl.getgame());
    }
}