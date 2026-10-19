package kotlin;

import kotlin.jvm.internal.i;
import p293xa.g;

/* JADX INFO: compiled from: LazyJVM.kt */
/* JADX INFO: loaded from: classes.dex */
public class a {
    public static <T> g<T> a(Ia.a<? extends T> initializer) {
        i.e(initializer, "initializer");
        return new SynchronizedLazyImpl(initializer);
    }

    public static <T> g<T> b(LazyThreadSafetyMode lazyThreadSafetyMode, Ia.a<? extends T> initializer) {
        i.e(initializer, "initializer");
        int iOrdinal = lazyThreadSafetyMode.ordinal();
        if (iOrdinal == 0) {
            return new SynchronizedLazyImpl(initializer);
        }
        if (iOrdinal == 1) {
            return new SafePublicationLazyImpl(initializer);
        }
        if (iOrdinal == 2) {
            return new UnsafeLazyImpl(initializer);
        }
        throw new NoWhenBranchMatchedException();
    }
}
