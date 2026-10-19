package A6;

import java.io.IOException;

/* JADX INFO: renamed from: A6.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0590k implements L6.c<f0.e.d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0590k f902a = new C0590k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f903b = L6.b.a("execution");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f904c = L6.b.a("customAttributes");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L6.b f905d = L6.b.a("internalKeys");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final L6.b f906e = L6.b.a("background");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final L6.b f907f = L6.b.a("currentProcessDetails");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final L6.b f908g = L6.b.a("appProcessDetails");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final L6.b f909h = L6.b.a("uiOrientation");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        f0.e.d.a aVar = (f0.e.d.a) obj;
        L6.d dVar2 = dVar;
        dVar2.a(f903b, aVar.e());
        dVar2.a(f904c, aVar.d());
        dVar2.a(f905d, aVar.f());
        dVar2.a(f906e, aVar.b());
        dVar2.a(f907f, aVar.c());
        dVar2.a(f908g, aVar.a());
        dVar2.c(f909h, aVar.g());
    }
}
