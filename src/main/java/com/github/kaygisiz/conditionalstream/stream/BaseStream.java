package com.github.kaygisiz.conditionalstream.stream;

import java.util.function.Function;

public interface BaseStream<T> {
    T get();

    <U> ConditionalStream<U> cast(Class<U> clazz);

    <U> ConditionalStream<U> branch(Function<? super T, ? extends U> action);
}
