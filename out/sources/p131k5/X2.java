package p131k5;

import android.content.Intent;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class X2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ V2 f42047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f42048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ B0 f42049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Intent f42050e;

    @Override // java.lang.Runnable
    public final void run() {
        V2 v10 = this.f42047b;
        Z2 z10 = (Z2) v10.f42026a;
        int i10 = this.f42048c;
        if (z10.c(i10)) {
            this.f42049d.f41719n.b(Integer.valueOf(i10), "Local AppMeasurementService processed last upload request. StartId");
            v10.a().f41719n.c("Completed wakeful intent.");
            z10.a(this.f42050e);
        }
    }
}
