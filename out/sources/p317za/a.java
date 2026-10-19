package p317za;

import Ia.l;
import java.util.Comparator;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l[] f49024b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        for (l lVar : this.f49024b) {
            int iE = Cb.a.e((Comparable) lVar.invoke(obj), (Comparable) lVar.invoke(obj2));
            if (iE != 0) {
                return iE;
            }
        }
        return 0;
    }
}
