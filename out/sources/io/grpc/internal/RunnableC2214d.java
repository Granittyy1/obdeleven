package io.grpc.internal;

/* JADX INFO: renamed from: io.grpc.internal.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AbstractStream.java */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2214d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC2216e.a f37529b;

    public RunnableC2214d(AbstractC2216e.a aVar) {
        this.f37529b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC2216e.a aVar = this.f37529b;
        try {
            p111ia.b.c();
            try {
                p111ia.a aVar2 = p111ia.b.f36850a;
                aVar2.getClass();
                aVar.f37531a.request();
                aVar2.getClass();
            } catch (Throwable th) {
                try {
                    p111ia.b.f36850a.getClass();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            ((io.grpc.okhttp.c.b) aVar).o(th3);
        }
    }
}
