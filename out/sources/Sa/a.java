package Sa;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.AbstractC2712w;
import kotlinx.coroutines.Y;
import kotlinx.coroutines.internal.y;
import p114j1.C2479a;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends Y implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f5704c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC2712w f5705d;

    static {
        j jVar = j.f5721c;
        int i10 = y.f43506a;
        if (64 >= i10) {
            i10 = 64;
        }
        f5705d = jVar.c1(C2479a.p("kotlinx.coroutines.io.parallelism", i10, 0, 0, 12));
    }

    @Override // kotlinx.coroutines.AbstractC2712w
    public final void Z0(kotlin.coroutines.e eVar, Runnable runnable) {
        f5705d.Z0(eVar, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC2712w
    public final void a1(kotlin.coroutines.e eVar, Runnable runnable) {
        f5705d.a1(eVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Z0(EmptyCoroutineContext.f43032b, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC2712w
    public final String toString() {
        return "Dispatchers.IO";
    }
}
