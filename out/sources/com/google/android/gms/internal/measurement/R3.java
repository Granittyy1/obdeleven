package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class R3 extends Q3<S3, S3> {
    @Override // com.google.android.gms.internal.measurement.Q3
    public final /* synthetic */ int a(S3 s10) {
        return s10.a();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.measurement.Q3
    public final S3 b(Object obj, Object obj2) {
        S3 s10 = (S3) obj;
        S3 s11 = (S3) obj2;
        S3 s12 = S3.f25587f;
        if (s12.equals(s11)) {
            return s10;
        }
        if (s12.equals(s10)) {
            int i10 = s10.f25588a + s11.f25588a;
            int[] iArrCopyOf = Arrays.copyOf(s10.f25589b, i10);
            System.arraycopy(s11.f25589b, 0, iArrCopyOf, s10.f25588a, s11.f25588a);
            Object[] objArrCopyOf = Arrays.copyOf(s10.f25590c, i10);
            System.arraycopy(s11.f25590c, 0, objArrCopyOf, s10.f25588a, s11.f25588a);
            return new S3(i10, iArrCopyOf, objArrCopyOf, true);
        }
        s10.getClass();
        if (!s11.equals(s12)) {
            if (!s10.f25592e) {
                throw new UnsupportedOperationException();
            }
            int i11 = s10.f25588a + s11.f25588a;
            s10.b(i11);
            System.arraycopy(s11.f25589b, 0, s10.f25589b, s10.f25588a, s11.f25588a);
            System.arraycopy(s11.f25590c, 0, s10.f25590c, s10.f25588a, s11.f25588a);
            s10.f25588a = i11;
        }
        return s10;
    }

    @Override // com.google.android.gms.internal.measurement.Q3
    public final void c(S3 s10, InterfaceC1791c4 interfaceC1791c4) throws IOException {
        S3 s11 = s10;
        s11.getClass();
        interfaceC1791c4.getClass();
        for (int i10 = 0; i10 < s11.f25588a; i10++) {
            int i11 = s11.f25589b[i10] >>> 3;
            Object obj = s11.f25590c[i10];
            B2 b10 = (B2) interfaceC1791c4;
            b10.getClass();
            boolean z10 = obj instanceof zzij;
            zzja.a aVar = b10.f25401a;
            if (z10) {
                aVar.R0(1, 3);
                aVar.T0(2, i11);
                aVar.H0(3, (zzij) obj);
                aVar.R0(1, 4);
            } else {
                InterfaceC1894r3 interfaceC1894r3 = (InterfaceC1894r3) obj;
                aVar.R0(1, 3);
                aVar.T0(2, i11);
                aVar.R0(3, 2);
                aVar.S0(interfaceC1894r3.c());
                interfaceC1894r3.a(aVar);
                aVar.R0(1, 4);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.Q3
    public final int d(S3 s10) {
        S3 s11 = s10;
        int i10 = s11.f25591d;
        if (i10 != -1) {
            return i10;
        }
        int iK0 = 0;
        for (int i11 = 0; i11 < s11.f25588a; i11++) {
            int i12 = s11.f25589b[i11] >>> 3;
            iK0 += zzja.k0(3, (zzij) s11.f25590c[i11]) + zzja.B0(2, i12) + (zzja.C0(8) << 1);
        }
        s11.f25591d = iK0;
        return iK0;
    }

    @Override // com.google.android.gms.internal.measurement.Q3
    public final /* synthetic */ void e(int i10, long j, Object obj) {
        ((S3) obj).c(i10 << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.measurement.Q3
    public final /* synthetic */ void f(S3 s10, InterfaceC1791c4 interfaceC1791c4) throws IOException {
        s10.d(interfaceC1791c4);
    }

    @Override // com.google.android.gms.internal.measurement.Q3
    public final S3 g(Object obj) {
        N2 n10 = (N2) obj;
        S3 s10 = n10.zzb;
        if (s10 != S3.f25587f) {
            return s10;
        }
        S3 s11 = new S3();
        n10.zzb = s11;
        return s11;
    }

    @Override // com.google.android.gms.internal.measurement.Q3
    public final void h(Object obj, S3 s10) {
        ((N2) obj).zzb = s10;
    }

    @Override // com.google.android.gms.internal.measurement.Q3
    public final /* synthetic */ S3 i(Object obj) {
        return ((N2) obj).zzb;
    }

    @Override // com.google.android.gms.internal.measurement.Q3
    public final void j(Object obj) {
        S3 s10 = ((N2) obj).zzb;
        if (s10.f25592e) {
            s10.f25592e = false;
        }
    }
}
