package A1;

import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: renamed from: A1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Ac3Util.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0567b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f458a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f459b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f460c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f461d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f462e = {32, 40, 48, 56, 64, 80, 96, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f463f = {69, 87, R.styleable.AppCompatTheme_textAppearanceListItemSecondary, R.styleable.AppCompatTheme_windowFixedHeightMinor, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0 || i10 >= 3 || i11 < 0 || i12 >= 19) {
            return -1;
        }
        int i13 = f459b[i10];
        if (i13 == 44100) {
            return ((i11 % 2) + f463f[i12]) * 2;
        }
        int i14 = f462e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }
}
