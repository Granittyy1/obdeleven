package p131k5;

import U4.C0804l;

/* JADX INFO: renamed from: k5.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2572v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f42485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f42486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f42487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f42488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f42489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f42490h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f42491i;
    public final Long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f42492k;

    public C2572v(String str, String str2, long j) {
        this(str, str2, 0L, 0L, 0L, j, 0L, null, null, null, null);
    }

    public final C2572v a(long j) {
        return new C2572v(this.f42483a, this.f42484b, this.f42485c, this.f42486d, this.f42487e, j, this.f42489g, this.f42490h, this.f42491i, this.j, this.f42492k);
    }

    public final C2572v b(Long l10, Long l11, Boolean bool) {
        return new C2572v(this.f42483a, this.f42484b, this.f42485c, this.f42486d, this.f42487e, this.f42488f, this.f42489g, this.f42490h, l10, l11, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public C2572v(String str, String str2, long j, long j10, long j11, long j12, long j13, Long l10, Long l11, Long l12, Boolean bool) {
        C0804l.e(str);
        C0804l.e(str2);
        C0804l.b(j >= 0);
        C0804l.b(j10 >= 0);
        C0804l.b(j11 >= 0);
        C0804l.b(j13 >= 0);
        this.f42483a = str;
        this.f42484b = str2;
        this.f42485c = j;
        this.f42486d = j10;
        this.f42487e = j11;
        this.f42488f = j12;
        this.f42489g = j13;
        this.f42490h = l10;
        this.f42491i = l11;
        this.j = l12;
        this.f42492k = bool;
    }
}
