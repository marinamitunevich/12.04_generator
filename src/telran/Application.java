package telran;

import telran.generator.ListRandomRule;
import telran.generator.RandomRule;
import telran.generator.RangeRandomRule;

import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        int range = 23;
        List<Integer> list = Arrays.asList(3,7,9,0,-2,8,6,9,10,6);
        RandomRule randomRuleForList = new ListRandomRule(list);
        RandomRule randomRuleForRange = new RangeRandomRule(range);
        RandomGenerator generator;
        int size = 10;

        // there is the list of the size elements that  is created by the ListRandomRule

        generator = new RandomGenerator(randomRuleForList);
        System.out.println(generator.nextInts(size));

        // there is the list of the size elements that is created by RangeRandomRule
        generator = new RandomGenerator(randomRuleForRange);
        System.out.println(generator.nextInts(size));

    }
}
