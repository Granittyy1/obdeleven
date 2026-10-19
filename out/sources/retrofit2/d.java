package retrofit2;

import p318zb.I;

/* JADX INFO: compiled from: Call.java */
/* JADX INFO: loaded from: classes2.dex */
public interface d<T> extends Cloneable {
    void cancel();

    /* JADX INFO: renamed from: clone */
    d<T> mo706clone();

    void enqueue(f<T> fVar);

    boolean isCanceled();

    boolean isExecuted();

    okhttp3.u request();

    I timeout();
}
