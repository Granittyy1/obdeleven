package A6;

import java.io.IOException;

/* JADX INFO: renamed from: A6.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0585f implements L6.c<f0.d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0585f f867a = new C0585f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f868b = L6.b.a("filename");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f869c = L6.b.a("contents");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        f0.d.a aVar = (f0.d.a) obj;
        L6.d dVar2 = dVar;
        dVar2.a(f868b, aVar.b());
        dVar2.a(f869c, aVar.a());
    }
}
