package com.voltasit.obdeleven.ui.dialogs;

import com.voltasit.obdeleven.core.BodyType;
import java.util.Comparator;

/* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.f0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2144f0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return BodyType.a(((p255u9.F) obj).getInt("body")).b() - BodyType.a(((p255u9.F) obj2).getInt("body")).b();
    }
}
