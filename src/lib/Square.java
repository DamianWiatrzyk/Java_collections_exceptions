package lib;

public class Square extends Rectangle {
    public Square(String name, double width){
        super(name, width, width);
        System.out.println("Constructor Square: " + name);
    }
}
