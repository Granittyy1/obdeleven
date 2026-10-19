package androidx.compose.foundation.gestures;

import androidx.compose.foundation.B;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ScrollableState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultScrollableState implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lambda f9920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f9921b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f9922c = new B();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1085f0 f9923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1085f0 f9924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1085f0 f9925f;

    /* JADX INFO: compiled from: ScrollableState.kt */
    public static final class a implements s {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.compose.foundation.gestures.s
        public final float f(float f10) {
            if (Float.isNaN(f10)) {
                return 0.0f;
            }
            DefaultScrollableState defaultScrollableState = DefaultScrollableState.this;
            float fFloatValue = ((Number) defaultScrollableState.f9920a.invoke(Float.valueOf(f10))).floatValue();
            defaultScrollableState.f9924e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
            defaultScrollableState.f9925f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
            return fFloatValue;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultScrollableState(Ia.l<? super Float, Float> lVar) {
        this.f9920a = (Lambda) lVar;
        Boolean bool = Boolean.FALSE;
        this.f9923d = J0.f(bool);
        this.f9924e = J0.f(bool);
        this.f9925f = J0.f(bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.u
    public final boolean a() {
        return ((Boolean) this.f9923d.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.u
    public final Object b(MutatePriority mutatePriority, Ia.p<? super s, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> pVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        Object objD = kotlinx.coroutines.B.d(new DefaultScrollableState$scroll$2(this, mutatePriority, pVar, null), cVar);
        return objD == CoroutineSingletons.f43038b ? objD : p293xa.r.f47939a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    @Override // androidx.compose.foundation.gestures.u
    public final float e(float f10) {
        return ((Number) this.f9920a.invoke(Float.valueOf(f10))).floatValue();
    }
}
