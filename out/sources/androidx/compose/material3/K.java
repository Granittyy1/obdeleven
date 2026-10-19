package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0909i;
import androidx.compose.animation.core.VectorConvertersKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: FloatingActionButton.kt */
/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f12195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f12196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f12197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f12198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Animatable<p013b0.f, C0909i> f12199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.compose.foundation.interaction.i f12200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.compose.foundation.interaction.i f12201g;

    public K(float f10, float f11, float f12, float f13) {
        this.f12195a = f10;
        this.f12196b = f11;
        this.f12197c = f12;
        this.f12198d = f13;
        this.f12199e = new Animatable<>(new p013b0.f(f10), VectorConvertersKt.f9479c, null, 12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(androidx.compose.foundation.interaction.i iVar, ContinuationImpl continuationImpl) throws Throwable {
        FloatingActionButtonElevationAnimatable$animateElevation$1 floatingActionButtonElevationAnimatable$animateElevation$1;
        float f10;
        K k10;
        Animatable<p013b0.f, C0909i> animatable = this.f12199e;
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
            k10 = (K) floatingActionButtonElevationAnimatable$animateElevation$1.L$0;
            try {
                kotlin.b.b(obj);
                k10.f12200f = iVar;
                return p293xa.r.f47939a;
            } catch (Throwable th) {
                th = th;
                k10.f12200f = iVar;
                throw th;
            }
        }
        kotlin.b.b(obj);
        if (iVar instanceof androidx.compose.foundation.interaction.m.b) {
            f10 = this.f12196b;
        } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
            f10 = this.f12197c;
        } else {
            f10 = iVar instanceof androidx.compose.foundation.interaction.d ? this.f12198d : this.f12195a;
        }
        this.f12201g = iVar;
        try {
            if (!p013b0.f.a(((p013b0.f) animatable.f9340e.getValue()).f20481b, f10)) {
                androidx.compose.foundation.interaction.i iVar2 = this.f12200f;
                floatingActionButtonElevationAnimatable$animateElevation$1.L$0 = this;
                floatingActionButtonElevationAnimatable$animateElevation$1.L$1 = iVar;
                floatingActionButtonElevationAnimatable$animateElevation$1.label = 1;
                if (androidx.compose.material3.internal.t.a(animatable, f10, iVar2, iVar, floatingActionButtonElevationAnimatable$animateElevation$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            k10 = this;
            k10.f12200f = iVar;
            return p293xa.r.f47939a;
        } catch (Throwable th2) {
            th = th2;
            k10 = this;
            k10.f12200f = iVar;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(ContinuationImpl continuationImpl) throws Throwable {
        FloatingActionButtonElevationAnimatable$snapElevation$1 floatingActionButtonElevationAnimatable$snapElevation$1;
        float f10;
        K k10;
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
            androidx.compose.foundation.interaction.i iVar = this.f12201g;
            if (iVar instanceof androidx.compose.foundation.interaction.m.b) {
                f10 = this.f12196b;
            } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
                f10 = this.f12197c;
            } else {
                f10 = iVar instanceof androidx.compose.foundation.interaction.d ? this.f12198d : this.f12195a;
            }
            Animatable<p013b0.f, C0909i> animatable = this.f12199e;
            if (!p013b0.f.a(((p013b0.f) animatable.f9340e.getValue()).f20481b, f10)) {
                try {
                    p013b0.f fVar = new p013b0.f(f10);
                    floatingActionButtonElevationAnimatable$snapElevation$1.L$0 = this;
                    floatingActionButtonElevationAnimatable$snapElevation$1.label = 1;
                    if (animatable.e(fVar, floatingActionButtonElevationAnimatable$snapElevation$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    k10 = this;
                    k10.f12200f = k10.f12201g;
                } catch (Throwable th) {
                    th = th;
                    k10 = this;
                    k10.f12200f = k10.f12201g;
                    throw th;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k10 = (K) floatingActionButtonElevationAnimatable$snapElevation$1.L$0;
            try {
                kotlin.b.b(obj);
                k10.f12200f = k10.f12201g;
            } catch (Throwable th2) {
                th = th2;
                k10.f12200f = k10.f12201g;
                throw th;
            }
        }
        return p293xa.r.f47939a;
    }
}
