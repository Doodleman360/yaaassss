package iherate;

public class Teacher extends Person {
    private String subject;
    private double salary;

    // constructor
    public Teacher(String name, int age, String gender,
              String subject, double salary){
      super(name, age, gender);

      this.subject = subject;
      this.salary = salary;
    }

    public String getSubject(){
      return subject;
    }

    public double getSalary(){
      return salary;
    }

    public void setSubject(String subject){
      this.subject = subject;
    }

    public void setSalary(double salary){
      this.salary = salary;
    }

    // overrides the toString method in the parent class
    public String toString(){
      return super.toString() + ", Teacher subject: " + subject + ", salary: " + salary;
    }

}
