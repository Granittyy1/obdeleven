package io.grpc;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: CallOptions.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f36937h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D9.j f36938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f36939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[][] f36940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<c.a> f36941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f36942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f36943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f36944g;

    /* JADX INFO: compiled from: CallOptions.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public D9.j f36945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Executor f36946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object[][] f36947c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List<c.a> f36948d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Boolean f36949e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Integer f36950f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Integer f36951g;
    }

    /* JADX INFO: renamed from: io.grpc.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CallOptions.java */
    public static final class C0388b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f36952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Boolean f36953b;

        public C0388b(String str, Boolean bool) {
            this.f36952a = str;
            this.f36953b = bool;
        }

        public final String toString() {
            return this.f36952a;
        }
    }

    static {
        a aVar = new a();
        aVar.f36947c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        aVar.f36948d = Collections.emptyList();
        f36937h = new b(aVar);
    }

    public b(a aVar) {
        this.f36938a = aVar.f36945a;
        this.f36939b = aVar.f36946b;
        this.f36940c = aVar.f36947c;
        this.f36941d = aVar.f36948d;
        this.f36942e = aVar.f36949e;
        this.f36943f = aVar.f36950f;
        this.f36944g = aVar.f36951g;
    }

    public static a b(b bVar) {
        a aVar = new a();
        aVar.f36945a = bVar.f36938a;
        aVar.f36946b = bVar.f36939b;
        aVar.f36947c = bVar.f36940c;
        aVar.f36948d = bVar.f36941d;
        aVar.f36949e = bVar.f36942e;
        aVar.f36950f = bVar.f36943f;
        aVar.f36951g = bVar.f36944g;
        return aVar;
    }

    public final <T> T a(C0388b<T> c0388b) {
        A8.p.j(c0388b, "key");
        int i10 = 0;
        while (true) {
            Object[][] objArr = this.f36940c;
            if (i10 >= objArr.length) {
                return (T) c0388b.f36953b;
            }
            if (c0388b.equals(objArr[i10][0])) {
                return (T) objArr[i10][1];
            }
            i10++;
        }
    }

    public final <T> b c(C0388b<T> c0388b, T t8) {
        Object[][] objArr;
        A8.p.j(c0388b, "key");
        a aVarB = b(this);
        int i10 = 0;
        while (true) {
            objArr = this.f36940c;
            if (i10 >= objArr.length) {
                i10 = -1;
                break;
            }
            if (c0388b.equals(objArr[i10][0])) {
                break;
            }
            i10++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length + (i10 == -1 ? 1 : 0), 2);
        aVarB.f36947c = objArr2;
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        if (i10 == -1) {
            aVarB.f36947c[objArr.length] = new Object[]{c0388b, t8};
        } else {
            aVarB.f36947c[i10] = new Object[]{c0388b, t8};
        }
        return new b(aVarB);
    }

    public final String toString() {
        com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
        aVarB.c(this.f36938a, "deadline");
        aVarB.c(null, "authority");
        aVarB.c(null, "callCredentials");
        Executor executor = this.f36939b;
        aVarB.c(executor != null ? executor.getClass() : null, "executor");
        aVarB.c(null, "compressorName");
        aVarB.c(Arrays.deepToString(this.f36940c), "customOptions");
        aVarB.d("waitForReady", Boolean.TRUE.equals(this.f36942e));
        aVarB.c(this.f36943f, "maxInboundMessageSize");
        aVarB.c(this.f36944g, "maxOutboundMessageSize");
        aVarB.c(this.f36941d, "streamTracerFactories");
        return aVarB.toString();
    }
}
