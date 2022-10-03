public class RectangleRunner {
    public static void main(String[] args)
    {
        int TotalArea;

        Rectangle plot1 = new Rectangle(150, 200);
        plot1.setWidth(75);
        plot1.calculateArea();

        Rectangle plot2 = new Rectangle(125);
        plot2.setWidth(75);
        plot2.setLength(75);
        plot2.calculateArea();

        Rectangle plot3 = new Rectangle();
        plot3.setWidth(75);
        plot3.calculateArea();

        TotalArea=plot3.calculateArea() + plot1.calculateArea() + plot2.calculateArea();
        System.out.println("The total amount of seeds requires " + TotalArea + " square foot of seeds");

    }
}
