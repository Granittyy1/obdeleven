package A6;

import java.io.IOException;

/* JADX INFO: renamed from: A6.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0595p implements L6.c<f0.e.d.a.b.AbstractC0010d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0595p f931a = new C0595p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f932b = L6.b.a("name");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f933c = L6.b.a("importance");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L6.b f934d = L6.b.a("frames");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        f0.e.d.a.b.AbstractC0010d abstractC0010d = (f0.e.d.a.b.AbstractC0010d) obj;
        L6.d dVar2 = dVar;
        dVar2.a(f932b, abstractC0010d.c());
        dVar2.c(f933c, abstractC0010d.b());
        dVar2.a(f934d, abstractC0010d.a());
    }
}
