public class FinancialForecaster {
    public double calculateFutureValueRecursive(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        }
        return calculateFutureValueRecursive(initialValue * (1 + growthRate), growthRate, years - 1);
    }
    public double calculateFutureValueOptimized(double initialValue, double growthRate, int years, double[] memo) {
        if (years == 0) {
            return initialValue;
        }
        if (memo[years] != 0) {
            return memo[years];
        }
        memo[years] = calculateFutureValueOptimized(initialValue, growthRate, years - 1, memo) * (1 + growthRate);
        return memo[years];
    }
}