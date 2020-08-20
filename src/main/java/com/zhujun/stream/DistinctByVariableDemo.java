package com.zhujun.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DistinctByVariableDemo {

    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("小明", 1));
        users.add(new User("小力", 2));
        users.add(new User("小明", 3));
        users.add(new User("小为", 4));
        users.add(new User("小和", 5));
        users.add(new User("小力",7));

       List<User> sameUser =   users.stream().filter(distinctByVariable(u -> u.getName())).collect(Collectors.toList());
       System.out.println("hello");
    }

    /**
     * putIfAbsent() 方法是
     *      如果 key对应的value值不存在, key value 添加到 map 中,并返回 null
     *      如果 key对应的value值已存在, key value 不再添加到 map 中, 并返回原 value
     *
     * 故 newKey(这里的newKey对应user对象中的name的值), 如果(newKey, Boolean.TRUE) 在map中已存在,
     * putIfAbsent(newKey, Boolean.TRUE) 会返回 Boolean.TRUE (Boolean.TRUE 被final修饰,故其地址值唯一, 可用作比较)
     * 然后判断是否等于 null, 返回false, filter接收到结果为false的Predicate并将该值过滤掉
     * @param keyExtractor
     * @param <T>
     * @return
     */
    private static <T> Predicate<T> distinctByVariable(Function<? super T, ?> keyExtractor) {
        HashMap<Object, Boolean> map = new HashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) != null;
    }
}

