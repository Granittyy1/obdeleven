package C6;

import O.h;
import Q3.j;
import android.graphics.Bitmap;
import androidx.compose.ui.graphics.C1141q;
import androidx.compose.ui.text.AbstractC1266g;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.C1262c;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.i;
import okio.SegmentedByteString;

/* JADX INFO: compiled from: HttpRequestFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements j {
    public static androidx.compose.ui.graphics.painter.a a(C1141q c1141q, int i10) {
        Bitmap bitmap = c1141q.f13790a;
        androidx.compose.ui.graphics.painter.a aVar = new androidx.compose.ui.graphics.painter.a(c1141q, 0L, (((long) bitmap.getWidth()) << 32) | (((long) bitmap.getHeight()) & 4294967295L));
        aVar.j = i10;
        return aVar;
    }

    public static final boolean b(C1260a c1260a) {
        int length = c1260a.f15408c.length();
        List<C1260a.c<? extends C1260a.InterfaceC0160a>> list = c1260a.f15407b;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1260a.c<? extends C1260a.InterfaceC0160a> cVar = list.get(i10);
            if ((cVar.f15418a instanceof AbstractC1266g) && C1262c.b(0, length, cVar.f15419b, cVar.f15420c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    public static final int c(SegmentedByteString segmentedByteString, int i10) {
        int i11;
        i.e(segmentedByteString, "<this>");
        int i12 = i10 + 1;
        int length = segmentedByteString.f45708e.length;
        int[] iArr = segmentedByteString.f45709f;
        i.e(iArr, "<this>");
        int i13 = length - 1;
        int i14 = 0;
        while (i14 <= i13) {
            i11 = (i14 + i13) >>> 1;
            int i15 = iArr[i11];
            if (i15 < i12) {
                i14 = i11 + 1;
            } else {
                if (i15 <= i12) {
                    if (i11 >= 0) {
                        return i11;
                    }
                    return ~i11;
                }
                i13 = i11 - 1;
            }
        }
        i11 = (-i14) - 1;
        if (i11 >= 0) {
            return i11;
        }
        return ~i11;
    }

    public static final double d(long j) {
        return ((j >>> 11) * ((double) 2048)) + (j & 2047);
    }

    public static final String e(int i10, long j) {
        if (j >= 0) {
            h.c(i10);
            String string = Long.toString(j, i10);
            i.d(string, "toString(...)");
            return string;
        }
        long j10 = i10;
        long j11 = ((j >>> 1) / j10) << 1;
        long j12 = j - (j11 * j10);
        if (j12 >= j10) {
            j12 -= j10;
            j11++;
        }
        h.c(i10);
        String string2 = Long.toString(j11, i10);
        i.d(string2, "toString(...)");
        h.c(i10);
        String string3 = Long.toString(j12, i10);
        i.d(string3, "toString(...)");
        return string2.concat(string3);
    }

    public static void f(ByteBuffer byteBuffer, double d10) {
        int i10 = (int) (d10 * 1.073741824E9d);
        byteBuffer.put((byte) (((-16777216) & i10) >> 24));
        byteBuffer.put((byte) ((16711680 & i10) >> 16));
        byteBuffer.put((byte) ((65280 & i10) >> 8));
        byteBuffer.put((byte) (i10 & 255));
    }

    public static void g(ByteBuffer byteBuffer, double d10) {
        int i10 = (int) (d10 * 65536.0d);
        byteBuffer.put((byte) (((-16777216) & i10) >> 24));
        byteBuffer.put((byte) ((16711680 & i10) >> 16));
        byteBuffer.put((byte) ((65280 & i10) >> 8));
        byteBuffer.put((byte) (i10 & 255));
    }

    public static void h(ByteBuffer byteBuffer, double d10) {
        short s10 = (short) (d10 * 256.0d);
        byteBuffer.put((byte) ((65280 & s10) >> 8));
        byteBuffer.put((byte) (s10 & 255));
    }

    public static void i(int i10, ByteBuffer byteBuffer) {
        k((65535 & i10) >> 8, byteBuffer);
        byteBuffer.put((byte) (i10 & 255));
    }

    public static void j(int i10, ByteBuffer byteBuffer) {
        i((16777215 & i10) >> 8, byteBuffer);
        byteBuffer.put((byte) (i10 & 255));
    }

    public static void k(int i10, ByteBuffer byteBuffer) {
        byteBuffer.put((byte) (i10 & 255));
    }
}
