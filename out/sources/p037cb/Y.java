package p037cb;

import java.util.ArrayList;
import kotlin.collections.l;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import p011ab.e;
import p024bb.a;
import p024bb.c;

/* JADX INFO: compiled from: Tagged.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Y implements c, a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<String> f22590b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22591c;

    @Override // p024bb.a
    public final long A(e descriptor, int i10) {
        i.e(descriptor, "descriptor");
        return M(Q(descriptor, i10));
    }

    @Override // p024bb.a
    public final short B(C1542o0 descriptor, int i10) {
        i.e(descriptor, "descriptor");
        return N(Q(descriptor, i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p024bb.c
    public final byte C() {
        return q(R());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p024bb.c
    public final short D() {
        return N(R());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p024bb.c
    public final float E() {
        return J(R());
    }

    @Override // p024bb.a
    public final byte F(C1542o0 descriptor, int i10) {
        i.e(descriptor, "descriptor");
        return q(Q(descriptor, i10));
    }

    @Override // p024bb.a
    public final c G(C1542o0 descriptor, int i10) {
        i.e(descriptor, "descriptor");
        return K(Q(descriptor, i10), descriptor.i(i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p024bb.c
    public final double H() {
        return z(R());
    }

    public abstract int I(String str, e eVar);

    public abstract float J(String str);

    public abstract c K(String str, e eVar);

    public abstract int L(String str);

    public abstract long M(String str);

    public abstract short N(String str);

    public abstract String O(String str);

    public String P(e descriptor, int i10) {
        i.e(descriptor, "descriptor");
        return descriptor.g(i10);
    }

    public final String Q(e eVar, int i10) {
        i.e(eVar, "<this>");
        String nestedName = P(eVar, i10);
        i.e(nestedName, "nestedName");
        return nestedName;
    }

    public final String R() {
        ArrayList<String> arrayList = this.f22590b;
        String strRemove = arrayList.remove(l.r(arrayList));
        this.f22591c = true;
        return strRemove;
    }

    public final String S() {
        ArrayList<String> arrayList = this.f22590b;
        return arrayList.isEmpty() ? "$" : q.U(arrayList, ".", "$.", null, null, 60);
    }

    @Override // p024bb.a
    public final <T> T d(e descriptor, int i10, Ya.a<? extends T> deserializer, T t8) {
        i.e(descriptor, "descriptor");
        i.e(deserializer, "deserializer");
        this.f22590b.add(Q(descriptor, i10));
        T t10 = (deserializer.getDescriptor().c() || t()) ? (T) m(deserializer) : null;
        if (!this.f22591c) {
            R();
        }
        this.f22591c = false;
        return t10;
    }

    @Override // p024bb.a
    public final <T> T e(e descriptor, int i10, Ya.a<? extends T> deserializer, T t8) {
        i.e(descriptor, "descriptor");
        i.e(deserializer, "deserializer");
        this.f22590b.add(Q(descriptor, i10));
        i.e(deserializer, "deserializer");
        T t10 = (T) m(deserializer);
        if (!this.f22591c) {
            R();
        }
        this.f22591c = false;
        return t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p024bb.c
    public final boolean f() {
        return p(R());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p024bb.c
    public final char g() {
        return y(R());
    }

    @Override // p024bb.a
    public final int h(e descriptor, int i10) {
        i.e(descriptor, "descriptor");
        return L(Q(descriptor, i10));
    }

    @Override // p024bb.a
    public final String j(e descriptor, int i10) {
        i.e(descriptor, "descriptor");
        return O(Q(descriptor, i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p024bb.c
    public final int k() {
        return L(R());
    }

    @Override // p024bb.a
    public final boolean l(e descriptor, int i10) {
        i.e(descriptor, "descriptor");
        return p(Q(descriptor, i10));
    }

    @Override // p024bb.c
    public abstract <T> T m(Ya.a<? extends T> aVar);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p024bb.c
    public final String n() {
        return O(R());
    }

    public abstract boolean p(String str);

    public abstract byte q(String str);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p024bb.c
    public c r(e descriptor) {
        i.e(descriptor, "descriptor");
        return K(R(), descriptor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p024bb.c
    public final long s() {
        return M(R());
    }

    @Override // p024bb.a
    public final char u(C1542o0 descriptor, int i10) {
        i.e(descriptor, "descriptor");
        return y(Q(descriptor, i10));
    }

    @Override // p024bb.a
    public final float v(C1542o0 descriptor, int i10) {
        i.e(descriptor, "descriptor");
        return J(Q(descriptor, i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p024bb.c
    public final int w(e enumDescriptor) {
        i.e(enumDescriptor, "enumDescriptor");
        return I(R(), enumDescriptor);
    }

    @Override // p024bb.a
    public final double x(C1542o0 descriptor, int i10) {
        i.e(descriptor, "descriptor");
        return z(Q(descriptor, i10));
    }

    public abstract char y(String str);

    public abstract double z(String str);
}
