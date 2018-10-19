package classeastratta;

public class Prove {

    public static void main(String[] args) {
//        la classe A non può essere inizializzata poiché astratta
//////        A a = new A();
//        inizializzo la classe B
//        posso usare tutti i metodi di A
        B b = new B();
//        stampo il risultato del metodo comunica di B
        System.out.println(b.comunica());
    }

}

//costruisco una classe astratta
abstract class A {

//    Dichiaro una variabile stringa
    String msg = "Sono bella e astratta";

//    metodo di tipo String
    public String comunica() {
//        ritorna una stringa
//        posso usare il metodo astratto 
        return msg + AggiungiQualcosa();
    }

//    metodo astratto di tipo String
//    metto il ; alla fine perché ancora non so cosa deve ritornare
    abstract protected String AggiungiQualcosa();
}

//creo la classe concreta B che estende la classe astratta A
class B extends A {

//    Devo creare un metodo che sovrascriva il metodo astratto della classe A
//    altrimenti non posso estendere A
    @Override
    public String AggiungiQualcosa() {
//        ritorna una stringa
//        perché qui ho informazioni in più
        return "\ne capace di friggere un uovo";
    }
}

//creo la classe concreta C che estende la classe astratta A
class C extends A {

//    Devo creare un metodo che sovrascriva il metodo astratto della classe A
//    altrimenti non posso estendere A
    @Override
    public String AggiungiQualcosa() {
//        ritorna una stringa
//        perché qui ho informazioni in più
        return "\ne capace di cuocere il pollo";
    }
//    faccio il metodo toString

    @Override
    public String toString() {
//        ritorna una stringa
        return "pollo";
    }
}
