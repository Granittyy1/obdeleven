package A6;

import java.io.IOException;

/* JADX INFO: renamed from: A6.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0593n implements L6.c<f0.e.d.a.b.AbstractC0009b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0593n f921a = new C0593n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f922b = L6.b.a("type");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f923c = L6.b.a("reason");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L6.b f924d = L6.b.a("frames");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final L6.b f925e = L6.b.a("causedBy");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final L6.b f926f = L6.b.a("overflowCount");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        f0.e.d.a.b.AbstractC0009b abstractC0009b = (f0.e.d.a.b.AbstractC0009b) obj;
        L6.d dVar2 = dVar;
        dVar2.a(f922b, abstractC0009b.e());
        dVar2.a(f923c, abstractC0009b.d());
        dVar2.a(f924d, abstractC0009b.b());
        dVar2.a(f925e, abstractC0009b.a());
        dVar2.c(f926f, abstractC0009b.c());
    }
}
