package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.InterfaceC0906f;
import androidx.compose.animation.core.T;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ScrollExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", l = {R.styleable.AppCompatTheme_autoCompleteTextViewStyle}, m = "invokeSuspend")
final class ScrollExtensionsKt$animateScrollBy$2 extends SuspendLambda implements Ia.p<s, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ InterfaceC0906f<Float> $animationSpec;
    final /* synthetic */ Ref$FloatRef $previousValue;
    final /* synthetic */ float $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$animateScrollBy$2(float f10, InterfaceC0906f<Float> interfaceC0906f, Ref$FloatRef ref$FloatRef, kotlin.coroutines.c<? super ScrollExtensionsKt$animateScrollBy$2> cVar) {
        super(2, cVar);
        this.$value = f10;
        this.$animationSpec = interfaceC0906f;
        this.$previousValue = ref$FloatRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ScrollExtensionsKt$animateScrollBy$2 scrollExtensionsKt$animateScrollBy$2 = new ScrollExtensionsKt$animateScrollBy$2(this.$value, this.$animationSpec, this.$previousValue, cVar);
        scrollExtensionsKt$animateScrollBy$2.L$0 = obj;
        return scrollExtensionsKt$animateScrollBy$2;
    }

    @Override // Ia.p
    public final Object invoke(s sVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((ScrollExtensionsKt$animateScrollBy$2) create(sVar, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            final s sVar = (s) this.L$0;
            float f10 = this.$value;
            InterfaceC0906f<Float> interfaceC0906f = this.$animationSpec;
            final Ref$FloatRef ref$FloatRef = this.$previousValue;
            Ia.p<Float, Float, p293xa.r> pVar = new Ia.p<Float, Float, p293xa.r>() { // from class: androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(Float f11, Float f12) {
                    float fFloatValue = f11.floatValue();
                    f12.floatValue();
                    Ref$FloatRef ref$FloatRef2 = ref$FloatRef;
                    float f13 = ref$FloatRef2.element;
                    ref$FloatRef2.element = sVar.f(fFloatValue - f13) + f13;
                    return p293xa.r.f47939a;
                }
            };
            this.label = 1;
            if (T.c(0.0f, f10, interfaceC0906f, pVar, this, 4) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p293xa.r.f47939a;
    }
}
