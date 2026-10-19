package androidx.appcompat.widget;

/* JADX INFO: compiled from: RtlSpacingHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8776g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8777h;

    public final void a(int i10, int i11) {
        this.f8772c = i10;
        this.f8773d = i11;
        this.f8777h = true;
        if (this.f8776g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f8770a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f8771b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f8770a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f8771b = i11;
        }
    }
}
