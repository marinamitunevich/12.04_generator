package telran.generator;

public interface RandomRule {
    /**
     * the method return random number depends from the rules of the class that
     * implements this interface
     * one rule is to return random number from the list
     *  other rule to generate random number from 0 till definite number
     * @return random number
     */
    int nextInt();
}
