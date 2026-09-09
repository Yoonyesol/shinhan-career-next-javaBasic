package ex19.threadEx;

class Count   //동기화되지 않은 예제
{     int i = 0;
    void add() {   i++;  }
};
class Ex3 implements Runnable
{	Count c = new Count();
    public void run()
    {	for (int i =0 ;i<100000 ;i++ )
        c.add();
    }
};
class ThreadTest3
{	public static void main(String[] args) throws Exception
{	Ex3 e = new Ex3();
    Thread ex1 = new Thread(e);
    Thread ex2 = new Thread(e);
    ex1.start(); ex2.start();
    ex1.join();  ex2.join();
    System.out.println(e.c.i);
}
}
