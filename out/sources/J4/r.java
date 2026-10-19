package J4;

/* JADX INFO: compiled from: SQLiteEventStore_Factory.java */
/* JADX INFO: loaded from: classes.dex */
public final class r implements E4.b<q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f4006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p268va.a<String> f4007b;

    public r(y yVar, p268va.a aVar) {
        this.f4006a = yVar;
        this.f4007b = aVar;
    }

    @Override // p268va.a
    public final Object get() {
        return new q(new L4.b(), new kotlin.jvm.internal.n(), (e) g.a.f3980a.get(), (x) this.f4006a.get(), this.f4007b);
    }
}
