//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
//        double a = 1.6 + 0.1;
//        System.out.println(a);
//        System.out.printf(String.valueOf(a));

        Tv t1 = new Tv(); // 객체 생성 -> Tv 클래스 내부에 변수 3개가 다 생김
        t1.model = "aa";
        t1.channel = 10;
        t1.volume = 1;

        System.out.println(t1.model);
    }
}

class Tv {
    String model;
    int volume;
    int channel;
}