package io.grpc.okhttp.internal;

import javax.security.auth.x500.X500Principal;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: DistinguishedNameParser.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public char[] f37997g;

    public b(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f37991a = name;
        this.f37992b = name.length();
    }

    public final int a(int i10) {
        int i11;
        int i12;
        int i13 = i10 + 1;
        int i14 = this.f37992b;
        String str = this.f37991a;
        if (i13 >= i14) {
            throw new IllegalStateException("Malformed DN: " + str);
        }
        char[] cArr = this.f37997g;
        char c10 = cArr[i10];
        if (c10 >= '0' && c10 <= '9') {
            i11 = c10 - '0';
        } else if (c10 >= 'a' && c10 <= 'f') {
            i11 = c10 - 'W';
        } else {
            if (c10 < 'A' || c10 > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i11 = c10 - '7';
        }
        char c11 = cArr[i13];
        if (c11 >= '0' && c11 <= '9') {
            i12 = c11 - '0';
        } else if (c11 >= 'a' && c11 <= 'f') {
            i12 = c11 - 'W';
        } else {
            if (c11 < 'A' || c11 > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i12 = c11 - '7';
        }
        return (i11 << 4) + i12;
    }

    public final char b() {
        int i10;
        int i11 = this.f37993c + 1;
        this.f37993c = i11;
        int i12 = this.f37992b;
        if (i11 == i12) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f37991a);
        }
        char c10 = this.f37997g[i11];
        if (c10 != ' ' && c10 != '%' && c10 != '\\' && c10 != '_' && c10 != '\"' && c10 != '#') {
            switch (c10) {
                default:
                    switch (c10) {
                        case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                        case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                            break;
                        default:
                            int iA = a(i11);
                            this.f37993c++;
                            if (iA >= 128) {
                                if (iA >= 192 && iA <= 247) {
                                    if (iA <= 223) {
                                        iA &= 31;
                                        i10 = 1;
                                    } else if (iA <= 239) {
                                        iA &= 15;
                                        i10 = 2;
                                    } else {
                                        iA &= 7;
                                        i10 = 3;
                                    }
                                    for (int i13 = 0; i13 < i10; i13++) {
                                        int i14 = this.f37993c;
                                        int i15 = i14 + 1;
                                        this.f37993c = i15;
                                        if (i15 != i12 && this.f37997g[i15] == '\\') {
                                            int i16 = i14 + 2;
                                            this.f37993c = i16;
                                            int iA2 = a(i16);
                                            this.f37993c++;
                                            if ((iA2 & 192) == 128) {
                                                iA = (iA << 6) + (iA2 & 63);
                                            }
                                        }
                                    }
                                }
                                return '?';
                            }
                            return (char) iA;
                    }
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                case ',':
                    return c10;
            }
        }
        return c10;
    }

    public final String c() {
        int i10;
        int i11;
        int i12;
        char c10;
        int i13;
        char c11;
        char c12;
        while (true) {
            i10 = this.f37993c;
            i11 = this.f37992b;
            if (i10 >= i11 || this.f37997g[i10] != ' ') {
                break;
            }
            this.f37993c = i10 + 1;
        }
        if (i10 == i11) {
            return null;
        }
        this.f37994d = i10;
        this.f37993c = i10 + 1;
        while (true) {
            i12 = this.f37993c;
            if (i12 >= i11 || (c12 = this.f37997g[i12]) == '=' || c12 == ' ') {
                break;
            }
            this.f37993c = i12 + 1;
        }
        String str = this.f37991a;
        if (i12 >= i11) {
            throw new IllegalStateException("Unexpected end of DN: " + str);
        }
        this.f37995e = i12;
        if (this.f37997g[i12] == ' ') {
            while (true) {
                i13 = this.f37993c;
                if (i13 >= i11 || (c11 = this.f37997g[i13]) == '=' || c11 != ' ') {
                    break;
                }
                this.f37993c = i13 + 1;
            }
            if (this.f37997g[i13] != '=' || i13 == i11) {
                throw new IllegalStateException("Unexpected end of DN: " + str);
            }
        }
        this.f37993c++;
        while (true) {
            int i14 = this.f37993c;
            if (i14 >= i11 || this.f37997g[i14] != ' ') {
                break;
            }
            this.f37993c = i14 + 1;
        }
        int i15 = this.f37995e;
        int i16 = this.f37994d;
        if (i15 - i16 > 4) {
            char[] cArr = this.f37997g;
            if (cArr[i16 + 3] == '.' && (((c10 = cArr[i16]) == 'O' || c10 == 'o') && ((cArr[i16 + 1] == 'I' || cArr[i16 + 1] == 'i') && (cArr[i16 + 2] == 'D' || cArr[i16 + 2] == 'd')))) {
                this.f37994d = i16 + 4;
            }
        }
        char[] cArr2 = this.f37997g;
        int i17 = this.f37994d;
        return new String(cArr2, i17, i15 - i17);
    }
}
