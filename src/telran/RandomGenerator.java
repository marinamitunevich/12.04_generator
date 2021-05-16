package telran;

import telran.generator.RandomRule;

import java.util.ArrayList;
import java.util.List;

public class RandomGenerator {
    private RandomRule rule;

    public RandomGenerator(RandomRule rule) {
        this.rule = rule;
    }

    public List<Integer> nextInts(int size){
        List randomList = new ArrayList();
        for(int i = 0; i < size; i++){
            randomList.add(rule.nextInt());
        }

        return randomList;
    }
}
