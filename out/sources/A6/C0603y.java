package A6;

import java.io.IOException;

/* JADX INFO: renamed from: A6.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0603y implements L6.c<f0.e.AbstractC0016e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0603y f972a = new C0603y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f973b = L6.b.a("platform");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f974c = L6.b.a("version");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L6.b f975d = L6.b.a("buildVersion");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final L6.b f976e = L6.b.a("jailbroken");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        f0.e.AbstractC0016e abstractC0016e = (f0.e.AbstractC0016e) obj;
        L6.d dVar2 = dVar;
        dVar2.c(f973b, abstractC0016e.b());
        dVar2.a(f974c, abstractC0016e.c());
        dVar2.a(f975d, abstractC0016e.a());
        dVar2.e(f976e, abstractC0016e.d());
    }
}
