package com.voltasit.obdeleven.presentation.profile;

import Ia.p;
import android.app.Activity;
import androidx.lifecycle.Z;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: SubscriptionPurchaseViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.profile.SubscriptionPurchaseViewModel$init$1", f = "SubscriptionPurchaseViewModel.kt", l = {R.styleable.AppCompatTheme_buttonBarButtonStyle, R.styleable.AppCompatTheme_buttonStyle}, m = "invokeSuspend")
final class SubscriptionPurchaseViewModel$init$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ Activity $activity;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionPurchaseViewModel$init$1(m mVar, Activity activity, kotlin.coroutines.c<? super SubscriptionPurchaseViewModel$init$1> cVar) {
        super(2, cVar);
        this.this$0 = mVar;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SubscriptionPurchaseViewModel$init$1(this.this$0, this.$activity, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((SubscriptionPurchaseViewModel$init$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.b.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            aVar = (C8.a) obj;
            if (aVar instanceof C8.a.C0024a) {
                this.this$0.f32929e.j(r.f47939a);
            } else if (aVar instanceof C8.a.b) {
                this.this$0.f32933i.setValue(((C8.a.b) aVar).f2463a);
            }
            this.this$0.f32931g.setValue(Boolean.FALSE);
            return r.f47939a;
        }
        kotlin.b.b(obj);
        m mVar = this.this$0;
        com.voltasit.obdeleven.domain.usecases.iap.a aVar2 = mVar.f32928d;
        Activity activity = this.$activity;
        p040d1.a aVarA = Z.a(mVar);
        this.label = 1;
        obj = aVar2.f30853a.b(activity, mVar.f32925a, aVarA, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        C8.a aVar3 = (C8.a) obj;
        if (aVar3 instanceof C8.a.C0024a) {
            this.this$0.f32929e.j(r.f47939a);
        } else if (aVar3 instanceof C8.a.b) {
            this.this$0.f32934k.setValue(((C8.a.b) aVar3).f2463a);
        }
        m mVar2 = this.this$0;
        com.voltasit.obdeleven.domain.usecases.iap.c cVar = mVar2.f32927c;
        this.label = 2;
        obj = cVar.a(mVar2.f32926b, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar = (C8.a) obj;
        if (aVar instanceof C8.a.C0024a) {
            this.this$0.f32929e.j(r.f47939a);
        } else if (aVar instanceof C8.a.b) {
            this.this$0.f32933i.setValue(((C8.a.b) aVar).f2463a);
        }
        this.this$0.f32931g.setValue(Boolean.FALSE);
        return r.f47939a;
    }
}
