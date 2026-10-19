package com.airbnb.lottie.compose;

import Ia.p;
import Ia.q;
import android.content.Context;
import androidx.compose.runtime.X;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: rememberLottieComposition.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3", f = "rememberLottieComposition.kt", l = {R.styleable.AppCompatTheme_radioButtonStyle, R.styleable.AppCompatTheme_ratingBarStyleIndicator}, m = "invokeSuspend")
final class RememberLottieCompositionKt$rememberLottieComposition$3 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ String $cacheKey;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $fontAssetsFolder;
    final /* synthetic */ String $fontFileExtension;
    final /* synthetic */ String $imageAssetsFolder;
    final /* synthetic */ q<Integer, Throwable, kotlin.coroutines.c<? super Boolean>, Object> $onRetry;
    final /* synthetic */ X<LottieCompositionResultImpl> $result$delegate;
    final /* synthetic */ d $spec;
    int I$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RememberLottieCompositionKt$rememberLottieComposition$3(q<? super Integer, ? super Throwable, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> qVar, Context context, d dVar, String str, String str2, String str3, String str4, X<LottieCompositionResultImpl> x10, kotlin.coroutines.c<? super RememberLottieCompositionKt$rememberLottieComposition$3> cVar) {
        super(2, cVar);
        this.$onRetry = qVar;
        this.$context = context;
        this.$spec = dVar;
        this.$imageAssetsFolder = str;
        this.$fontAssetsFolder = str2;
        this.$fontFileExtension = str3;
        this.$cacheKey = str4;
        this.$result$delegate = x10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new RememberLottieCompositionKt$rememberLottieComposition$3(this.$onRetry, this.$context, this.$spec, this.$imageAssetsFolder, this.$fontAssetsFolder, this.$fontFileExtension, this.$cacheKey, this.$result$delegate, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((RememberLottieCompositionKt$rememberLottieComposition$3) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0062 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0075 A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:7:0x0014, B:53:0x00cf, B:54:0x00d9, B:57:0x00ed, B:23:0x006b, B:25:0x0075, B:28:0x007c, B:33:0x008b, B:35:0x008f, B:38:0x0096, B:43:0x00a6, B:50:0x00be, B:46:0x00af, B:49:0x00b9, B:41:0x009d, B:31:0x0083, B:60:0x00fa, B:64:0x00ff, B:55:0x00da, B:59:0x00f0), top: B:85:0x0014, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x008f A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:7:0x0014, B:53:0x00cf, B:54:0x00d9, B:57:0x00ed, B:23:0x006b, B:25:0x0075, B:28:0x007c, B:33:0x008b, B:35:0x008f, B:38:0x0096, B:43:0x00a6, B:50:0x00be, B:46:0x00af, B:49:0x00b9, B:41:0x009d, B:31:0x0083, B:60:0x00fa, B:64:0x00ff, B:55:0x00da, B:59:0x00f0), top: B:85:0x0014, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x00af A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:7:0x0014, B:53:0x00cf, B:54:0x00d9, B:57:0x00ed, B:23:0x006b, B:25:0x0075, B:28:0x007c, B:33:0x008b, B:35:0x008f, B:38:0x0096, B:43:0x00a6, B:50:0x00be, B:46:0x00af, B:49:0x00b9, B:41:0x009d, B:31:0x0083, B:60:0x00fa, B:64:0x00ff, B:55:0x00da, B:59:0x00f0), top: B:85:0x0014, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ed A[Catch: all -> 0x0019, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0019, blocks: (B:7:0x0014, B:53:0x00cf, B:54:0x00d9, B:57:0x00ed, B:23:0x006b, B:25:0x0075, B:28:0x007c, B:33:0x008b, B:35:0x008f, B:38:0x0096, B:43:0x00a6, B:50:0x00be, B:46:0x00af, B:49:0x00b9, B:41:0x009d, B:31:0x0083, B:60:0x00fa, B:64:0x00ff, B:55:0x00da, B:59:0x00f0), top: B:85:0x0014, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f0 A[Catch: all -> 0x00fd, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:55:0x00da, B:59:0x00f0), top: B:87:0x00da, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00cc -> B:53:0x00cf). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
