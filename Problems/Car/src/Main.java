class Car {

    int yearModel;
    String make;
    int speed;

    void accelerate() {
        this.speed += 5;
    }

    void brake() {
        if (this.speed - 5 < 0) {
            this.speed = 0;
        } else {
            this.speed -= 5;
        }

    }
}