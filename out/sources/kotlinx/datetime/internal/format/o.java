package kotlinx.datetime.internal.format;

/* JADX INFO: compiled from: FieldSpec.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class o<Target, Type> extends a<Target, Type> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f43891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type f43893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l<Target> f43894d;

    public o(r rVar, Va.a aVar, int i10) {
        String name = rVar.f43934a.getName();
        Object obj = (i10 & 4) != 0 ? (Type) null : aVar;
        kotlin.jvm.internal.i.e(name, "name");
        this.f43891a = rVar;
        this.f43892b = name;
        this.f43893c = (Type) obj;
        this.f43894d = null;
    }

    @Override // kotlinx.datetime.internal.format.m
    public final Type a() {
        return this.f43893c;
    }

    @Override // kotlinx.datetime.internal.format.m
    public final b<Target, Type> b() {
        return this.f43891a;
    }

    @Override // kotlinx.datetime.internal.format.m
    public final l<Target> c() {
        return this.f43894d;
    }

    @Override // kotlinx.datetime.internal.format.m
    public final String getName() {
        return this.f43892b;
    }
}
