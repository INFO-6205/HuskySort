/*
 * Copyright (c) 2017. Phasmid Software
 */

package edu.neu.coe.huskySort.sort.simple;

import edu.neu.coe.huskySort.sort.ComparisonSortHelper;
import edu.neu.coe.huskySort.sort.HelperFactory;
import edu.neu.coe.huskySort.sort.SortWithHelper;
import edu.neu.coe.huskySort.util.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@SuppressWarnings("ALL")
public class SelectionSortReadings {


    @Test
    public void sort200() throws Exception {
        final Config config = ConfigTest.setupConfig("true", "0", "1", "", "");
        int n = 200;
        ComparisonSortHelper<Integer> helper = HelperFactory.create("SelectionSort", n, config);
        helper.init(n);
        Instrumenter instrumenter = helper.getInstrumenter();
        final PrivateMethodInvoker privateMethodInvoker = new PrivateMethodInvoker(instrumenter);
        final StatPack statPack = (StatPack) privateMethodInvoker.invokePrivate("getStatPack");
        Integer[] xs = helper.random(Integer.class, r -> r.nextInt(1000));
        SortWithHelper<Integer> sorter = new SelectionSort<Integer>(helper);
        sorter.preProcess(xs);
        Integer[] ys = sorter.sort(xs);
        sorter.postProcess(ys);
        assertTrue(helper.sorted(ys));
        final int compares = (int) statPack.getStatistics(Instrumenter.COMPARES).mean();
        assertEquals(n * (n - 1) / 2, compares);
        final int inversions = (int) statPack.getStatistics(Instrumenter.INVERSIONS).mean();
        final int fixes = (int) statPack.getStatistics(Instrumenter.FIXES).mean();
        final int hits = (int) statPack.getStatistics(Instrumenter.HITS).mean();
        System.out.println("For N = "+n+",No of hits : "+hits);
    }

    @Test
    public void sort400() throws Exception {
        final Config config = ConfigTest.setupConfig("true", "0", "1", "", "");
        int n = 400;
        ComparisonSortHelper<Integer> helper = HelperFactory.create("SelectionSort", n, config);
        helper.init(n);
        Instrumenter instrumenter = helper.getInstrumenter();
        final PrivateMethodInvoker privateMethodInvoker = new PrivateMethodInvoker(instrumenter);
        final StatPack statPack = (StatPack) privateMethodInvoker.invokePrivate("getStatPack");
        Integer[] xs = helper.random(Integer.class, r -> r.nextInt(1000));
        SortWithHelper<Integer> sorter = new SelectionSort<Integer>(helper);
        sorter.preProcess(xs);
        Integer[] ys = sorter.sort(xs);
        sorter.postProcess(ys);
        assertTrue(helper.sorted(ys));
        final int compares = (int) statPack.getStatistics(Instrumenter.COMPARES).mean();
        assertEquals(n * (n - 1) / 2, compares);
        final int inversions = (int) statPack.getStatistics(Instrumenter.INVERSIONS).mean();
        final int fixes = (int) statPack.getStatistics(Instrumenter.FIXES).mean();
        final int hits = (int) statPack.getStatistics(Instrumenter.HITS).mean();
        System.out.println("For N = "+n+",No of hits : "+hits);
    }

    @Test
    public void sort800() throws Exception {
        final Config config = ConfigTest.setupConfig("true", "0", "1", "", "");
        int n = 800;
        ComparisonSortHelper<Integer> helper = HelperFactory.create("SelectionSort", n, config);
        helper.init(n);
        Instrumenter instrumenter = helper.getInstrumenter();
        final PrivateMethodInvoker privateMethodInvoker = new PrivateMethodInvoker(instrumenter);
        final StatPack statPack = (StatPack) privateMethodInvoker.invokePrivate("getStatPack");
        Integer[] xs = helper.random(Integer.class, r -> r.nextInt(1000));
        SortWithHelper<Integer> sorter = new SelectionSort<Integer>(helper);
        sorter.preProcess(xs);
        Integer[] ys = sorter.sort(xs);
        sorter.postProcess(ys);
        assertTrue(helper.sorted(ys));
        final int compares = (int) statPack.getStatistics(Instrumenter.COMPARES).mean();
        assertEquals(n * (n - 1) / 2, compares);
        final int inversions = (int) statPack.getStatistics(Instrumenter.INVERSIONS).mean();
        final int fixes = (int) statPack.getStatistics(Instrumenter.FIXES).mean();
        final int hits = (int) statPack.getStatistics(Instrumenter.HITS).mean();
        System.out.println("For N = "+n+",No of hits : "+hits);
    }

