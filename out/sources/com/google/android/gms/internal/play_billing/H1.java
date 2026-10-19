package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class H1 extends I0 implements InterfaceC1970g1 {
    private static final H1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private N1 zzh;
    private int zzi;

    static {
        H1 h8 = new H1();
        zzb = h8;
        I0.n(H1.class, h8);
    }

    public static H1 q(byte[] bArr, C2013v0 c2013v0) throws zzfq {
        I0 i10 = zzb;
        int length = bArr.length;
        if (length != 0) {
            i10 = (I0) i10.g(4);
            try {
                InterfaceC1994o1 interfaceC1994o1A = C1985l1.f26210c.a(i10.getClass());
                interfaceC1994o1A.h(i10, bArr, 0, length, new C1981k0(c2013v0));
                interfaceC1994o1A.b(i10);
            } catch (zzfq e10) {
                throw e10;
            } catch (zzhg e11) {
                throw new zzfq(e11.getMessage());
            } catch (IOException e12) {
                if (e12.getCause() instanceof zzfq) {
                    throw ((zzfq) e12.getCause());
                }
                throw new zzfq(e12.getMessage(), e12);
            } catch (IndexOutOfBoundsException unused) {
                throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        if (i10 == null || I0.f(i10, true)) {
            return (H1) i10;
        }
        throw new zzfq(new zzhg().getMessage());
    }

    public static /* synthetic */ void s(H1 h8, zzil zzilVar) {
        h8.zzi = zzilVar.a();
        h8.zzd |= 4;
    }

    public static /* synthetic */ void t(H1 h8, N1 n10) {
        h8.zzh = n10;
        h8.zzd |= 2;
    }

    public static /* synthetic */ void u(H1 h8, g2 g2Var) {
        h8.zzf = g2Var;
        h8.zze = 7;
    }

    public static /* synthetic */ void v(H1 h8, r2 r2Var) {
        h8.zzf = r2Var;
        h8.zze = 6;
    }

    public static /* synthetic */ void w(H1 h8, int i10) {
        h8.zzg = i10 - 1;
        h8.zzd |= 1;
    }

    public static G1 x() {
        return (G1) zzb.h();
    }

    @Override // com.google.android.gms.internal.play_billing.I0
    public final Object g(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C1991n1(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", I1.f26142a, "zzh", a2.class, "zzi", Q1.f26152a, r2.class, g2.class});
        }
        if (i11 == 3) {
            return new H1();
        }
        if (i11 == 4) {
            return new G1(zzb);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }

    public final g2 r() {
        return this.zze == 7 ? (g2) this.zzf : g2.r();
    }
}
