package p259v1;

import com.google.common.collect.i;
import com.voltasit.obdeleven.domain.usecases.q;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return i.a.f(j.i.c((j.i) Collections.max(list, new q(1)), (j.i) Collections.max(list2, new q(1)))).a(list.size(), list2.size()).b((j.i) Collections.max(list, new s()), (j.i) Collections.max(list2, new s()), new s()).e();
    }
}
