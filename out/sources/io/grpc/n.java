package io.grpc;

import D9.w;
import io.grpc.internal.C2228k;
import io.grpc.internal.H0;
import io.grpc.internal.ManagedChannelImpl;
import io.grpc.internal.w0;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.C;

/* JADX INFO: compiled from: NameResolver.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    /* JADX INFO: compiled from: NameResolver.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f37791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final w0 f37792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final w f37793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final H0 f37794d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ManagedChannelImpl.m f37795e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final C2228k f37796f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ManagedChannelImpl.g f37797g;

        public a(Integer num, w0 w0Var, w wVar, H0 h8, ManagedChannelImpl.m mVar, C2228k c2228k, ManagedChannelImpl.g gVar) {
            A8.p.j(num, "defaultPort not set");
            this.f37791a = num.intValue();
            A8.p.j(w0Var, "proxyDetector not set");
            this.f37792b = w0Var;
            this.f37793c = wVar;
            this.f37794d = h8;
            this.f37795e = mVar;
            this.f37796f = c2228k;
            this.f37797g = gVar;
        }

        public final String toString() {
            com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
            aVarB.a(this.f37791a, "defaultPort");
            aVarB.c(this.f37792b, "proxyDetector");
            aVarB.c(this.f37793c, "syncContext");
            aVarB.c(this.f37794d, "serviceConfigParser");
            aVarB.c(this.f37795e, "scheduledExecutorService");
            aVarB.c(this.f37796f, "channelLogger");
            aVarB.c(this.f37797g, "executor");
            aVarB.c(null, "overrideAuthority");
            return aVarB.toString();
        }
    }

    /* JADX INFO: compiled from: NameResolver.java */
    public static abstract class c {
        public abstract String a();

        public abstract n b(URI uri, a aVar);
    }

    /* JADX INFO: compiled from: NameResolver.java */
    public static abstract class d implements e {
        public abstract void b(f fVar);
    }

    /* JADX INFO: compiled from: NameResolver.java */
    public interface e {
        void a(Status status);
    }

    /* JADX INFO: compiled from: NameResolver.java */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<io.grpc.d> f37800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final io.grpc.a f37801b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f37802c;

        public f(List<io.grpc.d> list, io.grpc.a aVar, b bVar) {
            this.f37800a = Collections.unmodifiableList(new ArrayList(list));
            A8.p.j(aVar, "attributes");
            this.f37801b = aVar;
            this.f37802c = bVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return C.j(this.f37800a, fVar.f37800a) && C.j(this.f37801b, fVar.f37801b) && C.j(this.f37802c, fVar.f37802c);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f37800a, this.f37801b, this.f37802c});
        }

        public final String toString() {
            com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
            aVarB.c(this.f37800a, "addresses");
            aVarB.c(this.f37801b, "attributes");
            aVarB.c(this.f37802c, "serviceConfig");
            return aVarB.toString();
        }
    }

    /* JADX INFO: compiled from: NameResolver.java */
    public static abstract class g {
    }

    public abstract String a();

    public abstract void b();

    public abstract void c();

    public abstract void d(d dVar);

    /* JADX INFO: compiled from: NameResolver.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Status f37798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f37799b;

        public b(Object obj) {
            this.f37799b = obj;
            this.f37798a = null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return C.j(this.f37798a, bVar.f37798a) && C.j(this.f37799b, bVar.f37799b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f37798a, this.f37799b});
        }

        public final String toString() {
            Object obj = this.f37799b;
            if (obj != null) {
                com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
                aVarB.c(obj, "config");
                return aVarB.toString();
            }
            com.google.common.base.d.a aVarB2 = com.google.common.base.d.b(this);
            aVarB2.c(this.f37798a, "error");
            return aVarB2.toString();
        }

        public b(Status status) {
            this.f37799b = null;
            A8.p.j(status, "status");
            this.f37798a = status;
            A8.p.e(status, "cannot use OK status: %s", !status.f());
        }
    }
}
