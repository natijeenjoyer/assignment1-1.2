package Professions;
public class Driver {

        public String fullname;
        public int age, experience;

        public void jlomana (String fullname, int age, int experience){
            this.fullname = fullname;
            this.age = age;
            this.experience = experience;
        }

        public Driver(String fullname, int age, int experience){
            jlomana(fullname, age, experience);
            System.out.println(fullname + ", " + age  + ", " + experience);
        }

        public Driver(){

        }

}
