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
import p037cb.C1519d;

/* JADX INFO: renamed from: db.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2186c implements b<C2185b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2186c f34646a = new C2186c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f34647b = a.f34648b;

    /* JADX INFO: renamed from: db.c$a */
    /* JADX INFO: compiled from: JsonElementSerializers.kt */
    public static final class a implements e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f34648b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f34649c = "kotlinx.serialization.json.JsonArray";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1519d f34650a = Za.a.a(o.f34687a).f22602b;

        @Override // p011ab.e
        public final String a() {
            return f34649c;
        }

        @Override // p011ab.e
        public final boolean c() {
            this.f34650a.getClass();
            return false;
        }

        @Override // p011ab.e
        public final int d(String name) {
            i.e(name, "name");
            return this.f34650a.d(name);
        }

        @Override // p011ab.e
        public final m e() {
            this.f34650a.getClass();
            return n.b.f8125a;
        }

        @Override // p011ab.e
        public final int f() {
            this.f34650a.getClass();
            return 1;
        }

        @Override // p011ab.e
        public final String g(int i10) {
            this.f34650a.getClass();
            return String.valueOf(i10);
        }

        @Override // p011ab.e
        public final List<Annotation> getAnnotations() {
            this.f34650a.getClass();
            return EmptyList.f42983b;
        }

        @Override // p011ab.e
        public final List<Annotation> h(int i10) {
            return this.f34650a.h(i10);
        }

        @Override // p011ab.e
        public final e i(int i10) {
            return this.f34650a.i(i10);
        }

        @Override // p011ab.e
        public final boolean isInline() {
            this.f34650a.getClass();
            return false;
        }

        @Override // p011ab.e
        public final boolean j(int i10) {
            this.f34650a.j(i10);
            return false;
        }
    }

    @Override // Ya.a
    public final Object deserialize(c cVar) {
        p111ia.c.c(cVar);
        return new C2185b((List) Za.a.a(o.f34687a).deserialize(cVar));
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return f34647b;
    }

    @Override // Ya.l
    public final void serialize(d dVar, Object obj) {
        C2185b value = (C2185b) obj;
        i.e(value, "value");
        p111ia.c.b(dVar);
        Za.a.a(o.f34687a).serialize(dVar, value);
    }
}
