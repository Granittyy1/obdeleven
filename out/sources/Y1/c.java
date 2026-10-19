package Y1;

import T4.v0;
import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.zhanghai.android.materialprogressbar.R;
import p114j1.k;
import p114j1.q;
import p114j1.r;

/* JADX INFO: compiled from: Cea708Decoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f7516h = new r();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q f7517i = new q();
    public int j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f7518k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b[] f7519l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f7520m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<p102i1.a> f7521n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<p102i1.a> f7522o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C0106c f7523p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7524q;

    /* JADX INFO: compiled from: Cea708Decoder.java */
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Y1.b f7525c = new Y1.b(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p102i1.a f7526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7527b;

        public a(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f10, int i10, float f11, int i11, boolean z10, int i12, int i13) {
            p102i1.a.C0382a c0382a = new p102i1.a.C0382a();
            c0382a.f36527a = spannableStringBuilder;
            c0382a.f36529c = alignment;
            c0382a.f36531e = f10;
            c0382a.f36532f = 0;
            c0382a.f36533g = i10;
            c0382a.f36534h = f11;
            c0382a.f36535i = i11;
            c0382a.f36537l = -3.4028235E38f;
            if (z10) {
                c0382a.f36540o = i12;
                c0382a.f36539n = true;
            }
            this.f7526a = c0382a.a();
            this.f7527b = i13;
        }
    }

    /* JADX INFO: compiled from: Cea708Decoder.java */
    public static final class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final boolean[] f7528A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final int[] f7529B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final int[] f7530C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final int[] f7531D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final int[] f7532E;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f7533v = c(2, 2, 2, 0);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f7534w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int[] f7535x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int[] f7536y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int[] f7537z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f7538a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SpannableStringBuilder f7539b = new SpannableStringBuilder();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f7540c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f7541d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7542e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f7543f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f7544g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f7545h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f7546i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f7547k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f7548l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f7549m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f7550n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f7551o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f7552p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f7553q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f7554r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f7555s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f7556t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f7557u;

        static {
            int iC = c(0, 0, 0, 0);
            f7534w = iC;
            int iC2 = c(0, 0, 0, 3);
            f7535x = new int[]{0, 0, 0, 0, 0, 2, 0};
            f7536y = new int[]{0, 0, 0, 0, 0, 0, 2};
            f7537z = new int[]{3, 3, 3, 3, 3, 3, 1};
            f7528A = new boolean[]{false, false, false, true, true, true, false};
            f7529B = new int[]{iC, iC2, iC, iC, iC2, iC, iC};
            f7530C = new int[]{0, 1, 2, 3, 4, 3, 4};
            f7531D = new int[]{0, 0, 0, 0, 0, 3, 3};
            f7532E = new int[]{iC, iC, iC, iC, iC, iC2, iC2};
        }

        public b() {
            d();
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001b  */
        public static int c(int i10, int i11, int i12, int i13) {
            int i14;
            p241t7.b.f(i10, 4);
            p241t7.b.f(i11, 4);
            p241t7.b.f(i12, 4);
            p241t7.b.f(i13, 4);
            if (i13 == 0 || i13 == 1) {
                i14 = 255;
            } else if (i13 == 2) {
                i14 = 127;
            } else if (i13 != 3) {
                i14 = 255;
            } else {
                i14 = 0;
            }
            return Color.argb(i14, i10 > 1 ? 255 : 0, i11 > 1 ? 255 : 0, i12 > 1 ? 255 : 0);
        }

        public final void a(char c10) {
            SpannableStringBuilder spannableStringBuilder = this.f7539b;
            if (c10 != '\n') {
                spannableStringBuilder.append(c10);
                return;
            }
            ArrayList arrayList = this.f7538a;
            arrayList.add(b());
            spannableStringBuilder.clear();
            if (this.f7551o != -1) {
                this.f7551o = 0;
            }
            if (this.f7552p != -1) {
                this.f7552p = 0;
            }
            if (this.f7553q != -1) {
                this.f7553q = 0;
            }
            if (this.f7555s != -1) {
                this.f7555s = 0;
            }
            while (true) {
                if (arrayList.size() < this.j && arrayList.size() < 15) {
                    this.f7557u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        }

        public final SpannableString b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f7539b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f7551o != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f7551o, length, 33);
                }
                if (this.f7552p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f7552p, length, 33);
                }
                if (this.f7553q != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f7554r), this.f7553q, length, 33);
                }
                if (this.f7555s != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f7556t), this.f7555s, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final void d() {
            this.f7538a.clear();
            this.f7539b.clear();
            this.f7551o = -1;
            this.f7552p = -1;
            this.f7553q = -1;
            this.f7555s = -1;
            this.f7557u = 0;
            this.f7540c = false;
            this.f7541d = false;
            this.f7542e = 4;
            this.f7543f = false;
            this.f7544g = 0;
            this.f7545h = 0;
            this.f7546i = 0;
            this.j = 15;
            this.f7547k = 0;
            this.f7548l = 0;
            this.f7549m = 0;
            int i10 = f7534w;
            this.f7550n = i10;
            this.f7554r = f7533v;
            this.f7556t = i10;
        }

        public final void e(boolean z10, boolean z11) {
            int i10 = this.f7551o;
            SpannableStringBuilder spannableStringBuilder = this.f7539b;
            if (i10 != -1) {
                if (!z10) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f7551o, spannableStringBuilder.length(), 33);
                    this.f7551o = -1;
                }
            } else if (z10) {
                this.f7551o = spannableStringBuilder.length();
            }
            if (this.f7552p == -1) {
                if (z11) {
                    this.f7552p = spannableStringBuilder.length();
                }
            } else {
                if (z11) {
                    return;
                }
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f7552p, spannableStringBuilder.length(), 33);
                this.f7552p = -1;
            }
        }

        public final void f(int i10, int i11) {
            int i12 = this.f7553q;
            SpannableStringBuilder spannableStringBuilder = this.f7539b;
            if (i12 != -1 && this.f7554r != i10) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f7554r), this.f7553q, spannableStringBuilder.length(), 33);
            }
            if (i10 != f7533v) {
                this.f7553q = spannableStringBuilder.length();
                this.f7554r = i10;
            }
            if (this.f7555s != -1 && this.f7556t != i11) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f7556t), this.f7555s, spannableStringBuilder.length(), 33);
            }
            if (i11 != f7534w) {
                this.f7555s = spannableStringBuilder.length();
                this.f7556t = i11;
            }
        }
    }

    /* JADX INFO: renamed from: Y1.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Cea708Decoder.java */
    public static final class C0106c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f7560c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f7561d = 0;

        public C0106c(int i10, int i11) {
            this.f7558a = i10;
            this.f7559b = i11;
            this.f7560c = new byte[(i11 * 2) - 1];
        }
    }

    public c(int i10, List<byte[]> list) {
        this.f7518k = i10 == -1 ? 1 : i10;
        if (list != null) {
            byte[] bArr = p114j1.d.f41012a;
            if (list.size() == 1 && list.get(0).length == 1) {
                byte b10 = list.get(0)[0];
            }
        }
        this.f7519l = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f7519l[i11] = new b();
        }
        this.f7520m = this.f7519l[0];
    }

    @Override // Y1.e, p152m1.c
    public final void flush() {
        super.flush();
        this.f7521n = null;
        this.f7522o = null;
        this.f7524q = 0;
        this.f7520m = this.f7519l[0];
        n();
        this.f7523p = null;
    }

    @Override // Y1.e
    public final v0 h() {
        List<p102i1.a> list = this.f7521n;
        this.f7522o = list;
        list.getClass();
        return new v0(list);
    }

    @Override // Y1.e
    public final void i(e.a aVar) {
        ByteBuffer byteBuffer = aVar.f17941e;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        r rVar = this.f7516h;
        rVar.E(iLimit, bArrArray);
        while (rVar.a() >= 3) {
            int iU = rVar.u();
            int i10 = iU & 3;
            boolean z10 = (iU & 4) == 4;
            byte bU = (byte) rVar.u();
            byte bU2 = (byte) rVar.u();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        l();
                        int i11 = (bU & 192) >> 6;
                        int i12 = this.j;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            n();
                            k.f("Sequence number discontinuity. previous=" + this.j + " current=" + i11);
                        }
                        this.j = i11;
                        int i13 = bU & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        C0106c c0106c = new C0106c(i11, i13);
                        this.f7523p = c0106c;
                        c0106c.f7561d = 1;
                        c0106c.f7560c[0] = bU2;
                    } else {
                        p241t7.b.e(i10 == 2);
                        C0106c c0106c2 = this.f7523p;
                        if (c0106c2 == null) {
                            k.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = c0106c2.f7560c;
                            int i14 = c0106c2.f7561d;
                            int i15 = i14 + 1;
                            c0106c2.f7561d = i15;
                            bArr[i14] = bU;
                            c0106c2.f7561d = i14 + 2;
                            bArr[i15] = bU2;
                        }
                    }
                    C0106c c0106c3 = this.f7523p;
                    if (c0106c3.f7561d == (c0106c3.f7559b * 2) - 1) {
                        l();
                    }
                }
            }
        }
    }

    @Override // Y1.e
    public final boolean k() {
        return this.f7521n != this.f7522o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:229:0x0537  */
    public final void l() {
        boolean z10;
        char c10;
        C0106c c0106c = this.f7523p;
        if (c0106c == null) {
            return;
        }
        int i10 = 2;
        boolean z11 = true;
        if (c0106c.f7561d != (c0106c.f7559b * 2) - 1) {
            k.b("DtvCcPacket ended prematurely; size is " + ((this.f7523p.f7559b * 2) - 1) + ", but current index is " + this.f7523p.f7561d + " (sequence number " + this.f7523p.f7558a + ");");
        }
        C0106c c0106c2 = this.f7523p;
        byte[] bArr = c0106c2.f7560c;
        int i11 = c0106c2.f7561d;
        q qVar = this.f7517i;
        qVar.k(i11, bArr);
        boolean z12 = false;
        while (qVar.b() > 0) {
            int i12 = 3;
            int iG = qVar.g(3);
            int iG2 = qVar.g(5);
            int i13 = 7;
            if (iG == 7) {
                qVar.o(i10);
                iG = qVar.g(6);
                if (iG < 7) {
                    com.google.gson.internal.b.e(iG, "Invalid extended service number: ");
                }
            }
            if (iG2 == 0) {
                if (iG != 0) {
                    k.f("serviceNumber is non-zero (" + iG + ") when blockSize is 0");
                }
                if (z12) {
                    this.f7521n = m();
                }
                this.f7523p = null;
            }
            if (iG != this.f7518k) {
                qVar.p(iG2);
            } else {
                int iE = (iG2 * 8) + qVar.e();
                while (qVar.e() < iE) {
                    int iG3 = qVar.g(8);
                    if (iG3 != 16) {
                        if (iG3 <= 31) {
                            if (iG3 != 0) {
                                if (iG3 == i12) {
                                    this.f7521n = m();
                                } else if (iG3 != 8) {
                                    switch (iG3) {
                                        case 12:
                                            n();
                                            break;
                                        case 13:
                                            this.f7520m.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (iG3 >= 17 && iG3 <= 23) {
                                                k.f("Currently unsupported COMMAND_EXT1 Command: " + iG3);
                                                qVar.o(8);
                                            } else if (iG3 < 24 || iG3 > 31) {
                                                com.google.gson.internal.b.e(iG3, "Invalid C0 command: ");
                                            } else {
                                                k.f("Currently unsupported COMMAND_P16 Command: " + iG3);
                                                qVar.o(16);
                                            }
                                            break;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = this.f7520m.f7539b;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            }
                        } else if (iG3 <= 127) {
                            if (iG3 == 127) {
                                this.f7520m.a((char) 9835);
                            } else {
                                this.f7520m.a((char) (iG3 & 255));
                            }
                            z12 = true;
                        } else {
                            if (iG3 <= 159) {
                                b[] bVarArr = this.f7519l;
                                switch (iG3) {
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        i12 = i12;
                                        z10 = true;
                                        int i14 = iG3 - 128;
                                        if (this.f7524q != i14) {
                                            this.f7524q = i14;
                                            this.f7520m = bVarArr[i14];
                                        }
                                        break;
                                    case 136:
                                        i12 = i12;
                                        z10 = true;
                                        for (int i15 = 1; i15 <= 8; i15++) {
                                            if (qVar.f()) {
                                                b bVar = bVarArr[8 - i15];
                                                bVar.f7538a.clear();
                                                bVar.f7539b.clear();
                                                bVar.f7551o = -1;
                                                bVar.f7552p = -1;
                                                bVar.f7553q = -1;
                                                bVar.f7555s = -1;
                                                bVar.f7557u = 0;
                                            }
                                        }
                                        break;
                                    case 137:
                                        i12 = i12;
                                        for (int i16 = 1; i16 <= 8; i16++) {
                                            if (qVar.f()) {
                                                bVarArr[8 - i16].f7541d = true;
                                            }
                                        }
                                        z10 = true;
                                        break;
                                    case 138:
                                        i12 = i12;
                                        for (int i17 = 1; i17 <= 8; i17++) {
                                            if (qVar.f()) {
                                                bVarArr[8 - i17].f7541d = false;
                                            }
                                        }
                                        z10 = true;
                                        break;
                                    case 139:
                                        i12 = i12;
                                        for (int i18 = 1; i18 <= 8; i18++) {
                                            if (qVar.f()) {
                                                b bVar2 = bVarArr[8 - i18];
                                                bVar2.f7541d = !bVar2.f7541d;
                                            }
                                        }
                                        z10 = true;
                                        break;
                                    case 140:
                                        i12 = i12;
                                        for (int i19 = 1; i19 <= 8; i19++) {
                                            if (qVar.f()) {
                                                bVarArr[8 - i19].d();
                                            }
                                        }
                                        z10 = true;
                                        break;
                                    case 141:
                                        i12 = i12;
                                        qVar.o(8);
                                        z10 = true;
                                        break;
                                    case 142:
                                        i12 = i12;
                                        z10 = true;
                                        break;
                                    case 143:
                                        i12 = i12;
                                        n();
                                        z10 = true;
                                        break;
                                    case 144:
                                        if (this.f7520m.f7540c) {
                                            qVar.g(4);
                                            qVar.g(2);
                                            qVar.g(2);
                                            boolean zF = qVar.f();
                                            boolean zF2 = qVar.f();
                                            i12 = 3;
                                            qVar.g(3);
                                            qVar.g(3);
                                            this.f7520m.e(zF, zF2);
                                        } else {
                                            qVar.o(16);
                                            i12 = 3;
                                        }
                                        z10 = true;
                                        break;
                                    case 145:
                                        if (this.f7520m.f7540c) {
                                            int iC = b.c(qVar.g(2), qVar.g(2), qVar.g(2), qVar.g(2));
                                            int iC2 = b.c(qVar.g(2), qVar.g(2), qVar.g(2), qVar.g(2));
                                            qVar.o(2);
                                            b.c(qVar.g(2), qVar.g(2), qVar.g(2), 0);
                                            this.f7520m.f(iC, iC2);
                                        } else {
                                            qVar.o(24);
                                        }
                                        i12 = 3;
                                        z10 = true;
                                        break;
                                    case 146:
                                        if (this.f7520m.f7540c) {
                                            qVar.o(4);
                                            int iG4 = qVar.g(4);
                                            qVar.o(2);
                                            qVar.g(6);
                                            b bVar3 = this.f7520m;
                                            if (bVar3.f7557u != iG4) {
                                                bVar3.a('\n');
                                            }
                                            bVar3.f7557u = iG4;
                                        } else {
                                            qVar.o(16);
                                        }
                                        i12 = 3;
                                        z10 = true;
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    default:
                                        com.google.gson.internal.b.e(iG3, "Invalid C1 command: ");
                                        i12 = i12;
                                        z10 = true;
                                        break;
                                    case 151:
                                        if (this.f7520m.f7540c) {
                                            int iC3 = b.c(qVar.g(2), qVar.g(2), qVar.g(2), qVar.g(2));
                                            qVar.g(2);
                                            b.c(qVar.g(2), qVar.g(2), qVar.g(2), 0);
                                            qVar.f();
                                            qVar.f();
                                            qVar.g(2);
                                            qVar.g(2);
                                            int iG5 = qVar.g(2);
                                            qVar.o(8);
                                            b bVar4 = this.f7520m;
                                            bVar4.f7550n = iC3;
                                            bVar4.f7547k = iG5;
                                        } else {
                                            qVar.o(32);
                                        }
                                        i12 = 3;
                                        z10 = true;
                                        break;
                                    case 152:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i20 = iG3 - 152;
                                        b bVar5 = bVarArr[i20];
                                        qVar.o(i10);
                                        boolean zF3 = qVar.f();
                                        qVar.o(i10);
                                        int iG6 = qVar.g(i12);
                                        boolean zF4 = qVar.f();
                                        int iG7 = qVar.g(i13);
                                        int iG8 = qVar.g(8);
                                        int iG9 = qVar.g(4);
                                        int iG10 = qVar.g(4);
                                        qVar.o(i10);
                                        qVar.o(6);
                                        qVar.o(i10);
                                        int iG11 = qVar.g(i12);
                                        int iG12 = qVar.g(i12);
                                        bVar5.f7540c = true;
                                        bVar5.f7541d = zF3;
                                        bVar5.f7542e = iG6;
                                        bVar5.f7543f = zF4;
                                        bVar5.f7544g = iG7;
                                        bVar5.f7545h = iG8;
                                        bVar5.f7546i = iG9;
                                        int i21 = iG10 + 1;
                                        if (bVar5.j != i21) {
                                            bVar5.j = i21;
                                            while (true) {
                                                ArrayList arrayList = bVar5.f7538a;
                                                if (arrayList.size() >= bVar5.j || arrayList.size() >= 15) {
                                                    arrayList.remove(0);
                                                }
                                            }
                                        }
                                        if (iG11 != 0 && bVar5.f7548l != iG11) {
                                            bVar5.f7548l = iG11;
                                            int i22 = iG11 - 1;
                                            int i23 = b.f7529B[i22];
                                            boolean z13 = b.f7528A[i22];
                                            int i24 = b.f7536y[i22];
                                            int i25 = b.f7537z[i22];
                                            int i26 = b.f7535x[i22];
                                            bVar5.f7550n = i23;
                                            bVar5.f7547k = i26;
                                        }
                                        if (iG12 != 0 && bVar5.f7549m != iG12) {
                                            bVar5.f7549m = iG12;
                                            int i27 = iG12 - 1;
                                            int i28 = b.f7531D[i27];
                                            int i29 = b.f7530C[i27];
                                            bVar5.e(false, false);
                                            bVar5.f(b.f7533v, b.f7532E[i27]);
                                        }
                                        if (this.f7524q != i20) {
                                            this.f7524q = i20;
                                            this.f7520m = bVarArr[i20];
                                        }
                                        i12 = 3;
                                        z10 = true;
                                        break;
                                }
                            } else {
                                i12 = i12;
                                z10 = true;
                                if (iG3 <= 255) {
                                    this.f7520m.a((char) (iG3 & 255));
                                } else {
                                    com.google.gson.internal.b.e(iG3, "Invalid base command: ");
                                }
                                i10 = 2;
                                i13 = 7;
                            }
                            z12 = z10;
                            i10 = 2;
                            i13 = 7;
                        }
                        z10 = true;
                    } else {
                        i12 = i12;
                        z10 = true;
                        int iG13 = qVar.g(8);
                        if (iG13 <= 31) {
                            i13 = 7;
                            if (iG13 > 7) {
                                if (iG13 <= 15) {
                                    qVar.o(8);
                                } else if (iG13 <= 23) {
                                    qVar.o(16);
                                } else if (iG13 <= 31) {
                                    qVar.o(24);
                                }
                            }
                        } else {
                            i13 = 7;
                            if (iG13 <= 127) {
                                if (iG13 == 32) {
                                    this.f7520m.a(' ');
                                } else if (iG13 == 33) {
                                    this.f7520m.a((char) 160);
                                } else if (iG13 == 37) {
                                    this.f7520m.a((char) 8230);
                                } else if (iG13 == 42) {
                                    this.f7520m.a((char) 352);
                                } else if (iG13 == 44) {
                                    this.f7520m.a((char) 338);
                                } else if (iG13 == 63) {
                                    this.f7520m.a((char) 376);
                                } else if (iG13 == 57) {
                                    this.f7520m.a((char) 8482);
                                } else if (iG13 == 58) {
                                    this.f7520m.a((char) 353);
                                } else if (iG13 == 60) {
                                    this.f7520m.a((char) 339);
                                } else if (iG13 != 61) {
                                    switch (iG13) {
                                        case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                                            this.f7520m.a((char) 9608);
                                            break;
                                        case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                            this.f7520m.a((char) 8216);
                                            break;
                                        case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                                            this.f7520m.a((char) 8217);
                                            break;
                                        case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                                            this.f7520m.a((char) 8220);
                                            break;
                                        case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                                            this.f7520m.a((char) 8221);
                                            break;
                                        case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                                            this.f7520m.a((char) 8226);
                                            break;
                                        default:
                                            switch (iG13) {
                                                case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                                                    this.f7520m.a((char) 8539);
                                                    break;
                                                case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                                                    this.f7520m.a((char) 8540);
                                                    break;
                                                case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                                                    this.f7520m.a((char) 8541);
                                                    break;
                                                case R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
                                                    this.f7520m.a((char) 8542);
                                                    break;
                                                case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                                                    this.f7520m.a((char) 9474);
                                                    break;
                                                case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                                                    this.f7520m.a((char) 9488);
                                                    break;
                                                case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                                                    this.f7520m.a((char) 9492);
                                                    break;
                                                case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                                                    this.f7520m.a((char) 9472);
                                                    break;
                                                case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                                                    this.f7520m.a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.f7520m.a((char) 9484);
                                                    break;
                                                default:
                                                    com.google.gson.internal.b.e(iG13, "Invalid G2 character: ");
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.f7520m.a((char) 8480);
                                }
                                z12 = true;
                            } else {
                                if (iG13 > 159) {
                                    i10 = 2;
                                    c10 = 6;
                                    if (iG13 <= 255) {
                                        if (iG13 == 160) {
                                            this.f7520m.a((char) 13252);
                                        } else {
                                            com.google.gson.internal.b.e(iG13, "Invalid G3 character: ");
                                            this.f7520m.a('_');
                                        }
                                        z12 = true;
                                    } else {
                                        com.google.gson.internal.b.e(iG13, "Invalid extended command: ");
                                    }
                                } else if (iG13 <= 135) {
                                    qVar.o(32);
                                } else if (iG13 <= 143) {
                                    qVar.o(40);
                                } else if (iG13 <= 159) {
                                    i10 = 2;
                                    qVar.o(2);
                                    c10 = 6;
                                    qVar.o(qVar.g(6) * 8);
                                }
                                i12 = i12;
                                i10 = i10;
                                z11 = z10;
                                i13 = i13;
                            }
                        }
                        i10 = 2;
                    }
                    c10 = 6;
                    i12 = i12;
                    i10 = i10;
                    z11 = z10;
                    i13 = i13;
                }
            }
        }
        if (z12) {
            this.f7521n = m();
        }
        this.f7523p = null;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ea  */
    public final List<p102i1.a> m() {
        a aVar;
        Layout.Alignment alignment;
        float f10;
        float f11;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            b[] bVarArr = this.f7519l;
            b bVar = bVarArr[i10];
            if (bVar.f7540c && (!bVar.f7538a.isEmpty() || bVar.f7539b.length() != 0)) {
                b bVar2 = bVarArr[i10];
                if (bVar2.f7541d) {
                    if (bVar2.f7540c) {
                        ArrayList arrayList2 = bVar2.f7538a;
                        if (arrayList2.isEmpty() && bVar2.f7539b.length() == 0) {
                            aVar = null;
                        } else {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                                spannableStringBuilder.append((CharSequence) arrayList2.get(i11));
                                spannableStringBuilder.append('\n');
                            }
                            spannableStringBuilder.append((CharSequence) bVar2.b());
                            int i12 = bVar2.f7547k;
                            if (i12 == 0) {
                                alignment = Layout.Alignment.ALIGN_NORMAL;
                            } else if (i12 == 1) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else if (i12 != 2) {
                                if (i12 != 3) {
                                    throw new IllegalArgumentException("Unexpected justification value: " + bVar2.f7547k);
                                }
                                alignment = Layout.Alignment.ALIGN_NORMAL;
                            } else {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                            }
                            Layout.Alignment alignment2 = alignment;
                            if (bVar2.f7543f) {
                                f10 = bVar2.f7545h / 99.0f;
                                f11 = bVar2.f7544g / 99.0f;
                            } else {
                                f10 = bVar2.f7545h / 209.0f;
                                f11 = bVar2.f7544g / 74.0f;
                            }
                            float f12 = (f10 * 0.9f) + 0.05f;
                            float f13 = (f11 * 0.9f) + 0.05f;
                            int i13 = bVar2.f7546i;
                            int i14 = i13 / 3;
                            int i15 = i14 == 0 ? 0 : i14 == 1 ? 1 : 2;
                            int i16 = i13 % 3;
                            int i17 = i16 == 0 ? 0 : i16 == 1 ? 1 : 2;
                            int i18 = bVar2.f7550n;
                            aVar = new a(spannableStringBuilder, alignment2, f13, i15, f12, i17, i18 != b.f7534w, i18, bVar2.f7542e);
                        }
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, a.f7525c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            arrayList3.add(((a) arrayList.get(i19)).f7526a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final void n() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f7519l[i10].d();
        }
    }
}
