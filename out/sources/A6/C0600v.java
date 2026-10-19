package A6;

import java.io.IOException;

/* JADX INFO: renamed from: A6.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0600v implements L6.c<f0.e.d.AbstractC0015e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0600v f962a = new C0600v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f963b = L6.b.a("rolloutVariant");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f964c = L6.b.a("parameterKey");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L6.b f965d = L6.b.a("parameterValue");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final L6.b f966e = L6.b.a("templateVersion");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        f0.e.d.AbstractC0015e abstractC0015e = (f0.e.d.AbstractC0015e) obj;
        L6.d dVar2 = dVar;
        dVar2.a(f963b, abstractC0015e.c());
        dVar2.a(f964c, abstractC0015e.a());
        dVar2.a(f965d, abstractC0015e.b());
        dVar2.d(f966e, abstractC0015e.d());
    }
}
