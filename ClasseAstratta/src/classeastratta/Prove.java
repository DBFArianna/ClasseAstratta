package classeastratta;

public class Prove {

    public static void main(String[] args) {
        //        inizializzo la classe A con dei puntatori
        A a = new A(1);
        A b = new A(2);

//        non si può fare il confronto tra due oggetti
//        poiché sono solo puntatori
        if (a.compareTo(b) < 0) {
            System.out.println("l'oggetto a è minore di b");
        }
    }

}

//creo una classe concreta
//che implementi un'interfaccia già esistente Comparable
class A implements Comparable {

//    creo un intero
    int value;

//    costruttore
    public A(int a) {
        value = a;
    }

//    creo un metodo concreto int 
//    che sovrascriva il metodo astratto di Comparable
    @Override
    public int compareTo(Object o) {
//        se value è minore di o di tipo A.value
        if (value < ((A) o).value) {
//            ritorna -1
            return -1;
//          altrimenti se value è == a o di tipo A.value
        } else if (value == ((A) o).value) {
//            ritorna 0
            return 0;
//          in tutti gli altri casi
        } else {
//            ritorna 1
            return 1;
        }

    }
}
