package androidx.work.impl.constraints.controllers;

import Q2.z;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.CallbackFlowBuilder;

/* JADX INFO: compiled from: ContraintControllers.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O2.h<T> f20400a;

    public c(O2.h<T> tracker) {
        i.e(tracker, "tracker");
        this.f20400a = tracker;
    }

    public abstract int a();

    public abstract boolean b(z zVar);

    public abstract boolean c(T t8);

    public final CallbackFlowBuilder d() {
        return new CallbackFlowBuilder(new ConstraintController$track$1(this, null), EmptyCoroutineContext.f43032b, -2, BufferOverflow.f43243b);
    }
}
