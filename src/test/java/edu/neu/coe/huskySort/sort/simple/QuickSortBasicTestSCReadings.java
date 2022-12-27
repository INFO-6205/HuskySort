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
public class QuickSortBasicTestSCReadings {


    @Test
    public void testSortDetailedRandom160000() throws Exception {
        int N = 160000;
        final Config config = ConfigTest.setupConfig("true", "", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("quick sort basic", N, config);
        SortWithHelper<Integer> s = new QuickSort_Basic<>(helper);
        s.init(N);
        long compare = 0;
        long swap = 0;
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
            swap += (long)swaps;
            compare += (long)compares;
        }
        System.out.println("For N: "+ N+ ", Compares : "+compare/1000+" Swaps : "+swap/1000+ " and compare to swap Ratio : "+compare * 1.0 / swap);
    }

    @Test
    public void testSortDetailedRandom80000() throws Exception {
        int N = 80000;
        final Config config = ConfigTest.setupConfig("true", "", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("quick sort basic", N, config);
        SortWithHelper<Integer> s = new QuickSort_Basic<>(helper);
        s.init(N);
        long compare = 0;
        long swap = 0;
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
            swap += (long)swaps;
            compare += (long)compares;
        }
        System.out.println("For N: "+ N+ ", Compares : "+compare/1000+" Swaps : "+swap/1000+ " and compare to swap Ratio : "+compare * 1.0 / swap);
    }

    @Test
    public void testSortDetailedRandom40000() throws Exception {
        int N = 40000;
        final Config config = ConfigTest.setupConfig("true", "", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("quick sort basic", N, config);
        SortWithHelper<Integer> s = new QuickSort_Basic<>(helper);
        s.init(N);
        long compare = 0;
        long swap = 0;
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
            swap += (long)swaps;
            compare += (long)compares;
        }
        System.out.println("For N: "+ N+ ", Compares : "+compare/1000+" Swaps : "+swap/1000+ " and compare to swap Ratio : "+compare * 1.0 / swap);
    }


    @Test
    public void testSortDetailedRandom20000() throws Exception {
        int N = 20000;
        final Config config = ConfigTest.setupConfig("true", "", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("quick sort basic", N, config);
        SortWithHelper<Integer> s = new QuickSort_Basic<>(helper);
        s.init(N);
        long compare = 0;
        long swap = 0;
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
            swap += (long)swaps;
            compare += (long)compares;
        }
        System.out.println("For N: "+ N+ ", Compares : "+compare/1000+" Swaps : "+swap/1000+ " and compare to swap Ratio : "+compare * 1.0 / swap);
    }

    @Test
    public void testSortDetailedRandom15000() throws Exception {
        int N = 15000;
        final Config config = ConfigTest.setupConfig("true", "", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("quick sort basic", N, config);
        SortWithHelper<Integer> s = new QuickSort_Basic<>(helper);
        s.init(N);
        long compare = 0;
        long swap = 0;
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
            swap += (long)swaps;
            compare += (long)compares;
        }
        System.out.println("For N: "+ N+ ", Compares : "+compare/1000+" Swaps : "+swap/1000+ " and compare to swap Ratio : "+compare * 1.0 / swap);
    }


    @Test
    public void testSortDetailedRandom12800() throws Exception {
        int N = 12800;
        final Config config = ConfigTest.setupConfig("true", "", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("quick sort basic", N, config);
        SortWithHelper<Integer> s = new QuickSort_Basic<>(helper);
        s.init(N);
        long compare = 0;
        long swap = 0;
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
            swap += (long)swaps;
            compare += (long)compares;
        }
        System.out.println("For N: "+ N+ ", Compares : "+compare/1000+" Swaps : "+swap/1000+ " and compare to swap Ratio : "+compare * 1.0 / swap);
    }

    @Test
    public void testSortDetailedRandom10000() throws Exception {
        int N = 10000;
        final Config config = ConfigTest.setupConfig("true", "", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("quick sort basic", N, config);
        SortWithHelper<Integer> s = new QuickSort_Basic<>(helper);
        s.init(N);
        long compare = 0;
        long swap = 0;
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
            swap += (long)swaps;
            compare += (long)compares;
        }
        System.out.println("For N: "+ N+ ", Compares : "+compare/1000+" Swaps : "+swap/1000+ " and compare to swap Ratio : "+compare * 1.0 / swap);
    }

    @Test
    public void testSortDetailedRandom6400() throws Exception {
        int N = 6400;
        final Config config = ConfigTest.setupConfig("true", "", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("quick sort basic", N, config);
        SortWithHelper<Integer> s = new QuickSort_Basic<>(helper);
        s.init(N);
        long compare = 0;
        long swap = 0;
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
            swap += (long)swaps;
            compare += (long)compares;
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
        long compare = 0;
        long swap = 0;
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
            swap += (long)swaps;
            compare += (long)compares;
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
        long compare = 0;
        long swap = 0;
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
            swap += (long)swaps;
            compare += (long)compares;
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
        long compare = 0;
        long swap = 0;
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
            swap += (long)swaps;
            compare += (long)compares;
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
        long compare = 0;
        long swap = 0;
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
            swap += (long)swaps;
            compare += (long)compares;
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
        long compare = 0;
        long swap = 0;
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
            swap += (long)swaps;
            compare += (long)compares;
        }
        System.out.println("For N: "+ N+ ", Compares : "+compare/1000+" Swaps : "+swap/1000+ " and compare to swap Ratio : "+compare * 1.0 / swap);
    }

    @Test
    public void testSortDetailedRandom100() throws Exception {
        int N = 100;
        final Config config = ConfigTest.setupConfig("true", "", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("quick sort basic", N, config);
        SortWithHelper<Integer> s = new QuickSort_Basic<>(helper);
        s.init(N);
        long compare = 0;
        long swap = 0;
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
            swap += (long)swaps;
            compare += (long)compares;
        }
        System.out.println("For N: "+ N+ ", Compares : "+compare/1000+" Swaps : "+swap/1000+ " and compare to swap Ratio : "+compare * 1.0 / swap);
    }

    @Test
    public void testSortDetailedRandom50() throws Exception {
        int N = 50;
        final Config config = ConfigTest.setupConfig("true", "", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("quick sort basic", N, config);
        SortWithHelper<Integer> s = new QuickSort_Basic<>(helper);
        s.init(N);
        long compare = 0;
        long swap = 0;
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
            swap += (long)swaps;
            compare += (long)compares;
        }
        System.out.println("For N: "+ N+ ", Compares : "+compare/1000+" Swaps : "+swap/1000+ " and compare to swap Ratio : "+compare * 1.0 / swap);
    }

    @Test
    public void testSortDetailedRandom25() throws Exception {
        int N = 25;
        final Config config = ConfigTest.setupConfig("true", "", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("quick sort basic", N, config);
        SortWithHelper<Integer> s = new QuickSort_Basic<>(helper);
        s.init(N);
        long compare = 0;
        long swap = 0;
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
            swap += (long)swaps;
            compare += (long)compares;
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