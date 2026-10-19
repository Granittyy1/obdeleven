package kotlin.enums;

import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: EnumEntries.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static final <E extends Enum<E>> Ba.a<E> a(E[] entries) {
        i.e(entries, "entries");
        return new EnumEntriesList(entries);
    }
}
