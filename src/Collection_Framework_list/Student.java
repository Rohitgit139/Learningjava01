package Collection_Framework_list;

public class Student {
private String roll_no;
private String name;

    public Student(String roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no='" + roll_no + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
