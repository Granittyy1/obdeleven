package kotlin.enums;

import A8.f;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.collections.AbstractC2670b;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: EnumEntries.kt */
/* JADX INFO: loaded from: classes2.dex */
final class EnumEntriesList<T extends Enum<T>> extends AbstractC2670b<T> implements Ba.a<T>, Serializable {
    private final T[] entries;

    public EnumEntriesList(T[] entries) {
        i.e(entries, "entries");
        this.entries = entries;
    }

    private final Object writeReplace() {
        return new EnumEntriesSerializationProxy(this.entries);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        i.e(element, "element");
        T[] tArr = this.entries;
        int iOrdinal = element.ordinal();
        i.e(tArr, "<this>");
        return ((iOrdinal < 0 || iOrdinal >= tArr.length) ? null : tArr[iOrdinal]) == element;
    }

    @Override // kotlin.collections.AbstractCollection
    public final int e() {
        return this.entries.length;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        T[] tArr = this.entries;
        int length = tArr.length;
        if (i10 < 0 || i10 >= length) {
            throw new IndexOutOfBoundsException(f.d(i10, length, "index: ", ", size: "));
        }
        return tArr[i10];
    }

    @Override // kotlin.collections.AbstractC2670b, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        i.e(element, "element");
        int iOrdinal = element.ordinal();
        T[] tArr = this.entries;
        i.e(tArr, "<this>");
        if (((iOrdinal < 0 || iOrdinal >= tArr.length) ? null : tArr[iOrdinal]) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC2670b, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        i.e(element, "element");
        return indexOf(element);
    }
}
