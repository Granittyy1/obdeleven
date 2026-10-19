package com.voltasit.obdeleven.data.providers;

import com.android.billingclient.api.a;
import com.android.billingclient.api.b;
import com.google.android.gms.internal.play_billing.zzbt;
import com.google.android.gms.internal.play_billing.zzie;
import com.voltasit.obdeleven.domain.providers.PurchaseProvider;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.InterfaceC2691h;
import p237t3.C2789b;

/* JADX INFO: compiled from: PurchaseProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.providers.PurchaseProviderImpl$startPendingConnection$1$onBillingSetupFinished$1", f = "PurchaseProviderImpl.kt", l = {351, 353}, m = "invokeSuspend")
public final class PurchaseProviderImpl$startPendingConnection$1$onBillingSetupFinished$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ InterfaceC2691h<C8.a<Boolean>> $continuation;
    Object L$0;
    int label;
    final /* synthetic */ u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PurchaseProviderImpl$startPendingConnection$1$onBillingSetupFinished$1(u uVar, InterfaceC2691h<? super C8.a<Boolean>> interfaceC2691h, kotlin.coroutines.c<? super PurchaseProviderImpl$startPendingConnection$1$onBillingSetupFinished$1> cVar) {
        super(2, cVar);
        this.this$0 = uVar;
        this.$continuation = interfaceC2691h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new PurchaseProviderImpl$startPendingConnection$1$onBillingSetupFinished$1(this.this$0, this.$continuation, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((PurchaseProviderImpl$startPendingConnection$1$onBillingSetupFinished$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC2691h<C8.a<Boolean>> interfaceC2691h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.b.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC2691h = (InterfaceC2691h) this.L$0;
                kotlin.b.b(obj);
            }
            E8.a.d(interfaceC2691h, obj);
            u.g(this.this$0);
            return p293xa.r.f47939a;
        }
        kotlin.b.b(obj);
        u uVar = this.this$0;
        this.label = 1;
        uVar.getClass();
        C2693i c2693i = new C2693i(1, A8.p.y(this));
        c2693i.s();
        final C2789b c2789b = uVar.f30288g;
        if (c2789b == null) {
            kotlin.jvm.internal.i.m("client");
            throw null;
        }
        final p005a4.t tVar = new p005a4.t(c2693i);
        if (C2789b.g(new p237t3.p(c2789b, tVar), 30000L, new Runnable() { // from class: t3.n
            @Override // java.lang.Runnable
            public final void run() {
                zzie zzieVar = zzie.EXECUTE_ASYNC_TIMEOUT;
                a aVar = b.f23566i;
                c2789b.y(9, aVar, zzieVar);
                tVar.b(aVar, zzbt.G());
            }
        }, c2789b.r(), c2789b.f()) == null) {
            com.android.billingclient.api.a aVarU = c2789b.u();
            c2789b.y(9, aVarU, zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC);
            tVar.b(aVarU, zzbt.G());
        }
        obj = c2693i.p();
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            if (this.this$0.f30284c.h()) {
                this.this$0.o("failure");
                E8.a.d(this.$continuation, new C8.a.C0024a(PurchaseProvider.PurchaseException.PendingPayment.f30590b));
                this.this$0.f30284c.d0(false);
            } else {
                E8.a.d(this.$continuation, new C8.a.b(Boolean.TRUE));
            }
            u.g(this.this$0);
        } else {
            InterfaceC2691h<C8.a<Boolean>> interfaceC2691h2 = this.$continuation;
            u uVar2 = this.this$0;
            this.L$0 = interfaceC2691h2;
            this.label = 2;
            obj = u.l(uVar2, list, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC2691h = interfaceC2691h2;
            E8.a.d(interfaceC2691h, obj);
            u.g(this.this$0);
        }
        return p293xa.r.f47939a;
    }
}
