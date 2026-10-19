package com.obdeleven.service.util;

import G8.C0705g;
import java.util.Comparator;
import p109i8.f;

/* JADX INFO: compiled from: ControlUnitComparator.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29553b;

    public /* synthetic */ a(int i10) {
        this.f29553b = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f29553b) {
            case 0:
                return ((f) obj).n().compareTo(((f) obj2).n());
            default:
                return Cb.a.e(((C0705g) obj).f3495a, ((C0705g) obj2).f3495a);
        }
    }
}
