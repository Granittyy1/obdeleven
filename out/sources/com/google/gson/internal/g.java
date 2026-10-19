package com.google.gson.internal;

import com.google.gson.ReflectionAccessFilter;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: ReflectionAccessFilterHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: compiled from: ReflectionAccessFilterHelper.java */
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28968a;

        /* JADX INFO: renamed from: com.google.gson.internal.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ReflectionAccessFilterHelper.java */
        public class C0288a extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Method f28969b;

            public C0288a(Method method) {
                this.f28969b = method;
            }

            @Override // com.google.gson.internal.g.a
            public final boolean a(Object obj, AccessibleObject accessibleObject) {
                try {
                    return ((Boolean) this.f28969b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e10) {
                    throw new RuntimeException("Failed invoking canAccess", e10);
                }
            }
        }

        /* JADX INFO: compiled from: ReflectionAccessFilterHelper.java */
        public class b extends a {
            @Override // com.google.gson.internal.g.a
            public final boolean a(Object obj, AccessibleObject accessibleObject) {
                return true;
            }
        }

        static {
            a c0288a;
            if (d.f28967a >= 9) {
                try {
                    c0288a = new C0288a(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                    c0288a = null;
                }
            } else {
                c0288a = null;
            }
            if (c0288a == null) {
                c0288a = new b();
            }
            f28968a = c0288a;
        }

        public abstract boolean a(Object obj, AccessibleObject accessibleObject);
    }

    public static ReflectionAccessFilter.FilterResult a(Class cls, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ReflectionAccessFilter.FilterResult filterResultA = ((ReflectionAccessFilter) it.next()).a();
            if (filterResultA != ReflectionAccessFilter.FilterResult.f28808c) {
                return filterResultA;
            }
        }
        return ReflectionAccessFilter.FilterResult.f28807b;
    }
}
