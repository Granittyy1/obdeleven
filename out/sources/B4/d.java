package B4;

import java.io.IOException;

/* JADX INFO: compiled from: AutoBatchedLogRequestEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements L6.c<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f1538a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f1539b = L6.b.a("eventTimeMs");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f1540c = L6.b.a("eventCode");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L6.b f1541d = L6.b.a("eventUptimeMs");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final L6.b f1542e = L6.b.a("sourceExtension");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final L6.b f1543f = L6.b.a("sourceExtensionJsonProto3");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final L6.b f1544g = L6.b.a("timezoneOffsetSeconds");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final L6.b f1545h = L6.b.a("networkConnectionInfo");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        l lVar = (l) obj;
        L6.d dVar2 = dVar;
        dVar2.d(f1539b, lVar.b());
        dVar2.a(f1540c, lVar.a());
        dVar2.d(f1541d, lVar.c());
        dVar2.a(f1542e, lVar.e());
        dVar2.a(f1543f, lVar.f());
        dVar2.d(f1544g, lVar.g());
        dVar2.a(f1545h, lVar.d());
    }
}
