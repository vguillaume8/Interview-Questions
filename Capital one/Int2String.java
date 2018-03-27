/* Converts integer value to string value
*/

public class Int2String {

    static public String int2String(int value) {
        
        String string = Integer.toString(value);
        return string;
    }


    public static void main(String[] args) {
        int name = 500;
        System.out.println(int2String(name));
    }
}