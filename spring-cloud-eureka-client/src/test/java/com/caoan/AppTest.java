package com.caoan;

import static org.junit.Assert.assertTrue;

import org.assertj.core.util.Lists;
import org.assertj.core.util.Sets;
import org.junit.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    public static void main(String[] args) {
        List<String> ids = Lists.newArrayList();
        for(int i=0;i<100000;i++){
            ids.add(i+"");
        }
        Set<String> ids2 = Sets.newHashSet();
        for(int i=0;i<10000;i++){
            ids2.add(i+"");
        }
        long s = System.currentTimeMillis();
        List<String> collect = ids.stream().filter(e -> ids2.contains(e)).collect(Collectors.toList());
        long cost = System.currentTimeMillis()-s;
        System.out.println(cost);
    }
}
