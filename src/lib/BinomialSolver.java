package lib;

public class BinomialSolver {
    private double a, b, c, x1, x2;

    public BinomialSolver(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;

        this.roots();
    }

    //method which allows calculate the roots of binomial
    private void roots() throws ArithmeticException{
        double delta = Math.pow(this.b, 2) - 4 * this.a * this.c;
        if(delta==0){
            this.x1=(-1)*(this.b)/(2*this.a);
        }
        else if(delta>0){
            this.x1 = (-(this.b) + Math.sqrt(delta))/(2*this.a);
            this.x2 = (-(this.b) - Math.sqrt(delta))/(2*this.a);
        }
        else throw new NoRealSolution("Delta<0");
    }
     //getters
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    //method which returns the value of binomial
    public double calculate(double x){
        return this.a*Math.pow(x,2)+this.b*x+this.c;
    }
}