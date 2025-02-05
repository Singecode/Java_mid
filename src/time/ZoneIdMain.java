package time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {
    public static void main(String[] args) {
        Set availableZoneIds = ZoneId.getAvailableZoneIds(); //이용 가능한 ZoneId목록 출력
        for(String availableZoneId : ZoneId.getAvailableZoneIds()){
            //System.out.println("availableZoneId: " + availableZoneId);
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }
        ZoneId zoneId = ZoneId.systemDefault(); //Os에서 선택하는 날짜 달력에서 선택 시스템이 사용하는 기본 ZoneId 반환
        System.out.println("ZoneId.SysetemDefault = "+ zoneId);

        ZoneId seoulId = ZoneId.of("Asia/Seoul");
        System.out.println("SeoulId = " + seoulId);
    }
}

//ZoneId.of() : 타임존을 직접 제공해서 ZoneId 반환가능
