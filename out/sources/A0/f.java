package A0;

import D2.V;
import O.h;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.j;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.n;
import androidx.compose.ui.text.font.r;
import androidx.compose.ui.text.font.s;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.Fragment;
import coil.size.Scale;
import com.google.android.gms.internal.play_billing.zzei;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.q;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Preconditions.java */
/* JADX INFO: loaded from: classes.dex */
public final class f implements r {
    public static byte[] a(byte[] bArr) {
        int length = bArr.length * 8;
        byte[] bArr2 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr2[i10] = (byte) ((bArr[i10 / 8] >> (i10 % 8)) & 1);
        }
        return bArr2;
    }

    public static void c(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void d(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final double g(int i10, int i11, int i12, int i13, Scale scale) {
        double d10 = ((double) i12) / ((double) i10);
        double d11 = ((double) i13) / ((double) i11);
        int iOrdinal = scale.ordinal();
        if (iOrdinal == 0) {
            return Math.max(d10, d11);
        }
        if (iOrdinal == 1) {
            return Math.min(d10, d11);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static Typeface h(String str, l lVar, int i10) {
        if (j.a(i10, 0) && i.a(lVar, l.f15442g) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iJ = V.j(lVar, i10);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iJ) : Typeface.create(str, iJ);
    }

    public static final int i(Fragment fragment) {
        i.e(fragment, "<this>");
        ActivityC1347l activityC1347lRequireActivity = fragment.requireActivity();
        i.d(activityC1347lRequireActivity, "requireActivity(...)");
        return W8.a.a(activityC1347lRequireActivity);
    }

    public static byte[] j(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            String strSubstring = str.substring(i11, i11 + 2);
            i.d(strSubstring, "substring(...)");
            h.c(16);
            bArr[i10] = (byte) Integer.parseInt(strSubstring, 16);
        }
        return bArr;
    }

    public static void k(byte[] bArr) {
        int length = bArr.length - 1;
        int i10 = 0;
        while (i10 < bArr.length / 2) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[length];
            bArr[length] = b10;
            i10++;
            length--;
        }
    }

    public static final byte[] l(int i10) {
        Integer[] numArr = {24, 16, 8, 0};
        ArrayList arrayList = new ArrayList(4);
        for (int i11 = 0; i11 < 4; i11++) {
            arrayList.add(Byte.valueOf((byte) ((i10 >>> numArr[i11].intValue()) & 255)));
        }
        return q.k0(arrayList);
    }

    public static String m(zzei zzeiVar) {
        StringBuilder sb2 = new StringBuilder(zzeiVar.g());
        for (int i10 = 0; i10 < zzeiVar.g(); i10++) {
            byte bD = zzeiVar.d(i10);
            if (bD == 34) {
                sb2.append("\\\"");
            } else if (bD == 39) {
                sb2.append("\\'");
            } else if (bD != 92) {
                switch (bD) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bD < 32 || bD > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bD >>> 6) & 3) + 48));
                            sb2.append((char) (((bD >>> 3) & 7) + 48));
                            sb2.append((char) ((bD & 7) + 48));
                        } else {
                            sb2.append((char) bD);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    @Override // androidx.compose.ui.text.font.r
    public Typeface b(n nVar, l lVar, int i10) {
        String strB = nVar.f15449e;
        int i11 = lVar.f15447b / 100;
        if (i11 >= 0 && i11 < 2) {
            strB = s.b(strB, "-thin");
        } else if (2 <= i11 && i11 < 4) {
            strB = s.b(strB, "-light");
        } else if (i11 != 4) {
            if (i11 == 5) {
                strB = s.b(strB, "-medium");
            } else if ((6 > i11 || i11 >= 8) && 8 <= i11 && i11 < 11) {
                strB = s.b(strB, "-black");
            }
        }
        Typeface typeface = null;
        if (strB.length() != 0) {
            Typeface typefaceH = h(strB, lVar, i10);
            if (!i.a(typefaceH, Typeface.create(Typeface.DEFAULT, V.j(lVar, i10))) && !i.a(typefaceH, h(null, lVar, i10))) {
                typeface = typefaceH;
            }
        }
        return typeface == null ? h(nVar.f15449e, lVar, i10) : typeface;
    }

    @Override // androidx.compose.ui.text.font.r
    public Typeface e(l lVar, int i10) {
        return h(null, lVar, i10);
    }
}
