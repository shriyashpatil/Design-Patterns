public class IntelligentStudent extends Student{
    public int iq;

    public IntelligentStudent(){

    }

    public IntelligentStudent(IntelligentStudent s){
        super(s);
        this.iq=s.iq;
    }

    @Override
    public Student clone(){
        return new IntelligentStudent(this);
    }
}
