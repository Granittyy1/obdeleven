package p131k5;

import com.google.android.gms.internal.measurement.A1;
import com.google.android.gms.internal.measurement.C1774a1;
import com.google.android.gms.internal.measurement.C1781b1;
import com.google.android.gms.internal.measurement.D4;
import com.google.android.gms.internal.measurement.zzfh$zzd;
import com.google.android.gms.measurement.internal.i;
import java.math.BigDecimal;

/* JADX INFO: renamed from: k5.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2486b extends AbstractC2491c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1781b1 f42085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C3 f42086h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2486b(C3 c10, String str, int i10, C1781b1 c1781b1) {
        super(str, i10);
        this.f42086h = c10;
        this.f42085g = c1781b1;
    }

    @Override // p131k5.AbstractC2491c
    public final int a() {
        return this.f42085g.v();
    }

    @Override // p131k5.AbstractC2491c
    public final boolean f() {
        return false;
    }

    @Override // p131k5.AbstractC2491c
    public final boolean g() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final boolean h(Long l10, Long l11, A1 a10, boolean z10) {
        D4.a();
        C3 c10 = this.f42086h;
        boolean zB = ((C2523i1) c10.f3968a).f42218g.B(this.f42099a, B.f41672g0);
        C1781b1 c1781b1 = this.f42085g;
        boolean zB2 = c1781b1.B();
        boolean zC = c1781b1.C();
        boolean zD = c1781b1.D();
        Object[] objArr = zB2 || zC || zD;
        Boolean boolC = null;
        boolE = null;
        Boolean boolE = null;
        boolC = null;
        boolC = null;
        boolC = null;
        Boolean boolE2 = null;
        boolC = null;
        if (z10 && objArr != true) {
            c10.d().f41719n.a(Integer.valueOf(this.f42100b), c1781b1.E() ? Integer.valueOf(c1781b1.v()) : null, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        C1774a1 c1774a1X = c1781b1.x();
        boolean zB3 = c1774a1X.B();
        if (a10.N()) {
            if (c1774a1X.D()) {
                boolC = AbstractC2491c.c(AbstractC2491c.b(a10.E(), c1774a1X.y()), zB3);
            } else {
                c10.d().f41715i.b(((C2523i1) c10.f3968a).f42223m.g(a10.J()), "No number filter for long property. property");
            }
        } else if (a10.L()) {
            if (c1774a1X.D()) {
                double dV = a10.v();
                try {
                    boolE = AbstractC2491c.e(new BigDecimal(dV), c1774a1X.y(), Math.ulp(dV));
                } catch (NumberFormatException unused) {
                }
                boolC = AbstractC2491c.c(boolE, zB3);
            } else {
                c10.d().f41715i.b(((C2523i1) c10.f3968a).f42223m.g(a10.J()), "No number filter for double property. property");
            }
        } else if (!a10.P()) {
            c10.d().f41715i.b(((C2523i1) c10.f3968a).f42223m.g(a10.J()), "User property has no value, property");
        } else if (c1774a1X.F()) {
            boolC = AbstractC2491c.c(AbstractC2491c.d(a10.K(), c1774a1X.z(), c10.d()), zB3);
        } else if (!c1774a1X.D()) {
            c10.d().f41715i.b(((C2523i1) c10.f3968a).f42223m.g(a10.J()), "No string or number filter defined. property");
        } else if (i.c0(a10.K())) {
            String strK = a10.K();
            zzfh$zzd zzfh_zzdY = c1774a1X.y();
            if (i.c0(strK)) {
                try {
                    boolE2 = AbstractC2491c.e(new BigDecimal(strK), zzfh_zzdY, 0.0d);
                } catch (NumberFormatException unused2) {
                }
            }
            boolC = AbstractC2491c.c(boolE2, zB3);
        } else {
            c10.d().f41715i.a(((C2523i1) c10.f3968a).f42223m.g(a10.J()), a10.K(), "Invalid user property value for Numeric number filter. property, value");
        }
        c10.d().f41719n.b(boolC == null ? "null" : boolC, "Property filter result");
        if (boolC == null) {
            return false;
        }
        this.f42101c = Boolean.TRUE;
        if (zD && !boolC.booleanValue()) {
            return true;
        }
        if (!z10 || c1781b1.B()) {
            this.f42102d = boolC;
        }
        if (boolC.booleanValue() && objArr != false && a10.O()) {
            long jG = a10.G();
            if (l10 != null) {
                jG = l10.longValue();
            }
            if (zB && c1781b1.B() && !c1781b1.C() && l11 != null) {
                jG = l11.longValue();
            }
            if (c1781b1.C()) {
                this.f42104f = Long.valueOf(jG);
            } else {
                this.f42103e = Long.valueOf(jG);
            }
        }
        return true;
    }
}
