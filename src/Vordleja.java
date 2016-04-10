/**
 * Created by lanev_000 on 9.04.2016.
 */
public class Vordleja <C extends Comparable<C>> {

    public C leiaSuurem(C object1, C object2){
        if (object1.compareTo(object2) > 0){
            return object1;
        } else{
            return object2;
        }
    }

    public static void main(String[] args) {
        Vordleja<String> vordleja = new Vordleja<>();
        String a = "A";
        String b = "9";
        System.out.println(vordleja.leiaSuurem(a, b));
    }

}
