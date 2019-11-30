public class Hangar {

    public static void main(String[] args) {

        // new cars
        Car dodge = new Car("Dodge"); 
        Car vw = new Car("VW"); 
        // new boats
        Boat canoe = new Boat("Canoe"); 
        Boat queenMary = new Boat("Queen Mary"); 

        // doStuff usage
        System.out.println(dodge.doStuff());
        System.out.println(vw.doStuff());
        System.out.println(canoe.doStuff());
        System.out.println(queenMary.doStuff());

    }
}