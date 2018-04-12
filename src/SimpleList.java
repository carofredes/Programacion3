import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimpleList {
    protected Node head;
    protected Node tail;
    public int listSize;

    public SimpleList() {
        this.head = null;
        this.tail = null;
        this.listSize = 0;
    }

    public SimpleList(int cantidad) {
        this.generateRandomList(cantidad);
    }

    public void insertBefore(Object o) {
        Node tmp = new Node(o, null);
        if (this.head == null) {
            this.head = tmp;
            this.tail = tmp;
        }
        else {
            tmp.setNext(this.head);
            this.head = tmp;
        }
        this.listSize++;
    }

    public void insertAfter(Object o) {
        Node tmp = new Node(o, null);
        if (this.head == null) {
            this.head = tmp;
            this.tail = tmp;
        }
        else {
            this.tail.setNext(tmp);
            this.tail = tmp;
        }
        this.listSize++;
    }

    private void generateRandomList(int cantidad) {
        for(int i=0; i<cantidad; i++) {
            Random value = new Random();
            this.insertBefore(value.nextInt(10));//A modo de ejemplo, que genere listas random con valores entre 0 y 10
        }
    }

    public void print() {
        Node temp = this.head;
        while(temp != null)
        {
            System.out.println(temp.getInfo());
            temp = temp.getNext();
        }
    }

    public int size() {
        return this.listSize;
    }

    public Object getValuePosition(int pos) {
        int tmp = 0;
        Node tmpn = head;
        while (tmp < pos) {
            tmpn = tmpn.getNext();
            tmp++;
        }
        return tmpn.getInfo();
    }

    public void orderList(){
        List<Object> nums = new ArrayList<Object>();
        for (int i=0; i<listSize; i++){
            nums.add(this.getValuePosition(i));
        }
        this.insertOrder(nums);
    }
    public void insertOrder(List<Object> values){
        Node newHead = new Node();
        for (int i=0; i<listSize; i++) {
            Node tmp = new Node();
            tmp = newHead;
            if (tmp.getInfo() != null) {
                Node newNode = new Node();
                newNode.setInfo(values.get(i));
                Node previous = new Node();
                while (((int) tmp.getInfo() <= (int) newNode.getInfo()) && (tmp.getNext() != null)) {
                    previous = tmp;
                    tmp = previous.getNext();
                }
                if (tmp.getInfo() == null) {
                    tmp.setNext(newNode);
                } else {
                    if ((int) tmp.getInfo() <= (int) newNode.getInfo()) {
                        tmp.setNext(newNode);
                    } else {
                        if (previous.getInfo() == null) {
                            newNode.setNext(tmp);
                            newHead = newNode;
                        } else {
                            previous.setNext(newNode);
                            newNode.setNext(tmp);
                        }
                    }
                }
            } else {
                newHead.setInfo(values.get(i));
            }
        }
        head = newHead;
    }

    public SimpleList intersectionUnsortedLists(SimpleList other) {
        SimpleList intersectionList = new SimpleList();
        for (int i=0; i<listSize; i++){ //this list
            for (int o=0; o<other.listSize; o++) { //other list
                if (this.getValuePosition(i) == other.getValuePosition(o)){
                    intersectionList.insertBefore(this.getValuePosition(i));
                }
            }
        }
        intersectionList.orderList();
        return intersectionList;
    }

    public SimpleList intersectionSortedLists(SimpleList other) {
        SimpleList intersectionList = new SimpleList();
        int tmp1 = 0;
        int tmp2 = 0;
        while ((tmp1 < this.listSize) && (tmp2 < other.listSize)){
            if ((int)this.getValuePosition(tmp1) == (int)other.getValuePosition(tmp2)) {
                intersectionList.insertAfter(this.getValuePosition(tmp1));
                tmp1++;
                tmp2++;
            } else if ((int)this.getValuePosition(tmp1) < (int)other.getValuePosition(tmp2)) {
                tmp1++;
            } else {
                tmp2++;
            }
        }
        return intersectionList;
    }
}