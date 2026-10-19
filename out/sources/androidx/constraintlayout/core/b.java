package androidx.constraintlayout.core;

import androidx.compose.ui.text.font.s;
import java.util.ArrayList;

/* JADX INFO: compiled from: ArrayRow.java */
/* JADX INFO: loaded from: classes.dex */
public class b implements c.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f15901d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SolverVariable f15898a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f15899b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<SolverVariable> f15900c = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15902e = false;

    /* JADX INFO: compiled from: ArrayRow.java */
    public interface a {
        int a();

        boolean b(SolverVariable solverVariable);

        float c(b bVar, boolean z10);

        void clear();

        void d(SolverVariable solverVariable, float f10);

        SolverVariable e(int i10);

        void f(SolverVariable solverVariable, float f10, boolean z10);

        void g();

        float h(int i10);

        float i(SolverVariable solverVariable, boolean z10);

        float j(SolverVariable solverVariable);

        void k(float f10);
    }

    public b() {
    }

    @Override // androidx.constraintlayout.core.c.a
    public SolverVariable a(boolean[] zArr) {
        return f(zArr, null);
    }

    public final void b(c cVar, int i10) {
        this.f15901d.d(cVar.j(i10), 1.0f);
        this.f15901d.d(cVar.j(i10), -1.0f);
    }

    public final void c(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f15899b = i10;
        }
        if (z10) {
            this.f15901d.d(solverVariable, 1.0f);
            this.f15901d.d(solverVariable2, -1.0f);
            this.f15901d.d(solverVariable3, -1.0f);
        } else {
            this.f15901d.d(solverVariable, -1.0f);
            this.f15901d.d(solverVariable2, 1.0f);
            this.f15901d.d(solverVariable3, 1.0f);
        }
    }

    public final void d(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f15899b = i10;
        }
        if (z10) {
            this.f15901d.d(solverVariable, 1.0f);
            this.f15901d.d(solverVariable2, -1.0f);
            this.f15901d.d(solverVariable3, 1.0f);
        } else {
            this.f15901d.d(solverVariable, -1.0f);
            this.f15901d.d(solverVariable2, 1.0f);
            this.f15901d.d(solverVariable3, -1.0f);
        }
    }

    public boolean e() {
        return this.f15898a == null && this.f15899b == 0.0f && this.f15901d.a() == 0;
    }

    public final SolverVariable f(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int iA = this.f15901d.a();
        SolverVariable solverVariable2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < iA; i10++) {
            float fH = this.f15901d.h(i10);
            if (fH < 0.0f) {
                SolverVariable solverVariableE = this.f15901d.e(i10);
                if ((zArr == null || !zArr[solverVariableE.f15874c]) && solverVariableE != solverVariable && (((type = solverVariableE.j) == SolverVariable.Type.f15885c || type == SolverVariable.Type.f15886d) && fH < f10)) {
                    f10 = fH;
                    solverVariable2 = solverVariableE;
                }
            }
        }
        return solverVariable2;
    }

    public final void g(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f15898a;
        if (solverVariable2 != null) {
            this.f15901d.d(solverVariable2, -1.0f);
            this.f15898a.f15875d = -1;
            this.f15898a = null;
        }
        float fI = this.f15901d.i(solverVariable, true) * (-1.0f);
        this.f15898a = solverVariable;
        if (fI == 1.0f) {
            return;
        }
        this.f15899b /= fI;
        this.f15901d.k(fI);
    }

    public final void h(c cVar, SolverVariable solverVariable, boolean z10) {
        if (solverVariable == null || !solverVariable.f15878g) {
            return;
        }
        float fJ = this.f15901d.j(solverVariable);
        this.f15899b = (solverVariable.f15877f * fJ) + this.f15899b;
        this.f15901d.i(solverVariable, z10);
        if (z10) {
            solverVariable.b(this);
        }
        if (this.f15901d.a() == 0) {
            this.f15902e = true;
            cVar.f15905b = true;
        }
    }

    public void i(c cVar, b bVar, boolean z10) {
        float fC = this.f15901d.c(bVar, z10);
        this.f15899b = (bVar.f15899b * fC) + this.f15899b;
        if (z10) {
            bVar.f15898a.b(this);
        }
        if (this.f15898a == null || this.f15901d.a() != 0) {
            return;
        }
        this.f15902e = true;
        cVar.f15905b = true;
    }

    public String toString() {
        boolean z10;
        String strB = s.b(this.f15898a == null ? "0" : "" + this.f15898a, " = ");
        if (this.f15899b != 0.0f) {
            StringBuilder sbE = C4.b.e(strB);
            sbE.append(this.f15899b);
            strB = sbE.toString();
            z10 = true;
        } else {
            z10 = false;
        }
        int iA = this.f15901d.a();
        for (int i10 = 0; i10 < iA; i10++) {
            SolverVariable solverVariableE = this.f15901d.e(i10);
            if (solverVariableE != null) {
                float fH = this.f15901d.h(i10);
                if (fH != 0.0f) {
                    String string = solverVariableE.toString();
                    if (z10) {
                        if (fH > 0.0f) {
                            strB = s.b(strB, " + ");
                        } else {
                            strB = s.b(strB, " - ");
                            fH *= -1.0f;
                        }
                    } else if (fH < 0.0f) {
                        strB = s.b(strB, "- ");
                        fH *= -1.0f;
                    }
                    strB = fH == 1.0f ? s.b(strB, string) : strB + fH + " " + string;
                    z10 = true;
                }
            }
        }
        return !z10 ? s.b(strB, "0.0") : strB;
    }

    public b(p064f0.a aVar) {
        this.f15901d = new androidx.constraintlayout.core.a(this, aVar);
    }
}
