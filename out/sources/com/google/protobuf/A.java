package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: ListFieldSchema.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f29002a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f29003b = new b();

    /* JADX INFO: compiled from: ListFieldSchema.java */
    public static final class a extends A {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Class<?> f29004c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public static List d(int i10, long j, Object obj) {
            List list;
            List listH;
            List list2 = (List) g0.f29152b.i(obj, j);
            if (list2.isEmpty()) {
                if (list2 instanceof InterfaceC2083z) {
                    listH = new C2082y(i10);
                } else {
                    listH = ((list2 instanceof T) && (list2 instanceof C2078u.d)) ? ((C2078u.d) list2).h(i10) : new ArrayList(i10);
                }
                g0.s(j, obj, listH);
                return listH;
            }
            if (f29004c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + i10);
                arrayList.addAll(list2);
                g0.s(j, obj, arrayList);
                list = arrayList;
            } else {
                if (!(list2 instanceof f0)) {
                    if (!(list2 instanceof T) || !(list2 instanceof C2078u.d)) {
                        return list2;
                    }
                    C2078u.d dVar = (C2078u.d) list2;
                    if (dVar.n()) {
                        return list2;
                    }
                    C2078u.d dVarH = dVar.h(list2.size() + i10);
                    g0.s(j, obj, dVarH);
                    return dVarH;
                }
                C2082y c2082y = new C2082y(list2.size() + i10);
                c2082y.addAll((f0) list2);
                g0.s(j, obj, c2082y);
                list = c2082y;
            }
            return list;
        }

        @Override // com.google.protobuf.A
        public final void a(Object obj, long j) {
            Object objUnmodifiableList;
            List list = (List) g0.f29152b.i(obj, j);
            if (list instanceof InterfaceC2083z) {
                objUnmodifiableList = ((InterfaceC2083z) list).l();
            } else {
                if (f29004c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof T) && (list instanceof C2078u.d)) {
                    C2078u.d dVar = (C2078u.d) list;
                    if (dVar.n()) {
                        dVar.f();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            g0.s(j, obj, objUnmodifiableList);
        }

        @Override // com.google.protobuf.A
        public final void b(long j, Object obj, Object obj2) {
            List list = (List) g0.f29152b.i(obj2, j);
            List listD = d(list.size(), j, obj);
            int size = listD.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                listD.addAll(list);
            }
            if (size > 0) {
                list = listD;
            }
            g0.s(j, obj, list);
        }

        @Override // com.google.protobuf.A
        public final <L> List<L> c(Object obj, long j) {
            return d(10, j, obj);
        }
    }

    /* JADX INFO: compiled from: ListFieldSchema.java */
    public static final class b extends A {
        @Override // com.google.protobuf.A
        public final void a(Object obj, long j) {
            ((C2078u.d) g0.f29152b.i(obj, j)).f();
        }

        @Override // com.google.protobuf.A
        public final void b(long j, Object obj, Object obj2) {
            g0.e eVar = g0.f29152b;
            C2078u.d dVarH = (C2078u.d) eVar.i(obj, j);
            C2078u.d dVar = (C2078u.d) eVar.i(obj2, j);
            int size = dVarH.size();
            int size2 = dVar.size();
            if (size > 0 && size2 > 0) {
                if (!dVarH.n()) {
                    dVarH = dVarH.h(size2 + size);
                }
                dVarH.addAll(dVar);
            }
            if (size > 0) {
                dVar = dVarH;
            }
            g0.s(j, obj, dVar);
        }

        @Override // com.google.protobuf.A
        public final <L> List<L> c(Object obj, long j) {
            C2078u.d dVar = (C2078u.d) g0.f29152b.i(obj, j);
            if (dVar.n()) {
                return dVar;
            }
            int size = dVar.size();
            C2078u.d dVarH = dVar.h(size == 0 ? 10 : size * 2);
            g0.s(j, obj, dVarH);
            return dVarH;
        }
    }

    public abstract void a(Object obj, long j);

    public abstract void b(long j, Object obj, Object obj2);

    public abstract <L> List<L> c(Object obj, long j);
}
