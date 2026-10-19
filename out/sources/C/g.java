package C;

import android.graphics.Typeface;
import androidx.compose.ui.modifier.h;
import com.parse.boltsinternal.Task;
import io.grpc.Status;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlinx.serialization.SerializationException;
import p037cb.C1542o0;
import p078g1.s;

/* JADX INFO: compiled from: Operations.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class g implements W.d, p024bb.c, p024bb.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile M7.a.C0067a f2280b;

    public static float N(float f10, float f11, float f12) {
        return 1.0f - ((f10 - f12) / (f11 - f12));
    }

    @Override // p024bb.a
    public long A(p011ab.e descriptor, int i10) {
        i.e(descriptor, "descriptor");
        return s();
    }

    @Override // p024bb.a
    public short B(C1542o0 descriptor, int i10) {
        i.e(descriptor, "descriptor");
        return D();
    }

    @Override // p024bb.c
    public abstract byte C();

    @Override // p024bb.c
    public abstract short D();

    @Override // p024bb.c
    public float E() {
        L();
        throw null;
    }

    @Override // p024bb.a
    public byte F(C1542o0 descriptor, int i10) {
        i.e(descriptor, "descriptor");
        return C();
    }

    @Override // p024bb.a
    public p024bb.c G(C1542o0 descriptor, int i10) {
        i.e(descriptor, "descriptor");
        return r(descriptor.i(i10));
    }

    @Override // p024bb.c
    public double H() {
        L();
        throw null;
    }

    public abstract boolean I(androidx.compose.ui.modifier.c cVar);

    public s J(J1.a aVar) {
        ByteBuffer byteBuffer = aVar.f17941e;
        byteBuffer.getClass();
        p241t7.b.e(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return K(aVar, byteBuffer);
    }

    public abstract s K(J1.a aVar, ByteBuffer byteBuffer);

    public void L() {
        throw new SerializationException(l.a(getClass()) + " can't retrieve untyped values");
    }

    public abstract Object M(h hVar);

    public abstract Ya.b O(Oa.c cVar, List list);

    public String P() {
        return null;
    }

    public abstract Task Q();

    public String R() {
        return null;
    }

    public abstract Ya.a S(Oa.c cVar, String str);

    public abstract Ya.l T(Oa.c cVar, Object obj);

    public abstract int Y(int i10);

    public abstract void Z(int i10);

    @Override // p024bb.c
    public p024bb.a a(p011ab.e descriptor) {
        i.e(descriptor, "descriptor");
        return this;
    }

    public abstract void a0(Typeface typeface, boolean z10);

    @Override // p024bb.a
    public void c(p011ab.e descriptor) {
        i.e(descriptor, "descriptor");
    }

    @Override // p024bb.a
    public Object d(p011ab.e descriptor, int i10, Ya.a deserializer, Object obj) {
        i.e(descriptor, "descriptor");
        i.e(deserializer, "deserializer");
        if (deserializer.getDescriptor().c() || t()) {
            return m(deserializer);
        }
        return null;
    }

    @Override // p024bb.a
    public Object e(p011ab.e descriptor, int i10, Ya.a deserializer, Object obj) {
        i.e(descriptor, "descriptor");
        i.e(deserializer, "deserializer");
        return m(deserializer);
    }

    @Override // p024bb.c
    public boolean f() {
        L();
        throw null;
    }

    public abstract int f0(int i10);

    @Override // p024bb.c
    public char g() {
        L();
        throw null;
    }

    @Override // p024bb.a
    public int h(p011ab.e descriptor, int i10) {
        i.e(descriptor, "descriptor");
        return k();
    }

    public abstract void h0();

    @Override // p024bb.a
    public String j(p011ab.e descriptor, int i10) {
        i.e(descriptor, "descriptor");
        return n();
    }

    @Override // p024bb.c
    public abstract int k();

    @Override // p024bb.a
    public boolean l(p011ab.e descriptor, int i10) {
        i.e(descriptor, "descriptor");
        return f();
    }

    @Override // p024bb.c
    public Object m(Ya.a deserializer) {
        i.e(deserializer, "deserializer");
        return deserializer.deserialize(this);
    }

    @Override // p024bb.c
    public String n() {
        L();
        throw null;
    }

    @Override // W.d
    public int p(int i10) {
        int iY = Y(i10);
        if (iY == -1 || Y(iY) == -1) {
            return -1;
        }
        return iY;
    }

    @Override // W.d
    public int q(int i10) {
        int iF0 = f0(i10);
        if (iF0 == -1 || f0(iF0) == -1) {
            return -1;
        }
        return iF0;
    }

    @Override // p024bb.c
    public p024bb.c r(p011ab.e descriptor) {
        i.e(descriptor, "descriptor");
        return this;
    }

    @Override // p024bb.c
    public abstract long s();

    @Override // p024bb.c
    public boolean t() {
        return true;
    }

    @Override // p024bb.a
    public char u(C1542o0 descriptor, int i10) {
        i.e(descriptor, "descriptor");
        return g();
    }

    @Override // p024bb.a
    public float v(C1542o0 descriptor, int i10) {
        i.e(descriptor, "descriptor");
        return E();
    }

    @Override // p024bb.c
    public int w(p011ab.e enumDescriptor) {
        i.e(enumDescriptor, "enumDescriptor");
        L();
        throw null;
    }

    @Override // p024bb.a
    public double x(C1542o0 descriptor, int i10) {
        i.e(descriptor, "descriptor");
        return H();
    }

    @Override // W.d
    public int y(int i10) {
        return f0(i10);
    }

    @Override // W.d
    public int z(int i10) {
        return Y(i10);
    }

    public void U(int i10) {
    }

    public void W(long j) {
    }

    public void X(long j) {
    }

    public void b0(int i10) {
    }

    public void d0(long j) {
    }

    public void e0(long j) {
    }

    public void g0(Status status) {
    }

    public void V(int i10, long j) {
    }

    public void c0(int i10, long j, long j10) {
    }
}
