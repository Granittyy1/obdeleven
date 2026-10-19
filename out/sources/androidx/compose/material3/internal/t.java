package androidx.compose.material3.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0917q;
import androidx.compose.animation.core.C0922w;
import androidx.compose.animation.core.c0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: Elevation.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0<p013b0.f> f12572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c0<p013b0.f> f12573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0<p013b0.f> f12574c;

    static {
        C0917q c0917q = new C0917q(0.4f, 0.0f, 0.6f, 1.0f);
        f12572a = new c0<>(R.styleable.AppCompatTheme_windowFixedHeightMajor, C0922w.f9635a, 2);
        f12573b = new c0<>(150, c0917q, 2);
        f12574c = new c0<>(R.styleable.AppCompatTheme_windowFixedHeightMajor, c0917q, 2);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0009 A[PHI: r1
      0x0009: PHI (r1v2 androidx.compose.animation.core.c0<b0.f>) = 
      (r1v0 androidx.compose.animation.core.c0<b0.f>)
      (r1v0 androidx.compose.animation.core.c0<b0.f>)
      (r1v0 androidx.compose.animation.core.c0<b0.f>)
      (r1v3 androidx.compose.animation.core.c0<b0.f>)
      (r1v3 androidx.compose.animation.core.c0<b0.f>)
      (r1v3 androidx.compose.animation.core.c0<b0.f>)
      (r1v3 androidx.compose.animation.core.c0<b0.f>)
     binds: [B:19:0x0022, B:22:0x0027, B:28:0x0033, B:5:0x0007, B:8:0x000d, B:11:0x0012, B:14:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public static final Object a(Animatable animatable, float f10, androidx.compose.foundation.interaction.i iVar, androidx.compose.foundation.interaction.i iVar2, ContinuationImpl continuationImpl) {
        c0<p013b0.f> c0Var;
        c0<p013b0.f> c0Var2 = null;
        if (iVar2 != null) {
            boolean z10 = iVar2 instanceof androidx.compose.foundation.interaction.m.b;
            c0Var = f12572a;
            if (z10 || (iVar2 instanceof androidx.compose.foundation.interaction.b) || (iVar2 instanceof androidx.compose.foundation.interaction.g) || (iVar2 instanceof androidx.compose.foundation.interaction.d)) {
                c0Var2 = c0Var;
            }
        } else if (iVar != null) {
            boolean z11 = iVar instanceof androidx.compose.foundation.interaction.m.b;
            c0Var = f12573b;
            if (z11 || (iVar instanceof androidx.compose.foundation.interaction.b)) {
                c0Var2 = c0Var;
            } else if (iVar instanceof androidx.compose.foundation.interaction.g) {
                c0Var2 = f12574c;
            } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
                c0Var2 = c0Var;
            }
        }
        c0<p013b0.f> c0Var3 = c0Var2;
        if (c0Var3 != null) {
            Object objC = Animatable.c(animatable, new p013b0.f(f10), c0Var3, null, continuationImpl, 12);
            return objC == CoroutineSingletons.f43038b ? objC : p293xa.r.f47939a;
        }
        Object objE = animatable.e(new p013b0.f(f10), continuationImpl);
        return objE == CoroutineSingletons.f43038b ? objE : p293xa.r.f47939a;
    }
}
