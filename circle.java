public class Circle {
    int firstCoordinate1;
    int secondCoordinate1;
    int radius1;
    int firstCoordinate2;
    int secondCoordinate2;
    int radius2;

    public Circle(int radius1_1, int firstCoordinate1_1, int secondCoordinate1_1, int radius2_2, int firstCoordinate2_2, int secondCoordinate2_2){
        if(radius1_1>0 & radius2_2>0) {
            firstCoordinate1 = firstCoordinate1_1;
            secondCoordinate1 = secondCoordinate1_1;
            radius1 = radius1_1;
            firstCoordinate2 = firstCoordinate2_2;
            secondCoordinate2 = secondCoordinate2_2;
            radius2 = radius2_2;
        }
    }
    static boolean squareEquals(){
        return Math.PI * Math.pow(12, 2) == Math.PI * Math.pow(11, 2);
    }

    public static void main(String[] args){
        System.out.println("With such:\ncircle1: radius = 12, center(0;0)\ncircle2: radius = 11, center(3,5)\n");
        Circle circle = new Circle(12,0,0,11,3, 5);
        boolean result = squareEquals();
        if(result)
            System.out.println("Areas of these circles are equal.\n");
        else
            System.out.println("Areas of these circles are not equal.\n");
    }
}
