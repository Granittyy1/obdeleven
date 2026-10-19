package p050db;

import H3.c;
import kotlin.jvm.internal.l;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.z;
import p037cb.E;
import p037cb.y0;

/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E f34682a = c.a(y0.f22677a, "kotlinx.serialization.json.JsonUnquotedLiteral");

    public static final int a(B b10) {
        kotlin.jvm.internal.i.e(b10, "<this>");
        try {
            long jH = new z(b10.e()).h();
            if (-2147483648L <= jH && jH <= 2147483647L) {
                return (int) jH;
            }
            throw new NumberFormatException(b10.e() + " is not an Int");
        } catch (JsonDecodingException e10) {
            throw new NumberFormatException(e10.getMessage());
        }
    }

    public static final B b(h hVar) {
        B b10 = hVar instanceof B ? (B) hVar : null;
        if (b10 != null) {
            return b10;
        }
        throw new IllegalArgumentException("Element " + l.a(hVar.getClass()) + " is not a JsonPrimitive");
    }
}
