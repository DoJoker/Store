package com.yisus.ejemplo;

import com.yisus.ejemplo.java8.streams;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.OptionalInt;
import java.util.stream.IntStream;

@RunWith(MockitoJUnitRunner.class)
public class StreamTests {

    @Test
    public void testMap(){
        //streams.map();

        OptionalInt reduced =
                IntStream.range(1, 4).reduce((a, b) -> a + b);
        System.out.println(reduced);

    }

    @Test
    public void testFlatMap(){
        streams.flatMap();
    }

    @Test
    public void testReduce(){
        streams.reduce();
    }

}
