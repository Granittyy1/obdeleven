package A6;

import java.io.IOException;

/* JADX INFO: renamed from: A6.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0594o implements L6.c<f0.e.d.a.b.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0594o f927a = new C0594o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f928b = L6.b.a("name");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f929c = L6.b.a("code");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L6.b f930d = L6.b.a("address");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        f0.e.d.a.b.c cVar = (f0.e.d.a.b.c) obj;
        L6.d dVar2 = dVar;
        dVar2.a(f928b, cVar.c());
        dVar2.a(f929c, cVar.b());
        dVar2.d(f930d, cVar.a());
    }
}
