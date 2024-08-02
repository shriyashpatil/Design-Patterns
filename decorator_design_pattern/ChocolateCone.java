public class ChocolateCone implements Icecream{

    Icecream ic;
    Integer costOfChocolateCone = 40;
    String entity = "ChocolateCone";

    ChocolateCone(Icecream ic){
        this.ic = ic;
    }

    ChocolateCone(){}

    @Override
    public Integer getCost() {
        if(ic==null) return costOfChocolateCone;
        return ic.getCost()+costOfChocolateCone;
    }

    @Override
    public String getDescription() {
        
        if(ic==null) return entity;

        return ic.getDescription()+"+"+entity;

    }
    
}
