public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //get h m s
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    //set h m s
    public void setHour() {
        if (hour >= 0 && hour <= 23) {
            setHour();
        }
    }

    public void setMinute() {
        if (minute >= 0 && minute <= 59) {
            setMinute();
        }
    }

    public void setSecond() {
        if (second >= 0 && second <= 59) {
            setSecond();
        }
    }

    public void setTime(int hour, int minute, int second) {

    }

    //toString
    @Override
    public String toString() {
        String s = "0";
        String m = "0";
        String h = "0";
        if(second < 10){
        s = "0";
        }else{
            s = "";}
        if(minute < 10){
            m = "0";
        }else{
            m = "";}
        if(hour < 10){
            h = "0";
        }else{
            h = "";}

        String time = h + hour +":"+ m + minute +":"+ s +second;
        return time;
    }

    //increase second
    public int nextSecond() {
        second++;
        if(second == 60){
            minute++;
            second = 0;
            if(minute == 60){
                hour++;
                minute = 0;
                if(hour == 25){
                    hour = 1;
                }
            }
        }

        return second;
    }

    //decrease second
    public int previousSecond() {
        second--;
        if(second == -1){
            second = 59;
            minute--;
            if(minute == -1){
                minute = 59;
                hour--;
                if(hour == 0){
                    hour = 23;
                }
            }
        }

        return second;
    }

}