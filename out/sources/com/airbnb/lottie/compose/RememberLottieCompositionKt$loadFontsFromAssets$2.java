package com.airbnb.lottie.compose;

import Ia.p;
import android.content.Context;
import android.graphics.Typeface;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: rememberLottieComposition.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadFontsFromAssets$2", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
final class RememberLottieCompositionKt$loadFontsFromAssets$2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ p079g3.b $composition;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $fontAssetsFolder;
    final /* synthetic */ String $fontFileExtension;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberLottieCompositionKt$loadFontsFromAssets$2(p079g3.b bVar, Context context, String str, String str2, kotlin.coroutines.c<? super RememberLottieCompositionKt$loadFontsFromAssets$2> cVar) {
        super(2, cVar);
        this.$composition = bVar;
        this.$context = context;
        this.$fontAssetsFolder = str;
        this.$fontFileExtension = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new RememberLottieCompositionKt$loadFontsFromAssets$2(this.$composition, this.$context, this.$fontAssetsFolder, this.$fontFileExtension, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((RememberLottieCompositionKt$loadFontsFromAssets$2) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        for (p142l3.b font : this.$composition.f35556e.values()) {
            Context context = this.$context;
            i.d(font, "font");
            String str = this.$fontAssetsFolder;
            String str2 = this.$fontFileExtension;
            StringBuilder sbE = C4.b.e(str);
            String str3 = font.f44345c;
            try {
                Typeface typefaceWithDefaultStyle = Typeface.createFromAsset(context.getAssets(), Q8.d.a(sbE, font.f44343a, str2));
                try {
                    i.d(typefaceWithDefaultStyle, "typefaceWithDefaultStyle");
                    i.d(str3, "font.style");
                    int i10 = 0;
                    boolean zJ = n.J(str3, "Italic", false);
                    boolean zJ2 = n.J(str3, "Bold", false);
                    if (zJ && zJ2) {
                        i10 = 3;
                    } else if (zJ) {
                        i10 = 2;
                    } else if (zJ2) {
                        i10 = 1;
                    }
                    if (typefaceWithDefaultStyle.getStyle() != i10) {
                        typefaceWithDefaultStyle = Typeface.create(typefaceWithDefaultStyle, i10);
                    }
                    font.f44346d = typefaceWithDefaultStyle;
                } catch (Exception unused) {
                    p214r3.c.f46317a.getClass();
                }
            } catch (Exception unused2) {
                p214r3.c.f46317a.getClass();
            }
        }
        return r.f47939a;
    }
}
