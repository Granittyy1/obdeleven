package B4;

import java.io.IOException;

/* JADX INFO: compiled from: AutoBatchedLogRequestEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements L6.c<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f1524a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f1525b = L6.b.a("sdkVersion");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f1526c = L6.b.a("model");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L6.b f1527d = L6.b.a("hardware");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final L6.b f1528e = L6.b.a("device");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final L6.b f1529f = L6.b.a("product");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final L6.b f1530g = L6.b.a("osBuild");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final L6.b f1531h = L6.b.a("manufacturer");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final L6.b f1532i = L6.b.a("fingerprint");
    public static final L6.b j = L6.b.a("locale");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final L6.b f1533k = L6.b.a("country");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final L6.b f1534l = L6.b.a("mccMnc");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final L6.b f1535m = L6.b.a("applicationBuild");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        a aVar = (a) obj;
        L6.d dVar2 = dVar;
        dVar2.a(f1525b, aVar.l());
        dVar2.a(f1526c, aVar.i());
        dVar2.a(f1527d, aVar.e());
        dVar2.a(f1528e, aVar.c());
        dVar2.a(f1529f, aVar.k());
        dVar2.a(f1530g, aVar.j());
        dVar2.a(f1531h, aVar.g());
        dVar2.a(f1532i, aVar.d());
        dVar2.a(j, aVar.f());
        dVar2.a(f1533k, aVar.b());
        dVar2.a(f1534l, aVar.h());
        dVar2.a(f1535m, aVar.a());
    }
}
