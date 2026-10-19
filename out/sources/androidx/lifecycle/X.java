package androidx.lifecycle;

/* JADX INFO: compiled from: Transformations.kt */
/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: compiled from: Transformations.kt */
    public static final class a implements D, kotlin.jvm.internal.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ W f17793b;

        public a(W w3) {
            this.f17793b = w3;
        }

        @Override // kotlin.jvm.internal.f
        public final p293xa.e<?> b() {
            return this.f17793b;
        }

        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f17793b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof D) && (obj instanceof kotlin.jvm.internal.f)) {
                return this.f17793b.equals(((kotlin.jvm.internal.f) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return this.f17793b.hashCode();
        }
    }

    public static final B a(C c10, Ia.l transform) {
        B b10;
        kotlin.jvm.internal.i.e(transform, "transform");
        if (c10.f17844e != AbstractC1382z.f17839k) {
            b10 = new B(transform.invoke(c10.d()));
            b10.f17721l = new p173o.b<>();
        } else {
            b10 = new B();
        }
        b10.l(c10, new a(new W(b10, transform)));
        return b10;
    }
}
