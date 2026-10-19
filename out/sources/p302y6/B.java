package p302y6;

import F6.h;
import java.util.concurrent.Callable;
import p191p5.g;

/* JADX INFO: compiled from: CrashlyticsCore.java */
/* JADX INFO: loaded from: classes3.dex */
public final class B implements Callable<g<Void>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f48294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ E f48295c;

    public B(E e10, h hVar) {
        this.f48295c = e10;
        this.f48294b = hVar;
    }

    @Override // java.util.concurrent.Callable
    public final g<Void> call() throws Exception {
        return E.a(this.f48295c, this.f48294b);
    }
}
