package kotlin.enums;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: EnumEntriesSerializationProxy.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumEntriesSerializationProxy<E extends Enum<E>> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class<E> f43042c;

    public EnumEntriesSerializationProxy(E[] entries) {
        i.e(entries, "entries");
        Class<E> cls = (Class<E>) entries.getClass().getComponentType();
        i.b(cls);
        this.f43042c = cls;
    }

    private final Object readResolve() {
        E[] enumConstants = this.f43042c.getEnumConstants();
        i.d(enumConstants, "getEnumConstants(...)");
        return a.a(enumConstants);
    }
}
