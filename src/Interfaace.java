interface polygon{
    void getArea(int length, int width);
}
class Rectangle implements polygon{
    public void getArea(int length, int width){
        int area = length*width;
        System.out.println("Area : " +area);

    }
}
public class Interfaace{
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        r.getArea(10,30);

//        Commit

    }
}