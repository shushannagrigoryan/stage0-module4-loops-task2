package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int temp = 1;
        System.out.println(temp);
        temp++;
        int t1 = 1;
        int count = 0;
        while(temp <= printToInclusive){
            while(t1 <= temp){
                if(temp%t1 == 0){
                    count ++;
                }
                t1++;
            }
            t1 = 1;
            if(count == 2) {
                System.out.println(temp);
            }
            count = 0;
            temp ++;
        }
    }
}
