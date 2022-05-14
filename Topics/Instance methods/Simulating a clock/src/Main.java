
class Clock {

    final int HOUR_IN_MINUTE = 60;
    final int TWELVE = 12;
    int hours = 12;
    int minutes = 0;

    void next() {
        // implement me
        minutes++;
        if (minutes == HOUR_IN_MINUTE) {
            minutes = 0;
            hours++;
        }
        if (hours > TWELVE) {
            hours = 1;
        }
    }
}