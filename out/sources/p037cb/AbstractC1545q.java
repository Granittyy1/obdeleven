package p037cb;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.i;

/* JADX INFO: renamed from: cb.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1545q<E, C extends Collection<? extends E>, B> extends AbstractC1543p<E, C, B> {
    @Override // p037cb.AbstractC1513a
    public final Iterator c(Object obj) {
        Collection collection = (Collection) obj;
        i.e(collection, "<this>");
        return collection.iterator();
    }

    @Override // p037cb.AbstractC1513a
    public final int d(Object obj) {
        Collection collection = (Collection) obj;
        i.e(collection, "<this>");
        return collection.size();
    }
}
