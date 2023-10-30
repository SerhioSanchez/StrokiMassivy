package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long mid(long[] sales) {
        return sum(sales) / sales.length;
    }

    public  int monthMaximumSale(long[] sales) {
        int monthMaximum = 0;
        for(int i = 0; i < sales.length; i++) {
            if (sales[monthMaximum] <= sales[i]) {
                monthMaximum = i;
            }
        }

        return monthMaximum + 1;
    }
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int countBelowMid(long[] sales) {
        long mid = mid(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < mid) {
                count++;
            }
        }
        return count;
    }

    public int countHigherMid(long[] sales) {
        return 12 - countBelowMid(sales);
    }

}