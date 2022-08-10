/*
 * Copyright (c) 2017. Phasmid Software
 */

package edu.neu.coe.huskySort.sort.simple;

import edu.neu.coe.huskySort.sort.ComparableSortHelper;
import edu.neu.coe.huskySort.sort.HelperFactory;
import edu.neu.coe.huskySort.sort.SortWithHelper;
import edu.neu.coe.huskySort.util.*;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

@SuppressWarnings("ALL")
public class QuickSortBasicTestHitsReadings {


    @Test
    public void testSortDetailedRandom51200() throws Exception {
        int N = 51200;
        final Config config = ConfigTest.setupConfig("true", "", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("quick sort basic", N, config);
        SortWithHelper<Integer> s = new QuickSort_Basic<>(helper);
        s.init(N);

            final Integer[] xs = helper.random(Integer.class, r -> r.nextInt(999999999));
            helper.preProcess(xs);
            Integer[] ys = s.sort(xs);
            assertTrue(helper.sorted(ys));
            helper.postProcess(ys);
            final PrivateMethodInvoker privateMethodTester = new PrivateMethodInvoker(helper);
            final StatPack statPack = (StatPack) privateMethodTester.invokePrivate("getStatPack");
            final int compares = (int) statPack.getStatistics(Instrumenter.COMPARES).mean();
            final int swaps = (int) statPack.getStatistics(Instrumenter.SWAPS).mean();
            final int hits = (int) statPack.getStatistics(Instrumenter.HITS).mean();

        System.out.println("For N: "+ N+ ", hits : "+hits);
    }

    @Test
    public void testSortDetailedRandom25600() throws Exception {
        int N = 25600;
        final Config config = ConfigTest.setupConfig("true", "", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("quick sort basic", N, config);
        SortWithHelper<Integer> s = new QuickSort_Basic<>(helper);
        s.init(N);

            final Integer[] xs = helper.random(Integer.class, r -> r.nextInt(999999999));
            helper.preProcess(xs);
            Integer[] ys = s.sort(xs);
            assertTrue(helper.sorted(ys));
            helper.postProcess(ys);
            final PrivateMethodInvoker privateMethodTester = new PrivateMethodInvoker(helper);
            final StatPack statPack = (StatPack) privateMethodTester.invokePrivate("getStatPack");
            final int compares = (int) statPack.getStatistics(Instrumenter.COMPARES).mean();
            final int swaps = (int) statPack.getStatistics(Instrumenter.SWAPS).mean();
            final int hits = (int) statPack.getStatistics(Instrumenter.HITS).mean();

        System.out.println("For N: "+ N+ ", Compares : "+hits);
    }



    @Test
    public void testSortDetailedRandom12800() throws Exception {
        int N = 12800;
        final Config config = ConfigTest.setupConfig("true", "", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("quick sort basic", N, config);
        SortWithHelper<Integer> s = new QuickSort_Basic<>(helper);
        s.init(N);

            final Integer[] xs = helper.random(Integer.class, r -> r.nextInt(999999999));
            helper.preProcess(xs);
            Integer[] ys = s.sort(xs);
            assertTrue(helper.sorted(ys));
            helper.postProcess(ys);
            final PrivateMethodInvoker privateMethodTester = new PrivateMethodInvoker(helper);
            final StatPack statPack = (StatPack) privateMethodTester.invokePrivate("getStatPack");
            final int compares = (int) statPack.getStatistics(Instrumenter.COMPARES).mean();
            final int swaps = (int) statPack.getStatistics(Instrumenter.SWAPS).mean();
            final int hits = (int) statPack.getStatistics(Instrumenter.HITS).mean();

        System.out.println("For N: "+ N+ ", hits : "+hits);
    }


    @Test
    public void testSortDetailedRandom6400() throws Exception {
        int N = 6400;
        final Config config = ConfigTest.setupConfig("true", "", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("quick sort basic", N, config);
        SortWithHelper<Integer> s = new QuickSort_Basic<>(helper);
        s.init(N);
        int compare = 0;
        int swap = 0;
        for(int i= 0; i< 1000; i++) {
            final Integer[] xs = helper.random(Integer.class, r -> r.nextInt(999999999));
            helper.preProcess(xs);
            Integer[] ys = s.sort(xs);
            assertTrue(helper.sorted(ys));
            helper.postProcess(ys);
            final PrivateMethodInvoker privateMethodTester = new PrivateMethodInvoker(helper);
            final StatPack statPack = (StatPack) privateMethodTester.invokePrivate("getStatPack");
            final int compares = (int) statPack.getStatistics(Instrumenter.COMPARES).mean();
            final int swaps = (int) statPack.getStatistics(Instrumenter.SWAPS).mean();
            final int hits = (int) statPack.getStatistics(Instrumenter.HITS).mean();
            swap += swaps;
            compare += compares;
        }
        System.out.println("For N: "+ N+ ", Compares : "+compare/1000+" Swaps : "+swap/1000+ " and compare to swap Ratio : "+compare * 1.0 / swap);
    }

    @Test
    public void testSortDetailedRandom3200() throws Exception {
        int N = 3200;
        final Config config = ConfigTest.setupConfig("true", "", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("quick sort basic", N, config);
        SortWithHelper<Integer> s = new QuickSort_Basic<>(helper);
        s.init(N);
        int compare = 0;
        int swap = 0;
        for(int i= 0; i< 1000; i++) {
            final Integer[] xs = helper.random(Integer.class, r -> r.nextInt(999999999));
            helper.preProcess(xs);
            Integer[] ys = s.sort(xs);
            assertTrue(helper.sorted(ys));
            helper.postProcess(ys);
            final PrivateMethodInvoker privateMethodTester = new PrivateMethodInvoker(helper);
            final StatPack statPack = (StatPack) privateMethodTester.invokePrivate("getStatPack");
            final int compares = (int) statPack.getStatistics(Instrumenter.COMPARES).mean();
            final int swaps = (int) statPack.getStatistics(Instrumenter.SWAPS).mean();
            final int hits = (int) statPack.getStatistics(Instrumenter.HITS).mean();
            swap += swaps;
            compare += compares;
        }
        System.out.println("For N: "+ N+ ", Compares : "+compare/1000+" Swaps : "+swap/1000+ " and compare to swap Ratio : "+compare * 1.0 / swap);
    }

    @Test
    public void testSortDetailedRandom1600() throws Exception {
        int N = 1600;
        final Config config = ConfigTest.setupConfig("true", "", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("quick sort basic", N, config);
        SortWithHelper<Integer> s = new QuickSort_Basic<>(helper);
        s.init(N);
        int compare = 0;
        int swap = 0;
        for(int i= 0; i< 1000; i++) {
            final Integer[] xs = helper.random(Integer.class, r -> r.nextInt(999999999));
            helper.preProcess(xs);
            Integer[] ys = s.sort(xs);
            assertTrue(helper.sorted(ys));
            helper.postProcess(ys);
            final PrivateMethodInvoker privateMethodTester = new PrivateMethodInvoker(helper);
            final StatPack statPack = (StatPack) privateMethodTester.invokePrivate("getStatPack");
            final int compares = (int) statPack.getStatistics(Instrumenter.COMPARES).mean();
            final int swaps = (int) statPack.getStatistics(Instrumenter.SWAPS).mean();
            final int hits = (int) statPack.getStatistics(Instrumenter.HITS).mean();
            swap += swaps;
            compare += compares;
        }
        System.out.println("For N: "+ N+ ", Compares : "+compare/1000+" Swaps : "+swap/1000+ " and compare to swap Ratio : "+compare * 1.0 / swap);
    }

    @Test
    public void testSortDetailedRandom800() throws Exception {
        int N = 800;
        final Config config = ConfigTest.setupConfig("true", "", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("quick sort basic", N, config);
        SortWithHelper<Integer> s = new QuickSort_Basic<>(helper);
        s.init(N);
        int compare = 0;
        int swap = 0;
        for(int i= 0; i< 1000; i++) {
            final Integer[] xs = helper.random(Integer.class, r -> r.nextInt(999999999));
            helper.preProcess(xs);
            Integer[] ys = s.sort(xs);
            assertTrue(helper.sorted(ys));
            helper.postProcess(ys);
            final PrivateMethodInvoker privateMethodTester = new PrivateMethodInvoker(helper);
            final StatPack statPack = (StatPack) privateMethodTester.invokePrivate("getStatPack");
            final int compares = (int) statPack.getStatistics(Instrumenter.COMPARES).mean();
            final int swaps = (int) statPack.getStatistics(Instrumenter.SWAPS).mean();
            final int hits = (int) statPack.getStatistics(Instrumenter.HITS).mean();
            swap += swaps;
            compare += compares;
        }
        System.out.println("For N: "+ N+ ", Compares : "+compare/1000+" Swaps : "+swap/1000+ " and compare to swap Ratio : "+compare * 1.0 / swap);
    }

    @Test
    public void testSortDetailedRandom400() throws Exception {
        int N = 400;
        final Config config = ConfigTest.setupConfig("true", "", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("quick sort basic", N, config);
        SortWithHelper<Integer> s = new QuickSort_Basic<>(helper);
        s.init(N);
        int compare = 0;
        int swap = 0;
        for(int i= 0; i< 1000; i++) {
            final Integer[] xs = helper.random(Integer.class, r -> r.nextInt(999999999));
            helper.preProcess(xs);
            Integer[] ys = s.sort(xs);
            assertTrue(helper.sorted(ys));
            helper.postProcess(ys);
            final PrivateMethodInvoker privateMethodTester = new PrivateMethodInvoker(helper);
            final StatPack statPack = (StatPack) privateMethodTester.invokePrivate("getStatPack");
            final int compares = (int) statPack.getStatistics(Instrumenter.COMPARES).mean();
            final int swaps = (int) statPack.getStatistics(Instrumenter.SWAPS).mean();
            final int hits = (int) statPack.getStatistics(Instrumenter.HITS).mean();
            swap += swaps;
            compare += compares;
        }
        System.out.println("For N: "+ N+ ", Compares : "+compare/1000+" Swaps : "+swap/1000+ " and compare to swap Ratio : "+compare * 1.0 / swap);
    }

    @Test
    public void testSortDetailedRandom200() throws Exception {
        int N = 200;
        final Config config = ConfigTest.setupConfig("true", "", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("quick sort basic", N, config);
        SortWithHelper<Integer> s = new QuickSort_Basic<>(helper);
        s.init(N);
        int compare = 0;
        int swap = 0;
        for(int i= 0; i< 1000; i++) {
            final Integer[] xs = helper.random(Integer.class, r -> r.nextInt(999999999));
            helper.preProcess(xs);
            Integer[] ys = s.sort(xs);
            assertTrue(helper.sorted(ys));
            helper.postProcess(ys);
            final PrivateMethodInvoker privateMethodTester = new PrivateMethodInvoker(helper);
            final StatPack statPack = (StatPack) privateMethodTester.invokePrivate("getStatPack");
            final int compares = (int) statPack.getStatistics(Instrumenter.COMPARES).mean();
            final int swaps = (int) statPack.getStatistics(Instrumenter.SWAPS).mean();
            final int hits = (int) statPack.getStatistics(Instrumenter.HITS).mean();
            swap += swaps;
            compare += compares;
        }
        System.out.println("For N: "+ N+ ", Compares : "+compare/1000+" Swaps : "+swap/1000+ " and compare to swap Ratio : "+compare * 1.0 / swap);
    }



    final static LazyLogger logger = new LazyLogger(QuickSort_Basic.class);

    @BeforeClass
    public static void beforeClass() throws IOException {
        config = Config.load();
    }

    private static Config config;

}