/*
 * Copyright (c) 2017. Phasmid Software
 */

package edu.neu.coe.huskySort.sort.simple;
import edu.neu.coe.huskySort.sort.ComparisonSortHelper;
import edu.neu.coe.huskySort.sort.HelperFactory;
import edu.neu.coe.huskySort.sort.Sort;
import edu.neu.coe.huskySort.util.*;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

@SuppressWarnings("ALL")
public class MergeSortBasicTestReadings {

    @Test
    public void testSort200() throws Exception {
        int N = 200;
        final ComparisonSortHelper<Integer> helper1 = HelperFactory.create("merge sort", N, ConfigTest.setupConfig("true", "0", "1", "", ""));
        int hit = 0;
        for(int i=0; i<1000;i++) {
            final Integer[] xs = helper1.random(Integer.class, r -> r.nextInt(10000));

            new InsertionSort<Integer>(helper1).mutatingSort(xs);
            helper1.postProcess(xs);
            final ComparisonSortHelper<Integer> helper2 = HelperFactory.create("merge sort", N, ConfigTest.setupConfig("true", "", "0", "1", ""));
            Sort<Integer> mergeSort = new MergeSortBasic<>(helper2);
            mergeSort.init(N);
            helper2.preProcess(xs);
            Integer[] ys = mergeSort.sort(xs);
            helper2.postProcess(ys);
            Instrumenter instrumenter2 = helper2.getInstrumenter();
            final PrivateMethodInvoker privateMethodInvoker2 = new PrivateMethodInvoker(instrumenter2);
            final StatPack statPack2 = (StatPack) privateMethodInvoker2.invokePrivate("getStatPack");
            final int hits = (int) statPack2.getStatistics(Instrumenter.HITS).mean();
            hit += hits;
        }
        System.out.println("For N = "+N+",No of hits : "+hit/1000);
    }

    @Test
    public void testSort400() throws Exception {
        int N = 400;
        final ComparisonSortHelper<Integer> helper1 = HelperFactory.create("merge sort", N, ConfigTest.setupConfig("true", "0", "1", "", ""));
        int hit = 0;
        for(int i=0; i<1000;i++) {
            final Integer[] xs = helper1.random(Integer.class, r -> r.nextInt(10000));

            new InsertionSort<Integer>(helper1).mutatingSort(xs);
            helper1.postProcess(xs);
            final ComparisonSortHelper<Integer> helper2 = HelperFactory.create("merge sort", N, ConfigTest.setupConfig("true", "", "0", "1", ""));
            Sort<Integer> mergeSort = new MergeSortBasic<>(helper2);
            mergeSort.init(N);
            helper2.preProcess(xs);
            Integer[] ys = mergeSort.sort(xs);
            helper2.postProcess(ys);
            Instrumenter instrumenter2 = helper2.getInstrumenter();
            final PrivateMethodInvoker privateMethodInvoker2 = new PrivateMethodInvoker(instrumenter2);
            final StatPack statPack2 = (StatPack) privateMethodInvoker2.invokePrivate("getStatPack");
            final int hits = (int) statPack2.getStatistics(Instrumenter.HITS).mean();
            hit += hits;
        }
        System.out.println("For N = "+N+",No of hits : "+hit/1000);
    }

    @Test
    public void testSort800() throws Exception {
        int N = 800;
        final ComparisonSortHelper<Integer> helper1 = HelperFactory.create("merge sort", N, ConfigTest.setupConfig("true", "0", "1", "", ""));
        int hit = 0;
        for(int i=0; i<1000;i++) {
            final Integer[] xs = helper1.random(Integer.class, r -> r.nextInt(10000));

            new InsertionSort<Integer>(helper1).mutatingSort(xs);
            helper1.postProcess(xs);
            final ComparisonSortHelper<Integer> helper2 = HelperFactory.create("merge sort", N, ConfigTest.setupConfig("true", "", "0", "1", ""));
            Sort<Integer> mergeSort = new MergeSortBasic<>(helper2);
            mergeSort.init(N);
            helper2.preProcess(xs);
            Integer[] ys = mergeSort.sort(xs);
            helper2.postProcess(ys);
            Instrumenter instrumenter2 = helper2.getInstrumenter();
            final PrivateMethodInvoker privateMethodInvoker2 = new PrivateMethodInvoker(instrumenter2);
            final StatPack statPack2 = (StatPack) privateMethodInvoker2.invokePrivate("getStatPack");
            final int hits = (int) statPack2.getStatistics(Instrumenter.HITS).mean();
            hit += hits;
        }
        System.out.println("For N = "+N+",No of hits : "+hit/1000);
    }

