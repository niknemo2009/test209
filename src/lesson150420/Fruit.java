package lesson150420;

public class Fruit {
    void one(){
        System.out.println("Work one Fruit");
        two();
    }
    void two(){
        System.out.println("Work two Fruit");
    }

}

class Orange extends Fruit{
    @Override
    void one() {
        super.one();
        System.out.println("Work one Orange");

    }

    public static void main(String[] args) {
        Fruit fr=new Orange();
    }
}