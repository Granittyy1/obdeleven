package p131k5;

import com.google.android.gms.measurement.internal.c;
import com.google.android.gms.measurement.internal.e;

/* JADX INFO: renamed from: k5.m1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2539m1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42300b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f42301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f42302d;

    public /* synthetic */ RunnableC2539m1() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42300b) {
            case 0:
                BinderC2535l1 binderC2535l1 = (BinderC2535l1) this.f42302d;
                binderC2535l1.f42293c.Y();
                binderC2535l1.f42293c.O((o3) this.f42301c);
                break;
            default:
                e eVar = (e) this.f42301c;
                c cVarO = ((C2523i1) eVar.f3968a).o();
                String str = cVarO.f26560p;
                String str2 = (String) this.f42302d;
                boolean z10 = (str == null || str.equals(str2)) ? false : true;
                cVarO.f26560p = str2;
                if (z10) {
                    ((C2523i1) eVar.f3968a).o().z();
                }
                break;
        }
    }

    public RunnableC2539m1(BinderC2535l1 binderC2535l1, o3 o3Var) {
        this.f42301c = o3Var;
        this.f42302d = binderC2535l1;
    }
}
