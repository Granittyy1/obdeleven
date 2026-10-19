package B4;

import java.io.IOException;

/* JADX INFO: compiled from: AutoBatchedLogRequestEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class e implements L6.c<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f1546a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f1547b = L6.b.a("requestTimeMs");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f1548c = L6.b.a("requestUptimeMs");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L6.b f1549d = L6.b.a("clientInfo");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final L6.b f1550e = L6.b.a("logSource");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final L6.b f1551f = L6.b.a("logSourceName");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final L6.b f1552g = L6.b.a("logEvent");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final L6.b f1553h = L6.b.a("qosTier");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        m mVar = (m) obj;
        L6.d dVar2 = dVar;
        dVar2.d(f1547b, mVar.f());
        dVar2.d(f1548c, mVar.g());
        dVar2.a(f1549d, mVar.a());
        dVar2.a(f1550e, mVar.c());
        dVar2.a(f1551f, mVar.d());
        dVar2.a(f1552g, mVar.b());
        dVar2.a(f1553h, mVar.e());
    }
}
