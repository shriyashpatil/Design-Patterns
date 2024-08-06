import java.util.ArrayList;
import java.util.List;

public class Amazon{

    List<OnOrderPlacedSubscriber> subs = new ArrayList<>();

    void register(OnOrderPlacedSubscriber oops){
        subs.add(oops);
    }

    void onOrderPlaced(){
        for(OnOrderPlacedSubscriber oop : subs){
            oop.onOrderPlaced();
        }
    }


}