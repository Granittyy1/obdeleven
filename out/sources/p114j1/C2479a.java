package p114j1;

import C.g;
import Ia.a;
import O.e;
import Q3.d;
import Q6.f;
import Ya.b;
import android.view.KeyEvent;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.text.font.s;
import com.braze.support.BrazeLogger;
import com.google.android.gms.internal.measurement.AbstractC1856m;
import com.google.android.gms.internal.measurement.C1897s;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.gms.internal.measurement.InterfaceC1849l;
import com.google.android.gms.internal.measurement.InterfaceC1884q;
import com.google.android.gms.internal.measurement.Y1;
import com.parse.ParseUser;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlin.text.m;
import kotlinx.coroutines.internal.y;
import kotlinx.serialization.SerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p255u9.z;

/* JADX INFO: renamed from: j1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BackgroundExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public final class C2479a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ExecutorService f41005a;

    public static long a(float f10) {
        return (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L);
    }

    public static final long b(float f10, float f11) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        int i10 = q0.f13792c;
        return jFloatToRawIntBits;
    }

    public static final Object[] c(Object[] objArr, int i10, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        d.r(0, i10, 6, objArr, objArr2);
        d.n(i10 + 2, i10, objArr.length, objArr, objArr2);
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        return objArr2;
    }

    public static final boolean d(int i10, KeyEvent keyEvent) {
        return ((int) (e.n(keyEvent) >> 32)) == i10;
    }

    public static final Object[] e(int i10, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        d.r(0, i10, 6, objArr, objArr2);
        d.n(i10, i10 + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] f(int i10, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        d.r(0, i10, 6, objArr, objArr2);
        d.n(i10, i10 + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0012, code lost:
    
        if (r5 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int g(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L9
            if (r5 == 0) goto L6
            goto L26
        L6:
            int r0 = r4 - r3
            goto L26
        L9:
            if (r5 != 0) goto Le
            if (r3 > r2) goto L18
            goto L12
        Le:
            int r1 = r4 - r3
            if (r1 <= r2) goto L18
        L12:
            if (r5 == 0) goto L15
            goto L16
        L15:
            int r2 = r2 - r3
        L16:
            r0 = r2
            goto L26
        L18:
            if (r5 == 0) goto L1d
            if (r3 > r2) goto L24
            goto L21
        L1d:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L21:
            if (r5 != 0) goto L15
            goto L16
        L24:
            if (r5 != 0) goto L6
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p114j1.C2479a.g(int, int, int, boolean):int");
    }

    public static ArrayList h(byte[] bArr) {
        long j = (((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static synchronized Executor i() {
        try {
            if (f41005a == null) {
                int i10 = A.f40996a;
                f41005a = Executors.newSingleThreadExecutor(new y("ExoPlayer:BackgroundExecutor"));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f41005a;
    }

    public static long j(byte b10, byte b11) {
        int i10;
        int i11;
        int i12 = b10 & 255;
        int i13 = b10 & 3;
        if (i13 != 0) {
            i10 = 2;
            if (i13 != 1 && i13 != 2) {
                i10 = b11 & 63;
            }
        } else {
            i10 = 1;
        }
        int i14 = i12 >> 3;
        int i15 = i14 & 3;
        if (i14 >= 16) {
            i11 = 2500 << i15;
        } else if (i14 >= 12) {
            i11 = 10000 << (i14 & 1);
        } else {
            i11 = i15 == 3 ? 60000 : 10000 << i15;
        }
        return ((long) i10) * ((long) i11);
    }

    public static final int k(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    public static final boolean l(LayoutNode layoutNode) {
        if (layoutNode.f14407i != null) {
            LayoutNode layoutNodeG = layoutNode.G();
            if ((layoutNodeG != null ? layoutNodeG.f14407i : null) == null || layoutNode.f14390H.f14628b) {
                return true;
            }
        }
        return false;
    }

    public static void m(String str, String str2, a aVar) {
        try {
            int i10 = z.f47484b;
            if (((z) ParseUser.getCurrentUser()) != null && !m.I(str, "parse_", false)) {
                z zVar = (z) ParseUser.getCurrentUser();
                i.b(zVar);
                JSONObject jSONObjectA = zVar.a();
                jSONObjectA.put(str, str2);
                z zVar2 = (z) ParseUser.getCurrentUser();
                i.b(zVar2);
                zVar2.put("settings", jSONObjectA);
                zVar2.saveInBackground();
                aVar.invoke();
                return;
            }
            aVar.invoke();
        } catch (RuntimeException e10) {
            e10.printStackTrace();
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    public static final b n(g gVar, Type type) {
        i.e(gVar, "<this>");
        i.e(type, "type");
        b<Object> bVarC = Ya.m.c(gVar, type, true);
        if (bVarC != null) {
            return bVarC;
        }
        Class<?> clsA = Ya.m.a(type);
        i.e(clsA, "<this>");
        String strA = l.a(clsA).a();
        if (strA == null) {
            strA = "<local class name not available>";
        }
        throw new SerializationException(androidx.compose.foundation.gestures.d.b("Serializer for class '", strA, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    public static final long o(String str, long j, long j10, long j11) {
        String property;
        int i10 = y.f43506a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lB = kotlin.text.l.B(property);
        if (lB == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lB.longValue();
        if (j10 <= jLongValue && jLongValue <= j11) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j10 + ".." + j11 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int p(String str, int i10, int i11, int i12, int i13) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = BrazeLogger.SUPPRESS;
        }
        return (int) o(str, i10, i11, i12);
    }

    public static InterfaceC1884q q(InterfaceC1849l interfaceC1849l, C1897s c1897s, Y1 y10, ArrayList arrayList) {
        String str = c1897s.f25833b;
        if (interfaceC1849l.g(str)) {
            InterfaceC1884q interfaceC1884qE = interfaceC1849l.e(str);
            if (interfaceC1884qE instanceof AbstractC1856m) {
                return ((AbstractC1856m) interfaceC1884qE).a(y10, arrayList);
            }
            throw new IllegalArgumentException(s.b(str, " is not a function"));
        }
        if (!"hasOwnProperty".equals(str)) {
            throw new IllegalArgumentException(B7.b.c("Object has no function ", str));
        }
        D1.e(1, "hasOwnProperty", arrayList);
        return interfaceC1849l.g(y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).A()) ? InterfaceC1884q.f25819k0 : InterfaceC1884q.f25820l0;
    }
}
