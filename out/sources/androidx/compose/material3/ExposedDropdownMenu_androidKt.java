package androidx.compose.material3;

import android.view.View;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;

/* JADX INFO: compiled from: ExposedDropdownMenu.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ExposedDropdownMenu_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f12164a = 16;

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final void a(final boolean r32, final Ia.l<? super java.lang.Boolean, p293xa.r> r33, androidx.compose.ui.h r34, final Ia.q<? super androidx.compose.material3.ExposedDropdownMenuBoxScope, ? super androidx.compose.runtime.InterfaceC1084f, ? super java.lang.Integer, p293xa.r> r35, androidx.compose.runtime.InterfaceC1084f r36, final int r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenu_androidKt.a(boolean, Ia.l, androidx.compose.ui.h, Ia.q, androidx.compose.runtime.f, int, int):void");
    }

    public static final void b(final View view, final p013b0.c cVar, final Ia.a<p293xa.r> aVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(-1319522472);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.k(view) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.K(cVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.k(aVar) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c1086gP.s()) {
            c1086gP.w();
        } else {
            boolean zK = ((i11 & 896) == 256) | c1086gP.k(view);
            Object objF = c1086gP.f();
            if (zK || objF == InterfaceC1084f.a.f12980a) {
                objF = new Ia.l<androidx.compose.runtime.B, androidx.compose.runtime.A>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final androidx.compose.runtime.A invoke(androidx.compose.runtime.B b10) {
                        return new D(new E(view, aVar));
                    }
                };
                c1086gP.E(objF);
            }
            androidx.compose.runtime.E.b(view, cVar, (Ia.l) objF, c1086gP);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$SoftKeyboardListener$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    ExposedDropdownMenu_androidKt.b(view, cVar, aVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    public static final int c(int i10, I.f fVar, I.f fVar2) {
        int iB;
        float f10 = i10;
        float f11 = fVar.f3758b;
        float f12 = f11 + f10;
        float f13 = fVar.f3760d;
        float f14 = f13 - f10;
        float f15 = fVar2.f3758b;
        if (f15 <= f13) {
            float f16 = fVar2.f3760d;
            if (f16 < f11) {
                iB = Ka.a.b(f14 - f12);
            } else {
                iB = Ka.a.b(Math.max(f15 - f12, f14 - f16));
            }
        } else {
            iB = Ka.a.b(f14 - f12);
        }
        return Math.max(iB, 0);
    }
}
