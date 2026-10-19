package p037cb;

import Ya.b;
import java.lang.Enum;
import java.util.Arrays;
import kotlin.a;
import kotlin.collections.k;
import kotlin.jvm.internal.i;
import kotlinx.serialization.SerializationException;
import p011ab.e;
import p024bb.c;
import p024bb.d;
import p293xa.g;

/* JADX INFO: renamed from: cb.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Enums.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C1553z<T extends Enum<T>> implements b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T[] f22679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f22680b;

    public C1553z(final String str, T[] tArr) {
        this.f22679a = tArr;
        this.f22680b = a.a(new Ia.a() { // from class: cb.y
            @Override // Ia.a
            public final Object invoke() {
                C1553z c1553z = this.f22675b;
                c1553z.getClass();
                Enum[] enumArr = c1553z.f22679a;
                C1551x c1551x = new C1551x(str, enumArr.length);
                for (Enum r10 : enumArr) {
                    c1551x.k(r10.name(), false);
                }
                return c1551x;
            }
        });
    }

    @Override // Ya.a
    public final Object deserialize(c cVar) {
        int iW = cVar.w(getDescriptor());
        T[] tArr = this.f22679a;
        if (iW >= 0 && iW < tArr.length) {
            return tArr[iW];
        }
        throw new SerializationException(iW + " is not among valid " + getDescriptor().a() + " enum values, values size is " + tArr.length);
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return (e) this.f22680b.getValue();
    }

    @Override // Ya.l
    public final void serialize(d dVar, Object obj) {
        Enum value = (Enum) obj;
        i.e(value, "value");
        T[] tArr = this.f22679a;
        int iT = k.T(value, tArr);
        if (iT != -1) {
            dVar.n(getDescriptor(), iT);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(value);
        sb2.append(" is not a valid enum ");
        sb2.append(getDescriptor().a());
        sb2.append(", must be one of ");
        String string = Arrays.toString(tArr);
        i.d(string, "toString(...)");
        sb2.append(string);
        throw new SerializationException(sb2.toString());
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().a() + '>';
    }
}
