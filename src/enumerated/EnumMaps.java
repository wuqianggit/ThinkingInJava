package enumerated;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * enumerated
 *
 * 2018/4/22-10:00
 * 2018
 * Created by wuqiang on 2018/4/22.
 */

interface Command{
    void action();
}
public class EnumMaps {
    public static void main(String[] args) {
        Map<AlarmPoints,Command> map=new HashMap<AlarmPoints,Command>();

        map.put(AlarmPoints.STAIR1, new Command() {
            @Override public void action() {
                System.out.println("STAR1 start");
            }
        });

        Command command = map.get(AlarmPoints.STAIR1);
        AlarmPoints.STAIR1.f();
        command.action();
    }
}
