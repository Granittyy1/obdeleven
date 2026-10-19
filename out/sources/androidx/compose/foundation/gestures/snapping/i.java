package androidx.compose.foundation.gestures.snapping;

import D2.V;
import Ia.l;
import androidx.compose.animation.core.C0905e;
import androidx.compose.animation.core.C0908h;
import androidx.compose.animation.core.C0909i;
import androidx.compose.animation.core.InterfaceC0906f;
import androidx.compose.animation.core.InterfaceC0918s;
import androidx.compose.animation.core.T;
import androidx.compose.foundation.gestures.s;
import androidx.compose.runtime.C1085f0;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import p293xa.r;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f10049a = CarouselScreenFragment.CAROUSEL_ANIMATION_MS;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(final s sVar, final float f10, C0908h c0908h, InterfaceC0918s interfaceC0918s, final l lVar, ContinuationImpl continuationImpl) {
        SnapFlingBehaviorKt$animateDecay$1 snapFlingBehaviorKt$animateDecay$1;
        Ref$FloatRef ref$FloatRef;
        if (continuationImpl instanceof SnapFlingBehaviorKt$animateDecay$1) {
            snapFlingBehaviorKt$animateDecay$1 = (SnapFlingBehaviorKt$animateDecay$1) continuationImpl;
            int i10 = snapFlingBehaviorKt$animateDecay$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                snapFlingBehaviorKt$animateDecay$1.label = i10 - Integer.MIN_VALUE;
            } else {
                snapFlingBehaviorKt$animateDecay$1 = new SnapFlingBehaviorKt$animateDecay$1(continuationImpl);
            }
        } else {
            snapFlingBehaviorKt$animateDecay$1 = new SnapFlingBehaviorKt$animateDecay$1(continuationImpl);
        }
        Object obj = snapFlingBehaviorKt$animateDecay$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = snapFlingBehaviorKt$animateDecay$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            final Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            boolean z10 = ((Number) c0908h.e()).floatValue() == 0.0f;
            l<C0905e<Float, C0909i>, r> lVar2 = new l<C0905e<Float, C0909i>, r>() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ia.l
                public final r invoke(C0905e<Float, C0909i> c0905e) {
                    C0905e<Float, C0909i> c0905e2 = c0905e;
                    float fAbs = Math.abs(((Number) c0905e2.f9535e.getValue()).floatValue());
                    float fAbs2 = Math.abs(f10);
                    C1085f0 c1085f0 = c0905e2.f9535e;
                    if (fAbs >= fAbs2) {
                        float fD = i.d(((Number) c1085f0.getValue()).floatValue(), f10);
                        i.b(c0905e2, sVar, lVar, fD - ref$FloatRef2.element);
                        c0905e2.a();
                        ref$FloatRef2.element = fD;
                    } else {
                        i.b(c0905e2, sVar, lVar, ((Number) c1085f0.getValue()).floatValue() - ref$FloatRef2.element);
                        ref$FloatRef2.element = ((Number) c1085f0.getValue()).floatValue();
                    }
                    return r.f47939a;
                }
            };
            snapFlingBehaviorKt$animateDecay$1.L$0 = c0908h;
            snapFlingBehaviorKt$animateDecay$1.L$1 = ref$FloatRef2;
            snapFlingBehaviorKt$animateDecay$1.F$0 = f10;
            snapFlingBehaviorKt$animateDecay$1.label = 1;
            if (T.d(c0908h, interfaceC0918s, !z10, lVar2, snapFlingBehaviorKt$animateDecay$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$FloatRef = ref$FloatRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f10 = snapFlingBehaviorKt$animateDecay$1.F$0;
            ref$FloatRef = (Ref$FloatRef) snapFlingBehaviorKt$animateDecay$1.L$1;
            c0908h = (C0908h) snapFlingBehaviorKt$animateDecay$1.L$0;
            kotlin.b.b(obj);
        }
        return new a(new Float(f10 - ref$FloatRef.element), c0908h);
    }

    public static final void b(C0905e c0905e, s sVar, l lVar, float f10) {
        float f11;
        try {
            f11 = sVar.f(f10);
        } catch (CancellationException unused) {
            c0905e.a();
            f11 = 0.0f;
        }
        lVar.invoke(Float.valueOf(f11));
        if (Math.abs(f10 - f11) > 0.5f) {
            c0905e.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object c(final s sVar, float f10, final float f11, C0908h c0908h, InterfaceC0906f interfaceC0906f, final l lVar, ContinuationImpl continuationImpl) {
        SnapFlingBehaviorKt$animateWithTarget$1 snapFlingBehaviorKt$animateWithTarget$1;
        Ref$FloatRef ref$FloatRef;
        float f12;
        if (continuationImpl instanceof SnapFlingBehaviorKt$animateWithTarget$1) {
            snapFlingBehaviorKt$animateWithTarget$1 = (SnapFlingBehaviorKt$animateWithTarget$1) continuationImpl;
            int i10 = snapFlingBehaviorKt$animateWithTarget$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                snapFlingBehaviorKt$animateWithTarget$1.label = i10 - Integer.MIN_VALUE;
            } else {
                snapFlingBehaviorKt$animateWithTarget$1 = new SnapFlingBehaviorKt$animateWithTarget$1(continuationImpl);
            }
        } else {
            snapFlingBehaviorKt$animateWithTarget$1 = new SnapFlingBehaviorKt$animateWithTarget$1(continuationImpl);
        }
        SnapFlingBehaviorKt$animateWithTarget$1 snapFlingBehaviorKt$animateWithTarget$2 = snapFlingBehaviorKt$animateWithTarget$1;
        Object obj = snapFlingBehaviorKt$animateWithTarget$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = snapFlingBehaviorKt$animateWithTarget$2.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            final Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            float fFloatValue = ((Number) c0908h.e()).floatValue();
            Float f13 = new Float(f10);
            boolean z10 = ((Number) c0908h.e()).floatValue() == 0.0f;
            l<C0905e<Float, C0909i>, r> lVar2 = new l<C0905e<Float, C0909i>, r>() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ia.l
                public final r invoke(C0905e<Float, C0909i> c0905e) {
                    float f14;
                    C0905e<Float, C0909i> c0905e2 = c0905e;
                    float fD = i.d(((Number) c0905e2.f9535e.getValue()).floatValue(), f11);
                    float f15 = fD - ref$FloatRef2.element;
                    try {
                        f14 = sVar.f(f15);
                    } catch (CancellationException unused) {
                        c0905e2.a();
                        f14 = 0.0f;
                    }
                    lVar.invoke(Float.valueOf(f14));
                    if (Math.abs(f15 - f14) > 0.5f || fD != ((Number) c0905e2.f9535e.getValue()).floatValue()) {
                        c0905e2.a();
                    }
                    ref$FloatRef2.element += f14;
                    return r.f47939a;
                }
            };
            snapFlingBehaviorKt$animateWithTarget$2.L$0 = c0908h;
            snapFlingBehaviorKt$animateWithTarget$2.L$1 = ref$FloatRef2;
            snapFlingBehaviorKt$animateWithTarget$2.F$0 = f10;
            snapFlingBehaviorKt$animateWithTarget$2.F$1 = fFloatValue;
            snapFlingBehaviorKt$animateWithTarget$2.label = 1;
            if (T.e(c0908h, f13, interfaceC0906f, !z10, lVar2, snapFlingBehaviorKt$animateWithTarget$2) == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$FloatRef = ref$FloatRef2;
            f12 = fFloatValue;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f12 = snapFlingBehaviorKt$animateWithTarget$2.F$1;
            f10 = snapFlingBehaviorKt$animateWithTarget$2.F$0;
            ref$FloatRef = (Ref$FloatRef) snapFlingBehaviorKt$animateWithTarget$2.L$1;
            c0908h = (C0908h) snapFlingBehaviorKt$animateWithTarget$2.L$0;
            kotlin.b.b(obj);
        }
        return new a(new Float(f10 - ref$FloatRef.element), V.h(c0908h, 0.0f, d(((Number) c0908h.e()).floatValue(), f12), 29));
    }

    public static final float d(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        return f11 > 0.0f ? Na.l.z(f10, f11) : Na.l.x(f10, f11);
    }
}
