package p215r4;

import com.facebook.internal.instrument.InstrumentData;
import java.util.Comparator;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InstrumentData instrumentData = (InstrumentData) obj;
        InstrumentData o10 = (InstrumentData) obj2;
        i.d(o10, "o2");
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
        return i.h(l11.longValue(), jLongValue);
    }
}
