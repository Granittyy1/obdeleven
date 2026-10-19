package androidx.collection;

import java.util.List;

/* JADX INFO: compiled from: ObjectList.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object[] f9119a = new Object[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final I f9120b = new I(0);

    public static final void a(int i10, List list) {
        int size = list.size();
        if (i10 < 0 || i10 >= size) {
            D9.o.r("Index " + i10 + " is out of bounds. The list has " + size + " elements.");
            throw null;
        }
    }

    public static final void b(int i10, int i11, List list) {
        int size = list.size();
        if (i10 > i11) {
            D9.o.q("Indices are out of order. fromIndex (" + i10 + ") is greater than toIndex (" + i11 + ").");
            throw null;
        }
        if (i10 < 0) {
            D9.o.r("fromIndex (" + i10 + ") is less than 0.");
            throw null;
        }
        if (i11 <= size) {
            return;
        }
        D9.o.r("toIndex (" + i11 + ") is more than than the list size (" + size + ')');
        throw null;
    }
}
