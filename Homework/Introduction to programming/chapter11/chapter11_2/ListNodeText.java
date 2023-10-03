package chapter11_2;

import java.util.List;

public class ListNodeText {
    public static void main(String[] args) {
        ListNode list = new ListNode("b");
        list = insertAfter(list, "c", "b");
        list = insertBefore(list, "a", "b");
        ListNode list3 = copy(list);
        list3 = invert(list3);

        // a b c
        System.out.println(length(list)); // 3
        System.out.println(list.info); // a
        System.out.println(list.next.info); // b
        System.out.println(invert(list).info); // c

        // copy 해서 list3만 뒤집어짐
        System.out.println(list3.info); // c
        System.out.println(list3.next.info); // b
        System.out.println(list3.next.next.info); // a

        list = modify(list, "a", "b");
        // b b c
        System.out.println(list.next.info); // b
        
        list = modifyAll(list, "b", "a");
        // a a c
        
        System.out.println(list.info); // a
        System.out.println(list.next.info); // a

        // a c
        ListNode list2 = new ListNode("a");
        list2 = insertAfter(list2, "c", "a");
        System.out.println(searchSequence(list, list2)); // true
    }

    public static int length(ListNode lis) {
        if (lis == null) {
            return 0;
        }
        return 1 + length(lis.next);
    }

    public static ListNode insertAfter(ListNode lis, String s, String given) {
        if (lis == null) {
            return lis;
        }
        if (lis.info.equals(given)) {
            ListNode temp = new ListNode(s, lis.next);
            lis.next = temp;
            return lis;
        }
        return insertAfter(lis.next, s, given);
    }

    public static ListNode modify(ListNode lis, String old, String ne) {
        if (lis == null) {
            return lis;
        }
        if (lis.info.equals(old)) {
            lis.info = ne;
            return lis;
        }
        lis.next = modify(lis.next, old, ne);
        return lis;

    }

    public static ListNode modifyAll(ListNode lis, String old, String ne) {
        if (lis == null) {
            return lis;
        }
        if (lis.info.equals(old)) {
            lis.info = ne;
        }
        lis.next = modifyAll(lis.next, old, ne);
        return lis;
    }

    public static ListNode insertBefore(ListNode lis, String s, String given) {
        if (lis == null) {
            return lis;
        } else {
            if (lis.info.equals(given)) {
                ListNode temp = new ListNode(s, lis);
                return temp;
            }
            if (lis.next == null) {
                return lis;
            }
            if (lis.next.info.equals(given)) {
                ListNode temp = new ListNode(s, lis.next);
                lis.next = temp;
                return lis;
            }
            lis.next = insertBefore(lis.next, s, given);
            return lis;
        }
    }

    public static ListNode copy(ListNode lis) {
        if (lis == null) {
            return lis;
        }
        return new ListNode(lis.info, copy(lis.next));
    }

    public static ListNode invert(ListNode lis) {
        if (lis == null) {
            return lis;
        }
        ListNode temp = invert(lis.next);
        ListNode result = new ListNode(lis.info);
        if (temp == null) {
            return result;
        }
        temp.next = result;
        return temp;
    }

    public static ListNode deleteDoubles(ListNode lis) {
        lis.next = null;
        return lis;
    }

    public static boolean searchSequence(ListNode lis1, ListNode lis2) {
        while (lis1 != null) {
            ListNode temp = lis1;
            ListNode p = lis2;
            boolean flag = true;
            while (p != null) {
                if (temp.info != p.info) {
                    flag = false;
                    break;
                }
                p = p.next;
                temp = temp.next;
            }
            if (flag) {
                return true;
            }
            lis1 = lis1.next;
        }
        return false;
    }
}
