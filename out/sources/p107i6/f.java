package p107i6;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: ListenableFuture.java */
/* JADX INFO: loaded from: classes3.dex */
public interface f<V> extends Future<V> {
    void a(Runnable runnable, Executor executor);
}
