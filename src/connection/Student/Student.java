package connection.Student;

public class Student {
    private int rollNumber;
    private String name;
    private int age;
    private double cpi;
    public Student(int rollNumber,String name,double cpi,int age){
        this.age =age;
        this.cpi =cpi;
        this.name=name;
        this.rollNumber= rollNumber;
    }

    public String toString(){
        return String.format("%d\t%s\t%f\t%d",getRollNumber(),getName(),getCpi(),getAge());
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getCpi() {
        return cpi;
    }

    public void setCpi(double cpi) {
        this.cpi = cpi;
    }
}
