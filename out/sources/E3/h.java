package E3;

import android.util.Log;
import com.google.android.gms.internal.measurement.M1;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: LruArrayPool.java */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f<a, Object> f3055a = new f<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f3056b = new b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f3057c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f3058d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3060f;

    /* JADX INFO: compiled from: LruArrayPool.java */
    public static final class a implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f3061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Class<?> f3063c;

        public a(b bVar) {
            this.f3061a = bVar;
        }

        @Override // E3.j
        public final void a() {
            this.f3061a.F(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f3062b == aVar.f3062b && this.f3063c == aVar.f3063c;
        }

        public final int hashCode() {
            int i10 = this.f3062b * 31;
            Class<?> cls = this.f3063c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            return "Key{size=" + this.f3062b + "array=" + this.f3063c + '}';
        }
    }

    /* JADX INFO: compiled from: LruArrayPool.java */
    public static final class b extends E3.b {
        public final j H() {
            return new a(this);
        }
    }

    public h(int i10) {
        this.f3059e = i10;
    }

    public final synchronized void a() {
        c(0);
    }

    public final void b(Class cls, int i10) {
        NavigableMap<Integer, Integer> navigableMapG = g(cls);
        Integer num = navigableMapG.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapG.remove(Integer.valueOf(i10));
                return;
            } else {
                navigableMapG.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    public final void c(int i10) {
        while (this.f3060f > i10) {
            Object objC = this.f3055a.c();
            M1.c(objC);
            E3.a aVarE = e(objC.getClass());
            this.f3060f -= aVarE.b() * aVarE.c(objC);
            b(objC.getClass(), aVarE.c(objC));
            if (Log.isLoggable(aVarE.a(), 2)) {
                aVarE.c(objC);
            }
        }
    }

    public final synchronized Object d(Class cls, int i10) {
        a aVar;
        int i11;
        try {
            Integer numCeilingKey = g(cls).ceilingKey(Integer.valueOf(i10));
            if (numCeilingKey == null || ((i11 = this.f3060f) != 0 && this.f3059e / i11 < 2 && numCeilingKey.intValue() > i10 * 8)) {
                b bVar = this.f3056b;
                j jVarH = (j) ((ArrayDeque) bVar.f3048c).poll();
                if (jVarH == null) {
                    jVarH = bVar.H();
                }
                aVar = (a) jVarH;
                aVar.f3062b = i10;
                aVar.f3063c = cls;
            } else {
                b bVar2 = this.f3056b;
                int iIntValue = numCeilingKey.intValue();
                j jVarH2 = (j) ((ArrayDeque) bVar2.f3048c).poll();
                if (jVarH2 == null) {
                    jVarH2 = bVar2.H();
                }
                aVar = (a) jVarH2;
                aVar.f3062b = iIntValue;
                aVar.f3063c = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f(aVar, cls);
    }

    public final <T> E3.a<T> e(Class<T> cls) {
        HashMap map = this.f3058d;
        E3.a<T> eVar = (E3.a) map.get(cls);
        if (eVar == null) {
            if (cls.equals(int[].class)) {
                eVar = new g();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
                }
                eVar = new e();
            }
            map.put(cls, eVar);
        }
        return eVar;
    }

    public final <T> T f(a aVar, Class<T> cls) {
        E3.a<T> aVarE = e(cls);
        T t8 = (T) this.f3055a.a(aVar);
        if (t8 != null) {
            this.f3060f -= aVarE.b() * aVarE.c(t8);
            b(cls, aVarE.c(t8));
        }
        if (t8 != null) {
            return t8;
        }
        Log.isLoggable(aVarE.a(), 2);
        return aVarE.newArray(aVar.f3062b);
    }

    public final NavigableMap<Integer, Integer> g(Class<?> cls) {
        HashMap map = this.f3057c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    public final synchronized <T> void h(T t8) {
        Class<?> cls = t8.getClass();
        E3.a<T> aVarE = e(cls);
        int iC = aVarE.c(t8);
        int iB = aVarE.b() * iC;
        if (iB <= this.f3059e / 2) {
            b bVar = this.f3056b;
            j jVarH = (j) ((ArrayDeque) bVar.f3048c).poll();
            if (jVarH == null) {
                jVarH = bVar.H();
            }
            a aVar = (a) jVarH;
            aVar.f3062b = iC;
            aVar.f3063c = cls;
            this.f3055a.b(aVar, t8);
            NavigableMap<Integer, Integer> navigableMapG = g(cls);
            Integer num = navigableMapG.get(Integer.valueOf(aVar.f3062b));
            Integer numValueOf = Integer.valueOf(aVar.f3062b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapG.put(numValueOf, Integer.valueOf(iIntValue));
            this.f3060f += iB;
            c(this.f3059e);
        }
    }
}
