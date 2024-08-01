interface Flyable{
    void fly();
}

class Bird implements Flyable{
    public void fly(){
        System.out.println("the bird is flying");
    }
}

public class basics{
    public static void main(String[] args){
        Bird bird = new Bird();
        bird.fly();
    }
}