package androidx.paging;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: renamed from: androidx.paging.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: HintHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1433i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f19355a = new b(this);

    /* JADX INFO: renamed from: androidx.paging.i$a */
    /* JADX INFO: compiled from: HintHandler.kt */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public I f19356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final kotlinx.coroutines.flow.v f19357b = kotlinx.coroutines.flow.w.b(1, 0, BufferOverflow.f43244c, 2);
    }

    /* JADX INFO: renamed from: androidx.paging.i$b */
    /* JADX INFO: compiled from: HintHandler.kt */
    public final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public I.a f19360c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f19358a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f19359b = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ReentrantLock f19361d = new ReentrantLock();

        public b(C1433i c1433i) {
        }

        public final void a(I.a aVar, Ia.p<? super a, ? super a, p293xa.r> pVar) {
            ReentrantLock reentrantLock = this.f19361d;
            try {
                reentrantLock.lock();
                if (aVar != null) {
                    this.f19360c = aVar;
                }
                pVar.invoke(this.f19358a, this.f19359b);
                p293xa.r rVar = p293xa.r.f47939a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final kotlinx.coroutines.flow.v a(LoadType loadType) {
        kotlin.jvm.internal.i.e(loadType, "loadType");
        int iOrdinal = loadType.ordinal();
        b bVar = this.f19355a;
        if (iOrdinal == 1) {
            return bVar.f19358a.f19357b;
        }
        if (iOrdinal == 2) {
            return bVar.f19359b.f19357b;
        }
        throw new IllegalArgumentException("invalid load type for hints");
    }
}
