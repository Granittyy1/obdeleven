package T7;

import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: MatrixUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[][] f6045a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[][] f6046b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[][] f6047c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, -1, -1}, new int[]{6, 28, 54, 80, R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, -1, -1}, new int[]{6, 32, 58, 84, R.styleable.AppCompatTheme_textColorAlertDialogListItem, -1, -1}, new int[]{6, 30, 58, 86, R.styleable.AppCompatTheme_tooltipForegroundColor, -1, -1}, new int[]{6, 34, 62, 90, R.styleable.AppCompatTheme_windowActionBarOverlay, -1, -1}, new int[]{6, 26, 50, 74, 98, R.styleable.AppCompatTheme_windowFixedWidthMajor, -1}, new int[]{6, 30, 54, 78, R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, R.styleable.AppCompatTheme_windowNoTitle, -1}, new int[]{6, 26, 52, 78, R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 130, -1}, new int[]{6, 30, 56, 82, R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, 134, -1}, new int[]{6, 34, 60, 86, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 138, -1}, new int[]{6, 30, 58, 86, R.styleable.AppCompatTheme_tooltipForegroundColor, 142, -1}, new int[]{6, 34, 62, 90, R.styleable.AppCompatTheme_windowActionBarOverlay, 146, -1}, new int[]{6, 30, 54, 78, R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, R.styleable.AppCompatTheme_windowNoTitle, 150}, new int[]{6, 24, 50, 76, R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 128, 154}, new int[]{6, 28, 54, 80, R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, 132, 158}, new int[]{6, 32, 58, 84, R.styleable.AppCompatTheme_textColorAlertDialogListItem, 136, 162}, new int[]{6, 26, 54, 82, R.styleable.AppCompatTheme_textColorAlertDialogListItem, 138, 166}, new int[]{6, 30, 58, 86, R.styleable.AppCompatTheme_tooltipForegroundColor, 142, 170}};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[][] f6048d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* JADX WARN: Code duplicated, block: B:102:0x022e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0231  */
    /* JADX WARN: Code duplicated, block: B:105:0x0235  */
    public static void a(P7.a aVar, ErrorCorrectionLevel errorCorrectionLevel, S7.a aVar2, int i10, b bVar) throws WriterException {
        boolean zD;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        int i13;
        boolean z12;
        int i14 = 0;
        for (byte[] bArr : bVar.f6041a) {
            Arrays.fill(bArr, (byte) -1);
        }
        int length = f6045a[0].length;
        d(0, 0, bVar);
        int i15 = bVar.f6042b;
        int i16 = i15 - length;
        d(i16, 0, bVar);
        d(0, i16, bVar);
        c(0, 7, bVar);
        int i17 = i15 - 8;
        c(i17, 7, bVar);
        c(0, i17, bVar);
        e(7, 0, bVar);
        int i18 = bVar.f6043c;
        int i19 = i18 - 8;
        e(i19, 0, bVar);
        int i20 = i18 - 7;
        e(7, i20, bVar);
        if (bVar.a(8, i19) == 0) {
            throw new WriterException();
        }
        bVar.b(8, i19, 1);
        int i21 = aVar2.f5691a;
        int i22 = 5;
        if (i21 >= 2) {
            int[] iArr = f6047c[i21 - 1];
            int length2 = iArr.length;
            int i23 = 0;
            while (i23 < length2) {
                int i24 = iArr[i23];
                if (i24 >= 0) {
                    int length3 = iArr.length;
                    while (i14 < length3) {
                        int i25 = iArr[i14];
                        if (i25 >= 0 && f(bVar.a(i25, i24))) {
                            int i26 = i25 - 2;
                            int i27 = i24 - 2;
                            int i28 = 0;
                            while (i28 < i22) {
                                int[] iArr2 = f6046b[i28];
                                int i29 = length2;
                                int i30 = 0;
                                while (i30 < i22) {
                                    bVar.b(i26 + i30, i27 + i28, iArr2[i30]);
                                    i30++;
                                    i26 = i26;
                                    length3 = length3;
                                    i22 = 5;
                                }
                                i28++;
                                length2 = i29;
                                i22 = 5;
                            }
                        }
                        i14++;
                        i24 = i24;
                        length2 = length2;
                        length3 = length3;
                        i22 = 5;
                    }
                }
                i23++;
                length2 = length2;
                i14 = 0;
                i22 = 5;
            }
        }
        int i31 = 8;
        while (i31 < i17) {
            int i32 = i31 + 1;
            int i33 = i32 % 2;
            if (f(bVar.a(i31, 6))) {
                bVar.b(i31, 6, i33);
            }
            if (f(bVar.a(6, i31))) {
                bVar.b(6, i31, i33);
            }
            i31 = i32;
        }
        P7.a aVar3 = new P7.a();
        if (i10 < 0 || i10 >= 8) {
            throw new WriterException("Invalid mask pattern");
        }
        int iA = (errorCorrectionLevel.a() << 3) | i10;
        aVar3.b(iA, 5);
        aVar3.b(b(iA, 1335), 10);
        P7.a aVar4 = new P7.a();
        aVar4.b(21522, 15);
        if (aVar3.f4952c != aVar4.f4952c) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i34 = 0;
        while (true) {
            int[] iArr3 = aVar3.f4951b;
            if (i34 >= iArr3.length) {
                break;
            }
            iArr3[i34] = iArr3[i34] ^ aVar4.f4951b[i34];
            i34++;
        }
        if (aVar3.f4952c != 15) {
            throw new WriterException("should not happen but we got: " + aVar3.f4952c);
        }
        int i35 = 0;
        while (true) {
            int i36 = aVar3.f4952c;
            if (i35 >= i36) {
                break;
            }
            boolean zD2 = aVar3.d((i36 - 1) - i35);
            int[] iArr4 = f6048d[i35];
            bVar.c(iArr4[0], iArr4[1], zD2);
            if (i35 < 8) {
                bVar.c((i15 - i35) - 1, 8, zD2);
            } else {
                bVar.c(8, (i35 - 8) + i20, zD2);
            }
            i35++;
        }
        if (i21 >= 7) {
            P7.a aVar5 = new P7.a();
            aVar5.b(i21, 6);
            aVar5.b(b(i21, 7973), 12);
            if (aVar5.f4952c != 18) {
                throw new WriterException("should not happen but we got: " + aVar5.f4952c);
            }
            int i37 = 17;
            for (int i38 = 0; i38 < 6; i38++) {
                for (int i39 = 0; i39 < 3; i39++) {
                    boolean zD3 = aVar5.d(i37);
                    i37--;
                    int i40 = (i18 - 11) + i39;
                    bVar.c(i38, i40, zD3);
                    bVar.c(i40, i38, zD3);
                }
            }
        }
        int i41 = i15 - 1;
        int i42 = i18 - 1;
        int i43 = 0;
        int i44 = -1;
        while (i41 > 0) {
            if (i41 == 6) {
                i41--;
            }
            while (i42 >= 0 && i42 < i18) {
                for (int i45 = 0; i45 < 2; i45++) {
                    int i46 = i41 - i45;
                    if (f(bVar.a(i46, i42))) {
                        if (i43 < aVar.f4952c) {
                            zD = aVar.d(i43);
                            i43++;
                        } else {
                            zD = false;
                        }
                        if (i10 != -1) {
                            switch (i10) {
                                case 0:
                                    z10 = true;
                                    i11 = (i42 + i46) & 1;
                                    if (i11 == 0) {
                                        z12 = z10;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        zD = !zD;
                                    }
                                    break;
                                case 1:
                                    i11 = i42 & 1;
                                    z10 = true;
                                    if (i11 == 0) {
                                        z12 = z10;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        zD = !zD;
                                    }
                                    break;
                                case 2:
                                    i11 = i46 % 3;
                                    z10 = true;
                                    if (i11 == 0) {
                                        z12 = z10;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        zD = !zD;
                                    }
                                    break;
                                case 3:
                                    i11 = (i42 + i46) % 3;
                                    z10 = true;
                                    if (i11 == 0) {
                                        z12 = z10;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        zD = !zD;
                                    }
                                    break;
                                case 4:
                                    z10 = true;
                                    i11 = ((i46 / 3) + (i42 / 2)) & 1;
                                    if (i11 == 0) {
                                        z12 = z10;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        zD = !zD;
                                    }
                                    break;
                                case 5:
                                    int i47 = i42 * i46;
                                    i11 = (i47 % 3) + (i47 & 1);
                                    z10 = true;
                                    if (i11 == 0) {
                                        z12 = z10;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        zD = !zD;
                                    }
                                    break;
                                case 6:
                                    z11 = true;
                                    int i48 = i42 * i46;
                                    i12 = i48 & 1;
                                    i13 = i48 % 3;
                                    i11 = (i13 + i12) & 1;
                                    z10 = z11;
                                    if (i11 == 0) {
                                        z12 = z10;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        zD = !zD;
                                    }
                                    break;
                                case 7:
                                    i13 = (i42 * i46) % 3;
                                    z11 = true;
                                    i12 = (i42 + i46) & 1;
                                    i11 = (i13 + i12) & 1;
                                    z10 = z11;
                                    if (i11 == 0) {
                                        z12 = z10;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        zD = !zD;
                                    }
                                    break;
                                default:
                                    throw new IllegalArgumentException("Invalid mask pattern: ".concat(String.valueOf(i10)));
                            }
                        }
                        bVar.c(i46, i42, zD);
                    }
                }
                i42 += i44;
            }
            i44 = -i44;
            i42 += i44;
            i41 -= 2;
        }
        if (i43 == aVar.f4952c) {
            return;
        }
        throw new WriterException("Not all bits consumed: " + i43 + '/' + aVar.f4952c);
    }

    public static int b(int i10, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i11);
        int i12 = 32 - iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2 = i10 << (31 - iNumberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2) >= i12) {
            iNumberOfLeadingZeros2 ^= i11 << ((32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2)) - i12);
        }
        return iNumberOfLeadingZeros2;
    }

    public static void c(int i10, int i11, b bVar) throws WriterException {
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = i10 + i12;
            if (!f(bVar.a(i13, i11))) {
                throw new WriterException();
            }
            bVar.b(i13, i11, 0);
        }
    }

    public static void d(int i10, int i11, b bVar) {
        for (int i12 = 0; i12 < 7; i12++) {
            int[] iArr = f6045a[i12];
            for (int i13 = 0; i13 < 7; i13++) {
                bVar.b(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    public static void e(int i10, int i11, b bVar) throws WriterException {
        for (int i12 = 0; i12 < 7; i12++) {
            int i13 = i11 + i12;
            if (!f(bVar.a(i10, i13))) {
                throw new WriterException();
            }
            bVar.b(i10, i13, 0);
        }
    }

    public static boolean f(int i10) {
        return i10 == -1;
    }
}
