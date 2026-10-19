package p074fa;

import kotlin.jvm.internal.i;
import p061ea.f;
import p061ea.g;

/* JADX INFO: compiled from: Unsafe.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f35067a = new byte[0];

    public static final void a(f fVar, a aVar) {
        i.e(fVar, "<this>");
        if (aVar == fVar) {
            return;
        }
        int i10 = aVar.f34857c;
        int i11 = aVar.f34856b;
        if (i10 <= i11) {
            fVar.h(aVar);
            return;
        }
        int i12 = aVar.f34859e;
        int i13 = aVar.f34860f;
        if (i13 - i12 >= 8) {
            fVar.f34868e = i11;
            return;
        }
        a aVarG = aVar.g();
        if (aVarG == null) {
            fVar.k(aVar);
            return;
        }
        int i14 = aVar.f34857c - aVar.f34856b;
        int iMin = Math.min(i14, 8 - (i13 - aVar.f34859e));
        if (aVarG.f34858d < iMin) {
            fVar.k(aVar);
            return;
        }
        aVarG.d(aVarG.f34856b - iMin);
        if (i14 > iMin) {
            aVar.f34859e = i13;
            fVar.f34869f = aVar.f34857c;
            fVar.C(fVar.f34870g + ((long) iMin));
        } else {
            fVar.M(aVarG);
            fVar.C(fVar.f34870g - ((long) ((aVarG.f34857c - aVarG.f34856b) - iMin)));
            aVar.f();
            aVar.i(fVar.f34865b);
        }
    }

    public static final a b(f fVar, int i10) {
        i.e(fVar, "<this>");
        return fVar.x(i10, fVar.s());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final a c(f fVar, a aVar) {
        i.e(fVar, "<this>");
        if (aVar != fVar) {
            return fVar.h(aVar);
        }
        if (fVar.f34868e == fVar.f34869f && fVar.f34870g == 0) {
            return null;
        }
        return (a) fVar;
    }

    public static final a d(g gVar, int i10, a aVar) {
        i.e(gVar, "<this>");
        if (aVar != null) {
            gVar.b();
        }
        return gVar.k(i10);
    }
}
