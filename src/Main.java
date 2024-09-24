//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ServiceStation serviceStation = new ServiceStation();


        Car car1 = new Car("AUDI", 4);
        Car car2 = new Car("BMV", 4);


        Truck truck1 = new Truck("КАМАЗ", 8);
        Truck truck2 = new Truck("ЗИЛ", 6);


        Bicycle bicycle1 = new Bicycle("BMX", 2);
        Bicycle bicycle2 = new Bicycle("CROSS", 2);


        serviceStation.service(bicycle1);
        serviceStation.service(bicycle2);
        serviceStation.service(car1);
        serviceStation.service(car2);
        serviceStation.service(truck1);
        serviceStation.service(truck2);


    }
}