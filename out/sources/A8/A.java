package A8;

import G8.H;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.builders.ListBuilder;
import kotlinx.datetime.internal.format.OptionalFormatStructure;
import kotlinx.datetime.internal.format.SignedFormatStructure;
import kotlinx.serialization.SerializationException;
import p255u9.D;
import p255u9.E;

/* JADX INFO: compiled from: VehicleMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
public class A {
    public static final long a(int i10, int i11) {
        return (((long) i11) & 4294967295L) | (((long) i10) << 32);
    }

    public static final void b(ListBuilder listBuilder, kotlinx.datetime.internal.format.n nVar) {
        if (nVar instanceof kotlinx.datetime.internal.format.e) {
            listBuilder.add(((kotlinx.datetime.internal.format.e) nVar).f43883a);
            return;
        }
        if (nVar instanceof kotlinx.datetime.internal.format.h) {
            Iterator it = ((kotlinx.datetime.internal.format.h) nVar).f43888a.iterator();
            while (it.hasNext()) {
                b(listBuilder, (kotlinx.datetime.internal.format.p) it.next());
            }
            return;
        }
        if (nVar instanceof kotlinx.datetime.internal.format.j) {
            return;
        }
        if (nVar instanceof SignedFormatStructure) {
            b(listBuilder, ((SignedFormatStructure) nVar).f43869a);
            return;
        }
        if (!(nVar instanceof kotlinx.datetime.internal.format.c)) {
            if (nVar instanceof OptionalFormatStructure) {
                b(listBuilder, ((OptionalFormatStructure) nVar).f43864b);
            }
        } else {
            kotlinx.datetime.internal.format.c cVar = (kotlinx.datetime.internal.format.c) nVar;
            b(listBuilder, cVar.f43880a);
            Iterator it2 = cVar.f43881b.iterator();
            while (it2.hasNext()) {
                b(listBuilder, (kotlinx.datetime.internal.format.n) it2.next());
            }
        }
    }

    public static final io.ktor.util.e c(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        return new io.ktor.util.e(str);
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final long e(long j) {
        return (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
    }

    public static final boolean f(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[9];
        float f20 = fArr[10];
        float f21 = fArr[11];
        float f22 = fArr[12];
        float f23 = fArr[13];
        float f24 = fArr[14];
        float f25 = fArr[15];
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f10 * f17) - (f13 * f14);
        float f29 = (f11 * f16) - (f12 * f15);
        float f30 = (f11 * f17) - (f13 * f15);
        float f31 = (f12 * f17) - (f13 * f16);
        float f32 = (f18 * f23) - (f19 * f22);
        float f33 = (f18 * f24) - (f20 * f22);
        float f34 = (f18 * f25) - (f21 * f22);
        float f35 = (f19 * f24) - (f20 * f23);
        float f36 = (f19 * f25) - (f21 * f23);
        float f37 = (f20 * f25) - (f21 * f24);
        float f38 = (f31 * f32) + (((f29 * f34) + ((f28 * f35) + ((f26 * f37) - (f27 * f36)))) - (f30 * f33));
        if (f38 != 0.0f) {
            float f39 = 1.0f / f38;
            fArr2[0] = ((f17 * f35) + ((f15 * f37) - (f16 * f36))) * f39;
            fArr2[1] = (((f12 * f36) + ((-f11) * f37)) - (f13 * f35)) * f39;
            fArr2[2] = ((f25 * f29) + ((f23 * f31) - (f24 * f30))) * f39;
            fArr2[3] = (((f20 * f30) + ((-f19) * f31)) - (f21 * f29)) * f39;
            float f40 = -f14;
            fArr2[4] = (((f16 * f34) + (f40 * f37)) - (f17 * f33)) * f39;
            fArr2[5] = ((f13 * f33) + ((f37 * f10) - (f12 * f34))) * f39;
            float f41 = -f22;
            fArr2[6] = (((f24 * f28) + (f41 * f31)) - (f25 * f27)) * f39;
            fArr2[7] = ((f21 * f27) + ((f31 * f18) - (f20 * f28))) * f39;
            fArr2[8] = ((f17 * f32) + ((f14 * f36) - (f15 * f34))) * f39;
            fArr2[9] = (((f34 * f11) + ((-f10) * f36)) - (f13 * f32)) * f39;
            fArr2[10] = ((f25 * f26) + ((f22 * f30) - (f23 * f28))) * f39;
            fArr2[11] = (((f28 * f19) + ((-f18) * f30)) - (f21 * f26)) * f39;
            fArr2[12] = (((f15 * f33) + (f40 * f35)) - (f16 * f32)) * f39;
            fArr2[13] = ((f12 * f32) + ((f10 * f35) - (f11 * f33))) * f39;
            fArr2[14] = (((f23 * f27) + (f41 * f29)) - (f24 * f26)) * f39;
            fArr2[15] = ((f20 * f26) + ((f18 * f29) - (f19 * f27))) * f39;
        }
        return !(f38 == 0.0f);
    }

    public static final void g(String key) {
        kotlin.jvm.internal.i.e(key, "key");
        throw new IllegalArgumentException(androidx.compose.foundation.gestures.d.b("No valid saved state was found for the key '", key, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static String h(String str, Object... objArr) {
        int iIndexOf;
        String string;
        String strValueOf = String.valueOf(str);
        int i10 = 0;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e10) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e10);
                    StringBuilder sbA = C7.g.a("<", str2, " threw ");
                    sbA.append(e10.getClass().getName());
                    sbA.append(">");
                    string = sbA.toString();
                }
            }
            objArr[i11] = string;
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i12 = 0;
        while (i10 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i12)) != -1) {
            sb2.append((CharSequence) strValueOf, i12, iIndexOf);
            sb2.append(objArr[i10]);
            i12 = iIndexOf + 2;
            i10++;
        }
        sb2.append((CharSequence) strValueOf, i12, strValueOf.length());
        if (i10 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static H i(E input) {
        kotlin.jvm.internal.i.e(input, "input");
        String objectId = input.getObjectId();
        String str = objectId == null ? "" : objectId;
        String strK = input.k();
        String strD = input.d();
        kotlin.jvm.internal.i.d(strD, "getMake(...)");
        String strE = input.e();
        kotlin.jvm.internal.i.d(strE, "getModel(...)");
        String string = input.getString("year");
        String str2 = string == null ? "" : string;
        String strF = input.f();
        D dI = input.i();
        String objectId2 = dI != null ? dI.getObjectId() : null;
        if (objectId2 == null) {
            objectId2 = "";
        }
        return new H(str, strK, strD, strE, str2, strF, objectId2);
    }

    public static final void j(int i10) {
        throw new SerializationException(J4.i.b(i10, "An unknown field for index "));
    }

    public static final long k(long j) {
        return (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static final int l(p074fa.a aVar, p074fa.a aVar2, int i10) {
        kotlin.jvm.internal.i.e(aVar, "<this>");
        int iMin = Math.min(aVar2.f34857c - aVar2.f34856b, i10);
        int i11 = aVar.f34859e;
        int i12 = aVar.f34857c;
        int i13 = i11 - i12;
        if (i13 <= iMin) {
            int i14 = aVar.f34860f;
            if ((i14 - i11) + i13 < iMin) {
                throw new IllegalArgumentException("Can't append buffer: not enough free space at the end");
            }
            if ((i12 + iMin) - i11 > 0) {
                aVar.f34859e = i14;
            }
        }
        p036ca.b.a(aVar2.f34855a, aVar.f34855a, aVar2.f34856b, iMin, i12);
        aVar2.c(iMin);
        aVar.a(iMin);
        return iMin;
    }
}
