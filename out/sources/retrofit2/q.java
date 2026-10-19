package retrofit2;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import p318zb.C2839f;

/* JADX INFO: compiled from: ParameterHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class q<T> {

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class a<T> extends q<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f46728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f46729b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final retrofit2.h<T, okhttp3.y> f46730c;

        public a(Method method, int i10, retrofit2.h<T, okhttp3.y> hVar) {
            this.f46728a = method;
            this.f46729b = i10;
            this.f46730c = hVar;
        }

        @Override // retrofit2.q
        public final void a(t tVar, T t8) {
            int i10 = this.f46729b;
            Method method = this.f46728a;
            if (t8 == null) {
                throw A.k(method, i10, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                tVar.f46783k = this.f46730c.b(t8);
            } catch (IOException e10) {
                throw A.l(method, e10, i10, "Unable to convert " + t8 + " to RequestBody", new Object[0]);
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class b<T> extends q<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final retrofit2.b.d f46732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f46733c;

        public b(String str, boolean z10) {
            retrofit2.b.d dVar = retrofit2.b.d.f46682b;
            Objects.requireNonNull(str, "name == null");
            this.f46731a = str;
            this.f46732b = dVar;
            this.f46733c = z10;
        }

        @Override // retrofit2.q
        public final void a(t tVar, T t8) throws IOException {
            if (t8 == null) {
                return;
            }
            this.f46732b.getClass();
            String string = t8.toString();
            if (string == null) {
                return;
            }
            tVar.a(this.f46731a, string, this.f46733c);
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class c<T> extends q<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f46734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f46735b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f46736c;

        public c(Method method, int i10, boolean z10) {
            this.f46734a = method;
            this.f46735b = i10;
            this.f46736c = z10;
        }

        @Override // retrofit2.q
        public final void a(t tVar, Object obj) throws IOException {
            Map map = (Map) obj;
            int i10 = this.f46735b;
            Method method = this.f46734a;
            if (map == null) {
                throw A.k(method, i10, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw A.k(method, i10, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw A.k(method, i10, androidx.compose.foundation.gestures.d.b("Field map contained null value for key '", str, "'."), new Object[0]);
                }
                String string = value.toString();
                if (string == null) {
                    throw A.k(method, i10, "Field map value '" + value + "' converted to null by " + retrofit2.b.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                tVar.a(str, string, this.f46736c);
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class d<T> extends q<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final retrofit2.b.d f46738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f46739c;

        public d(String str, boolean z10) {
            retrofit2.b.d dVar = retrofit2.b.d.f46682b;
            Objects.requireNonNull(str, "name == null");
            this.f46737a = str;
            this.f46738b = dVar;
            this.f46739c = z10;
        }

        @Override // retrofit2.q
        public final void a(t tVar, T t8) throws IOException {
            if (t8 == null) {
                return;
            }
            this.f46738b.getClass();
            String string = t8.toString();
            if (string == null) {
                return;
            }
            tVar.b(this.f46737a, string, this.f46739c);
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class e<T> extends q<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f46740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f46741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f46742c;

        public e(Method method, int i10, boolean z10) {
            this.f46740a = method;
            this.f46741b = i10;
            this.f46742c = z10;
        }

        @Override // retrofit2.q
        public final void a(t tVar, Object obj) throws IOException {
            Map map = (Map) obj;
            int i10 = this.f46741b;
            Method method = this.f46740a;
            if (map == null) {
                throw A.k(method, i10, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw A.k(method, i10, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw A.k(method, i10, androidx.compose.foundation.gestures.d.b("Header map contained null value for key '", str, "'."), new Object[0]);
                }
                tVar.b(str, value.toString(), this.f46742c);
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class f extends q<okhttp3.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f46743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f46744b;

        public f(Method method, int i10) {
            this.f46743a = method;
            this.f46744b = i10;
        }

        @Override // retrofit2.q
        public final void a(t tVar, okhttp3.o oVar) throws IOException {
            okhttp3.o oVar2 = oVar;
            if (oVar2 == null) {
                int i10 = this.f46744b;
                throw A.k(this.f46743a, i10, "Headers parameter must not be null.", new Object[0]);
            }
            okhttp3.o.a aVar = tVar.f46779f;
            aVar.getClass();
            int size = oVar2.size();
            for (int i11 = 0; i11 < size; i11++) {
                aVar.c(oVar2.k(i11), oVar2.v(i11));
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class g<T> extends q<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f46745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f46746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final okhttp3.o f46747c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final retrofit2.h<T, okhttp3.y> f46748d;

        public g(Method method, int i10, okhttp3.o oVar, retrofit2.h<T, okhttp3.y> hVar) {
            this.f46745a = method;
            this.f46746b = i10;
            this.f46747c = oVar;
            this.f46748d = hVar;
        }

        @Override // retrofit2.q
        public final void a(t tVar, T t8) {
            if (t8 == null) {
                return;
            }
            try {
                tVar.c(this.f46747c, this.f46748d.b(t8));
            } catch (IOException e10) {
                throw A.k(this.f46745a, this.f46746b, "Unable to convert " + t8 + " to RequestBody", e10);
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class h<T> extends q<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f46749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f46750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final retrofit2.h<T, okhttp3.y> f46751c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f46752d;

        public h(Method method, int i10, retrofit2.h<T, okhttp3.y> hVar, String str) {
            this.f46749a = method;
            this.f46750b = i10;
            this.f46751c = hVar;
            this.f46752d = str;
        }

        @Override // retrofit2.q
        public final void a(t tVar, Object obj) throws IOException {
            Map map = (Map) obj;
            int i10 = this.f46750b;
            Method method = this.f46749a;
            if (map == null) {
                throw A.k(method, i10, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw A.k(method, i10, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw A.k(method, i10, androidx.compose.foundation.gestures.d.b("Part map contained null value for key '", str, "'."), new Object[0]);
                }
                tVar.c(okhttp3.o.b.c("Content-Disposition", androidx.compose.foundation.gestures.d.b("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.f46752d), this.f46751c.b((T) value));
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class i<T> extends q<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f46753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f46754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f46755c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final retrofit2.b.d f46756d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f46757e;

        public i(Method method, int i10, String str, boolean z10) {
            retrofit2.b.d dVar = retrofit2.b.d.f46682b;
            this.f46753a = method;
            this.f46754b = i10;
            Objects.requireNonNull(str, "name == null");
            this.f46755c = str;
            this.f46756d = dVar;
            this.f46757e = z10;
        }

        @Override // retrofit2.q
        public final void a(t tVar, T t8) throws IOException {
            String strR0;
            String str = this.f46755c;
            if (t8 == null) {
                throw A.k(this.f46753a, this.f46754b, androidx.compose.foundation.gestures.d.b("Path parameter \"", str, "\" value must not be null."), new Object[0]);
            }
            this.f46756d.getClass();
            String string = t8.toString();
            if (tVar.f46776c == null) {
                throw new AssertionError();
            }
            int length = string.length();
            int iCharCount = 0;
            while (true) {
                if (iCharCount >= length) {
                    strR0 = string;
                    break;
                }
                int iCodePointAt = string.codePointAt(iCharCount);
                boolean z10 = this.f46757e;
                int i10 = 47;
                int i11 = -1;
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z10 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    C2839f c2839f = new C2839f();
                    c2839f.g1(string, 0, iCharCount);
                    C2839f c2839f2 = null;
                    while (iCharCount < length) {
                        int iCodePointAt2 = string.codePointAt(iCharCount);
                        if (!z10 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                            if (iCodePointAt2 < 32 || iCodePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i11 || (!z10 && (iCodePointAt2 == i10 || iCodePointAt2 == 37))) {
                                if (c2839f2 == null) {
                                    c2839f2 = new C2839f();
                                }
                                c2839f2.h1(iCodePointAt2);
                                while (!c2839f2.j()) {
                                    byte b10 = c2839f2.readByte();
                                    c2839f.Z0(37);
                                    char[] cArr = t.f46772l;
                                    c2839f.Z0(cArr[((b10 & 255) >> 4) & 15]);
                                    c2839f.Z0(cArr[b10 & 15]);
                                }
                            } else {
                                c2839f.h1(iCodePointAt2);
                            }
                        }
                        iCharCount += Character.charCount(iCodePointAt2);
                        i10 = 47;
                        i11 = -1;
                    }
                    strR0 = c2839f.r0();
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strReplace = tVar.f46776c.replace("{" + str + "}", strR0);
            if (t.f46773m.matcher(strReplace).matches()) {
                throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(string));
            }
            tVar.f46776c = strReplace;
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class j<T> extends q<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final retrofit2.b.d f46759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f46760c;

        public j(String str, boolean z10) {
            retrofit2.b.d dVar = retrofit2.b.d.f46682b;
            Objects.requireNonNull(str, "name == null");
            this.f46758a = str;
            this.f46759b = dVar;
            this.f46760c = z10;
        }

        @Override // retrofit2.q
        public final void a(t tVar, T t8) throws IOException {
            if (t8 == null) {
                return;
            }
            this.f46759b.getClass();
            String string = t8.toString();
            if (string == null) {
                return;
            }
            tVar.d(this.f46758a, string, this.f46760c);
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class k<T> extends q<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f46761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f46762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f46763c;

        public k(Method method, int i10, boolean z10) {
            this.f46761a = method;
            this.f46762b = i10;
            this.f46763c = z10;
        }

        @Override // retrofit2.q
        public final void a(t tVar, Object obj) throws IOException {
            Map map = (Map) obj;
            int i10 = this.f46762b;
            Method method = this.f46761a;
            if (map == null) {
                throw A.k(method, i10, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw A.k(method, i10, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw A.k(method, i10, androidx.compose.foundation.gestures.d.b("Query map contained null value for key '", str, "'."), new Object[0]);
                }
                String string = value.toString();
                if (string == null) {
                    throw A.k(method, i10, "Query map value '" + value + "' converted to null by " + retrofit2.b.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                }
                tVar.d(str, string, this.f46763c);
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class l<T> extends q<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f46764a;

        public l(boolean z10) {
            this.f46764a = z10;
        }

        @Override // retrofit2.q
        public final void a(t tVar, T t8) throws IOException {
            if (t8 == null) {
                return;
            }
            tVar.d(t8.toString(), null, this.f46764a);
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class m extends q<okhttp3.s.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f46765a = new m();

        @Override // retrofit2.q
        public final void a(t tVar, okhttp3.s.c cVar) throws IOException {
            okhttp3.s.c cVar2 = cVar;
            if (cVar2 != null) {
                okhttp3.s.a aVar = tVar.f46782i;
                aVar.getClass();
                aVar.f45604c.add(cVar2);
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class n extends q<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f46766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f46767b;

        public n(Method method, int i10) {
            this.f46766a = method;
            this.f46767b = i10;
        }

        @Override // retrofit2.q
        public final void a(t tVar, Object obj) {
            if (obj != null) {
                tVar.f46776c = obj.toString();
            } else {
                int i10 = this.f46767b;
                throw A.k(this.f46766a, i10, "@Url parameter is null.", new Object[0]);
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class o<T> extends q<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f46768a;

        public o(Class<T> cls) {
            this.f46768a = cls;
        }

        @Override // retrofit2.q
        public final void a(t tVar, T t8) {
            tVar.f46778e.f(this.f46768a, t8);
        }
    }

    public abstract void a(t tVar, T t8) throws IOException;
}
