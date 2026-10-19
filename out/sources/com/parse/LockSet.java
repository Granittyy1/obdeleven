package com.parse;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes3.dex */
class LockSet {
    private final Set<Lock> locks;
    private static final WeakHashMap<Lock, Long> stableIds = new WeakHashMap<>();
    private static long nextStableId = 0;

    public LockSet(Collection<Lock> collection) {
        TreeSet treeSet = new TreeSet(new Comparator<Lock>() { // from class: com.parse.LockSet.1
            @Override // java.util.Comparator
            public int compare(Lock lock, Lock lock2) {
                return LockSet.getStableId(lock).compareTo(LockSet.getStableId(lock2));
            }
        });
        this.locks = treeSet;
        treeSet.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Long getStableId(Lock lock) {
        WeakHashMap<Lock, Long> weakHashMap = stableIds;
        synchronized (weakHashMap) {
            try {
                if (weakHashMap.containsKey(lock)) {
                    return weakHashMap.get(lock);
                }
                long j = nextStableId;
                nextStableId = 1 + j;
                weakHashMap.put(lock, Long.valueOf(j));
                return Long.valueOf(j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void lock() {
        Iterator<Lock> it = this.locks.iterator();
        while (it.hasNext()) {
            it.next().lock();
        }
    }

    public void unlock() {
        Iterator<Lock> it = this.locks.iterator();
        while (it.hasNext()) {
            it.next().unlock();
        }
    }
}
