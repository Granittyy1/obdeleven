package p313z6;

import L6.b;
import L6.c;
import L6.d;
import java.io.IOException;

/* JADX INFO: compiled from: AutoRolloutAssignmentEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements c<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48847a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f48848b = b.a("rolloutId");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f48849c = b.a("parameterKey");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f48850d = b.a("parameterValue");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f48851e = b.a("variantId");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f48852f = b.a("templateVersion");

    @Override // L6.a
    public final void a(Object obj, d dVar) throws IOException {
        k kVar = (k) obj;
        d dVar2 = dVar;
        dVar2.a(f48848b, kVar.c());
        dVar2.a(f48849c, kVar.a());
        dVar2.a(f48850d, kVar.b());
        dVar2.a(f48851e, kVar.e());
        dVar2.d(f48852f, kVar.d());
    }
}
