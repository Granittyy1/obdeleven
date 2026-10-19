package A6;

import java.io.IOException;

/* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements L6.c<f0.e.d.a.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f941a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f942b = L6.b.a("processName");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f943c = L6.b.a("pid");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L6.b f944d = L6.b.a("importance");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final L6.b f945e = L6.b.a("defaultProcess");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        f0.e.d.a.c cVar = (f0.e.d.a.c) obj;
        L6.d dVar2 = dVar;
        dVar2.a(f942b, cVar.c());
        dVar2.c(f943c, cVar.b());
        dVar2.c(f944d, cVar.a());
        dVar2.e(f945e, cVar.d());
    }
}
