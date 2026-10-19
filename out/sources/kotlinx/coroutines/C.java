package kotlinx.coroutines;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.foundation.lazy.layout.InterfaceC0985u;
import androidx.compose.ui.input.pointer.C1153d;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.input.TextFieldValue;
import com.braze.support.BrazeLogger;
import com.voltasit.obdeleven.domain.models.AgreementType;
import io.ktor.http.CodecsKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.EmptyList;
import p304y9.C2823b;

/* JADX INFO: compiled from: DebugStrings.kt */
/* JADX INFO: loaded from: classes2.dex */
public class C implements coil.util.r {
    public static final long c(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final I.g d(float f10, float f11, float f12, float f13, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new I.g(f10, f11, f12, f13, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static final void e(int i10, String str) {
        if (str.charAt(i10) == '-') {
            return;
        }
        throw new IllegalArgumentException(("Expected '-' (hyphen) at index 8, but was " + str.charAt(i10)).toString());
    }

    public static final void f(long j, byte[] bArr, int i10, int i11) {
        int i12 = (i11 * 2) + i10;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = kotlin.text.c.f43135a[(int) (255 & j)];
            bArr[i12 - 1] = (byte) i14;
            i12 -= 2;
            bArr[i12] = (byte) (i14 >> 8);
            j >>= 8;
        }
    }

    public static final void g(androidx.compose.ui.input.pointer.util.a aVar, androidx.compose.ui.input.pointer.q qVar) {
        if (I.b.c(qVar)) {
            VelocityTracker1D velocityTracker1D = aVar.f14146a;
            P.a[] aVarArr = velocityTracker1D.f14138d;
            Q3.d.w(aVarArr, null, 0, aVarArr.length);
            velocityTracker1D.f14139e = 0;
            VelocityTracker1D velocityTracker1D2 = aVar.f14147b;
            P.a[] aVarArr2 = velocityTracker1D2.f14138d;
            Q3.d.w(aVarArr2, null, 0, aVarArr2.length);
            velocityTracker1D2.f14139e = 0;
            aVar.f14148c = 0L;
        }
        boolean zE = I.b.e(qVar);
        long j = qVar.f14101b;
        if (!zE) {
            List list = qVar.f14109k;
            if (list == null) {
                list = EmptyList.f42983b;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                C1153d c1153d = (C1153d) list.get(i10);
                long j10 = c1153d.f14070a;
                long j11 = c1153d.f14072c;
                aVar.getClass();
                aVar.f14146a.a(Float.intBitsToFloat((int) (j11 >> 32)), j10);
                aVar.f14147b.a(Float.intBitsToFloat((int) (j11 & 4294967295L)), j10);
            }
            long j12 = qVar.f14110l;
            aVar.getClass();
            aVar.f14146a.a(Float.intBitsToFloat((int) (j12 >> 32)), j);
            aVar.f14147b.a(Float.intBitsToFloat((int) (j12 & 4294967295L)), j);
        }
        if (I.b.e(qVar) && j - aVar.f14148c > 40) {
            VelocityTracker1D velocityTracker1D3 = aVar.f14146a;
            P.a[] aVarArr3 = velocityTracker1D3.f14138d;
            Q3.d.w(aVarArr3, null, 0, aVarArr3.length);
            velocityTracker1D3.f14139e = 0;
            VelocityTracker1D velocityTracker1D4 = aVar.f14147b;
            P.a[] aVarArr4 = velocityTracker1D4.f14138d;
            Q3.d.w(aVarArr4, null, 0, aVarArr4.length);
            velocityTracker1D4.f14139e = 0;
            aVar.f14148c = 0L;
        }
        aVar.f14148c = j;
    }

    public static final io.ktor.http.r h(io.ktor.http.s sVar) {
        io.ktor.http.t tVarA = io.ktor.http.v.a();
        for (String str : sVar.names()) {
            List<String> listC = sVar.c(str);
            if (listC == null) {
                listC = EmptyList.f42983b;
            }
            String strE = CodecsKt.e(str, 0, 0, false, 15);
            List<String> list = listC;
            ArrayList arrayList = new ArrayList(kotlin.collections.m.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(CodecsKt.e((String) it.next(), 0, 0, true, 11));
            }
            tVarA.b(strE, arrayList);
        }
        Map<String, List<String>> values = tVarA.f40530a;
        kotlin.jvm.internal.i.e(values, "values");
        return new io.ktor.http.u(values);
    }

    public static final float i(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            f10 += fArr[i10] * fArr2[i10];
        }
        return f10;
    }

    public static boolean j(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static final int k(int i10, InterfaceC0985u interfaceC0985u, Object obj) {
        int iE;
        return (obj == null || interfaceC0985u.b() == 0 || (i10 < interfaceC0985u.b() && obj.equals(interfaceC0985u.c(i10))) || (iE = interfaceC0985u.e(obj)) == -1) ? i10 : iE;
    }

    public static final String l(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final long m(androidx.compose.ui.draganddrop.b bVar) {
        float x10 = bVar.f13363a.getX();
        float y10 = bVar.f13363a.getY();
        return (((long) Float.floatToRawIntBits(x10)) << 32) | (((long) Float.floatToRawIntBits(y10)) & 4294967295L);
    }

    public static final int n(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (i10 >= i11) {
                return i11;
            }
            int i13 = i11 % i12;
            if (i13 < 0) {
                i13 += i12;
            }
            int i14 = i10 % i12;
            if (i14 < 0) {
                i14 += i12;
            }
            int i15 = (i13 - i14) % i12;
            if (i15 < 0) {
                i15 += i12;
            }
            return i11 - i15;
        }
        if (i12 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i10 <= i11) {
            return i11;
        }
        int i16 = -i12;
        int i17 = i10 % i16;
        if (i17 < 0) {
            i17 += i16;
        }
        int i18 = i11 % i16;
        if (i18 < 0) {
            i18 += i16;
        }
        int i19 = (i17 - i18) % i16;
        if (i19 < 0) {
            i19 += i16;
        }
        return i11 + i19;
    }

    public static final C1260a o(TextFieldValue textFieldValue) {
        C1260a c1260a = textFieldValue.f15491a;
        c1260a.getClass();
        long j = textFieldValue.f15492b;
        return c1260a.subSequence(androidx.compose.ui.text.E.e(j), androidx.compose.ui.text.E.d(j));
    }

    public static final C1260a p(TextFieldValue textFieldValue, int i10) {
        C1260a c1260a = textFieldValue.f15491a;
        long j = textFieldValue.f15492b;
        return c1260a.subSequence(androidx.compose.ui.text.E.d(j), Math.min(androidx.compose.ui.text.E.d(j) + i10, textFieldValue.f15491a.f15408c.length()));
    }

    public static final C1260a q(TextFieldValue textFieldValue, int i10) {
        C1260a c1260a = textFieldValue.f15491a;
        long j = textFieldValue.f15492b;
        return c1260a.subSequence(Math.max(0, androidx.compose.ui.text.E.e(j) - i10), androidx.compose.ui.text.E.e(j));
    }

    public static final boolean r(I.g gVar) {
        long j = gVar.f3765e;
        return (j >>> 32) == (4294967295L & j) && j == gVar.f3766f && j == gVar.f3767g && j == gVar.f3768h;
    }

    public static C2823b s(List input) {
        kotlin.jvm.internal.i.e(input, "input");
        List list = input;
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((AgreementType) it.next()).a()));
        }
        return new C2823b(arrayList);
    }

    public static final void t(float[] fArr, float[] fArr2, int i10, float[] fArr3) {
        if (i10 == 0) {
            R.a.a("At least one point must be provided");
        }
        int i11 = 2 >= i10 ? i10 - 1 : 2;
        int i12 = i11 + 1;
        float[][] fArr4 = new float[i12][];
        for (int i13 = 0; i13 < i12; i13++) {
            fArr4[i13] = new float[i10];
        }
        for (int i14 = 0; i14 < i10; i14++) {
            fArr4[0][i14] = 1.0f;
            for (int i15 = 1; i15 < i12; i15++) {
                fArr4[i15][i14] = fArr4[i15 - 1][i14] * fArr[i14];
            }
        }
        float[][] fArr5 = new float[i12][];
        for (int i16 = 0; i16 < i12; i16++) {
            fArr5[i16] = new float[i10];
        }
        float[][] fArr6 = new float[i12][];
        for (int i17 = 0; i17 < i12; i17++) {
            fArr6[i17] = new float[i12];
        }
        int i18 = 0;
        while (i18 < i12) {
            float[] destination = fArr5[i18];
            float[] fArr7 = fArr4[i18];
            kotlin.jvm.internal.i.e(fArr7, "<this>");
            kotlin.jvm.internal.i.e(destination, "destination");
            System.arraycopy(fArr7, 0, destination, 0, i10);
            for (int i19 = 0; i19 < i18; i19++) {
                float[] fArr8 = fArr5[i19];
                float fI = i(destination, fArr8);
                for (int i20 = 0; i20 < i10; i20++) {
                    destination[i20] = destination[i20] - (fArr8[i20] * fI);
                }
            }
            float fSqrt = (float) Math.sqrt(i(destination, destination));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f10 = 1.0f / fSqrt;
            for (int i21 = 0; i21 < i10; i21++) {
                destination[i21] = destination[i21] * f10;
            }
            float[] fArr9 = fArr6[i18];
            int i22 = 0;
            while (i22 < i12) {
                fArr9[i22] = i22 < i18 ? 0.0f : i(destination, fArr4[i22]);
                i22++;
            }
            i18++;
        }
        for (int i23 = i11; -1 < i23; i23--) {
            float fI2 = i(fArr5[i23], fArr2);
            float[] fArr10 = fArr6[i23];
            int i24 = i23 + 1;
            if (i24 <= i11) {
                int i25 = i11;
                while (true) {
                    fI2 -= fArr10[i25] * fArr3[i25];
                    if (i25 != i24) {
                        i25--;
                    }
                }
            }
            fArr3[i23] = fI2 / fArr10[i23];
        }
    }

    public static Set u(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        kotlin.jvm.internal.i.d(setSingleton, "singleton(...)");
        return setSingleton;
    }

    public static final String v(kotlin.coroutines.c cVar) {
        Object objA;
        if (cVar instanceof kotlinx.coroutines.internal.h) {
            return cVar.toString();
        }
        try {
            objA = cVar + '@' + l(cVar);
        } catch (Throwable th) {
            objA = kotlin.b.a(th);
        }
        if (Result.a(objA) != null) {
            objA = cVar.getClass().getName() + '@' + l(cVar);
        }
        return (String) objA;
    }

    public static final void w(androidx.compose.ui.input.pointer.j jVar, long j, Ia.l lVar, boolean z10) {
        MotionEvent motionEventA = jVar.a();
        if (motionEventA == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEventA.getAction();
        if (z10) {
            motionEventA.setAction(3);
        }
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        motionEventA.offsetLocation(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
        lVar.invoke(motionEventA);
        motionEventA.offsetLocation(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
        motionEventA.setAction(action);
    }

    public static int x(int i10) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i11 = 0; i11 < 6; i11++) {
            int i12 = iArr[i11];
            int i13 = i12 - 1;
            if (i12 == 0) {
                throw null;
            }
            if (i13 == i10) {
                return i12;
            }
        }
        return 1;
    }

    @Override // coil.util.r
    public boolean a() {
        boolean z10;
        synchronized (coil.util.q.f23166a) {
            try {
                int i10 = coil.util.q.f23168c;
                coil.util.q.f23168c = i10 + 1;
                if (i10 >= 30 || SystemClock.uptimeMillis() > coil.util.q.f23169d + ((long) 30000)) {
                    coil.util.q.f23168c = 0;
                    coil.util.q.f23169d = SystemClock.uptimeMillis();
                    String[] list = coil.util.q.f23167b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    coil.util.q.f23170e = list.length < 800;
                }
                z10 = coil.util.q.f23170e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    @Override // coil.util.r
    public boolean b(Z2.e eVar) {
        Z2.a aVar = eVar.f7732a;
        boolean z10 = aVar instanceof Z2.a.C0110a;
        int i10 = BrazeLogger.SUPPRESS;
        if ((z10 ? ((Z2.a.C0110a) aVar).f7725a : Integer.MAX_VALUE) > 100) {
            Z2.a aVar2 = eVar.f7733b;
            if (aVar2 instanceof Z2.a.C0110a) {
                i10 = ((Z2.a.C0110a) aVar2).f7725a;
            }
            if (i10 > 100) {
                return true;
            }
        }
        return false;
    }
}
