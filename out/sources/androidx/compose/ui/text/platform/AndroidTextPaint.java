package androidx.compose.ui.text.platform;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.J0;
import androidx.compose.ui.graphics.C;
import androidx.compose.ui.graphics.C1142s;
import androidx.compose.ui.graphics.C1149z;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.d0;
import androidx.compose.ui.graphics.j0;
import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.graphics.m0;
import com.google.android.gms.internal.measurement.Y;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: AndroidTextPaint.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidTextPaint extends TextPaint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1142s f15616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.compose.ui.text.style.h f15617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k0 f15619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public H f15620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C f15621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public DerivedSnapshotState f15622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public I.h f15623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public J.f f15624i;

    public final d0 a() {
        C1142s c1142s = this.f15616a;
        if (c1142s != null) {
            return c1142s;
        }
        C1142s c1142s2 = new C1142s(this);
        this.f15616a = c1142s2;
        return c1142s2;
    }

    public final void b(int i10) {
        if (C1149z.a(i10, this.f15618c)) {
            return;
        }
        ((C1142s) a()).j(i10);
        this.f15618c = i10;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    public final void c(final C c10, final long j, float f10) {
        if (c10 == null) {
            this.f15622g = null;
            this.f15621f = null;
            this.f15623h = null;
            setShader(null);
            return;
        }
        if (c10 instanceof m0) {
            d(Y.i(f10, ((m0) c10).f13770a));
            return;
        }
        if (c10 instanceof j0) {
            if (i.a(this.f15621f, c10)) {
                I.h hVar = this.f15623h;
                if (!(hVar == null ? false : I.h.a(hVar.f3769a, j))) {
                    if (j != 9205357640488583168L) {
                        this.f15621f = c10;
                        this.f15623h = new I.h(j);
                        this.f15622g = J0.d(new Ia.a<Shader>() { // from class: androidx.compose.ui.text.platform.AndroidTextPaint$setBrush$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final Shader invoke() {
                                return ((j0) c10).b(j);
                            }
                        });
                    }
                }
            } else {
                if (j != 9205357640488583168L) {
                    this.f15621f = c10;
                    this.f15623h = new I.h(j);
                    this.f15622g = J0.d(new Ia.a<Shader>() { // from class: androidx.compose.ui.text.platform.AndroidTextPaint$setBrush$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final Shader invoke() {
                            return ((j0) c10).b(j);
                        }
                    });
                }
            }
            d0 d0VarA = a();
            DerivedSnapshotState derivedSnapshotState = this.f15622g;
            ((C1142s) d0VarA).e(derivedSnapshotState != null ? (Shader) derivedSnapshotState.getValue() : null);
            this.f15620e = null;
            kotlin.jvm.internal.h.i(this, f10);
        }
    }

    public final void d(long j) {
        H h8 = this.f15620e;
        if (h8 == null ? false : H.c(h8.f13506a, j)) {
            return;
        }
        if (j != 16) {
            this.f15620e = new H(j);
            setColor(Q3.d.K(j));
            this.f15622g = null;
            this.f15621f = null;
            this.f15623h = null;
            setShader(null);
        }
    }

    public final void e(J.f fVar) {
        if (fVar == null || i.a(this.f15624i, fVar)) {
            return;
        }
        this.f15624i = fVar;
        if (fVar.equals(J.h.f3954a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (fVar instanceof J.i) {
            ((C1142s) a()).r(1);
            J.i iVar = (J.i) fVar;
            ((C1142s) a()).q(iVar.f3955a);
            ((C1142s) a()).p(iVar.f3956b);
            ((C1142s) a()).o(iVar.f3958d);
            ((C1142s) a()).n(iVar.f3957c);
            ((C1142s) a()).m(null);
        }
    }

    public final void f(k0 k0Var) {
        if (k0Var == null || i.a(this.f15619d, k0Var)) {
            return;
        }
        this.f15619d = k0Var;
        if (k0Var.equals(k0.f13652d)) {
            clearShadowLayer();
            return;
        }
        k0 k0Var2 = this.f15619d;
        float f10 = k0Var2.f13655c;
        if (f10 == 0.0f) {
            f10 = Float.MIN_VALUE;
        }
        setShadowLayer(f10, Float.intBitsToFloat((int) (k0Var2.f13654b >> 32)), Float.intBitsToFloat((int) (this.f15619d.f13654b & 4294967295L)), Q3.d.K(this.f15619d.f13653a));
    }

    public final void g(androidx.compose.ui.text.style.h hVar) {
        if (hVar == null || i.a(this.f15617b, hVar)) {
            return;
        }
        this.f15617b = hVar;
        int i10 = hVar.f15673a;
        setUnderlineText((i10 | 1) == i10);
        androidx.compose.ui.text.style.h hVar2 = this.f15617b;
        hVar2.getClass();
        int i11 = hVar2.f15673a;
        setStrikeThruText((i11 | 2) == i11);
    }
}
