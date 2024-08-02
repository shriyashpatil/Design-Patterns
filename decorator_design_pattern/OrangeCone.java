public class OrangeCone implements Icecream{

    Icecream ic;
    private Integer costOfOrange = 30;
    private String entity = "OrangeCone";

    OrangeCone(Icecream ic){
        this.ic = ic;
    }

    OrangeCone(){}

    @Override
    public Integer getCost() {
        
        if(ic==null) return costOfOrange;

        return ic.getCost()+costOfOrange;

    }

    @Override
    public String getDescription() {
        if(ic==null) return entity;
        return ic.getDescription()+"+"+entity;
    }


    
}
