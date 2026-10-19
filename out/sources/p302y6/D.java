package p302y6;

import W.f;
import android.util.Log;
import com.google.firebase.crashlytics.internal.common.a;
import java.io.File;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: CrashlyticsCore.java */
/* JADX INFO: loaded from: classes3.dex */
public final class D implements Callable<Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f48297b;

    public D(E e10) {
        this.f48297b = e10;
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() throws Exception {
        a aVar = this.f48297b.f48304g;
        f fVar = aVar.f28084c;
        String str = (String) fVar.f6996b;
        D6.f fVar2 = (D6.f) fVar.f6997c;
        fVar2.getClass();
        boolean z10 = true;
        if (new File(fVar2.f2815b, str).exists()) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            String str2 = (String) fVar.f6996b;
            fVar2.getClass();
            new File(fVar2.f2815b, str2).delete();
        } else {
            String strE = aVar.e();
            if (strE == null || !aVar.j.c(strE)) {
                z10 = false;
            }
        }
        return Boolean.valueOf(z10);
    }
}
