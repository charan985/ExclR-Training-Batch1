public class Demo073 {
    public static void main(String[] args) {
        int[] arr ={7,10,5,7,15,10};
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                boolean alreadyPrinted = false;
                for (int k = 0; k < i; k++) {
                    if (arr[i] == arr[k]) {
                        alreadyPrinted = true;
                        break;
                    }
                }
                if (!alreadyPrinted) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
