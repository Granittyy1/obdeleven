package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1797d3 extends AbstractC1783b3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class<?> f25678c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    @Override // com.google.android.gms.internal.measurement.AbstractC1783b3
    public final void a(long j, Object obj, Object obj2) {
        List list;
        List list2;
        List listC;
        List list3 = (List) V3.o(obj2, j);
        int size = list3.size();
        List list4 = (List) V3.o(obj, j);
        if (list4.isEmpty()) {
            if (list4 instanceof InterfaceC1790c3) {
                listC = new Z2(size);
            } else {
                listC = ((list4 instanceof A3) && (list4 instanceof V2)) ? ((V2) list4).c(size) : new ArrayList(size);
            }
            V3.d(j, obj, listC);
            list2 = listC;
        } else {
            if (f25678c.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                V3.d(j, obj, arrayList);
                list = arrayList;
            } else if (list4 instanceof U3) {
                Z2 z10 = new Z2(list4.size() + size);
                z10.addAll((U3) list4);
                V3.d(j, obj, z10);
                list = z10;
            } else if ((list4 instanceof A3) && (list4 instanceof V2)) {
                V2 v10 = (V2) list4;
                if (!v10.y()) {
                    list2 = list4;
                    list2 = list4;
                    list2 = list4;
                    V2 v2C = v10.c(list4.size() + size);
                    V3.d(j, obj, v2C);
                    list2 = v2C;
                }
            }
            list2 = list;
        }
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        V3.d(j, obj, list3);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1783b3
    public final void b(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) V3.o(obj, j);
        if (list instanceof InterfaceC1790c3) {
            objUnmodifiableList = ((InterfaceC1790c3) list).b();
        } else {
            if (f25678c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof A3) && (list instanceof V2)) {
                V2 v10 = (V2) list;
                if (v10.y()) {
                    v10.x();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        V3.d(j, obj, objUnmodifiableList);
    }
}
