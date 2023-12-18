public class Person {
    public String fullname;
    public int age;

    public void talk(String fullname, int age){
        this.fullname = fullname;
        this.age = age;
    }

    public void move(String fullname){
        System.out.println(this.fullname + " is ringing...");
    }

    public Person(String fullname, int age){
        talk(fullname, age);
        move(fullname);
    }

    public Person(){

    }
}
