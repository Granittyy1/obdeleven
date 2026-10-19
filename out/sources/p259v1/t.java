package p259v1;

import p078g1.n;
import p078g1.y;
import p114j1.k;

/* JADX INFO: compiled from: ExoTrackSelection.java */
/* JADX INFO: loaded from: classes.dex */
public interface t extends w {

    /* JADX INFO: compiled from: ExoTrackSelection.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y f47613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f47614b;

        public a(y yVar, int[] iArr) {
            if (iArr.length == 0) {
                k.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f47613a = yVar;
            this.f47614b = iArr;
        }
    }

    void d();

    void f();

    int g();

    n h();

    void i(float f10);

    default void j() {
    }

    default void k() {
    }

    default void b(boolean z10) {
    }
}
