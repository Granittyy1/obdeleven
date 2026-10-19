package p315z8;

import java.util.Comparator;
import p255u9.D;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        D d10 = ((c) obj).f48948a;
        D d11 = ((c) obj2).f48948a;
        int iCompareTo = d10.a().compareTo(d11.a());
        return iCompareTo == 0 ? d10.getInt("startYear") - d11.getInt("startYear") : iCompareTo;
    }
}
