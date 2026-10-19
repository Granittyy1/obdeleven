package androidx.compose.runtime;

import androidx.compose.runtime.internal.AtomicInt;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C2693i;

/* JADX INFO: compiled from: BroadcastFrameClock.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BroadcastFrameClock implements O {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.a<p293xa.r> f12783b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f12785d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12784c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f12786e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f12787f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInt f12788g = new AtomicInt(0);

    /* JADX INFO: compiled from: BroadcastFrameClock.kt */
    public static final class a<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Ia.l<Long, R> f12789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C2693i f12790b;

        public a(Ia.l lVar, C2693i c2693i) {
            this.f12789a = lVar;
            this.f12790b = c2693i;
        }
    }

    public BroadcastFrameClock(Ia.a<p293xa.r> aVar) {
        this.f12783b = aVar;
    }

    @Override // androidx.compose.runtime.O
    public final <R> Object P0(Ia.l<? super Long, ? extends R> lVar, kotlin.coroutines.c<? super R> cVar) {
        C2693i c2693i = new C2693i(1, A8.p.y(cVar));
        c2693i.s();
        final a aVar = new a(lVar, c2693i);
        synchronized (this.f12784c) {
            Throwable th = this.f12785d;
            if (th != null) {
                c2693i.resumeWith(kotlin.b.a(th));
            } else {
                boolean zIsEmpty = this.f12786e.isEmpty();
                this.f12786e.add(aVar);
                if (zIsEmpty) {
                    this.f12788g.set(1);
                }
                c2693i.u(new Ia.l<Throwable, p293xa.r>() { // from class: androidx.compose.runtime.BroadcastFrameClock$withFrameNanos$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(Throwable th2) {
                        BroadcastFrameClock broadcastFrameClock = this.this$0;
                        Object obj = broadcastFrameClock.f12784c;
                        Object obj2 = aVar;
                        synchronized (obj) {
                            broadcastFrameClock.f12786e.remove(obj2);
                            if (broadcastFrameClock.f12786e.isEmpty()) {
                                broadcastFrameClock.f12788g.set(0);
                            }
                        }
                        return p293xa.r.f47939a;
                    }
                });
                if (zIsEmpty) {
                    try {
                        ((Recomposer$broadcastFrameClock$1) this.f12783b).invoke();
                    } catch (Throwable th2) {
                        synchronized (this.f12784c) {
                            try {
                                if (this.f12785d == null) {
                                    this.f12785d = th2;
                                    ArrayList arrayList = this.f12786e;
                                    int size = arrayList.size();
                                    for (int i10 = 0; i10 < size; i10++) {
                                        ((a) arrayList.get(i10)).f12790b.resumeWith(kotlin.b.a(th2));
                                    }
                                    this.f12786e.clear();
                                    this.f12788g.set(0);
                                    p293xa.r rVar = p293xa.r.f47939a;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
            }
        }
        Object objP = c2693i.p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        return objP;
    }

    public final void a(long j) {
        Object objA;
        synchronized (this.f12784c) {
            try {
                ArrayList arrayList = this.f12786e;
                this.f12786e = this.f12787f;
                this.f12787f = arrayList;
                this.f12788g.set(0);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    a aVar = (a) arrayList.get(i10);
                    aVar.getClass();
                    try {
                        objA = aVar.f12789a.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        objA = kotlin.b.a(th);
                    }
                    aVar.f12790b.resumeWith(objA);
                }
                arrayList.clear();
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
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
