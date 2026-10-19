package A6;

import java.io.IOException;

/* JADX INFO: renamed from: A6.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0591l implements L6.c<f0.e.d.a.b.AbstractC0008a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0591l f910a = new C0591l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f911b = L6.b.a("baseAddress");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f912c = L6.b.a("size");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L6.b f913d = L6.b.a("name");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final L6.b f914e = L6.b.a("uuid");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        f0.e.d.a.b.AbstractC0008a abstractC0008a = (f0.e.d.a.b.AbstractC0008a) obj;
        L6.d dVar2 = dVar;
        dVar2.d(f911b, abstractC0008a.a());
        dVar2.d(f912c, abstractC0008a.c());
        dVar2.a(f913d, abstractC0008a.b());
        String strD = abstractC0008a.d();
        dVar2.a(f914e, strD != null ? strD.getBytes(f0.f870a) : null);
    }
}
