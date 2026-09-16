package ex7.inheritance.constructor;

class A2 {
    A2() {
        //super() ; 자동생성( 생성자 첫 문장에 this(..) 나 super(..) 없을 때만 )
        System.out.println("A() 호출 ");
    }
    A2(int i) {
        this();  //super() ; 생성 안됨
        System.out.println("A(int i) 호출 ");
    }
}
class Child extends A2 {
    Child() {
        //super() 자동 생성 --> A() 호출
        System.out.println("Child()  호출 ");
    }
    Child(int i) {
        super(i); // A(int i) 호출
        System.out.println("Child(int i)  호출 ");
    }
}

class A3 {
    A3(int i){

    }
}

// 무인자 생성 때문에 오류가 남... 복습 필요
class B3 extends A3 {
    B3(int i) {
        super(i);
    }
}

class Test2 {
    public static void main(String[] args) {
        A2 obj1 = new A2();          System.out.println("-----------");
        A2 obj2 = new A2(5);         System.out.println("-----------");
        Child obj3 = new Child();  System.out.println("-----------");
        Child ob4 = new Child(5);
    }
}