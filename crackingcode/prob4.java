// Check to see if two Strings are anagrams
import java.util.Arrays;
public class prob4 {

    public static boolean isAna(String a, String b ) {
       char[] aa = a.toCharArray();
       char[] bb = b.toCharArray();
       return Arrays.sort(aa) == Arrays.sort(bb);
        
    }
}