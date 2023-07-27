package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {
        first += first; // first = 2first + second
        second = (first - second) / 2;
        first -= 2 * second;
    }
}
