package hello.login.web.login;

import javax.validation.constraints.NotEmpty;

public class LoginForm {

    @NotEmpty
    private String loginId;
    @NotEmpty
    private String password;
}
