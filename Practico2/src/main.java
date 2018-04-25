public class main {
    public static void main(String[] args) {

        Node node5 = new Node(5);
        BinaryTree tree = new BinaryTree(node5);

        tree.insert(100);
        tree.insert(500);
        tree.insert(10);
        tree.insert(50);
        tree.insert(1000);

        tree.printPreOrder(tree.getRoot());
        tree.printInOrder(tree.getRoot());
        tree.printPosOrder(tree.getRoot());
        System.out.println(tree.isEmpty());
        System.out.println(tree.hasElem(100));

        /* La búsqueda en un Arbol binario depende mucho de cómo
         * fue construído el mismo. Si el árbol que construímos está
         * balanceado, es decir que insertamos en la raíz el número "medio"
         * y en sus hijos izquierdos los menores y en los derechos los mayores,
         * la búsqueda tendrá un tiempo de O(log2(n)) en el peor de los casos.
         * Si los números a insertar están ordenados, se generaría una estructura
         * similar a una lista vinculada y el coste de la búsqueda en el peor de los
         * casos sería de O(n).
         * Para el caso de la inserción, se mantienen los mismos costos, ya que
         * para encontrar el lugar donde se tiene que insertar el nuevo nodo hay
         * que hacer una búsqueda, así que para un árbol balanceado, en el peor de
         * los casos sería de O(log2(n))
         */
    }
}
