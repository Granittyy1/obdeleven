package com.google.android.gms.internal.measurement;

import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1784b4 {
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(byte[] bArr, int i10, int i11) {
        int iC;
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 >= i11) {
            iC = 0;
            break;
        }
        while (true) {
            if (i10 >= i11) {
                iC = 0;
                break;
            }
            int i12 = i10 + 1;
            iC = bArr[i10];
            if (iC < 0) {
                if (iC >= -32) {
                    if (iC >= -16) {
                        if (i12 < i11 - 2) {
                            int i13 = i10 + 2;
                            int i14 = bArr[i12];
                            if (i14 <= -65) {
                                if ((((i14 + R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) + (iC << 28)) >> 30) == 0) {
                                    int i15 = i10 + 3;
                                    if (bArr[i13] <= -65) {
                                        i10 += 4;
                                        if (bArr[i15] > -65) {
                                        }
                                    }
                                }
                            }
                            iC = -1;
                            break;
                        }
                        iC = Z3.c(bArr, i12, i11);
                        break;
                    }
                    if (i12 < i11 - 1) {
                        int i16 = i10 + 2;
                        char c10 = bArr[i12];
                        if (c10 <= -65 && ((iC != -32 || c10 >= -96) && (iC != -19 || c10 < -96))) {
                            i10 += 3;
                            if (bArr[i16] > -65) {
                            }
                        }
                        iC = -1;
                        break;
                    }
                    iC = Z3.c(bArr, i12, i11);
                    break;
                }
                if (i12 >= i11) {
                    break;
                }
                if (iC >= -62) {
                    i10 += 2;
                    if (bArr[i12] > -65) {
                    }
                }
                iC = -1;
                break;
            }
            i10 = i12;
        }
        return iC == 0;
    }
}
