

public class VanillaScoop implements Icecream {
    
    Icecream ic;

    Integer costOfVanillaScoop=50;

    String entity = "Vanilla Scoop";

    VanillaScoop(Icecream ic){
        this.ic = ic;
    }

    @Override
    public Integer getCost() {
        
        return ic.getCost()+costOfVanillaScoop;

    }

    @Override
    public String getDescription() {
        return ic.getDescription()+"+"+entity;
    }

    
    
}
