package V;

import A6.f0;
import com.facebook.internal.instrument.InstrumentData;
import java.util.Comparator;
import kotlin.Pair;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6653b;

    public /* synthetic */ u(int i10) {
        this.f6653b = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f6653b) {
            case 0:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                return (((Number) pair.d()).intValue() - ((Number) pair.c()).intValue()) - (((Number) pair2.d()).intValue() - ((Number) pair2.c()).intValue());
            case 1:
                androidx.media3.ui.e.b bVar = (androidx.media3.ui.e.b) obj;
                androidx.media3.ui.e.b bVar2 = (androidx.media3.ui.e.b) obj2;
                int iCompare = Integer.compare(bVar2.f19054a, bVar.f19054a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompareTo = bVar2.f19056c.compareTo(bVar.f19056c);
                return iCompareTo != 0 ? iCompareTo : bVar2.f19057d.compareTo(bVar.f19057d);
            case 2:
                InstrumentData instrumentData = (InstrumentData) obj;
                InstrumentData o10 = (InstrumentData) obj2;
                kotlin.jvm.internal.i.d(o10, "o2");
                instrumentData.getClass();
                Long l10 = instrumentData.f25030g;
                if (l10 == null) {
                    return -1;
                }
                long jLongValue = l10.longValue();
                Long l11 = o10.f25030g;
                if (l11 == null) {
                    return 1;
                }
                return kotlin.jvm.internal.i.h(l11.longValue(), jLongValue);
            default:
                return ((f0.c) obj).a().compareTo(((f0.c) obj2).a());
        }
    }
}
