public class SportCar implements Car {
    Car[] cars;

    public SportCar() {
        this.cars = new Car[]{new Engine(), new Whell()};
    }

    @Override
    public void accept(Visitor visitor) {
        for (int i = 0; i < cars.length; i++) {
            cars[i].accept(visitor);
        }
        visitor.visit(this);
    }
}
