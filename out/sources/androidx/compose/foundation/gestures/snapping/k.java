package androidx.compose.foundation.gestures.snapping;

/* JADX INFO: compiled from: SnapPosition.kt */
/* JADX INFO: loaded from: classes.dex */
public interface k {

    /* JADX INFO: compiled from: SnapPosition.kt */
    public static final class a implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f10050a = new a();

        @Override // androidx.compose.foundation.gestures.snapping.k
        public final int f(int i10, int i11, int i12, int i13) {
            return (((i10 - i12) - i13) / 2) - (i11 / 2);
        }

        public final String toString() {
            return "Center";
        }
    }

    /* JADX INFO: compiled from: SnapPosition.kt */
    public static final class b implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f10051a = new b();

        @Override // androidx.compose.foundation.gestures.snapping.k
        public final int f(int i10, int i11, int i12, int i13) {
            return 0;
        }

        public final String toString() {
            return "Start";
        }
    }

    int f(int i10, int i11, int i12, int i13);
}
