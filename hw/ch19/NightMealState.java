package hw.ch19;

public class NightMealState implements State {
    private static NightMealState singleton = new NightMealState();

    private NightMealState() {
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (17 <= hour && hour < 20) {
            context.changeState(NightState.getInstance());
        }
        else if (15 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("야식 시간 금고 사용 기록");
        context.callSecurityCenter("비상：야식 시간 금고 사용！");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(야식)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("자동 응답(야식)");
    }

    @Override
    public String toString() {
        return "[야식 시간]";
    }
    
    @Override // 차서연 : 추가된 메소드 구현
    public void doCCTV(Context context) {
        context.recordLog("CCTV: Off");
    }
}