    @Test
    public void testSort1600() throws Exception {
        int N = 1600;
        final ComparisonSortHelper<Integer> helper1 = HelperFactory.create("merge sort", N, ConfigTest.setupConfig("true", "0", "1", "", ""));
        int hit = 0;
        for(int i=0; i<1000;i++) {
            final Integer[] xs = helper1.random(Integer.class, r -> r.nextInt(10000));

            new InsertionSort<Integer>(helper1).mutatingSort(xs);
            helper1.postProcess(xs);
            final ComparisonSortHelper<Integer> helper2 = HelperFactory.create("merge sort", N, ConfigTest.setupConfig("true", "", "0", "1", ""));
            Sort<Integer> mergeSort = new MergeSortBasic<>(helper2);
            mergeSort.init(N);
            helper2.preProcess(xs);
            Integer[] ys = mergeSort.sort(xs);
            helper2.postProcess(ys);
            Instrumenter instrumenter2 = helper2.getInstrumenter();
            final PrivateMethodInvoker privateMethodInvoker2 = new PrivateMethodInvoker(instrumenter2);
            final StatPack statPack2 = (StatPack) privateMethodInvoker2.invokePrivate("getStatPack");
            final int hits = (int) statPack2.getStatistics(Instrumenter.HITS).mean();
            hit += hits;
        }
        System.out.println("For N = "+N+",No of hits : "+hit/1000);
    }


    @Test
    public void testSort3200() throws Exception {
        int N = 3200;
        final ComparisonSortHelper<Integer> helper1 = HelperFactory.create("merge sort", N, ConfigTest.setupConfig("true", "0", "1", "", ""));
        int hit = 0;
        for(int i=0; i<1000;i++) {
            final Integer[] xs = helper1.random(Integer.class, r -> r.nextInt(10000));

            new InsertionSort<Integer>(helper1).mutatingSort(xs);
            helper1.postProcess(xs);
            final ComparisonSortHelper<Integer> helper2 = HelperFactory.create("merge sort", N, ConfigTest.setupConfig("true", "", "0", "1", ""));
            Sort<Integer> mergeSort = new MergeSortBasic<>(helper2);
            mergeSort.init(N);
            helper2.preProcess(xs);
            Integer[] ys = mergeSort.sort(xs);
            helper2.postProcess(ys);
            Instrumenter instrumenter2 = helper2.getInstrumenter();
            final PrivateMethodInvoker privateMethodInvoker2 = new PrivateMethodInvoker(instrumenter2);
            final StatPack statPack2 = (StatPack) privateMethodInvoker2.invokePrivate("getStatPack");
            final int hits = (int) statPack2.getStatistics(Instrumenter.HITS).mean();
            hit += hits;
        }
        System.out.println("For N = "+N+",No of hits : "+hit/1000);
    }

    @Test
    public void testSort6400() throws Exception {
        int N = 6400;
        final ComparisonSortHelper<Integer> helper1 = HelperFactory.create("merge sort", N, ConfigTest.setupConfig("true", "0", "1", "", ""));
        int hit = 0;
        for(int i=0; i<1000;i++) {
            final Integer[] xs = helper1.random(Integer.class, r -> r.nextInt(10000));

            new InsertionSort<Integer>(helper1).mutatingSort(xs);
            helper1.postProcess(xs);
            final ComparisonSortHelper<Integer> helper2 = HelperFactory.create("merge sort", N, ConfigTest.setupConfig("true", "", "0", "1", ""));
            Sort<Integer> mergeSort = new MergeSortBasic<>(helper2);
            mergeSort.init(N);
            helper2.preProcess(xs);
            Integer[] ys = mergeSort.sort(xs);
            helper2.postProcess(ys);
            Instrumenter instrumenter2 = helper2.getInstrumenter();
            final PrivateMethodInvoker privateMethodInvoker2 = new PrivateMethodInvoker(instrumenter2);
            final StatPack statPack2 = (StatPack) privateMethodInvoker2.invokePrivate("getStatPack");
            final int hits = (int) statPack2.getStatistics(Instrumenter.HITS).mean();
            hit += hits;
        }
        System.out.println("For N = "+N+",No of hits : "+hit/1000);
    }


