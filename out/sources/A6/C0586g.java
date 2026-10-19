package A6;

import java.io.IOException;

/* JADX INFO: renamed from: A6.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0586g implements L6.c<f0.e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0586g f871a = new C0586g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f872b = L6.b.a("identifier");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f873c = L6.b.a("version");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L6.b f874d = L6.b.a("displayVersion");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final L6.b f875e = L6.b.a("organization");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final L6.b f876f = L6.b.a("installationUuid");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final L6.b f877g = L6.b.a("developmentPlatform");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final L6.b f878h = L6.b.a("developmentPlatformVersion");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        f0.e.a aVar = (f0.e.a) obj;
        L6.d dVar2 = dVar;
        dVar2.a(f872b, aVar.d());
        dVar2.a(f873c, aVar.g());
        dVar2.a(f874d, aVar.c());
        dVar2.a(f875e, aVar.f());
        dVar2.a(f876f, aVar.e());
        dVar2.a(f877g, aVar.a());
        dVar2.a(f878h, aVar.b());
    }
}
