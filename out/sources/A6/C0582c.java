package A6;

import java.io.IOException;

/* JADX INFO: renamed from: A6.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0582c implements L6.c<f0.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0582c f832a = new C0582c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f833b = L6.b.a("key");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f834c = L6.b.a("value");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        f0.c cVar = (f0.c) obj;
        L6.d dVar2 = dVar;
        dVar2.a(f833b, cVar.a());
        dVar2.a(f834c, cVar.b());
    }
}
