package p061ea;

import A1.C0575j;
import A8.f;
import O.h;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.i;
import p005a4.q;
import p293xa.d;

/* JADX INFO: compiled from: Buffer.kt */
/* JADX INFO: loaded from: classes.dex */
@d
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f34855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f34860f;

    public a(ByteBuffer memory) {
        i.e(memory, "memory");
        this.f34855a = memory;
        this.f34859e = memory.limit();
        this.f34860f = memory.limit();
    }

    public final void a(int i10) {
        int i11 = this.f34857c;
        int i12 = i11 + i10;
        if (i10 < 0 || i12 > this.f34859e) {
            G0.a.b(i10, this.f34859e - i11);
            throw null;
        }
        this.f34857c = i12;
    }

    public final void b(int i10) throws EOFException {
        int i11 = this.f34859e;
        int i12 = this.f34857c;
        if (i10 < i12) {
            G0.a.b(i10 - i12, i11 - i12);
            throw null;
        }
        if (i10 < i11) {
            this.f34857c = i10;
        } else if (i10 == i11) {
            this.f34857c = i10;
        } else {
            G0.a.b(i10 - i12, i11 - i12);
            throw null;
        }
    }

    public final void c(int i10) {
        if (i10 == 0) {
            return;
        }
        int i11 = this.f34856b;
        int i12 = i11 + i10;
        if (i10 < 0 || i12 > this.f34857c) {
            G0.a.c(i10, this.f34857c - i11);
            throw null;
        }
        this.f34856b = i12;
    }

    public final void d(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(J4.i.b(i10, "newReadPosition shouldn't be negative: ").toString());
        }
        if (i10 > this.f34856b) {
            StringBuilder sbE = f.e(i10, "newReadPosition shouldn't be ahead of the read position: ", " > ");
            sbE.append(this.f34856b);
            throw new IllegalArgumentException(sbE.toString().toString());
        }
        this.f34856b = i10;
        if (this.f34858d > i10) {
            this.f34858d = i10;
        }
    }

    public final void e() {
        int i10 = this.f34860f;
        int i11 = i10 - 8;
        int i12 = this.f34857c;
        if (i11 >= i12) {
            this.f34859e = i11;
            return;
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(J4.i.b(i10, "End gap 8 is too big: capacity is "));
        }
        if (i11 < this.f34858d) {
            throw new IllegalArgumentException(q.c(new StringBuilder("End gap 8 is too big: there are already "), this.f34858d, " bytes reserved in the beginning"));
        }
        if (this.f34856b == i12) {
            this.f34859e = i11;
            this.f34856b = i11;
            this.f34857c = i11;
        } else {
            throw new IllegalArgumentException("Unable to reserve end gap 8: there are already " + (this.f34857c - this.f34856b) + " content bytes at offset " + this.f34856b);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Buffer[0x");
        int iHashCode = hashCode();
        h.c(16);
        String string = Integer.toString(iHashCode, 16);
        i.d(string, "toString(this, checkRadix(radix))");
        sb2.append(string);
        sb2.append("](");
        sb2.append(this.f34857c - this.f34856b);
        sb2.append(" used, ");
        sb2.append(this.f34859e - this.f34857c);
        sb2.append(" free, ");
        int i10 = this.f34858d;
        int i11 = this.f34859e;
        int i12 = this.f34860f;
        sb2.append((i12 - i11) + i10);
        sb2.append(" reserved of ");
        return C0575j.b(sb2, i12, ')');
    }
}
