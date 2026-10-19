package A6;

import java.io.IOException;

/* JADX INFO: renamed from: A6.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0583d implements L6.c<f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0583d f841a = new C0583d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f842b = L6.b.a("sdkVersion");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f843c = L6.b.a("gmpAppId");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L6.b f844d = L6.b.a("platform");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final L6.b f845e = L6.b.a("installationUuid");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final L6.b f846f = L6.b.a("firebaseInstallationId");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final L6.b f847g = L6.b.a("appQualitySessionId");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final L6.b f848h = L6.b.a("buildVersion");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final L6.b f849i = L6.b.a("displayVersion");
    public static final L6.b j = L6.b.a("session");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final L6.b f850k = L6.b.a("ndkPayload");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final L6.b f851l = L6.b.a("appExitInfo");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        f0 f0Var = (f0) obj;
        L6.d dVar2 = dVar;
        dVar2.a(f842b, f0Var.j());
        dVar2.a(f843c, f0Var.f());
        dVar2.c(f844d, f0Var.i());
        dVar2.a(f845e, f0Var.g());
        dVar2.a(f846f, f0Var.e());
        dVar2.a(f847g, f0Var.b());
        dVar2.a(f848h, f0Var.c());
        dVar2.a(f849i, f0Var.d());
        dVar2.a(j, f0Var.k());
        dVar2.a(f850k, f0Var.h());
        dVar2.a(f851l, f0Var.a());
    }
}
