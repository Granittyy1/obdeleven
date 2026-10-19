package G7;

import java.io.IOException;

/* JADX INFO: compiled from: AutoRolloutAssignmentEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements L6.c<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3381a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f3382b = L6.b.a("rolloutId");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f3383c = L6.b.a("variantId");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L6.b f3384d = L6.b.a("parameterKey");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final L6.b f3385e = L6.b.a("parameterValue");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final L6.b f3386f = L6.b.a("templateVersion");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        d dVar2 = (d) obj;
        L6.d dVar3 = dVar;
        dVar3.a(f3382b, dVar2.c());
        dVar3.a(f3383c, dVar2.e());
        dVar3.a(f3384d, dVar2.a());
        dVar3.a(f3385e, dVar2.b());
        dVar3.d(f3386f, dVar2.d());
    }
}
