package ru.netology;

import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    int min, max;

    public Randoms(int min, int max) {
        this.max = max;
        this.min = min;
        this.random = new Random();
    }

    @Override
    public Iterator iterator() {
        return new Iterator();
    }

    class Iterator implements java.util.Iterator<Integer> {

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return random.nextInt(max - min + 1) + min;
        }
    }
}