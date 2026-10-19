package io.reactivex.disposables;

import p148la.b;

/* JADX INFO: compiled from: Disposables.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static b a(Runnable runnable) {
        return new RunnableDisposable(runnable);
    }
}
