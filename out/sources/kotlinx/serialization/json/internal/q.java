package kotlinx.serialization.json.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: JsonToStringWriter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f44000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44001b;

    public final void a(int i10, int i11) {
        int i12 = i11 + i10;
        char[] cArr = this.f44000a;
        if (cArr.length <= i12) {
            int i13 = i10 * 2;
            if (i12 < i13) {
                i12 = i13;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i12);
            kotlin.jvm.internal.i.d(cArrCopyOf, "copyOf(...)");
            this.f44000a = cArrCopyOf;
        }
    }

    public final void b() {
        C2730c c2730c = C2730c.f43978c;
        char[] array = this.f44000a;
        c2730c.getClass();
        kotlin.jvm.internal.i.e(array, "array");
        synchronized (c2730c) {
            try {
                int i10 = c2730c.f43980b;
                if (array.length + i10 < C2729b.f43977a) {
                    c2730c.f43980b = i10 + array.length;
                    c2730c.f43979a.addLast(array);
                }
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String text) {
        kotlin.jvm.internal.i.e(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        a(this.f44001b, length);
        text.getChars(0, text.length(), this.f44000a, this.f44001b);
        this.f44001b += length;
    }

    public final void d(long j) {
        c(String.valueOf(j));
    }

    public final String toString() {
        return new String(this.f44000a, 0, this.f44001b);
    }
}
