package p033c7;

import B8.E0;
import D7.i;
import Q3.d;
import X5.p;
import X8.q;
import Z3.n;
import androidx.media3.exoplayer.C;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks;
import io.reactivex.internal.operators.completable.CompletableConcatArray;
import io.reactivex.internal.operators.completable.b;
import io.reactivex.internal.operators.maybe.MaybeCallbackObserver;
import io.reactivex.internal.operators.maybe.MaybeFlatMapCompletable;
import io.reactivex.internal.operators.maybe.MaybeOnErrorNext;
import io.reactivex.internal.operators.maybe.MaybeSubscribeOn;
import io.reactivex.internal.operators.maybe.e;
import io.reactivex.internal.operators.maybe.f;
import io.reactivex.internal.operators.maybe.k;
import p071f7.a;
import p083g7.h;
import p083g7.m;
import p123ja.o;
import p191p5.B;
import ra.c;

/* JADX INFO: renamed from: c7.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DisplayCallbacksImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1506t implements FirebaseInAppMessagingDisplayCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f22498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f22499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f22500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e0 f22501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f22502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final O f22503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1497j f22504g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f22505h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f22506i;
    public boolean j = false;

    @VisibleForTesting
    public C1506t(A a10, a aVar, g0 g0Var, e0 e0Var, m mVar, O o10, C1497j c1497j, h hVar, String str) {
        this.f22498a = a10;
        this.f22499b = aVar;
        this.f22500c = g0Var;
        this.f22501d = e0Var;
        this.f22502e = mVar;
        this.f22503f = o10;
        this.f22504g = c1497j;
        this.f22505h = hVar;
        this.f22506i = str;
    }

    public static B e(p123ja.h hVar, o oVar) {
        p191p5.h hVar2 = new p191p5.h();
        i iVar = new i(hVar2);
        hVar.getClass();
        MaybeOnErrorNext maybeOnErrorNext = new MaybeOnErrorNext(new k(hVar, iVar, qa.a.f46191d).e(new e(new q(1, hVar2))), new p(hVar2));
        d.I(oVar, "scheduler is null");
        new MaybeSubscribeOn(maybeOnErrorNext, oVar).a(new MaybeCallbackObserver());
        return hVar2.f45811a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final B a(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason inAppMessagingErrorReason) {
        if (!this.f22504g.a()) {
            c("render error to metrics logger");
            return new p191p5.h().f45811a;
        }
        d.B();
        CompletableConcatArray completableConcatArrayC = d().c(new b(new C1504q(this, inAppMessagingErrorReason))).c(new b(new S6.k(2, this)));
        return e(completableConcatArrayC instanceof c ? ((c) completableConcatArrayC).b() : new f(completableConcatArrayC), this.f22500c.f22451a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final B b() {
        if (!this.f22504g.a() || this.j) {
            c("message impression to metrics logger");
            return new p191p5.h().f45811a;
        }
        d.B();
        CompletableConcatArray completableConcatArrayC = d().c(new b(new C(this))).c(new b(new S6.k(2, this)));
        return e(completableConcatArrayC instanceof c ? ((c) completableConcatArrayC).b() : new f(completableConcatArrayC), this.f22500c.f22451a);
    }

    public final void c(String str) {
        if (this.f22505h.f35628b.f5085b) {
            d.B();
        } else if (this.f22504g.a()) {
            d.B();
        } else {
            d.B();
        }
    }

    public final p123ja.a d() {
        String str = (String) this.f22505h.f35628b.f5086c;
        d.B();
        N7.a.C0070a c0070aK = N7.a.K();
        long jA = this.f22499b.a();
        c0070aK.r();
        N7.a.I((N7.a) c0070aK.f29047c, jA);
        c0070aK.r();
        N7.a.H((N7.a) c0070aK.f29047c, str);
        final N7.a aVarP = c0070aK.p();
        final A a10 = this.f22498a;
        p123ja.h<N7.b> hVarA = a10.a();
        N7.b bVar = A.f22338c;
        d.I(bVar, "item is null");
        MaybeFlatMapCompletable maybeFlatMapCompletable = new MaybeFlatMapCompletable(hVarA.e(p123ja.h.b(bVar)), new p183oa.c() { // from class: c7.y
            @Override // p183oa.c, p311z4.f
            public final Object apply(Object obj) {
                A a11 = a10;
                a11.getClass();
                N7.b.a aVarL = N7.b.L((N7.b) obj);
                N7.a aVar = aVarP;
                aVarL.r();
                N7.b.H((N7.b) aVarL.f29047c, aVar);
                N7.b bVarP = aVarL.p();
                T t8 = a11.f22339a;
                t8.getClass();
                return new io.reactivex.internal.operators.completable.c(new S(t8, bVarP)).d(new I4.m(a11, bVarP));
            }
        });
        n nVar = new n(1);
        qa.a.b bVar2 = qa.a.f46190c;
        io.reactivex.internal.operators.completable.e eVarD = new io.reactivex.internal.operators.completable.e(maybeFlatMapCompletable, nVar, bVar2).d(new B7.b(6));
        if (!this.f22506i.equals("ON_FOREGROUND")) {
            return eVarD;
        }
        e0 e0Var = this.f22501d;
        p123ja.h<Z> hVarA2 = e0Var.a();
        Z z10 = e0.f22439d;
        d.I(z10, "item is null");
        return new io.reactivex.internal.operators.completable.d(new io.reactivex.internal.operators.completable.e(new MaybeFlatMapCompletable(hVarA2.e(p123ja.h.b(z10)), new a0(e0Var, this.f22502e)), new J4.i(5), bVar2).d(new E0(5))).c(eVarD);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final B f(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType inAppMessagingDismissType) {
        if (!this.f22504g.a()) {
            c("message dismissal to metrics logger");
            return new p191p5.h().f45811a;
        }
        d.B();
        b bVar = new b(new r(this, 0, inAppMessagingDismissType));
        if (!this.j) {
            b();
        }
        return e(bVar instanceof c ? ((c) bVar).b() : new f(bVar), this.f22500c.f22451a);
    }
}
