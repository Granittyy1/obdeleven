package kotlin.jvm.internal;

import Ia.p;
import Ia.q;
import Ia.r;
import Ia.s;
import Ia.t;
import Ia.u;
import Ia.v;
import Ia.w;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: TypeIntrinsics.java */
/* JADX INFO: loaded from: classes2.dex */
public final class o {
    public static Collection a(Object obj) {
        if ((obj instanceof Ja.a) && !(obj instanceof Ja.b)) {
            f(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            i.j(e10, o.class.getName());
            throw e10;
        }
    }

    public static List b(List list) {
        if ((list instanceof Ja.a) && !(list instanceof Ja.c)) {
            f(list, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return list;
        } catch (ClassCastException e10) {
            i.j(e10, o.class.getName());
            throw e10;
        }
    }

    public static Map c(Object obj) {
        if ((obj instanceof Ja.a) && !(obj instanceof Ja.d)) {
            f(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            i.j(e10, o.class.getName());
            throw e10;
        }
    }

    public static void d(int i10, Object obj) {
        if (obj == null || e(i10, obj)) {
            return;
        }
        f(obj, "kotlin.jvm.functions.Function" + i10);
        throw null;
    }

    public static boolean e(int i10, Object obj) {
        int arity;
        if (!(obj instanceof p293xa.e)) {
            return false;
        }
        if (obj instanceof g) {
            arity = ((g) obj).getArity();
        } else if (obj instanceof Ia.a) {
            arity = 0;
        } else if (obj instanceof Ia.l) {
            arity = 1;
        } else if (obj instanceof p) {
            arity = 2;
        } else if (obj instanceof q) {
            arity = 3;
        } else if (obj instanceof r) {
            arity = 4;
        } else if (obj instanceof s) {
            arity = 5;
        } else if (obj instanceof t) {
            arity = 6;
        } else if (obj instanceof u) {
            arity = 7;
        } else if (obj instanceof v) {
            arity = 8;
        } else if (obj instanceof w) {
            arity = 9;
        } else if (obj instanceof Ia.b) {
            arity = 10;
        } else if (obj instanceof Ia.c) {
            arity = 11;
        } else if (obj instanceof Ia.d) {
            arity = 12;
        } else if (obj instanceof Ia.e) {
            arity = 13;
        } else if (obj instanceof Ia.f) {
            arity = 14;
        } else if (obj instanceof Ia.g) {
            arity = 15;
        } else if (obj instanceof Ia.h) {
            arity = 16;
        } else if (obj instanceof Ia.i) {
            arity = 17;
        } else if (obj instanceof Ia.j) {
            arity = 18;
        } else if (obj instanceof Ia.k) {
            arity = 19;
        } else if (obj instanceof Ia.m) {
            arity = 20;
        } else if (obj instanceof Ia.n) {
            arity = 21;
        } else {
            arity = obj instanceof Ia.o ? 22 : -1;
        }
        return arity == i10;
    }

    public static void f(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(O.a.f(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        i.j(classCastException, o.class.getName());
        throw classCastException;
    }
}
