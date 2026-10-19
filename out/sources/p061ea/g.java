package p061ea;

import S4.o;
import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.i;
import p036ca.b;
import p074fa.a;
import p293xa.d;

/* JADX INFO: compiled from: Output.kt */
/* JADX INFO: loaded from: classes.dex */
@d
public abstract class g implements Appendable, Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p086ga.d<a> f34872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f34873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f34874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ByteBuffer f34875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f34876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f34877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f34878h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f34879i;

    public g(p086ga.d<a> pool) {
        i.e(pool, "pool");
        this.f34872b = pool;
        ByteBuffer byteBuffer = b.f22529a;
        this.f34875e = b.f22529a;
    }

    public final void b() {
        a aVar = this.f34874d;
        if (aVar != null) {
            this.f34876f = aVar.f34857c;
        }
    }

    @Override // java.lang.Appendable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g append(char c10) throws EOFException {
        int i10 = this.f34876f;
        int i11 = 4;
        if (this.f34877g - i10 >= 3) {
            ByteBuffer byteBuffer = this.f34875e;
            if (c10 >= 0 && c10 < 128) {
                byteBuffer.put(i10, (byte) c10);
                i11 = 1;
            } else if (128 <= c10 && c10 < 2048) {
                byteBuffer.put(i10, (byte) (((c10 >> 6) & 31) | 192));
                byteBuffer.put(i10 + 1, (byte) ((c10 & '?') | 128));
                i11 = 2;
            } else if (2048 <= c10 && c10 < 0) {
                byteBuffer.put(i10, (byte) (((c10 >> '\f') & 15) | 224));
                byteBuffer.put(i10 + 1, (byte) (((c10 >> 6) & 63) | 128));
                byteBuffer.put(i10 + 2, (byte) ((c10 & '?') | 128));
                i11 = 3;
            } else {
                if (0 > c10 || c10 >= 0) {
                    Lb.a.j(c10);
                    throw null;
                }
                byteBuffer.put(i10, (byte) (((c10 >> 18) & 7) | 240));
                byteBuffer.put(i10 + 1, (byte) (((c10 >> '\f') & 63) | 128));
                byteBuffer.put(i10 + 2, (byte) (((c10 >> 6) & 63) | 128));
                byteBuffer.put(i10 + 3, (byte) ((c10 & '?') | 128));
            }
            this.f34876f = i10 + i11;
            return this;
        }
        a aVarK = k(3);
        try {
            ByteBuffer byteBuffer2 = aVarK.f34855a;
            int i12 = aVarK.f34857c;
            if (c10 >= 0 && c10 < 128) {
                byteBuffer2.put(i12, (byte) c10);
                i11 = 1;
            } else if (128 <= c10 && c10 < 2048) {
                byteBuffer2.put(i12, (byte) (((c10 >> 6) & 31) | 192));
                byteBuffer2.put(i12 + 1, (byte) ((c10 & '?') | 128));
                i11 = 2;
            } else if (2048 <= c10 && c10 < 0) {
                byteBuffer2.put(i12, (byte) (((c10 >> '\f') & 15) | 224));
                byteBuffer2.put(i12 + 1, (byte) (((c10 >> 6) & 63) | 128));
                byteBuffer2.put(i12 + 2, (byte) ((c10 & '?') | 128));
                i11 = 3;
            } else {
                if (0 > c10 || c10 >= 0) {
                    Lb.a.j(c10);
                    throw null;
                }
                byteBuffer2.put(i12, (byte) (((c10 >> 18) & 7) | 240));
                byteBuffer2.put(i12 + 1, (byte) (((c10 >> '\f') & 63) | 128));
                byteBuffer2.put(i12 + 2, (byte) (((c10 >> 6) & 63) | 128));
                byteBuffer2.put(i12 + 3, (byte) ((c10 & '?') | 128));
            }
            aVarK.a(i11);
            if (i11 < 0) {
                throw new IllegalStateException("The returned value shouldn't be negative");
            }
            b();
            return this;
        } catch (Throwable th) {
            b();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        p086ga.d<a> pool = this.f34872b;
        a aVarP = p();
        if (aVarP == null) {
            return;
        }
        a aVarG = aVarP;
        do {
            try {
                j(aVarG.f34855a);
                aVarG = aVarG.g();
            } finally {
                i.e(pool, "pool");
                while (aVarP != null) {
                    a aVarF = aVarP.f();
                    aVarP.i(pool);
                    aVarP = aVarF;
                }
            }
        } while (aVarG != null);
    }

    @Override // java.lang.Appendable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public g append(CharSequence charSequence) {
        if (charSequence == null) {
            append("null", 0, 4);
        } else {
            append(charSequence, 0, charSequence.length());
        }
        return this;
    }

    @Override // java.lang.Appendable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public g append(CharSequence text, int i10, int i11) {
        int i12;
        if (text == null) {
            return append("null", i10, i11);
        }
        Charset charset = kotlin.text.a.f43120b;
        i.e(this, "<this>");
        i.e(text, "text");
        i.e(charset, "charset");
        if (charset == kotlin.text.a.f43120b) {
            a aVarD = p074fa.b.d(this, 1, null);
            while (true) {
                try {
                    int iF = Lb.a.f(aVarD.f34855a, text, i10, i11, aVarD.f34857c, aVarD.f34859e);
                    int i13 = ((short) (iF >>> 16)) & 65535;
                    i10 += i13;
                    aVarD.a(((short) (iF & 65535)) & 65535);
                    if (i13 != 0 || i10 >= i11) {
                        i12 = i10 < i11 ? 1 : 0;
                    } else {
                        i12 = 8;
                    }
                    if (i12 <= 0) {
                        break;
                    }
                    aVarD = p074fa.b.d(this, i12, aVarD);
                } catch (Throwable th) {
                    b();
                    throw th;
                }
            }
            b();
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
            i.d(charsetEncoderNewEncoder, "charset.newEncoder()");
            o.g(charsetEncoderNewEncoder, this, text, i10, i11);
        }
        return this;
    }

    public abstract void j(ByteBuffer byteBuffer);

    public final a k(int i10) throws EOFException {
        a aVar;
        int i11 = this.f34877g;
        int i12 = this.f34876f;
        if (i11 - i12 >= i10 && (aVar = this.f34874d) != null) {
            aVar.b(i12);
            return aVar;
        }
        a aVarY = this.f34872b.y();
        aVarY.e();
        if (aVarY.g() != null) {
            throw new IllegalStateException("It should be a single buffer chunk.");
        }
        a aVar2 = this.f34874d;
        if (aVar2 == null) {
            this.f34873c = aVarY;
            this.f34879i = 0;
        } else {
            aVar2.k(aVarY);
            int i13 = this.f34876f;
            aVar2.b(i13);
            this.f34879i = (i13 - this.f34878h) + this.f34879i;
        }
        this.f34874d = aVarY;
        this.f34879i += 0;
        this.f34875e = aVarY.f34855a;
        this.f34876f = aVarY.f34857c;
        this.f34878h = aVarY.f34856b;
        this.f34877g = aVarY.f34859e;
        return aVarY;
    }

    public final a p() throws EOFException {
        a aVar = this.f34873c;
        if (aVar == null) {
            return null;
        }
        a aVar2 = this.f34874d;
        if (aVar2 != null) {
            aVar2.b(this.f34876f);
        }
        this.f34873c = null;
        this.f34874d = null;
        this.f34876f = 0;
        this.f34877g = 0;
        this.f34878h = 0;
        this.f34879i = 0;
        this.f34875e = b.f22529a;
        return aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g() {
        this(b.f34861a);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a.f35063h;
    }
}
