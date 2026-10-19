package io.grpc;

import D9.w;
import io.grpc.internal.C2250v0;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import kotlinx.coroutines.C;

/* JADX INFO: compiled from: LoadBalancer.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final io.grpc.a.b<Map<String, ?>> f36970b = new io.grpc.a.b<>("internal:health-checking-config");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36971a;

    /* JADX INFO: compiled from: LoadBalancer.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<io.grpc.d> f36972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final io.grpc.a f36973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object[][] f36974c;

        /* JADX INFO: renamed from: io.grpc.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: LoadBalancer.java */
        public static final class C0389a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public List<io.grpc.d> f36975a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public io.grpc.a f36976b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Object[][] f36977c;
        }

        public a(List list, io.grpc.a aVar, Object[][] objArr) {
            A8.p.j(list, "addresses are not set");
            this.f36972a = list;
            A8.p.j(aVar, "attrs");
            this.f36973b = aVar;
            A8.p.j(objArr, "customOptions");
            this.f36974c = objArr;
        }

        public static C0389a a() {
            C0389a c0389a = new C0389a();
            c0389a.f36976b = io.grpc.a.f36932b;
            c0389a.f36977c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
            return c0389a;
        }

        public final String toString() {
            com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
            aVarB.c(this.f36972a, "addrs");
            aVarB.c(this.f36973b, "attrs");
            aVarB.c(Arrays.deepToString(this.f36974c), "customOptions");
            return aVarB.toString();
        }
    }

    /* JADX INFO: compiled from: LoadBalancer.java */
    public static abstract class b {
        public abstract i a(c cVar);
    }

    /* JADX INFO: compiled from: LoadBalancer.java */
    public static abstract class c {
        public abstract g a(a aVar);

        public abstract ChannelLogger b();

        public abstract ScheduledExecutorService c();

        public abstract w d();

        public abstract void e();

        public abstract void f(ConnectivityState connectivityState, h hVar);
    }

    /* JADX INFO: compiled from: LoadBalancer.java */
    public static final class d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f36978e = new d(null, null, Status.f36899e, false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f36979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final J9.g.C0056g.a f36980b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Status f36981c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f36982d;

        public d(g gVar, J9.g.C0056g.a aVar, Status status, boolean z10) {
            this.f36979a = gVar;
            this.f36980b = aVar;
            A8.p.j(status, "status");
            this.f36981c = status;
            this.f36982d = z10;
        }

        public static d a(Status status) {
            A8.p.f("error status shouldn't be OK", !status.f());
            return new d(null, null, status, false);
        }

        public static d b(g gVar, J9.g.C0056g.a aVar) {
            A8.p.j(gVar, "subchannel");
            return new d(gVar, aVar, Status.f36899e, false);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C.j(this.f36979a, dVar.f36979a) && C.j(this.f36981c, dVar.f36981c) && C.j(this.f36980b, dVar.f36980b) && this.f36982d == dVar.f36982d;
        }

        public final int hashCode() {
            Boolean boolValueOf = Boolean.valueOf(this.f36982d);
            return Arrays.hashCode(new Object[]{this.f36979a, this.f36981c, this.f36980b, boolValueOf});
        }

        public final String toString() {
            com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
            aVarB.c(this.f36979a, "subchannel");
            aVarB.c(this.f36980b, "streamTracerFactory");
            aVarB.c(this.f36981c, "status");
            aVarB.d("drop", this.f36982d);
            return aVarB.toString();
        }
    }

    /* JADX INFO: compiled from: LoadBalancer.java */
    public static abstract class e {
    }

    /* JADX INFO: compiled from: LoadBalancer.java */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<io.grpc.d> f36983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final io.grpc.a f36984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f36985c;

        public f() {
            throw null;
        }

        public f(List list, io.grpc.a aVar, Object obj) {
            A8.p.j(list, "addresses");
            this.f36983a = Collections.unmodifiableList(new ArrayList(list));
            A8.p.j(aVar, "attributes");
            this.f36984b = aVar;
            this.f36985c = obj;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return C.j(this.f36983a, fVar.f36983a) && C.j(this.f36984b, fVar.f36984b) && C.j(this.f36985c, fVar.f36985c);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f36983a, this.f36984b, this.f36985c});
        }

        public final String toString() {
            com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
            aVarB.c(this.f36983a, "addresses");
            aVarB.c(this.f36984b, "attributes");
            aVarB.c(this.f36985c, "loadBalancingPolicyConfig");
            return aVarB.toString();
        }
    }

    /* JADX INFO: compiled from: LoadBalancer.java */
    public static abstract class g {
        public final io.grpc.d a() {
            List<io.grpc.d> listB = b();
            A8.p.o(listB, "%s does not have exactly one group", listB.size() == 1);
            return listB.get(0);
        }

        public List<io.grpc.d> b() {
            throw new UnsupportedOperationException();
        }

        public abstract io.grpc.a c();

        public ChannelLogger d() {
            throw new UnsupportedOperationException();
        }

        public Object e() {
            throw new UnsupportedOperationException();
        }

        public abstract void f();

        public abstract void g();

        public void h(InterfaceC0390i interfaceC0390i) {
            throw new UnsupportedOperationException("Not implemented");
        }

        public void i(List<io.grpc.d> list) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: LoadBalancer.java */
    public static abstract class h {
        public abstract d a(C2250v0 c2250v0);
    }

    /* JADX INFO: renamed from: io.grpc.i$i, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LoadBalancer.java */
    public interface InterfaceC0390i {
        void a(D9.h hVar);
    }

    public boolean a(f fVar) {
        List<io.grpc.d> list = fVar.f36983a;
        if (!list.isEmpty() || b()) {
            int i10 = this.f36971a;
            this.f36971a = i10 + 1;
            if (i10 == 0) {
                d(fVar);
            }
            this.f36971a = 0;
            return true;
        }
        c(Status.f36905l.h("NameResolver returned no usable address. addrs=" + list + ", attrs=" + fVar.f36984b));
        return false;
    }

    public boolean b() {
        return false;
    }

    public abstract void c(Status status);

    public void d(f fVar) {
        int i10 = this.f36971a;
        this.f36971a = i10 + 1;
        if (i10 == 0) {
            a(fVar);
        }
        this.f36971a = 0;
    }

    public abstract void e();
}
