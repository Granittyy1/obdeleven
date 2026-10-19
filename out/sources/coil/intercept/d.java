package coil.intercept;

import Z2.e;
import android.content.Context;
import coil.request.g;
import coil.request.h;
import coil.request.i;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: RealInterceptorChain.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f23001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f23002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f23004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f23005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final coil.b f23006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f23007g;

    public d(g gVar, ArrayList arrayList, int i10, g gVar2, e eVar, coil.b bVar, boolean z10) {
        this.f23001a = gVar;
        this.f23002b = arrayList;
        this.f23003c = i10;
        this.f23004d = gVar2;
        this.f23005e = eVar;
        this.f23006f = bVar;
        this.f23007g = z10;
    }

    public final void a(g gVar, c cVar) {
        Context context = gVar.f23046a;
        g gVar2 = this.f23001a;
        if (context != gVar2.f23046a) {
            throw new IllegalStateException(("Interceptor '" + cVar + "' cannot modify the request's context.").toString());
        }
        if (gVar.f23047b == i.f23097a) {
            throw new IllegalStateException(("Interceptor '" + cVar + "' cannot set the request's data to null.").toString());
        }
        if (gVar.f23048c != gVar2.f23048c) {
            throw new IllegalStateException(("Interceptor '" + cVar + "' cannot modify the request's target.").toString());
        }
        if (gVar.f23068x != gVar2.f23068x) {
            throw new IllegalStateException(("Interceptor '" + cVar + "' cannot modify the request's lifecycle.").toString());
        }
        if (gVar.f23069y == gVar2.f23069y) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + cVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(g gVar, ContinuationImpl continuationImpl) {
        RealInterceptorChain$proceed$1 realInterceptorChain$proceed$1;
        d dVar;
        c cVar;
        if (continuationImpl instanceof RealInterceptorChain$proceed$1) {
            realInterceptorChain$proceed$1 = (RealInterceptorChain$proceed$1) continuationImpl;
            int i10 = realInterceptorChain$proceed$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                realInterceptorChain$proceed$1.label = i10 - Integer.MIN_VALUE;
            } else {
                realInterceptorChain$proceed$1 = new RealInterceptorChain$proceed$1(this, continuationImpl);
            }
        } else {
            realInterceptorChain$proceed$1 = new RealInterceptorChain$proceed$1(this, continuationImpl);
        }
        Object objA = realInterceptorChain$proceed$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = realInterceptorChain$proceed$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            ArrayList arrayList = this.f23002b;
            int i12 = this.f23003c;
            if (i12 > 0) {
                a(gVar, (c) arrayList.get(i12 - 1));
            }
            c cVar2 = (c) arrayList.get(i12);
            d dVar2 = new d(this.f23001a, arrayList, i12 + 1, gVar, this.f23005e, this.f23006f, this.f23007g);
            realInterceptorChain$proceed$1.L$0 = this;
            realInterceptorChain$proceed$1.L$1 = cVar2;
            realInterceptorChain$proceed$1.label = 1;
            objA = cVar2.a(dVar2, realInterceptorChain$proceed$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            dVar = this;
            cVar = cVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (c) realInterceptorChain$proceed$1.L$1;
            dVar = (d) realInterceptorChain$proceed$1.L$0;
            kotlin.b.b(objA);
        }
        h hVar = (h) objA;
        dVar.a(hVar.b(), cVar);
        return hVar;
    }

    @Override // coil.intercept.c.a
    public final g c() {
        return this.f23004d;
    }
}
