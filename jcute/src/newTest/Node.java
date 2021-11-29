package newTest;
public class Node {
    int elem;
    Node next;

    public Node(int elem, Node next) {
        this.elem = elem;
        this.next = next;
    }

    public Node(int elem) {
        this.elem = elem;
    }

    Node swapNode() {

        if (next != null)
            if (elem > next.elem) {
                Node t = next;
                next = t.next;
                t.next = this;
                assert elem < t.next.elem;
                return t;
            }
        return this;
    }

    /* ----- Test Driver ----- */
    public static void main(String[] args) {
        Node n = new Node(1, new Node(2));
        Node result = n.swapNode();
    }
}
