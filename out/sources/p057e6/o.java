package p057e6;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f34755c;

    public o(p pVar) {
        this.f34755c = pVar;
    }

    @Override // p057e6.h
    public final void a() {
        p pVar = this.f34755c;
        q qVar = pVar.f34756b;
        qVar.f34759b.a("unlinkToDeath", new Object[0]);
        qVar.f34769m.asBinder().unlinkToDeath(qVar.j, 0);
        q qVar2 = pVar.f34756b;
        qVar2.f34769m = null;
        qVar2.f34764g = false;
    }
}
