package androidx.compose.ui.platform;

import android.view.Choreographer;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C2693i;

/* JADX INFO: compiled from: AndroidUiFrameClock.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidUiFrameClock implements androidx.compose.runtime.O {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Choreographer f14817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AndroidUiDispatcher f14818c;

    /* JADX INFO: compiled from: AndroidUiFrameClock.android.kt */
    public static final class a implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C2693i f14819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Ia.l<Long, R> f14820c;

        public a(C2693i c2693i, AndroidUiFrameClock androidUiFrameClock, Ia.l lVar) {
            this.f14819b = c2693i;
            this.f14820c = lVar;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            Object objA;
            try {
                objA = this.f14820c.invoke(Long.valueOf(j));
            } catch (Throwable th) {
                objA = kotlin.b.a(th);
            }
            this.f14819b.resumeWith(objA);
        }
    }

    public AndroidUiFrameClock(Choreographer choreographer, AndroidUiDispatcher androidUiDispatcher) {
        this.f14817b = choreographer;
        this.f14818c = androidUiDispatcher;
    }

    @Override // androidx.compose.runtime.O
    public final <R> Object P0(Ia.l<? super Long, ? extends R> lVar, kotlin.coroutines.c<? super R> cVar) {
        final AndroidUiDispatcher androidUiDispatcher = this.f14818c;
        if (androidUiDispatcher == null) {
            kotlin.coroutines.e.a aVar = cVar.getContext().get(kotlin.coroutines.d.a.f43035b);
            androidUiDispatcher = aVar instanceof AndroidUiDispatcher ? (AndroidUiDispatcher) aVar : null;
        }
        C2693i c2693i = new C2693i(1, A8.p.y(cVar));
        c2693i.s();
        final a aVar2 = new a(c2693i, this, lVar);
        if (androidUiDispatcher == null || !kotlin.jvm.internal.i.a(androidUiDispatcher.f14806c, this.f14817b)) {
            this.f14817b.postFrameCallback(aVar2);
            c2693i.u(new Ia.l<Throwable, p293xa.r>() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final p293xa.r invoke(Throwable th) {
                    this.this$0.f14817b.removeFrameCallback(aVar2);
                    return p293xa.r.f47939a;
                }
            });
        } else {
            synchronized (androidUiDispatcher.f14808e) {
                try {
                    androidUiDispatcher.f14810g.add(aVar2);
                    if (!androidUiDispatcher.j) {
                        androidUiDispatcher.j = true;
                        androidUiDispatcher.f14806c.postFrameCallback(androidUiDispatcher.f14813k);
                    }
                    p293xa.r rVar = p293xa.r.f47939a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            c2693i.u(new Ia.l<Throwable, p293xa.r>() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final p293xa.r invoke(Throwable th2) {
                    AndroidUiDispatcher androidUiDispatcher2 = androidUiDispatcher;
                    Choreographer.FrameCallback frameCallback = aVar2;
                    synchronized (androidUiDispatcher2.f14808e) {
                        androidUiDispatcher2.f14810g.remove(frameCallback);
                    }
                    return p293xa.r.f47939a;
                }
            });
        }
        Object objP = c2693i.p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        return objP;
    }

    @Override // kotlin.coroutines.e
    public final <R> R fold(R r10, Ia.p<? super R, ? super kotlin.coroutines.e.a, ? extends R> pVar) {
        return (R) kotlin.coroutines.e.a.C0479a.a(this, r10, pVar);
    }

    @Override // kotlin.coroutines.e
    public final <E extends kotlin.coroutines.e.a> E get(kotlin.coroutines.e.b<E> bVar) {
        return (E) kotlin.coroutines.e.a.C0479a.b(this, bVar);
    }

    @Override // kotlin.coroutines.e
    public final kotlin.coroutines.e minusKey(kotlin.coroutines.e.b<?> bVar) {
        return kotlin.coroutines.e.a.C0479a.c(this, bVar);
    }

    @Override // kotlin.coroutines.e
    public final kotlin.coroutines.e plus(kotlin.coroutines.e eVar) {
        return kotlin.coroutines.e.a.C0479a.d(this, eVar);
    }
}
