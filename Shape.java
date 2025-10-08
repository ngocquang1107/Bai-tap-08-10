public abstract class Shape {
    protected Point centerPoint;
    private static int count = 0;

    public Shape(Point centerPoint) {
        this.centerPoint = centerPoint;
        count++;
    }

    public static int getShapeCount() {
        return count;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public abstract String getDetails();
}
