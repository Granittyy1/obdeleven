package p128k2;

import androidx.media3.ui.e;
import java.util.Comparator;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        e.b bVar = (e.b) obj;
        e.b bVar2 = (e.b) obj2;
        int iCompare = Integer.compare(bVar2.f19055b, bVar.f19055b);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompareTo = bVar.f19056c.compareTo(bVar2.f19056c);
        return iCompareTo != 0 ? iCompareTo : bVar.f19057d.compareTo(bVar2.f19057d);
    }
}
