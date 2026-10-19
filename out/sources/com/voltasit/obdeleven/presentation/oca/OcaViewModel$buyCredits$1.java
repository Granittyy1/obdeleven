package com.voltasit.obdeleven.presentation.oca;

import G8.C0706h;
import Ia.p;
import android.app.Activity;
import androidx.lifecycle.Z;
import com.voltasit.obdeleven.domain.exceptions.RedirectException;
import com.voltasit.obdeleven.domain.providers.PurchaseProvider;
import com.voltasit.obdeleven.domain.usecases.C2113b;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: OcaViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.oca.OcaViewModel$buyCredits$1", f = "OcaViewModel.kt", l = {262}, m = "invokeSuspend")
final class OcaViewModel$buyCredits$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ C0706h $product;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcaViewModel$buyCredits$1(k kVar, Activity activity, C0706h c0706h, kotlin.coroutines.c<? super OcaViewModel$buyCredits$1> cVar) {
        super(2, cVar);
        this.this$0 = kVar;
        this.$activity = activity;
        this.$product = c0706h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OcaViewModel$buyCredits$1(this.this$0, this.$activity, this.$product, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((OcaViewModel$buyCredits$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.this$0.f32113b.j(PreloaderState.c.f32642a);
            k kVar = this.this$0;
            C2113b c2113b = kVar.f32719I;
            Activity activity = this.$activity;
            String str = this.$product.f3501d;
            p040d1.a aVarA = Z.a(kVar);
            this.label = 1;
            obj = c2113b.a(activity, str, aVarA, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        C8.a aVar = (C8.a) obj;
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        if (aVar instanceof C8.a.b) {
            this.this$0.f32745c0.j(r.f47939a);
        } else if (aVar instanceof C8.a.C0024a) {
            k kVar2 = this.this$0;
            C0706h c0706h = this.$product;
            kVar2.getClass();
            Throwable th = ((C8.a.C0024a) aVar).f2462a;
            boolean z10 = th instanceof PurchaseProvider.PurchaseException;
            U7.a<k.a> aVar2 = kVar2.f32741Y;
            if (z10) {
                aVar2.j(new k.a.C0339a(kVar2.f32757o.a((PurchaseProvider.PurchaseException) th)));
            } else if (th instanceof RedirectException) {
                kVar2.f32739W.j(c0706h.f3502e);
            } else {
                aVar2.j(k.a.b.f32781a);
            }
        }
        return r.f47939a;
    }
}
