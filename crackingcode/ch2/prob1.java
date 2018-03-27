import java.util.Hashtable;
import java.util.LinkedList;
public class prob1 {
    public static void deketeDup(LinkedListNode n) {

        Hashtable table = new Hashtable();
        LinkedListNode previous = null;
        while (n != null) {
            if(table.containsKey(n.data)) {
                previous.next = n.next;
            } else {
                table.put(n.data, true);
                previous = n;
            }
            n = n.next;
        }
    }

    public class LinkedListNode {
        LinkedListNode head;
        LinkedListNode tail;
    }
}