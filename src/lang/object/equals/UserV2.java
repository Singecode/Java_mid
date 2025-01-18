package lang.object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

//    @Override
//    public boolean equals(Object obj) {
//        UserV2 user = (UserV2) obj;
//         return id.equals(user.id);
//    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }


    //다운 캐스팅 이유? == Object클래스는 id라는 멤버변수가 존재하지않음.
    //따라서 클래스의 특정값에 접근하기 위해서 다운캐스팅을 해줬음.
    //동등성을 따지기 위해 return 값으로 equlas()를 호출하여 비교함
    // 앞서 구현한 equals는 오버라이딩은 버그가 많은 아주 단순안 예졔였음.
    // equals자체를 구현하는 것은 꽤나 복잡한
    // 우리는 그래서 ide의 도움을 받음 alt + insert.. equals and hashcode..

}
