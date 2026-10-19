package p037cb;

import B7.b;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.i;
import p011ab.d;
import p011ab.e;
import p011ab.m;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class q0 implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f22646b;

    public q0(String str, d kind) {
        i.e(kind, "kind");
        this.f22645a = str;
        this.f22646b = kind;
    }

    @Override // p011ab.e
    public final String a() {
        return this.f22645a;
    }

    @Override // p011ab.e
    public final boolean c() {
        return false;
    }

    @Override // p011ab.e
    public final int d(String name) {
        i.e(name, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // p011ab.e
    public final m e() {
        return this.f22646b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (i.a(this.f22645a, q0Var.f22645a)) {
            if (i.a(this.f22646b, q0Var.f22646b)) {
                return true;
            }
        }
        return false;
    }

    @Override // p011ab.e
    public final int f() {
        return 0;
    }

    @Override // p011ab.e
    public final String g(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // p011ab.e
    public final List<Annotation> getAnnotations() {
        return EmptyList.f42983b;
    }

    @Override // p011ab.e
    public final List<Annotation> h(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.f22646b.hashCode() * 31) + this.f22645a.hashCode();
    }

    @Override // p011ab.e
    public final e i(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // p011ab.e
    public final boolean isInline() {
        return false;
    }

    @Override // p011ab.e
    public final boolean j(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return b.g(new StringBuilder("PrimitiveDescriptor("), this.f22645a, ')');
    }
}
