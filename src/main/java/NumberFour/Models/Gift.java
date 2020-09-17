package NumberFour.Models;

public class Gift {
    private Alarm alarm;

    public Gift(Alarm alarm) {
        this.alarm = alarm;
    }

    public Gift() {
    }

    public Alarm getAlarm() {
        return alarm;
    }

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "alarm=" + alarm +
                '}';
    }
}
