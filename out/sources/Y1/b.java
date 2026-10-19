package Y1;

import java.util.Comparator;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7515b;

    public /* synthetic */ b(int i10) {
        this.f7515b = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f7515b) {
            case 0:
                return Integer.compare(((c.a) obj2).f7527b, ((c.a) obj).f7527b);
            default:
                p238t4.a aVar = (p238t4.a) obj;
                p238t4.a o10 = (p238t4.a) obj2;
                i.d(o10, "o2");
                aVar.getClass();
                Long l10 = aVar.f47264c;
                if (l10 == null) {
                    return -1;
                }
                long jLongValue = l10.longValue();
                Long l11 = o10.f47264c;
                if (l11 == null) {
                    return 1;
                }
                return i.h(l11.longValue(), jLongValue);
        }
    }
}
