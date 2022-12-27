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

import static edu.neu.coe.huskySort.util.Utilities.round;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@SuppressWarnings("ALL")
public class QuickSort3WayTestReadings {


    @Test
    public void testSortDetailed200() throws Exception {
        int N = 200;
        // NOTE this depends on the cutoff value for quick sort.
        //int levels = k - 2;
        final Config config = ConfigTest.setupConfig("true", "0", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("merge sort", N, config);
        //   System.out.println(helper);
        SortWithHelper<Integer> s = new QuickSort_3way<>(helper);
        s.init(N);
        final Integer[] xs = helper.random(Integer.class, r -> r.nextInt(10000));
        assertEquals(Integer.valueOf(1360), xs[0]);
        helper.preProcess(xs);
        Integer[] ys = s.sort(xs);
        assertTrue(helper.sorted(ys));
        helper.postProcess(ys);
        final PrivateMethodInvoker privateMethodInvoker = new PrivateMethodInvoker(helper);
        final StatPack statPack = (StatPack) privateMethodInvoker.invokePrivate("getStatPack");
   //     System.out.println("For N : "+N+" "+statPack);
        final int compares = (int) statPack.getStatistics(Instrumenter.COMPARES).mean();
        final int inversions = (int) statPack.getStatistics(Instrumenter.INVERSIONS).mean();
        final int fixes = (int) statPack.getStatistics(Instrumenter.FIXES).mean();
        final int swaps = (int) statPack.getStatistics(Instrumenter.SWAPS).mean();
        final int copies = (int) statPack.getStatistics(Instrumenter.COPIES).mean();
        final int worstCompares = round(2.0 * N * Math.log(N));
        final int hits = (int) statPack.getStatistics(Instrumenter.HITS).mean();
        System.out.println("For N = "+N+",No of hits : "+hits);
        assertTrue(compares <= worstCompares);
        assertTrue(inversions <= fixes);
    }

    @Test
    public void testSortDetailed400() throws Exception {
        int N = 400;
        // NOTE this depends on the cutoff value for quick sort.
        //int levels = k - 2;
        final Config config = ConfigTest.setupConfig("true", "0", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("merge sort", N, config);
        //   System.out.println(helper);
        SortWithHelper<Integer> s = new QuickSort_3way<>(helper);
        s.init(N);
        final Integer[] xs = helper.random(Integer.class, r -> r.nextInt(10000));
        assertEquals(Integer.valueOf(1360), xs[0]);
        helper.preProcess(xs);
        Integer[] ys = s.sort(xs);
        assertTrue(helper.sorted(ys));
        helper.postProcess(ys);
        final PrivateMethodInvoker privateMethodInvoker = new PrivateMethodInvoker(helper);
        final StatPack statPack = (StatPack) privateMethodInvoker.invokePrivate("getStatPack");
    //    System.out.println("For N : "+N+" "+statPack);
        final int compares = (int) statPack.getStatistics(Instrumenter.COMPARES).mean();
        final int inversions = (int) statPack.getStatistics(Instrumenter.INVERSIONS).mean();
        final int fixes = (int) statPack.getStatistics(Instrumenter.FIXES).mean();
        final int swaps = (int) statPack.getStatistics(Instrumenter.SWAPS).mean();
        final int copies = (int) statPack.getStatistics(Instrumenter.COPIES).mean();
        final int worstCompares = round(2.0 * N * Math.log(N));
        final int hits = (int) statPack.getStatistics(Instrumenter.HITS).mean();
        System.out.println("For N = "+N+",No of hits : "+hits);
        assertTrue(compares <= worstCompares);
        assertTrue(inversions <= fixes);
    }



    @Test
    public void testSortDetailed800() throws Exception {
        int N = 800;
        // NOTE this depends on the cutoff value for quick sort.
        //int levels = k - 2;
        final Config config = ConfigTest.setupConfig("true", "0", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("merge sort", N, config);
        //   System.out.println(helper);
        SortWithHelper<Integer> s = new QuickSort_3way<>(helper);
        s.init(N);
        final Integer[] xs = helper.random(Integer.class, r -> r.nextInt(10000));
        assertEquals(Integer.valueOf(1360), xs[0]);
        helper.preProcess(xs);
        Integer[] ys = s.sort(xs);
        assertTrue(helper.sorted(ys));
        helper.postProcess(ys);
        final PrivateMethodInvoker privateMethodInvoker = new PrivateMethodInvoker(helper);
        final StatPack statPack = (StatPack) privateMethodInvoker.invokePrivate("getStatPack");
    //    System.out.println("For N : "+N+" "+statPack);
        final int compares = (int) statPack.getStatistics(Instrumenter.COMPARES).mean();
        final int inversions = (int) statPack.getStatistics(Instrumenter.INVERSIONS).mean();
        final int fixes = (int) statPack.getStatistics(Instrumenter.FIXES).mean();
        final int swaps = (int) statPack.getStatistics(Instrumenter.SWAPS).mean();
        final int copies = (int) statPack.getStatistics(Instrumenter.COPIES).mean();
        final int worstCompares = round(2.0 * N * Math.log(N));
        final int hits = (int) statPack.getStatistics(Instrumenter.HITS).mean();
        System.out.println("For N = "+N+",No of hits : "+hits);
        assertTrue(compares <= worstCompares);
        assertTrue(inversions <= fixes);
    }



    @Test
    public void testSortDetailed1600() throws Exception {
        int N = 1600;
        // NOTE this depends on the cutoff value for quick sort.
        //int levels = k - 2;
        final Config config = ConfigTest.setupConfig("true", "0", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("merge sort", N, config);
        //   System.out.println(helper);
        SortWithHelper<Integer> s = new QuickSort_3way<>(helper);
        s.init(N);
        final Integer[] xs = helper.random(Integer.class, r -> r.nextInt(10000));
        assertEquals(Integer.valueOf(1360), xs[0]);
        helper.preProcess(xs);
        Integer[] ys = s.sort(xs);
        assertTrue(helper.sorted(ys));
        helper.postProcess(ys);
        final PrivateMethodInvoker privateMethodInvoker = new PrivateMethodInvoker(helper);
        final StatPack statPack = (StatPack) privateMethodInvoker.invokePrivate("getStatPack");
   //     System.out.println("For N : "+N+" "+statPack);
        final int compares = (int) statPack.getStatistics(Instrumenter.COMPARES).mean();
        final int inversions = (int) statPack.getStatistics(Instrumenter.INVERSIONS).mean();
        final int fixes = (int) statPack.getStatistics(Instrumenter.FIXES).mean();
        final int swaps = (int) statPack.getStatistics(Instrumenter.SWAPS).mean();
        final int copies = (int) statPack.getStatistics(Instrumenter.COPIES).mean();
        final int worstCompares = round(2.0 * N * Math.log(N));
        final int hits = (int) statPack.getStatistics(Instrumenter.HITS).mean();
        System.out.println("For N = "+N+",No of hits : "+hits);
        assertTrue(compares <= worstCompares);
        assertTrue(inversions <= fixes);
    }


    @Test
    public void testSortDetailed3200() throws Exception {
        int N = 3200;
        // NOTE this depends on the cutoff value for quick sort.
        //int levels = k - 2;
        final Config config = ConfigTest.setupConfig("true", "0", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("merge sort", N, config);
        //   System.out.println(helper);
        SortWithHelper<Integer> s = new QuickSort_3way<>(helper);
        s.init(N);
        final Integer[] xs = helper.random(Integer.class, r -> r.nextInt(10000));
        assertEquals(Integer.valueOf(1360), xs[0]);
        helper.preProcess(xs);
        Integer[] ys = s.sort(xs);
        assertTrue(helper.sorted(ys));
        helper.postProcess(ys);
        final PrivateMethodInvoker privateMethodInvoker = new PrivateMethodInvoker(helper);
        final StatPack statPack = (StatPack) privateMethodInvoker.invokePrivate("getStatPack");
   //     System.out.println("For N : "+N+" "+statPack);
        final int compares = (int) statPack.getStatistics(Instrumenter.COMPARES).mean();
        final int inversions = (int) statPack.getStatistics(Instrumenter.INVERSIONS).mean();
        final int fixes = (int) statPack.getStatistics(Instrumenter.FIXES).mean();
        final int swaps = (int) statPack.getStatistics(Instrumenter.SWAPS).mean();
        final int copies = (int) statPack.getStatistics(Instrumenter.COPIES).mean();
        final int worstCompares = round(2.0 * N * Math.log(N));
        final int hits = (int) statPack.getStatistics(Instrumenter.HITS).mean();
        System.out.println("For N = "+N+",No of hits : "+hits);
        assertTrue(compares <= worstCompares);
        assertTrue(inversions <= fixes);
    }

    @Test
    public void testSortDetailed6400() throws Exception {
        int N = 6400;
        // NOTE this depends on the cutoff value for quick sort.
        //int levels = k - 2;
        final Config config = ConfigTest.setupConfig("true", "0", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("merge sort", N, config);
        //   System.out.println(helper);
        SortWithHelper<Integer> s = new QuickSort_3way<>(helper);
        s.init(N);
        final Integer[] xs = helper.random(Integer.class, r -> r.nextInt(10000));
        assertEquals(Integer.valueOf(1360), xs[0]);
        helper.preProcess(xs);
        Integer[] ys = s.sort(xs);
        assertTrue(helper.sorted(ys));
        helper.postProcess(ys);
        final PrivateMethodInvoker privateMethodInvoker = new PrivateMethodInvoker(helper);
        final StatPack statPack = (StatPack) privateMethodInvoker.invokePrivate("getStatPack");
  //      System.out.println("For N : "+N+" "+statPack);
        final int compares = (int) statPack.getStatistics(Instrumenter.COMPARES).mean();
        final int inversions = (int) statPack.getStatistics(Instrumenter.INVERSIONS).mean();
        final int fixes = (int) statPack.getStatistics(Instrumenter.FIXES).mean();
        final int swaps = (int) statPack.getStatistics(Instrumenter.SWAPS).mean();
        final int copies = (int) statPack.getStatistics(Instrumenter.COPIES).mean();
        final int worstCompares = round(2.0 * N * Math.log(N));
        final int hits = (int) statPack.getStatistics(Instrumenter.HITS).mean();
        System.out.println("For N = "+N+",No of hits : "+hits);
        assertTrue(compares <= worstCompares);
        assertTrue(inversions <= fixes);
    }


    @Test
    public void testSortDetailed12800() throws Exception {
        int N = 12800;
        // NOTE this depends on the cutoff value for quick sort.
        //int levels = k - 2;
        final Config config = ConfigTest.setupConfig("true", "0", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("merge sort", N, config);
        //   System.out.println(helper);
        SortWithHelper<Integer> s = new QuickSort_3way<>(helper);
        s.init(N);
        final Integer[] xs = helper.random(Integer.class, r -> r.nextInt(10000));
        assertEquals(Integer.valueOf(1360), xs[0]);
        helper.preProcess(xs);
        Integer[] ys = s.sort(xs);
        assertTrue(helper.sorted(ys));
        helper.postProcess(ys);
        final PrivateMethodInvoker privateMethodInvoker = new PrivateMethodInvoker(helper);
        final StatPack statPack = (StatPack) privateMethodInvoker.invokePrivate("getStatPack");
  //      System.out.println("For N : "+N+" "+statPack);
        final int compares = (int) statPack.getStatistics(Instrumenter.COMPARES).mean();
        final int inversions = (int) statPack.getStatistics(Instrumenter.INVERSIONS).mean();
        final int fixes = (int) statPack.getStatistics(Instrumenter.FIXES).mean();
        final int swaps = (int) statPack.getStatistics(Instrumenter.SWAPS).mean();
        final int copies = (int) statPack.getStatistics(Instrumenter.COPIES).mean();
        final int worstCompares = round(2.0 * N * Math.log(N));
        final int hits = (int) statPack.getStatistics(Instrumenter.HITS).mean();
        System.out.println("For N = "+N+",No of hits : "+hits);
        assertTrue(compares <= worstCompares);
        assertTrue(inversions <= fixes);
    }

    @Test
    public void testSortDetailed15000() throws Exception {
        int N = 15000;
        // NOTE this depends on the cutoff value for quick sort.
        //int levels = k - 2;
        final Config config = ConfigTest.setupConfig("true", "0", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("merge sort", N, config);
        //   System.out.println(helper);
        SortWithHelper<Integer> s = new QuickSort_3way<>(helper);
        s.init(N);
        final Integer[] xs = helper.random(Integer.class, r -> r.nextInt(10000));
        assertEquals(Integer.valueOf(1360), xs[0]);
        helper.preProcess(xs);
        Integer[] ys = s.sort(xs);
        assertTrue(helper.sorted(ys));
        helper.postProcess(ys);
        final PrivateMethodInvoker privateMethodInvoker = new PrivateMethodInvoker(helper);
        final StatPack statPack = (StatPack) privateMethodInvoker.invokePrivate("getStatPack");
 //       System.out.println("For N : "+N+" "+statPack);
        final int compares = (int) statPack.getStatistics(Instrumenter.COMPARES).mean();
        final int inversions = (int) statPack.getStatistics(Instrumenter.INVERSIONS).mean();
        final int fixes = (int) statPack.getStatistics(Instrumenter.FIXES).mean();
        final int swaps = (int) statPack.getStatistics(Instrumenter.SWAPS).mean();
        final int copies = (int) statPack.getStatistics(Instrumenter.COPIES).mean();
        final int worstCompares = round(2.0 * N * Math.log(N));
        final int hits = (int) statPack.getStatistics(Instrumenter.HITS).mean();
        System.out.println("For N = "+N+",No of hits : "+hits);
        assertTrue(compares <= worstCompares);
        assertTrue(inversions <= fixes);
    }


    @Test
    public void testSortDetailed20000() throws Exception {
        int N = 20000;
        // NOTE this depends on the cutoff value for quick sort.
        //int levels = k - 2;
        final Config config = ConfigTest.setupConfig("true", "0", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("merge sort", N, config);
        //   System.out.println(helper);
        SortWithHelper<Integer> s = new QuickSort_3way<>(helper);
        s.init(N);
        final Integer[] xs = helper.random(Integer.class, r -> r.nextInt(10000));
        assertEquals(Integer.valueOf(1360), xs[0]);
        helper.preProcess(xs);
        Integer[] ys = s.sort(xs);
        assertTrue(helper.sorted(ys));
        helper.postProcess(ys);
        final PrivateMethodInvoker privateMethodInvoker = new PrivateMethodInvoker(helper);
        final StatPack statPack = (StatPack) privateMethodInvoker.invokePrivate("getStatPack");
    //    System.out.println("For N : "+N+" "+statPack);
        final int compares = (int) statPack.getStatistics(Instrumenter.COMPARES).mean();
        final int inversions = (int) statPack.getStatistics(Instrumenter.INVERSIONS).mean();
        final int fixes = (int) statPack.getStatistics(Instrumenter.FIXES).mean();
        final int swaps = (int) statPack.getStatistics(Instrumenter.SWAPS).mean();
        final int copies = (int) statPack.getStatistics(Instrumenter.COPIES).mean();
        final int worstCompares = round(2.0 * N * Math.log(N));
        final int hits = (int) statPack.getStatistics(Instrumenter.HITS).mean();
        System.out.println("For N = "+N+",No of hits : "+hits);
        assertTrue(compares <= worstCompares);
        assertTrue(inversions <= fixes);
    }

    @Test
    public void testSortDetailed25600() throws Exception {
        int N = 25600;
        // NOTE this depends on the cutoff value for quick sort.
        //int levels = k - 2;
        final Config config = ConfigTest.setupConfig("true", "0", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("merge sort", N, config);
        //   System.out.println(helper);
        SortWithHelper<Integer> s = new QuickSort_3way<>(helper);
        s.init(N);
        final Integer[] xs = helper.random(Integer.class, r -> r.nextInt(10000));
        assertEquals(Integer.valueOf(1360), xs[0]);
        helper.preProcess(xs);
        Integer[] ys = s.sort(xs);
        assertTrue(helper.sorted(ys));
        helper.postProcess(ys);
        final PrivateMethodInvoker privateMethodInvoker = new PrivateMethodInvoker(helper);
        final StatPack statPack = (StatPack) privateMethodInvoker.invokePrivate("getStatPack");
        //    System.out.println("For N : "+N+" "+statPack);
        final int compares = (int) statPack.getStatistics(Instrumenter.COMPARES).mean();
        final int inversions = (int) statPack.getStatistics(Instrumenter.INVERSIONS).mean();
        final int fixes = (int) statPack.getStatistics(Instrumenter.FIXES).mean();
        final int swaps = (int) statPack.getStatistics(Instrumenter.SWAPS).mean();
        final int copies = (int) statPack.getStatistics(Instrumenter.COPIES).mean();
        final int worstCompares = round(2.0 * N * Math.log(N));
        final int hits = (int) statPack.getStatistics(Instrumenter.HITS).mean();
        System.out.println("For N = "+N+",No of hits : "+hits);
        assertTrue(compares <= worstCompares);
        assertTrue(inversions <= fixes);
    }

    @Test
    public void testSortDetailed51200() throws Exception {
        int N = 51200;
        // NOTE this depends on the cutoff value for quick sort.
        //int levels = k - 2;
        final Config config = ConfigTest.setupConfig("true", "0", "1", "", "");
        final ComparableSortHelper<Integer> helper = (ComparableSortHelper<Integer>) HelperFactory.create("merge sort", N, config);
        //   System.out.println(helper);
        SortWithHelper<Integer> s = new QuickSort_3way<>(helper);
        s.init(N);
        final Integer[] xs = helper.random(Integer.class, r -> r.nextInt(10000));
        assertEquals(Integer.valueOf(1360), xs[0]);
        helper.preProcess(xs);
        Integer[] ys = s.sort(xs);
        assertTrue(helper.sorted(ys));
        helper.postProcess(ys);
        final PrivateMethodInvoker privateMethodInvoker = new PrivateMethodInvoker(helper);
        final StatPack statPack = (StatPack) privateMethodInvoker.invokePrivate("getStatPack");
        //    System.out.println("For N : "+N+" "+statPack);
        final int compares = (int) statPack.getStatistics(Instrumenter.COMPARES).mean();
        final int inversions = (int) statPack.getStatistics(Instrumenter.INVERSIONS).mean();
        final int fixes = (int) statPack.getStatistics(Instrumenter.FIXES).mean();
        final int swaps = (int) statPack.getStatistics(Instrumenter.SWAPS).mean();
        final int copies = (int) statPack.getStatistics(Instrumenter.COPIES).mean();
        final int worstCompares = round(2.0 * N * Math.log(N));
        final int hits = (int) statPack.getStatistics(Instrumenter.HITS).mean();
        System.out.println("For N = "+N+",No of hits : "+hits);
        assertTrue(compares <= worstCompares);
        assertTrue(inversions <= fixes);
    }



    @BeforeClass
    public static void beforeClass() throws IOException {
        config = Config.load();
    }

    private static Config config;
}