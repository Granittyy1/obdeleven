package kotlinx.coroutines.flow;

import com.google.android.gms.internal.measurement.Y;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface z {

    /* JADX INFO: compiled from: SharingStarted.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Y f43438a = new Y(14);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final StartedLazily f43439b = new StartedLazily();

        public static StartedWhileSubscribed a(int i10, long j) {
            if ((i10 & 1) != 0) {
                j = 0;
            }
            return new StartedWhileSubscribed(j, Long.MAX_VALUE);
        }
    }

    InterfaceC2686c<SharingCommand> b(A<Integer> a10);
}
