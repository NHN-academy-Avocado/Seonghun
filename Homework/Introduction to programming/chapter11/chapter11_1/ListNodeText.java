package chapter11_1;

public class ListNodeText {
    public static void main(String[] args) {
        ListNode list = new ListNode("b");
        list = insertAfter(list, "c", "b");
        list = insertBefore(list, "a", "b");
        // a b c
        System.out.println(length(list)); // 3
        System.out.println(list.info); // a
        System.out.println(list.next.info); // b
        System.out.println(invert(list).info); // c

        list = modify(list, "a", "b");
        // b b c
        System.out.println(list.info); // b

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
        ListNode p = lis;
        int answer = 0;
        while (p != null) {
            answer++;
            p = p.next;
        }
        return answer;
    }

    public static ListNode insertAfter(ListNode lis, String s, String given) {
        ListNode p = copy(lis);
        ListNode p1 = p;
        while (p1 != null) {
            if (p1.info.equals(given)) {
                ListNode temp = new ListNode(s, p1.next);
                p1.next = temp;
                break;
            }
            p1 = p1.next;
        }
        return p;
    }

    public static ListNode modify(ListNode lis, String old, String ne) {
        ListNode p = copy(lis);
        ListNode p1 = p;
        while (p != null) {
            if (p.info.equals(old)) {
                p.info = ne;
                break;
            }
            p = p.next;
        }
        return p1;
    }

    public static ListNode modifyAll(ListNode lis, String old, String ne) {
        ListNode p = copy(lis);
        ListNode p1 = p;
        while (p != null) {
            if (p.info.equals(old)) {
                p.info = ne;
            }
            p = p.next;
        }
        return p1;
    }

    public static ListNode insertBefore(ListNode lis, String s, String given) {
        ListNode p = copy(lis);
        ListNode p1 = p;
        if (lis.info.equals(given)) {
            ListNode temp = new ListNode(s);
            temp.next = p;
            return temp;
        }
        

        while (p != null) {
            if (length(p) > 1 && p.next.info.equals(given)) {
                ListNode temp = new ListNode(s, p.next);
                p.next = temp;
                break;
            }
            p = p.next;
        }
        return p1;
    }

    public static ListNode copy(ListNode lis) {
        ListNode p = lis;
        ListNode answer = new ListNode();
        ListNode answer1 = answer;
        while (p != null) {
            ListNode temp = new ListNode(p.info);
            answer.info = temp.info;
            if (length(p) > 1) {
                answer.next = temp;
            }
            p = p.next;
            answer = answer.next;
        };
        return answer1;
    }

    public static ListNode invert(ListNode lis) {
        ListNode p = new ListNode();
        
        while (lis != null) {
            p.info = lis.info;
            if (length(lis) > 1) {
                ListNode temp = new ListNode();
                temp.next = p;
                p = temp;
            }
            lis = lis.next;
        }
        return p;
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