    @Test
    public void sort1600() throws Exception {
        final Config config = ConfigTest.setupConfig("true", "0", "1", "", "");
        int n = 1600;
        ComparisonSortHelper<Integer> helper = HelperFactory.create("SelectionSort", n, config);
        helper.init(n);
        Instrumenter instrumenter = helper.getInstrumenter();
        final PrivateMethodInvoker privateMethodInvoker = new PrivateMethodInvoker(instrumenter);
        final StatPack statPack = (StatPack) privateMethodInvoker.invokePrivate("getStatPack");
        Integer[] xs = helper.random(Integer.class, r -> r.nextInt(1000));
        SortWithHelper<Integer> sorter = new SelectionSort<Integer>(helper);
        sorter.preProcess(xs);
        Integer[] ys = sorter.sort(xs);
        sorter.postProcess(ys);
        assertTrue(helper.sorted(ys));
        final int compares = (int) statPack.getStatistics(Instrumenter.COMPARES).mean();
        assertEquals(n * (n - 1) / 2, compares);
        final int inversions = (int) statPack.getStatistics(Instrumenter.INVERSIONS).mean();
        final int fixes = (int) statPack.getStatistics(Instrumenter.FIXES).mean();
        final int hits = (int) statPack.getStatistics(Instrumenter.HITS).mean();
        System.out.println("For N = "+n+",No of hits : "+hits);
    }

    @Test
    public void sort3200() throws Exception {
        final Config config = ConfigTest.setupConfig("true", "0", "1", "", "");
        int n = 3200;
        ComparisonSortHelper<Integer> helper = HelperFactory.create("SelectionSort", n, config);
        helper.init(n);
        Instrumenter instrumenter = helper.getInstrumenter();
        final PrivateMethodInvoker privateMethodInvoker = new PrivateMethodInvoker(instrumenter);
        final StatPack statPack = (StatPack) privateMethodInvoker.invokePrivate("getStatPack");
        Integer[] xs = helper.random(Integer.class, r -> r.nextInt(1000));
        SortWithHelper<Integer> sorter = new SelectionSort<Integer>(helper);
        sorter.preProcess(xs);
        Integer[] ys = sorter.sort(xs);
        sorter.postProcess(ys);
        assertTrue(helper.sorted(ys));
        final int compares = (int) statPack.getStatistics(Instrumenter.COMPARES).mean();
        assertEquals(n * (n - 1) / 2, compares);
        final int inversions = (int) statPack.getStatistics(Instrumenter.INVERSIONS).mean();
        final int fixes = (int) statPack.getStatistics(Instrumenter.FIXES).mean();
        final int hits = (int) statPack.getStatistics(Instrumenter.HITS).mean();
        System.out.println("For N = "+n+",No of hits : "+hits);
    }

    @Test
    public void sort6400() throws Exception {
        final Config config = ConfigTest.setupConfig("true", "0", "1", "", "");
        int n = 6400;
        ComparisonSortHelper<Integer> helper = HelperFactory.create("SelectionSort", n, config);
        helper.init(n);
        Instrumenter instrumenter = helper.getInstrumenter();
        final PrivateMethodInvoker privateMethodInvoker = new PrivateMethodInvoker(instrumenter);
        final StatPack statPack = (StatPack) privateMethodInvoker.invokePrivate("getStatPack");
        Integer[] xs = helper.random(Integer.class, r -> r.nextInt(1000));
        SortWithHelper<Integer> sorter = new SelectionSort<Integer>(helper);
        sorter.preProcess(xs);
        Integer[] ys = sorter.sort(xs);
        sorter.postProcess(ys);
        assertTrue(helper.sorted(ys));
        final int compares = (int) statPack.getStatistics(Instrumenter.COMPARES).mean();
        assertEquals(n * (n - 1) / 2, compares);
        final int inversions = (int) statPack.getStatistics(Instrumenter.INVERSIONS).mean();
        final int fixes = (int) statPack.getStatistics(Instrumenter.FIXES).mean();
        final int hits = (int) statPack.getStatistics(Instrumenter.HITS).mean();
        System.out.println("For N = "+n+",No of hits : "+hits);
    }



