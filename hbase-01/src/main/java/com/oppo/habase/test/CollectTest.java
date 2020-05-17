package com.oppo.habase.test;

import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

public class CollectTest {
    public static void main(String[] args) {
        List<Integer> emptyList = Collections.EMPTY_LIST;
        //这个空的不能进行任何操作，只是如果返回多个方法都需要返回一个空的集合时 可以使用这个 都共享一个内存

        emptyList.add(1);
        emptyList.add(2);
        emptyList.add(3);
        emptyList.add(4);
        emptyList.forEach(data->{
            System.out.println(data);
        });
    }
}
