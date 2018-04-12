public class Node {
    private Object info;
    private Node next;

    public Node() {
        this.info = null;
        this.next = null;
    }
    public Node(Object o, Node n) {
        setInfo(o);
        setNext(n);
    }
    public void setInfo(Object o) {
        this.info = o;
    }
    public void setNext(Node n) {
        this.next = n;
    }
    public Object getInfo() {
        return this.info;
    }
    public Node getNext() {
        return this.next;
    }
}
