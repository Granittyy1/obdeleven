package io.ktor.client.utils;

import Ia.p;
import Ia.q;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.j;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: ByteChannelUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.client.utils.ByteChannelUtilsKt$observable$1", f = "ByteChannelUtils.kt", l = {23, 24, 26, R.styleable.AppCompatTheme_actionModeWebSearchDrawable}, m = "invokeSuspend")
final class ByteChannelUtilsKt$observable$1 extends SuspendLambda implements p<j, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ Long $contentLength;
    final /* synthetic */ q<Long, Long, kotlin.coroutines.c<? super r>, Object> $listener;
    final /* synthetic */ ByteReadChannel $this_observable;
    int I$0;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ByteChannelUtilsKt$observable$1(Long l10, ByteReadChannel byteReadChannel, q<? super Long, ? super Long, ? super kotlin.coroutines.c<? super r>, ? extends Object> qVar, kotlin.coroutines.c<? super ByteChannelUtilsKt$observable$1> cVar) {
        super(2, cVar);
        this.$contentLength = l10;
        this.$this_observable = byteReadChannel;
        this.$listener = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ByteChannelUtilsKt$observable$1 byteChannelUtilsKt$observable$1 = new ByteChannelUtilsKt$observable$1(this.$contentLength, this.$this_observable, this.$listener, cVar);
        byteChannelUtilsKt$observable$1.L$0 = obj;
        return byteChannelUtilsKt$observable$1;
    }

    @Override // Ia.p
    public final Object invoke(j jVar, kotlin.coroutines.c<? super r> cVar) {
        return ((ByteChannelUtilsKt$observable$1) create(jVar, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00e2 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:9:0x001b, B:63:0x01a5, B:39:0x00dc, B:41:0x00e2, B:44:0x00fd, B:56:0x0171, B:60:0x0184), top: B:68:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00fc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x0122 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0123  */
    /* JADX WARN: Code duplicated, block: B:51:0x015b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x015c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x015c -> B:53:0x0169). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.utils.ByteChannelUtilsKt$observable$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
