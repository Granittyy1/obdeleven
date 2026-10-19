package Y9;

import com.voltasit.obdeleven.domain.usecases.device.u;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.y;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: CopyOnWriteHashMap.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a<K, V> {
    private volatile /* synthetic */ Object current = y.p();

    static {
        AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "current");
    }

    public final Object a(u key) {
        i.e(key, "key");
        return ((Map) this.current).get(key);
    }
}
