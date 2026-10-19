package p302y6;

import F6.d;
import com.google.firebase.crashlytics.internal.common.a;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import p191p5.f;
import p191p5.g;
import p191p5.j;

/* JADX INFO: renamed from: y6.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2821q implements f<d, Void> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExecutorService f48386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f48387c;

    public C2821q(r rVar, ExecutorService executorService, String str) {
        this.f48387c = rVar;
        this.f48386b = executorService;
    }

    @Override // p191p5.f
    public final g<Void> c(d dVar) throws Exception {
        if (dVar == null) {
            return j.e(null);
        }
        r rVar = this.f48387c;
        return j.f(Arrays.asList(a.b(rVar.f48392f), rVar.f48392f.f28093m.f(this.f48386b, null)));
    }
}
