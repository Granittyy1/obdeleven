package androidx.work.impl.constraints.controllers;

import Q2.z;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ContraintControllers.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c<Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20398b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(O2.h<Boolean> tracker) {
        super(tracker);
        i.e(tracker, "tracker");
        this.f20398b = 6;
    }

    @Override // androidx.work.impl.constraints.controllers.c
    public final int a() {
        return this.f20398b;
    }

    @Override // androidx.work.impl.constraints.controllers.c
    public final boolean b(z workSpec) {
        i.e(workSpec, "workSpec");
        return workSpec.j.f20342b;
    }

    @Override // androidx.work.impl.constraints.controllers.c
    public final boolean c(Boolean bool) {
        return !bool.booleanValue();
    }
}
