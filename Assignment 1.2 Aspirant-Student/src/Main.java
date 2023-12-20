public class Main {
    public static void main(String[] args) {
        Postgraduate legenda = new Postgraduate("Bekosya", "Mentor", "SE-2217", 5.0);
        Student pervash = new Student("Michael", "Jackson", "SE-2333", 4.9);

        Student refers = legenda;
        System.out.println(refers.averagemark);

        Student[] students = new Student[2];
        students[0] = legenda;
        students[1] = pervash;
        for (Student student : students) {
            System.out.println("Student " + student.firstname + " scholarship is " + student.getScholarship() + "$");
        }
    }
}