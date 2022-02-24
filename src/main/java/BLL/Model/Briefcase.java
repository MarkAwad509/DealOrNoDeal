package BLL.Model;

import java.util.*;

public class Briefcase {
    private static int CASE_NUM_GEN = 1;
    private int caseNumber;
    private double amount;
    private List<Double> allValues = new ArrayList<>(Arrays.asList(0.01, 1.0, 5.0, 10.0, 25.0, 50.0, 75.0, 100.0, 200.0, 300.0,
            400.0, 500.0, 750.0, 1000.0, 5000.0, 10000.0, 25000.0, 50000.0, 75000.0, 100000.0,
            200000.0, 300000.0, 400000.0, 500000.0, 750000.0, 1000000.0));

    public Briefcase(){
        this.caseNumber = CASE_NUM_GEN;
        int i= generateRandomIndex();
        this.amount = allValues.get(i);
        this.allValues.remove(i);
        //throws UnsupportedOperationException or re-initializes the list everytime.
        CASE_NUM_GEN++;
    }

    private int generateRandomIndex() {
        return new Random().nextInt(0, this.allValues.size());
    }

    @Override
    public String toString() {
        return "{ Briefcase:{ caseNumber:" + caseNumber + ", amount:" + amount + "}}";
    }
}
