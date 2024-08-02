

public class SbScoop implements Icecream {
    
    Icecream ic;

    Integer costOfSbScoop=50;

    String entity = "Vanilla Scoop";

    SbScoop(Icecream ic){
        this.ic = ic;
    }

    @Override
    public Integer getCost() {
        
        return ic.getCost()+costOfSbScoop;

    }

    @Override
    public String getDescription() {
        return ic.getDescription()+"+"+entity;
    }

    
    
}
