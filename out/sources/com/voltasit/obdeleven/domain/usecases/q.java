package com.voltasit.obdeleven.domain.usecases;

import java.util.Comparator;
import p255u9.D;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30907b;

    public /* synthetic */ q(int i10) {
        this.f30907b = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f30907b) {
            case 0:
                p315z8.c o10 = (p315z8.c) obj;
                p315z8.c o11 = (p315z8.c) obj2;
                kotlin.jvm.internal.i.e(o10, "o1");
                kotlin.jvm.internal.i.e(o11, "o2");
                D d10 = o10.f48948a;
                String strA = d10.a();
                D d11 = o11.f48948a;
                int iCompareTo = strA.compareTo(d11.a());
                return iCompareTo == 0 ? d10.getInt("startYear") - d11.getInt("startYear") : iCompareTo;
            default:
                return v1.j.i.c((v1.j.i) obj, (v1.j.i) obj2);
        }
    }
}
