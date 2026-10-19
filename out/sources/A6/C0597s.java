package A6;

import com.braze.models.inappmessage.InAppMessageBase;
import java.io.IOException;

/* JADX INFO: renamed from: A6.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0597s implements L6.c<f0.e.d.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0597s f946a = new C0597s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f947b = L6.b.a("batteryLevel");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f948c = L6.b.a("batteryVelocity");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L6.b f949d = L6.b.a("proximityOn");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final L6.b f950e = L6.b.a(InAppMessageBase.ORIENTATION);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final L6.b f951f = L6.b.a("ramUsed");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final L6.b f952g = L6.b.a("diskUsed");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        f0.e.d.c cVar = (f0.e.d.c) obj;
        L6.d dVar2 = dVar;
        dVar2.a(f947b, cVar.a());
        dVar2.c(f948c, cVar.b());
        dVar2.e(f949d, cVar.f());
        dVar2.c(f950e, cVar.d());
        dVar2.d(f951f, cVar.e());
        dVar2.d(f952g, cVar.c());
    }
}
