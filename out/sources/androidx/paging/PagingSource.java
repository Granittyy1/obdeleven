package androidx.paging;

import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: PagingSource.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class PagingSource<Key, Value> {
    private final k<Ia.a<p293xa.r>> invalidateCallbackTracker = new k<>(PagingSource$invalidateCallbackTracker$1.f19321h);

    /* JADX INFO: compiled from: PagingSource.kt */
    public static abstract class a<Key> {

        /* JADX INFO: renamed from: androidx.paging.PagingSource$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PagingSource.kt */
        public static final class C0194a<Key> extends a<Key> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Key f19312a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0194a(Object key) {
                kotlin.jvm.internal.i.e(key, "key");
                this.f19312a = key;
            }

            @Override // androidx.paging.PagingSource.a
            public final Key a() {
                return this.f19312a;
            }
        }

        /* JADX INFO: compiled from: PagingSource.kt */
        public static final class b<Key> extends a<Key> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Key f19313a;

            /* JADX WARN: Multi-variable type inference failed */
            public b(Object key) {
                kotlin.jvm.internal.i.e(key, "key");
                this.f19313a = key;
            }

            @Override // androidx.paging.PagingSource.a
            public final Key a() {
                return this.f19313a;
            }
        }

        /* JADX INFO: compiled from: PagingSource.kt */
        public static final class c<Key> extends a<Key> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Key f19314a;

            /* JADX WARN: Multi-variable type inference failed */
            public c(Object obj) {
                this.f19314a = obj;
            }

            @Override // androidx.paging.PagingSource.a
            public final Key a() {
                return this.f19314a;
            }
        }

        public abstract Key a();
    }

    public final boolean getInvalid() {
        return this.invalidateCallbackTracker.f19366e;
    }

    public final int getInvalidateCallbackCount$paging_common_release() {
        return this.invalidateCallbackTracker.f19365d.size();
    }

    public boolean getJumpingSupported() {
        return false;
    }

    public boolean getKeyReuseSupported() {
        return false;
    }

    public abstract Key getRefreshKey(y<Key, Value> yVar);

    public final void invalidate() {
        if (this.invalidateCallbackTracker.a()) {
            if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                String message = "Invalidated PagingSource " + this;
                kotlin.jvm.internal.i.e(message, "message");
            }
        }
    }

    public abstract Object load(a<Key> aVar, kotlin.coroutines.c<? super b<Key, Value>> cVar);

    public final void registerInvalidatedCallback(Ia.a<p293xa.r> onInvalidatedCallback) {
        kotlin.jvm.internal.i.e(onInvalidatedCallback, "onInvalidatedCallback");
        k<Ia.a<p293xa.r>> kVar = this.invalidateCallbackTracker;
        Ia.a<Boolean> aVar = kVar.f19363b;
        boolean z10 = true;
        if (aVar != null && aVar.invoke().booleanValue()) {
            kVar.a();
        }
        boolean z11 = kVar.f19366e;
        Ia.l<Ia.a<p293xa.r>, p293xa.r> lVar = kVar.f19362a;
        if (z11) {
            ((PagingSource$invalidateCallbackTracker$1) lVar).invoke(onInvalidatedCallback);
            return;
        }
        ReentrantLock reentrantLock = kVar.f19364c;
        try {
            reentrantLock.lock();
            if (!kVar.f19366e) {
                kVar.f19365d.add(onInvalidatedCallback);
                z10 = false;
            }
            if (z10) {
                ((PagingSource$invalidateCallbackTracker$1) lVar).invoke(onInvalidatedCallback);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void unregisterInvalidatedCallback(Ia.a<p293xa.r> onInvalidatedCallback) {
        kotlin.jvm.internal.i.e(onInvalidatedCallback, "onInvalidatedCallback");
        k<Ia.a<p293xa.r>> kVar = this.invalidateCallbackTracker;
        ReentrantLock reentrantLock = kVar.f19364c;
        try {
            reentrantLock.lock();
            kVar.f19365d.remove(onInvalidatedCallback);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: compiled from: PagingSource.kt */
    public static abstract class b<Key, Value> {

        /* JADX INFO: compiled from: PagingSource.kt */
        public static final class a<Key, Value> extends b<Key, Value> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Throwable f19315b;

            public a(Throwable throwable) {
                kotlin.jvm.internal.i.e(throwable, "throwable");
                this.f19315b = throwable;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && kotlin.jvm.internal.i.a(this.f19315b, ((a) obj).f19315b);
            }

            public final int hashCode() {
                return this.f19315b.hashCode();
            }

            public final String toString() {
                return kotlin.text.i.w("LoadResult.Error(\n                    |   throwable: " + this.f19315b + "\n                    |) ");
            }
        }

        /* JADX INFO: renamed from: androidx.paging.PagingSource$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PagingSource.kt */
        public static final class C0195b<Key, Value> extends b<Key, Value> implements Iterable<Value>, Ja.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List<Value> f19316b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Long f19317c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Long f19318d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final int f19319e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final int f19320f;

            static {
                new C0195b(EmptyList.f42983b, null, null, 0, 0);
            }

            public C0195b(List data, Long l10, Long l11, int i10, int i11) {
                kotlin.jvm.internal.i.e(data, "data");
                this.f19316b = data;
                this.f19317c = l10;
                this.f19318d = l11;
                this.f19319e = i10;
                this.f19320f = i11;
                if (i10 != Integer.MIN_VALUE && i10 < 0) {
                    throw new IllegalArgumentException("itemsBefore cannot be negative");
                }
                if (i11 != Integer.MIN_VALUE && i11 < 0) {
                    throw new IllegalArgumentException("itemsAfter cannot be negative");
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0195b)) {
                    return false;
                }
                C0195b c0195b = (C0195b) obj;
                return kotlin.jvm.internal.i.a(this.f19316b, c0195b.f19316b) && kotlin.jvm.internal.i.a(this.f19317c, c0195b.f19317c) && kotlin.jvm.internal.i.a(this.f19318d, c0195b.f19318d) && this.f19319e == c0195b.f19319e && this.f19320f == c0195b.f19320f;
            }

            public final int hashCode() {
                int iHashCode = this.f19316b.hashCode() * 31;
                Long l10 = this.f19317c;
                int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
                Long l11 = this.f19318d;
                return Integer.hashCode(this.f19320f) + p005a4.q.b(this.f19319e, (iHashCode2 + (l11 != null ? l11.hashCode() : 0)) * 31, 31);
            }

            @Override // java.lang.Iterable
            public final Iterator<Value> iterator() {
                return this.f19316b.listIterator();
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("LoadResult.Page(\n                    |   data size: ");
                List<Value> list = this.f19316b;
                sb2.append(list.size());
                sb2.append("\n                    |   first Item: ");
                sb2.append(kotlin.collections.q.P(list));
                sb2.append("\n                    |   last Item: ");
                sb2.append(kotlin.collections.q.W(list));
                sb2.append("\n                    |   nextKey: ");
                sb2.append(this.f19318d);
                sb2.append("\n                    |   prevKey: ");
                sb2.append(this.f19317c);
                sb2.append("\n                    |   itemsBefore: ");
                sb2.append(this.f19319e);
                sb2.append("\n                    |   itemsAfter: ");
                sb2.append(this.f19320f);
                sb2.append("\n                    |) ");
                return kotlin.text.i.w(sb2.toString());
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public C0195b(List data, Long l10, Long l11) {
                this(data, l10, l11, Integer.MIN_VALUE, Integer.MIN_VALUE);
                kotlin.jvm.internal.i.e(data, "data");
            }
        }
    }
}
