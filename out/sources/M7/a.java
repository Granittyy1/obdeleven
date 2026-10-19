package M7;

import C.g;
import J4.i;
import com.google.gson.Strictness;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: JsonReader.java */
/* JADX INFO: loaded from: classes3.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Reader f4588b;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4596k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f4597l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f4598m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String[] f4600o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int[] f4601p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Strictness f4589c = Strictness.f28813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final char[] f4590d = new char[1024];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4591e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4592f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4593g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4594h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4595i = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4599n = 1;

    /* JADX INFO: renamed from: M7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: JsonReader.java */
    public class C0067a extends g {
    }

    static {
        g.f2280b = new C0067a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f4598m = iArr;
        iArr[0] = 6;
        this.f4600o = new String[32];
        this.f4601p = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f4588b = reader;
    }

    public final void A0(int i10) throws MalformedJsonException {
        int i11 = this.f4599n;
        if (i11 - 1 >= 255) {
            throw new MalformedJsonException("Nesting limit 255 reached" + N());
        }
        int[] iArr = this.f4598m;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f4598m = Arrays.copyOf(iArr, i12);
            this.f4601p = Arrays.copyOf(this.f4601p, i12);
            this.f4600o = (String[]) Arrays.copyOf(this.f4600o, i12);
        }
        int[] iArr2 = this.f4598m;
        int i13 = this.f4599n;
        this.f4599n = i13 + 1;
        iArr2[i13] = i10;
    }

    public String B() {
        return x(true);
    }

    public boolean C() throws IOException {
        int i10 = this.f4595i;
        if (i10 == 0) {
            i10 = i();
        }
        return (i10 == 2 || i10 == 4 || i10 == 17) ? false : true;
    }

    public final char I0() throws IOException {
        int i10;
        if (this.f4591e == this.f4592f && !p(1)) {
            a1("Unterminated escape sequence");
            throw null;
        }
        int i11 = this.f4591e;
        int i12 = i11 + 1;
        this.f4591e = i12;
        char[] cArr = this.f4590d;
        char c10 = cArr[i11];
        Strictness strictness = Strictness.f28814d;
        if (c10 != '\n') {
            if (c10 != '\"') {
                if (c10 != '\'') {
                    if (c10 != '/' && c10 != '\\') {
                        if (c10 == 'b') {
                            return '\b';
                        }
                        if (c10 == 'f') {
                            return '\f';
                        }
                        if (c10 == 'n') {
                            return '\n';
                        }
                        if (c10 == 'r') {
                            return '\r';
                        }
                        if (c10 == 't') {
                            return '\t';
                        }
                        if (c10 != 'u') {
                            a1("Invalid escape sequence");
                            throw null;
                        }
                        if (i11 + 5 > this.f4592f && !p(4)) {
                            a1("Unterminated escape sequence");
                            throw null;
                        }
                        int i13 = this.f4591e;
                        int i14 = i13 + 4;
                        int i15 = 0;
                        while (i13 < i14) {
                            char c11 = cArr[i13];
                            int i16 = i15 << 4;
                            if (c11 >= '0' && c11 <= '9') {
                                i10 = c11 - '0';
                            } else if (c11 >= 'a' && c11 <= 'f') {
                                i10 = c11 - 'W';
                            } else {
                                if (c11 < 'A' || c11 > 'F') {
                                    a1("Malformed Unicode escape \\u".concat(new String(cArr, this.f4591e, 4)));
                                    throw null;
                                }
                                i10 = c11 - '7';
                            }
                            i15 = i10 + i16;
                            i13++;
                        }
                        this.f4591e += 4;
                        return (char) i15;
                    }
                }
            }
            return c10;
        }
        if (this.f4589c == strictness) {
            a1("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f4593g++;
        this.f4594h = i12;
        if (this.f4589c == strictness) {
            a1("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c10;
    }

    public final void K0(char c10) throws IOException {
        do {
            int i10 = this.f4591e;
            int i11 = this.f4592f;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = this.f4590d[i10];
                if (c11 == c10) {
                    this.f4591e = i12;
                    return;
                }
                if (c11 == '\\') {
                    this.f4591e = i12;
                    I0();
                    i10 = this.f4591e;
                    i11 = this.f4592f;
                } else {
                    if (c11 == '\n') {
                        this.f4593g++;
                        this.f4594h = i12;
                    }
                    i10 = i12;
                }
            }
            this.f4591e = i10;
        } while (p(1));
        a1("Unterminated string");
        throw null;
    }

    public final boolean M(char c10) throws IOException {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                        case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                            return false;
                        case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        h();
        return false;
    }

    final String N() {
        StringBuilder sbA = B6.a.a(" at line ", " column ", " path ", this.f4593g + 1, (this.f4591e - this.f4594h) + 1);
        sbA.append(s());
        return sbA.toString();
    }

    public final void P0() throws IOException {
        char c10;
        do {
            if (this.f4591e >= this.f4592f && !p(1)) {
                return;
            }
            int i10 = this.f4591e;
            int i11 = i10 + 1;
            this.f4591e = i11;
            c10 = this.f4590d[i10];
            if (c10 == '\n') {
                this.f4593g++;
                this.f4594h = i11;
                return;
            }
        } while (c10 != '\r');
    }

    public boolean R() throws IOException {
        int i10 = this.f4595i;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 5) {
            this.f4595i = 0;
            int[] iArr = this.f4601p;
            int i11 = this.f4599n - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (i10 != 6) {
            throw b1("a boolean");
        }
        this.f4595i = 0;
        int[] iArr2 = this.f4601p;
        int i12 = this.f4599n - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return false;
    }

    public double S() throws IOException {
        int i10 = this.f4595i;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 15) {
            this.f4595i = 0;
            int[] iArr = this.f4601p;
            int i11 = this.f4599n - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.j;
        }
        if (i10 == 16) {
            this.f4597l = new String(this.f4590d, this.f4591e, this.f4596k);
            this.f4591e += this.f4596k;
        } else if (i10 == 8 || i10 == 9) {
            this.f4597l = o0(i10 == 8 ? '\'' : '\"');
        } else if (i10 == 10) {
            this.f4597l = s0();
        } else if (i10 != 11) {
            throw b1("a double");
        }
        this.f4595i = 11;
        double d10 = Double.parseDouble(this.f4597l);
        if (this.f4589c != Strictness.f28812b && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            a1("JSON forbids NaN and infinities: " + d10);
            throw null;
        }
        this.f4597l = null;
        this.f4595i = 0;
        int[] iArr2 = this.f4601p;
        int i12 = this.f4599n - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return d10;
    }

    public final void S0() throws IOException {
        do {
            int i10 = 0;
            while (true) {
                int i11 = this.f4591e;
                if (i11 + i10 < this.f4592f) {
                    char c10 = this.f4590d[i11 + i10];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                                                case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                                                    break;
                                                case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                                                    break;
                                                default:
                                                    i10++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        h();
                    }
                    this.f4591e += i10;
                    return;
                }
                this.f4591e = i11 + i10;
            }
        } while (p(1));
    }

    public int U() throws IOException {
        int i10 = this.f4595i;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 15) {
            long j = this.j;
            int i11 = (int) j;
            if (j != i11) {
                throw new NumberFormatException("Expected an int but was " + this.j + N());
            }
            this.f4595i = 0;
            int[] iArr = this.f4601p;
            int i12 = this.f4599n - 1;
            iArr[i12] = iArr[i12] + 1;
            return i11;
        }
        if (i10 == 16) {
            this.f4597l = new String(this.f4590d, this.f4591e, this.f4596k);
            this.f4591e += this.f4596k;
        } else {
            if (i10 != 8 && i10 != 9 && i10 != 10) {
                throw b1("an int");
            }
            if (i10 == 10) {
                this.f4597l = s0();
            } else {
                this.f4597l = o0(i10 == 8 ? '\'' : '\"');
            }
            try {
                int i13 = Integer.parseInt(this.f4597l);
                this.f4595i = 0;
                int[] iArr2 = this.f4601p;
                int i14 = this.f4599n - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return i13;
            } catch (NumberFormatException unused) {
            }
        }
        this.f4595i = 11;
        double d10 = Double.parseDouble(this.f4597l);
        int i15 = (int) d10;
        if (i15 != d10) {
            throw new NumberFormatException("Expected an int but was " + this.f4597l + N());
        }
        this.f4597l = null;
        this.f4595i = 0;
        int[] iArr3 = this.f4601p;
        int i16 = this.f4599n - 1;
        iArr3[i16] = iArr3[i16] + 1;
        return i15;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void Z0() throws IOException {
        int i10 = 0;
        do {
            int i11 = this.f4595i;
            if (i11 == 0) {
                i11 = i();
            }
            switch (i11) {
                case 1:
                    A0(3);
                    i10++;
                    this.f4595i = 0;
                    break;
                case 2:
                    if (i10 == 0) {
                        this.f4600o[this.f4599n - 1] = null;
                    }
                    this.f4599n--;
                    i10--;
                    this.f4595i = 0;
                    break;
                case 3:
                    A0(1);
                    i10++;
                    this.f4595i = 0;
                    break;
                case 4:
                    this.f4599n--;
                    i10--;
                    this.f4595i = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f4595i = 0;
                    break;
                case 8:
                    K0('\'');
                    this.f4595i = 0;
                    break;
                case 9:
                    K0('\"');
                    this.f4595i = 0;
                    break;
                case 10:
                    S0();
                    this.f4595i = 0;
                    break;
                case 12:
                    K0('\'');
                    if (i10 == 0) {
                        this.f4600o[this.f4599n - 1] = "<skipped>";
                    }
                    this.f4595i = 0;
                    break;
                case 13:
                    K0('\"');
                    if (i10 == 0) {
                        this.f4600o[this.f4599n - 1] = "<skipped>";
                    }
                    this.f4595i = 0;
                    break;
                case 14:
                    S0();
                    if (i10 == 0) {
                        this.f4600o[this.f4599n - 1] = "<skipped>";
                    }
                    this.f4595i = 0;
                    break;
                case 16:
                    this.f4591e += this.f4596k;
                    this.f4595i = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i10 > 0);
        int[] iArr = this.f4601p;
        int i12 = this.f4599n - 1;
        iArr[i12] = iArr[i12] + 1;
    }

    public final void a1(String str) throws MalformedJsonException {
        StringBuilder sbE = C4.b.e(str);
        sbE.append(N());
        sbE.append("\nSee ");
        sbE.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new MalformedJsonException(sbE.toString());
    }

    public void b() throws IOException {
        int i10 = this.f4595i;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 != 3) {
            throw b1("BEGIN_ARRAY");
        }
        A0(1);
        this.f4601p[this.f4599n - 1] = 0;
        this.f4595i = 0;
    }

    public final IllegalStateException b1(String str) throws IOException {
        String str2 = y0() == JsonToken.j ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbA = C7.g.a("Expected ", str, " but was ");
        sbA.append(y0());
        sbA.append(N());
        sbA.append("\nSee ");
        sbA.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(sbA.toString());
    }

    public void c() throws IOException {
        int i10 = this.f4595i;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 != 1) {
            throw b1("BEGIN_OBJECT");
        }
        A0(3);
        this.f4595i = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4595i = 0;
        this.f4598m[0] = 8;
        this.f4599n = 1;
        this.f4588b.close();
    }

    public long f0() throws IOException {
        int i10 = this.f4595i;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 15) {
            this.f4595i = 0;
            int[] iArr = this.f4601p;
            int i11 = this.f4599n - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.j;
        }
        if (i10 == 16) {
            this.f4597l = new String(this.f4590d, this.f4591e, this.f4596k);
            this.f4591e += this.f4596k;
        } else {
            if (i10 != 8 && i10 != 9 && i10 != 10) {
                throw b1("a long");
            }
            if (i10 == 10) {
                this.f4597l = s0();
            } else {
                this.f4597l = o0(i10 == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.f4597l);
                this.f4595i = 0;
                int[] iArr2 = this.f4601p;
                int i12 = this.f4599n - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.f4595i = 11;
        double d10 = Double.parseDouble(this.f4597l);
        long j10 = (long) d10;
        if (j10 != d10) {
            throw new NumberFormatException("Expected a long but was " + this.f4597l + N());
        }
        this.f4597l = null;
        this.f4595i = 0;
        int[] iArr3 = this.f4601p;
        int i13 = this.f4599n - 1;
        iArr3[i13] = iArr3[i13] + 1;
        return j10;
    }

    public final void h() throws MalformedJsonException {
        if (this.f4589c == Strictness.f28812b) {
            return;
        }
        a1("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0188 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:120:0x0189  */
    /* JADX WARN: Code duplicated, block: B:123:0x0198  */
    /* JADX WARN: Code duplicated, block: B:126:0x019e  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:130:0x01af A[PHI: r2 r4
      0x01af: PHI (r2v52 int) = (r2v51 int), (r2v54 int) binds: [B:122:0x0196, B:129:0x01a9] A[DONT_GENERATE, DONT_INLINE]
      0x01af: PHI (r4v10 int) = (r4v9 int), (r4v12 int) binds: [B:122:0x0196, B:129:0x01a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:132:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:134:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:174:0x0222  */
    /* JADX WARN: Code duplicated, block: B:175:0x0224  */
    /* JADX WARN: Code duplicated, block: B:187:0x0245 A[DONT_INVERT, PHI: r1
      0x0245: PHI (r1v68 int) = (r1v67 int), (r1v71 int) binds: [B:173:0x0220, B:179:0x022d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:188:0x0247  */
    /* JADX WARN: Code duplicated, block: B:202:0x0268  */
    /* JADX WARN: Code duplicated, block: B:204:0x026e  */
    /* JADX WARN: Code duplicated, block: B:207:0x0273  */
    /* JADX WARN: Code duplicated, block: B:212:0x0283 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:213:0x0284  */
    /* JADX WARN: Code duplicated, block: B:215:0x028e  */
    /* JADX WARN: Code duplicated, block: B:217:0x0296  */
    /* JADX WARN: Code duplicated, block: B:227:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:236:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:238:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:281:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ea  */
    public final int i() throws IOException {
        int i10;
        int iM0;
        int i11;
        int iM1;
        int i12;
        String str;
        String str2;
        int i13;
        char c10;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        char c11;
        int i18;
        int i19;
        int i20;
        int[] iArr = this.f4598m;
        int i21 = 1;
        int i22 = this.f4599n - 1;
        int i23 = iArr[i22];
        char[] cArr = this.f4590d;
        if (i23 == 1) {
            iArr[i22] = 2;
        } else {
            if (i23 != 2) {
                if (i23 == 3) {
                    i10 = 4;
                } else if (i23 == 5) {
                    i10 = 4;
                } else {
                    if (i23 != 4) {
                        if (i23 == 6) {
                            if (this.f4589c == Strictness.f28812b) {
                                m0(true);
                                int i24 = this.f4591e;
                                this.f4591e = i24 - 1;
                                if (i24 + 4 <= this.f4592f || p(5)) {
                                    int i25 = this.f4591e;
                                    if (cArr[i25] == ')' && cArr[i25 + 1] == ']' && cArr[i25 + 2] == '}' && cArr[i25 + 3] == '\'' && cArr[i25 + 4] == '\n') {
                                        this.f4591e = i25 + 5;
                                    }
                                }
                            }
                            this.f4598m[this.f4599n - 1] = 7;
                        } else if (i23 == 7) {
                            i11 = 0;
                            if (m0(false) == -1) {
                                this.f4595i = 17;
                                return 17;
                            }
                            h();
                            this.f4591e--;
                        } else {
                            i11 = 0;
                            if (i23 == 8) {
                                throw new IllegalStateException("JsonReader is closed");
                            }
                        }
                        iM1 = m0(true);
                        if (iM1 != 34) {
                            this.f4595i = 9;
                            return 9;
                        }
                        if (iM1 != 39) {
                            h();
                            this.f4595i = 8;
                            return 8;
                        }
                        if (iM1 != 44 || iM1 == 59) {
                            i12 = 1;
                        } else {
                            if (iM1 == 91) {
                                this.f4595i = 3;
                                return 3;
                            }
                            if (iM1 != 93) {
                                if (iM1 == 123) {
                                    this.f4595i = 1;
                                    return 1;
                                }
                                int i26 = this.f4591e - 1;
                                this.f4591e = i26;
                                char c12 = cArr[i26];
                                if (c12 == 't' || c12 == 'T') {
                                    str = "true";
                                    str2 = "TRUE";
                                    i13 = 5;
                                } else {
                                    if (c12 != 'f' && c12 != 'F') {
                                        if (c12 != 'n' && c12 != 'N') {
                                            i13 = i11;
                                            break;
                                        }
                                        str = "null";
                                        str2 = "NULL";
                                        i13 = 7;
                                        if (i13 != 0) {
                                            return i13;
                                        }
                                        i14 = this.f4591e;
                                        i15 = this.f4592f;
                                        i16 = i11;
                                        i17 = i16;
                                        int i27 = i17;
                                        z10 = true;
                                        long j = 0;
                                        while (true) {
                                            if (i14 + i17 != i15) {
                                                c11 = cArr[i14 + i17];
                                                if (c11 != '+') {
                                                    if (c11 != 'E' || c11 == 'e') {
                                                        i18 = i15;
                                                        if (i16 != 2 || i16 == 4) {
                                                            i16 = 5;
                                                            i17++;
                                                            i15 = i18;
                                                            i21 = 1;
                                                        }
                                                    } else if (c11 == '-') {
                                                        i18 = i15;
                                                        if (i16 == 0) {
                                                            i16 = 1;
                                                            i27 = 1;
                                                        } else {
                                                            if (i16 != 5) {
                                                            }
                                                            i16 = 6;
                                                        }
                                                        i17++;
                                                        i15 = i18;
                                                        i21 = 1;
                                                    } else if (c11 == '.') {
                                                        i18 = i15;
                                                        if (i16 == 2) {
                                                            i16 = 3;
                                                            i17++;
                                                            i15 = i18;
                                                            i21 = 1;
                                                        }
                                                    } else if (c11 >= '0' && c11 <= '9') {
                                                        if (i16 == i21 || i16 == 0) {
                                                            i18 = i15;
                                                            j = -(c11 - '0');
                                                            i16 = 2;
                                                        } else if (i16 != 2) {
                                                            i18 = i15;
                                                            if (i16 == 3) {
                                                                i16 = 4;
                                                            } else if (i16 == 5 || i16 == 6) {
                                                                i16 = 7;
                                                            }
                                                        } else if (j != 0) {
                                                            i18 = i15;
                                                            long j10 = (10 * j) - ((long) (c11 - '0'));
                                                            z10 &= j > -922337203685477580L || (j == -922337203685477580L && j10 < j);
                                                            j = j10;
                                                        }
                                                        i17++;
                                                        i15 = i18;
                                                        i21 = 1;
                                                    } else if (!M(c11)) {
                                                        i20 = 2;
                                                        if (i16 != 2) {
                                                            if (i16 != i20 || i16 == 4 || i16 == 7) {
                                                                this.f4596k = i17;
                                                                i19 = 16;
                                                                this.f4595i = 16;
                                                            }
                                                        } else if (z10 || ((j == Long.MIN_VALUE && i27 == 0) || (j == 0 && i27 != 0))) {
                                                            i20 = 2;
                                                            if (i16 != i20) {
                                                            }
                                                            this.f4596k = i17;
                                                            i19 = 16;
                                                            this.f4595i = 16;
                                                        } else {
                                                            if (i27 == 0) {
                                                                j = -j;
                                                            }
                                                            this.j = j;
                                                            this.f4591e += i17;
                                                            i19 = 15;
                                                            this.f4595i = 15;
                                                        }
                                                    }
                                                    if (i19 != 0) {
                                                        return i19;
                                                    }
                                                    if (M(cArr[this.f4591e])) {
                                                        a1("Expected value");
                                                        throw null;
                                                    }
                                                    h();
                                                    this.f4595i = 10;
                                                    return 10;
                                                }
                                                i18 = i15;
                                                if (i16 != 5) {
                                                }
                                                i16 = 6;
                                                i17++;
                                                i15 = i18;
                                                i21 = 1;
                                            } else if (i17 != cArr.length) {
                                                if (!p(i17 + 1)) {
                                                    int i28 = this.f4591e;
                                                    i15 = this.f4592f;
                                                    i14 = i28;
                                                    c11 = cArr[i14 + i17];
                                                    if (c11 != '+') {
                                                        if (c11 != 'E') {
                                                            i18 = i15;
                                                            if (i16 != 2) {
                                                            }
                                                            i16 = 5;
                                                            i17++;
                                                            i15 = i18;
                                                            i21 = 1;
                                                        } else {
                                                            i18 = i15;
                                                            if (i16 != 2) {
                                                            }
                                                            i16 = 5;
                                                            i17++;
                                                            i15 = i18;
                                                            i21 = 1;
                                                        }
                                                        if (i19 != 0) {
                                                            return i19;
                                                        }
                                                        if (M(cArr[this.f4591e])) {
                                                            a1("Expected value");
                                                            throw null;
                                                        }
                                                        h();
                                                        this.f4595i = 10;
                                                        return 10;
                                                    }
                                                    i18 = i15;
                                                    if (i16 != 5) {
                                                    }
                                                    i16 = 6;
                                                    i17++;
                                                    i15 = i18;
                                                    i21 = 1;
                                                }
                                                i20 = 2;
                                                if (i16 != 2) {
                                                    if (i16 != i20) {
                                                    }
                                                    this.f4596k = i17;
                                                    i19 = 16;
                                                    this.f4595i = 16;
                                                } else {
                                                    if (z10) {
                                                    }
                                                    i20 = 2;
                                                    if (i16 != i20) {
                                                    }
                                                    this.f4596k = i17;
                                                    i19 = 16;
                                                    this.f4595i = 16;
                                                }
                                                if (i19 != 0) {
                                                    return i19;
                                                }
                                                if (M(cArr[this.f4591e])) {
                                                    a1("Expected value");
                                                    throw null;
                                                }
                                                h();
                                                this.f4595i = 10;
                                                return 10;
                                            }
                                            i19 = 0;
                                            if (i19 != 0) {
                                                return i19;
                                            }
                                            if (M(cArr[this.f4591e])) {
                                                a1("Expected value");
                                                throw null;
                                            }
                                            h();
                                            this.f4595i = 10;
                                            return 10;
                                        }
                                    }
                                    str = "false";
                                    str2 = "FALSE";
                                    i13 = 6;
                                }
                                int i29 = this.f4589c != Strictness.f28814d ? 1 : i11;
                                int length = str.length();
                                int i30 = i11;
                                while (true) {
                                    if (i30 >= length) {
                                        if ((this.f4591e + length >= this.f4592f && !p(length + 1)) || !M(cArr[this.f4591e + length])) {
                                            this.f4591e += length;
                                            this.f4595i = i13;
                                            break;
                                        }
                                        break;
                                    }
                                    if ((this.f4591e + i30 < this.f4592f || p(i30 + 1)) && ((c10 = cArr[this.f4591e + i30]) == str.charAt(i30) || (i29 != 0 && c10 == str2.charAt(i30)))) {
                                        i30++;
                                    }
                                    i13 = i11;
                                    break;
                                }
                                if (i13 != 0) {
                                    return i13;
                                }
                                i14 = this.f4591e;
                                i15 = this.f4592f;
                                i16 = i11;
                                i17 = i16;
                                int i210 = i17;
                                z10 = true;
                                long j11 = 0;
                                while (true) {
                                    if (i14 + i17 != i15) {
                                        c11 = cArr[i14 + i17];
                                        if (c11 != '+') {
                                            if (c11 != 'E') {
                                                i18 = i15;
                                                if (i16 != 2) {
                                                }
                                                i16 = 5;
                                                i17++;
                                                i15 = i18;
                                                i21 = 1;
                                            } else {
                                                i18 = i15;
                                                if (i16 != 2) {
                                                }
                                                i16 = 5;
                                                i17++;
                                                i15 = i18;
                                                i21 = 1;
                                            }
                                            if (i19 != 0) {
                                                return i19;
                                            }
                                            if (M(cArr[this.f4591e])) {
                                                a1("Expected value");
                                                throw null;
                                            }
                                            h();
                                            this.f4595i = 10;
                                            return 10;
                                        }
                                        i18 = i15;
                                        if (i16 != 5) {
                                        }
                                        i16 = 6;
                                        i17++;
                                        i15 = i18;
                                        i21 = 1;
                                    } else if (i17 != cArr.length) {
                                        if (!p(i17 + 1)) {
                                            int i211 = this.f4591e;
                                            i15 = this.f4592f;
                                            i14 = i211;
                                            c11 = cArr[i14 + i17];
                                            if (c11 != '+') {
                                                if (c11 != 'E') {
                                                    i18 = i15;
                                                    if (i16 != 2) {
                                                    }
                                                    i16 = 5;
                                                    i17++;
                                                    i15 = i18;
                                                    i21 = 1;
                                                } else {
                                                    i18 = i15;
                                                    if (i16 != 2) {
                                                    }
                                                    i16 = 5;
                                                    i17++;
                                                    i15 = i18;
                                                    i21 = 1;
                                                }
                                                if (i19 != 0) {
                                                    return i19;
                                                }
                                                if (M(cArr[this.f4591e])) {
                                                    a1("Expected value");
                                                    throw null;
                                                }
                                                h();
                                                this.f4595i = 10;
                                                return 10;
                                            }
                                            i18 = i15;
                                            if (i16 != 5) {
                                            }
                                            i16 = 6;
                                            i17++;
                                            i15 = i18;
                                            i21 = 1;
                                        }
                                        i20 = 2;
                                        if (i16 != 2) {
                                            if (i16 != i20) {
                                            }
                                            this.f4596k = i17;
                                            i19 = 16;
                                            this.f4595i = 16;
                                        } else {
                                            if (z10) {
                                            }
                                            i20 = 2;
                                            if (i16 != i20) {
                                            }
                                            this.f4596k = i17;
                                            i19 = 16;
                                            this.f4595i = 16;
                                        }
                                        if (i19 != 0) {
                                            return i19;
                                        }
                                        if (M(cArr[this.f4591e])) {
                                            a1("Expected value");
                                            throw null;
                                        }
                                        h();
                                        this.f4595i = 10;
                                        return 10;
                                    }
                                    i19 = 0;
                                    if (i19 != 0) {
                                        return i19;
                                    }
                                    if (M(cArr[this.f4591e])) {
                                        a1("Expected value");
                                        throw null;
                                    }
                                    h();
                                    this.f4595i = 10;
                                    return 10;
                                }
                            }
                            i12 = 1;
                            if (i23 == 1) {
                                this.f4595i = 4;
                                return 4;
                            }
                        }
                        if (i23 == i12 && i23 != 2) {
                            a1("Unexpected value");
                            throw null;
                        }
                        h();
                        this.f4591e -= i12;
                        this.f4595i = 7;
                        return 7;
                    }
                    iArr[i22] = 5;
                    int iM2 = m0(true);
                    if (iM2 != 58) {
                        if (iM2 != 61) {
                            a1("Expected ':'");
                            throw null;
                        }
                        h();
                        if (this.f4591e < this.f4592f || p(1)) {
                            int i31 = this.f4591e;
                            if (cArr[i31] == '>') {
                                this.f4591e = i31 + 1;
                            }
                        }
                    }
                }
                iArr[i22] = i10;
                if (i23 == 5 && (iM0 = m0(true)) != 44) {
                    if (iM0 != 59) {
                        if (iM0 == 125) {
                            this.f4595i = 2;
                            return 2;
                        }
                        a1("Unterminated object");
                        throw null;
                    }
                    h();
                }
                int iM3 = m0(true);
                if (iM3 == 34) {
                    this.f4595i = 13;
                    return 13;
                }
                if (iM3 == 39) {
                    h();
                    this.f4595i = 12;
                    return 12;
                }
                if (iM3 == 125) {
                    if (i23 != 5) {
                        this.f4595i = 2;
                        return 2;
                    }
                    a1("Expected name");
                    throw null;
                }
                h();
                this.f4591e--;
                if (M((char) iM3)) {
                    this.f4595i = 14;
                    return 14;
                }
                a1("Expected name");
                throw null;
            }
            int iM4 = m0(true);
            if (iM4 != 44) {
                if (iM4 != 59) {
                    if (iM4 == 93) {
                        this.f4595i = 4;
                        return 4;
                    }
                    a1("Unterminated array");
                    throw null;
                }
                h();
            }
        }
        i11 = 0;
        iM1 = m0(true);
        if (iM1 != 34) {
            this.f4595i = 9;
            return 9;
        }
        if (iM1 != 39) {
            h();
            this.f4595i = 8;
            return 8;
        }
        if (iM1 != 44) {
            i12 = 1;
        } else {
            i12 = 1;
        }
        if (i23 == i12) {
        }
        h();
        this.f4591e -= i12;
        this.f4595i = 7;
        return 7;
    }

    public void j() throws IOException {
        int i10 = this.f4595i;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 != 4) {
            throw b1("END_ARRAY");
        }
        int i11 = this.f4599n;
        this.f4599n = i11 - 1;
        int[] iArr = this.f4601p;
        int i12 = i11 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f4595i = 0;
    }

    public String j0() throws IOException {
        String strO0;
        int i10 = this.f4595i;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 14) {
            strO0 = s0();
        } else if (i10 == 12) {
            strO0 = o0('\'');
        } else {
            if (i10 != 13) {
                throw b1("a name");
            }
            strO0 = o0('\"');
        }
        this.f4595i = 0;
        this.f4600o[this.f4599n - 1] = strO0;
        return strO0;
    }

    public void k() throws IOException {
        int i10 = this.f4595i;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 != 2) {
            throw b1("END_OBJECT");
        }
        int i11 = this.f4599n;
        int i12 = i11 - 1;
        this.f4599n = i12;
        this.f4600o[i12] = null;
        int[] iArr = this.f4601p;
        int i13 = i11 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.f4595i = 0;
    }

    public final int m0(boolean z10) throws IOException {
        int i10 = this.f4591e;
        int i11 = this.f4592f;
        while (true) {
            if (i10 == i11) {
                this.f4591e = i10;
                if (!p(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input" + N());
                }
                i10 = this.f4591e;
                i11 = this.f4592f;
            }
            int i12 = i10 + 1;
            char[] cArr = this.f4590d;
            char c10 = cArr[i10];
            if (c10 == '\n') {
                this.f4593g++;
                this.f4594h = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f4591e = i12;
                    if (i12 == i11) {
                        this.f4591e = i10;
                        boolean zP = p(2);
                        this.f4591e++;
                        if (!zP) {
                            return c10;
                        }
                    }
                    h();
                    int i13 = this.f4591e;
                    char c11 = cArr[i13];
                    if (c11 == '*') {
                        this.f4591e = i13 + 1;
                        while (true) {
                            if (this.f4591e + 2 > this.f4592f && !p(2)) {
                                a1("Unterminated comment");
                                throw null;
                            }
                            int i14 = this.f4591e;
                            if (cArr[i14] != '\n') {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= 2) {
                                        i10 = this.f4591e + 2;
                                        i11 = this.f4592f;
                                        break;
                                    }
                                    if (cArr[this.f4591e + i15] != "*/".charAt(i15)) {
                                        break;
                                    }
                                    i15++;
                                }
                            } else {
                                this.f4593g++;
                                this.f4594h = i14 + 1;
                            }
                            this.f4591e++;
                        }
                    } else {
                        if (c11 != '/') {
                            return c10;
                        }
                        this.f4591e = i13 + 1;
                        P0();
                        i10 = this.f4591e;
                        i11 = this.f4592f;
                    }
                } else {
                    if (c10 != '#') {
                        this.f4591e = i12;
                        return c10;
                    }
                    this.f4591e = i12;
                    h();
                    P0();
                    i10 = this.f4591e;
                    i11 = this.f4592f;
                }
            }
            i10 = i12;
        }
    }

    public void n0() throws IOException {
        int i10 = this.f4595i;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 != 7) {
            throw b1("null");
        }
        this.f4595i = 0;
        int[] iArr = this.f4601p;
        int i11 = this.f4599n - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    public final String o0(char c10) throws IOException {
        int i10;
        char[] cArr;
        StringBuilder sb2 = null;
        do {
            int i11 = this.f4591e;
            int i12 = this.f4592f;
            while (true) {
                int i13 = i12;
                i10 = i11;
                while (true) {
                    cArr = this.f4590d;
                    if (i11 < i13) {
                        int i14 = i11 + 1;
                        char c11 = cArr[i11];
                        if (this.f4589c == Strictness.f28814d && c11 < ' ') {
                            a1("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                            throw null;
                        }
                        if (c11 == c10) {
                            this.f4591e = i14;
                            int i15 = (i14 - i10) - 1;
                            if (sb2 == null) {
                                return new String(cArr, i10, i15);
                            }
                            sb2.append(cArr, i10, i15);
                            return sb2.toString();
                        }
                        if (c11 == '\\') {
                            this.f4591e = i14;
                            int i16 = i14 - i10;
                            int i17 = i16 - 1;
                            if (sb2 == null) {
                                sb2 = new StringBuilder(Math.max(i16 * 2, 16));
                            }
                            sb2.append(cArr, i10, i17);
                            sb2.append(I0());
                            i11 = this.f4591e;
                            i12 = this.f4592f;
                        } else {
                            if (c11 == '\n') {
                                this.f4593g++;
                                this.f4594h = i14;
                            }
                            i11 = i14;
                        }
                    }
                }
            }
            if (sb2 == null) {
                sb2 = new StringBuilder(Math.max((i11 - i10) * 2, 16));
            }
            sb2.append(cArr, i10, i11 - i10);
            this.f4591e = i11;
        } while (p(1));
        a1("Unterminated string");
        throw null;
    }

    public final boolean p(int i10) throws IOException {
        int i11;
        int i12;
        int i13 = this.f4594h;
        int i14 = this.f4591e;
        this.f4594h = i13 - i14;
        int i15 = this.f4592f;
        char[] cArr = this.f4590d;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f4592f = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f4592f = 0;
        }
        this.f4591e = 0;
        do {
            int i17 = this.f4592f;
            int i18 = this.f4588b.read(cArr, i17, cArr.length - i17);
            if (i18 == -1) {
                return false;
            }
            i11 = this.f4592f + i18;
            this.f4592f = i11;
            if (this.f4593g == 0 && (i12 = this.f4594h) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f4591e++;
                this.f4594h = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    public String r0() throws IOException {
        String str;
        int i10 = this.f4595i;
        if (i10 == 0) {
            i10 = i();
        }
        if (i10 == 10) {
            str = s0();
        } else if (i10 == 8) {
            str = o0('\'');
        } else if (i10 == 9) {
            str = o0('\"');
        } else if (i10 == 11) {
            str = this.f4597l;
            this.f4597l = null;
        } else if (i10 == 15) {
            str = Long.toString(this.j);
        } else {
            if (i10 != 16) {
                throw b1("a string");
            }
            str = new String(this.f4590d, this.f4591e, this.f4596k);
            this.f4591e += this.f4596k;
        }
        this.f4595i = 0;
        int[] iArr = this.f4601p;
        int i11 = this.f4599n - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    public String s() {
        return x(false);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    public final String s0() throws IOException {
        String string;
        StringBuilder sb2 = null;
        int i10 = 0;
        while (true) {
            int i11 = 0;
            while (true) {
                int i12 = this.f4591e;
                int i13 = i12 + i11;
                int i14 = this.f4592f;
                char[] cArr = this.f4590d;
                if (i13 < i14) {
                    char c10 = cArr[i12 + i11];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                                                case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                                                    break;
                                                case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                                                    break;
                                                default:
                                                    i11++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        h();
                    }
                    i10 = i11;
                } else if (i11 >= cArr.length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i11, 16));
                    }
                    sb2.append(cArr, this.f4591e, i11);
                    this.f4591e += i11;
                    if (!p(1)) {
                    }
                } else if (!p(i11 + 1)) {
                    i10 = i11;
                }
                if (sb2 == null) {
                    string = new String(cArr, this.f4591e, i10);
                } else {
                    sb2.append(cArr, this.f4591e, i10);
                    string = sb2.toString();
                }
                this.f4591e += i10;
                return string;
            }
        }
    }

    public String toString() {
        return getClass().getSimpleName() + N();
    }

    public final String x(boolean z10) {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.f4599n;
            if (i10 >= i11) {
                return sb2.toString();
            }
            int i12 = this.f4598m[i10];
            switch (i12) {
                case 1:
                case 2:
                    int i13 = this.f4601p[i10];
                    if (z10 && i13 > 0 && i10 == i11 - 1) {
                        i13--;
                    }
                    sb2.append('[');
                    sb2.append(i13);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.f4600o[i10];
                    if (str != null) {
                        sb2.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(i.b(i12, "Unknown scope value: "));
            }
            i10++;
        }
    }

    public JsonToken y0() throws IOException {
        int i10 = this.f4595i;
        if (i10 == 0) {
            i10 = i();
        }
        switch (i10) {
            case 1:
                return JsonToken.f28989d;
            case 2:
                return JsonToken.f28990e;
            case 3:
                return JsonToken.f28987b;
            case 4:
                return JsonToken.f28988c;
            case 5:
            case 6:
                return JsonToken.f28994i;
            case 7:
                return JsonToken.j;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.f28992g;
            case 12:
            case 13:
            case 14:
                return JsonToken.f28991f;
            case 15:
            case 16:
                return JsonToken.f28993h;
            case 17:
                return JsonToken.f28995k;
            default:
                throw new AssertionError();
        }
    }
}
