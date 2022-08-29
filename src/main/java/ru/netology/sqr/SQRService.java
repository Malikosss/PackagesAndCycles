package ru.netology.sqr;

public class SQRService {

    public int calculate(int min, int maх) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= min) {
                if (sqr <= maх) {
                    count++;
                }
            }
        }
        return count;
    }
}

