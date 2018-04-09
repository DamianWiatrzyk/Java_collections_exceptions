package lib;

public class Rectangle extends Shape {
    protected double width;
    protected double height;
    
    public Rectangle(String name, double height, double width) throws ArithmeticException{
        super(name);
        this.height = height;
        this.width = width;
        System.out.println("Constructor Rectangle " + name);
        if(height <=0){
            throw new ArithmeticException("Height cannot be less or equal than 0");
        }else if (width<=0){
            throw new ArithmeticException("Width cannot be less or equal than 0");
        }
    }
    
    @Override
    public double area() {

        return width*height;
    }

    @Override
    public double perimeter() {

        return 2*height + 2*width;
    }
}
