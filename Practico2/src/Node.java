public class Node {
    private Integer value;
    private Node left;
    private Node right;

    Node(Integer val) {
        this.value = val;
        this.left = null;
        this.right = null;
    }

    public Node getLeftNode(){
        return left;
    }
    public Node getRightNode(){
        return right;
    }

    public void setRightNode(Node node){
        this.right = node;
    }
    public void setLeftNode(Node node){
        this.left = node;
    }

    public Integer getValue(){
        return value;
    }
}
