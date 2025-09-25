import javax.xml.namespace.QName;
import java.util.Scanner;

public class ZooManagement {

   public static void main(String[] args) {
       Animal lion = new Animal (family: "lions", name:"Simba", age: 5, isMammal: true);
       Zoo myzoo = new Zoo(name: "belvedere ", city:"tunis", nbrCages: 25);
       myzoo.displayZoo();
       System.out.println(myzoo);

   })
}
