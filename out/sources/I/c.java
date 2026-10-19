package I;

/* JADX INFO: compiled from: MutableRect.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f3750a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f3751b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f3752c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f3753d = 0.0f;

    public final void a(float f10, float f11, float f12, float f13) {
        this.f3750a = Math.max(f10, this.f3750a);
        this.f3751b = Math.max(f11, this.f3751b);
        this.f3752c = Math.min(f12, this.f3752c);
        this.f3753d = Math.min(f13, this.f3753d);
    }

    public final boolean b() {
        return (this.f3750a >= this.f3752c) | (this.f3751b >= this.f3753d);
    }

    public final String toString() {
        return "MutableRect(" + b.p(this.f3750a) + ", " + b.p(this.f3751b) + ", " + b.p(this.f3752c) + ", " + b.p(this.f3753d) + ')';
    }
}
