package objects;

public class HomeArea {
    public static void main(String[] args) {

        Rectangle room1 = new Rectangle();
        room1.setLength(10);
        room1.setWidth(5);
        double areaOfRoom1 = room1.calculateArea();

        Rectangle room2 = new Rectangle(30, 15);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;
        System.out.println("Area of both room is: " + totalArea);
    }
}
