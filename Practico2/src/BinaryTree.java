public class BinaryTree {
    private Node root;

    //Constructor to initialize the tree with a value
    public BinaryTree(Integer value) { this.root = new Node(value); }

    //Constructor to initialize the tree with a node
    public BinaryTree(Node root) {
        this.root = root;
    }

    //Constructor to initialize the tree empty
    public BinaryTree() {
        this.root = null;
    }

    public Node getRoot() {return root; }

    public Integer getRootValue() {
        return root.getValue();
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void insert(int data) { root = insert(root, data); }

    private Node insert(Node node, int data) {
        if (node == null) {
            node = new Node(data);
        } else {
            if (data <= node.getValue()) {
                node.setLeftNode(insert(node.getLeftNode(), data));
            } else {
                node.setRightNode(insert(node.getRightNode(), data));
            }
        }
        return node;
    }

    public boolean hasElem(Integer value) { return searchElem(root, value); }

    private boolean searchElem(Node node, Integer val) {
        if (node == null) {
            return false;
        } else if (val == node.getValue()) {
            return true;
        }
        else if (val < node.getValue()) {
            return searchElem(node.getLeftNode(), val);
        } else {
            return searchElem(node.getRightNode(), val);
        }
    }

    public void printInOrder(Node node){
        if (node != null) {
            printInOrder(node.getLeftNode());
            System.out.print(node.getValue() + " ");
            printInOrder(node.getRightNode());
        }
    }

    public void printPreOrder(Node node) {
        if (node != null) {
            System.out.print(node.getValue() + " ");
            printPreOrder(node.getLeftNode());
            printPreOrder(node.getRightNode());
        }
    }

    public void printPosOrder(Node node) {
        if (node != null) {
            printPosOrder(node.getLeftNode());
            printPosOrder(node.getRightNode());
            System.out.print(node.getValue() + " ");

        }
    }

    public boolean isEmpty() {
        return (this.root == null);
    }
}