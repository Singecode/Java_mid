package enumration.test;

//Guest 손님 == level = 1, description == 손님
//Login level = 2, description = 로그인 회원
//Admin 관리자 level = 3, description = 관리자

public enum AuthGrade {
    GUEST(1,"손님"),LOGIN(2,"로그인 회원"),ADMIN(3,"관리자");
    private final int level;
    private final String description;

    AuthGrade(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }
}