    @Test
    public void testSort12800() throws Exception {
        int N = 12800;
        final ComparisonSortHelper<Integer> helper1 = HelperFactory.create("merge sort", N, ConfigTest.setupConfig("true", "0", "1", "", ""));
        int hit = 0;
        for(int i=0; i<1000;i++) {
            final Integer[] xs = helper1.random(Integer.class, r -> r.nextInt(10000));

            new InsertionSort<Integer>(helper1).mutatingSort(xs);
            helper1.postProcess(xs);
            final ComparisonSortHelper<Integer> helper2 = HelperFactory.create("merge sort", N, ConfigTest.setupConfig("true", "", "0", "1", ""));
            Sort<Integer> mergeSort = new MergeSortBasic<>(helper2);
            mergeSort.init(N);
            helper2.preProcess(xs);
            Integer[] ys = mergeSort.sort(xs);
            helper2.postProcess(ys);
            Instrumenter instrumenter2 = helper2.getInstrumenter();
            final PrivateMethodInvoker privateMethodInvoker2 = new PrivateMethodInvoker(instrumenter2);
            final StatPack statPack2 = (StatPack) privateMethodInvoker2.invokePrivate("getStatPack");
            final int hits = (int) statPack2.getStatistics(Instrumenter.HITS).mean();
            hit += hits;
        }
        System.out.println("For N = "+N+",No of hits : "+hit/1000);
    }


    @Test
    public void testSort25600() throws Exception {
        int N = 25600;
        final ComparisonSortHelper<Integer> helper1 = HelperFactory.create("merge sort", N, ConfigTest.setupConfig("true", "0", "1", "", ""));
            final Integer[] xs = helper1.random(Integer.class, r -> r.nextInt(10000));
            final ComparisonSortHelper<Integer> helper2 = HelperFactory.create("merge sort", N, ConfigTest.setupConfig("true", "", "0", "1", ""));
            Sort<Integer> mergeSort = new MergeSortBasic<>(helper2);
            mergeSort.init(N);
            helper2.preProcess(xs);
            Integer[] ys = mergeSort.sort(xs);
            helper2.postProcess(ys);
            Instrumenter instrumenter2 = helper2.getInstrumenter();
            final PrivateMethodInvoker privateMethodInvoker2 = new PrivateMethodInvoker(instrumenter2);
            final StatPack statPack2 = (StatPack) privateMethodInvoker2.invokePrivate("getStatPack");
            final int hits = (int) statPack2.getStatistics(Instrumenter.HITS).mean();
        System.out.println("For N = "+N+",No of hits : "+hits);
    }


    @Test
    public void testSort51200() throws Exception {
        int N = 51200;
        final ComparisonSortHelper<Integer> helper1 = HelperFactory.create("merge sort", N, ConfigTest.setupConfig("true", "0", "1", "", ""));
            final Integer[] xs = helper1.random(Integer.class, r -> r.nextInt(10000));
            final ComparisonSortHelper<Integer> helper2 = HelperFactory.create("merge sort", N, ConfigTest.setupConfig("true", "", "0", "1", ""));
            Sort<Integer> mergeSort = new MergeSortBasic<>(helper2);
            mergeSort.init(N);
            helper2.preProcess(xs);
            Integer[] ys = mergeSort.sort(xs);
            helper2.postProcess(ys);
            Instrumenter instrumenter2 = helper2.getInstrumenter();
            final PrivateMethodInvoker privateMethodInvoker2 = new PrivateMethodInvoker(instrumenter2);
            final StatPack statPack2 = (StatPack) privateMethodInvoker2.invokePrivate("getStatPack");
            final int hits = (int) statPack2.getStatistics(Instrumenter.HITS).mean();
        System.out.println("For N = "+N+",No of hits : "+hits);
    }





    @BeforeClass
    public static void beforeClass() throws IOException {
        config = Config.load(MergeSortBasicTestReadings.class);
    }

    private static Config config;
}