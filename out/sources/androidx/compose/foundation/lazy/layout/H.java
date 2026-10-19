package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.PrefetchHandleProvider.HandleAndRequestImpl;
import java.util.ArrayList;

/* JADX INFO: compiled from: LazyLayoutPrefetchState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V f10584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.l<Q, p293xa.r> f10585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f10586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PrefetchHandleProvider f10587d;

    /* JADX INFO: compiled from: LazyLayoutPrefetchState.kt */
    public final class a implements Q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f10588a = new ArrayList();

        public a() {
        }

        @Override // androidx.compose.foundation.lazy.layout.Q
        public final void a(int i10) {
            long j = I.f10590a;
            H h8 = H.this;
            PrefetchHandleProvider prefetchHandleProvider = h8.f10587d;
            if (prefetchHandleProvider == null) {
                return;
            }
            this.f10588a.add(prefetchHandleProvider.new HandleAndRequestImpl(i10, j, h8.f10586c));
        }
    }

    /* JADX INFO: compiled from: LazyLayoutPrefetchState.kt */
    public interface b {
        void b();

        void cancel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public H(V v10, Ia.l<? super Q, p293xa.r> lVar) {
        this.f10584a = v10;
        this.f10585b = lVar;
        this.f10586c = new T();
    }

    public final b a(int i10, long j) {
        PrefetchHandleProvider prefetchHandleProvider = this.f10587d;
        if (prefetchHandleProvider == null) {
            return C0970e.f10714a;
        }
        PrefetchHandleProvider.HandleAndRequestImpl handleAndRequestImpl = prefetchHandleProvider.new HandleAndRequestImpl(i10, j, this.f10586c);
        prefetchHandleProvider.f10674c.a(handleAndRequestImpl);
        return handleAndRequestImpl;
    }

    public H() {
        this(null, null);
    }
}
