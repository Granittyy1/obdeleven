package Za;

import Ya.b;
import kotlin.jvm.internal.i;
import p037cb.C1516b0;
import p037cb.C1521e;
import p037cb.L;

/* JADX INFO: compiled from: BuiltinSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static final C1521e a(b elementSerializer) {
        i.e(elementSerializer, "elementSerializer");
        return new C1521e(elementSerializer);
    }

    public static final L b(b keySerializer, b valueSerializer) {
        i.e(keySerializer, "keySerializer");
        i.e(valueSerializer, "valueSerializer");
        return new L(keySerializer, valueSerializer);
    }

    public static final <T> b<T> c(b<T> bVar) {
        i.e(bVar, "<this>");
        return bVar.getDescriptor().c() ? bVar : new C1516b0(bVar);
    }
}
