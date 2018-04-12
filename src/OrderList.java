import java.util.Random;

public class OrderList {
        protected Node head;
        public int listSize;

        public OrderList() {
            this.head = null;
            this.listSize = 0;
        }

        public OrderList(int size) {
            this.generateRandomList(size);
        }

        public void insert(Object o) {
            Node tmp = new Node(o, null);
            tmp.setNext(this.head);
            this.head = tmp;
            this.listSize++;
        }

        private void generateRandomList(int size) {
            for(int i=0; i<size; i++) {
                Random value = new Random();
                this.insert(value.nextInt(40));//A modo de ejemplo, que genere listas random con valores entre 0 y 40
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


        // public boolean isEmpty() { }
        // public Object extract() {
}
