package D9;

/* JADX INFO: compiled from: PartialForwardingClientCall.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class v<ReqT, RespT> extends b<ReqT, RespT> {
    @Override // D9.b
    public void a(String str, Throwable th) {
        f().a(str, th);
    }

    @Override // D9.b
    public final void b() {
        f().b();
    }

    @Override // D9.b
    public final void c() {
        f().c();
    }

    public abstract b<?, ?> f();

    public final String toString() {
        com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
        aVarB.c(f(), "delegate");
        return aVarB.toString();
    }
}
