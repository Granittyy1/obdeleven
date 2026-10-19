package kotlin.collections;

import java.util.Collection;

/* JADX INFO: compiled from: Iterables.kt */
/* JADX INFO: loaded from: classes.dex */
public class m extends l {
    public static <T> int y(Iterable<? extends T> iterable, int i10) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }
}
