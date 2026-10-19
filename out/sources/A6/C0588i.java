package A6;

import java.io.IOException;

/* JADX INFO: renamed from: A6.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0588i implements L6.c<f0.e.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0588i f881a = new C0588i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f882b = L6.b.a("arch");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f883c = L6.b.a("model");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L6.b f884d = L6.b.a("cores");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final L6.b f885e = L6.b.a("ram");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final L6.b f886f = L6.b.a("diskSpace");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final L6.b f887g = L6.b.a("simulator");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final L6.b f888h = L6.b.a("state");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final L6.b f889i = L6.b.a("manufacturer");
    public static final L6.b j = L6.b.a("modelClass");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        f0.e.c cVar = (f0.e.c) obj;
        L6.d dVar2 = dVar;
        dVar2.c(f882b, cVar.a());
        dVar2.a(f883c, cVar.e());
        dVar2.c(f884d, cVar.b());
        dVar2.d(f885e, cVar.g());
        dVar2.d(f886f, cVar.c());
        dVar2.e(f887g, cVar.i());
        dVar2.c(f888h, cVar.h());
        dVar2.a(f889i, cVar.d());
        dVar2.a(j, cVar.f());
    }
}
