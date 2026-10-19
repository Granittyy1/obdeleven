package androidx.compose.ui.graphics.painter;

import I.f;
import Ia.l;
import J.e;
import androidx.compose.ui.graphics.C1142s;
import androidx.compose.ui.graphics.C1143t;
import androidx.compose.ui.graphics.E;
import androidx.compose.ui.graphics.I;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.i;
import p111ia.c;
import p293xa.r;

/* JADX INFO: compiled from: Painter.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class Painter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1142s f13779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public I f13781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f13782e = 1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LayoutDirection f13783f = LayoutDirection.f15717b;

    public Painter() {
        new l<e, r>() { // from class: androidx.compose.ui.graphics.painter.Painter$drawLambda$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(e eVar) {
                this.this$0.i(eVar);
                return r.f47939a;
            }
        };
    }

    public boolean a(float f10) {
        return false;
    }

    public boolean e(I i10) {
        return false;
    }

    public final void g(e eVar, long j, float f10, I i10) {
        if (this.f13782e != f10) {
            if (!a(f10)) {
                if (f10 == 1.0f) {
                    C1142s c1142s = this.f13779b;
                    if (c1142s != null) {
                        c1142s.b(f10);
                    }
                    this.f13780c = false;
                } else {
                    C1142s c1142sA = this.f13779b;
                    if (c1142sA == null) {
                        c1142sA = C1143t.a();
                        this.f13779b = c1142sA;
                    }
                    c1142sA.b(f10);
                    this.f13780c = true;
                }
            }
            this.f13782e = f10;
        }
        if (!i.a(this.f13781d, i10)) {
            if (!e(i10)) {
                if (i10 == null) {
                    C1142s c1142s2 = this.f13779b;
                    if (c1142s2 != null) {
                        c1142s2.k(null);
                    }
                    this.f13780c = false;
                } else {
                    C1142s c1142sA2 = this.f13779b;
                    if (c1142sA2 == null) {
                        c1142sA2 = C1143t.a();
                        this.f13779b = c1142sA2;
                    }
                    c1142sA2.k(i10);
                    this.f13780c = true;
                }
            }
            this.f13781d = i10;
        }
        LayoutDirection layoutDirection = eVar.getLayoutDirection();
        if (this.f13783f != layoutDirection) {
            f(layoutDirection);
            this.f13783f = layoutDirection;
        }
        int i11 = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (eVar.j() >> 32)) - Float.intBitsToFloat(i11);
        int i12 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (eVar.j() & 4294967295L)) - Float.intBitsToFloat(i12);
        eVar.W0().f3948a.e(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f10 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i11) > 0.0f && Float.intBitsToFloat(i12) > 0.0f) {
                    if (this.f13780c) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i11);
                        f fVarA = c.a(0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i12))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
                        E eA = eVar.W0().a();
                        C1142s c1142sA3 = this.f13779b;
                        if (c1142sA3 == null) {
                            c1142sA3 = C1143t.a();
                            this.f13779b = c1142sA3;
                        }
                        try {
                            eA.s(fVarA, c1142sA3);
                            i(eVar);
                            eA.o();
                        } catch (Throwable th) {
                            eA.o();
                            throw th;
                        }
                    } else {
                        i(eVar);
                    }
                }
            } catch (Throwable th2) {
                eVar.W0().f3948a.e(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th2;
            }
        }
        eVar.W0().f3948a.e(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    public abstract long h();

    public abstract void i(e eVar);

    public void f(LayoutDirection layoutDirection) {
    }
}
