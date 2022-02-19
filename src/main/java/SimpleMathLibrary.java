public class SimpleMathLibrary {
    private double sumResult;
    private double minusResult;

    public double getSumResult() {
        return sumResult;
    }
    public double getMinusResult() {
        return minusResult;
    }
    public void add(double firstValue, double secondValue) {
        sumResult = firstValue + secondValue;
    }
    public double minus(double firstValue, double secondValue) {
        return minusResult = firstValue - secondValue;
    }
}