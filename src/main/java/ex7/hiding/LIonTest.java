package ex7.hiding;

class Animal {
    int id;
}

class Lion extends Animal {
    String id;
    void print() {
        System.out.println(id);
        System.out.println(super.id);
    }
}

public class LIonTest {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.id = 20;
        Lion b1 = new Lion();
        b1.id = "문자data";
        b1.print();
    }
}
