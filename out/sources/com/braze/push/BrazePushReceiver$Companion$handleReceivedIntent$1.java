package com.braze.push;

import Aa.c;
import Ia.p;
import android.content.Context;
import android.content.Intent;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: BrazePushReceiver.kt */
/* JADX INFO: loaded from: classes.dex */
@c(c = "com.braze.push.BrazePushReceiver$Companion$handleReceivedIntent$1", f = "BrazePushReceiver.kt", l = {}, m = "invokeSuspend")
public final class BrazePushReceiver$Companion$handleReceivedIntent$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Intent $intent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazePushReceiver$Companion$handleReceivedIntent$1(Context context, Intent intent, kotlin.coroutines.c<? super BrazePushReceiver$Companion$handleReceivedIntent$1> cVar) {
        super(2, cVar);
        this.$context = context;
        this.$intent = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new BrazePushReceiver$Companion$handleReceivedIntent$1(this.$context, this.$intent, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b.b(obj);
        BrazePushReceiver.Companion companion = BrazePushReceiver.Companion;
        Context applicationContext = this.$context.getApplicationContext();
        i.d(applicationContext, "context.applicationContext");
        companion.handlePush(applicationContext, this.$intent);
        return r.f47939a;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((BrazePushReceiver$Companion$handleReceivedIntent$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }
}