    @Test
    public void sort12800() throws Exception {
        final Config config = ConfigTest.setupConfig("true", "0", "1", "", "");
        int n = 12800;
        ComparisonSortHelper<Integer> helper = HelperFactory.create("SelectionSort", n, config);
        helper.init(n);
        Instrumenter instrumenter = helper.getInstrumenter();
        final PrivateMethodInvoker privateMethodInvoker = new PrivateMethodInvoker(instrumenter);
        final StatPack statPack = (StatPack) privateMethodInvoker.invokePrivate("getStatPack");
        Integer[] xs = helper.random(Integer.class, r -> r.nextInt(1000));
        SortWithHelper<Integer> sorter = new SelectionSort<Integer>(helper);
        sorter.preProcess(xs);
        Integer[] ys = sorter.sort(xs);
        sorter.postProcess(ys);
        assertTrue(helper.sorted(ys));
        final int compares = (int) statPack.getStatistics(Instrumenter.COMPARES).mean();
        assertEquals(n * (n - 1) / 2, compares);
        final int inversions = (int) statPack.getStatistics(Instrumenter.INVERSIONS).mean();
        final int fixes = (int) statPack.getStatistics(Instrumenter.FIXES).mean();
        final int hits = (int) statPack.getStatistics(Instrumenter.HITS).mean();
        System.out.println("For N = "+n+",No of hits : "+hits);
    }



    @Test
    public void sort25600() throws Exception {
        final Config config = ConfigTest.setupConfig("true", "0", "1", "", "");
        int n = 25600;
        ComparisonSortHelper<Integer> helper = HelperFactory.create("SelectionSort", n, config);
        helper.init(n);
        Instrumenter instrumenter = helper.getInstrumenter();
        final PrivateMethodInvoker privateMethodInvoker = new PrivateMethodInvoker(instrumenter);
        final StatPack statPack = (StatPack) privateMethodInvoker.invokePrivate("getStatPack");
        Integer[] xs = helper.random(Integer.class, r -> r.nextInt(1000));
        SortWithHelper<Integer> sorter = new SelectionSort<Integer>(helper);
        sorter.preProcess(xs);
        Integer[] ys = sorter.sort(xs);
        sorter.postProcess(ys);
        assertTrue(helper.sorted(ys));
        final int compares = (int) statPack.getStatistics(Instrumenter.COMPARES).mean();
        assertEquals(n * (n - 1) / 2, compares);
        final int inversions = (int) statPack.getStatistics(Instrumenter.INVERSIONS).mean();
        final int fixes = (int) statPack.getStatistics(Instrumenter.FIXES).mean();
        final int hits = (int) statPack.getStatistics(Instrumenter.HITS).mean();
        System.out.println("For N = "+n+",No of hits : "+hits);
    }

    @Test
    public void sort51200() throws Exception {
        final Config config = ConfigTest.setupConfig("true", "0", "1", "", "");
        int n = 51200;
        ComparisonSortHelper<Integer> helper = HelperFactory.create("SelectionSort", n, config);
        helper.init(n);
        Instrumenter instrumenter = helper.getInstrumenter();
        final PrivateMethodInvoker privateMethodInvoker = new PrivateMethodInvoker(instrumenter);
        final StatPack statPack = (StatPack) privateMethodInvoker.invokePrivate("getStatPack");
        Integer[] xs = helper.random(Integer.class, r -> r.nextInt(1000));
        SortWithHelper<Integer> sorter = new SelectionSort<Integer>(helper);
        sorter.preProcess(xs);
        Integer[] ys = sorter.sort(xs);
        sorter.postProcess(ys);
        assertTrue(helper.sorted(ys));
        final int hits = (int) statPack.getStatistics(Instrumenter.HITS).mean();
        System.out.println("For N = "+n+",No of hits : "+hits);
    }

}