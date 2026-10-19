package p237t3;

import com.android.billingclient.api.a;
import com.google.android.gms.internal.play_billing.C2018x;
import com.google.android.gms.internal.play_billing.G1;
import com.google.android.gms.internal.play_billing.H1;
import com.google.android.gms.internal.play_billing.J1;
import com.google.android.gms.internal.play_billing.K1;
import com.google.android.gms.internal.play_billing.L1;
import com.google.android.gms.internal.play_billing.N1;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f47135a = 0;

    static {
        int i10 = D.f47136a;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            String str = simpleName + ":" + message;
            int i10 = C2018x.f26297a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable unused) {
            C2018x.i("BillingLogger");
            return null;
        }
    }

    public static H1 b(zzie zzieVar, int i10, a aVar, String str, zzil zzilVar) {
        try {
            L1 l1V = N1.v();
            int i11 = aVar.f23552a;
            l1V.f();
            N1.u((N1) l1V.f26124c, i11);
            String str2 = aVar.f23554c;
            l1V.f();
            N1.r((N1) l1V.f26124c, str2);
            int i12 = aVar.f23553b;
            if (i12 != 0) {
                l1V.f();
                N1.s((N1) l1V.f26124c, i12);
            }
            if (zzieVar != null) {
                l1V.f();
                N1.t((N1) l1V.f26124c, zzieVar);
            }
            if (str != null) {
                l1V.f();
                N1.q((N1) l1V.f26124c, str);
            }
            G1 g1X = H1.x();
            g1X.g(l1V);
            g1X.f();
            H1.w((H1) g1X.f26124c, i10);
            if (!zzilVar.equals(zzil.BROADCAST_ACTION_UNSPECIFIED)) {
                g1X.f();
                H1.s((H1) g1X.f26124c, zzilVar);
            }
            return (H1) g1X.c();
        } catch (Throwable unused) {
            C2018x.i("BillingLogger");
            return null;
        }
    }

    public static K1 c(int i10, zzil zzilVar) {
        try {
            J1 j1V = K1.v();
            j1V.f();
            K1.u((K1) j1V.f26124c, i10);
            if (!zzilVar.equals(zzil.BROADCAST_ACTION_UNSPECIFIED)) {
                j1V.f();
                K1.r((K1) j1V.f26124c, zzilVar);
            }
            return (K1) j1V.c();
        } catch (Exception unused) {
            C2018x.i("BillingLogger");
            return null;
        }
    }
}
