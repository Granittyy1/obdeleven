package S4;

import U4.C0804l;
import U4.J;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f5498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f5499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile J f5500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f5501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Context f5502e;

    static {
        new p(v.b0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
        new q(v.b0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));
        new r(v.b0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new s(v.b0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        f5498a = new t(v.b0("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        f5499b = new u(v.b0("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        f5501d = new Object();
    }

    public static void a() throws DynamiteModule.LoadingException {
        J h8;
        if (f5500c != null) {
            return;
        }
        C0804l.h(f5502e);
        synchronized (f5501d) {
            try {
                if (f5500c == null) {
                    IBinder iBinderB = DynamiteModule.c(f5502e, DynamiteModule.f25336c, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i10 = U4.I.f6357c;
                    if (iBinderB == null) {
                        h8 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        h8 = iInterfaceQueryLocalInterface instanceof J ? (J) iInterfaceQueryLocalInterface : new U4.H(iBinderB, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    }
                    f5500c = h8;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Deprecated
    public static I b(String str, w wVar, boolean z10, boolean z11) {
        try {
            a();
            C0804l.h(f5502e);
            try {
                return f5500c.Q(new F(str, wVar, z10, z11), new p018b5.b(f5502e.getPackageManager())) ? I.f5520c : new H(new x(z10, str, wVar));
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return I.c("module call", e10);
            }
        } catch (DynamiteModule.LoadingException e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return I.c("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }
}
