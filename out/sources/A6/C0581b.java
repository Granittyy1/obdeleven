package A6;

import java.io.IOException;

/* JADX INFO: renamed from: A6.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0581b implements L6.c<f0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0581b f820a = new C0581b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f821b = L6.b.a("pid");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f822c = L6.b.a("processName");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L6.b f823d = L6.b.a("reasonCode");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final L6.b f824e = L6.b.a("importance");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final L6.b f825f = L6.b.a("pss");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final L6.b f826g = L6.b.a("rss");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final L6.b f827h = L6.b.a("timestamp");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final L6.b f828i = L6.b.a("traceFile");
    public static final L6.b j = L6.b.a("buildIdMappingForArch");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        f0.a aVar = (f0.a) obj;
        L6.d dVar2 = dVar;
        dVar2.c(f821b, aVar.c());
        dVar2.a(f822c, aVar.d());
        dVar2.c(f823d, aVar.f());
        dVar2.c(f824e, aVar.b());
        dVar2.d(f825f, aVar.e());
        dVar2.d(f826g, aVar.g());
        dVar2.d(f827h, aVar.h());
        dVar2.a(f828i, aVar.i());
        dVar2.a(j, aVar.a());
    }
}
