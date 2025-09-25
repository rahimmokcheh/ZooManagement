public class Zoo {

    Animal[] animals ;
    String name , city ;
    int nbrCages = 25 ;

    Zoo(String name , String city , int nbrCages ){
        animals = new Animal[nbrcages] ;
        this.name =name ;
        this.city = city ;
        this.nbrCages = nbrCages ;
    }
    void displayZoo(){
        System.out.println(" Nom : " +name+ " City : " +city+ " NbrCages : " +nbrCages);
    }

    @Override
    public String toString(){
        return" Nom : " +name+ " City : " +city+ " NbrCages : " +nbrCages;
    }

}
