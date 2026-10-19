package androidx.compose.runtime;

/* JADX INFO: compiled from: MonotonicFrameClock.kt */
/* JADX INFO: loaded from: classes.dex */
public interface O extends kotlin.coroutines.e.a {

    /* JADX INFO: compiled from: MonotonicFrameClock.kt */
    public static final class a implements kotlin.coroutines.e.b<O> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a f12884b = new a();
    }

    <R> Object P0(Ia.l<? super Long, ? extends R> lVar, kotlin.coroutines.c<? super R> cVar);

    @Override // kotlin.coroutines.e.a
    default kotlin.coroutines.e.b<?> getKey() {
        return a.f12884b;
    }
}
