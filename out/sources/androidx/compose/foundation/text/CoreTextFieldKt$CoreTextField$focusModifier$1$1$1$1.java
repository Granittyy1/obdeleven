package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1", f = "CoreTextField.kt", l = {330}, m = "invokeSuspend")
final class CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ androidx.compose.foundation.relocation.a $bringIntoViewRequester;
    final /* synthetic */ A $layoutResult;
    final /* synthetic */ androidx.compose.ui.text.input.r $offsetMapping;
    final /* synthetic */ LegacyTextFieldState $state;
    final /* synthetic */ TextFieldValue $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(androidx.compose.foundation.relocation.a aVar, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, A a10, androidx.compose.ui.text.input.r rVar, kotlin.coroutines.c<? super CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1> cVar) {
        super(2, cVar);
        this.$bringIntoViewRequester = aVar;
        this.$value = textFieldValue;
        this.$state = legacyTextFieldState;
        this.$layoutResult = a10;
        this.$offsetMapping = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(this.$bringIntoViewRequester, this.$value, this.$state, this.$layoutResult, this.$offsetMapping, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        I.f fVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            androidx.compose.foundation.relocation.a aVar = this.$bringIntoViewRequester;
            TextFieldValue textFieldValue = this.$value;
            r rVar = this.$state.f11177a;
            androidx.compose.ui.text.B b10 = this.$layoutResult.f11055a;
            androidx.compose.ui.text.input.r rVar2 = this.$offsetMapping;
            this.label = 1;
            int iB = rVar2.b(androidx.compose.ui.text.E.d(textFieldValue.f15492b));
            if (iB < b10.f15300a.f15276a.f15408c.length()) {
                fVar = b10.b(iB);
            } else if (iB != 0) {
                fVar = b10.b(iB - 1);
            } else {
                fVar = new I.f(0.0f, 0.0f, 1.0f, (int) (w.a(rVar.f11521b, rVar.f11526g, rVar.f11527h, w.f11633a, 1) & 4294967295L));
            }
            Object objA = aVar.a(fVar, this);
            if (objA != coroutineSingletons) {
                objA = p293xa.r.f47939a;
            }
            if (objA == coroutineSingletons) {
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
