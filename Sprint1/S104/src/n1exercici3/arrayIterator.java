package n1exercici3;

public class arrayIterator {
    static int[] numberList = new int[]{1,2,3,4,5,6,7,8,9,10};

    public static int arrayIteration(int n){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum += numberList[i];
        }
        return sum;
    }

}
