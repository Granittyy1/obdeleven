package com.obdeleven.service.core;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import p114j1.A;
import p114j1.j;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements j.a {
    public static Task a(String str) {
        return new com.obdeleven.service.core.gen1.c(str).a();
    }

    public static void b(int i10, int i11, int i12, int i13, int i14) {
        A.B(i10);
        A.B(i11);
        A.B(i12);
        A.B(i13);
        A.B(i14);
    }

    public static void c(ControlUnit controlUnit, StringBuilder sb2, String str, String str2) {
        sb2.append(controlUnit.t());
        sb2.append(str);
        sb2.append(controlUnit.getName());
        sb2.append(str2);
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((p162n1.b) obj).getClass();
    }
}
