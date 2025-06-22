public class Forecast {
    public static void main(String[] args) {
        FinancialForecaster forecaster = new FinancialForecaster();
        double initialValue = 10000;
        double growthRate = 0.10;
        int years = 5;
        double futureValue = forecaster.calculateFutureValueRecursive(initialValue, growthRate, years);
        System.out.println("Future Value (Recursive): ₹" + futureValue);
        double[] memo = new double[years + 1];
        double optimizedValue = forecaster.calculateFutureValueOptimized(initialValue, growthRate, years, memo);
        System.out.println("Future Value (Optimized Recursive): ₹" + optimizedValue);
    }
}