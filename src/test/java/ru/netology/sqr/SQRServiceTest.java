package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'amount SQR, inside range',100,200,5",
            "'amount SQR, under range',1,99,0",
            "'amount SQR, over range',9802,10000,0"})
    void amountSqr(String testName, int sqrLow, int sqrHigh, int expected) {
        SQRService service = new SQRService();

        // вызываем метод
        int actual = service.calculate(sqrLow, sqrHigh);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}