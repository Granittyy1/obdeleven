package E8;

import Na.g;
import Na.i;
import Na.l;
import O.h;
import Q3.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.m;
import kotlin.collections.q;
import kotlin.text.n;
import kotlinx.coroutines.InterfaceC2691h;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: Extensions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f3126a = new i(32, R.styleable.AppCompatTheme_windowNoTitle, 1);

    public static final ArrayList a(int i10, byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < bArr.length) {
            int i12 = i11 + i10;
            arrayList.add(d.t(bArr, i11, Math.min(bArr.length, i12)));
            i11 = i12;
        }
        return arrayList;
    }

    public static final byte[] b(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        byte[] bArr = new byte[str.length() / 2];
        g gVarI = l.I(2, l.J(0, str.length()));
        int i10 = gVarI.f4687b;
        int i11 = gVarI.f4688c;
        int i12 = gVarI.f4689d;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (true) {
                bArr[i10 >> 1] = (byte) ((n.P("0123456789ABCDEF", str.charAt(i10), 0, false, 6) << 4) | n.P("0123456789ABCDEF", str.charAt(i10 + 1), 0, false, 6));
                if (i10 == i11) {
                    break;
                }
                i10 += i12;
            }
        }
        return bArr;
    }

    public static final boolean c(byte[] bArr) {
        for (byte b10 : bArr) {
            i iVar = f3126a;
            if (iVar.f4687b > b10 || b10 > iVar.f4688c) {
                return false;
            }
        }
        return true;
    }

    public static final <T> void d(InterfaceC2691h<? super T> interfaceC2691h, T t8) {
        kotlin.jvm.internal.i.e(interfaceC2691h, "<this>");
        try {
            interfaceC2691h.resumeWith(t8);
        } catch (IllegalStateException unused) {
        }
    }

    public static final byte[] e(short s10) {
        Integer[] numArr = {8, 0};
        ArrayList arrayList = new ArrayList(2);
        for (int i10 = 0; i10 < 2; i10++) {
            arrayList.add(Integer.valueOf((s10 >>> numArr[i10].intValue()) & 255));
        }
        ArrayList arrayList2 = new ArrayList(m.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Number) it.next()).intValue()));
        }
        return q.k0(arrayList2);
    }

    public static final String f(int i10) {
        String str = String.format("%X", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
        return str.length() % 2 == 1 ? "0".concat(str) : str;
    }

    public static final String g(byte[] bArr) {
        kotlin.jvm.internal.i.e(bArr, "<this>");
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            sb2.append("0123456789ABCDEF".charAt((b10 & 240) >>> 4));
            sb2.append("0123456789ABCDEF".charAt(b10 & 15));
        }
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }

    public static final int h(byte[] bArr) {
        String strG = g(bArr);
        h.c(16);
        return Integer.parseInt(strG, 16);
    }

    public static final C8.a.C0024a i(Throwable th) {
        kotlin.jvm.internal.i.e(th, "<this>");
        return new C8.a.C0024a(th);
    }

    public static final <T> C8.a.b<T> j(T t8) {
        kotlin.jvm.internal.i.e(t8, "<this>");
        return new C8.a.b<>(t8);
    }

    public static final byte[] k(short s10) {
        int i10 = 0;
        Integer[] numArr = {8, 0};
        ArrayList arrayList = new ArrayList(2);
        for (int i11 = 0; i11 < 2; i11++) {
            arrayList.add(Integer.valueOf(((65535 & s10) >>> numArr[i11].intValue()) & 255));
        }
        ArrayList arrayList2 = new ArrayList(m.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new p293xa.i((byte) ((Number) it.next()).intValue()));
        }
        byte[] bArr = new byte[arrayList2.size()];
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            bArr[i10] = ((p293xa.i) it2.next()).f47922b;
            i10++;
        }
        return bArr;
    }
}
