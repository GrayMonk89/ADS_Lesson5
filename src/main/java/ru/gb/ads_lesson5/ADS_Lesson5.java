package ru.gb.ads_lesson5;

public class ADS_Lesson5 {
    public static double pow(double x, int n) {
        if (n >= 0) {
            return (n == 0) ? 1 : x * pow(x, n - 1);
        } else {
            return (n == -1) ? 1 / x : 1.0 / (x * pow(x, (-1) * (n + 1)));
        }
    }

    public static void main(String[] args) {
        Bag_New bag = new Bag_New(5, new Bag_New.Item(1, 6), new Bag_New.Item(3, 12), new Bag_New.Item(2, 10), new Bag_New.Item(3, 15));
        System.out.println(bag.getBag());

        System.out.println(pow(2, -3));
        System.out.println(pow(10, 2));
    }
}
