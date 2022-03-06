public class MultiLevelInheritance {
    public static void main(String[] args)
    {
        RectangleArea area=new RectangleArea();
        area.squareArea();
        area.rectangleArea();
    }
}

class Quadrilateral
{
    int side=5;
}

class SquareArea extends Quadrilateral
{
    void squareArea()
    {
        System.out.println(side*side);
    }
}

class RectangleArea extends SquareArea
{
    int breadth=side;
    int length=7;
    void rectangleArea()
    {
        System.out.println(breadth*length);
    }
}