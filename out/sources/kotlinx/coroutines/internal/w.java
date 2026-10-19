package kotlinx.coroutines.internal;

import kotlinx.coroutines.internal.v;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes2.dex */
@Ha.a
public final class w<S extends v<S>> {
    public static final S a(Object obj) {
        if (obj != d.f43470a) {
            return (S) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final boolean b(Object obj) {
        return obj == d.f43470a;
    }
}
