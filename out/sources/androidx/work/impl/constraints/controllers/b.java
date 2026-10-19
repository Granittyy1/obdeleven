package androidx.work.impl.constraints.controllers;

import Q2.z;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ContraintControllers.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c<Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20399b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(O2.c tracker) {
        super(tracker);
        i.e(tracker, "tracker");
        this.f20399b = 5;
    }

    @Override // androidx.work.impl.constraints.controllers.c
    public final int a() {
        return this.f20399b;
    }

    @Override // androidx.work.impl.constraints.controllers.c
    public final boolean b(z workSpec) {
        i.e(workSpec, "workSpec");
        return workSpec.j.f20344d;
    }

    @Override // androidx.work.impl.constraints.controllers.c
    public final boolean c(Boolean bool) {
        return !bool.booleanValue();
    }
}
