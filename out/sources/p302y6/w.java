package p302y6;

import com.google.firebase.crashlytics.internal.common.a;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w implements Callable<Void> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f48399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f48400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f48401d;

    public w(a aVar, long j, String str) {
        this.f48401d = aVar;
        this.f48399b = j;
        this.f48400c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        a aVar = this.f48401d;
        H h8 = aVar.f28094n;
        if (h8 != null && h8.f48324e.get()) {
            return null;
        }
        aVar.f28090i.f48863b.c(this.f48399b, this.f48400c);
        return null;
    }
}
