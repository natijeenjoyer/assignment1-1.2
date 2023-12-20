public class Postgraduate extends Student {
    public Postgraduate(String firstname, String lastname, String group, double averagemark) {
        super(firstname, lastname, group, averagemark);
    }

    @Override
    public int getScholarship() {
        if(averagemark == 5.0) {
            return 200;
        }
        else {
            return 180;
        }
    }
}
