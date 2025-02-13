class maximum {
    public static int findmaxi(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; 
            }
        }
        return max;
    }
}
public class Demo075 {
    public static void main(String[] args) {
        int[] arr={10,2,5,7,6,20};
        int maxiNumber = maximum.findmaxi(arr);
        System.out.println("Maximum number of an Array: "+maxiNumber );

    }
}

