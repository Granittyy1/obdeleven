package A6;

import java.io.IOException;

/* JADX INFO: renamed from: A6.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0584e implements L6.c<f0.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0584e f861a = new C0584e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f862b = L6.b.a("files");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f863c = L6.b.a("orgId");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        f0.d dVar2 = (f0.d) obj;
        L6.d dVar3 = dVar;
        dVar3.a(f862b, dVar2.a());
        dVar3.a(f863c, dVar2.b());
    }
}
