package chapter11_2;

public class ListNode {
    public String info;
    public ListNode next;

    public ListNode() {
        this.info = null;
        this.next = null;
    }
    
    public ListNode(String info) {
        this.info = info;
    }

    public ListNode(String info, ListNode next) {
        this.info = info;
        this.next = next;
    }

    

    
}