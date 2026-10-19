package kotlin.collections;

import com.braze.support.BrazeLogger;
import java.util.Collections;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: compiled from: MapsJVM.kt */
/* JADX INFO: loaded from: classes.dex */
public class x extends I.e {
    public static int n(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        return i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : BrazeLogger.SUPPRESS;
    }

    public static <K, V> Map<K, V> o(Pair<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.i.e(pair, "pair");
        Map<K, V> mapSingletonMap = Collections.singletonMap(pair.c(), pair.d());
        kotlin.jvm.internal.i.d(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }
}
