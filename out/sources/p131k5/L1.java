package p131k5;

import android.os.Build;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.e;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class L1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ e f41884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ List f41885c;

    @Override // java.lang.Runnable
    public final void run() {
        e eVar = this.f41884b;
        eVar.p();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray<Long> sparseArrayZ = eVar.n().z();
            for (j3 j3Var : this.f41885c) {
                if (!sparseArrayZ.contains(j3Var.f42258d) || sparseArrayZ.get(j3Var.f42258d).longValue() < j3Var.f42257c) {
                    eVar.T().add(j3Var);
                }
            }
            eVar.S();
        }
    }
}
