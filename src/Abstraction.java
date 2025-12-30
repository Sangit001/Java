 abstract class Test{

    abstract void start();
    abstract void stop();
;
}

class Remote extends Test{

void start(){
    System.out.println("Car started");
}
void stop(){
    System.out.println("Car stops");
}
}





public class Abstraction {

    public static void main(String[] args) {

        Test t1 = new Remote();

        t1.start();


    }
}

