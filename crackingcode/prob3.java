public class prob3 {

    public static void removedupChar(char[] string) {
        if (string == null) {
            return;
        }
        int len = string.length;
        if (len < 2) {
            return;
        }
        int tail = 1;

        for (int i  = 1; i < len; ++i) {
            int j;
            for (j = 0; j < tail; ++j) {
                if (string[i] == string[j]) {
                    break;
                }
            } if (j == tail) {
                string[tail] = string[i];
            }
        }
        string[tail] = 0;
        
    }

    public static void main(String[] args) {
        char[] cha = {'y', 'o', 'o', 'r', 'u'};
        System.out.println(cha.toString());
       removedupChar(cha);
       System.out.println(cha.toString());
    }


}