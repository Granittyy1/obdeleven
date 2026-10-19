package kotlinx.coroutines.sync;

import D3.l;

/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f43603a = new l(4, "NO_OWNER");

    public static MutexImpl a() {
        return new MutexImpl(false);
    }
}
