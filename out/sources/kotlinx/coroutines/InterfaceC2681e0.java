package kotlinx.coroutines;

/* JADX INFO: renamed from: kotlinx.coroutines.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CompletionHandler.common.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2681e0 {

    /* JADX INFO: renamed from: kotlinx.coroutines.e0$a */
    /* JADX INFO: compiled from: CompletionHandler.common.kt */
    public static final class a implements InterfaceC2681e0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Ia.l<Throwable, p293xa.r> f43301b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Ia.l<? super Throwable, p293xa.r> lVar) {
            this.f43301b = lVar;
        }

        @Override // kotlinx.coroutines.InterfaceC2681e0
        public final void a(Throwable th) {
            this.f43301b.invoke(th);
        }

        public final String toString() {
            return "InternalCompletionHandler.UserSupplied[" + this.f43301b.getClass().getSimpleName() + '@' + C.l(this) + ']';
        }
    }

    void a(Throwable th);
}
