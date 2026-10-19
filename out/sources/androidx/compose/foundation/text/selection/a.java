package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.a;
import androidx.compose.ui.text.B;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.C1268i;
import androidx.compose.ui.text.E;
import androidx.compose.ui.text.style.ResolvedTextDirection;

/* JADX INFO: compiled from: TextPreparedSelection.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class a<T extends a<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1260a f11585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f11587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.compose.ui.text.input.r f11588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f11589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f11590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1260a f11591g;

    public a(C1260a c1260a, long j, B b10, androidx.compose.ui.text.input.r rVar, x xVar) {
        this.f11585a = c1260a;
        this.f11586b = j;
        this.f11587c = b10;
        this.f11588d = rVar;
        this.f11589e = xVar;
        this.f11590f = j;
        this.f11591g = c1260a;
    }

    public final Integer a() {
        B b10 = this.f11587c;
        if (b10 == null) {
            return null;
        }
        int iD = E.d(this.f11590f);
        androidx.compose.ui.text.input.r rVar = this.f11588d;
        int iB = rVar.b(iD);
        C1268i c1268i = b10.f15301b;
        return Integer.valueOf(rVar.a(c1268i.c(c1268i.d(iB), true)));
    }

    public final Integer b() {
        B b10 = this.f11587c;
        if (b10 == null) {
            return null;
        }
        int iE = E.e(this.f11590f);
        androidx.compose.ui.text.input.r rVar = this.f11588d;
        return Integer.valueOf(rVar.a(b10.g(b10.f15301b.d(rVar.b(iE)))));
    }

    public final Integer c() {
        int length;
        B b10 = this.f11587c;
        if (b10 == null) {
            return null;
        }
        int iM = m();
        while (true) {
            C1260a c1260a = this.f11585a;
            if (iM < c1260a.f15408c.length()) {
                int length2 = this.f11591g.f15408c.length() - 1;
                if (iM <= length2) {
                    length2 = iM;
                }
                long j = b10.j(length2);
                int i10 = E.f15315c;
                int i11 = (int) (j & 4294967295L);
                if (i11 > iM) {
                    length = this.f11588d.a(i11);
                    break;
                }
                iM++;
            } else {
                length = c1260a.f15408c.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer d() {
        int iA;
        B b10 = this.f11587c;
        if (b10 == null) {
            return null;
        }
        for (int iM = m(); iM > 0; iM--) {
            int length = this.f11591g.f15408c.length() - 1;
            if (iM <= length) {
                length = iM;
            }
            long j = b10.j(length);
            int i10 = E.f15315c;
            int i11 = (int) (j >> 32);
            if (i11 < iM) {
                iA = this.f11588d.a(i11);
                return Integer.valueOf(iA);
            }
        }
        iA = 0;
        return Integer.valueOf(iA);
    }

    public final boolean e() {
        B b10 = this.f11587c;
        return (b10 != null ? b10.h(m()) : null) != ResolvedTextDirection.f15651c;
    }

    public final int f(B b10, int i10) {
        int iM = m();
        x xVar = this.f11589e;
        if (xVar.f11629a == null) {
            xVar.f11629a = Float.valueOf(b10.c(iM).f3757a);
        }
        int iD = b10.f15301b.d(iM) + i10;
        if (iD < 0) {
            return 0;
        }
        C1268i c1268i = b10.f15301b;
        if (iD >= c1268i.f15475f) {
            return this.f11591g.f15408c.length();
        }
        float fB = c1268i.b(iD) - 1;
        Float f10 = xVar.f11629a;
        kotlin.jvm.internal.i.b(f10);
        float fFloatValue = f10.floatValue();
        if ((e() && fFloatValue >= b10.f(iD)) || (!e() && fFloatValue <= b10.e(iD))) {
            return c1268i.c(iD, true);
        }
        return this.f11588d.a(c1268i.g((((long) Float.floatToRawIntBits(f10.floatValue())) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L)));
    }

    public final void g() {
        this.f11589e.f11629a = null;
        C1260a c1260a = this.f11591g;
        if (c1260a.f15408c.length() > 0) {
            int iD = E.d(this.f11590f);
            String str = c1260a.f15408c;
            int iC = com.voltasit.obdeleven.domain.usecases.device.v.c(iD, str);
            if (iC == E.d(this.f11590f) && iC != str.length()) {
                iC = com.voltasit.obdeleven.domain.usecases.device.v.c(iC + 1, str);
            }
            l(iC, iC);
        }
    }

    public final void h() {
        this.f11589e.f11629a = null;
        C1260a c1260a = this.f11591g;
        if (c1260a.f15408c.length() > 0) {
            int iE = E.e(this.f11590f);
            String str = c1260a.f15408c;
            int iD = com.voltasit.obdeleven.domain.usecases.device.v.d(iE, str);
            if (iD == E.e(this.f11590f) && iD != 0) {
                iD = com.voltasit.obdeleven.domain.usecases.device.v.d(iD - 1, str);
            }
            l(iD, iD);
        }
    }

    public final void i() {
        Integer numA;
        this.f11589e.f11629a = null;
        if (this.f11591g.f15408c.length() <= 0 || (numA = a()) == null) {
            return;
        }
        int iIntValue = numA.intValue();
        l(iIntValue, iIntValue);
    }

    public final void j() {
        Integer numB;
        this.f11589e.f11629a = null;
        if (this.f11591g.f15408c.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        l(iIntValue, iIntValue);
    }

    public final void k() {
        if (this.f11591g.f15408c.length() > 0) {
            int i10 = E.f15315c;
            this.f11590f = O.h.b((int) (this.f11586b >> 32), (int) (this.f11590f & 4294967295L));
        }
    }

    public final void l(int i10, int i11) {
        this.f11590f = O.h.b(i10, i11);
    }

    public final int m() {
        long j = this.f11590f;
        int i10 = E.f15315c;
        return this.f11588d.b((int) (j & 4294967295L));
    }
}
