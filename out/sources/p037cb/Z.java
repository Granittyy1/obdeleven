package p037cb;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.i;
import p011ab.e;
import p011ab.m;
import p011ab.n;

/* JADX INFO: compiled from: NothingSerialDescriptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Z implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z f22592a = new Z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n.d f22593b = n.d.f8127a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f22594c = "kotlin.Nothing";

    @Override // p011ab.e
    public final String a() {
        return f22594c;
    }

    @Override // p011ab.e
    public final boolean c() {
        return false;
    }

    @Override // p011ab.e
    public final int d(String name) {
        i.e(name, "name");
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // p011ab.e
    public final m e() {
        return f22593b;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // p011ab.e
    public final int f() {
        return 0;
    }

    @Override // p011ab.e
    public final String g(int i10) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // p011ab.e
    public final List<Annotation> getAnnotations() {
        return EmptyList.f42983b;
    }

    @Override // p011ab.e
    public final List<Annotation> h(int i10) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final int hashCode() {
        return (f22593b.hashCode() * 31) + f22594c.hashCode();
    }

    @Override // p011ab.e
    public final e i(int i10) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // p011ab.e
    public final boolean isInline() {
        return false;
    }

    @Override // p011ab.e
    public final boolean j(int i10) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final String toString() {
        return "NothingSerialDescriptor";
    }
}
