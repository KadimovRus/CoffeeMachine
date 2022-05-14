class Car {

    int yearModel;
    String make;
    int speed;

    public void accelerate() {
        speed += 5;
    }

    public void brake() {
        speed = speed > 4 ? speed - 5 : 0;
    }
}