package p131k5;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f41746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f41747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B0 f41748d;

    public D0(B0 b10, int i10, boolean z10, boolean z11) {
        this.f41748d = b10;
        this.f41745a = i10;
        this.f41746b = z10;
        this.f41747c = z11;
    }

    public final void a(Object obj, Object obj2, String str) {
        this.f41748d.w(this.f41745a, this.f41746b, this.f41747c, str, obj, obj2, null);
    }

    public final void b(Object obj, String str) {
        this.f41748d.w(this.f41745a, this.f41746b, this.f41747c, str, obj, null, null);
    }

    public final void c(String str) {
        this.f41748d.w(this.f41745a, this.f41746b, this.f41747c, str, null, null, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.f41748d.w(this.f41745a, this.f41746b, this.f41747c, str, obj, obj2, obj3);
    }
}
