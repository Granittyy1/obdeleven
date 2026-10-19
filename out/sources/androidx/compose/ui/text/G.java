package androidx.compose.ui.text;

import androidx.compose.ui.graphics.j0;
import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.text.style.TextForegroundStyle;
import com.braze.Constants;
import com.google.android.gms.internal.measurement.Y;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: TextStyle.kt */
/* JADX INFO: loaded from: classes.dex */
public final class G {
    public static final F a(F f10, F f11, float f12) {
        r rVar;
        v vVar = f10.f15318a;
        v vVar2 = f11.f15318a;
        TextForegroundStyle textForegroundStyle = w.f15708d;
        TextForegroundStyle textForegroundStyle2 = vVar.f15690a;
        TextForegroundStyle textForegroundStyle3 = vVar2.f15690a;
        boolean z10 = textForegroundStyle2 instanceof androidx.compose.ui.text.style.b;
        TextForegroundStyle bVar = TextForegroundStyle.a.f15653a;
        if (!z10 && !(textForegroundStyle3 instanceof androidx.compose.ui.text.style.b)) {
            long jA = Q3.d.A(f12, textForegroundStyle2.c(), textForegroundStyle3.c());
            if (jA != 16) {
                bVar = new androidx.compose.ui.text.style.c(jA);
            }
        } else if (z10 && (textForegroundStyle3 instanceof androidx.compose.ui.text.style.b)) {
            androidx.compose.ui.graphics.C c10 = (androidx.compose.ui.graphics.C) w.b(f12, ((androidx.compose.ui.text.style.b) textForegroundStyle2).f15655a, ((androidx.compose.ui.text.style.b) textForegroundStyle3).f15655a);
            float fN = D9.o.n(((androidx.compose.ui.text.style.b) textForegroundStyle2).f15656b, ((androidx.compose.ui.text.style.b) textForegroundStyle3).f15656b, f12);
            if (c10 != null) {
                if (c10 instanceof m0) {
                    long jI = Y.i(fN, ((m0) c10).f13770a);
                    if (jI != 16) {
                        bVar = new androidx.compose.ui.text.style.c(jI);
                    }
                } else {
                    if (!(c10 instanceof j0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = new androidx.compose.ui.text.style.b((j0) c10, fN);
                }
            }
        } else {
            bVar = (TextForegroundStyle) w.b(f12, textForegroundStyle2, textForegroundStyle3);
        }
        TextForegroundStyle textForegroundStyle4 = bVar;
        androidx.compose.ui.text.font.d dVar = (androidx.compose.ui.text.font.d) w.b(f12, vVar.f15695f, vVar2.f15695f);
        long jC = w.c(f12, vVar.f15691b, vVar2.f15691b);
        androidx.compose.ui.text.font.l lVar = vVar.f15692c;
        if (lVar == null) {
            lVar = androidx.compose.ui.text.font.l.f15442g;
        }
        androidx.compose.ui.text.font.l lVar2 = vVar2.f15692c;
        if (lVar2 == null) {
            lVar2 = androidx.compose.ui.text.font.l.f15442g;
        }
        androidx.compose.ui.text.font.l lVar3 = new androidx.compose.ui.text.font.l(Na.l.D(D9.o.o(f12, lVar.f15447b, lVar2.f15447b), 1, Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS));
        androidx.compose.ui.text.font.j jVar = (androidx.compose.ui.text.font.j) w.b(f12, vVar.f15693d, vVar2.f15693d);
        androidx.compose.ui.text.font.k kVar = (androidx.compose.ui.text.font.k) w.b(f12, vVar.f15694e, vVar2.f15694e);
        String str = (String) w.b(f12, vVar.f15696g, vVar2.f15696g);
        long jC2 = w.c(f12, vVar.f15697h, vVar2.f15697h);
        androidx.compose.ui.text.style.a aVar = vVar.f15698i;
        float f13 = aVar != null ? aVar.f15654a : 0.0f;
        androidx.compose.ui.text.style.a aVar2 = vVar2.f15698i;
        float fN2 = D9.o.n(f13, aVar2 != null ? aVar2.f15654a : 0.0f, f12);
        androidx.compose.ui.text.style.j jVar2 = androidx.compose.ui.text.style.j.f15675c;
        androidx.compose.ui.text.style.j jVar3 = vVar.j;
        if (jVar3 == null) {
            jVar3 = jVar2;
        }
        androidx.compose.ui.text.style.j jVar4 = vVar2.j;
        if (jVar4 != null) {
            jVar2 = jVar4;
        }
        androidx.compose.ui.text.style.j jVar5 = new androidx.compose.ui.text.style.j(D9.o.n(jVar3.f15676a, jVar2.f15676a, f12), D9.o.n(jVar3.f15677b, jVar2.f15677b, f12));
        Z.c cVar = (Z.c) w.b(f12, vVar.f15699k, vVar2.f15699k);
        long jA2 = Q3.d.A(f12, vVar.f15700l, vVar2.f15700l);
        androidx.compose.ui.text.style.h hVar = (androidx.compose.ui.text.style.h) w.b(f12, vVar.f15701m, vVar2.f15701m);
        k0 k0Var = vVar.f15702n;
        if (k0Var == null) {
            k0Var = new k0();
        }
        k0 k0Var2 = vVar2.f15702n;
        if (k0Var2 == null) {
            k0Var2 = new k0();
        }
        long jA3 = Q3.d.A(f12, k0Var.f13653a, k0Var2.f13653a);
        long j = k0Var.f13654b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        long j10 = k0Var2.f13654b;
        k0 k0Var3 = new k0(D9.o.n(k0Var.f13655c, k0Var2.f13655c, f12), jA3, (((long) Float.floatToRawIntBits(D9.o.n(fIntBitsToFloat, Float.intBitsToFloat((int) (j10 >> 32)), f12))) << 32) | (((long) Float.floatToRawIntBits(D9.o.n(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j10 & 4294967295L)), f12))) & 4294967295L));
        s sVar = vVar.f15703o;
        if (sVar == null && vVar2.f15703o == null) {
            sVar = null;
        } else if (sVar == null) {
            sVar = s.f15649a;
        }
        v vVar3 = new v(textForegroundStyle4, jC, lVar3, jVar, kVar, dVar, str, jC2, new androidx.compose.ui.text.style.a(fN2), jVar5, cVar, jA2, hVar, k0Var3, sVar, (J.f) w.b(f12, vVar.f15704p, vVar2.f15704p));
        int i10 = o.f15602b;
        n nVar = f10.f15319b;
        androidx.compose.ui.text.style.g gVar = new androidx.compose.ui.text.style.g(nVar.f15592a);
        n nVar2 = f11.f15319b;
        int i11 = ((androidx.compose.ui.text.style.g) w.b(f12, gVar, new androidx.compose.ui.text.style.g(nVar2.f15592a))).f15669a;
        int i12 = ((androidx.compose.ui.text.style.i) w.b(f12, new androidx.compose.ui.text.style.i(nVar.f15593b), new androidx.compose.ui.text.style.i(nVar2.f15593b))).f15674a;
        long jC3 = w.c(f12, nVar.f15594c, nVar2.f15594c);
        androidx.compose.ui.text.style.k kVar2 = nVar.f15595d;
        if (kVar2 == null) {
            kVar2 = androidx.compose.ui.text.style.k.f15678c;
        }
        androidx.compose.ui.text.style.k kVar3 = nVar2.f15595d;
        if (kVar3 == null) {
            kVar3 = androidx.compose.ui.text.style.k.f15678c;
        }
        androidx.compose.ui.text.style.k kVar4 = new androidx.compose.ui.text.style.k(w.c(f12, kVar2.f15679a, kVar3.f15679a), w.c(f12, kVar2.f15680b, kVar3.f15680b));
        r rVar2 = nVar.f15596e;
        r rVar3 = nVar2.f15596e;
        if (rVar2 == null && rVar3 == null) {
            rVar = null;
        } else {
            if (rVar2 == null) {
                rVar2 = r.f15647b;
            }
            if (rVar3 == null) {
                rVar3 = r.f15647b;
            }
            if (rVar2.f15648a != rVar3.f15648a) {
                ((C1265f) w.b(f12, new C1265f(), new C1265f())).getClass();
                rVar2 = new r(((Boolean) w.b(f12, Boolean.valueOf(rVar2.f15648a), Boolean.valueOf(rVar3.f15648a))).booleanValue());
            }
            rVar = rVar2;
        }
        return new F(vVar3, new n(i11, i12, jC3, kVar4, rVar, (androidx.compose.ui.text.style.f) w.b(f12, nVar.f15597f, nVar2.f15597f), ((androidx.compose.ui.text.style.e) w.b(f12, new androidx.compose.ui.text.style.e(nVar.f15598g), new androidx.compose.ui.text.style.e(nVar2.f15598g))).f15660a, ((androidx.compose.ui.text.style.d) w.b(f12, new androidx.compose.ui.text.style.d(nVar.f15599h), new androidx.compose.ui.text.style.d(nVar2.f15599h))).f15658a, (androidx.compose.ui.text.style.l) w.b(f12, nVar.f15600i, nVar2.f15600i)));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 androidx.compose.ui.text.F, still in use, count: 2, list:
          (r2v0 androidx.compose.ui.text.F) from 0x00d2: MOVE (r30v0 androidx.compose.ui.text.F) = (r2v0 androidx.compose.ui.text.F) (LINE:211)
          (r2v0 androidx.compose.ui.text.F) from 0x00d8: PHI (r30v1 androidx.compose.ui.text.F) = (r30v0 androidx.compose.ui.text.F), (r2v0 androidx.compose.ui.text.F) binds: [B:53:0x00d2, B:50:0x00ce] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public static final androidx.compose.ui.text.F b(androidx.compose.ui.text.F r31, androidx.compose.ui.unit.LayoutDirection r32) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.G.b(androidx.compose.ui.text.F, androidx.compose.ui.unit.LayoutDirection):androidx.compose.ui.text.F");
    }
}
