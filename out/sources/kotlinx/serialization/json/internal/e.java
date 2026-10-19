package kotlinx.serialization.json.internal;

import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: AbstractJsonLexer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f43981a = new char[R.styleable.AppCompatTheme_windowActionBar];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f43982b = new byte[R.styleable.AppCompatTheme_windowNoTitle];

    static {
        int i10 = 0;
        for (int i11 = 0; i11 < 32; i11++) {
        }
        a('b', 8);
        a('t', 9);
        a('n', 10);
        a('f', 12);
        a('r', 13);
        a('/', 47);
        a('\"', 34);
        a('\\', 92);
        while (true) {
            byte[] bArr = f43982b;
            if (i10 >= 33) {
                bArr[9] = 3;
                bArr[10] = 3;
                bArr[13] = 3;
                bArr[32] = 3;
                bArr[44] = 4;
                bArr[58] = 5;
                bArr[123] = 6;
                bArr[125] = 7;
                bArr[91] = 8;
                bArr[93] = 9;
                bArr[34] = 1;
                bArr[92] = 2;
                return;
            }
            bArr[i10] = 127;
            i10++;
        }
    }

    public static void a(char c10, int i10) {
        if (c10 != 'u') {
            f43981a[c10] = (char) i10;
        }
    }
}
