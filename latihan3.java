public class latihan3{
    public static void main(String[] args){
        int x = 10;
        int y =20;

        int r = 5;

        latihan3 obj = new latihan3();
        float area_circle = obj.area(r);
        int area_rectangle = obj.area(x, y);

        System.out.println("Area of circle: "+area_circle);
        System.out.println("Area of rectangle: "+area_rectangle);
    }
    public int area(int n1, int n2){
        int result = n1*n2;
        return result;
    }
    public float area(int n){
        float result = 3.14f*n*n;
        return result;
    }
}