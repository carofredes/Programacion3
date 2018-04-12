public class main {
    public static void main(String[] args) {
    /*
    *  Considerando n el tamaño de la lista 1 y m el tamaño de la lista 2
    *
    *  intersectionUnsortedLists tomará O(n.m) porque necesita correr n veces por todos los elementos
    *  de m, más el tiempo de ordenar la lista resultante
    *
    *  intersectionSortedLists tomará menos tiempo, O(n+m) ya que en el peor de los casos tendría que
    *  recorrer las dos listas enteras. Pero tiene que agregar el tiempo de ordenar las listas previamente
    *
    *  A medida que las listas incrementen de tamaño, las diferencias serán más notorias.
    *
    *  Faltaría agregarle una condición que no agregue elementos ya existentes en la lista de interseccion
    * */
        //Unorder lists
        SimpleList simpleList5 = new SimpleList(5);
        SimpleList simpleList10 = new SimpleList(10);
        SimpleList simpleList50 = new SimpleList(50);
        SimpleList simpleList100 = new SimpleList(100);
        SimpleList simpleList500 = new SimpleList(500);
        SimpleList simpleList1000 = new SimpleList(1000);

        SimpleList simpleList5V2 = new SimpleList(5);
        SimpleList simpleList10V2 = new SimpleList(10);
        SimpleList simpleList50V2 = new SimpleList(50);
        SimpleList simpleList100V2 = new SimpleList(100);
        SimpleList simpleList500V2 = new SimpleList(500);
        SimpleList simpleList1000V2 = new SimpleList(1000);

        simpleList5.print();
        simpleList5V2.print();
        SimpleList intersection = simpleList5.intersectionUnsortedLists(simpleList5V2);
        intersection.print();
        SimpleList intersection2 = simpleList100.intersectionUnsortedLists(simpleList500V2);

        //Ordered lists
        SimpleList osimpleList5 = new SimpleList(5);
        SimpleList osimpleList10 = new SimpleList(10);
        SimpleList osimpleList50 = new SimpleList(50);
        SimpleList osimpleList100 = new SimpleList(100);
        SimpleList osimpleList500 = new SimpleList(500);
        SimpleList osimpleList1000 = new SimpleList(1000);

        SimpleList osimpleList5V2 = new SimpleList(5);
        SimpleList osimpleList10V2 = new SimpleList(10);
        SimpleList osimpleList50V2 = new SimpleList(50);
        SimpleList osimpleList100V2 = new SimpleList(100);
        SimpleList osimpleList500V2 = new SimpleList(500);
        SimpleList osimpleList1000V2 = new SimpleList(1000);

        SimpleList ointersection = osimpleList5.intersectionSortedLists(osimpleList5V2);
        //ointersection.print();
        SimpleList ointersection2 = osimpleList100.intersectionSortedLists(osimpleList500V2);
        //ointersection2.print();
    }
}
