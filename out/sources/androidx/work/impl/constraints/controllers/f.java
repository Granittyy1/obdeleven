package androidx.work.impl.constraints.controllers;

import Q2.z;
import androidx.work.NetworkType;
import androidx.work.k;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ContraintControllers.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f extends c<androidx.work.impl.constraints.c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20403b;

    static {
        i.d(k.d("NetworkNotRoamingCtrlr"), "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(O2.h<androidx.work.impl.constraints.c> tracker) {
        super(tracker);
        i.e(tracker, "tracker");
        this.f20403b = 7;
    }

    @Override // androidx.work.impl.constraints.controllers.c
    public final int a() {
        return this.f20403b;
    }

    @Override // androidx.work.impl.constraints.controllers.c
    public final boolean b(z workSpec) {
        i.e(workSpec, "workSpec");
        return workSpec.j.f20341a == NetworkType.f20299e;
    }

    @Override // androidx.work.impl.constraints.controllers.c
    public final boolean c(androidx.work.impl.constraints.c cVar) {
        androidx.work.impl.constraints.c value = cVar;
        i.e(value, "value");
        return (value.f20392a && value.f20395d) ? false : true;
    }
}
