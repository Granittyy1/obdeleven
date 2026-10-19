package p062eb;

import java.util.List;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SerializersModule.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: eb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SerializersModule.kt */
    public static final class C0361a extends a {
        @Override // p062eb.a
        public final Ya.b<?> a(List<? extends Ya.b<?>> typeArgumentsSerializers) {
            i.e(typeArgumentsSerializers, "typeArgumentsSerializers");
            return null;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C0361a) {
                ((C0361a) obj).getClass();
                if (i.a(null, null)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: SerializersModule.kt */
    public static final class b extends a {
        @Override // p062eb.a
        public final Ya.b<?> a(List<? extends Ya.b<?>> typeArgumentsSerializers) {
            i.e(typeArgumentsSerializers, "typeArgumentsSerializers");
            throw null;
        }
    }

    public abstract Ya.b<?> a(List<? extends Ya.b<?>> list);
}
