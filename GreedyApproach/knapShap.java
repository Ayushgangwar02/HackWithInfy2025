package GreedyApproach;

import java.util.*;

class Item {
    int value;
    int weight;

    Item(int v, int w) {
        this.value = v;
        this.weight = w;
    }
}

public class knapShap {
    public static void main(String args[]) {
        Item[] items = {
                new Item(60, 10),
                new Item(100, 20),
                new Item(120, 30)
        };

        int capacity = 50;
        Arrays.sort(items, (a, b) -> Double.compare((double) b.value / b.weight, (double) a.value / a.weight));

        double totalSum = 0;

        for (Item item : items) {
            if (item.weight <= capacity) {
                capacity -= item.weight;
                totalSum += item.value;
            } else {
                totalSum += item.value * (double) capacity / item.weight;
                break;
            }
        }
        System.out.println(totalSum);

    }
}
