package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0) {
            System.out.println("Division by zero");
            return;
        }

        int quotient = dividend / divider;
        int multipliedResult = quotient * divider;

        String result = (multipliedResult == dividend) ? "can be divided completely" : "cannot be divided completely";
        System.out.println(result);
    }
}
