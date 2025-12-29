// abstract class Test{
//
//    abstract void start();
//    abstract void stop();
//;
//}
//
//class Remote extends Test{
//
//void start(){
//    System.out.println("Car started");
//}
//void stop(){
//    System.out.println("Car stops");
//}
//}
//
//
//
//
//
//public class Abstraction{
//
//    public static void main(String[] args){
//
//        Test t1 = new Remote();
//
//        t1.start();
//
//
//
//    }


abstract class Car{

    abstract void CarNames();
    abstract void CarColor();


abstract class Bus{

    abstract  void BusName();
    abstract void BusColor();
}
}

class Details extends Car{

    void CarNames(){
        System.out.println("BMW M4");
        System.out.println("TESLA S");
    }
    void CarColor(){
        System.out.println("Black");
        System.out.println("White");
    }


class BusDetails extends Car.Bus {
        void BusName(){
            System.out.println("Local Bus");
        }
        void BusColor(){
            System.out.println("White and Blue");
        }
    }
}


public class Abstraction {
    public static void main(String[] args) {

        Car car1 = new Details();
        car1.CarNames();
        car1.CarColor();

        Car.Bus bus1 = new Details().BusDetails();
        bus1.BusName();
    }
}