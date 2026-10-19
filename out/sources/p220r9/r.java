package p220r9;

import G8.C0706h;
import java.util.Comparator;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C0706h product1 = (C0706h) obj;
        C0706h product2 = (C0706h) obj2;
        i.e(product1, "product1");
        i.e(product2, "product2");
        return product1.f3500c - product2.f3500c;
    }
}
