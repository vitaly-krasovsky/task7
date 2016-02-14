package com.epam.training;


/**
 * Main application.
 *
 * @author vkrasovsky
 */
public class OOMHeap {
    /**
     * JVM options:
     * -verbose:gc -XX:+UseConcMarkSweepGC -XX:ConcGCThreads=2 -Xms2M -Xmx18M -XX:NewSize=1m -XX:MaxNewSize=1m -XX:PermSize=24m -XX:MaxPermSize=36m
     *
     * @param args the args
     */
    public static void main(String[] args) {
        while (true) {
            new Item();
        }
    }
}
