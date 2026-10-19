package p305ya;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.collections.f;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends f<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry<? extends K, ? extends V> element = (Map.Entry) obj;
        i.e(element, "element");
        return ((kotlin.collections.builders.a) this).f43011b.o(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry<? extends K, ? extends V> element = (Map.Entry) obj;
        i.e(element, "element");
        return ((kotlin.collections.builders.a) this).f43011b.y(element);
    }
}
