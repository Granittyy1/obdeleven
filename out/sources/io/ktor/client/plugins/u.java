package io.ktor.client.plugins;

import io.ktor.client.HttpClient;

/* JADX INFO: compiled from: HttpTimeout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f40400d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final io.ktor.util.a<u> f40401e = new io.ktor.util.a<>("TimeoutPlugin");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f40402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f40403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f40404c;

    /* JADX INFO: compiled from: HttpTimeout.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f40405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f40406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f40407c;

        public a() {
            this.f40405a = 0L;
            this.f40406b = 0L;
            this.f40407c = 0L;
            this.f40405a = null;
            this.f40406b = null;
            this.f40407c = null;
        }

        public static void a(Long l10) {
            if (l10 != null && l10.longValue() <= 0) {
                throw new IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeout.INFINITE_TIMEOUT_MS");
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.i.a(this.f40405a, aVar.f40405a) && kotlin.jvm.internal.i.a(this.f40406b, aVar.f40406b) && kotlin.jvm.internal.i.a(this.f40407c, aVar.f40407c);
        }

        public final int hashCode() {
            Long l10 = this.f40405a;
            int iHashCode = (l10 != null ? l10.hashCode() : 0) * 31;
            Long l11 = this.f40406b;
            int iHashCode2 = (iHashCode + (l11 != null ? l11.hashCode() : 0)) * 31;
            Long l12 = this.f40407c;
            return iHashCode2 + (l12 != null ? l12.hashCode() : 0);
        }
    }

    /* JADX INFO: compiled from: HttpTimeout.kt */
    public static final class b implements i<a, u>, io.ktor.client.engine.b<a> {
        @Override // io.ktor.client.plugins.i
        public final void a(u uVar, HttpClient scope) {
            u plugin = uVar;
            kotlin.jvm.internal.i.e(plugin, "plugin");
            kotlin.jvm.internal.i.e(scope, "scope");
            t.d dVar = t.f40392b;
            t tVar = (t) j.a(scope);
            tVar.f40394a.add(new HttpTimeout$Plugin$install$1(plugin, scope, null));
        }

        @Override // io.ktor.client.plugins.i
        public final u b(Ia.l<? super a, p293xa.r> lVar) {
            a aVar = new a();
            lVar.invoke(aVar);
            return new u(aVar.f40405a, aVar.f40406b, aVar.f40407c);
        }

        @Override // io.ktor.client.plugins.i
        public final io.ktor.util.a<u> getKey() {
            return u.f40401e;
        }
    }

    public u(Long l10, Long l11, Long l12) {
        this.f40402a = l10;
        this.f40403b = l11;
        this.f40404c = l12;
    }
}
