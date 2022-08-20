package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        System.out.println(0);
        int temp = 1;
        while(Math.abs(temp) <= Math.abs(multiplyByAndToInclusive)){
            System.out.println(temp * multiplyByAndToInclusive);
            temp++;
        }
    }
}
