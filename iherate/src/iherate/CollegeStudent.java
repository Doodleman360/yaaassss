package iherate;

public class CollegeStudent extends Student{

    private String major;
    private int year;

    // constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, String major, int year){
      super(name, age, gender, idNum, gpa);

      this.major = major;
      this.year = year;
    }

    public String getmajor(){
      return major;
    }

    public int getyear(){
      return year;
    }

    public void setmajor(String major){
      this.major = major;
    }

    public void setyear(int year){
      this.year = year;
    }

    // overrides the toString method in the parent class
    public String toString(){
      return super.toString() + ", Major: " + major + ", Year: " + year;
    }
}
