package coil.disk;

import Ia.p;
import java.io.IOException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;
import p318zb.C2838e;
import p318zb.v;

/* JADX INFO: compiled from: DiskLruCache.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "coil.disk.DiskLruCache$launchCleanup$1", f = "DiskLruCache.kt", l = {}, m = "invokeSuspend")
public final class DiskLruCache$launchCleanup$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ DiskLruCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$launchCleanup$1(DiskLruCache diskLruCache, kotlin.coroutines.c<? super DiskLruCache$launchCleanup$1> cVar) {
        super(2, cVar);
        this.this$0 = diskLruCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new DiskLruCache$launchCleanup$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((DiskLruCache$launchCleanup$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        DiskLruCache diskLruCache = this.this$0;
        synchronized (diskLruCache) {
            try {
                if (!diskLruCache.f22924m || diskLruCache.f22925n) {
                    return r.f47939a;
                }
                try {
                    diskLruCache.C();
                } catch (IOException unused) {
                    diskLruCache.f22926o = true;
                }
                try {
                    if (diskLruCache.j >= 2000) {
                        diskLruCache.N();
                    }
                } catch (IOException unused2) {
                    diskLruCache.f22927p = true;
                    diskLruCache.f22922k = v.a(new C2838e());
                }
                return r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
