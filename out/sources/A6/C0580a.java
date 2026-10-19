package A6;

import java.io.IOException;

/* JADX INFO: renamed from: A6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0580a implements L6.c<f0.a.AbstractC0005a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0580a f815a = new C0580a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f816b = L6.b.a("arch");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f817c = L6.b.a("libraryName");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L6.b f818d = L6.b.a("buildId");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        f0.a.AbstractC0005a abstractC0005a = (f0.a.AbstractC0005a) obj;
        L6.d dVar2 = dVar;
        dVar2.a(f816b, abstractC0005a.a());
        dVar2.a(f817c, abstractC0005a.c());
        dVar2.a(f818d, abstractC0005a.b());
    }
}
