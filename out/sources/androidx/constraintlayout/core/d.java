package androidx.constraintlayout.core;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: PriorityGoalRow.java */
/* JADX INFO: loaded from: classes.dex */
public final class d extends androidx.constraintlayout.core.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SolverVariable[] f15919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SolverVariable[] f15920g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15921h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f15922i;

    /* JADX INFO: compiled from: PriorityGoalRow.java */
    public class a implements Comparator<SolverVariable> {
        @Override // java.util.Comparator
        public final int compare(SolverVariable solverVariable, SolverVariable solverVariable2) {
            return solverVariable.f15874c - solverVariable2.f15874c;
        }
    }

    /* JADX INFO: compiled from: PriorityGoalRow.java */
    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SolverVariable f15923a;

        public b() {
        }

        public final String toString() {
            String string = "[ ";
            if (this.f15923a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    StringBuilder sbE = C4.b.e(string);
                    sbE.append(this.f15923a.f15880i[i10]);
                    sbE.append(" ");
                    string = sbE.toString();
                }
            }
            StringBuilder sbF = C4.b.f(string, "] ");
            sbF.append(this.f15923a);
            return sbF.toString();
        }
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.c.a
    public final SolverVariable a(boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f15921h; i11++) {
            SolverVariable[] solverVariableArr = this.f15919f;
            SolverVariable solverVariable = solverVariableArr[i11];
            if (!zArr[solverVariable.f15874c]) {
                b bVar = this.f15922i;
                bVar.f15923a = solverVariable;
                int i12 = 8;
                if (i10 != -1) {
                    SolverVariable solverVariable2 = solverVariableArr[i10];
                    while (i12 >= 0) {
                        float f10 = solverVariable2.f15880i[i12];
                        float f11 = bVar.f15923a.f15880i[i12];
                        if (f11 != f10) {
                            if (f11 >= f10) {
                                break;
                            }
                            i10 = i11;
                            break;
                            break;
                        }
                        i12--;
                    }
                } else {
                    while (i12 >= 0) {
                        float f12 = bVar.f15923a.f15880i[i12];
                        if (f12 > 0.0f) {
                            break;
                        }
                        if (f12 < 0.0f) {
                            i10 = i11;
                            break;
                        }
                        i12--;
                    }
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f15919f[i10];
    }

    @Override // androidx.constraintlayout.core.b
    public final boolean e() {
        return this.f15921h == 0;
    }

    @Override // androidx.constraintlayout.core.b
    public final void i(c cVar, androidx.constraintlayout.core.b bVar, boolean z10) {
        SolverVariable solverVariable = bVar.f15898a;
        if (solverVariable == null) {
            return;
        }
        androidx.constraintlayout.core.b.a aVar = bVar.f15901d;
        int iA = aVar.a();
        for (int i10 = 0; i10 < iA; i10++) {
            SolverVariable solverVariableE = aVar.e(i10);
            float fH = aVar.h(i10);
            b bVar2 = this.f15922i;
            bVar2.f15923a = solverVariableE;
            boolean z11 = solverVariableE.f15873b;
            float[] fArr = solverVariable.f15880i;
            if (z11) {
                boolean z12 = true;
                for (int i11 = 0; i11 < 9; i11++) {
                    float[] fArr2 = bVar2.f15923a.f15880i;
                    float f10 = (fArr[i11] * fH) + fArr2[i11];
                    fArr2[i11] = f10;
                    if (Math.abs(f10) < 1.0E-4f) {
                        bVar2.f15923a.f15880i[i11] = 0.0f;
                    } else {
                        z12 = false;
                    }
                }
                if (z12) {
                    d.this.k(bVar2.f15923a);
                }
            } else {
                for (int i12 = 0; i12 < 9; i12++) {
                    float f11 = fArr[i12];
                    if (f11 != 0.0f) {
                        float f12 = f11 * fH;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        bVar2.f15923a.f15880i[i12] = f12;
                    } else {
                        bVar2.f15923a.f15880i[i12] = 0.0f;
                    }
                }
                j(solverVariableE);
            }
            this.f15899b = (bVar.f15899b * fH) + this.f15899b;
        }
        k(solverVariable);
    }

    public final void j(SolverVariable solverVariable) {
        int i10;
        int i11 = this.f15921h + 1;
        SolverVariable[] solverVariableArr = this.f15919f;
        if (i11 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.f15919f = solverVariableArr2;
            this.f15920g = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.f15919f;
        int i12 = this.f15921h;
        solverVariableArr3[i12] = solverVariable;
        int i13 = i12 + 1;
        this.f15921h = i13;
        if (i13 > 1 && solverVariableArr3[i12].f15874c > solverVariable.f15874c) {
            int i14 = 0;
            while (true) {
                i10 = this.f15921h;
                if (i14 >= i10) {
                    break;
                }
                this.f15920g[i14] = this.f15919f[i14];
                i14++;
            }
            Arrays.sort(this.f15920g, 0, i10, new a());
            for (int i15 = 0; i15 < this.f15921h; i15++) {
                this.f15919f[i15] = this.f15920g[i15];
            }
        }
        solverVariable.f15873b = true;
        solverVariable.a(this);
    }

    public final void k(SolverVariable solverVariable) {
        int i10 = 0;
        while (i10 < this.f15921h) {
            if (this.f15919f[i10] == solverVariable) {
                while (true) {
                    int i11 = this.f15921h;
                    if (i10 >= i11 - 1) {
                        this.f15921h = i11 - 1;
                        solverVariable.f15873b = false;
                        return;
                    } else {
                        SolverVariable[] solverVariableArr = this.f15919f;
                        int i12 = i10 + 1;
                        solverVariableArr[i10] = solverVariableArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b
    public final String toString() {
        String str = " goal -> (" + this.f15899b + ") : ";
        for (int i10 = 0; i10 < this.f15921h; i10++) {
            SolverVariable solverVariable = this.f15919f[i10];
            b bVar = this.f15922i;
            bVar.f15923a = solverVariable;
            str = str + bVar + " ";
        }
        return str;
    }
}
