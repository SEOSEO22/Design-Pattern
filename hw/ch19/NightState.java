package hw.ch19;

public class NightState implements State {
    private static NightState singleton = new NightState();

    private NightState() {
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (15 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
        else if (20 <= hour) {
            context.changeState(NightMealState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("비상：야간 금고 사용！");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(야간)");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("야간 통화 녹음");
    }

    @Override
    public String toString() {
        return "[야간]";
    }

    @Override // 차서연 : 추가된 메소드 구현
    public void doCCTV(Context context) {
        context.recordLog("CCTV: 해상도 1200dpi로 변경");
    }
}
