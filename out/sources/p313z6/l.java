package p313z6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: RolloutAssignmentList.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f48889a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48890b = 128;

    public final synchronized List<k> a() {
        return Collections.unmodifiableList(new ArrayList(this.f48889a));
    }

    public final synchronized boolean b(List<k> list) {
        this.f48889a.clear();
        int size = list.size();
        int i10 = this.f48890b;
        if (size <= i10) {
            return this.f48889a.addAll(list);
        }
        return this.f48889a.addAll(list.subList(0, i10));
    }
}
