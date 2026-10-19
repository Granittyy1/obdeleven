package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: LazyLayoutMeasuredItem.kt */
/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A f10570a = new A(0);

    public static final List a(int i10, int i11, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return EmptyList.f42983b;
        }
        ArrayList arrayListP0 = kotlin.collections.q.p0(list);
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            z zVar = (z) arrayList.get(i12);
            int index = zVar.getIndex();
            if (i10 <= index && index <= i11) {
                arrayListP0.add(zVar);
            }
        }
        kotlin.collections.p.G(arrayListP0, f10570a);
        return arrayListP0;
    }
}
