package p302y6;

import com.google.firebase.crashlytics.internal.common.a;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes3.dex */
public final class y implements Callable<Void> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f48406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f48407c;

    public y(a aVar, String str) {
        this.f48407c = aVar;
        this.f48406b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        a.a(this.f48407c, this.f48406b, Boolean.FALSE);
        return null;
    }
}
