package A6;

import java.io.IOException;

/* JADX INFO: renamed from: A6.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0592m implements L6.c<f0.e.d.a.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0592m f915a = new C0592m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f916b = L6.b.a("threads");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f917c = L6.b.a("exception");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L6.b f918d = L6.b.a("appExitInfo");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final L6.b f919e = L6.b.a("signal");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final L6.b f920f = L6.b.a("binaries");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        f0.e.d.a.b bVar = (f0.e.d.a.b) obj;
        L6.d dVar2 = dVar;
        dVar2.a(f916b, bVar.e());
        dVar2.a(f917c, bVar.c());
        dVar2.a(f918d, bVar.a());
        dVar2.a(f919e, bVar.d());
        dVar2.a(f920f, bVar.b());
    }
}
