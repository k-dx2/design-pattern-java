package com.kunal.designpatterns.creational.singleton.threadsafelazyloading;

/**
 * Thread-safe Singleton with lazy loading.
 *
 * Problem:
 * The naive singleton works fine in a single-threaded environment,
 * but breaks when multiple threads try to create the instance at the same time.
 *
 * Example issue:
 * Two threads may enter getInstance() together, both see instance == null,
 * and both create separate objects. This breaks the Singleton guarantee.
 *
 * Solution:
 * This implementation uses:
 * 1. Lazy loading       -> object is created only when first requested
 * 2. Thread safety      -> synchronized block prevents concurrent creation
 * 3. Double-check logic -> avoids unnecessary synchronization after initialization
 *
 * Why this works:
 * - The first null check avoids locking once the instance is already created.
 * - The synchronized block ensures only one thread can initialize the object.
 * - The second null check ensures another thread didn’t already create it.
 *
 * Why 'volatile' is needed:
 * Without volatile, one thread may see a partially constructed object
 * due to instruction reordering by the JVM.
 *
 * This is a thread-safe and efficient Singleton implementation.
 */
public final class Singleton {

    /**
     * The single instance of Singleton.
     *
     * volatile ensures visibility of changes across threads
     * and prevents instruction reordering issues during object creation.
     */
    private static volatile Singleton instance;

    /**
     * Sample state to prove that only one object is created.
     * The first initialization value will persist for all future calls.
     */
    public String value;

    /**
     * Private constructor prevents direct instantiation from outside the class.
     *
     * Only this class can create its single object.
     */
    private Singleton(String value) {
        this.value = value;
    }

    /**
     * Returns the single instance of Singleton.
     *
     * Lazy loading:
     * The object is created only when first requested.
     *
     * Thread safety:
     * Multiple threads may call this method at the same time,
     * but synchronization ensures only one instance is created.
     *
     * Double-check logic:
     * - First check avoids locking once instance already exists
     * - Second check ensures only one thread creates the object
     */
    public static Singleton getInstance(String value) {

        // Store reference in a local variable to reduce repeated reads
        // of the volatile field (minor performance optimization).
        Singleton result = instance;

        // If instance already exists, return it immediately.
        // This avoids entering synchronized block on every call.
        if (result != null) {
            return result;
        }

        // Only one thread can enter this block at a time.
        synchronized (Singleton.class) {

            // Double check because another thread may have created
            // the instance while current thread was waiting for the lock.
            if (instance == null) {
                instance = new Singleton(value);
            }

            return instance;
        }
    }
}