package io.grpc;

import com.google.common.collect.ImmutableMap;
import java.net.URI;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.logging.Logger;

/* JADX INFO: compiled from: NameResolverRegistry.java */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f38022e = Logger.getLogger(p.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static p f38023f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f38024a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f38025b = "unknown";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet<o> f38026c = new LinkedHashSet<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImmutableMap<String, o> f38027d = ImmutableMap.h();

    /* JADX INFO: compiled from: NameResolverRegistry.java */
    public final class a extends n.c {
        public a() {
        }

        @Override // io.grpc.n.c
        public final String a() {
            String str;
            synchronized (p.this) {
                str = p.this.f38025b;
            }
            return str;
        }

        @Override // io.grpc.n.c
        public final n b(URI uri, n.a aVar) {
            ImmutableMap<String, o> immutableMap;
            String scheme = uri.getScheme();
            if (scheme == null) {
                return null;
            }
            p pVar = p.this;
            synchronized (pVar) {
                immutableMap = pVar.f38027d;
            }
            o oVar = immutableMap.get(scheme.toLowerCase(Locale.US));
            if (oVar == null) {
                return null;
            }
            return oVar.b(uri, aVar);
        }
    }

    /* JADX INFO: compiled from: NameResolverRegistry.java */
    public static final class b implements r.a<o> {
        @Override // io.grpc.r.a
        public final boolean a(o oVar) {
            return oVar.c();
        }

        @Override // io.grpc.r.a
        public final int b(o oVar) {
            return oVar.d();
        }
    }

    public final synchronized void a() {
        try {
            HashMap map = new HashMap();
            String strA = "unknown";
            int iD = Integer.MIN_VALUE;
            for (o oVar : this.f38026c) {
                String strA2 = oVar.a();
                o oVar2 = (o) map.get(strA2);
                if (oVar2 == null || oVar2.d() < oVar.d()) {
                    map.put(strA2, oVar);
                }
                if (iD < oVar.d()) {
                    iD = oVar.d();
                    strA = oVar.a();
                }
            }
            this.f38027d = ImmutableMap.a(map);
            this.f38025b = strA;
        } catch (Throwable th) {
            throw th;
        }
    }
}
