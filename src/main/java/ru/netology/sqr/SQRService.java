package ru.netology.sqr;

public class SQRService {
    public int calculate(int sqrLow, int sqrHigh) {
        int actual = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= sqrLow & i * i <= sqrHigh) {
                actual++;
            }
        }
        return actual;
    }
}
