class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        if (this.minutes + 1 >= 60) {
            if (hours + 1 > 12) {
                hours = 1;
            } else {
                hours += 1;
            }
            this.minutes = 0;
        } else {
            this.minutes += 1;
        }

    }
}