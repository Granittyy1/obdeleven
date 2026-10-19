package androidx.compose.ui.platform;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeView_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ia.l<? super androidx.compose.ui.text.input.t, ? extends androidx.compose.ui.text.input.t> f14790a = AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1.f14791h;

    public static final float a(int i10, int i11, float[] fArr, float[] fArr2) {
        int i12 = i10 * 4;
        return (fArr[i12 + 3] * fArr2[12 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12] * fArr2[i11]);
    }

    public static final void b(float[] fArr, float[] fArr2) {
        float fA = a(0, 0, fArr2, fArr);
        float fA2 = a(0, 1, fArr2, fArr);
        float fA3 = a(0, 2, fArr2, fArr);
        float fA4 = a(0, 3, fArr2, fArr);
        float fA5 = a(1, 0, fArr2, fArr);
        float fA6 = a(1, 1, fArr2, fArr);
        float fA7 = a(1, 2, fArr2, fArr);
        float fA8 = a(1, 3, fArr2, fArr);
        float fA9 = a(2, 0, fArr2, fArr);
        float fA10 = a(2, 1, fArr2, fArr);
        float fA11 = a(2, 2, fArr2, fArr);
        float fA12 = a(2, 3, fArr2, fArr);
        float fA13 = a(3, 0, fArr2, fArr);
        float fA14 = a(3, 1, fArr2, fArr);
        float fA15 = a(3, 2, fArr2, fArr);
        float fA16 = a(3, 3, fArr2, fArr);
        fArr[0] = fA;
        fArr[1] = fA2;
        fArr[2] = fA3;
        fArr[3] = fA4;
        fArr[4] = fA5;
        fArr[5] = fA6;
        fArr[6] = fA7;
        fArr[7] = fA8;
        fArr[8] = fA9;
        fArr[9] = fA10;
        fArr[10] = fA11;
        fArr[11] = fA12;
        fArr[12] = fA13;
        fArr[13] = fA14;
        fArr[14] = fA15;
        fArr[15] = fA16;
    }
}
