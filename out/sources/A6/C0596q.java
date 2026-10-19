package A6;

import java.io.IOException;

/* JADX INFO: renamed from: A6.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0596q implements L6.c<f0.e.d.a.b.AbstractC0010d.AbstractC0011a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0596q f935a = new C0596q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f936b = L6.b.a("pc");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f937c = L6.b.a("symbol");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L6.b f938d = L6.b.a("file");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final L6.b f939e = L6.b.a("offset");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final L6.b f940f = L6.b.a("importance");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        f0.e.d.a.b.AbstractC0010d.AbstractC0011a abstractC0011a = (f0.e.d.a.b.AbstractC0010d.AbstractC0011a) obj;
        L6.d dVar2 = dVar;
        dVar2.d(f936b, abstractC0011a.d());
        dVar2.a(f937c, abstractC0011a.e());
        dVar2.a(f938d, abstractC0011a.a());
        dVar2.d(f939e, abstractC0011a.c());
        dVar2.c(f940f, abstractC0011a.b());
    }
}
