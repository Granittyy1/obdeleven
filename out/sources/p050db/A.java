package p050db;

import Ya.b;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.i;
import p011ab.e;
import p011ab.m;
import p011ab.n;
import p024bb.c;
import p024bb.d;
import p037cb.K;
import p037cb.y0;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class A implements b<z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A f34634a = new A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f34635b = a.f34636b;

    /* JADX INFO: compiled from: JsonElementSerializers.kt */
    public static final class a implements e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f34636b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f34637c = "kotlinx.serialization.json.JsonObject";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ K f34638a = Za.a.b(y0.f22677a, o.f34687a).f22564c;

        @Override // p011ab.e
        public final String a() {
            return f34637c;
        }

        @Override // p011ab.e
        public final boolean c() {
            this.f34638a.getClass();
            return false;
        }

        @Override // p011ab.e
        public final int d(String name) {
            i.e(name, "name");
            return this.f34638a.d(name);
        }

        @Override // p011ab.e
        public final m e() {
            this.f34638a.getClass();
            return n.c.f8126a;
        }

        @Override // p011ab.e
        public final int f() {
            this.f34638a.getClass();
            return 2;
        }

        @Override // p011ab.e
        public final String g(int i10) {
            this.f34638a.getClass();
            return String.valueOf(i10);
        }

        @Override // p011ab.e
        public final List<Annotation> getAnnotations() {
            this.f34638a.getClass();
            return EmptyList.f42983b;
        }

        @Override // p011ab.e
        public final List<Annotation> h(int i10) {
            return this.f34638a.h(i10);
        }

        @Override // p011ab.e
        public final e i(int i10) {
            return this.f34638a.i(i10);
        }

        @Override // p011ab.e
        public final boolean isInline() {
            this.f34638a.getClass();
            return false;
        }

        @Override // p011ab.e
        public final boolean j(int i10) {
            this.f34638a.j(i10);
            return false;
        }
    }

    @Override // Ya.a
    public final Object deserialize(c cVar) {
        p111ia.c.c(cVar);
        return new z(Za.a.b(y0.f22677a, o.f34687a).deserialize(cVar));
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return f34635b;
    }

    @Override // Ya.l
    public final void serialize(d dVar, Object obj) {
        z value = (z) obj;
        i.e(value, "value");
        p111ia.c.b(dVar);
        Za.a.b(y0.f22677a, o.f34687a).serialize(dVar, value);
    }
}
