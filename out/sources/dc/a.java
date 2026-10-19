package dc;

import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: EventRecodingLogger.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements cc.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f34700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public org.slf4j.helpers.c f34701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinkedBlockingQueue f34702d;

    @Override // cc.b
    public final void a(String str) {
        c(null);
    }

    @Override // cc.b
    public final void b(String str) {
        c(null);
    }

    public final void c(Object[] objArr) {
        c cVar = new c();
        System.currentTimeMillis();
        cVar.f34703a = this.f34701c;
        cVar.f34704b = objArr;
        Thread.currentThread().getName();
        this.f34702d.add(cVar);
    }

    @Override // cc.b
    public final String getName() {
        return this.f34700b;
    }
}
