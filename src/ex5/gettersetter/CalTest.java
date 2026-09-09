package ex5.gettersetter;

class Cal {
    private String name;    // 내부 필드 보호를 위함
    int result;
    // Alt + Insert => setter 및 getter > 필드 선택 후 확인

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.equals("kim")) {   // name이 kim과 다르면
            this.name = name;
        }
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}

public class CalTest {
    public static void main(String[] args) {
        Cal c = new Cal();
        // c.name = "lee";     // private인 경우 접근 불가
        c.setName("lee");   // 위 아래 동일하게 동작
    }
}
