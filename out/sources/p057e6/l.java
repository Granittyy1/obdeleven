package p057e6;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f34752c;

    public l(q qVar) {
        this.f34752c = qVar;
    }

    @Override // p057e6.h
    public final void a() {
        q qVar = this.f34752c;
        if (qVar.f34769m != null) {
            qVar.f34759b.a("Unbind from service.", new Object[0]);
            qVar.f34758a.unbindService(qVar.f34768l);
            qVar.f34764g = false;
            qVar.f34769m = null;
            qVar.f34768l = null;
        }
        qVar.b();
    }
}
