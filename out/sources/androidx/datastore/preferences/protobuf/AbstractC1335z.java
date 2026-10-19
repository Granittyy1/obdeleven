package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ListFieldSchema.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1335z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f17287a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f17288b = new b();

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z$a */
    /* JADX INFO: compiled from: ListFieldSchema.java */
    public static final class a extends AbstractC1335z {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Class<?> f17289c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public static List d(int i10, long j, Object obj) {
            List list;
            List listH;
            List list2 = (List) g0.f17233c.i(obj, j);
            if (list2.isEmpty()) {
                if (list2 instanceof InterfaceC1334y) {
                    listH = new C1333x(i10);
                } else {
                    listH = ((list2 instanceof S) && (list2 instanceof C1330u.c)) ? ((C1330u.c) list2).h(i10) : new ArrayList(i10);
                }
                g0.r(j, obj, listH);
                return listH;
            }
            if (f17289c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + i10);
                arrayList.addAll(list2);
                g0.r(j, obj, arrayList);
                list = arrayList;
            } else {
                if (!(list2 instanceof f0)) {
                    if (!(list2 instanceof S) || !(list2 instanceof C1330u.c)) {
                        return list2;
                    }
                    C1330u.c cVar = (C1330u.c) list2;
                    if (cVar.n()) {
                        return list2;
                    }
                    C1330u.c cVarH = cVar.h(list2.size() + i10);
                    g0.r(j, obj, cVarH);
                    return cVarH;
                }
                C1333x c1333x = new C1333x(list2.size() + i10);
                c1333x.addAll((f0) list2);
                g0.r(j, obj, c1333x);
                list = c1333x;
            }
            return list;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1335z
        public final void a(Object obj, long j) {
            Object objUnmodifiableList;
            List list = (List) g0.f17233c.i(obj, j);
            if (list instanceof InterfaceC1334y) {
                objUnmodifiableList = ((InterfaceC1334y) list).l();
            } else {
                if (f17289c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof S) && (list instanceof C1330u.c)) {
                    C1330u.c cVar = (C1330u.c) list;
                    if (cVar.n()) {
                        cVar.f();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            g0.r(j, obj, objUnmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1335z
        public final void b(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, long j) {
            List list = (List) g0.f17233c.i(generatedMessageLite2, j);
            List listD = d(list.size(), j, generatedMessageLite);
            int size = listD.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                listD.addAll(list);
            }
            if (size > 0) {
                list = listD;
            }
            g0.r(j, generatedMessageLite, list);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1335z
        public final <L> List<L> c(Object obj, long j) {
            return d(10, j, obj);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z$b */
    /* JADX INFO: compiled from: ListFieldSchema.java */
    public static final class b extends AbstractC1335z {
        @Override // androidx.datastore.preferences.protobuf.AbstractC1335z
        public final void a(Object obj, long j) {
            ((C1330u.c) g0.f17233c.i(obj, j)).f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1335z
        public final void b(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, long j) {
            g0.e eVar = g0.f17233c;
            C1330u.c cVarH = (C1330u.c) eVar.i(generatedMessageLite, j);
            C1330u.c cVar = (C1330u.c) eVar.i(generatedMessageLite2, j);
            int size = cVarH.size();
            int size2 = cVar.size();
            if (size > 0 && size2 > 0) {
                if (!cVarH.n()) {
                    cVarH = cVarH.h(size2 + size);
                }
                cVarH.addAll(cVar);
            }
            if (size > 0) {
                cVar = cVarH;
            }
            g0.r(j, generatedMessageLite, cVar);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1335z
        public final <L> List<L> c(Object obj, long j) {
            C1330u.c cVar = (C1330u.c) g0.f17233c.i(obj, j);
            if (cVar.n()) {
                return cVar;
            }
            int size = cVar.size();
            C1330u.c cVarH = cVar.h(size == 0 ? 10 : size * 2);
            g0.r(j, obj, cVarH);
            return cVarH;
        }
    }

    public abstract void a(Object obj, long j);

    public abstract void b(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, long j);

    public abstract <L> List<L> c(Object obj, long j);
}
