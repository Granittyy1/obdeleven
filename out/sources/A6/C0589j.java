package A6;

import io.intercom.android.sdk.models.Participant;
import java.io.IOException;

/* JADX INFO: renamed from: A6.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0589j implements L6.c<f0.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0589j f890a = new C0589j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.b f891b = L6.b.a("generator");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final L6.b f892c = L6.b.a("identifier");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L6.b f893d = L6.b.a("appQualitySessionId");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final L6.b f894e = L6.b.a("startedAt");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final L6.b f895f = L6.b.a("endedAt");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final L6.b f896g = L6.b.a("crashed");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final L6.b f897h = L6.b.a("app");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final L6.b f898i = L6.b.a(Participant.USER_TYPE);
    public static final L6.b j = L6.b.a("os");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final L6.b f899k = L6.b.a("device");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final L6.b f900l = L6.b.a("events");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final L6.b f901m = L6.b.a("generatorType");

    @Override // L6.a
    public final void a(Object obj, L6.d dVar) throws IOException {
        f0.e eVar = (f0.e) obj;
        L6.d dVar2 = dVar;
        dVar2.a(f891b, eVar.f());
        dVar2.a(f892c, eVar.h().getBytes(f0.f870a));
        dVar2.a(f893d, eVar.b());
        dVar2.d(f894e, eVar.j());
        dVar2.a(f895f, eVar.d());
        dVar2.e(f896g, eVar.l());
        dVar2.a(f897h, eVar.a());
        dVar2.a(f898i, eVar.k());
        dVar2.a(j, eVar.i());
        dVar2.a(f899k, eVar.c());
        dVar2.a(f900l, eVar.e());
        dVar2.c(f901m, eVar.g());
    }
}
