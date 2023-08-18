package hello.login.domain.member;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Member {

    private Long id; //db 저장 및 관리

    @NotEmpty
    private String loginId; //로그인 ID (사용자 직접 사용)
    @NotEmpty
    private String name;
    @NotEmpty
    private String password;
}
