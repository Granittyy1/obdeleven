package p037cb;

import Ya.b;
import kotlin.jvm.internal.i;
import kotlin.uuid.Uuid;
import kotlinx.coroutines.C;
import p011ab.d;
import p011ab.e;
import p024bb.c;

/* JADX INFO: compiled from: BuiltInSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class P0 implements b<Uuid> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P0 f22576a = new P0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f22577b = new q0("kotlin.uuid.Uuid", d.i.f8102a);

    @Override // Ya.a
    public final Object deserialize(c cVar) {
        String uuidString = cVar.n();
        i.e(uuidString, "uuidString");
        if (uuidString.length() != 36) {
            throw new IllegalArgumentException("Expected a 36-char string in the standard uuid format.");
        }
        long jE = kotlin.text.c.e(uuidString, 0, 8);
        C.e(8, uuidString);
        long jE2 = kotlin.text.c.e(uuidString, 9, 13);
        C.e(13, uuidString);
        long jE3 = kotlin.text.c.e(uuidString, 14, 18);
        C.e(18, uuidString);
        long jE4 = kotlin.text.c.e(uuidString, 19, 23);
        C.e(23, uuidString);
        long j = (jE << 32) | (jE2 << 16) | jE3;
        long jE5 = kotlin.text.c.e(uuidString, 24, 36) | (jE4 << 48);
        return (j == 0 && jE5 == 0) ? Uuid.f43162b : new Uuid(j, jE5);
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return f22577b;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d dVar, Object obj) {
        Uuid value = (Uuid) obj;
        i.e(value, "value");
        dVar.C(value.toString());
    }
}
