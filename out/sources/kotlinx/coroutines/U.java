package kotlinx.coroutines;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class U extends AbstractC2712w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f43206f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f43207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f43208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public kotlin.collections.i<L<?>> f43209e;

    public final void d1(boolean z10) {
        long j = this.f43207c - (z10 ? 4294967296L : 1L);
        this.f43207c = j;
        if (j <= 0 && this.f43208d) {
            shutdown();
        }
    }

    public final void e1(L<?> l10) {
        kotlin.collections.i<L<?>> iVar = this.f43209e;
        if (iVar == null) {
            iVar = new kotlin.collections.i<>();
            this.f43209e = iVar;
        }
        iVar.addLast(l10);
    }

    public final void f1(boolean z10) {
        this.f43207c = (z10 ? 4294967296L : 1L) + this.f43207c;
        if (z10) {
            return;
        }
        this.f43208d = true;
    }

    public final boolean g1() {
        return this.f43207c >= 4294967296L;
    }

    public long h1() {
        return !i1() ? Long.MAX_VALUE : 0L;
    }

    public final boolean i1() {
        kotlin.collections.i<L<?>> iVar = this.f43209e;
        if (iVar == null) {
            return false;
        }
        L<?> lRemoveFirst = iVar.isEmpty() ? null : iVar.removeFirst();
        if (lRemoveFirst == null) {
            return false;
        }
        lRemoveFirst.run();
        return true;
    }

    public void shutdown() {
    }
}
