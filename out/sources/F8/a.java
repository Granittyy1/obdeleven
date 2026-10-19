package F8;

import G8.C0700b;
import O.h;
import Ua.f;
import Ya.l;
import android.app.ActivityManager;
import android.content.Context;
import androidx.collection.C0874b;
import androidx.compose.foundation.lazy.layout.C0971f;
import androidx.compose.ui.text.E;
import io.ktor.http.z;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.m;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import kotlinx.datetime.DateTimeArithmeticException;
import kotlinx.serialization.json.internal.x;
import p037cb.AbstractC1515b;
import p293xa.k;
import p304y9.C2824c;

/* JADX INFO: compiled from: AppTranslationMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final int a(int i10, androidx.compose.runtime.collection.c cVar) {
        int i11 = cVar.f12945d - 1;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = ((i11 - i12) / 2) + i12;
            Object[] objArr = cVar.f12943b;
            int i14 = ((C0971f) objArr[i13]).f10715a;
            if (i14 != i10) {
                if (i14 < i10) {
                    i12 = i13 + 1;
                    if (i10 < ((C0971f) objArr[i12]).f10715a) {
                    }
                } else {
                    i11 = i13 - 1;
                }
            }
            return i13;
        }
        return i12;
    }

    public static final void b(C0874b c0874b, int i10) {
        i.e(c0874b, "<this>");
        c0874b.f9159b = new int[i10];
        c0874b.f9160c = new Object[i10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] c(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            jArr[i10] = iArr[i10];
        }
        return jArr;
    }

    public static final Ya.a d(AbstractC1515b abstractC1515b, p024bb.a aVar, String str) {
        i.e(abstractC1515b, "<this>");
        Ya.a aVarA = abstractC1515b.a(aVar, str);
        if (aVarA != null) {
            return aVarA;
        }
        L4.b.k(abstractC1515b.c(), str);
        throw null;
    }

    public static final l e(AbstractC1515b abstractC1515b, x xVar, Object value) {
        i.e(abstractC1515b, "<this>");
        i.e(value, "value");
        l lVarB = abstractC1515b.b(xVar, value);
        if (lVarB != null) {
            return lVarB;
        }
        kotlin.jvm.internal.c cVarA = kotlin.jvm.internal.l.a(value.getClass());
        Oa.c baseClass = abstractC1515b.c();
        i.e(baseClass, "baseClass");
        String strA = cVarA.a();
        if (strA == null) {
            strA = String.valueOf(cVarA);
        }
        L4.b.k(baseClass, strA);
        throw null;
    }

    public static ArrayList f(Context context) {
        i.e(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = EmptyList.f42983b;
        }
        ArrayList arrayListM = q.M(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : arrayListM) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i10) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(m.y(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String str2 = runningAppProcessInfo.processName;
            i.d(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new com.google.firebase.sessions.l(runningAppProcessInfo.pid, runningAppProcessInfo.importance, str2, i.a(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public static final int g(C0874b c0874b, Object obj, int i10) {
        i.e(c0874b, "<this>");
        int i11 = c0874b.f9161d;
        if (i11 == 0) {
            return -1;
        }
        try {
            int iA = p233t.a.a(c0874b.f9161d, i10, c0874b.f9159b);
            if (iA < 0 || i.a(obj, c0874b.f9160c[iA])) {
                return iA;
            }
            int i12 = iA + 1;
            while (i12 < i11 && c0874b.f9159b[i12] == i10) {
                if (i.a(obj, c0874b.f9160c[i12])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = iA - 1; i13 >= 0 && c0874b.f9159b[i13] == i10; i13--) {
                if (i.a(obj, c0874b.f9160c[i13])) {
                    return i13;
                }
            }
            return ~i12;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final boolean h(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static List i(List input) {
        i.e(input, "input");
        if (input.isEmpty()) {
            return EmptyList.f42983b;
        }
        List<C2824c> list = input;
        ArrayList arrayList = new ArrayList(m.y(list, 10));
        for (C2824c c2824c : list) {
            String str = c2824c.f48549a;
            String str2 = c2824c.f48552d;
            if (str2 == null) {
                str2 = "";
            }
            arrayList.add(new C0700b(str, c2824c.f48550b, c2824c.f48551c, str2));
        }
        return arrayList;
    }

    public static boolean j(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr2.length; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static final f k(Ua.d dVar, Ua.c timeZone) {
        i.e(dVar, "<this>");
        i.e(timeZone, "timeZone");
        try {
            return new f(LocalDateTime.ofInstant(dVar.f6577b, timeZone.f6584a));
        } catch (DateTimeException e10) {
            throw new DateTimeArithmeticException(e10);
        }
    }

    public static final String l(short s10) {
        h.c(16);
        String string = Integer.toString(s10 & 65535, 16);
        i.d(string, "toString(...)");
        return string;
    }

    public static final k m(int i10, String str) {
        int i11;
        i.e(str, "<this>");
        h.c(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        if (i.g(cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i11 = 0;
        }
        int iDivideUnsigned = 119304647;
        while (i11 < length) {
            int iDigit = Character.digit((int) str.charAt(i11), i10);
            if (iDigit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i12, iDivideUnsigned) > 0) {
                if (iDivideUnsigned == 119304647) {
                    iDivideUnsigned = Integer.divideUnsigned(-1, i10);
                    if (Integer.compareUnsigned(i12, iDivideUnsigned) > 0) {
                    }
                }
                return null;
            }
            int i13 = i12 * i10;
            int i14 = iDigit + i13;
            if (Integer.compareUnsigned(i14, i13) < 0) {
                return null;
            }
            i11++;
            i12 = i14;
        }
        return new k(i12);
    }

    public static final p293xa.m n(String str) {
        i.e(str, "<this>");
        h.c(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char cCharAt = str.charAt(0);
        if (i.g(cCharAt, 48) < 0) {
            i10 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j = 10;
        long j10 = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j10, jDivideUnsigned) > 0) {
                if (jDivideUnsigned != 512409557603043100L) {
                    return null;
                }
                jDivideUnsigned = Long.divideUnsigned(-1L, j);
                if (Long.compareUnsigned(j10, jDivideUnsigned) > 0) {
                    return null;
                }
            }
            long j11 = j10 * j;
            long j12 = (((long) iDigit) & 4294967295L) + j11;
            if (Long.compareUnsigned(j12, j11) < 0) {
                return null;
            }
            i10++;
            j10 = j12;
        }
        return new p293xa.m(j10);
    }

    public static final long o(long j, long j10) {
        int iC;
        int iE = E.e(j);
        int iD = E.d(j);
        if ((E.e(j10) < E.d(j)) && (E.e(j) < E.d(j10))) {
            if ((E.e(j10) <= E.e(j)) && (E.d(j) <= E.d(j10))) {
                iE = E.e(j10);
                iD = iE;
            } else {
                if ((E.e(j) <= E.e(j10)) && (E.d(j10) <= E.d(j))) {
                    iC = E.c(j10);
                } else {
                    int iE2 = E.e(j10);
                    if (iE >= E.d(j10) || iE2 > iE) {
                        iD = E.e(j10);
                    } else {
                        iE = E.e(j10);
                        iC = E.c(j10);
                    }
                }
                iD -= iC;
            }
        } else if (iD > E.e(j10)) {
            iE -= E.c(j10);
            iC = E.c(j10);
            iD -= iC;
        }
        return h.b(iE, iD);
    }

    public static final void p(io.ktor.client.request.a aVar, String urlString) {
        i.e(urlString, "urlString");
        z.b(aVar.f40410a, urlString);
    }
}
