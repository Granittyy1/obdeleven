package p302y6;

import D6.e;
import D6.f;
import android.util.Log;
import com.google.firebase.crashlytics.internal.common.a;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p191p5.g;
import p191p5.j;

/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements Callable<g<Void>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Boolean f48395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f48396c;

    public u(v vVar, Boolean bool) {
        this.f48396c = vVar;
        this.f48395b = bool;
    }

    @Override // java.util.concurrent.Callable
    public final g<Void> call() throws Exception {
        Boolean bool = this.f48395b;
        boolean zBooleanValue = bool.booleanValue();
        v vVar = this.f48396c;
        if (zBooleanValue) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            boolean zBooleanValue2 = bool.booleanValue();
            I i10 = vVar.f48398c.f28083b;
            if (!zBooleanValue2) {
                i10.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
            }
            i10.f48329e.d(null);
            ExecutorService executorService = vVar.f48398c.f28086e.f48381a;
            return vVar.f48397b.p(executorService, new t(this, executorService));
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        a aVar = vVar.f48398c;
        Iterator it = f.e(aVar.f28088g.f2815b.listFiles(a.f28081r)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        a aVar2 = vVar.f48398c;
        f fVar = aVar2.f28093m.f48344b.f2811b;
        e.a(f.e(fVar.f2817d.listFiles()));
        e.a(f.e(fVar.f2818e.listFiles()));
        e.a(f.e(fVar.f2819f.listFiles()));
        aVar2.f28097q.d(null);
        return j.e(null);
    }
}
