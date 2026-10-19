package p141l2;

import A8.A;
import Q3.d;
import android.os.Bundle;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import p248u2.b;
import p248u2.f;

/* JADX INFO: renamed from: l2.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: NavType.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C2736f extends AbstractC2735e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44283a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2736f(int i10, boolean z10) {
        super(z10);
        this.f44283a = i10;
    }

    public static float[] b(String value) {
        i.e(value, "value");
        return new float[]{L.FloatType.parseValue(value).floatValue()};
    }

    @Override // p141l2.AbstractC2735e
    public final Object a() {
        switch (this.f44283a) {
            case 0:
                return new float[0];
            default:
                return new String[0];
        }
    }

    @Override // p141l2.L
    public final Object get(Bundle bundle, String key) {
        switch (this.f44283a) {
            case 0:
                i.e(bundle, "bundle");
                i.e(key, "key");
                if (!bundle.containsKey(key) || b.c(bundle, key)) {
                    return null;
                }
                float[] floatArray = bundle.getFloatArray(key);
                if (floatArray != null) {
                    return floatArray;
                }
                A.g(key);
                throw null;
            default:
                i.e(bundle, "bundle");
                i.e(key, "key");
                if (!bundle.containsKey(key) || b.c(bundle, key)) {
                    return null;
                }
                String[] stringArray = bundle.getStringArray(key);
                if (stringArray != null) {
                    return stringArray;
                }
                A.g(key);
                throw null;
        }
    }

    @Override // p141l2.L
    public final String getName() {
        switch (this.f44283a) {
            case 0:
                return "float[]";
            default:
                return "string[]";
        }
    }

    @Override // p141l2.L
    public final Object parseValue(String value) {
        switch (this.f44283a) {
            case 0:
                return b(value);
            default:
                i.e(value, "value");
                return new String[]{value};
        }
    }

    @Override // p141l2.L
    public final void put(Bundle bundle, String key, Object obj) {
        switch (this.f44283a) {
            case 0:
                float[] fArr = (float[]) obj;
                i.e(bundle, "bundle");
                i.e(key, "key");
                if (fArr == null) {
                    f.a(bundle, key);
                } else {
                    bundle.putFloatArray(key, fArr);
                }
                break;
            default:
                String[] strArr = (String[]) obj;
                i.e(bundle, "bundle");
                i.e(key, "key");
                if (strArr == null) {
                    f.a(bundle, key);
                } else {
                    bundle.putStringArray(key, strArr);
                }
                break;
        }
    }

    @Override // p141l2.L
    public final boolean valueEquals(Object obj, Object obj2) {
        Float[] fArr;
        switch (this.f44283a) {
            case 0:
                float[] fArr2 = (float[]) obj;
                float[] fArr3 = (float[]) obj2;
                Float[] fArr4 = null;
                if (fArr2 != null) {
                    fArr = new Float[fArr2.length];
                    int length = fArr2.length;
                    for (int i10 = 0; i10 < length; i10++) {
                        fArr[i10] = Float.valueOf(fArr2[i10]);
                    }
                } else {
                    fArr = null;
                }
                if (fArr3 != null) {
                    fArr4 = new Float[fArr3.length];
                    int length2 = fArr3.length;
                    for (int i11 = 0; i11 < length2; i11++) {
                        fArr4[i11] = Float.valueOf(fArr3[i11]);
                    }
                }
                return d.j(fArr, fArr4);
            default:
                return d.j((String[]) obj, (String[]) obj2);
        }
    }

    @Override // p141l2.L
    public final Object parseValue(String value, Object obj) {
        switch (this.f44283a) {
            case 0:
                float[] fArr = (float[]) obj;
                i.e(value, "value");
                if (fArr != null) {
                    float[] fArrB = b(value);
                    int length = fArr.length;
                    float[] fArrCopyOf = Arrays.copyOf(fArr, length + 1);
                    System.arraycopy(fArrB, 0, fArrCopyOf, length, 1);
                    i.b(fArrCopyOf);
                    return fArrCopyOf;
                }
                return b(value);
            default:
                String[] strArr = (String[]) obj;
                i.e(value, "value");
                if (strArr != null) {
                    return (String[]) d.H(strArr, new String[]{value});
                }
                return new String[]{value};
        }
    }
}
