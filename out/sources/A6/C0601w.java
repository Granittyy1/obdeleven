package A6;

import java.io.IOException;

/* JADX INFO: renamed from: A6.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0601w implements L6.c<f0.e.d.AbstractC0015e.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0601w f967a = new C0601w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f968b = L6.b.a("rolloutId");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f969c = L6.b.a("variantId");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        f0.e.d.AbstractC0015e.b bVar = (f0.e.d.AbstractC0015e.b) obj;
        L6.d dVar2 = dVar;
        dVar2.a(f968b, bVar.a());
        dVar2.a(f969c, bVar.b());
    }
}
