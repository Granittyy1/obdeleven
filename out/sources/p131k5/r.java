package p131k5;

import U4.C0804l;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f42420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f42421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2568u f42422f;

    public r(C2523i1 c2523i1, String str, String str2, String str3, long j, Bundle bundle) {
        C2568u c2568u;
        C0804l.e(str2);
        C0804l.e(str3);
        this.f42417a = str2;
        this.f42418b = str3;
        this.f42419c = TextUtils.isEmpty(str) ? null : str;
        this.f42420d = j;
        this.f42421e = 0L;
        if (bundle.isEmpty()) {
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
        this.f42422f = c2568u;
    }

    public final r a(C2523i1 c2523i1, long j) {
        return new r(c2523i1, this.f42419c, this.f42417a, this.f42418b, this.f42420d, j, this.f42422f);
    }

    public final String toString() {
        return "Event{appId='" + this.f42417a + "', name='" + this.f42418b + "', params=" + String.valueOf(this.f42422f) + "}";
    }

    public r(C2523i1 c2523i1, String str, String str2, String str3, long j, long j10, C2568u c2568u) {
        C0804l.e(str2);
        C0804l.e(str3);
        C0804l.h(c2568u);
        this.f42417a = str2;
        this.f42418b = str3;
        this.f42419c = TextUtils.isEmpty(str) ? null : str;
        this.f42420d = j;
        this.f42421e = j10;
        if (j10 != 0 && j10 > j) {
            B0 b10 = c2523i1.f42220i;
            C2523i1.g(b10);
            b10.f41715i.a(B0.v(str2), B0.v(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.f42422f = c2568u;
    }
}
