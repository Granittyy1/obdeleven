package coil.decode;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: ImageDecoderDecoder.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "coil.decode.ImageDecoderDecoder", f = "ImageDecoderDecoder.kt", l = {158}, m = "wrapDrawable")
final class ImageDecoderDecoder$wrapDrawable$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ImageDecoderDecoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageDecoderDecoder$wrapDrawable$1(ImageDecoderDecoder imageDecoderDecoder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = imageDecoderDecoder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
