package Y1;

import T4.v0;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.recyclerview.widget.t;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.zhanghai.android.materialprogressbar.R;
import p114j1.k;
import p114j1.r;

/* JADX INFO: compiled from: Cea608Decoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f7488i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f7489k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<p102i1.a> f7493o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List<p102i1.a> f7494p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7495q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7496r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f7497s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7498t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte f7499u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte f7500v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f7502x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f7503y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f7486z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int[] f7479A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int[] f7480B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int[] f7481C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, t.d.DEFAULT_SWIPE_ANIMATION_DURATION, 97, 98, 99, 100, R.styleable.AppCompatTheme_switchStyle, R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, R.styleable.AppCompatTheme_textAppearanceListItem, R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 105, R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu, R.styleable.AppCompatTheme_textColorAlertDialogListItem, R.styleable.AppCompatTheme_textColorSearchUrl, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, R.styleable.AppCompatTheme_toolbarStyle, R.styleable.AppCompatTheme_tooltipForegroundColor, R.styleable.AppCompatTheme_tooltipFrameBackground, R.styleable.AppCompatTheme_viewInflaterClass, R.styleable.AppCompatTheme_windowActionBar, R.styleable.AppCompatTheme_windowActionBarOverlay, R.styleable.AppCompatTheme_windowActionModeOverlay, R.styleable.AppCompatTheme_windowFixedHeightMajor, R.styleable.AppCompatTheme_windowFixedHeightMinor, R.styleable.AppCompatTheme_windowFixedWidthMajor, 231, 247, 209, 241, 9632};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int[] f7482D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int[] f7483E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, t.d.DEFAULT_DRAG_ANIMATION_DURATION, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int[] f7484F = {195, 227, 205, 204, 236, 210, 242, 213, 245, R.styleable.AppCompatTheme_windowFixedWidthMinor, R.styleable.AppCompatTheme_windowMinWidthMinor, 92, 94, 95, R.styleable.AppCompatTheme_windowMinWidthMajor, R.styleable.AppCompatTheme_windowNoTitle, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final boolean[] f7485G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f7487h = new r();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList<C0104a> f7491m = new ArrayList<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0104a f7492n = new C0104a(0, 4);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7501w = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f7490l = 16000000;

    /* JADX INFO: renamed from: Y1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Cea608Decoder.java */
    public static final class C0104a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f7504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f7505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final StringBuilder f7506c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f7507d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7508e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f7509f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f7510g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f7511h;

        /* JADX INFO: renamed from: Y1.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Cea608Decoder.java */
        public static class C0105a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f7512a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f7513b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f7514c;

            public C0105a(int i10, int i11, boolean z10) {
                this.f7512a = i10;
                this.f7513b = z10;
                this.f7514c = i11;
            }
        }

        public C0104a(int i10, int i11) {
            ArrayList arrayList = new ArrayList();
            this.f7504a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f7505b = arrayList2;
            StringBuilder sb2 = new StringBuilder();
            this.f7506c = sb2;
            this.f7510g = i10;
            arrayList.clear();
            arrayList2.clear();
            sb2.setLength(0);
            this.f7507d = 15;
            this.f7508e = 0;
            this.f7509f = 0;
            this.f7511h = i11;
        }

        public final void a(char c10) {
            StringBuilder sb2 = this.f7506c;
            if (sb2.length() < 32) {
                sb2.append(c10);
            }
        }

        public final void b() {
            StringBuilder sb2 = this.f7506c;
            int length = sb2.length();
            if (length > 0) {
                sb2.delete(length - 1, length);
                ArrayList arrayList = this.f7504a;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C0105a c0105a = (C0105a) arrayList.get(size);
                    int i10 = c0105a.f7514c;
                    if (i10 != length) {
                        return;
                    }
                    c0105a.f7514c = i10 - 1;
                }
            }
        }

        public final p102i1.a c(int i10) {
            float f10;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.f7505b;
                if (i11 >= arrayList.size()) {
                    break;
                }
                spannableStringBuilder.append((CharSequence) arrayList.get(i11));
                spannableStringBuilder.append('\n');
                i11++;
            }
            spannableStringBuilder.append((CharSequence) d());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i12 = this.f7508e + this.f7509f;
            int length = (32 - i12) - spannableStringBuilder.length();
            int i13 = i12 - length;
            if (i10 == Integer.MIN_VALUE) {
                if (this.f7510g != 2 || (Math.abs(i13) >= 3 && length >= 0)) {
                    i10 = (this.f7510g != 2 || i13 <= 0) ? 0 : 2;
                } else {
                    i10 = 1;
                }
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i12 = 32 - length;
                }
                f10 = ((i12 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i14 = this.f7507d;
            if (i14 > 7) {
                i14 -= 17;
            } else if (this.f7510g == 1) {
                i14 -= this.f7511h - 1;
            }
            p102i1.a.C0382a c0382a = new p102i1.a.C0382a();
            c0382a.f36527a = spannableStringBuilder;
            c0382a.f36529c = Layout.Alignment.ALIGN_NORMAL;
            c0382a.f36531e = i14;
            c0382a.f36532f = 1;
            c0382a.f36534h = f10;
            c0382a.f36535i = i10;
            return c0382a.a();
        }

        public final SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f7506c);
            int length = spannableStringBuilder.length();
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            int i15 = 0;
            boolean z10 = false;
            while (true) {
                ArrayList arrayList = this.f7504a;
                if (i14 >= arrayList.size()) {
                    break;
                }
                C0105a c0105a = (C0105a) arrayList.get(i14);
                boolean z11 = c0105a.f7513b;
                int i16 = c0105a.f7512a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i13 = a.f7480B[i16];
                    }
                    z10 = z12;
                }
                int i17 = c0105a.f7514c;
                i14++;
                if (i17 != (i14 < arrayList.size() ? ((C0105a) arrayList.get(i14)).f7514c : length)) {
                    if (i10 != -1 && !z11) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i17, 33);
                        i10 = -1;
                    } else if (i10 == -1 && z11) {
                        i10 = i17;
                    }
                    if (i11 != -1 && !z10) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i11, i17, 33);
                        i11 = -1;
                    } else if (i11 == -1 && z10) {
                        i11 = i17;
                    }
                    if (i13 != i12) {
                        if (i12 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i15, i17, 33);
                        }
                        i12 = i13;
                        i15 = i17;
                    }
                }
            }
            if (i10 != -1 && i10 != length) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
            }
            if (i11 != -1 && i11 != length) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i11, length, 33);
            }
            if (i15 != length && i12 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i15, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final boolean e() {
            return this.f7504a.isEmpty() && this.f7505b.isEmpty() && this.f7506c.length() == 0;
        }
    }

    public a(String str, int i10) {
        this.f7488i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f7489k = 0;
            this.j = 0;
        } else if (i10 == 2) {
            this.f7489k = 1;
            this.j = 0;
        } else if (i10 == 3) {
            this.f7489k = 0;
            this.j = 1;
        } else if (i10 != 4) {
            k.f("Invalid channel. Defaulting to CC1.");
            this.f7489k = 0;
            this.j = 0;
        } else {
            this.f7489k = 1;
            this.j = 1;
        }
        n(0);
        m();
        this.f7502x = true;
        this.f7503y = -9223372036854775807L;
    }

    @Override // Y1.e, p152m1.c
    public final void flush() {
        super.flush();
        this.f7493o = null;
        this.f7494p = null;
        n(0);
        this.f7496r = 4;
        this.f7492n.f7511h = 4;
        m();
        this.f7497s = false;
        this.f7498t = false;
        this.f7499u = (byte) 0;
        this.f7500v = (byte) 0;
        this.f7501w = 0;
        this.f7502x = true;
        this.f7503y = -9223372036854775807L;
    }

    @Override // Y1.e
    public final v0 h() {
        List<p102i1.a> list = this.f7493o;
        this.f7494p = list;
        list.getClass();
        return new v0(list);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x019a  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:134:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01da  */
    /* JADX WARN: Code duplicated, block: B:143:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:148:0x0207 A[LOOP:1: B:146:0x0201->B:148:0x0207, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x020b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0215 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0217  */
    /* JADX WARN: Code duplicated, block: B:153:0x021c  */
    /* JADX WARN: Code duplicated, block: B:154:0x0223  */
    /* JADX WARN: Code duplicated, block: B:155:0x022e  */
    /* JADX WARN: Code duplicated, block: B:156:0x0239  */
    /* JADX WARN: Code duplicated, block: B:157:0x0244  */
    /* JADX WARN: Code duplicated, block: B:158:0x0249  */
    /* JADX WARN: Code duplicated, block: B:159:0x024e  */
    /* JADX WARN: Code duplicated, block: B:161:0x025f  */
    /* JADX WARN: Code duplicated, block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x012a  */
    /* JADX WARN: Code duplicated, block: B:93:0x012e  */
    @Override // Y1.e
    public final void i(e.a aVar) {
        boolean z10;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        int i14;
        ArrayList arrayList;
        int iMin;
        ByteBuffer byteBuffer = aVar.f17941e;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        r rVar = this.f7487h;
        rVar.E(iLimit, bArrArray);
        boolean z11 = false;
        while (true) {
            int iA = rVar.a();
            int i15 = this.f7488i;
            if (iA < i15) {
                if (z11) {
                    int i16 = this.f7495q;
                    if (i16 == 1 || i16 == 3) {
                        this.f7493o = l();
                        this.f7503y = this.f7568e;
                        return;
                    }
                    return;
                }
                return;
            }
            int iU = i15 == 2 ? -4 : rVar.u();
            int iU2 = rVar.u();
            int iU3 = rVar.u();
            if ((iU & 2) == 0 && (iU & 1) == this.j) {
                byte b10 = (byte) (iU2 & 127);
                byte b11 = (byte) (iU3 & 127);
                if (b10 != 0 || b11 != 0) {
                    boolean z12 = this.f7497s;
                    if ((iU & 4) == 4) {
                        boolean[] zArr = f7485G;
                        if (zArr[iU2] && zArr[iU3]) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    this.f7497s = z10;
                    if (!z10 || (b10 & 240) != 16) {
                        this.f7498t = false;
                        if (!z10) {
                            if (1 > b10 && b10 <= 15) {
                                this.f7502x = false;
                            } else if ((b10 & 246) == 20) {
                                if (b11 == 32 && b11 != 47) {
                                    switch (b11) {
                                        default:
                                            switch (b11) {
                                                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                                                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                                                    this.f7502x = false;
                                                    break;
                                            }
                                        case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                        case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                        case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                            this.f7502x = true;
                                            break;
                                    }
                                } else {
                                    this.f7502x = true;
                                }
                            }
                            if (this.f7502x) {
                                i10 = b10 & 224;
                                if (i10 == 0) {
                                    this.f7501w = (b10 >> 3) & 1;
                                }
                                if (this.f7501w != this.f7489k) {
                                    if (i10 == 0) {
                                        i11 = b10 & 247;
                                        if (i11 == 17 || (b11 & 240) != 48) {
                                            i12 = b10 & 246;
                                            if (i12 != 18 && (b11 & 224) == 32) {
                                                this.f7492n.b();
                                                this.f7492n.a((char) ((b10 & 1) == 0 ? f7483E[b11 & 31] : f7484F[b11 & 31]));
                                            } else if (i11 != 17 && (b11 & 240) == 32) {
                                                this.f7492n.a(' ');
                                                boolean z13 = (b11 & 1) == 1;
                                                C0104a c0104a = this.f7492n;
                                                c0104a.f7504a.add(new C0104a.C0105a((b11 >> 1) & 7, c0104a.f7506c.length(), z13));
                                            } else if ((b10 & 240) != 16 && (b11 & 192) == 64) {
                                                int i17 = f7486z[b10 & 7];
                                                if ((b11 & 32) != 0) {
                                                    i17++;
                                                }
                                                C0104a c0104a2 = this.f7492n;
                                                if (i17 != c0104a2.f7507d) {
                                                    if (this.f7495q != 1 && !c0104a2.e()) {
                                                        C0104a c0104a3 = new C0104a(this.f7495q, this.f7496r);
                                                        this.f7492n = c0104a3;
                                                        this.f7491m.add(c0104a3);
                                                    }
                                                    this.f7492n.f7507d = i17;
                                                }
                                                boolean z14 = (b11 & 16) == 16;
                                                boolean z15 = (b11 & 1) == 1;
                                                int i18 = (b11 >> 1) & 7;
                                                C0104a c0104a4 = this.f7492n;
                                                c0104a4.f7504a.add(new C0104a.C0105a(z14 ? 8 : i18, c0104a4.f7506c.length(), z15));
                                                if (z14) {
                                                    this.f7492n.f7508e = f7479A[i18];
                                                }
                                            } else if (i11 != 23 && b11 >= 33 && b11 <= 35) {
                                                this.f7492n.f7509f = b11 - 32;
                                            } else if (i12 == 20 && (b11 & 240) == 32) {
                                                if (b11 == 32) {
                                                    n(2);
                                                } else if (b11 != 41) {
                                                    switch (b11) {
                                                        case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                            n(1);
                                                            this.f7496r = 2;
                                                            this.f7492n.f7511h = 2;
                                                            break;
                                                        case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                            n(1);
                                                            this.f7496r = 3;
                                                            this.f7492n.f7511h = 3;
                                                            break;
                                                        case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                            n(1);
                                                            this.f7496r = 4;
                                                            this.f7492n.f7511h = 4;
                                                            break;
                                                        default:
                                                            i13 = this.f7495q;
                                                            if (i13 != 0) {
                                                                if (b11 != 33) {
                                                                    switch (b11) {
                                                                        case 44:
                                                                            this.f7493o = Collections.emptyList();
                                                                            i14 = this.f7495q;
                                                                            if (i14 != 1 || i14 == 3) {
                                                                                m();
                                                                            }
                                                                            break;
                                                                        case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                            if (i13 == 1 && !this.f7492n.e()) {
                                                                                C0104a c0104a5 = this.f7492n;
                                                                                arrayList = c0104a5.f7505b;
                                                                                arrayList.add(c0104a5.d());
                                                                                c0104a5.f7506c.setLength(0);
                                                                                c0104a5.f7504a.clear();
                                                                                iMin = Math.min(c0104a5.f7511h, c0104a5.f7507d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                            m();
                                                                            break;
                                                                        case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                            this.f7493o = l();
                                                                            m();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f7492n.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    n(3);
                                                }
                                            }
                                        } else {
                                            this.f7492n.a((char) f7482D[b11 & 15]);
                                        }
                                    } else {
                                        C0104a c0104a6 = this.f7492n;
                                        iArr = f7481C;
                                        c0104a6.a((char) iArr[(b10 & 127) - 32]);
                                        if ((b11 & 224) != 0) {
                                            this.f7492n.a((char) iArr[(b11 & 127) - 32]);
                                        }
                                    }
                                    z11 = true;
                                }
                            }
                        } else if (z12) {
                            m();
                            z11 = true;
                        }
                    } else if (this.f7498t && this.f7499u == b10 && this.f7500v == b11) {
                        this.f7498t = false;
                    } else {
                        this.f7498t = true;
                        this.f7499u = b10;
                        this.f7500v = b11;
                        if (!z10) {
                            if (1 > b10) {
                                if ((b10 & 246) == 20) {
                                    if (b11 == 32) {
                                        this.f7502x = true;
                                    } else {
                                        this.f7502x = true;
                                    }
                                }
                            } else if ((b10 & 246) == 20) {
                                if (b11 == 32) {
                                    this.f7502x = true;
                                } else {
                                    this.f7502x = true;
                                }
                            }
                            if (this.f7502x) {
                                i10 = b10 & 224;
                                if (i10 == 0) {
                                    this.f7501w = (b10 >> 3) & 1;
                                }
                                if (this.f7501w != this.f7489k) {
                                    if (i10 == 0) {
                                        i11 = b10 & 247;
                                        if (i11 == 17) {
                                            i12 = b10 & 246;
                                            if (i12 != 18) {
                                                if (i11 != 17) {
                                                    if ((b10 & 240) != 16) {
                                                        if (i11 != 23) {
                                                            if (i12 == 20) {
                                                                if (b11 == 32) {
                                                                    n(2);
                                                                } else if (b11 != 41) {
                                                                    switch (b11) {
                                                                        case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                            n(1);
                                                                            this.f7496r = 2;
                                                                            this.f7492n.f7511h = 2;
                                                                            break;
                                                                        case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                            n(1);
                                                                            this.f7496r = 3;
                                                                            this.f7492n.f7511h = 3;
                                                                            break;
                                                                        case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                            n(1);
                                                                            this.f7496r = 4;
                                                                            this.f7492n.f7511h = 4;
                                                                            break;
                                                                        default:
                                                                            i13 = this.f7495q;
                                                                            if (i13 != 0) {
                                                                                if (b11 != 33) {
                                                                                    switch (b11) {
                                                                                        case 44:
                                                                                            this.f7493o = Collections.emptyList();
                                                                                            i14 = this.f7495q;
                                                                                            if (i14 != 1) {
                                                                                                m();
                                                                                            } else {
                                                                                                m();
                                                                                            }
                                                                                            break;
                                                                                        case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                            if (i13 == 1) {
                                                                                                C0104a c0104a7 = this.f7492n;
                                                                                                arrayList = c0104a7.f7505b;
                                                                                                arrayList.add(c0104a7.d());
                                                                                                c0104a7.f7506c.setLength(0);
                                                                                                c0104a7.f7504a.clear();
                                                                                                iMin = Math.min(c0104a7.f7511h, c0104a7.f7507d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                            m();
                                                                                            break;
                                                                                        case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                            this.f7493o = l();
                                                                                            m();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f7492n.b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    n(3);
                                                                }
                                                            }
                                                        } else if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                n(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                        n(1);
                                                                        this.f7496r = 2;
                                                                        this.f7492n.f7511h = 2;
                                                                        break;
                                                                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                        n(1);
                                                                        this.f7496r = 3;
                                                                        this.f7492n.f7511h = 3;
                                                                        break;
                                                                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                        n(1);
                                                                        this.f7496r = 4;
                                                                        this.f7492n.f7511h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f7495q;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f7493o = Collections.emptyList();
                                                                                        i14 = this.f7495q;
                                                                                        if (i14 != 1) {
                                                                                            m();
                                                                                        } else {
                                                                                            m();
                                                                                        }
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                        if (i13 == 1) {
                                                                                            C0104a c0104a8 = this.f7492n;
                                                                                            arrayList = c0104a8.f7505b;
                                                                                            arrayList.add(c0104a8.d());
                                                                                            c0104a8.f7506c.setLength(0);
                                                                                            c0104a8.f7504a.clear();
                                                                                            iMin = Math.min(c0104a8.f7511h, c0104a8.f7507d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                        m();
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                        this.f7493o = l();
                                                                                        m();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f7492n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                n(3);
                                                            }
                                                        }
                                                    } else if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                n(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                        n(1);
                                                                        this.f7496r = 2;
                                                                        this.f7492n.f7511h = 2;
                                                                        break;
                                                                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                        n(1);
                                                                        this.f7496r = 3;
                                                                        this.f7492n.f7511h = 3;
                                                                        break;
                                                                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                        n(1);
                                                                        this.f7496r = 4;
                                                                        this.f7492n.f7511h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f7495q;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f7493o = Collections.emptyList();
                                                                                        i14 = this.f7495q;
                                                                                        if (i14 != 1) {
                                                                                            m();
                                                                                        } else {
                                                                                            m();
                                                                                        }
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                        if (i13 == 1) {
                                                                                            C0104a c0104a9 = this.f7492n;
                                                                                            arrayList = c0104a9.f7505b;
                                                                                            arrayList.add(c0104a9.d());
                                                                                            c0104a9.f7506c.setLength(0);
                                                                                            c0104a9.f7504a.clear();
                                                                                            iMin = Math.min(c0104a9.f7511h, c0104a9.f7507d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                        m();
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                        this.f7493o = l();
                                                                                        m();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f7492n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                n(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            n(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                    n(1);
                                                                    this.f7496r = 2;
                                                                    this.f7492n.f7511h = 2;
                                                                    break;
                                                                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                    n(1);
                                                                    this.f7496r = 3;
                                                                    this.f7492n.f7511h = 3;
                                                                    break;
                                                                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                    n(1);
                                                                    this.f7496r = 4;
                                                                    this.f7492n.f7511h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f7495q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f7493o = Collections.emptyList();
                                                                                    i14 = this.f7495q;
                                                                                    if (i14 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                    if (i13 == 1) {
                                                                                        C0104a c0104a10 = this.f7492n;
                                                                                        arrayList = c0104a10.f7505b;
                                                                                        arrayList.add(c0104a10.d());
                                                                                        c0104a10.f7506c.setLength(0);
                                                                                        c0104a10.f7504a.clear();
                                                                                        iMin = Math.min(c0104a10.f7511h, c0104a10.f7507d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                    this.f7493o = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f7492n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if ((b10 & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                n(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                        n(1);
                                                                        this.f7496r = 2;
                                                                        this.f7492n.f7511h = 2;
                                                                        break;
                                                                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                        n(1);
                                                                        this.f7496r = 3;
                                                                        this.f7492n.f7511h = 3;
                                                                        break;
                                                                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                        n(1);
                                                                        this.f7496r = 4;
                                                                        this.f7492n.f7511h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f7495q;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f7493o = Collections.emptyList();
                                                                                        i14 = this.f7495q;
                                                                                        if (i14 != 1) {
                                                                                            m();
                                                                                        } else {
                                                                                            m();
                                                                                        }
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                        if (i13 == 1) {
                                                                                            C0104a c0104a11 = this.f7492n;
                                                                                            arrayList = c0104a11.f7505b;
                                                                                            arrayList.add(c0104a11.d());
                                                                                            c0104a11.f7506c.setLength(0);
                                                                                            c0104a11.f7504a.clear();
                                                                                            iMin = Math.min(c0104a11.f7511h, c0104a11.f7507d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                        m();
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                        this.f7493o = l();
                                                                                        m();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f7492n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                n(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            n(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                    n(1);
                                                                    this.f7496r = 2;
                                                                    this.f7492n.f7511h = 2;
                                                                    break;
                                                                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                    n(1);
                                                                    this.f7496r = 3;
                                                                    this.f7492n.f7511h = 3;
                                                                    break;
                                                                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                    n(1);
                                                                    this.f7496r = 4;
                                                                    this.f7492n.f7511h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f7495q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f7493o = Collections.emptyList();
                                                                                    i14 = this.f7495q;
                                                                                    if (i14 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                    if (i13 == 1) {
                                                                                        C0104a c0104a12 = this.f7492n;
                                                                                        arrayList = c0104a12.f7505b;
                                                                                        arrayList.add(c0104a12.d());
                                                                                        c0104a12.f7506c.setLength(0);
                                                                                        c0104a12.f7504a.clear();
                                                                                        iMin = Math.min(c0104a12.f7511h, c0104a12.f7507d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                    this.f7493o = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f7492n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            n(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                    n(1);
                                                                    this.f7496r = 2;
                                                                    this.f7492n.f7511h = 2;
                                                                    break;
                                                                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                    n(1);
                                                                    this.f7496r = 3;
                                                                    this.f7492n.f7511h = 3;
                                                                    break;
                                                                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                    n(1);
                                                                    this.f7496r = 4;
                                                                    this.f7492n.f7511h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f7495q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f7493o = Collections.emptyList();
                                                                                    i14 = this.f7495q;
                                                                                    if (i14 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                    if (i13 == 1) {
                                                                                        C0104a c0104a13 = this.f7492n;
                                                                                        arrayList = c0104a13.f7505b;
                                                                                        arrayList.add(c0104a13.d());
                                                                                        c0104a13.f7506c.setLength(0);
                                                                                        c0104a13.f7504a.clear();
                                                                                        iMin = Math.min(c0104a13.f7511h, c0104a13.f7507d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                    this.f7493o = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f7492n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        n(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                n(1);
                                                                this.f7496r = 2;
                                                                this.f7492n.f7511h = 2;
                                                                break;
                                                            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                n(1);
                                                                this.f7496r = 3;
                                                                this.f7492n.f7511h = 3;
                                                                break;
                                                            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                n(1);
                                                                this.f7496r = 4;
                                                                this.f7492n.f7511h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f7495q;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f7493o = Collections.emptyList();
                                                                                i14 = this.f7495q;
                                                                                if (i14 != 1) {
                                                                                    m();
                                                                                } else {
                                                                                    m();
                                                                                }
                                                                                break;
                                                                            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                if (i13 == 1) {
                                                                                    C0104a c0104a14 = this.f7492n;
                                                                                    arrayList = c0104a14.f7505b;
                                                                                    arrayList.add(c0104a14.d());
                                                                                    c0104a14.f7506c.setLength(0);
                                                                                    c0104a14.f7504a.clear();
                                                                                    iMin = Math.min(c0104a14.f7511h, c0104a14.f7507d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                m();
                                                                                break;
                                                                            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                this.f7493o = l();
                                                                                m();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f7492n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        n(3);
                                                    }
                                                }
                                            } else if (i11 != 17) {
                                                if ((b10 & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                n(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                        n(1);
                                                                        this.f7496r = 2;
                                                                        this.f7492n.f7511h = 2;
                                                                        break;
                                                                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                        n(1);
                                                                        this.f7496r = 3;
                                                                        this.f7492n.f7511h = 3;
                                                                        break;
                                                                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                        n(1);
                                                                        this.f7496r = 4;
                                                                        this.f7492n.f7511h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f7495q;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f7493o = Collections.emptyList();
                                                                                        i14 = this.f7495q;
                                                                                        if (i14 != 1) {
                                                                                            m();
                                                                                        } else {
                                                                                            m();
                                                                                        }
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                        if (i13 == 1) {
                                                                                            C0104a c0104a15 = this.f7492n;
                                                                                            arrayList = c0104a15.f7505b;
                                                                                            arrayList.add(c0104a15.d());
                                                                                            c0104a15.f7506c.setLength(0);
                                                                                            c0104a15.f7504a.clear();
                                                                                            iMin = Math.min(c0104a15.f7511h, c0104a15.f7507d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                        m();
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                        this.f7493o = l();
                                                                                        m();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f7492n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                n(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            n(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                    n(1);
                                                                    this.f7496r = 2;
                                                                    this.f7492n.f7511h = 2;
                                                                    break;
                                                                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                    n(1);
                                                                    this.f7496r = 3;
                                                                    this.f7492n.f7511h = 3;
                                                                    break;
                                                                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                    n(1);
                                                                    this.f7496r = 4;
                                                                    this.f7492n.f7511h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f7495q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f7493o = Collections.emptyList();
                                                                                    i14 = this.f7495q;
                                                                                    if (i14 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                    if (i13 == 1) {
                                                                                        C0104a c0104a16 = this.f7492n;
                                                                                        arrayList = c0104a16.f7505b;
                                                                                        arrayList.add(c0104a16.d());
                                                                                        c0104a16.f7506c.setLength(0);
                                                                                        c0104a16.f7504a.clear();
                                                                                        iMin = Math.min(c0104a16.f7511h, c0104a16.f7507d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                    this.f7493o = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f7492n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            n(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                    n(1);
                                                                    this.f7496r = 2;
                                                                    this.f7492n.f7511h = 2;
                                                                    break;
                                                                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                    n(1);
                                                                    this.f7496r = 3;
                                                                    this.f7492n.f7511h = 3;
                                                                    break;
                                                                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                    n(1);
                                                                    this.f7496r = 4;
                                                                    this.f7492n.f7511h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f7495q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f7493o = Collections.emptyList();
                                                                                    i14 = this.f7495q;
                                                                                    if (i14 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                    if (i13 == 1) {
                                                                                        C0104a c0104a17 = this.f7492n;
                                                                                        arrayList = c0104a17.f7505b;
                                                                                        arrayList.add(c0104a17.d());
                                                                                        c0104a17.f7506c.setLength(0);
                                                                                        c0104a17.f7504a.clear();
                                                                                        iMin = Math.min(c0104a17.f7511h, c0104a17.f7507d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                    this.f7493o = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f7492n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        n(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                n(1);
                                                                this.f7496r = 2;
                                                                this.f7492n.f7511h = 2;
                                                                break;
                                                            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                n(1);
                                                                this.f7496r = 3;
                                                                this.f7492n.f7511h = 3;
                                                                break;
                                                            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                n(1);
                                                                this.f7496r = 4;
                                                                this.f7492n.f7511h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f7495q;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f7493o = Collections.emptyList();
                                                                                i14 = this.f7495q;
                                                                                if (i14 != 1) {
                                                                                    m();
                                                                                } else {
                                                                                    m();
                                                                                }
                                                                                break;
                                                                            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                if (i13 == 1) {
                                                                                    C0104a c0104a18 = this.f7492n;
                                                                                    arrayList = c0104a18.f7505b;
                                                                                    arrayList.add(c0104a18.d());
                                                                                    c0104a18.f7506c.setLength(0);
                                                                                    c0104a18.f7504a.clear();
                                                                                    iMin = Math.min(c0104a18.f7511h, c0104a18.f7507d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                m();
                                                                                break;
                                                                            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                this.f7493o = l();
                                                                                m();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f7492n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        n(3);
                                                    }
                                                }
                                            } else if ((b10 & 240) != 16) {
                                                if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            n(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                    n(1);
                                                                    this.f7496r = 2;
                                                                    this.f7492n.f7511h = 2;
                                                                    break;
                                                                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                    n(1);
                                                                    this.f7496r = 3;
                                                                    this.f7492n.f7511h = 3;
                                                                    break;
                                                                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                    n(1);
                                                                    this.f7496r = 4;
                                                                    this.f7492n.f7511h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f7495q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f7493o = Collections.emptyList();
                                                                                    i14 = this.f7495q;
                                                                                    if (i14 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                    if (i13 == 1) {
                                                                                        C0104a c0104a19 = this.f7492n;
                                                                                        arrayList = c0104a19.f7505b;
                                                                                        arrayList.add(c0104a19.d());
                                                                                        c0104a19.f7506c.setLength(0);
                                                                                        c0104a19.f7504a.clear();
                                                                                        iMin = Math.min(c0104a19.f7511h, c0104a19.f7507d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                    this.f7493o = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f7492n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        n(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                n(1);
                                                                this.f7496r = 2;
                                                                this.f7492n.f7511h = 2;
                                                                break;
                                                            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                n(1);
                                                                this.f7496r = 3;
                                                                this.f7492n.f7511h = 3;
                                                                break;
                                                            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                n(1);
                                                                this.f7496r = 4;
                                                                this.f7492n.f7511h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f7495q;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f7493o = Collections.emptyList();
                                                                                i14 = this.f7495q;
                                                                                if (i14 != 1) {
                                                                                    m();
                                                                                } else {
                                                                                    m();
                                                                                }
                                                                                break;
                                                                            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                if (i13 == 1) {
                                                                                    C0104a c0104a110 = this.f7492n;
                                                                                    arrayList = c0104a110.f7505b;
                                                                                    arrayList.add(c0104a110.d());
                                                                                    c0104a110.f7506c.setLength(0);
                                                                                    c0104a110.f7504a.clear();
                                                                                    iMin = Math.min(c0104a110.f7511h, c0104a110.f7507d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                m();
                                                                                break;
                                                                            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                this.f7493o = l();
                                                                                m();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f7492n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        n(3);
                                                    }
                                                }
                                            } else if (i11 != 23) {
                                                if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        n(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                n(1);
                                                                this.f7496r = 2;
                                                                this.f7492n.f7511h = 2;
                                                                break;
                                                            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                n(1);
                                                                this.f7496r = 3;
                                                                this.f7492n.f7511h = 3;
                                                                break;
                                                            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                n(1);
                                                                this.f7496r = 4;
                                                                this.f7492n.f7511h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f7495q;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f7493o = Collections.emptyList();
                                                                                i14 = this.f7495q;
                                                                                if (i14 != 1) {
                                                                                    m();
                                                                                } else {
                                                                                    m();
                                                                                }
                                                                                break;
                                                                            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                if (i13 == 1) {
                                                                                    C0104a c0104a111 = this.f7492n;
                                                                                    arrayList = c0104a111.f7505b;
                                                                                    arrayList.add(c0104a111.d());
                                                                                    c0104a111.f7506c.setLength(0);
                                                                                    c0104a111.f7504a.clear();
                                                                                    iMin = Math.min(c0104a111.f7511h, c0104a111.f7507d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                m();
                                                                                break;
                                                                            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                this.f7493o = l();
                                                                                m();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f7492n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        n(3);
                                                    }
                                                }
                                            } else if (i12 == 20) {
                                                if (b11 == 32) {
                                                    n(2);
                                                } else if (b11 != 41) {
                                                    switch (b11) {
                                                        case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                            n(1);
                                                            this.f7496r = 2;
                                                            this.f7492n.f7511h = 2;
                                                            break;
                                                        case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                            n(1);
                                                            this.f7496r = 3;
                                                            this.f7492n.f7511h = 3;
                                                            break;
                                                        case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                            n(1);
                                                            this.f7496r = 4;
                                                            this.f7492n.f7511h = 4;
                                                            break;
                                                        default:
                                                            i13 = this.f7495q;
                                                            if (i13 != 0) {
                                                                if (b11 != 33) {
                                                                    switch (b11) {
                                                                        case 44:
                                                                            this.f7493o = Collections.emptyList();
                                                                            i14 = this.f7495q;
                                                                            if (i14 != 1) {
                                                                                m();
                                                                            } else {
                                                                                m();
                                                                            }
                                                                            break;
                                                                        case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                            if (i13 == 1) {
                                                                                C0104a c0104a112 = this.f7492n;
                                                                                arrayList = c0104a112.f7505b;
                                                                                arrayList.add(c0104a112.d());
                                                                                c0104a112.f7506c.setLength(0);
                                                                                c0104a112.f7504a.clear();
                                                                                iMin = Math.min(c0104a112.f7511h, c0104a112.f7507d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                            m();
                                                                            break;
                                                                        case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                            this.f7493o = l();
                                                                            m();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f7492n.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    n(3);
                                                }
                                            }
                                        } else {
                                            i12 = b10 & 246;
                                            if (i12 != 18) {
                                                if (i11 != 17) {
                                                    if ((b10 & 240) != 16) {
                                                        if (i11 != 23) {
                                                            if (i12 == 20) {
                                                                if (b11 == 32) {
                                                                    n(2);
                                                                } else if (b11 != 41) {
                                                                    switch (b11) {
                                                                        case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                            n(1);
                                                                            this.f7496r = 2;
                                                                            this.f7492n.f7511h = 2;
                                                                            break;
                                                                        case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                            n(1);
                                                                            this.f7496r = 3;
                                                                            this.f7492n.f7511h = 3;
                                                                            break;
                                                                        case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                            n(1);
                                                                            this.f7496r = 4;
                                                                            this.f7492n.f7511h = 4;
                                                                            break;
                                                                        default:
                                                                            i13 = this.f7495q;
                                                                            if (i13 != 0) {
                                                                                if (b11 != 33) {
                                                                                    switch (b11) {
                                                                                        case 44:
                                                                                            this.f7493o = Collections.emptyList();
                                                                                            i14 = this.f7495q;
                                                                                            if (i14 != 1) {
                                                                                                m();
                                                                                            } else {
                                                                                                m();
                                                                                            }
                                                                                            break;
                                                                                        case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                            if (i13 == 1) {
                                                                                                C0104a c0104a113 = this.f7492n;
                                                                                                arrayList = c0104a113.f7505b;
                                                                                                arrayList.add(c0104a113.d());
                                                                                                c0104a113.f7506c.setLength(0);
                                                                                                c0104a113.f7504a.clear();
                                                                                                iMin = Math.min(c0104a113.f7511h, c0104a113.f7507d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                            m();
                                                                                            break;
                                                                                        case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                            this.f7493o = l();
                                                                                            m();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f7492n.b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    n(3);
                                                                }
                                                            }
                                                        } else if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                n(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                        n(1);
                                                                        this.f7496r = 2;
                                                                        this.f7492n.f7511h = 2;
                                                                        break;
                                                                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                        n(1);
                                                                        this.f7496r = 3;
                                                                        this.f7492n.f7511h = 3;
                                                                        break;
                                                                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                        n(1);
                                                                        this.f7496r = 4;
                                                                        this.f7492n.f7511h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f7495q;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f7493o = Collections.emptyList();
                                                                                        i14 = this.f7495q;
                                                                                        if (i14 != 1) {
                                                                                            m();
                                                                                        } else {
                                                                                            m();
                                                                                        }
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                        if (i13 == 1) {
                                                                                            C0104a c0104a114 = this.f7492n;
                                                                                            arrayList = c0104a114.f7505b;
                                                                                            arrayList.add(c0104a114.d());
                                                                                            c0104a114.f7506c.setLength(0);
                                                                                            c0104a114.f7504a.clear();
                                                                                            iMin = Math.min(c0104a114.f7511h, c0104a114.f7507d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                        m();
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                        this.f7493o = l();
                                                                                        m();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f7492n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                n(3);
                                                            }
                                                        }
                                                    } else if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                n(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                        n(1);
                                                                        this.f7496r = 2;
                                                                        this.f7492n.f7511h = 2;
                                                                        break;
                                                                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                        n(1);
                                                                        this.f7496r = 3;
                                                                        this.f7492n.f7511h = 3;
                                                                        break;
                                                                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                        n(1);
                                                                        this.f7496r = 4;
                                                                        this.f7492n.f7511h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f7495q;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f7493o = Collections.emptyList();
                                                                                        i14 = this.f7495q;
                                                                                        if (i14 != 1) {
                                                                                            m();
                                                                                        } else {
                                                                                            m();
                                                                                        }
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                        if (i13 == 1) {
                                                                                            C0104a c0104a115 = this.f7492n;
                                                                                            arrayList = c0104a115.f7505b;
                                                                                            arrayList.add(c0104a115.d());
                                                                                            c0104a115.f7506c.setLength(0);
                                                                                            c0104a115.f7504a.clear();
                                                                                            iMin = Math.min(c0104a115.f7511h, c0104a115.f7507d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                        m();
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                        this.f7493o = l();
                                                                                        m();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f7492n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                n(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            n(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                    n(1);
                                                                    this.f7496r = 2;
                                                                    this.f7492n.f7511h = 2;
                                                                    break;
                                                                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                    n(1);
                                                                    this.f7496r = 3;
                                                                    this.f7492n.f7511h = 3;
                                                                    break;
                                                                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                    n(1);
                                                                    this.f7496r = 4;
                                                                    this.f7492n.f7511h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f7495q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f7493o = Collections.emptyList();
                                                                                    i14 = this.f7495q;
                                                                                    if (i14 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                    if (i13 == 1) {
                                                                                        C0104a c0104a116 = this.f7492n;
                                                                                        arrayList = c0104a116.f7505b;
                                                                                        arrayList.add(c0104a116.d());
                                                                                        c0104a116.f7506c.setLength(0);
                                                                                        c0104a116.f7504a.clear();
                                                                                        iMin = Math.min(c0104a116.f7511h, c0104a116.f7507d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                    this.f7493o = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f7492n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if ((b10 & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                n(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                        n(1);
                                                                        this.f7496r = 2;
                                                                        this.f7492n.f7511h = 2;
                                                                        break;
                                                                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                        n(1);
                                                                        this.f7496r = 3;
                                                                        this.f7492n.f7511h = 3;
                                                                        break;
                                                                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                        n(1);
                                                                        this.f7496r = 4;
                                                                        this.f7492n.f7511h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f7495q;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f7493o = Collections.emptyList();
                                                                                        i14 = this.f7495q;
                                                                                        if (i14 != 1) {
                                                                                            m();
                                                                                        } else {
                                                                                            m();
                                                                                        }
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                        if (i13 == 1) {
                                                                                            C0104a c0104a117 = this.f7492n;
                                                                                            arrayList = c0104a117.f7505b;
                                                                                            arrayList.add(c0104a117.d());
                                                                                            c0104a117.f7506c.setLength(0);
                                                                                            c0104a117.f7504a.clear();
                                                                                            iMin = Math.min(c0104a117.f7511h, c0104a117.f7507d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                        m();
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                        this.f7493o = l();
                                                                                        m();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f7492n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                n(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            n(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                    n(1);
                                                                    this.f7496r = 2;
                                                                    this.f7492n.f7511h = 2;
                                                                    break;
                                                                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                    n(1);
                                                                    this.f7496r = 3;
                                                                    this.f7492n.f7511h = 3;
                                                                    break;
                                                                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                    n(1);
                                                                    this.f7496r = 4;
                                                                    this.f7492n.f7511h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f7495q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f7493o = Collections.emptyList();
                                                                                    i14 = this.f7495q;
                                                                                    if (i14 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                    if (i13 == 1) {
                                                                                        C0104a c0104a118 = this.f7492n;
                                                                                        arrayList = c0104a118.f7505b;
                                                                                        arrayList.add(c0104a118.d());
                                                                                        c0104a118.f7506c.setLength(0);
                                                                                        c0104a118.f7504a.clear();
                                                                                        iMin = Math.min(c0104a118.f7511h, c0104a118.f7507d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                    this.f7493o = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f7492n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            n(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                    n(1);
                                                                    this.f7496r = 2;
                                                                    this.f7492n.f7511h = 2;
                                                                    break;
                                                                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                    n(1);
                                                                    this.f7496r = 3;
                                                                    this.f7492n.f7511h = 3;
                                                                    break;
                                                                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                    n(1);
                                                                    this.f7496r = 4;
                                                                    this.f7492n.f7511h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f7495q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f7493o = Collections.emptyList();
                                                                                    i14 = this.f7495q;
                                                                                    if (i14 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                    if (i13 == 1) {
                                                                                        C0104a c0104a119 = this.f7492n;
                                                                                        arrayList = c0104a119.f7505b;
                                                                                        arrayList.add(c0104a119.d());
                                                                                        c0104a119.f7506c.setLength(0);
                                                                                        c0104a119.f7504a.clear();
                                                                                        iMin = Math.min(c0104a119.f7511h, c0104a119.f7507d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                    this.f7493o = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f7492n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        n(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                n(1);
                                                                this.f7496r = 2;
                                                                this.f7492n.f7511h = 2;
                                                                break;
                                                            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                n(1);
                                                                this.f7496r = 3;
                                                                this.f7492n.f7511h = 3;
                                                                break;
                                                            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                n(1);
                                                                this.f7496r = 4;
                                                                this.f7492n.f7511h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f7495q;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f7493o = Collections.emptyList();
                                                                                i14 = this.f7495q;
                                                                                if (i14 != 1) {
                                                                                    m();
                                                                                } else {
                                                                                    m();
                                                                                }
                                                                                break;
                                                                            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                if (i13 == 1) {
                                                                                    C0104a c0104a1110 = this.f7492n;
                                                                                    arrayList = c0104a1110.f7505b;
                                                                                    arrayList.add(c0104a1110.d());
                                                                                    c0104a1110.f7506c.setLength(0);
                                                                                    c0104a1110.f7504a.clear();
                                                                                    iMin = Math.min(c0104a1110.f7511h, c0104a1110.f7507d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                m();
                                                                                break;
                                                                            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                this.f7493o = l();
                                                                                m();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f7492n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        n(3);
                                                    }
                                                }
                                            } else if (i11 != 17) {
                                                if ((b10 & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                n(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                        n(1);
                                                                        this.f7496r = 2;
                                                                        this.f7492n.f7511h = 2;
                                                                        break;
                                                                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                        n(1);
                                                                        this.f7496r = 3;
                                                                        this.f7492n.f7511h = 3;
                                                                        break;
                                                                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                        n(1);
                                                                        this.f7496r = 4;
                                                                        this.f7492n.f7511h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f7495q;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f7493o = Collections.emptyList();
                                                                                        i14 = this.f7495q;
                                                                                        if (i14 != 1) {
                                                                                            m();
                                                                                        } else {
                                                                                            m();
                                                                                        }
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                        if (i13 == 1) {
                                                                                            C0104a c0104a1111 = this.f7492n;
                                                                                            arrayList = c0104a1111.f7505b;
                                                                                            arrayList.add(c0104a1111.d());
                                                                                            c0104a1111.f7506c.setLength(0);
                                                                                            c0104a1111.f7504a.clear();
                                                                                            iMin = Math.min(c0104a1111.f7511h, c0104a1111.f7507d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                        m();
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                        this.f7493o = l();
                                                                                        m();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f7492n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                n(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            n(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                    n(1);
                                                                    this.f7496r = 2;
                                                                    this.f7492n.f7511h = 2;
                                                                    break;
                                                                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                    n(1);
                                                                    this.f7496r = 3;
                                                                    this.f7492n.f7511h = 3;
                                                                    break;
                                                                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                    n(1);
                                                                    this.f7496r = 4;
                                                                    this.f7492n.f7511h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f7495q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f7493o = Collections.emptyList();
                                                                                    i14 = this.f7495q;
                                                                                    if (i14 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                    if (i13 == 1) {
                                                                                        C0104a c0104a1112 = this.f7492n;
                                                                                        arrayList = c0104a1112.f7505b;
                                                                                        arrayList.add(c0104a1112.d());
                                                                                        c0104a1112.f7506c.setLength(0);
                                                                                        c0104a1112.f7504a.clear();
                                                                                        iMin = Math.min(c0104a1112.f7511h, c0104a1112.f7507d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                    this.f7493o = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f7492n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            n(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                    n(1);
                                                                    this.f7496r = 2;
                                                                    this.f7492n.f7511h = 2;
                                                                    break;
                                                                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                    n(1);
                                                                    this.f7496r = 3;
                                                                    this.f7492n.f7511h = 3;
                                                                    break;
                                                                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                    n(1);
                                                                    this.f7496r = 4;
                                                                    this.f7492n.f7511h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f7495q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f7493o = Collections.emptyList();
                                                                                    i14 = this.f7495q;
                                                                                    if (i14 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                    if (i13 == 1) {
                                                                                        C0104a c0104a1113 = this.f7492n;
                                                                                        arrayList = c0104a1113.f7505b;
                                                                                        arrayList.add(c0104a1113.d());
                                                                                        c0104a1113.f7506c.setLength(0);
                                                                                        c0104a1113.f7504a.clear();
                                                                                        iMin = Math.min(c0104a1113.f7511h, c0104a1113.f7507d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                    this.f7493o = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f7492n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        n(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                n(1);
                                                                this.f7496r = 2;
                                                                this.f7492n.f7511h = 2;
                                                                break;
                                                            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                n(1);
                                                                this.f7496r = 3;
                                                                this.f7492n.f7511h = 3;
                                                                break;
                                                            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                n(1);
                                                                this.f7496r = 4;
                                                                this.f7492n.f7511h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f7495q;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f7493o = Collections.emptyList();
                                                                                i14 = this.f7495q;
                                                                                if (i14 != 1) {
                                                                                    m();
                                                                                } else {
                                                                                    m();
                                                                                }
                                                                                break;
                                                                            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                if (i13 == 1) {
                                                                                    C0104a c0104a1114 = this.f7492n;
                                                                                    arrayList = c0104a1114.f7505b;
                                                                                    arrayList.add(c0104a1114.d());
                                                                                    c0104a1114.f7506c.setLength(0);
                                                                                    c0104a1114.f7504a.clear();
                                                                                    iMin = Math.min(c0104a1114.f7511h, c0104a1114.f7507d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                m();
                                                                                break;
                                                                            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                this.f7493o = l();
                                                                                m();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f7492n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        n(3);
                                                    }
                                                }
                                            } else if ((b10 & 240) != 16) {
                                                if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            n(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                    n(1);
                                                                    this.f7496r = 2;
                                                                    this.f7492n.f7511h = 2;
                                                                    break;
                                                                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                    n(1);
                                                                    this.f7496r = 3;
                                                                    this.f7492n.f7511h = 3;
                                                                    break;
                                                                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                    n(1);
                                                                    this.f7496r = 4;
                                                                    this.f7492n.f7511h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f7495q;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f7493o = Collections.emptyList();
                                                                                    i14 = this.f7495q;
                                                                                    if (i14 != 1) {
                                                                                        m();
                                                                                    } else {
                                                                                        m();
                                                                                    }
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                    if (i13 == 1) {
                                                                                        C0104a c0104a1115 = this.f7492n;
                                                                                        arrayList = c0104a1115.f7505b;
                                                                                        arrayList.add(c0104a1115.d());
                                                                                        c0104a1115.f7506c.setLength(0);
                                                                                        c0104a1115.f7504a.clear();
                                                                                        iMin = Math.min(c0104a1115.f7511h, c0104a1115.f7507d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                    m();
                                                                                    break;
                                                                                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                    this.f7493o = l();
                                                                                    m();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f7492n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            n(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        n(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                n(1);
                                                                this.f7496r = 2;
                                                                this.f7492n.f7511h = 2;
                                                                break;
                                                            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                n(1);
                                                                this.f7496r = 3;
                                                                this.f7492n.f7511h = 3;
                                                                break;
                                                            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                n(1);
                                                                this.f7496r = 4;
                                                                this.f7492n.f7511h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f7495q;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f7493o = Collections.emptyList();
                                                                                i14 = this.f7495q;
                                                                                if (i14 != 1) {
                                                                                    m();
                                                                                } else {
                                                                                    m();
                                                                                }
                                                                                break;
                                                                            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                if (i13 == 1) {
                                                                                    C0104a c0104a1116 = this.f7492n;
                                                                                    arrayList = c0104a1116.f7505b;
                                                                                    arrayList.add(c0104a1116.d());
                                                                                    c0104a1116.f7506c.setLength(0);
                                                                                    c0104a1116.f7504a.clear();
                                                                                    iMin = Math.min(c0104a1116.f7511h, c0104a1116.f7507d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                m();
                                                                                break;
                                                                            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                this.f7493o = l();
                                                                                m();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f7492n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        n(3);
                                                    }
                                                }
                                            } else if (i11 != 23) {
                                                if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        n(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                n(1);
                                                                this.f7496r = 2;
                                                                this.f7492n.f7511h = 2;
                                                                break;
                                                            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                                n(1);
                                                                this.f7496r = 3;
                                                                this.f7492n.f7511h = 3;
                                                                break;
                                                            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                                n(1);
                                                                this.f7496r = 4;
                                                                this.f7492n.f7511h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f7495q;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f7493o = Collections.emptyList();
                                                                                i14 = this.f7495q;
                                                                                if (i14 != 1) {
                                                                                    m();
                                                                                } else {
                                                                                    m();
                                                                                }
                                                                                break;
                                                                            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                                if (i13 == 1) {
                                                                                    C0104a c0104a1117 = this.f7492n;
                                                                                    arrayList = c0104a1117.f7505b;
                                                                                    arrayList.add(c0104a1117.d());
                                                                                    c0104a1117.f7506c.setLength(0);
                                                                                    c0104a1117.f7504a.clear();
                                                                                    iMin = Math.min(c0104a1117.f7511h, c0104a1117.f7507d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                                m();
                                                                                break;
                                                                            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                                this.f7493o = l();
                                                                                m();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f7492n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        n(3);
                                                    }
                                                }
                                            } else if (i12 == 20) {
                                                if (b11 == 32) {
                                                    n(2);
                                                } else if (b11 != 41) {
                                                    switch (b11) {
                                                        case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                            n(1);
                                                            this.f7496r = 2;
                                                            this.f7492n.f7511h = 2;
                                                            break;
                                                        case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                            n(1);
                                                            this.f7496r = 3;
                                                            this.f7492n.f7511h = 3;
                                                            break;
                                                        case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                            n(1);
                                                            this.f7496r = 4;
                                                            this.f7492n.f7511h = 4;
                                                            break;
                                                        default:
                                                            i13 = this.f7495q;
                                                            if (i13 != 0) {
                                                                if (b11 != 33) {
                                                                    switch (b11) {
                                                                        case 44:
                                                                            this.f7493o = Collections.emptyList();
                                                                            i14 = this.f7495q;
                                                                            if (i14 != 1) {
                                                                                m();
                                                                            } else {
                                                                                m();
                                                                            }
                                                                            break;
                                                                        case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                                                            if (i13 == 1) {
                                                                                C0104a c0104a1118 = this.f7492n;
                                                                                arrayList = c0104a1118.f7505b;
                                                                                arrayList.add(c0104a1118.d());
                                                                                c0104a1118.f7506c.setLength(0);
                                                                                c0104a1118.f7504a.clear();
                                                                                iMin = Math.min(c0104a1118.f7511h, c0104a1118.f7507d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                                                            m();
                                                                            break;
                                                                        case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                                                            this.f7493o = l();
                                                                            m();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f7492n.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    n(3);
                                                }
                                            }
                                        }
                                    } else {
                                        C0104a c0104a20 = this.f7492n;
                                        iArr = f7481C;
                                        c0104a20.a((char) iArr[(b10 & 127) - 32]);
                                        if ((b11 & 224) != 0) {
                                            this.f7492n.a((char) iArr[(b11 & 127) - 32]);
                                        }
                                    }
                                    z11 = true;
                                }
                            }
                        } else if (z12) {
                            m();
                            z11 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // Y1.e, p152m1.c
    /* JADX INFO: renamed from: j */
    public final X1.k e() throws SubtitleDecoderException {
        X1.k kVarPollFirst;
        X1.k kVarE = super.e();
        if (kVarE != null) {
            return kVarE;
        }
        long j = this.f7490l;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j10 = this.f7503y;
        if (j10 == -9223372036854775807L || this.f7568e - j10 < j || (kVarPollFirst = this.f7565b.pollFirst()) == null) {
            return null;
        }
        this.f7493o = Collections.emptyList();
        this.f7503y = -9223372036854775807L;
        v0 v0VarH = h();
        long j11 = this.f7568e;
        kVarPollFirst.f44563c = j11;
        kVarPollFirst.f7149e = v0VarH;
        kVarPollFirst.f7150f = j11;
        return kVarPollFirst;
    }

    @Override // Y1.e
    public final boolean k() {
        return this.f7493o != this.f7494p;
    }

    public final ArrayList l() {
        ArrayList<C0104a> arrayList = this.f7491m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            p102i1.a aVarC = arrayList.get(i10).c(Integer.MIN_VALUE);
            arrayList2.add(aVarC);
            if (aVarC != null) {
                iMin = Math.min(iMin, aVarC.f36519i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            p102i1.a aVarC2 = (p102i1.a) arrayList2.get(i11);
            if (aVarC2 != null) {
                if (aVarC2.f36519i != iMin) {
                    aVarC2 = arrayList.get(i11).c(iMin);
                    aVarC2.getClass();
                }
                arrayList3.add(aVarC2);
            }
        }
        return arrayList3;
    }

    public final void m() {
        C0104a c0104a = this.f7492n;
        c0104a.f7510g = this.f7495q;
        c0104a.f7504a.clear();
        c0104a.f7505b.clear();
        c0104a.f7506c.setLength(0);
        c0104a.f7507d = 15;
        c0104a.f7508e = 0;
        c0104a.f7509f = 0;
        ArrayList<C0104a> arrayList = this.f7491m;
        arrayList.clear();
        arrayList.add(this.f7492n);
    }

    public final void n(int i10) {
        int i11 = this.f7495q;
        if (i11 == i10) {
            return;
        }
        this.f7495q = i10;
        if (i10 != 3) {
            m();
            if (i11 == 3 || i10 == 1 || i10 == 0) {
                this.f7493o = Collections.emptyList();
                return;
            }
            return;
        }
        int i12 = 0;
        while (true) {
            ArrayList<C0104a> arrayList = this.f7491m;
            if (i12 >= arrayList.size()) {
                return;
            }
            arrayList.get(i12).f7510g = i10;
            i12++;
        }
    }

    @Override // Y1.e, p152m1.c
    public final void a() {
    }
}
