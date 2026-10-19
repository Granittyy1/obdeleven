package p131k5;

import U4.C0804l;
import com.google.android.gms.measurement.internal.h;
import com.google.android.gms.measurement.internal.zziq;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class s3 implements Callable<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o3 f42456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f42457c;

    public s3(h hVar, o3 o3Var) {
        this.f42456b = o3Var;
        this.f42457c = hVar;
    }

    @Override // java.util.concurrent.Callable
    public final String call() throws Exception {
        o3 o3Var = this.f42456b;
        String str = o3Var.f42332b;
        C0804l.h(str);
        h hVar = this.f42457c;
        zziq zziqVarH = hVar.H(str);
        zziq.zza zzaVar = zziq.zza.ANALYTICS_STORAGE;
        if (zziqVarH.i(zzaVar) && zziq.e(100, o3Var.f42352w).i(zzaVar)) {
            return hVar.k(o3Var).e();
        }
        hVar.d().f41719n.c("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
