package ru.gb.ads_lesson5;

public class Bag_New {
    private int size;
    private Item[] items;

    public Bag_New(int size, Item ... items) {
        this.size = size;
        this.items = items;
    }

    public int getBag(){
        return getBag(items.length - 1, size);
    }

    private int getBag(int i, int m){
        if (i < 0) return 0;
        if (items[i].weight > m)
            return getBag(i-1, m);
        else {
            return Math.max(getBag(i - 1, m), getBag(i - 1, m - items[i].weight) + items[i].price);
        }
    }

    public static class Item{
        private int weight;
        private int price;

        public Item(int weight, int cost) {
            this.weight = weight;
            this.price = cost;
        }
    }
}
