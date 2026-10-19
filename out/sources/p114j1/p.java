package p114j1;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import androidx.media3.exoplayer.K;
import io.intercom.android.sdk.models.AttributeType;
import java.util.HashSet;
import p143l4.f;
import p162n1.t;
import p240t6.i;
import p297y1.x;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f41052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f41053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f41054d;

    public /* synthetic */ p(Object obj, int i10, Object obj2) {
        this.f41052b = i10;
        this.f41053c = obj;
        this.f41054d = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0092  */
    /* JADX WARN: Code duplicated, block: B:42:0x0094  */
    /* JADX WARN: Code duplicated, block: B:43:0x0096  */
    @Override // java.lang.Runnable
    public final void run() throws Exception {
        int i10 = 0;
        Object obj = this.f41054d;
        Object obj2 = this.f41053c;
        switch (this.f41052b) {
            case 0:
                o oVar = o.this;
                oVar.getClass();
                Context context = (Context) obj;
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            i10 = 1;
                        } else {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i10 = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i10 = 4;
                                        break;
                                    case 13:
                                        i10 = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i10 = 6;
                                        break;
                                    case 18:
                                        i10 = 2;
                                        break;
                                    case 20:
                                        if (A.f40996a >= 29) {
                                            i10 = 9;
                                        }
                                        break;
                                }
                            } else if (type == 1) {
                                i10 = 2;
                            } else if (type == 4 || type == 5) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i10 = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i10 = 4;
                                        break;
                                    case 13:
                                        i10 = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i10 = 6;
                                        break;
                                    case 18:
                                        i10 = 2;
                                        break;
                                    case 20:
                                        if (A.f40996a >= 29) {
                                            i10 = 9;
                                        }
                                        break;
                                }
                            } else if (type != 6) {
                                i10 = type != 9 ? 8 : 7;
                            } else {
                                i10 = 5;
                            }
                        }
                    } catch (SecurityException unused) {
                    }
                }
                if (A.f40996a < 31 || i10 != 5) {
                    oVar.c(i10);
                    return;
                }
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(AttributeType.PHONE);
                    telephonyManager.getClass();
                    n nVar = new n(oVar);
                    telephonyManager.registerTelephonyCallback(oVar.f41043a, nVar);
                    telephonyManager.unregisterTelephonyCallback(nVar);
                    return;
                } catch (RuntimeException unused2) {
                    oVar.c(5);
                    return;
                }
            case 1:
                HashSet hashSet = f.f44371f;
                f.a.b((String) obj2, (String) obj, new float[0]);
                return;
            case 2:
                ((t) obj2).f44720d.reportPlaybackMetrics((PlaybackMetrics) obj);
                return;
            case 3:
                try {
                    ((Runnable) obj2).run();
                    return;
                } catch (Exception e10) {
                    i.this.l(e10);
                    throw e10;
                }
            default:
                x xVar = (x) obj2;
                xVar.getClass();
                int i11 = A.f40996a;
                K.this.f18039s.W((Exception) obj);
                return;
        }
    }
}
