package ru.my.test.helpers;

@FunctionalInterface
public interface UserFactory {
    User create(String name, int age);
}