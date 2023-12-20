public class Student {
    public String firstname, lastname, group;
    public double averagemark;
    public Student(String firstname, String lastname, String group, double averagemark) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.group = group;
        this.averagemark = averagemark;
    }

    public int getScholarship() {
        if(averagemark == 5.0) {
            return 100;
        }
        else {
            return 80;
        }
    }

}
