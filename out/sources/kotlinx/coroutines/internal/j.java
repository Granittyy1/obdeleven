package kotlinx.coroutines.internal;

import java.util.ArrayList;

/* JADX INFO: compiled from: InlineList.kt */
/* JADX INFO: loaded from: classes2.dex */
@Ha.a
public final class j<E> {
    public static final Object a(Object obj, E e10) {
        if (obj == null) {
            return e10;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e10);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e10);
        return arrayList;
    }
}
