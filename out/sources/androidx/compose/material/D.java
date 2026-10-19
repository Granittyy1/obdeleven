package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0909i;
import androidx.compose.animation.core.VectorConvertersKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: FloatingActionButton.kt */
/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f11717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f11718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f11719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f11720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Animatable<p013b0.f, C0909i> f11721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.compose.foundation.interaction.i f11722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.compose.foundation.interaction.i f11723g;

    public D(float f10, float f11, float f12, float f13) {
        this.f11717a = f10;
        this.f11718b = f11;
        this.f11719c = f12;
        this.f11720d = f13;
        this.f11721e = new Animatable<>(new p013b0.f(f10), VectorConvertersKt.f9479c, null, 12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(androidx.compose.foundation.interaction.i iVar, ContinuationImpl continuationImpl) throws Throwable {
        FloatingActionButtonElevationAnimatable$animateElevation$1 floatingActionButtonElevationAnimatable$animateElevation$1;
        float f10;
        D d10;
        Animatable<p013b0.f, C0909i> animatable = this.f11721e;
        if (continuationImpl instanceof FloatingActionButtonElevationAnimatable$animateElevation$1) {
            floatingActionButtonElevationAnimatable$animateElevation$1 = (FloatingActionButtonElevationAnimatable$animateElevation$1) continuationImpl;
            int i10 = floatingActionButtonElevationAnimatable$animateElevation$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                floatingActionButtonElevationAnimatable$animateElevation$1.label = i10 - Integer.MIN_VALUE;
            } else {
                floatingActionButtonElevationAnimatable$animateElevation$1 = new FloatingActionButtonElevationAnimatable$animateElevation$1(this, continuationImpl);
            }
        } else {
            floatingActionButtonElevationAnimatable$animateElevation$1 = new FloatingActionButtonElevationAnimatable$animateElevation$1(this, continuationImpl);
        }
        Object obj = floatingActionButtonElevationAnimatable$animateElevation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = floatingActionButtonElevationAnimatable$animateElevation$1.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = (androidx.compose.foundation.interaction.i) floatingActionButtonElevationAnimatable$animateElevation$1.L$1;
            d10 = (D) floatingActionButtonElevationAnimatable$animateElevation$1.L$0;
            try {
                kotlin.b.b(obj);
                d10.f11722f = iVar;
                return p293xa.r.f47939a;
            } catch (Throwable th) {
                th = th;
                d10.f11722f = iVar;
                throw th;
            }
        }
        kotlin.b.b(obj);
        if (iVar instanceof androidx.compose.foundation.interaction.m.b) {
            f10 = this.f11718b;
        } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
            f10 = this.f11719c;
        } else {
            f10 = iVar instanceof androidx.compose.foundation.interaction.d ? this.f11720d : this.f11717a;
        }
        this.f11723g = iVar;
        try {
            if (!p013b0.f.a(((p013b0.f) animatable.f9340e.getValue()).f20481b, f10)) {
                androidx.compose.foundation.interaction.i iVar2 = this.f11722f;
                floatingActionButtonElevationAnimatable$animateElevation$1.L$0 = this;
                floatingActionButtonElevationAnimatable$animateElevation$1.L$1 = iVar;
                floatingActionButtonElevationAnimatable$animateElevation$1.label = 1;
                if (x.a(animatable, f10, iVar2, iVar, floatingActionButtonElevationAnimatable$animateElevation$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            d10 = this;
            d10.f11722f = iVar;
            return p293xa.r.f47939a;
        } catch (Throwable th2) {
            th = th2;
            d10 = this;
            d10.f11722f = iVar;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(ContinuationImpl continuationImpl) throws Throwable {
        FloatingActionButtonElevationAnimatable$snapElevation$1 floatingActionButtonElevationAnimatable$snapElevation$1;
        float f10;
        D d10;
        if (continuationImpl instanceof FloatingActionButtonElevationAnimatable$snapElevation$1) {
            floatingActionButtonElevationAnimatable$snapElevation$1 = (FloatingActionButtonElevationAnimatable$snapElevation$1) continuationImpl;
            int i10 = floatingActionButtonElevationAnimatable$snapElevation$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                floatingActionButtonElevationAnimatable$snapElevation$1.label = i10 - Integer.MIN_VALUE;
            } else {
                floatingActionButtonElevationAnimatable$snapElevation$1 = new FloatingActionButtonElevationAnimatable$snapElevation$1(this, continuationImpl);
            }
        } else {
            floatingActionButtonElevationAnimatable$snapElevation$1 = new FloatingActionButtonElevationAnimatable$snapElevation$1(this, continuationImpl);
        }
        Object obj = floatingActionButtonElevationAnimatable$snapElevation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = floatingActionButtonElevationAnimatable$snapElevation$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            androidx.compose.foundation.interaction.i iVar = this.f11723g;
            if (iVar instanceof androidx.compose.foundation.interaction.m.b) {
                f10 = this.f11718b;
            } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
                f10 = this.f11719c;
            } else {
                f10 = iVar instanceof androidx.compose.foundation.interaction.d ? this.f11720d : this.f11717a;
            }
            Animatable<p013b0.f, C0909i> animatable = this.f11721e;
            if (!p013b0.f.a(((p013b0.f) animatable.f9340e.getValue()).f20481b, f10)) {
                try {
                    p013b0.f fVar = new p013b0.f(f10);
                    floatingActionButtonElevationAnimatable$snapElevation$1.L$0 = this;
                    floatingActionButtonElevationAnimatable$snapElevation$1.label = 1;
                    if (animatable.e(fVar, floatingActionButtonElevationAnimatable$snapElevation$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    d10 = this;
                    d10.f11722f = d10.f11723g;
                } catch (Throwable th) {
                    th = th;
                    d10 = this;
                    d10.f11722f = d10.f11723g;
                    throw th;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d10 = (D) floatingActionButtonElevationAnimatable$snapElevation$1.L$0;
            try {
                kotlin.b.b(obj);
                d10.f11722f = d10.f11723g;
            } catch (Throwable th2) {
                th = th2;
                d10.f11722f = d10.f11723g;
                throw th;
            }
        }
        return p293xa.r.f47939a;
    }
}
