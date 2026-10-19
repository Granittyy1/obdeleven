package com.braze.coroutine;

import Ia.l;
import Ia.p;
import com.braze.support.BrazeLogger;
import com.google.android.gms.internal.measurement.M1;
import kotlin.coroutines.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import kotlinx.coroutines.B;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.C2702l0;
import kotlinx.coroutines.I;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.InterfaceC2713x;
import kotlinx.coroutines.N;
import p293xa.r;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeCoroutineScope implements A {
    public static final BrazeCoroutineScope INSTANCE = new BrazeCoroutineScope();
    private static final e coroutineContext;
    private static final InterfaceC2713x exceptionHandler;

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f24051b = new a();

        public a() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cancelling children of BrazeCoroutineScope";
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f24052b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.f24052b = th;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Child job of BrazeCoroutineScope got exception: " + this.f24052b;
        }
    }

    public static final class c extends SuspendLambda implements p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f24053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f24054c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Number f24055d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ l f24056e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Number number, l lVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f24055d = number;
            this.f24056e = lVar;
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(A a10, kotlin.coroutines.c cVar) {
            return ((c) create(a10, cVar)).invokeSuspend(r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            c cVar2 = new c(this.f24055d, this.f24056e, cVar);
            cVar2.f24054c = obj;
            return cVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            A a10;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.f24053b;
            if (i10 != 0) {
                if (i10 == 1) {
                    a10 = (A) this.f24054c;
                    kotlin.b.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                return r.f47939a;
            }
            kotlin.b.b(obj);
            a10 = (A) this.f24054c;
            long jLongValue = this.f24055d.longValue();
            this.f24054c = a10;
            this.f24053b = 1;
            if (I.b(jLongValue, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            if (B.e(a10)) {
                l lVar = this.f24056e;
                this.f24054c = null;
                this.f24053b = 2;
                if (lVar.invoke(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return r.f47939a;
        }
    }

    public static final class d extends kotlin.coroutines.a implements InterfaceC2713x {
        public d(InterfaceC2713x.a aVar) {
            super(aVar);
        }

        @Override // kotlinx.coroutines.InterfaceC2713x
        public void handleException(e eVar, Throwable th) {
            BrazeLogger.INSTANCE.brazelog(BrazeCoroutineScope.INSTANCE, BrazeLogger.Priority.E, th, new b(th));
        }
    }

    static {
        d dVar = new d(InterfaceC2713x.a.f43616b);
        exceptionHandler = dVar;
        coroutineContext = N.f43200c.plus(dVar).plus(M1.a());
    }

    private BrazeCoroutineScope() {
    }

    public static final void cancelChildren() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeCoroutineScope brazeCoroutineScope = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, brazeCoroutineScope, BrazeLogger.Priority.I, (Throwable) null, a.f24051b, 2, (Object) null);
        C2702l0.d(brazeCoroutineScope.getCoroutineContext());
    }

    public static /* synthetic */ InterfaceC2694i0 launchDelayed$default(BrazeCoroutineScope brazeCoroutineScope, Number number, e eVar, l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            eVar = brazeCoroutineScope.getCoroutineContext();
        }
        return brazeCoroutineScope.launchDelayed(number, eVar, lVar);
    }

    @Override // kotlinx.coroutines.A
    public e getCoroutineContext() {
        return coroutineContext;
    }

    public final InterfaceC2694i0 launchDelayed(Number startDelayInMs, e specificContext, l<? super kotlin.coroutines.c<? super r>, ? extends Object> block) {
        i.e(startDelayInMs, "startDelayInMs");
        i.e(specificContext, "specificContext");
        i.e(block, "block");
        return C2680e.c(this, specificContext, null, new c(startDelayInMs, block, null), 2);
    }
}
