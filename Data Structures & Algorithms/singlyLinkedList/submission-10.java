class LinkedList {
    private Node head;
    private int count;
    public LinkedList() {
        this. head = null;
        this.count = 0;
    }

    public int get(int index) {
        if(index >= count) return -1;

        Node cur = head;

        for(int i = 0; i < index; i++) {
            cur = cur.next;
        }

        return cur.val;
    }

    public void insertHead(int val) {
        this.head = new Node(val, head);
        this.count++;
    }

    public void insertTail(int val) {
        Node cur = head;
        if(head == null) {
            insertHead(val);
            return;
        }
        while(cur.next != null) cur = cur.next;
        cur.next = new Node(val);
        this.count++;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= count) return false;

        if (index == 0) {
            head = head.next;
            count--;
            return true;
        }

        Node cur = head;

        for (int i = 0; i < index - 1; i++) {
            cur = cur.next;
        }

        cur.next = cur.next.next;

        count--;
        return true; 
    }

    public ArrayList<Integer> getValues() {
        Node cur = head;
        ArrayList<Integer> l = new ArrayList<>();
        while(cur != null) {
            l.add(cur.val);
            cur = cur.next;
        }

        return l;
    }

    private static class Node {
        int val;
        Node next;

        Node(int val) { this.val = val; }
        Node(int val, Node next) { 
            this(val);
            this.next = next;
        }
    }
}
