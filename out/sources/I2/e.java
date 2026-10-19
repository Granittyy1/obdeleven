package I2;

import A8.A;
import android.view.View;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.pager.PagerState;
import androidx.webkit.internal.WebViewFeatureInternal;
import com.google.common.base.VerifyException;
import com.voltasit.obdeleven.R;
import io.ktor.utils.io.core.InsufficientSpaceException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: WebViewFeature.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static e f3812a;

    public static final long a(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final float b(long j, long j10) {
        return Math.min(Float.intBitsToFloat((int) (j10 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final void c(p105i4.a aVar, p105i4.a b10) {
        i.e(b10, "b");
        int[] iArr = aVar.f36723a;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        float[] fArr = aVar.f36725c;
        float[] fArr2 = b10.f36725c;
        if (i10 <= 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            int i14 = i13 + 1;
            if (i11 > 0) {
                int i15 = 0;
                while (true) {
                    int i16 = i15 + 1;
                    if (i12 > 0) {
                        int i17 = 0;
                        while (true) {
                            int i18 = i17 + 1;
                            int i19 = (i15 * i12) + (i13 * i11 * i12) + i17;
                            fArr[i19] = fArr[i19] + fArr2[i17];
                            if (i18 >= i12) {
                                break;
                            } else {
                                i17 = i18;
                            }
                        }
                    }
                    if (i16 >= i11) {
                        break;
                    } else {
                        i15 = i16;
                    }
                }
            }
            if (i14 >= i10) {
                return;
            } else {
                i13 = i14;
            }
        }
    }

    public static final p105i4.a d(p105i4.a aVar, p105i4.a w3) {
        p105i4.a aVar2;
        int i10;
        int i11;
        i.e(w3, "w");
        int[] iArr = aVar.f36723a;
        int i12 = 0;
        int i13 = iArr[0];
        int i14 = iArr[1];
        int i15 = iArr[2];
        int[] iArr2 = w3.f36723a;
        int i16 = iArr2[0];
        int i17 = (i14 - i16) + 1;
        int i18 = iArr2[2];
        p105i4.a aVar3 = new p105i4.a(new int[]{i13, i17, i18});
        float[] fArr = aVar.f36725c;
        float[] fArr2 = aVar3.f36725c;
        float[] fArr3 = w3.f36725c;
        if (i13 <= 0) {
            return aVar3;
        }
        int i19 = 0;
        while (true) {
            int i20 = i19 + 1;
            if (i18 > 0) {
                int i21 = i12;
                while (true) {
                    int i22 = i21 + 1;
                    if (i17 > 0) {
                        int i23 = i12;
                        while (true) {
                            int i24 = i23 + 1;
                            float f10 = 0.0f;
                            if (i16 > 0) {
                                int i25 = 0;
                                while (true) {
                                    aVar2 = aVar3;
                                    int i26 = i25 + 1;
                                    if (i15 > 0) {
                                        int i27 = 0;
                                        while (true) {
                                            i11 = i13;
                                            int i28 = i27 + 1;
                                            f10 = (fArr[((i25 + i23) * i15) + (i14 * i15 * i19) + i27] * fArr3[(((i25 * i15) + i27) * i18) + i21]) + f10;
                                            if (i28 >= i15) {
                                                break;
                                            }
                                            i27 = i28;
                                            i13 = i11;
                                        }
                                    } else {
                                        i11 = i13;
                                    }
                                    if (i26 >= i16) {
                                        break;
                                    }
                                    i25 = i26;
                                    aVar3 = aVar2;
                                    i13 = i11;
                                }
                            } else {
                                i11 = i13;
                                aVar2 = aVar3;
                            }
                            fArr2[(i23 * i18) + (i17 * i18 * i19) + i21] = f10;
                            if (i24 >= i17) {
                                break;
                            }
                            i23 = i24;
                            aVar3 = aVar2;
                            i13 = i11;
                        }
                    } else {
                        i11 = i13;
                        aVar2 = aVar3;
                    }
                    if (i22 >= i18) {
                        break;
                    }
                    i21 = i22;
                    aVar3 = aVar2;
                    i13 = i11;
                    i12 = 0;
                }
                i10 = i11;
            } else {
                aVar2 = aVar3;
                i10 = i13;
            }
            if (i20 >= i10) {
                return aVar2;
            }
            i13 = i10;
            i19 = i20;
            aVar3 = aVar2;
            i12 = 0;
        }
    }

    public static final p105i4.a e(p105i4.a aVar, p105i4.a w3, p105i4.a b10) {
        i.e(w3, "w");
        i.e(b10, "b");
        int i10 = 0;
        int i11 = aVar.f36723a[0];
        int i12 = b10.f36723a[0];
        int[] iArr = w3.f36723a;
        int i13 = iArr[0];
        int i14 = iArr[1];
        p105i4.a aVar2 = new p105i4.a(new int[]{i11, i14});
        float[] fArr = aVar.f36725c;
        float[] fArr2 = w3.f36725c;
        float[] fArr3 = aVar2.f36725c;
        if (i11 > 0) {
            int i15 = 0;
            while (true) {
                int i16 = i15 + 1;
                if (i14 > 0) {
                    int i17 = i10;
                    while (true) {
                        int i18 = i17 + 1;
                        int i19 = (i15 * i14) + i17;
                        fArr3[i19] = 0.0f;
                        if (i13 > 0) {
                            int i20 = i10;
                            while (true) {
                                int i21 = i20 + 1;
                                fArr3[i19] = (fArr[(i15 * i13) + i20] * fArr2[(i20 * i14) + i17]) + fArr3[i19];
                                if (i21 >= i13) {
                                    break;
                                }
                                i20 = i21;
                            }
                        }
                        if (i18 >= i14) {
                            break;
                        }
                        i17 = i18;
                        i10 = 0;
                    }
                }
                if (i16 >= i11) {
                    break;
                }
                i15 = i16;
                i10 = 0;
            }
        }
        float[] fArr4 = b10.f36725c;
        float[] fArr5 = aVar2.f36725c;
        if (i11 > 0) {
            int i22 = 0;
            while (true) {
                int i23 = i22 + 1;
                if (i12 > 0) {
                    int i24 = 0;
                    while (true) {
                        int i25 = i24 + 1;
                        int i26 = (i22 * i12) + i24;
                        fArr5[i26] = fArr5[i26] + fArr4[i24];
                        if (i25 >= i12) {
                            break;
                        }
                        i24 = i25;
                    }
                }
                if (i23 >= i11) {
                    break;
                }
                i22 = i23;
            }
        }
        return aVar2;
    }

    public static final float f(PagerState pagerState) {
        return pagerState.l().getOrientation() == Orientation.f9958c ? Float.intBitsToFloat((int) (pagerState.p() >> 32)) : Float.intBitsToFloat((int) (pagerState.p() & 4294967295L));
    }

    public static final void g(p105i4.a aVar) {
        int i10;
        int[] iArr = aVar.f36723a;
        if (1 >= iArr.length) {
            return;
        }
        int length = iArr.length;
        if (1 < length) {
            int i11 = 1;
            i10 = 1;
            while (true) {
                int i12 = i11 + 1;
                i10 *= aVar.f36723a[i11];
                if (i12 >= length) {
                    break;
                } else {
                    i11 = i12;
                }
            }
        } else {
            i10 = 1;
        }
        int[] iArr2 = {aVar.f36723a[0], i10};
        aVar.f36723a = iArr2;
        int iA = p105i4.a.C0385a.a(iArr2);
        float[] fArr = new float[iA];
        System.arraycopy(aVar.f36725c, 0, fArr, 0, Math.min(aVar.f36724b, iA));
        aVar.f36725c = fArr;
        aVar.f36724b = iA;
    }

    public static e h(boolean z10) {
        if (f3812a == null && z10) {
            f3812a = new e();
        }
        return f3812a;
    }

    public static final p248u2.e i(View view) {
        i.e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            p248u2.e eVar = tag instanceof p248u2.e ? (p248u2.e) tag : null;
            if (eVar != null) {
                return eVar;
            }
            Object objE = G0.a.e(view);
            view = objE instanceof View ? (View) objE : null;
        }
        return null;
    }

    public static Set j() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.emptySet();
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public static boolean k(String str) {
        HashSet<J2.b> hashSet = new HashSet();
        for (WebViewFeatureInternal webViewFeatureInternal : WebViewFeatureInternal.values()) {
            hashSet.add(webViewFeatureInternal);
        }
        HashSet hashSet2 = new HashSet();
        for (J2.b bVar : hashSet) {
            if (bVar.b().equals(str)) {
                hashSet2.add(bVar);
            }
        }
        if (hashSet2.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            if (((J2.b) it.next()).a()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean l(PagerState pagerState, float f10) {
        boolean zD = pagerState.l().d();
        boolean z10 = (pagerState.q() ? -f10 : f(pagerState)) > 0.0f;
        return (z10 && zD) || !(z10 || zD);
    }

    public static final kotlin.jvm.internal.a m(Object[] array) {
        i.e(array, "array");
        return new kotlin.jvm.internal.a(array);
    }

    public static final p105i4.a n(p105i4.a aVar, int i10) {
        int i11;
        int[] iArr = aVar.f36723a;
        int i12 = 0;
        int i13 = iArr[0];
        int i14 = iArr[1];
        int i15 = iArr[2];
        int i16 = (i14 - i10) + 1;
        p105i4.a aVar2 = new p105i4.a(new int[]{i13, i16, i15});
        float[] fArr = aVar.f36725c;
        float[] fArr2 = aVar2.f36725c;
        if (i13 > 0) {
            int i17 = 0;
            while (true) {
                int i18 = i17 + 1;
                if (i15 > 0) {
                    int i19 = i12;
                    while (true) {
                        int i20 = i19 + 1;
                        if (i16 > 0) {
                            int i21 = i12;
                            while (true) {
                                int i22 = i21 + 1;
                                int i23 = i21 * i15;
                                int i24 = (i17 * i16 * i15) + i23 + i19;
                                int i25 = (i17 * i14 * i15) + i23 + i19;
                                fArr2[i24] = Float.MIN_VALUE;
                                if (i10 > 0) {
                                    int i26 = i12;
                                    while (true) {
                                        int i27 = i26 + 1;
                                        i11 = i14;
                                        fArr2[i24] = Math.max(fArr2[i24], fArr[(i26 * i15) + i25]);
                                        if (i27 >= i10) {
                                            break;
                                        }
                                        i26 = i27;
                                        i14 = i11;
                                    }
                                } else {
                                    i11 = i14;
                                }
                                if (i22 >= i16) {
                                    break;
                                }
                                i21 = i22;
                                i14 = i11;
                                i12 = 0;
                            }
                        } else {
                            i11 = i14;
                        }
                        if (i20 >= i15) {
                            break;
                        }
                        i19 = i20;
                        i14 = i11;
                        i12 = 0;
                    }
                } else {
                    i11 = i14;
                }
                if (i18 >= i13) {
                    break;
                }
                i17 = i18;
                i14 = i11;
                i12 = 0;
            }
        }
        return aVar2;
    }

    public static final void o(p105i4.a aVar) {
        float[] fArr = aVar.f36725c;
        int length = fArr.length - 1;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (fArr[i10] < 0.0f) {
                fArr[i10] = 0.0f;
            }
            if (i11 > length) {
                return;
            } else {
                i10 = i11;
            }
        }
    }

    public static final void p(View view, p248u2.e eVar) {
        i.e(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, eVar);
    }

    public static final p105i4.a q(p105i4.a aVar) {
        int[] iArr = aVar.f36723a;
        int i10 = iArr[0];
        int i11 = iArr[1];
        p105i4.a aVar2 = new p105i4.a(new int[]{i11, i10});
        float[] fArr = aVar.f36725c;
        float[] fArr2 = aVar2.f36725c;
        if (i10 > 0) {
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (i11 > 0) {
                    int i14 = 0;
                    while (true) {
                        int i15 = i14 + 1;
                        fArr2[(i14 * i10) + i12] = fArr[(i12 * i11) + i14];
                        if (i15 >= i11) {
                            break;
                        }
                        i14 = i15;
                    }
                }
                if (i13 >= i10) {
                    break;
                }
                i12 = i13;
            }
        }
        return aVar2;
    }

    public static final p105i4.a r(p105i4.a aVar) {
        int[] iArr = aVar.f36723a;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        p105i4.a aVar2 = new p105i4.a(new int[]{i12, i11, i10});
        float[] fArr = aVar.f36725c;
        float[] fArr2 = aVar2.f36725c;
        if (i10 > 0) {
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                if (i11 > 0) {
                    int i15 = 0;
                    while (true) {
                        int i16 = i15 + 1;
                        if (i12 > 0) {
                            int i17 = 0;
                            while (true) {
                                int i18 = i17 + 1;
                                fArr2[(i15 * i10) + (i17 * i10 * i11) + i13] = fArr[(i15 * i12) + (i13 * i11 * i12) + i17];
                                if (i18 >= i12) {
                                    break;
                                }
                                i17 = i18;
                            }
                        }
                        if (i16 >= i11) {
                            break;
                        }
                        i15 = i16;
                    }
                }
                if (i14 >= i10) {
                    break;
                }
                i13 = i14;
            }
        }
        return aVar2;
    }

    public static void s(Object obj, String str, boolean z10) {
        if (!z10) {
            throw new VerifyException(A.h(str, obj));
        }
    }

    public static final void t(p074fa.a aVar, ByteBuffer byteBuffer) throws InsufficientSpaceException {
        i.e(aVar, "<this>");
        int iRemaining = byteBuffer.remaining();
        int i10 = aVar.f34857c;
        int i11 = aVar.f34859e - i10;
        if (i11 < iRemaining) {
            throw new InsufficientSpaceException("buffer content", iRemaining, i11);
        }
        ByteBuffer destination = aVar.f34855a;
        i.e(destination, "destination");
        if (!byteBuffer.hasArray() || byteBuffer.isReadOnly()) {
            n.j(destination, i10, byteBuffer.remaining()).put(byteBuffer);
        } else {
            byte[] bArrArray = byteBuffer.array();
            i.d(bArrArray, "array()");
            int iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
            int iRemaining2 = byteBuffer.remaining();
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArrArray, iPosition, iRemaining2).slice().order(ByteOrder.BIG_ENDIAN);
            i.d(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
            p036ca.b.a(byteBufferOrder, destination, 0, iRemaining2, i10);
            byteBuffer.position(byteBuffer.limit());
        }
        aVar.a(iRemaining);
    }
}
