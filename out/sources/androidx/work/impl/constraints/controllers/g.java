package androidx.work.impl.constraints.controllers;

import Q2.z;
import android.os.Build;
import androidx.work.NetworkType;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ContraintControllers.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g extends c<androidx.work.impl.constraints.c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20404b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(O2.h<androidx.work.impl.constraints.c> tracker) {
        super(tracker);
        i.e(tracker, "tracker");
        this.f20404b = 7;
    }

    @Override // androidx.work.impl.constraints.controllers.c
    public final int a() {
        return this.f20404b;
    }

    @Override // androidx.work.impl.constraints.controllers.c
    public final boolean b(z workSpec) {
        i.e(workSpec, "workSpec");
        NetworkType networkType = workSpec.j.f20341a;
        return networkType == NetworkType.f20298d || (Build.VERSION.SDK_INT >= 30 && networkType == NetworkType.f20301g);
    }

    @Override // androidx.work.impl.constraints.controllers.c
    public final boolean c(androidx.work.impl.constraints.c cVar) {
        androidx.work.impl.constraints.c value = cVar;
        i.e(value, "value");
        return !value.f20392a || value.f20394c;
    }
}
