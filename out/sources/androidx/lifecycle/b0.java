package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: ViewModelStore.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f17808a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f17808a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((Y) it.next()).clear$lifecycle_viewmodel_release();
        }
        linkedHashMap.clear();
    }
}
