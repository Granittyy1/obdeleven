package androidx.constraintlayout.core;

import androidx.constraintlayout.core.d.b;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import com.braze.Constants;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: LinearSystem.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static boolean f15903q = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f15907d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p064f0.a f15915m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f15918p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15904a = Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15905b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15906c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15908e = 32;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15909f = 32;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15911h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean[] f15912i = new boolean[32];
    public int j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15913k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15914l = 32;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SolverVariable[] f15916n = new SolverVariable[Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15917o = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b[] f15910g = new b[32];

    /* JADX INFO: compiled from: LinearSystem.java */
    public interface a {
        SolverVariable a(boolean[] zArr);
    }

    public c() {
        s();
        p064f0.a aVar = new p064f0.a();
        aVar.f34902a = new p064f0.b();
        aVar.f34903b = new p064f0.b();
        aVar.f34904c = new SolverVariable[32];
        this.f15915m = aVar;
        d dVar = new d(aVar);
        dVar.f15919f = new SolverVariable[128];
        dVar.f15920g = new SolverVariable[128];
        dVar.f15921h = 0;
        dVar.f15922i = dVar.new b();
        this.f15907d = dVar;
        this.f15918p = new b(aVar);
    }

    public static int n(Object obj) {
        SolverVariable solverVariable = ((ConstraintAnchor) obj).f15933i;
        if (solverVariable != null) {
            return (int) (solverVariable.f15877f + 0.5f);
        }
        return 0;
    }

    public final SolverVariable a(SolverVariable.Type type) {
        p064f0.b bVar = this.f15915m.f34903b;
        int i10 = bVar.f34906b;
        Object obj = null;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = bVar.f34905a;
            Object obj2 = objArr[i11];
            objArr[i11] = null;
            bVar.f34906b = i11;
            obj = obj2;
        }
        SolverVariable solverVariable = (SolverVariable) obj;
        if (solverVariable == null) {
            solverVariable = new SolverVariable(type);
            solverVariable.j = type;
        } else {
            solverVariable.c();
            solverVariable.j = type;
        }
        int i12 = this.f15917o;
        int i13 = this.f15904a;
        if (i12 >= i13) {
            int i14 = i13 * 2;
            this.f15904a = i14;
            this.f15916n = (SolverVariable[]) Arrays.copyOf(this.f15916n, i14);
        }
        SolverVariable[] solverVariableArr = this.f15916n;
        int i15 = this.f15917o;
        this.f15917o = i15 + 1;
        solverVariableArr[i15] = solverVariable;
        return solverVariable;
    }

    public final void b(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, float f10, SolverVariable solverVariable3, SolverVariable solverVariable4, int i11, int i12) {
        b bVarL = l();
        if (solverVariable2 == solverVariable3) {
            bVarL.f15901d.d(solverVariable, 1.0f);
            bVarL.f15901d.d(solverVariable4, 1.0f);
            bVarL.f15901d.d(solverVariable2, -2.0f);
        } else if (f10 == 0.5f) {
            bVarL.f15901d.d(solverVariable, 1.0f);
            bVarL.f15901d.d(solverVariable2, -1.0f);
            bVarL.f15901d.d(solverVariable3, -1.0f);
            bVarL.f15901d.d(solverVariable4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                bVarL.f15899b = (-i10) + i11;
            }
        } else if (f10 <= 0.0f) {
            bVarL.f15901d.d(solverVariable, -1.0f);
            bVarL.f15901d.d(solverVariable2, 1.0f);
            bVarL.f15899b = i10;
        } else if (f10 >= 1.0f) {
            bVarL.f15901d.d(solverVariable4, -1.0f);
            bVarL.f15901d.d(solverVariable3, 1.0f);
            bVarL.f15899b = -i11;
        } else {
            float f11 = 1.0f - f10;
            bVarL.f15901d.d(solverVariable, f11 * 1.0f);
            bVarL.f15901d.d(solverVariable2, f11 * (-1.0f));
            bVarL.f15901d.d(solverVariable3, (-1.0f) * f10);
            bVarL.f15901d.d(solverVariable4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                bVarL.f15899b = (i11 * f10) + ((-i10) * f11);
            }
        }
        if (i12 != 8) {
            bVarL.b(this, i12);
        }
        c(bVarL);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0194  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00df  */
    public final void c(b bVar) {
        boolean z10;
        SolverVariable.Type type;
        boolean z11;
        SolverVariable solverVariableF;
        ArrayList<SolverVariable> arrayList;
        boolean z12 = true;
        if (this.f15913k + 1 >= this.f15914l || this.j + 1 >= this.f15909f) {
            o();
        }
        if (bVar.f15902e) {
            z10 = false;
        } else {
            if (this.f15910g.length != 0) {
                boolean z13 = false;
                while (!z13) {
                    int iA = bVar.f15901d.a();
                    int i10 = 0;
                    while (true) {
                        arrayList = bVar.f15900c;
                        if (i10 >= iA) {
                            break;
                        }
                        SolverVariable solverVariableE = bVar.f15901d.e(i10);
                        if (solverVariableE.f15875d != -1 || solverVariableE.f15878g) {
                            arrayList.add(solverVariableE);
                        }
                        i10++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i11 = 0; i11 < size; i11++) {
                            SolverVariable solverVariable = arrayList.get(i11);
                            if (solverVariable.f15878g) {
                                bVar.h(this, solverVariable, true);
                            } else {
                                bVar.i(this, this.f15910g[solverVariable.f15875d], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z13 = true;
                    }
                }
                if (bVar.f15898a != null && bVar.f15901d.a() == 0) {
                    bVar.f15902e = true;
                    this.f15905b = true;
                }
            }
            if (bVar.e()) {
                return;
            }
            float f10 = bVar.f15899b;
            if (f10 < 0.0f) {
                bVar.f15899b = f10 * (-1.0f);
                bVar.f15901d.g();
            }
            int iA2 = bVar.f15901d.a();
            float f11 = 0.0f;
            float f12 = 0.0f;
            int i12 = 0;
            SolverVariable solverVariable2 = null;
            SolverVariable solverVariable3 = null;
            boolean z14 = false;
            boolean z15 = false;
            while (true) {
                type = SolverVariable.Type.f15884b;
                if (i12 >= iA2) {
                    break;
                }
                float fH = bVar.f15901d.h(i12);
                SolverVariable solverVariableE2 = bVar.f15901d.e(i12);
                if (solverVariableE2.j == type) {
                    if (solverVariable2 == null) {
                        if (solverVariableE2.f15883m <= 1) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        f11 = fH;
                        solverVariable2 = solverVariableE2;
                    } else {
                        if (f11 > fH) {
                            if (solverVariableE2.f15883m > 1) {
                                z14 = false;
                            }
                            f11 = fH;
                            solverVariable2 = solverVariableE2;
                        } else if (z14 || solverVariableE2.f15883m > 1) {
                        }
                        z14 = true;
                        f11 = fH;
                        solverVariable2 = solverVariableE2;
                    }
                } else if (solverVariable2 == null && fH < 0.0f) {
                    if (solverVariable3 == null) {
                        if (solverVariableE2.f15883m <= 1) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        f12 = fH;
                        solverVariable3 = solverVariableE2;
                    } else {
                        if (f12 > fH) {
                            if (solverVariableE2.f15883m > 1) {
                                z15 = false;
                            }
                            f12 = fH;
                            solverVariable3 = solverVariableE2;
                        } else if (z15 || solverVariableE2.f15883m > 1) {
                        }
                        z15 = true;
                        f12 = fH;
                        solverVariable3 = solverVariableE2;
                    }
                }
                i12++;
            }
            if (solverVariable2 == null) {
                solverVariable2 = solverVariable3;
            }
            if (solverVariable2 == null) {
                z11 = true;
            } else {
                bVar.g(solverVariable2);
                z11 = false;
            }
            if (bVar.f15901d.a() == 0) {
                bVar.f15902e = true;
            }
            if (z11) {
                if (this.j + 1 >= this.f15909f) {
                    o();
                }
                SolverVariable solverVariableA = a(SolverVariable.Type.f15885c);
                int i13 = this.f15906c + 1;
                this.f15906c = i13;
                this.j++;
                solverVariableA.f15874c = i13;
                p064f0.a aVar = this.f15915m;
                aVar.f34904c[i13] = solverVariableA;
                bVar.f15898a = solverVariableA;
                int i14 = this.f15913k;
                h(bVar);
                if (this.f15913k == i14 + 1) {
                    b bVar2 = this.f15918p;
                    bVar2.getClass();
                    bVar2.f15898a = null;
                    bVar2.f15901d.clear();
                    for (int i15 = 0; i15 < bVar.f15901d.a(); i15++) {
                        bVar2.f15901d.f(bVar.f15901d.e(i15), bVar.f15901d.h(i15), true);
                    }
                    r(this.f15918p);
                    if (solverVariableA.f15875d == -1) {
                        if (bVar.f15898a == solverVariableA && (solverVariableF = bVar.f(null, solverVariableA)) != null) {
                            bVar.g(solverVariableF);
                        }
                        if (!bVar.f15902e) {
                            bVar.f15898a.e(this, bVar);
                        }
                        aVar.f34902a.a(bVar);
                        this.f15913k--;
                    }
                } else {
                    z12 = false;
                }
            } else {
                z12 = false;
            }
            SolverVariable solverVariable4 = bVar.f15898a;
            if (solverVariable4 == null) {
                return;
            }
            if (solverVariable4.j != type && bVar.f15899b < 0.0f) {
                return;
            } else {
                z10 = z12;
            }
        }
        if (z10) {
            return;
        }
        h(bVar);
    }

    public final void d(SolverVariable solverVariable, int i10) {
        int i11 = solverVariable.f15875d;
        if (i11 == -1) {
            solverVariable.d(this, i10);
            for (int i12 = 0; i12 < this.f15906c + 1; i12++) {
                SolverVariable solverVariable2 = this.f15915m.f34904c[i12];
            }
            return;
        }
        if (i11 == -1) {
            b bVarL = l();
            bVarL.f15898a = solverVariable;
            float f10 = i10;
            solverVariable.f15877f = f10;
            bVarL.f15899b = f10;
            bVarL.f15902e = true;
            c(bVarL);
            return;
        }
        b bVar = this.f15910g[i11];
        if (bVar.f15902e) {
            bVar.f15899b = i10;
            return;
        }
        if (bVar.f15901d.a() == 0) {
            bVar.f15902e = true;
            bVar.f15899b = i10;
            return;
        }
        b bVarL2 = l();
        if (i10 < 0) {
            bVarL2.f15899b = i10 * (-1);
            bVarL2.f15901d.d(solverVariable, 1.0f);
        } else {
            bVarL2.f15899b = i10;
            bVarL2.f15901d.d(solverVariable, -1.0f);
        }
        c(bVarL2);
    }

    public final void e(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, int i11) {
        if (i11 == 8 && solverVariable2.f15878g && solverVariable.f15875d == -1) {
            solverVariable.d(this, solverVariable2.f15877f + i10);
            return;
        }
        b bVarL = l();
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            bVarL.f15899b = i10;
        }
        if (z10) {
            bVarL.f15901d.d(solverVariable, 1.0f);
            bVarL.f15901d.d(solverVariable2, -1.0f);
        } else {
            bVarL.f15901d.d(solverVariable, -1.0f);
            bVarL.f15901d.d(solverVariable2, 1.0f);
        }
        if (i11 != 8) {
            bVarL.b(this, i11);
        }
        c(bVarL);
    }

    public final void f(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, int i11) {
        b bVarL = l();
        SolverVariable solverVariableM = m();
        solverVariableM.f15876e = 0;
        bVarL.c(solverVariable, solverVariable2, solverVariableM, i10);
        if (i11 != 8) {
            bVarL.f15901d.d(j(i11), (int) (bVarL.f15901d.j(solverVariableM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void g(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, int i11) {
        b bVarL = l();
        SolverVariable solverVariableM = m();
        solverVariableM.f15876e = 0;
        bVarL.d(solverVariable, solverVariable2, solverVariableM, i10);
        if (i11 != 8) {
            bVarL.f15901d.d(j(i11), (int) (bVarL.f15901d.j(solverVariableM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void h(b bVar) {
        int i10;
        if (bVar.f15902e) {
            bVar.f15898a.d(this, bVar.f15899b);
        } else {
            b[] bVarArr = this.f15910g;
            int i11 = this.f15913k;
            bVarArr[i11] = bVar;
            SolverVariable solverVariable = bVar.f15898a;
            solverVariable.f15875d = i11;
            this.f15913k = i11 + 1;
            solverVariable.e(this, bVar);
        }
        if (this.f15905b) {
            int i12 = 0;
            while (i12 < this.f15913k) {
                if (this.f15910g[i12] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f15910g[i12];
                if (bVar2 != null && bVar2.f15902e) {
                    bVar2.f15898a.d(this, bVar2.f15899b);
                    this.f15915m.f34902a.a(bVar2);
                    this.f15910g[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f15913k;
                        if (i13 >= i10) {
                            break;
                        }
                        b[] bVarArr2 = this.f15910g;
                        int i15 = i13 - 1;
                        b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        SolverVariable solverVariable2 = bVar3.f15898a;
                        if (solverVariable2.f15875d == i13) {
                            solverVariable2.f15875d = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f15910g[i14] = null;
                    }
                    this.f15913k = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f15905b = false;
        }
    }

    public final void i() {
        for (int i10 = 0; i10 < this.f15913k; i10++) {
            b bVar = this.f15910g[i10];
            bVar.f15898a.f15877f = bVar.f15899b;
        }
    }

    public final SolverVariable j(int i10) {
        if (this.j + 1 >= this.f15909f) {
            o();
        }
        SolverVariable solverVariableA = a(SolverVariable.Type.f15886d);
        int i11 = this.f15906c + 1;
        this.f15906c = i11;
        this.j++;
        solverVariableA.f15874c = i11;
        solverVariableA.f15876e = i10;
        this.f15915m.f34904c[i11] = solverVariableA;
        d dVar = this.f15907d;
        dVar.f15922i.f15923a = solverVariableA;
        float[] fArr = solverVariableA.f15880i;
        Arrays.fill(fArr, 0.0f);
        fArr[solverVariableA.f15876e] = 1.0f;
        dVar.j(solverVariableA);
        return solverVariableA;
    }

    public final SolverVariable k(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f15909f) {
            o();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.f15933i;
            if (solverVariable == null) {
                constraintAnchor.k();
                solverVariable = constraintAnchor.f15933i;
            }
            int i10 = solverVariable.f15874c;
            p064f0.a aVar = this.f15915m;
            if (i10 == -1 || i10 > this.f15906c || aVar.f34904c[i10] == null) {
                if (i10 != -1) {
                    solverVariable.c();
                }
                int i11 = this.f15906c + 1;
                this.f15906c = i11;
                this.j++;
                solverVariable.f15874c = i11;
                solverVariable.j = SolverVariable.Type.f15884b;
                aVar.f34904c[i11] = solverVariable;
            }
        }
        return solverVariable;
    }

    public final b l() {
        Object obj;
        p064f0.a aVar = this.f15915m;
        p064f0.b bVar = aVar.f34902a;
        int i10 = bVar.f34906b;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = bVar.f34905a;
            obj = objArr[i11];
            objArr[i11] = null;
            bVar.f34906b = i11;
        } else {
            obj = null;
        }
        b bVar2 = (b) obj;
        if (bVar2 == null) {
            return new b(aVar);
        }
        bVar2.f15898a = null;
        bVar2.f15901d.clear();
        bVar2.f15899b = 0.0f;
        bVar2.f15902e = false;
        return bVar2;
    }

    public final SolverVariable m() {
        if (this.j + 1 >= this.f15909f) {
            o();
        }
        SolverVariable solverVariableA = a(SolverVariable.Type.f15885c);
        int i10 = this.f15906c + 1;
        this.f15906c = i10;
        this.j++;
        solverVariableA.f15874c = i10;
        this.f15915m.f34904c[i10] = solverVariableA;
        return solverVariableA;
    }

    public final void o() {
        int i10 = this.f15908e * 2;
        this.f15908e = i10;
        this.f15910g = (b[]) Arrays.copyOf(this.f15910g, i10);
        p064f0.a aVar = this.f15915m;
        aVar.f34904c = (SolverVariable[]) Arrays.copyOf(aVar.f34904c, this.f15908e);
        int i11 = this.f15908e;
        this.f15912i = new boolean[i11];
        this.f15909f = i11;
        this.f15914l = i11;
    }

    public final void p() throws Exception {
        d dVar = this.f15907d;
        if (dVar.e()) {
            i();
            return;
        }
        if (!this.f15911h) {
            q(dVar);
            return;
        }
        for (int i10 = 0; i10 < this.f15913k; i10++) {
            if (!this.f15910g[i10].f15902e) {
                q(dVar);
                return;
            }
        }
        i();
    }

    public final void q(d dVar) throws Exception {
        for (int i10 = 0; i10 < this.f15913k; i10++) {
            b bVar = this.f15910g[i10];
            SolverVariable.Type type = bVar.f15898a.j;
            SolverVariable.Type type2 = SolverVariable.Type.f15884b;
            if (type != type2) {
                float f10 = 0.0f;
                if (bVar.f15899b < 0.0f) {
                    boolean z10 = false;
                    int i11 = 0;
                    while (!z10) {
                        i11++;
                        float f11 = Float.MAX_VALUE;
                        int i12 = 0;
                        int i13 = -1;
                        int i14 = -1;
                        int i15 = 0;
                        while (i12 < this.f15913k) {
                            b bVar2 = this.f15910g[i12];
                            if (bVar2.f15898a.j != type2 && !bVar2.f15902e && bVar2.f15899b < f10) {
                                int iA = bVar2.f15901d.a();
                                int i16 = 0;
                                while (i16 < iA) {
                                    SolverVariable solverVariableE = bVar2.f15901d.e(i16);
                                    float fJ = bVar2.f15901d.j(solverVariableE);
                                    if (fJ > f10) {
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f12 = solverVariableE.f15879h[i17] / fJ;
                                            if ((f12 < f11 && i17 == i15) || i17 > i15) {
                                                i15 = i17;
                                                i14 = solverVariableE.f15874c;
                                                i13 = i12;
                                                f11 = f12;
                                            }
                                        }
                                    }
                                    i16++;
                                    f10 = 0.0f;
                                }
                            }
                            i12++;
                            f10 = 0.0f;
                        }
                        if (i13 != -1) {
                            b bVar3 = this.f15910g[i13];
                            bVar3.f15898a.f15875d = -1;
                            bVar3.g(this.f15915m.f34904c[i14]);
                            SolverVariable solverVariable = bVar3.f15898a;
                            solverVariable.f15875d = i13;
                            solverVariable.e(this, bVar3);
                        } else {
                            z10 = true;
                        }
                        if (i11 > this.j / 2) {
                            z10 = true;
                        }
                        f10 = 0.0f;
                    }
                    break;
                }
            }
        }
        r(dVar);
        i();
    }

    public final void r(b bVar) {
        for (int i10 = 0; i10 < this.j; i10++) {
            this.f15912i[i10] = false;
        }
        boolean z10 = false;
        int i11 = 0;
        while (!z10) {
            i11++;
            if (i11 >= this.j * 2) {
                return;
            }
            SolverVariable solverVariable = bVar.f15898a;
            if (solverVariable != null) {
                this.f15912i[solverVariable.f15874c] = true;
            }
            SolverVariable solverVariableA = bVar.a(this.f15912i);
            if (solverVariableA != null) {
                boolean[] zArr = this.f15912i;
                int i12 = solverVariableA.f15874c;
                if (zArr[i12]) {
                    return;
                } else {
                    zArr[i12] = true;
                }
            }
            if (solverVariableA != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f15913k; i14++) {
                    b bVar2 = this.f15910g[i14];
                    if (bVar2.f15898a.j != SolverVariable.Type.f15884b && !bVar2.f15902e && bVar2.f15901d.b(solverVariableA)) {
                        float fJ = bVar2.f15901d.j(solverVariableA);
                        if (fJ < 0.0f) {
                            float f11 = (-bVar2.f15899b) / fJ;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    b bVar3 = this.f15910g[i13];
                    bVar3.f15898a.f15875d = -1;
                    bVar3.g(solverVariableA);
                    SolverVariable solverVariable2 = bVar3.f15898a;
                    solverVariable2.f15875d = i13;
                    solverVariable2.e(this, bVar3);
                }
            } else {
                z10 = true;
            }
        }
    }

    public final void s() {
        for (int i10 = 0; i10 < this.f15913k; i10++) {
            b bVar = this.f15910g[i10];
            if (bVar != null) {
                this.f15915m.f34902a.a(bVar);
            }
            this.f15910g[i10] = null;
        }
    }

    public final void t() {
        p064f0.a aVar;
        int i10 = 0;
        while (true) {
            aVar = this.f15915m;
            SolverVariable[] solverVariableArr = aVar.f34904c;
            if (i10 >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i10];
            if (solverVariable != null) {
                solverVariable.c();
            }
            i10++;
        }
        p064f0.b bVar = aVar.f34903b;
        SolverVariable[] solverVariableArr2 = this.f15916n;
        int length = this.f15917o;
        bVar.getClass();
        if (length > solverVariableArr2.length) {
            length = solverVariableArr2.length;
        }
        for (int i11 = 0; i11 < length; i11++) {
            SolverVariable solverVariable2 = solverVariableArr2[i11];
            int i12 = bVar.f34906b;
            Object[] objArr = bVar.f34905a;
            if (i12 < objArr.length) {
                objArr[i12] = solverVariable2;
                bVar.f34906b = i12 + 1;
            }
        }
        this.f15917o = 0;
        Arrays.fill(aVar.f34904c, (Object) null);
        this.f15906c = 0;
        d dVar = this.f15907d;
        dVar.f15921h = 0;
        dVar.f15899b = 0.0f;
        this.j = 1;
        for (int i13 = 0; i13 < this.f15913k; i13++) {
            b bVar2 = this.f15910g[i13];
        }
        s();
        this.f15913k = 0;
        this.f15918p = new b(aVar);
    }
}
