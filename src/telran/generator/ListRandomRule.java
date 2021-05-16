package telran.generator;

import java.util.List;
import java.util.Random;

public class ListRandomRule implements RandomRule{

    private List<Integer> list;
    public  ListRandomRule(List<Integer> list){
        this.list = list;
    }
    @Override
    public int nextInt() {
        Random generator = new Random();
        Integer randomNumber = list.get(generator.nextInt(list.size()));
        return randomNumber;
    }
}
