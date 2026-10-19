package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0901a;
import androidx.compose.animation.core.C0909i;
import androidx.compose.animation.core.C0922w;
import androidx.compose.animation.core.c0;
import androidx.compose.foundation.C0936h;
import androidx.compose.ui.graphics.H;
import java.util.ArrayList;
import kotlin.collections.q;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
public final class StateLayer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lambda f11973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Animatable<Float, C0909i> f11974c = C0901a.a(0.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f11975d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.compose.foundation.interaction.i f11976e;

    /* JADX WARN: Multi-variable type inference failed */
    public StateLayer(boolean z10, Ia.a<f> aVar) {
        this.f11972a = z10;
        this.f11973b = (Lambda) aVar;
    }

    public final void a(J.c cVar, float f10, long j) {
        float fFloatValue = this.f11974c.d().floatValue();
        if (fFloatValue > 0.0f) {
            long jB = H.b(fFloatValue, j);
            if (!this.f11972a) {
                cVar.S(jB, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(cVar.j()) / 2.0f : f10, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? cVar.j1() : 0L, 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
                return;
            }
            float fD = I.h.d(cVar.j());
            float fB = I.h.b(cVar.j());
            J.a.b bVarW0 = cVar.W0();
            long jE = bVarW0.e();
            bVarW0.a().g();
            try {
                bVarW0.f3948a.d(0.0f, 0.0f, fD, fB, 1);
                cVar.S(jB, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(cVar.j()) / 2.0f : f10, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? cVar.j1() : 0L, 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
            } finally {
                C0936h.f(bVarW0, jE);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    public final void b(androidx.compose.foundation.interaction.i iVar, A a10) {
        float f10;
        boolean z10 = iVar instanceof androidx.compose.foundation.interaction.g;
        ArrayList arrayList = this.f11975d;
        if (z10) {
            arrayList.add(iVar);
        } else if (iVar instanceof androidx.compose.foundation.interaction.h) {
            arrayList.remove(((androidx.compose.foundation.interaction.h) iVar).f10072a);
        } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
            arrayList.add(iVar);
        } else if (iVar instanceof androidx.compose.foundation.interaction.e) {
            arrayList.remove(((androidx.compose.foundation.interaction.e) iVar).f10071a);
        } else if (iVar instanceof androidx.compose.foundation.interaction.b) {
            arrayList.add(iVar);
        } else if (iVar instanceof androidx.compose.foundation.interaction.c) {
            arrayList.remove(((androidx.compose.foundation.interaction.c) iVar).f10070a);
        } else if (!(iVar instanceof androidx.compose.foundation.interaction.a)) {
            return;
        } else {
            arrayList.remove(((androidx.compose.foundation.interaction.a) iVar).f10069a);
        }
        androidx.compose.foundation.interaction.i iVar2 = (androidx.compose.foundation.interaction.i) q.W(arrayList);
        if (kotlin.jvm.internal.i.a(this.f11976e, iVar2)) {
            return;
        }
        if (iVar2 != null) {
            f fVar = (f) this.f11973b.invoke();
            if (z10) {
                f10 = fVar.f11995c;
            } else if (iVar instanceof androidx.compose.foundation.interaction.d) {
                f10 = fVar.f11994b;
            } else {
                f10 = iVar instanceof androidx.compose.foundation.interaction.b ? fVar.f11993a : 0.0f;
            }
            c0<Float> c0Var = n.f12016a;
            boolean z11 = iVar2 instanceof androidx.compose.foundation.interaction.g;
            c0<Float> c0Var2 = n.f12016a;
            if (!z11 && ((iVar2 instanceof androidx.compose.foundation.interaction.d) || (iVar2 instanceof androidx.compose.foundation.interaction.b))) {
                c0Var2 = new c0<>(45, C0922w.f9638d, 2);
            }
            C2680e.c(a10, null, null, new StateLayer$handleInteraction$1(this, f10, c0Var2, null), 3);
        } else {
            androidx.compose.foundation.interaction.i iVar3 = this.f11976e;
            c0<Float> c0Var3 = n.f12016a;
            boolean z12 = iVar3 instanceof androidx.compose.foundation.interaction.g;
            c0<Float> c0Var4 = n.f12016a;
            if (!z12 && !(iVar3 instanceof androidx.compose.foundation.interaction.d) && (iVar3 instanceof androidx.compose.foundation.interaction.b)) {
                c0Var4 = new c0<>(150, C0922w.f9638d, 2);
            }
            C2680e.c(a10, null, null, new StateLayer$handleInteraction$2(this, c0Var4, null), 3);
        }
        this.f11976e = iVar2;
    }
}
