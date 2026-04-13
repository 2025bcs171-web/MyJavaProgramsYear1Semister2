public class Animal {
    static double height, weight;static int legs,teeth;
    public static void main(String[] args) {
        //call methods.
        setHeight();
        setWeight();
        setLegs();
        setTeeth();
        printHeight();
        printWeight();
        printLegs();
        printTeeth();
     }
      // Create method to set variables.
    static void setHeight(){
        height = 2.7;
     }
    static void setWeight(){
        weight = 50.0;
     }
    static void setLegs(){
        legs = 4;
     }
    static void setTeeth(){
        teeth = 32;
     }
     // Create method to print variables.
     static void printHeight(){
        System.out.println("Height of animal is: " + height);
     }
     static void printWeight(){
        System.out.println("Weight of animal is: " + weight);
     
     }
     static void printLegs(){
        System.out.println("Number of legs of animal is: " + legs);
     
     }
     static void printTeeth(){
        System.out.println("Number of teeth of animal is: " + teeth);
     }
}