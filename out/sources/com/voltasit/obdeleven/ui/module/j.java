package com.voltasit.obdeleven.ui.module;

import java.util.Comparator;
import p255u9.D;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        D d10 = ((p315z8.c) obj).f48948a;
        D d11 = ((p315z8.c) obj2).f48948a;
        int iCompareTo = d10.a().compareTo(d11.a());
        return iCompareTo == 0 ? d10.getInt("startYear") - d11.getInt("startYear") : iCompareTo;
    }
}
