package io.grpc.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: compiled from: CompositeReadableBuffer.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends AbstractC2212c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f37677f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f37678g = new b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f37679h = new c();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f37680i = new d();
    public static final e j = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f37681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayDeque f37682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f37684e;

    /* JADX INFO: compiled from: CompositeReadableBuffer.java */
    public class a implements f<Void> {
        @Override // io.grpc.internal.r.g
        public final int a(x0 x0Var, int i10, Object obj, int i11) {
            return x0Var.readUnsignedByte();
        }
    }

    /* JADX INFO: compiled from: CompositeReadableBuffer.java */
    public class b implements f<Void> {
        @Override // io.grpc.internal.r.g
        public final int a(x0 x0Var, int i10, Object obj, int i11) {
            x0Var.skipBytes(i10);
            return 0;
        }
    }

    /* JADX INFO: compiled from: CompositeReadableBuffer.java */
    public class c implements f<byte[]> {
        @Override // io.grpc.internal.r.g
        public final int a(x0 x0Var, int i10, Object obj, int i11) {
            x0Var.e0((byte[]) obj, i11, i10);
            return i11 + i10;
        }
    }

    /* JADX INFO: compiled from: CompositeReadableBuffer.java */
    public class d implements f<ByteBuffer> {
        @Override // io.grpc.internal.r.g
        public final int a(x0 x0Var, int i10, Object obj, int i11) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            int iLimit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + i10);
            x0Var.O0(byteBuffer);
            byteBuffer.limit(iLimit);
            return 0;
        }
    }

    /* JADX INFO: compiled from: CompositeReadableBuffer.java */
    public class e implements g<OutputStream> {
        @Override // io.grpc.internal.r.g
        public final int a(x0 x0Var, int i10, OutputStream outputStream, int i11) throws IOException {
            x0Var.D0(outputStream, i10);
            return 0;
        }
    }

    /* JADX INFO: compiled from: CompositeReadableBuffer.java */
    public interface f<T> extends g<T> {
    }

    /* JADX INFO: compiled from: CompositeReadableBuffer.java */
    public interface g<T> {
        int a(x0 x0Var, int i10, T t8, int i11) throws IOException;
    }

    public r() {
        this.f37681b = new ArrayDeque();
    }

    @Override // io.grpc.internal.x0
    public final void D0(OutputStream outputStream, int i10) throws IOException {
        i(j, i10, outputStream, 0);
    }

    @Override // io.grpc.internal.x0
    public final void O0(ByteBuffer byteBuffer) {
        j(f37680i, byteBuffer.remaining(), byteBuffer, 0);
    }

    public final void c(x0 x0Var) throws IOException {
        boolean z10 = this.f37684e;
        ArrayDeque arrayDeque = this.f37681b;
        boolean z11 = z10 && arrayDeque.isEmpty();
        if (x0Var instanceof r) {
            r rVar = (r) x0Var;
            while (!rVar.f37681b.isEmpty()) {
                arrayDeque.add((x0) rVar.f37681b.remove());
            }
            this.f37683d += rVar.f37683d;
            rVar.f37683d = 0;
            rVar.close();
        } else {
            arrayDeque.add(x0Var);
            this.f37683d = x0Var.e() + this.f37683d;
        }
        if (z11) {
            ((x0) arrayDeque.peek()).i0();
        }
    }

    @Override // io.grpc.internal.AbstractC2212c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        while (true) {
            ArrayDeque arrayDeque = this.f37681b;
            if (arrayDeque.isEmpty()) {
                break;
            } else {
                ((x0) arrayDeque.remove()).close();
            }
        }
        if (this.f37682c != null) {
            while (!this.f37682c.isEmpty()) {
                ((x0) this.f37682c.remove()).close();
            }
        }
    }

    @Override // io.grpc.internal.x0
    public final int e() {
        return this.f37683d;
    }

    @Override // io.grpc.internal.x0
    public final void e0(byte[] bArr, int i10, int i11) {
        j(f37679h, i11, bArr, i10);
    }

    public final void h() throws IOException {
        boolean z10 = this.f37684e;
        ArrayDeque arrayDeque = this.f37681b;
        if (!z10) {
            ((x0) arrayDeque.remove()).close();
            return;
        }
        this.f37682c.add((x0) arrayDeque.remove());
        x0 x0Var = (x0) arrayDeque.peek();
        if (x0Var != null) {
            x0Var.i0();
        }
    }

    public final <T> int i(g<T> gVar, int i10, T t8, int i11) throws IOException {
        b(i10);
        ArrayDeque arrayDeque = this.f37681b;
        if (!arrayDeque.isEmpty() && ((x0) arrayDeque.peek()).e() == 0) {
            h();
        }
        while (i10 > 0 && !arrayDeque.isEmpty()) {
            x0 x0Var = (x0) arrayDeque.peek();
            int iMin = Math.min(i10, x0Var.e());
            i11 = gVar.a(x0Var, iMin, t8, i11);
            i10 -= iMin;
            this.f37683d -= iMin;
            if (((x0) arrayDeque.peek()).e() == 0) {
                h();
            }
        }
        if (i10 <= 0) {
            return i11;
        }
        throw new AssertionError("Failed executing read operation");
    }

    @Override // io.grpc.internal.AbstractC2212c, io.grpc.internal.x0
    public final void i0() throws IOException {
        ArrayDeque arrayDeque = this.f37682c;
        ArrayDeque arrayDeque2 = this.f37681b;
        if (arrayDeque == null) {
            this.f37682c = new ArrayDeque(Math.min(arrayDeque2.size(), 16));
        }
        while (!this.f37682c.isEmpty()) {
            ((x0) this.f37682c.remove()).close();
        }
        this.f37684e = true;
        x0 x0Var = (x0) arrayDeque2.peek();
        if (x0Var != null) {
            x0Var.i0();
        }
    }

    public final <T> int j(f<T> fVar, int i10, T t8, int i11) {
        try {
            return i(fVar, i10, t8, i11);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // io.grpc.internal.AbstractC2212c, io.grpc.internal.x0
    public final boolean markSupported() {
        Iterator it = this.f37681b.iterator();
        while (it.hasNext()) {
            if (!((x0) it.next()).markSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // io.grpc.internal.x0
    public final int readUnsignedByte() {
        return j(f37677f, 1, null, 0);
    }

    @Override // io.grpc.internal.AbstractC2212c, io.grpc.internal.x0
    public final void reset() {
        if (!this.f37684e) {
            throw new InvalidMarkException();
        }
        ArrayDeque arrayDeque = this.f37681b;
        x0 x0Var = (x0) arrayDeque.peek();
        if (x0Var != null) {
            int iE = x0Var.e();
            x0Var.reset();
            this.f37683d = (x0Var.e() - iE) + this.f37683d;
        }
        while (true) {
            x0 x0Var2 = (x0) this.f37682c.pollLast();
            if (x0Var2 == null) {
                return;
            }
            x0Var2.reset();
            arrayDeque.addFirst(x0Var2);
            this.f37683d = x0Var2.e() + this.f37683d;
        }
    }

    @Override // io.grpc.internal.x0
    public final void skipBytes(int i10) {
        j(f37678g, i10, null, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [io.grpc.internal.x0] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [io.grpc.internal.x0] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [io.grpc.internal.r] */
    /* JADX WARN: Type inference failed for: r1v3, types: [io.grpc.internal.r] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // io.grpc.internal.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.grpc.internal.x0 w(int r8) throws java.io.IOException {
        /*
            r7 = this;
            if (r8 > 0) goto L5
            io.grpc.internal.y0$b r8 = io.grpc.internal.y0.f37743a
            return r8
        L5:
            r7.b(r8)
            int r0 = r7.f37683d
            int r0 = r0 - r8
            r7.f37683d = r0
            r0 = 0
            r1 = r0
        Lf:
            java.util.ArrayDeque r2 = r7.f37681b
            java.lang.Object r3 = r2.peek()
            io.grpc.internal.x0 r3 = (io.grpc.internal.x0) r3
            int r4 = r3.e()
            if (r4 <= r8) goto L23
            io.grpc.internal.x0 r8 = r3.w(r8)
            r3 = 0
            goto L39
        L23:
            boolean r5 = r7.f37684e
            if (r5 == 0) goto L2f
            io.grpc.internal.x0 r3 = r3.w(r4)
            r7.h()
            goto L35
        L2f:
            java.lang.Object r3 = r2.poll()
            io.grpc.internal.x0 r3 = (io.grpc.internal.x0) r3
        L35:
            int r8 = r8 - r4
            r6 = r3
            r3 = r8
            r8 = r6
        L39:
            if (r0 != 0) goto L3d
            r0 = r8
            goto L5a
        L3d:
            if (r1 != 0) goto L57
            io.grpc.internal.r r1 = new io.grpc.internal.r
            r4 = 2
            if (r3 != 0) goto L45
            goto L50
        L45:
            int r2 = r2.size()
            int r2 = r2 + r4
            r4 = 16
            int r4 = java.lang.Math.min(r2, r4)
        L50:
            r1.<init>(r4)
            r1.c(r0)
            r0 = r1
        L57:
            r1.c(r8)
        L5a:
            if (r3 > 0) goto L5d
            return r0
        L5d:
            r8 = r3
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.r.w(int):io.grpc.internal.x0");
    }

    public r(int i10) {
        this.f37681b = new ArrayDeque(i10);
    }
}
