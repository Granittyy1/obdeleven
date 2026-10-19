package p131k5;

import U4.C0804l;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C1906t1;
import com.google.android.gms.internal.measurement.C1920v1;
import com.google.android.gms.measurement.internal.h;
import com.google.android.gms.measurement.internal.i;
import java.util.Iterator;

/* JADX INFO: renamed from: k5.k1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC2531k1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ BinderC2535l1 f42274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ String f42275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Bundle f42276d;

    @Override // java.lang.Runnable
    public final void run() {
        C2568u c2568u;
        C2529k c2529k = this.f42274b.f42293c.f26601c;
        h.y(c2529k);
        c2529k.p();
        c2529k.t();
        String str = this.f42275c;
        C0804l.e(str);
        C0804l.e("dep");
        TextUtils.isEmpty("");
        Bundle bundle = this.f42276d;
        C2523i1 c2523i1 = (C2523i1) c2529k.f3968a;
        if (bundle == null || bundle.isEmpty()) {
            c2568u = new C2568u(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    B0 b10 = c2523i1.f42220i;
                    C2523i1.g(b10);
                    b10.f41712f.c("Param name can't be null");
                    it.remove();
                } else {
                    z3 z3Var = c2523i1.f42222l;
                    C2523i1.e(z3Var);
                    Object objJ0 = z3Var.j0(bundle2.get(next), next);
                    if (objJ0 == null) {
                        B0 b11 = c2523i1.f42220i;
                        C2523i1.g(b11);
                        b11.f41715i.b(c2523i1.f42223m.f(next), "Param value can't be null");
                        it.remove();
                    } else {
                        z3 z3Var2 = c2523i1.f42222l;
                        C2523i1.e(z3Var2);
                        z3Var2.J(bundle2, next, objJ0);
                    }
                }
            }
            c2568u = new C2568u(bundle2);
        }
        i iVarQ = c2529k.q();
        C1906t1.a aVarI = C1906t1.I();
        aVarI.h();
        C1906t1.F(0L, (C1906t1) aVarI.f25531c);
        Bundle bundle3 = c2568u.f42473b;
        for (String str2 : bundle3.keySet()) {
            C1920v1.a aVarJ = C1920v1.J();
            aVarJ.l(str2);
            Object obj = bundle3.get(str2);
            C0804l.h(obj);
            iVarQ.Q(aVarJ, obj);
            aVarI.j(aVarJ);
        }
        byte[] bArrI = ((C1906t1) aVarI.f()).i();
        B0 b0D = c2529k.d();
        b0D.f41719n.a(c2523i1.f42223m.b(str), Integer.valueOf(bArrI.length), "Saving default event parameters, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrI);
        try {
            if (c2529k.w().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                c2529k.d().f41712f.b(B0.v(str), "Failed to insert default event parameters (got -1). appId");
            }
        } catch (SQLiteException e10) {
            B0 b0D2 = c2529k.d();
            b0D2.f41712f.a(B0.v(str), e10, "Error storing default event parameters. appId");
        }
    }
}
