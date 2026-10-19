package com.airbnb.lottie.compose;

import Ia.p;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlin.text.m;
import kotlin.text.n;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: rememberLottieComposition.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadImagesFromAssets$2", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
final class RememberLottieCompositionKt$loadImagesFromAssets$2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ p079g3.b $composition;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $imageAssetsFolder;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberLottieCompositionKt$loadImagesFromAssets$2(p079g3.b bVar, Context context, String str, kotlin.coroutines.c<? super RememberLottieCompositionKt$loadImagesFromAssets$2> cVar) {
        super(2, cVar);
        this.$composition = bVar;
        this.$context = context;
        this.$imageAssetsFolder = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new RememberLottieCompositionKt$loadImagesFromAssets$2(this.$composition, this.$context, this.$imageAssetsFolder, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((RememberLottieCompositionKt$loadImagesFromAssets$2) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        for (p079g3.p asset : this.$composition.f35555d.values()) {
            i.d(asset, "asset");
            Bitmap bitmap = asset.f35590d;
            String str = asset.f35589c;
            if (bitmap == null && m.I(str, "data:", false) && n.Q(str, "base64,", 0, false, 6) > 0) {
                try {
                    String strSubstring = str.substring(n.P(str, ',', 0, false, 6) + 1);
                    i.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                    byte[] bArrDecode = Base64.decode(strSubstring, 0);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    asset.f35590d = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                } catch (IllegalArgumentException e10) {
                    p214r3.c.c("data URL did not have correct base64 format.", e10);
                }
            }
            Context context = this.$context;
            String str2 = this.$imageAssetsFolder;
            if (asset.f35590d == null && str2 != null) {
                try {
                    InputStream inputStreamOpen = context.getAssets().open(str2 + str);
                    i.d(inputStreamOpen, "try {\n        context.as…, e)\n        return\n    }");
                    try {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inScaled = true;
                        options2.inDensity = 160;
                        asset.f35590d = p214r3.g.e(BitmapFactory.decodeStream(inputStreamOpen, null, options2), asset.f35587a, asset.f35588b);
                    } catch (IllegalArgumentException e11) {
                        p214r3.c.c("Unable to decode image.", e11);
                    }
                } catch (IOException e12) {
                    p214r3.c.c("Unable to open asset.", e12);
                }
            }
        }
        return r.f47939a;
    }
}
