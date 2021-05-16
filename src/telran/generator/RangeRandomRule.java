package telran.generator;

import java.util.List;
import java.util.Random;

public class RangeRandomRule implements RandomRule{
    private Integer number;
    public  RangeRandomRule(Integer number){
        this.number = number;
    }

    @Override
    public int nextInt() {
        Random generator = new Random();
        Integer randomNumber = generator.nextInt(number);
        return randomNumber;
    }
}
