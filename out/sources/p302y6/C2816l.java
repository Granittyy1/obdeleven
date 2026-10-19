package p302y6;

import java.util.concurrent.Callable;
import p191p5.InterfaceC2755a;
import p191p5.g;

/* JADX INFO: renamed from: y6.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CrashlyticsBackgroundWorker.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2816l implements InterfaceC2755a<Void, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Callable f48380b;

    public C2816l(Callable callable) {
        this.f48380b = callable;
    }

    @Override // p191p5.InterfaceC2755a
    public final Object i(g<Void> gVar) throws Exception {
        return this.f48380b.call();
    }
}
