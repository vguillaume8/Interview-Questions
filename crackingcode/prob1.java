// Check if a string has a unique string of letters
public class prob1 {

    public static boolean isUniqueChars2(String str) {
        boolean[] char_set = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
         return true;
     } 
    // Saves mmore space
     public static boolean isUniqueChars(String str) {
         int checker = 0;
         for (int i = 0; i < str.length(); i++) {
             int val = str.charAt(i) - 'a';
             if((checker & (1 << val)) > 0) {
                 return false;
             }
             checker |= (1 << val);
         }
         return true;
     }

    public static void main(String[] args) {
        String string = "yoo";

        System.out.println(isUniqueChars(string));
    }
}