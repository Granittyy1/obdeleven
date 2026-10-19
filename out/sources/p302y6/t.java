package p302y6;

import F6.d;
import com.google.firebase.crashlytics.internal.common.a;
import java.util.concurrent.ExecutorService;
import p191p5.f;
import p191p5.g;
import p191p5.j;

/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements f<d, Void> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f48393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f48394c;

    public t(u uVar, ExecutorService executorService) {
        this.f48394c = uVar;
        this.f48393b = executorService;
    }

    @Override // p191p5.f
    public final g<Void> c(d dVar) throws Exception {
        if (dVar == null) {
            return j.e(null);
        }
        u uVar = this.f48394c;
        a.b(uVar.f48396c.f48398c);
        v vVar = uVar.f48396c;
        vVar.f48398c.f28093m.f(this.f48393b, null);
        vVar.f48398c.f28097q.d(null);
        return j.e(null);
    }
}
