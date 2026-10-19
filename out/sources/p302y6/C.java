package p302y6;

import W.f;
import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: CrashlyticsCore.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C implements Callable<Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f48296b;

    public C(E e10) {
        this.f48296b = e10;
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() throws Exception {
        try {
            f fVar = this.f48296b.f48302e;
            String str = (String) fVar.f6996b;
            D6.f fVar2 = (D6.f) fVar.f6997c;
            fVar2.getClass();
            return Boolean.valueOf(new File(fVar2.f2815b, str).delete());
        } catch (Exception e10) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e10);
            return Boolean.FALSE;
        }
    }
}
