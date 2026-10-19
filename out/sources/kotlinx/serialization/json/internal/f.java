package kotlinx.serialization.json.internal;

/* JADX INFO: compiled from: Composers.kt */
/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f43983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f43984b = true;

    public f(q qVar) {
        this.f43983a = qVar;
    }

    public void a() {
        this.f43984b = true;
    }

    public void b() {
        this.f43984b = false;
    }

    public void c() {
        this.f43984b = false;
    }

    public void d(byte b10) {
        this.f43983a.d(b10);
    }

    public final void e(char c10) {
        q qVar = this.f43983a;
        qVar.a(qVar.f44001b, 1);
        char[] cArr = qVar.f44000a;
        int i10 = qVar.f44001b;
        qVar.f44001b = i10 + 1;
        cArr[i10] = c10;
    }

    public void f(int i10) {
        this.f43983a.d(i10);
    }

    public void g(long j) {
        this.f43983a.d(j);
    }

    public final void h(String v10) {
        kotlin.jvm.internal.i.e(v10, "v");
        this.f43983a.c(v10);
    }

    public void i(short s10) {
        this.f43983a.d(s10);
    }

    public void j(String value) {
        byte b10;
        kotlin.jvm.internal.i.e(value, "value");
        q qVar = this.f43983a;
        qVar.a(qVar.f44001b, value.length() + 2);
        char[] cArr = qVar.f44000a;
        int i10 = qVar.f44001b;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = value.length();
        value.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        int i13 = i11;
        while (i13 < i12) {
            char c10 = cArr[i13];
            byte[] bArr = B.f43965b;
            if (c10 < bArr.length && bArr[c10] != 0) {
                int length2 = value.length();
                for (int i14 = i13 - i11; i14 < length2; i14++) {
                    qVar.a(i13, 2);
                    char cCharAt = value.charAt(i14);
                    byte[] bArr2 = B.f43965b;
                    if (cCharAt >= bArr2.length || (b10 = bArr2[cCharAt]) == 0) {
                        int i15 = i13 + 1;
                        qVar.f44000a[i13] = cCharAt;
                        i13 = i15;
                    } else if (b10 == 1) {
                        String str = B.f43964a[cCharAt];
                        kotlin.jvm.internal.i.b(str);
                        qVar.a(i13, str.length());
                        str.getChars(0, str.length(), qVar.f44000a, i13);
                        int length3 = str.length() + i13;
                        qVar.f44001b = length3;
                        i13 = length3;
                    } else {
                        char[] cArr2 = qVar.f44000a;
                        cArr2[i13] = '\\';
                        cArr2[i13 + 1] = (char) b10;
                        i13 += 2;
                        qVar.f44001b = i13;
                    }
                }
                qVar.a(i13, 1);
                qVar.f44000a[i13] = '\"';
                qVar.f44001b = i13 + 1;
                return;
            }
            i13++;
        }
        cArr[i12] = '\"';
        qVar.f44001b = i12 + 1;
    }

    public void k() {
    }

    public void l() {
    }
}
