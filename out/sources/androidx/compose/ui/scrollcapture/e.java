package androidx.compose.ui.scrollcapture;

import Ia.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p293xa.r;

/* JADX INFO: compiled from: ComposeScrollCaptureCallback.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p<Float, kotlin.coroutines.c<? super Float>, Object> f15123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f15124c;

    /* JADX WARN: Multi-variable type inference failed */
    public e(int i10, p<? super Float, ? super kotlin.coroutines.c<? super Float>, ? extends Object> pVar) {
        this.f15122a = i10;
        this.f15123b = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(float f10, ContinuationImpl continuationImpl) {
        RelativeScroller$scrollBy$1 relativeScroller$scrollBy$1;
        e eVar;
        if (continuationImpl instanceof RelativeScroller$scrollBy$1) {
            relativeScroller$scrollBy$1 = (RelativeScroller$scrollBy$1) continuationImpl;
            int i10 = relativeScroller$scrollBy$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                relativeScroller$scrollBy$1.label = i10 - Integer.MIN_VALUE;
            } else {
                relativeScroller$scrollBy$1 = new RelativeScroller$scrollBy$1(this, continuationImpl);
            }
        } else {
            relativeScroller$scrollBy$1 = new RelativeScroller$scrollBy$1(this, continuationImpl);
        }
        Object objInvoke = relativeScroller$scrollBy$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = relativeScroller$scrollBy$1.label;
        if (i11 == 0) {
            kotlin.b.b(objInvoke);
            Float f11 = new Float(f10);
            relativeScroller$scrollBy$1.L$0 = this;
            relativeScroller$scrollBy$1.label = 1;
            objInvoke = ((ComposeScrollCaptureCallback$scrollTracker$1) this.f15123b).invoke(f11, relativeScroller$scrollBy$1);
            if (objInvoke == coroutineSingletons) {
                return coroutineSingletons;
            }
            eVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = (e) relativeScroller$scrollBy$1.L$0;
            kotlin.b.b(objInvoke);
        }
        eVar.f15124c += ((Number) objInvoke).floatValue();
        return r.f47939a;
    }
}
