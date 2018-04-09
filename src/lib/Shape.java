package lib;

public abstract class Shape {
    protected String name;
    
    public Shape(String name){
        this.name = name;
        System.out.println("Constructor Shape " + name);
    }
    
    public void setName(String name){

        this.name=name;
    }
    
    public String getName(){

        return name;
    }
    
    public abstract double area();
    
    public abstract double perimeter();
}
