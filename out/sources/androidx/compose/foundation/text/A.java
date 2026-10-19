package androidx.compose.foundation.text;

import androidx.compose.ui.layout.InterfaceC1170p;

/* JADX INFO: compiled from: TextLayoutResultProxy.kt */
/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.text.B f11055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC1170p f11056b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC1170p f11057c;

    public A(InterfaceC1170p interfaceC1170p, androidx.compose.ui.text.B b10) {
        this.f11055a = b10;
        this.f11057c = interfaceC1170p;
    }

    public final long a(long j) {
        I.f fVarH;
        InterfaceC1170p interfaceC1170p = this.f11056b;
        I.f fVar = I.f.f3756e;
        if (interfaceC1170p != null) {
            if (interfaceC1170p.c()) {
                InterfaceC1170p interfaceC1170p2 = this.f11057c;
                fVarH = interfaceC1170p2 != null ? interfaceC1170p2.H(interfaceC1170p, true) : null;
            } else {
                fVarH = fVar;
            }
            if (fVarH != null) {
                fVar = fVarH;
            }
        }
        int i10 = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        float fIntBitsToFloat2 = fVar.f3757a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i10);
            fIntBitsToFloat2 = fVar.f3759c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i10);
            }
        }
        int i11 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i11);
        float fIntBitsToFloat5 = fVar.f3758b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i11);
            fIntBitsToFloat5 = fVar.f3760d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i11);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public final int b(long j, boolean z10) {
        if (z10) {
            j = a(j);
        }
        return this.f11055a.f15301b.g(d(j));
    }

    public final boolean c(long j) {
        long jD = d(a(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD));
        androidx.compose.ui.text.B b10 = this.f11055a;
        int iE = b10.f15301b.e(fIntBitsToFloat);
        int i10 = (int) (jD >> 32);
        return Float.intBitsToFloat(i10) >= b10.e(iE) && Float.intBitsToFloat(i10) <= b10.f(iE);
    }

    public final long d(long j) {
        InterfaceC1170p interfaceC1170p;
        InterfaceC1170p interfaceC1170p2 = this.f11056b;
        if (interfaceC1170p2 == null) {
            return j;
        }
        if (!interfaceC1170p2.c()) {
            interfaceC1170p2 = null;
        }
        if (interfaceC1170p2 == null || (interfaceC1170p = this.f11057c) == null) {
            return j;
        }
        InterfaceC1170p interfaceC1170p3 = interfaceC1170p.c() ? interfaceC1170p : null;
        return interfaceC1170p3 == null ? j : interfaceC1170p2.B(interfaceC1170p3, j);
    }

    public final long e(long j) {
        InterfaceC1170p interfaceC1170p;
        InterfaceC1170p interfaceC1170p2 = this.f11056b;
        if (interfaceC1170p2 == null) {
            return j;
        }
        if (!interfaceC1170p2.c()) {
            interfaceC1170p2 = null;
        }
        if (interfaceC1170p2 == null || (interfaceC1170p = this.f11057c) == null) {
            return j;
        }
        InterfaceC1170p interfaceC1170p3 = interfaceC1170p.c() ? interfaceC1170p : null;
        return interfaceC1170p3 == null ? j : interfaceC1170p3.B(interfaceC1170p2, j);
    }
}
