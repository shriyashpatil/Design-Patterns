

/*
 *  Builder Deisgn Pattern - Creational Design Pattern
 *  
 *  Use cases : 
 *  
 *  1. When there are lots of attributes in the class. And we ends up with multiple overloading of constructors. Where method signature can cause ambiguity
 *
 *  2. When we require validation of attributes, Validate the values before creation of object
 *  
 */



public class Student {

    private String name;
    private Integer age;
    

    private String universityName;
   

    private Double cgpa;
   

    private String phonenumber;
    

    private String address;


    

    private Student(StudentBuilder studentBuilder ){

        // we can validate here and throw exceptions, before setting the values in the object.
        this.name = studentBuilder.getName();
        this.age = studentBuilder.getAge();
        this.universityName = studentBuilder.getUniversityName();
        this.phonenumber = studentBuilder.getPhonenumber();
        
    }

    public String getName(){
        return this.name;
    }

    public Integer getAge() {
        return age;
    }

    public String getUniversityName() {
        return universityName;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getAddress() {
        return address;
    }

    static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    static class StudentBuilder{
    
        String name;
        Integer age;
        String universityName;
        String phonenumber;
    
        public String getName(){return this.name;}
        
        public Integer getAge(){return this.age;}
    
        public String getUniversityName(){return this.universityName;}
    
        public String getPhonenumber(){return this.phonenumber;}
        
    
        public StudentBuilder setName(String name){
            this.name = name;
            return this;
        }
    
        public StudentBuilder setAge(Integer age){
            this.age = age;
            return this;
        }
    
        public StudentBuilder setUniverstyName(String name){
            this.universityName = name;
            return this;
        }
    
        public StudentBuilder setPhonenumber(String phonenumber){
            this.phonenumber = phonenumber;
            return this;
        }
    
        public Student build(){
            /// we can create validation here
            return new Student(this);
        }
    }
    
}





class Main{

    public static void main(String agrs[]){

        Student student = Student.getBuilder()
                                .setName("Shriyash")
                                .setAge(25)
                                .setPhonenumber("9921502351")
                                .build();
        System.out.println("Name : "+student.getName());

    }

}