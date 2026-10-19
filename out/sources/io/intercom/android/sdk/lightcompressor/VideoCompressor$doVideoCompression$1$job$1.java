package io.intercom.android.sdk.lightcompressor;

import Aa.c;
import Ia.p;
import android.content.Context;
import android.net.Uri;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: VideoCompressor.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "io.intercom.android.sdk.lightcompressor.VideoCompressor$doVideoCompression$1$job$1", f = "VideoCompressor.kt", l = {}, m = "invokeSuspend")
public final class VideoCompressor$doVideoCompression$1$job$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super String>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ int $i;
    final /* synthetic */ List<Uri> $uris;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VideoCompressor$doVideoCompression$1$job$1(Context context, List<? extends Uri> list, int i10, kotlin.coroutines.c<? super VideoCompressor$doVideoCompression$1$job$1> cVar) {
        super(2, cVar);
        this.$context = context;
        this.$uris = list;
        this.$i = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new VideoCompressor$doVideoCompression$1$job$1(this.$context, this.$uris, this.$i, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b.b(obj);
        return VideoCompressor.INSTANCE.getMediaPath(this.$context, this.$uris.get(this.$i));
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super String> cVar) {
        return ((VideoCompressor$doVideoCompression$1$job$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }
}
