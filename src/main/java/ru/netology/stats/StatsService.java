package ru.netology.stats;

public class StatsService {
    public int salesSum(int[] sales) {
        int allSales = 0;

        for (int sale : sales) {
            allSales = allSales + sale;
        }
        return allSales;
    }

    public int salesAverage(int[] sales) {
        return salesSum(sales) / 12;
    }

    public int maxSales(int[] sales) {
        int monthMaxSale = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaxSale]) {
                monthMaxSale = i;
            }
        }
        return monthMaxSale + 1;
    }

    public int minSales(int[] sales) {
        int monthMinSale = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinSale]) {
                monthMinSale = i;
            }
        }

        return monthMinSale + 1;
    }

    public int salesBelowAverage(int[] sales) {
        int countMonthsBelowAverage = 0;
        int averageSales = salesAverage(sales);

        for (int sale : sales) {
            if (sale < averageSales) {
                countMonthsBelowAverage++;
            }
        }

        return countMonthsBelowAverage;
    }

    public int salesAboveAverage(int[] sales) {
        int countMonthsAboveAverage = 0;
        int averageSales = salesAverage(sales);

        for (int sale : sales) {
            if (sale > averageSales) {
                countMonthsAboveAverage++;
            }
        }

        return countMonthsAboveAverage;
    }
}