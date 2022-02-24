package BLL.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Banker {
    private double offer;
    private static List<Double> offers;

    public Banker(){
        this.offer = makeOffer();
        this.offers = new ArrayList<>();
        offers.add(offer);
    }

    private double makeOffer(){
        return 0;
    }

    public static Collection<Double> getOffers() {
        return offers;
    }

    @Override
    public String toString() {
        return "{ Banker:{ offer:" + offer + ", allOffers" + getOffers() + "}}";
    }
}
