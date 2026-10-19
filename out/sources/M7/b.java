package M7;

import com.google.gson.Strictness;
import com.google.gson.c;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: JsonWriter.java */
/* JADX INFO: loaded from: classes3.dex */
public class b implements Closeable, Flushable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f4602m = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String[] f4603n = new String[128];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String[] f4604o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Writer f4605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f4606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f4608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f4609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f4610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Strictness f4612i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f4613k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4614l;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f4603n[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f4603n;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f4604o = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f4606c = iArr;
        this.f4607d = 0;
        if (iArr.length == 0) {
            this.f4606c = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f4606c;
        int i10 = this.f4607d;
        this.f4607d = i10 + 1;
        iArr2[i10] = 6;
        this.f4612i = Strictness.f28813c;
        this.f4614l = true;
        Objects.requireNonNull(writer, "out == null");
        this.f4605b = writer;
        C(c.f28820d);
    }

    public final int B() {
        int i10 = this.f4607d;
        if (i10 != 0) {
            return this.f4606c[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void C(c cVar) {
        Objects.requireNonNull(cVar);
        this.f4608e = cVar;
        this.f4610g = ",";
        if (cVar.f28823c) {
            this.f4609f = ": ";
            if (cVar.f28821a.isEmpty()) {
                this.f4610g = ", ";
            }
        } else {
            this.f4609f = ":";
        }
        this.f4611h = this.f4608e.f28821a.isEmpty() && this.f4608e.f28822b.isEmpty();
    }

    public final void M(Strictness strictness) {
        Objects.requireNonNull(strictness);
        this.f4612i = strictness;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    public final void N(String str) throws IOException {
        String str2;
        String[] strArr = this.j ? f4604o : f4603n;
        Writer writer = this.f4605b;
        writer.write(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        writer.write(str, i10, i11 - i10);
                    }
                    writer.write(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    writer.write(str, i10, i11 - i10);
                }
                writer.write(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            writer.write(str, i10, length - i10);
        }
        writer.write(34);
    }

    public void R(double d10) throws IOException {
        n0();
        if (this.f4612i == Strictness.f28812b || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            b();
            this.f4605b.append((CharSequence) Double.toString(d10));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
    }

    public void S(long j) throws IOException {
        n0();
        b();
        this.f4605b.write(Long.toString(j));
    }

    public void U(Boolean bool) throws IOException {
        if (bool == null) {
            x();
            return;
        }
        n0();
        b();
        this.f4605b.write(bool.booleanValue() ? "true" : "false");
    }

    public final void b() throws IOException {
        int iB = B();
        if (iB == 1) {
            this.f4606c[this.f4607d - 1] = 2;
            s();
            return;
        }
        Writer writer = this.f4605b;
        if (iB == 2) {
            writer.append((CharSequence) this.f4610g);
            s();
        } else {
            if (iB == 4) {
                writer.append((CharSequence) this.f4609f);
                this.f4606c[this.f4607d - 1] = 5;
                return;
            }
            if (iB != 6) {
                if (iB != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f4612i != Strictness.f28812b) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f4606c[this.f4607d - 1] = 7;
        }
    }

    public void c() throws IOException {
        n0();
        b();
        int i10 = this.f4607d;
        int[] iArr = this.f4606c;
        if (i10 == iArr.length) {
            this.f4606c = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f4606c;
        int i11 = this.f4607d;
        this.f4607d = i11 + 1;
        iArr2[i11] = 1;
        this.f4605b.write(91);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4605b.close();
        int i10 = this.f4607d;
        if (i10 > 1 || (i10 == 1 && this.f4606c[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f4607d = 0;
    }

    public void f0(Number number) throws IOException {
        if (number == null) {
            x();
            return;
        }
        n0();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f4612i != Strictness.f28812b) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                }
            } else if (cls != Float.class && cls != Double.class && !f4602m.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        }
        b();
        this.f4605b.append((CharSequence) string);
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f4607d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f4605b.flush();
    }

    public void h() throws IOException {
        n0();
        b();
        int i10 = this.f4607d;
        int[] iArr = this.f4606c;
        if (i10 == iArr.length) {
            this.f4606c = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f4606c;
        int i11 = this.f4607d;
        this.f4607d = i11 + 1;
        iArr2[i11] = 3;
        this.f4605b.write(R.styleable.AppCompatTheme_windowFixedWidthMinor);
    }

    public final void i(int i10, int i11, char c10) throws IOException {
        int iB = B();
        if (iB != i11 && iB != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f4613k != null) {
            throw new IllegalStateException("Dangling name: " + this.f4613k);
        }
        this.f4607d--;
        if (iB == i11) {
            s();
        }
        this.f4605b.write(c10);
    }

    public void j() throws IOException {
        i(1, 2, ']');
    }

    public void j0(String str) throws IOException {
        if (str == null) {
            x();
            return;
        }
        n0();
        b();
        N(str);
    }

    public void k() throws IOException {
        i(3, 5, '}');
    }

    public void m0(boolean z10) throws IOException {
        n0();
        b();
        this.f4605b.write(z10 ? "true" : "false");
    }

    public final void n0() throws IOException {
        if (this.f4613k != null) {
            int iB = B();
            if (iB == 5) {
                this.f4605b.write(this.f4610g);
            } else if (iB != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            s();
            this.f4606c[this.f4607d - 1] = 4;
            N(this.f4613k);
            this.f4613k = null;
        }
    }

    public void p(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f4613k != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iB = B();
        if (iB != 3 && iB != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f4613k = str;
    }

    public final void s() throws IOException {
        if (this.f4611h) {
            return;
        }
        String str = this.f4608e.f28821a;
        Writer writer = this.f4605b;
        writer.write(str);
        int i10 = this.f4607d;
        for (int i11 = 1; i11 < i10; i11++) {
            writer.write(this.f4608e.f28822b);
        }
    }

    public b x() throws IOException {
        if (this.f4613k != null) {
            if (!this.f4614l) {
                this.f4613k = null;
                return this;
            }
            n0();
        }
        b();
        this.f4605b.write("null");
        return this;
    }
}
