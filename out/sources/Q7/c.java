package Q7;

import C4.x;
import Fa.d;
import android.content.Context;
import com.google.android.gms.internal.play_billing.C2018x;
import com.google.android.gms.internal.play_billing.G1;
import com.google.android.gms.internal.play_billing.H1;
import com.google.android.gms.internal.play_billing.K1;
import com.google.android.gms.internal.play_billing.U1;
import com.google.android.gms.internal.play_billing.V1;
import com.google.android.gms.internal.play_billing.c2;
import com.google.android.gms.internal.play_billing.g2;
import com.google.android.gms.internal.play_billing.h2;
import com.google.android.gms.internal.play_billing.i2;
import com.google.android.gms.internal.play_billing.m2;
import java.util.ArrayList;
import p237t3.D;
import p237t3.E;

/* JADX INFO: compiled from: ReedSolomonEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5124c;

    public c(Context context, V1 v10) {
        E e10 = new E();
        try {
            x.b(context);
            e10.f47138b = x.a().c(A4.a.f583e).b("PLAY_BILLING_LIBRARY", new p311z4.c("proto"), new d());
        } catch (Throwable unused) {
            e10.f47137a = true;
        }
        this.f5124c = e10;
        this.f5123b = v10;
    }

    public void a(H1 h8) {
        try {
            f(h8, (V1) this.f5123b);
        } catch (Throwable unused) {
            C2018x.i("BillingLogger");
        }
    }

    public void b(H1 h8, int i10, long j) {
        try {
            U1 u10 = (U1) ((V1) this.f5123b).i();
            u10.f();
            V1.s((V1) u10.f26124c, i10);
            V1 v10 = (V1) u10.c();
            this.f5123b = v10;
            if (j != 0) {
                U1 u11 = (U1) v10.i();
                u11.f();
                V1.u((V1) u11.f26124c, j);
                v10 = (V1) u11.c();
            }
            f(h8, v10);
        } catch (Throwable unused) {
            C2018x.i("BillingLogger");
        }
    }

    public void c(H1 h8, long j, boolean z10) {
        V1 v10;
        try {
            G1 g10 = (G1) h8.i();
            c2 c2Var = (c2) h8.r().i();
            c2Var.f();
            g2.q((g2) c2Var.f26124c, z10);
            g10.f();
            H1.u((H1) g10.f26124c, (g2) c2Var.c());
            H1 h10 = (H1) g10.c();
            if (j == 0) {
                v10 = (V1) this.f5123b;
            } else {
                U1 u10 = (U1) ((V1) this.f5123b).i();
                u10.f();
                V1.u((V1) u10.f26124c, j);
                v10 = (V1) u10.c();
            }
            f(h10, v10);
        } catch (Throwable unused) {
            C2018x.i("BillingLogger");
        }
    }

    public void d(H1 h8, int i10, long j, boolean z10) {
        V1 v10;
        try {
            U1 u10 = (U1) ((V1) this.f5123b).i();
            u10.f();
            V1.s((V1) u10.f26124c, i10);
            this.f5123b = (V1) u10.c();
            G1 g10 = (G1) h8.i();
            c2 c2Var = (c2) h8.r().i();
            c2Var.f();
            g2.q((g2) c2Var.f26124c, z10);
            g10.f();
            H1.u((H1) g10.f26124c, (g2) c2Var.c());
            H1 h10 = (H1) g10.c();
            if (j == 0) {
                v10 = (V1) this.f5123b;
            } else {
                U1 u11 = (U1) ((V1) this.f5123b).i();
                u11.f();
                V1.u((V1) u11.f26124c, j);
                v10 = (V1) u11.c();
            }
            f(h10, v10);
        } catch (Throwable unused) {
            C2018x.i("BillingLogger");
        }
    }

    public void e(m2 m2Var) {
        try {
            E e10 = (E) this.f5124c;
            h2 h2VarW = i2.w();
            h2VarW.g((V1) this.f5123b);
            h2VarW.f();
            i2.u((i2) h2VarW.f26124c, m2Var);
            e10.a((i2) h2VarW.c());
        } catch (Throwable unused) {
            C2018x.i("BillingLogger");
        }
    }

    public void f(H1 h8, V1 v10) {
        if (h8 == null) {
            return;
        }
        try {
            h2 h2VarW = i2.w();
            h2VarW.g(v10);
            h2VarW.f();
            i2.q((i2) h2VarW.f26124c, h8);
            ((E) this.f5124c).a((i2) h2VarW.c());
        } catch (Throwable unused) {
            C2018x.i("BillingLogger");
        }
    }

    public void g(K1 k10, V1 v10) {
        if (k10 == null) {
            return;
        }
        try {
            h2 h2VarW = i2.w();
            h2VarW.g(v10);
            h2VarW.f();
            i2.r((i2) h2VarW.f26124c, k10);
            ((E) this.f5124c).a((i2) h2VarW.c());
        } catch (Throwable unused) {
            C2018x.i("BillingLogger");
        }
    }

    public c(a aVar) {
        this.f5123b = aVar;
        ArrayList arrayList = new ArrayList();
        this.f5124c = arrayList;
        arrayList.add(new b(aVar, new int[]{1}));
    }
}
