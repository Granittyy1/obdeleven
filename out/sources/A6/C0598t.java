package A6;

import java.io.IOException;

/* JADX INFO: renamed from: A6.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0598t implements L6.c<f0.e.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0598t f953a = new C0598t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f954b = L6.b.a("timestamp");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f955c = L6.b.a("type");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L6.b f956d = L6.b.a("app");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final L6.b f957e = L6.b.a("device");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final L6.b f958f = L6.b.a("log");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final L6.b f959g = L6.b.a("rollouts");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        f0.e.d dVar2 = (f0.e.d) obj;
        L6.d dVar3 = dVar;
        dVar3.d(f954b, dVar2.e());
        dVar3.a(f955c, dVar2.f());
        dVar3.a(f956d, dVar2.a());
        dVar3.a(f957e, dVar2.b());
        dVar3.a(f958f, dVar2.c());
        dVar3.a(f959g, dVar2.d());
    }
}
