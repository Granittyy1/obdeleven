package coil.decode;

import android.graphics.drawable.Drawable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: ImageDecoderDecoder.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "coil.decode.ImageDecoderDecoder$wrapDrawable$2", f = "ImageDecoderDecoder.kt", l = {}, m = "invokeSuspend")
final class ImageDecoderDecoder$wrapDrawable$2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Drawable $baseDrawable;
    final /* synthetic */ Ia.a<p293xa.r> $onEnd;
    final /* synthetic */ Ia.a<p293xa.r> $onStart;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageDecoderDecoder$wrapDrawable$2(Drawable drawable, Ia.a<p293xa.r> aVar, Ia.a<p293xa.r> aVar2, kotlin.coroutines.c<? super ImageDecoderDecoder$wrapDrawable$2> cVar) {
        super(2, cVar);
        this.$baseDrawable = drawable;
        this.$onStart = aVar;
        this.$onEnd = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ImageDecoderDecoder$wrapDrawable$2(this.$baseDrawable, this.$onStart, this.$onEnd, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((ImageDecoderDecoder$wrapDrawable$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        w.a(this.$baseDrawable).registerAnimationCallback(new coil.util.d(this.$onStart, this.$onEnd));
        return p293xa.r.f47939a;
    }
}
