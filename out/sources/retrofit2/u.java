package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: RequestFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f46786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f46787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final okhttp3.p f46788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f46790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final okhttp3.o f46791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final okhttp3.r f46792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f46793h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f46794i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q<?>[] f46795k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f46796l;

    /* JADX INFO: compiled from: RequestFactory.java */
    public static final class a {

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final Pattern f46797y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final Pattern f46798z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w f46799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<?> f46800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f46801c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Annotation[] f46802d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Annotation[][] f46803e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Type[] f46804f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f46805g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f46806h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f46807i;
        public boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f46808k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f46809l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f46810m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f46811n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f46812o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f46813p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f46814q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f46815r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public String f46816s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public okhttp3.o f46817t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public okhttp3.r f46818u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public LinkedHashSet f46819v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public q<?>[] f46820w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f46821x;

        public a(w wVar, Class<?> cls, Method method) {
            this.f46799a = wVar;
            this.f46800b = cls;
            this.f46801c = method;
            this.f46802d = method.getAnnotations();
            this.f46804f = method.getGenericParameterTypes();
            this.f46803e = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            return Short.TYPE == cls ? Short.class : cls;
        }

        public final void b(String str, String str2, boolean z10) {
            String str3 = this.f46812o;
            Method method = this.f46801c;
            if (str3 != null) {
                throw A.j(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f46812o = str;
            this.f46813p = z10;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            Pattern pattern = f46797y;
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (pattern.matcher(strSubstring).find()) {
                    throw A.j(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f46816s = str2;
            Matcher matcher = pattern.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            this.f46819v = linkedHashSet;
        }

        public final void c(int i10, Type type) {
            if (A.g(type)) {
                throw A.k(this.f46801c, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public u(a aVar) {
        this.f46786a = aVar.f46800b;
        this.f46787b = aVar.f46801c;
        this.f46788c = aVar.f46799a.f46827c;
        this.f46789d = aVar.f46812o;
        this.f46790e = aVar.f46816s;
        this.f46791f = aVar.f46817t;
        this.f46792g = aVar.f46818u;
        this.f46793h = aVar.f46813p;
        this.f46794i = aVar.f46814q;
        this.j = aVar.f46815r;
        this.f46795k = aVar.f46820w;
        this.f46796l = aVar.f46821x;
    }
}
