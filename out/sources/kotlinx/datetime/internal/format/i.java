package kotlinx.datetime.internal.format;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: Predicate.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class i<T> implements q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f43889a;

    public i(ArrayList arrayList) {
        this.f43889a = arrayList;
    }

    @Override // kotlinx.datetime.internal.format.q
    public final boolean a(T t8) {
        ArrayList arrayList = this.f43889a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((q) it.next()).a(t8)) {
                return false;
            }
        }
        return true;
    }
}
