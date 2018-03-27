public class pratice {

    public static int sum(int[] array, value) {
        int find;
        for(int i =0; i< array.length; i++) {
            find = value -array[i];
            for(int j =0; i < array.length; j ++) {
                if(find == array[j]) {
                    sum = array[j];
                }
            }
            
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3,7};
        System.out.println(sum(array, 5));
    }
}