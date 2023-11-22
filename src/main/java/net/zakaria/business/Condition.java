package net.zakaria.business;
@FunctionalInterface
public interface Condition<T> {
    boolean test(T t);
}
