
public class Student implements Prototype<Student>{

    private String name;
    private int age;
    private String batch;
    private double avgPsp;

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
   
    public String getBatch() {
        return batch;
    }
    public void setBatch(String batch) {
        this.batch = batch;
    }
   
    public double getAvgPsp() {
        return avgPsp;
    }
    public void setAvgPsp(double avgPsp) {
        this.avgPsp = avgPsp;
    }

    public Student(Student s){
        this.name= s.name;
        this.age = s.age;
        this.batch = s.batch;
        this.avgPsp = s.avgPsp;
    }

    public Student(){}

    @Override
    public Student clone(){ 
        return new Student(this);
    }

    

}