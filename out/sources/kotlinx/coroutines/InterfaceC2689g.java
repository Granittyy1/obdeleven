package kotlinx.coroutines;

/* JADX INFO: renamed from: kotlinx.coroutines.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2689g extends u0 {

    /* JADX INFO: renamed from: kotlinx.coroutines.g$a */
    /* JADX INFO: compiled from: CancellableContinuationImpl.kt */
    public static final class a implements InterfaceC2689g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Ia.l<Throwable, p293xa.r> f43440b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Ia.l<? super Throwable, p293xa.r> lVar) {
            this.f43440b = lVar;
        }

        @Override // kotlinx.coroutines.InterfaceC2689g
        public final void a(Throwable th) {
            this.f43440b.invoke(th);
        }

        public final String toString() {
            return "CancelHandler.UserSupplied[" + this.f43440b.getClass().getSimpleName() + '@' + C.l(this) + ']';
        }
    }

    void a(Throwable th);
}
