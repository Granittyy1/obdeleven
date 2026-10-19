package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1979j1 implements InterfaceC1994o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1967f1 f26200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2023y1 f26201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f26202c;

    public C1979j1(C2023y1 c2023y1, InterfaceC1967f1 interfaceC1967f1) {
        C2019x0 c2019x0 = C2022y0.f26309a;
        this.f26201b = c2023y1;
        this.f26202c = interfaceC1967f1 instanceof F0;
        this.f26200a = interfaceC1967f1;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1994o1
    public final void a(Object obj, F1 f10) throws IOException {
        Iterator itB = ((F0) obj).zzb.b();
        if (itB.hasNext()) {
            ((InterfaceC2025z0) ((Map.Entry) itB.next()).getKey()).y();
            throw null;
        }
        C2020x1 c2020x1 = ((I0) obj).zzc;
        for (int i10 = 0; i10 < c2020x1.f26299a; i10++) {
            int i11 = c2020x1.f26300b[i10] >>> 3;
            Object obj2 = c2020x1.f26301c[i10];
            C2004s0 c2004s0 = (C2004s0) f10;
            c2004s0.getClass();
            boolean z10 = obj2 instanceof zzei;
            C1999q0 c1999q0 = c2004s0.f26249a;
            if (z10) {
                c1999q0.I(11);
                c1999q0.H(2, i11);
                c1999q0.y(3, (zzei) obj2);
                c1999q0.I(12);
            } else {
                InterfaceC1967f1 interfaceC1967f1 = (InterfaceC1967f1) obj2;
                c1999q0.I(11);
                c1999q0.H(2, i11);
                c1999q0.I(26);
                c1999q0.I(interfaceC1967f1.d());
                interfaceC1967f1.a(c1999q0);
                c1999q0.I(12);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1994o1
    public final void b(Object obj) {
        this.f26201b.getClass();
        C2023y1.a(obj);
        C2022y0.f26309a.a(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1994o1
    public final int c(I0 i10) {
        C2020x1 c2020x1 = i10.zzc;
        int iA = c2020x1.f26302d;
        if (iA == -1) {
            iA = 0;
            for (int i11 = 0; i11 < c2020x1.f26299a; i11++) {
                int i12 = c2020x1.f26300b[i11] >>> 3;
                zzei zzeiVar = (zzei) c2020x1.f26301c[i11];
                int iR = AbstractC2001r0.r(8);
                int iR2 = AbstractC2001r0.r(i12) + AbstractC2001r0.r(16);
                int iR3 = AbstractC2001r0.r(24);
                int iG = zzeiVar.g();
                iA += iR + iR + iR2 + B1.a.a(iG, iG, iR3);
            }
            c2020x1.f26302d = iA;
        }
        if (!this.f26202c) {
            return iA;
        }
        C2000q1 c2000q1 = ((F0) i10).zzb.f26103a;
        if (c2000q1.f26281c > 0) {
            A0.f(c2000q1.f(0));
            throw null;
        }
        Iterator it = c2000q1.c().iterator();
        if (!it.hasNext()) {
            return iA;
        }
        A0.f((Map.Entry) it.next());
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1994o1
    public final int d(I0 i10) {
        int iHashCode = i10.zzc.hashCode();
        if (!this.f26202c) {
            return iHashCode;
        }
        return ((F0) i10).zzb.f26103a.hashCode() + (iHashCode * 53);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1994o1
    public final boolean e(Object obj) {
        ((F0) obj).zzb.d();
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1994o1
    public final boolean f(I0 i10, Object obj) {
        if (!i10.zzc.equals(((I0) obj).zzc)) {
            return false;
        }
        if (this.f26202c) {
            return ((F0) i10).zzb.equals(((F0) obj).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1994o1
    public final void g(Object obj, Object obj2) {
        C1997p1.s(obj, obj2);
        if (this.f26202c) {
            C2019x0 c2019x0 = C2022y0.f26309a;
            if (((F0) obj2).zzb.f26103a.isEmpty()) {
                return;
            }
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1994o1
    public final void h(Object obj, byte[] bArr, int i10, int i11, C1981k0 c1981k0) throws IOException {
        I0 i12 = (I0) obj;
        if (i12.zzc == C2020x1.f26298f) {
            i12.zzc = C2020x1.b();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1994o1
    public final I0 z() {
        InterfaceC1967f1 interfaceC1967f1 = this.f26200a;
        return interfaceC1967f1 instanceof I0 ? (I0) ((I0) interfaceC1967f1).g(4) : ((E0) interfaceC1967f1.b()).e();
    }
}
