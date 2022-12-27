package edu.neu.coe.huskySort.sort.timer;

import com.google.common.collect.Lists;
import edu.neu.coe.huskySort.sort.ComparableSortHelper;
import edu.neu.coe.huskySort.sort.HelperFactory;
import edu.neu.coe.huskySort.sort.simple.QuickSort_Basic;
import edu.neu.coe.huskySort.util.Benchmark;
import edu.neu.coe.huskySort.util.Config;
import edu.neu.coe.huskySort.util.ConfigTest;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class QuickSort_BasicTimer {
    private static final int REPETITIONS = 1000;
    private static final int MIN = -1000;
    private static final int MAX = 1000;
    private static final Random RANDOM = new Random();

    private static Integer[] generateRandomNumberArray(int n) {
        Integer[] randomNumbers = new Integer[n];
        for (int i = 0; i < n; i++) {
            randomNumbers[i] = RANDOM.nextInt(MAX + 1 - MIN) + MIN;
        }
        return randomNumbers;
    }

    public static void calculateTime(final String text, final Integer[] input){
        int N = input.length;
        final Config config = ConfigTest.setupConfig("true", "0", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("Quick Sort", N, config);
        QuickSort_Basic<Integer> s = new QuickSort_Basic<>(helper);
        s.init(N);
        Consumer<Integer[]> re = s::sort;
        final Supplier<Integer[]> supplier = () -> Arrays.copyOf(input, input.length);
        final Benchmark<Integer[]> benchmark_timer = new Benchmark<>("Quick Sort", re);
        final double meanOfArrayInMillis = benchmark_timer.run(supplier, REPETITIONS);
        System.out.println(text + " | mean sort time (in ms): " + meanOfArrayInMillis);
    }

    public static void main(String[] args) {
        final List<Integer[]> randomNumbersList = Lists.newArrayList(
                generateRandomNumberArray(200),
                generateRandomNumberArray(400),
                generateRandomNumberArray(800),
                generateRandomNumberArray(1600),
                generateRandomNumberArray(3200),
                generateRandomNumberArray(6400),
                generateRandomNumberArray(12800),
                generateRandomNumberArray(25600),
                generateRandomNumberArray(51200)
        );

        for(Integer[] randomNumbers : randomNumbersList) {
            System.out.println("----------------------------------");
            System.out.println("Number of elements: " + randomNumbers.length);
            calculateTime("Randomly Ordered", randomNumbers);
            System.out.println("----------------------------------");
        }
    }
}