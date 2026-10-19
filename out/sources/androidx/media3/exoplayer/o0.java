package androidx.media3.exoplayer;

/* JADX INFO: compiled from: RendererConfiguration.java */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o0 f18589c = new o0(0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18591b;

    public o0(int i10, boolean z10) {
        this.f18590a = i10;
        this.f18591b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0.class != obj.getClass()) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f18590a == o0Var.f18590a && this.f18591b == o0Var.f18591b;
    }

    public final int hashCode() {
        return (this.f18590a << 1) + (this.f18591b ? 1 : 0);
    }
}
