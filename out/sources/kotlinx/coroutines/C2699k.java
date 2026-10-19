package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: kotlinx.coroutines.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2699k extends C2708s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43510c = AtomicIntegerFieldUpdater.newUpdater(C2699k.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C2699k(C2693i c2693i, Throwable th, boolean z10) {
        if (th == null) {
            th = new CancellationException("Continuation " + c2693i + " was cancelled normally");
        }
        super(th, z10);
        this._resumed$volatile = 0;
    }
}
