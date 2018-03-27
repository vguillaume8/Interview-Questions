// Reverse a C-Style String
// C-Style- theres a null character(blank) at the end of the String
public class prob2 {

    public static void reverse(String str) {
        char[] myChar = str.toCharArray();
        System.out.println(str);
        int p1 = 0;
        int p2 = myChar.length -1;

        while(p1<p2)
        {
            char temp = myChar[p1];
            myChar[p1]= myChar[p2];
            myChar[p2] = temp;

            p1++;
            p2--;
        }

        str = str.copyValueOf(myChar);

        System.out.println(str);
    }
    public static void main(String[] args) {
        reverse("vince ");
    }
}