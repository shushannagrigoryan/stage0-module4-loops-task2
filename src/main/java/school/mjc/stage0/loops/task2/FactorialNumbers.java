package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int temp = 0;
        int t1 = 1;
        int fac = 1;

        while(temp <= printToInclusive){
            while(t1 <= temp){
                fac *= t1;
                t1++;
            }
            t1 = 1;
            System.out.println(fac);
            fac = 1;
            temp ++;
        }
    }
}
