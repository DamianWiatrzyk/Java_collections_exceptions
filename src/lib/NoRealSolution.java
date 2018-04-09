package lib;

public class NoRealSolution extends ArithmeticException {
    public NoRealSolution(String what){
        super("NoRealSolution Exception: " + what);
    }
}
