import java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(new Point(1, 2), 4, 5));
        shapes.add(new Square(new Point(3, 3), 6));
        shapes.add(new Circle(new Point(0, 0), 2.5));
        shapes.add(new Rectangle(new Point(-1, -1), 3, 7));
        shapes.add(new Square(new Point(5, 5), 2));

        System.out.println("Tổng số hình đã khởi tạo: " + Shape.getShapeCount());
        System.out.println("Danh sách chi tiết các hình:");
        for (Shape s : shapes) {
            System.out.println(s.getDetails());
        }
        System.out.println("Danh sách tâm điểm:");
        for (Shape s : shapes) {
            System.out.println(s.getCenterPoint());
        }
    }
}
