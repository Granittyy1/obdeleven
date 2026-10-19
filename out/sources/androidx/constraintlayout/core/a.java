package androidx.constraintlayout.core;

import androidx.compose.ui.text.font.s;
import java.util.Arrays;

/* JADX INFO: compiled from: ArrayLinkedVariables.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f15890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p064f0.a f15891c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15889a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15892d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f15893e = new int[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f15894f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f15895g = new float[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15896h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15897i = -1;
    public boolean j = false;

    public a(b bVar, p064f0.a aVar) {
        this.f15890b = bVar;
        this.f15891c = aVar;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final int a() {
        return this.f15889a;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final boolean b(SolverVariable solverVariable) {
        int i10 = this.f15896h;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f15889a; i11++) {
            if (this.f15893e[i10] == solverVariable.f15874c) {
                return true;
            }
            i10 = this.f15894f[i10];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float c(b bVar, boolean z10) {
        float fJ = j(bVar.f15898a);
        i(bVar.f15898a, z10);
        b.a aVar = bVar.f15901d;
        int iA = aVar.a();
        for (int i10 = 0; i10 < iA; i10++) {
            SolverVariable solverVariableE = aVar.e(i10);
            f(solverVariableE, aVar.j(solverVariableE) * fJ, z10);
        }
        return fJ;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void clear() {
        int i10 = this.f15896h;
        for (int i11 = 0; i10 != -1 && i11 < this.f15889a; i11++) {
            SolverVariable solverVariable = this.f15891c.f34904c[this.f15893e[i10]];
            if (solverVariable != null) {
                solverVariable.b(this.f15890b);
            }
            i10 = this.f15894f[i10];
        }
        this.f15896h = -1;
        this.f15897i = -1;
        this.j = false;
        this.f15889a = 0;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void d(SolverVariable solverVariable, float f10) {
        if (f10 == 0.0f) {
            i(solverVariable, true);
            return;
        }
        int i10 = this.f15896h;
        b bVar = this.f15890b;
        if (i10 == -1) {
            this.f15896h = 0;
            this.f15895g[0] = f10;
            this.f15893e[0] = solverVariable.f15874c;
            this.f15894f[0] = -1;
            solverVariable.f15883m++;
            solverVariable.a(bVar);
            this.f15889a++;
            if (this.j) {
                return;
            }
            int i11 = this.f15897i + 1;
            this.f15897i = i11;
            int[] iArr = this.f15893e;
            if (i11 >= iArr.length) {
                this.j = true;
                this.f15897i = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f15889a; i13++) {
            int i14 = this.f15893e[i10];
            int i15 = solverVariable.f15874c;
            if (i14 == i15) {
                this.f15895g[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f15894f[i10];
        }
        int length = this.f15897i;
        int i16 = length + 1;
        if (this.j) {
            int[] iArr2 = this.f15893e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f15893e;
        if (length >= iArr3.length && this.f15889a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f15893e;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    length = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f15893e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f15892d * 2;
            this.f15892d = i18;
            this.j = false;
            this.f15897i = length - 1;
            this.f15895g = Arrays.copyOf(this.f15895g, i18);
            this.f15893e = Arrays.copyOf(this.f15893e, this.f15892d);
            this.f15894f = Arrays.copyOf(this.f15894f, this.f15892d);
        }
        this.f15893e[length] = solverVariable.f15874c;
        this.f15895g[length] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f15894f;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f15894f[length] = this.f15896h;
            this.f15896h = length;
        }
        solverVariable.f15883m++;
        solverVariable.a(bVar);
        int i19 = this.f15889a + 1;
        this.f15889a = i19;
        if (!this.j) {
            this.f15897i++;
        }
        int[] iArr7 = this.f15893e;
        if (i19 >= iArr7.length) {
            this.j = true;
        }
        if (this.f15897i >= iArr7.length) {
            this.j = true;
            this.f15897i = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final SolverVariable e(int i10) {
        int i11 = this.f15896h;
        for (int i12 = 0; i11 != -1 && i12 < this.f15889a; i12++) {
            if (i12 == i10) {
                return this.f15891c.f34904c[this.f15893e[i11]];
            }
            i11 = this.f15894f[i11];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void f(SolverVariable solverVariable, float f10, boolean z10) {
        if (f10 <= -0.001f || f10 >= 0.001f) {
            int i10 = this.f15896h;
            b bVar = this.f15890b;
            if (i10 == -1) {
                this.f15896h = 0;
                this.f15895g[0] = f10;
                this.f15893e[0] = solverVariable.f15874c;
                this.f15894f[0] = -1;
                solverVariable.f15883m++;
                solverVariable.a(bVar);
                this.f15889a++;
                if (this.j) {
                    return;
                }
                int i11 = this.f15897i + 1;
                this.f15897i = i11;
                int[] iArr = this.f15893e;
                if (i11 >= iArr.length) {
                    this.j = true;
                    this.f15897i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f15889a; i13++) {
                int i14 = this.f15893e[i10];
                int i15 = solverVariable.f15874c;
                if (i14 == i15) {
                    float[] fArr = this.f15895g;
                    float f11 = fArr[i10] + f10;
                    if (f11 > -0.001f && f11 < 0.001f) {
                        f11 = 0.0f;
                    }
                    fArr[i10] = f11;
                    if (f11 == 0.0f) {
                        if (i10 == this.f15896h) {
                            this.f15896h = this.f15894f[i10];
                        } else {
                            int[] iArr2 = this.f15894f;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            solverVariable.b(bVar);
                        }
                        if (this.j) {
                            this.f15897i = i10;
                        }
                        solverVariable.f15883m--;
                        this.f15889a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f15894f[i10];
            }
            int length = this.f15897i;
            int i16 = length + 1;
            if (this.j) {
                int[] iArr3 = this.f15893e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f15893e;
            if (length >= iArr4.length && this.f15889a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f15893e;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f15893e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f15892d * 2;
                this.f15892d = i18;
                this.j = false;
                this.f15897i = length - 1;
                this.f15895g = Arrays.copyOf(this.f15895g, i18);
                this.f15893e = Arrays.copyOf(this.f15893e, this.f15892d);
                this.f15894f = Arrays.copyOf(this.f15894f, this.f15892d);
            }
            this.f15893e[length] = solverVariable.f15874c;
            this.f15895g[length] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f15894f;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f15894f[length] = this.f15896h;
                this.f15896h = length;
            }
            solverVariable.f15883m++;
            solverVariable.a(bVar);
            this.f15889a++;
            if (!this.j) {
                this.f15897i++;
            }
            int i19 = this.f15897i;
            int[] iArr8 = this.f15893e;
            if (i19 >= iArr8.length) {
                this.j = true;
                this.f15897i = iArr8.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void g() {
        int i10 = this.f15896h;
        for (int i11 = 0; i10 != -1 && i11 < this.f15889a; i11++) {
            float[] fArr = this.f15895g;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f15894f[i10];
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float h(int i10) {
        int i11 = this.f15896h;
        for (int i12 = 0; i11 != -1 && i12 < this.f15889a; i12++) {
            if (i12 == i10) {
                return this.f15895g[i11];
            }
            i11 = this.f15894f[i11];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float i(SolverVariable solverVariable, boolean z10) {
        int i10 = this.f15896h;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f15889a) {
            if (this.f15893e[i10] == solverVariable.f15874c) {
                if (i10 == this.f15896h) {
                    this.f15896h = this.f15894f[i10];
                } else {
                    int[] iArr = this.f15894f;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    solverVariable.b(this.f15890b);
                }
                solverVariable.f15883m--;
                this.f15889a--;
                this.f15893e[i10] = -1;
                if (this.j) {
                    this.f15897i = i10;
                }
                return this.f15895g[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f15894f[i10];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float j(SolverVariable solverVariable) {
        int i10 = this.f15896h;
        for (int i11 = 0; i10 != -1 && i11 < this.f15889a; i11++) {
            if (this.f15893e[i10] == solverVariable.f15874c) {
                return this.f15895g[i10];
            }
            i10 = this.f15894f[i10];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void k(float f10) {
        int i10 = this.f15896h;
        for (int i11 = 0; i10 != -1 && i11 < this.f15889a; i11++) {
            float[] fArr = this.f15895g;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f15894f[i10];
        }
    }

    public final String toString() {
        int i10 = this.f15896h;
        String string = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f15889a; i11++) {
            StringBuilder sbE = C4.b.e(s.b(string, " -> "));
            sbE.append(this.f15895g[i10]);
            sbE.append(" : ");
            StringBuilder sbE2 = C4.b.e(sbE.toString());
            sbE2.append(this.f15891c.f34904c[this.f15893e[i10]]);
            string = sbE2.toString();
            i10 = this.f15894f[i10];
        }
        return string;
    }
}
