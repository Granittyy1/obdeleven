package kotlin.jvm.internal;

import android.database.Cursor;
import android.os.SystemClock;
import androidx.compose.material.T;
import androidx.compose.ui.layout.InterfaceC1170p;
import androidx.compose.ui.node.NodeCoordinator;
import com.braze.support.BrazeLogger;
import com.google.android.gms.internal.measurement.M1;
import java.nio.ByteBuffer;
import java.util.Locale;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlinx.datetime.internal.format.parser.q;

/* JADX INFO: compiled from: PrimitiveCompanionObjects.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements L4.a {
    public static final I.f a(InterfaceC1170p interfaceC1170p) {
        InterfaceC1170p interfaceC1170pX = interfaceC1170p.X();
        return interfaceC1170pX != null ? interfaceC1170pX.H(interfaceC1170p, true) : new I.f(0.0f, 0.0f, (int) (interfaceC1170p.a() >> 32), (int) (interfaceC1170p.a() & 4294967295L));
    }

    public static final I.f c(InterfaceC1170p interfaceC1170p) {
        InterfaceC1170p interfaceC1170pH = h(interfaceC1170p);
        float fA = (int) (interfaceC1170pH.a() >> 32);
        float fA2 = (int) (interfaceC1170pH.a() & 4294967295L);
        I.f fVarH = interfaceC1170pH.H(interfaceC1170p, true);
        float f10 = fVarH.f3757a;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > fA) {
            f10 = fA;
        }
        float f11 = fVarH.f3758b;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f11 > fA2) {
            f11 = fA2;
        }
        float f12 = fVarH.f3759c;
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        if (f12 <= fA) {
            fA = f12;
        }
        float f13 = fVarH.f3760d;
        float f14 = f13 >= 0.0f ? f13 : 0.0f;
        if (f14 <= fA2) {
            fA2 = f14;
        }
        if (f10 == fA || f11 == fA2) {
            return I.f.f3756e;
        }
        long jW = interfaceC1170pH.w((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L));
        long jW2 = interfaceC1170pH.w((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (((long) Float.floatToRawIntBits(fA)) << 32));
        long jW3 = interfaceC1170pH.w((((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA2)) & 4294967295L));
        long jW4 = interfaceC1170pH.w((((long) Float.floatToRawIntBits(fA2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f10)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jW >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jW2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jW4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jW3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jW & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jW2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jW4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jW3 & 4294967295L));
        return new I.f(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static String d(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (i10 < str.length()) {
            int i11 = i10 + 2;
            sb2.append((char) Integer.parseInt(str.substring(i10, i11), 16));
            i10 = i11;
        }
        return sb2.toString();
    }

    public static String e(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder sb2 = new StringBuilder();
        for (char c10 : charArray) {
            sb2.append(String.format(Locale.US, "%02X", Byte.valueOf((byte) c10)));
        }
        return sb2.toString();
    }

    public static final void f(ByteBuffer copyTo, ByteBuffer byteBuffer, int i10) {
        i.e(copyTo, "$this$copyTo");
        int iRemaining = byteBuffer.remaining();
        if (copyTo.hasArray() && !copyTo.isReadOnly() && byteBuffer.hasArray() && !byteBuffer.isReadOnly()) {
            int iPosition = byteBuffer.position();
            System.arraycopy(copyTo.array(), copyTo.arrayOffset() + i10, byteBuffer.array(), byteBuffer.arrayOffset() + iPosition, iRemaining);
            byteBuffer.position(iPosition + iRemaining);
        } else {
            ByteBuffer byteBufferDuplicate = copyTo.duplicate();
            byteBufferDuplicate.limit(iRemaining + i10);
            byteBufferDuplicate.position(i10);
            byteBuffer.put(byteBufferDuplicate);
        }
    }

    public static String g(String str) {
        String hexString = Integer.toHexString(Integer.parseInt(str));
        return hexString.length() % 2 != 0 ? "0".concat(hexString) : hexString;
    }

    public static final InterfaceC1170p h(InterfaceC1170p interfaceC1170p) {
        InterfaceC1170p interfaceC1170p2;
        InterfaceC1170p interfaceC1170pX = interfaceC1170p.X();
        while (true) {
            InterfaceC1170p interfaceC1170p3 = interfaceC1170pX;
            interfaceC1170p2 = interfaceC1170p;
            interfaceC1170p = interfaceC1170p3;
            if (interfaceC1170p == null) {
                break;
            }
            interfaceC1170pX = interfaceC1170p.X();
        }
        NodeCoordinator nodeCoordinator = interfaceC1170p2 instanceof NodeCoordinator ? (NodeCoordinator) interfaceC1170p2 : null;
        if (nodeCoordinator == null) {
            return interfaceC1170p2;
        }
        NodeCoordinator nodeCoordinator2 = nodeCoordinator.f14529r;
        while (true) {
            NodeCoordinator nodeCoordinator3 = nodeCoordinator2;
            NodeCoordinator nodeCoordinator4 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator3;
            if (nodeCoordinator == null) {
                return nodeCoordinator4;
            }
            nodeCoordinator2 = nodeCoordinator.f14529r;
        }
    }

    public static final int i(Cursor c10, String str) {
        String strV;
        i.e(c10, "c");
        int columnIndex = c10.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = c10.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = c10.getColumnNames();
            i.d(columnNames, "c.columnNames");
            strV = kotlin.collections.k.V(columnNames, null, null, 63);
        } catch (Exception unused) {
            strV = "unknown";
        }
        throw new IllegalArgumentException(B6.c.d("column '", str, "' does not exist. Available columns: ", strV));
    }

    public static final ByteBuffer j(ByteBuffer byteBuffer, int i10, int i11) {
        i.e(byteBuffer, "<this>");
        ByteBuffer myDuplicate$lambda$1 = byteBuffer.duplicate();
        i.d(myDuplicate$lambda$1, "myDuplicate$lambda$1");
        myDuplicate$lambda$1.position(i10);
        myDuplicate$lambda$1.limit(i10 + i11);
        ByteBuffer mySlice$lambda$2 = myDuplicate$lambda$1.slice();
        i.d(mySlice$lambda$2, "mySlice$lambda$2");
        return mySlice$lambda$2;
    }

    public static int k(int i10) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i10) * (-862048943)), 15)) * 461845907);
    }

    public static int l(Object obj) {
        return k(obj == null ? 0 : obj.hashCode());
    }

    public static final kotlinx.datetime.internal.format.parser.l m(Integer num, Integer num2, Integer num3, kotlinx.datetime.internal.format.b setter, String name, boolean z10) {
        int iIntValue;
        i.e(setter, "setter");
        i.e(name, "name");
        int iIntValue2 = num.intValue() + (z10 ? 1 : 0);
        if (num2 != null) {
            iIntValue = num2.intValue();
            if (z10) {
                iIntValue++;
            }
        } else {
            iIntValue = BrazeLogger.SUPPRESS;
        }
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        int iMin = Math.min(iIntValue, iIntValue3);
        if (iIntValue2 >= iMin) {
            return n(z10, setter, name, iIntValue2, iIntValue);
        }
        kotlinx.datetime.internal.format.parser.l lVarN = n(z10, setter, name, iIntValue2, iIntValue2);
        while (iIntValue2 < iMin) {
            EmptyList emptyList = EmptyList.f42983b;
            iIntValue2++;
            lVarN = new kotlinx.datetime.internal.format.parser.l(emptyList, kotlin.collections.l.s(n(z10, setter, name, iIntValue2, iIntValue2), T.c(kotlin.collections.l.s(new kotlinx.datetime.internal.format.parser.l(M1.k(new kotlinx.datetime.internal.format.parser.m(" ")), emptyList), lVarN))));
        }
        if (iIntValue3 > iIntValue) {
            return T.c(kotlin.collections.l.s(new kotlinx.datetime.internal.format.parser.l(M1.k(new kotlinx.datetime.internal.format.parser.m(kotlin.text.m.F(iIntValue3 - iIntValue, " "))), EmptyList.f42983b), lVarN));
        }
        return iIntValue3 == iIntValue ? lVarN : new kotlinx.datetime.internal.format.parser.l(EmptyList.f42983b, kotlin.collections.l.s(n(z10, setter, name, iIntValue3 + 1, iIntValue), lVarN));
    }

    public static final kotlinx.datetime.internal.format.parser.l n(boolean z10, kotlinx.datetime.internal.format.b bVar, String str, int i10, int i11) {
        if (i11 < (z10 ? 1 : 0) + 1) {
            throw new IllegalStateException("Check failed.");
        }
        ListBuilder listBuilderF = M1.f();
        if (z10) {
            listBuilderF.add(new kotlinx.datetime.internal.format.parser.m("-"));
        }
        listBuilderF.add(new kotlinx.datetime.internal.format.parser.g(M1.k(new q(Integer.valueOf(i10 - (z10 ? 1 : 0)), Integer.valueOf(i11 - (z10 ? 1 : 0)), bVar, str, z10))));
        return new kotlinx.datetime.internal.format.parser.l(listBuilderF.I(), EmptyList.f42983b);
    }

    @Override // L4.a
    public long b() {
        return SystemClock.elapsedRealtime();
    }
}
