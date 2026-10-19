package p302y6;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.common.a;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes3.dex */
public final class z implements Callable<Void> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f48408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f48409c;

    public z(a aVar, long j) {
        this.f48409c = aVar;
        this.f48408b = j;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f48408b);
        this.f48409c.f28091k.c(bundle);
        return null;
    }
}
