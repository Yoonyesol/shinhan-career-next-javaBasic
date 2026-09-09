package minipjt01.board.member;

import java.io.Serializable;

public class Member implements Serializable {
    private Long id;    // 회원 아이디, 프로그램에서 유일한 값으로 자동 생성 (유저에게 입력 x)
    private String email;
    private String password;
    private String nickname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
