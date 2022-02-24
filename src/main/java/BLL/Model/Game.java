package BLL.Model;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Briefcase> briefcases;
    private Banker banker;

    public Game(){
        this.briefcases = new ArrayList<>();
        for (int i = 0; i < 26; i++)
            briefcases.add(new Briefcase());
        banker = new Banker();
    }

    @Override
    public String toString() {
        return "{ Game:{ briefcases:" + briefcases + ", banker:" + banker + "}}";
    }
}
