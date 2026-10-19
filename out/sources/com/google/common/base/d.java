package com.google.common.base;

import java.util.Arrays;

/* JADX INFO: compiled from: MoreObjects.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: compiled from: MoreObjects.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f27792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f27793b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f27794c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f27795d;

        /* JADX INFO: renamed from: com.google.common.base.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MoreObjects.java */
        public static final class C0277a extends b {
        }

        /* JADX INFO: compiled from: MoreObjects.java */
        public static class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f27796a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f27797b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public b f27798c;
        }

        public a(String str) {
            b bVar = new b();
            this.f27793b = bVar;
            this.f27794c = bVar;
            this.f27795d = false;
            this.f27792a = str;
        }

        public final void a(int i10, String str) {
            e(str, String.valueOf(i10));
        }

        public final void b(long j, String str) {
            e(str, String.valueOf(j));
        }

        public final void c(Object obj, String str) {
            b bVar = new b();
            this.f27794c.f27798c = bVar;
            this.f27794c = bVar;
            bVar.f27797b = obj;
            bVar.f27796a = str;
        }

        public final void d(String str, boolean z10) {
            e(str, String.valueOf(z10));
        }

        public final void e(String str, String str2) {
            C0277a c0277a = new C0277a();
            this.f27794c.f27798c = c0277a;
            this.f27794c = c0277a;
            c0277a.f27797b = str2;
            c0277a.f27796a = str;
        }

        public final String toString() {
            boolean z10 = this.f27795d;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f27792a);
            sb2.append('{');
            String str = "";
            for (b bVar = this.f27793b.f27798c; bVar != null; bVar = bVar.f27798c) {
                Object obj = bVar.f27797b;
                if ((bVar instanceof C0277a) || obj != null || !z10) {
                    sb2.append(str);
                    String str2 = bVar.f27796a;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static <T> T a(T t8, T t10) {
        if (t8 != null) {
            return t8;
        }
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static a b(Object obj) {
        return new a(obj.getClass().getSimpleName());
    }
}
