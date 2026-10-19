package com.voltasit.obdeleven.notifications;

import Ia.p;
import com.voltasit.obdeleven.domain.usecases.user.C;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: MyFirebaseMessagingService.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.notifications.MyFirebaseMessagingService$handleParseMessage$2", f = "MyFirebaseMessagingService.kt", l = {R.styleable.AppCompatTheme_textAppearanceListItemSecondary}, m = "invokeSuspend")
final class MyFirebaseMessagingService$handleParseMessage$2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ MyFirebaseMessagingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyFirebaseMessagingService$handleParseMessage$2(MyFirebaseMessagingService myFirebaseMessagingService, kotlin.coroutines.c<? super MyFirebaseMessagingService$handleParseMessage$2> cVar) {
        super(2, cVar);
        this.this$0 = myFirebaseMessagingService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new MyFirebaseMessagingService$handleParseMessage$2(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((MyFirebaseMessagingService$handleParseMessage$2) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, xa.g] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            C c10 = (C) this.this$0.f31201e.getValue();
            this.label = 1;
            if (c10.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return r.f47939a;
    }
}
