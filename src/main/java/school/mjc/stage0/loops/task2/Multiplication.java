package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int temp = 0;
        while(Math.abs(temp) <= Math.abs(multiplyByAndToInclusive)){
            System.out.println(temp * multiplyByAndToInclusive);
            temp++;
        }
    }
}
