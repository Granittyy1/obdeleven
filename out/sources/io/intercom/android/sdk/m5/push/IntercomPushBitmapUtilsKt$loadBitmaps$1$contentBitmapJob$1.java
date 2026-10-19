package io.intercom.android.sdk.m5.push;

import Ia.p;
import android.content.Context;
import android.graphics.Bitmap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: IntercomPushBitmapUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "io.intercom.android.sdk.m5.push.IntercomPushBitmapUtilsKt$loadBitmaps$1$contentBitmapJob$1", f = "IntercomPushBitmapUtils.kt", l = {}, m = "invokeSuspend")
public final class IntercomPushBitmapUtilsKt$loadBitmaps$1$contentBitmapJob$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ Ref$ObjectRef<Bitmap> $contentBitmap;
    final /* synthetic */ String $contentImageUrl;
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercomPushBitmapUtilsKt$loadBitmaps$1$contentBitmapJob$1(Ref$ObjectRef<Bitmap> ref$ObjectRef, Context context, String str, kotlin.coroutines.c<? super IntercomPushBitmapUtilsKt$loadBitmaps$1$contentBitmapJob$1> cVar) {
        super(2, cVar);
        this.$contentBitmap = ref$ObjectRef;
        this.$context = context;
        this.$contentImageUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new IntercomPushBitmapUtilsKt$loadBitmaps$1$contentBitmapJob$1(this.$contentBitmap, this.$context, this.$contentImageUrl, cVar);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, android.graphics.Bitmap] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        this.$contentBitmap.element = IntercomPushBitmapUtilsKt.loadContentBitmapBlocking(this.$context, this.$contentImageUrl);
        return r.f47939a;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((IntercomPushBitmapUtilsKt$loadBitmaps$1$contentBitmapJob$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }
}
