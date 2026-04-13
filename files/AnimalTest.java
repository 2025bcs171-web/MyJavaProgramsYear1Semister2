public class AnimalTest{
    public static void main(String[] args){
        Animal animal = new Animal();
        //Object for Animal class*
        animal.die();
        //Object for Snake class*
        Snake snake = new Snake();
        snake.hiss();
        snake.hiss("at night");
        snake.shade();
    }
}
class Animal{
    void eat(){
        System.out.println("Animal eats.");
    }
    void die(){
        System.out.println("Animal dies.");
    }
}
class Snake extends Animal{
    void hiss(){
        System.out.println("Snake hisses.");
    }
    // @overload
    void hiss(String night){
        System.out.println("Snake hisses "+night);
    }
    void crow(){
        System.out.println("Snake crows.");
    }
    void shade(){
        System.out.println("Snake shading skin.");
    }
}
class Cow extends Animal{
    void mow(){
        System.out.println("Cow mows.");
    }
}
