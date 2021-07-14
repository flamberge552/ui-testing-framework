package com.poc.ui.utils;

public class ReflectUtils {
    private ReflectUtils() {}

    public static void printThreadDetails() {
        StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
        StackTraceElement e = stacktrace[2];
        String methodName = e.getMethodName();
        System.out.println("Currently in thread with named: " + Thread.currentThread().getName() +
                ", with id: " + Thread.currentThread().getId() + " calling method: " + methodName);
    }

    public static void printObjectInfo(Object obj) {
        System.out.println("Driver object: " + obj.toString());
    }
}
