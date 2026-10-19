package p131k5;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.A;
import com.google.android.gms.internal.measurement.C1793d;
import com.google.android.gms.internal.measurement.C1800e;
import com.google.android.gms.internal.measurement.C1823h1;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.measurement.internal.d;
import com.google.android.gms.measurement.internal.h;
import com.google.android.gms.measurement.internal.i;
import java.util.HashMap;

/* JADX INFO: renamed from: k5.y1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2586y1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2588z f42532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o3 f42533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinderC2535l1 f42534d;

    public RunnableC2586y1(BinderC2535l1 binderC2535l1, C2588z c2588z, o3 o3Var) {
        this.f42532b = c2588z;
        this.f42533c = o3Var;
        this.f42534d = binderC2535l1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        C1823h1 c1823h1;
        boolean zB;
        C2568u c2568u;
        BinderC2535l1 binderC2535l1 = this.f42534d;
        binderC2535l1.getClass();
        C2588z c2588z = this.f42532b;
        boolean zEquals = "_cmp".equals(c2588z.f42542b);
        h hVar = binderC2535l1.f42293c;
        if (zEquals && (c2568u = c2588z.f42543c) != null) {
            Bundle bundle = c2568u.f42473b;
            if (bundle.size() != 0) {
                String string = bundle.getString("_cis");
                if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                    hVar.d().f41717l.b(c2588z.toString(), "Event has been filtered ");
                    c2588z = new C2588z("_cmpx", c2588z.f42543c, c2588z.f42544d, c2588z.f42545e);
                }
            }
        }
        String str = c2588z.f42542b;
        d dVar = hVar.f26599a;
        i iVar = hVar.f26605g;
        h.y(dVar);
        o3 o3Var = this.f42533c;
        String str2 = o3Var.f42332b;
        if (TextUtils.isEmpty(str2) || (c1823h1 = (C1823h1) dVar.f26565h.get(str2)) == null || c1823h1.v() == 0) {
            binderC2535l1.d0(c2588z, o3Var);
            return;
        }
        D0 d10 = hVar.d().f41719n;
        String str3 = o3Var.f42332b;
        d10.b(str3, "EES config found for");
        d dVar2 = hVar.f26599a;
        h.y(dVar2);
        A aC = TextUtils.isEmpty(str3) ? null : dVar2.j.c(str3);
        if (aC == null) {
            hVar.d().f41719n.b(str3, "EES not loaded for");
            binderC2535l1.d0(c2588z, o3Var);
            return;
        }
        try {
            h.y(iVar);
            HashMap mapH = i.H(c2588z.f42543c.k(), true);
            String strB = Y.b(str, P.f41947g, P.f41945e);
            if (strB == null) {
                strB = str;
            }
            zB = aC.b(new C1800e(strB, c2588z.f42545e, mapH));
        } catch (zzc unused) {
            hVar.d().f41712f.a(o3Var.f42333c, str, "EES error. appId, eventName");
            zB = false;
        }
        if (!zB) {
            hVar.d().f41719n.b(str, "EES was not applied to event");
            binderC2535l1.d0(c2588z, o3Var);
            return;
        }
        C1793d c1793d = aC.f25393c;
        boolean zEquals2 = c1793d.f25672b.equals(c1793d.f25671a);
        C1793d c1793d2 = aC.f25393c;
        if (zEquals2) {
            binderC2535l1.d0(c2588z, o3Var);
        } else {
            hVar.d().f41719n.b(str, "EES edited event");
            h.y(iVar);
            binderC2535l1.d0(i.J(c1793d2.f25672b), o3Var);
        }
        if (aC.f25393c.f25673c.isEmpty()) {
            return;
        }
        for (C1800e c1800e : c1793d2.f25673c) {
            hVar.d().f41719n.b(c1800e.f25681a, "EES logging created event");
            h.y(iVar);
            binderC2535l1.d0(i.J(c1800e), o3Var);
        }
    }
}
