package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends AbstractC1856m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f25826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f25827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Y1 f25828f;

    public r(r rVar) {
        super(rVar.f25795b);
        ArrayList arrayList = new ArrayList(rVar.f25826d.size());
        this.f25826d = arrayList;
        arrayList.addAll(rVar.f25826d);
        ArrayList arrayList2 = new ArrayList(rVar.f25827e.size());
        this.f25827e = arrayList2;
        arrayList2.addAll(rVar.f25827e);
        this.f25828f = rVar.f25828f;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1856m
    public final InterfaceC1884q a(Y1 y10, List<InterfaceC1884q> list) {
        C1932x c1932x;
        Y1 y1D = this.f25828f.d();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f25826d;
            int size = arrayList.size();
            c1932x = InterfaceC1884q.f25814f0;
            if (i10 >= size) {
                break;
            }
            if (i10 < list.size()) {
                y1D.e((String) arrayList.get(i10), y10.f25642b.c(y10, list.get(i10)));
            } else {
                y1D.e((String) arrayList.get(i10), c1932x);
            }
            i10++;
        }
        for (InterfaceC1884q interfaceC1884q : this.f25827e) {
            V7.a aVar = y1D.f25642b;
            InterfaceC1884q interfaceC1884qC = aVar.c(y1D, interfaceC1884q);
            if (interfaceC1884qC instanceof C1904t) {
                interfaceC1884qC = aVar.c(y1D, interfaceC1884q);
            }
            if (interfaceC1884qC instanceof C1842k) {
                return ((C1842k) interfaceC1884qC).f25778b;
            }
        }
        return c1932x;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1856m, com.google.android.gms.internal.measurement.InterfaceC1884q
    public final InterfaceC1884q y() {
        return new r(this);
    }

    public r(String str, ArrayList arrayList, List list, Y1 y10) {
        super(str);
        this.f25826d = new ArrayList();
        this.f25828f = y10;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f25826d.add(((InterfaceC1884q) it.next()).A());
            }
        }
        this.f25827e = new ArrayList(list);
    }
}
