package androidx.compose.ui.scrollcapture;

import C4.v;
import Ia.p;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.j;
import androidx.compose.ui.semantics.k;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: ComposeScrollCaptureCallback.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", l = {R.styleable.AppCompatTheme_panelMenuListWidth}, m = "invokeSuspend")
final class ComposeScrollCaptureCallback$scrollTracker$1 extends SuspendLambda implements p<Float, kotlin.coroutines.c<? super Float>, Object> {
    /* synthetic */ float F$0;
    boolean Z$0;
    int label;
    final /* synthetic */ ComposeScrollCaptureCallback this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$scrollTracker$1(ComposeScrollCaptureCallback composeScrollCaptureCallback, kotlin.coroutines.c<? super ComposeScrollCaptureCallback$scrollTracker$1> cVar) {
        super(2, cVar);
        this.this$0 = composeScrollCaptureCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ComposeScrollCaptureCallback$scrollTracker$1 composeScrollCaptureCallback$scrollTracker$1 = new ComposeScrollCaptureCallback$scrollTracker$1(this.this$0, cVar);
        composeScrollCaptureCallback$scrollTracker$1.F$0 = ((Number) obj).floatValue();
        return composeScrollCaptureCallback$scrollTracker$1;
    }

    @Override // Ia.p
    public final Object invoke(Float f10, kotlin.coroutines.c<? super Float> cVar) {
        return ((ComposeScrollCaptureCallback$scrollTracker$1) create(Float.valueOf(f10.floatValue()), cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            float f10 = this.F$0;
            p pVar = (p) SemanticsConfigurationKt.a(this.this$0.f15111a.f15242d, k.f15213e);
            if (pVar == null) {
                throw v.g("Required value was null.");
            }
            boolean z11 = ((j) this.this$0.f15111a.f15242d.q(SemanticsProperties.f15166t)).f15206c;
            if (z11) {
                f10 = -f10;
            }
            I.d dVar = new I.d((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L));
            this.Z$0 = z11;
            this.label = 1;
            obj = pVar.invoke(dVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            z10 = z11;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = this.Z$0;
            kotlin.b.b(obj);
        }
        long j = ((I.d) obj).f3754a;
        return new Float(z10 ? -Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
