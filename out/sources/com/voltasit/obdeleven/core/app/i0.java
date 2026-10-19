package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i0 implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f30098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f30099c;

    public /* synthetic */ i0(j0 j0Var, ControlUnit controlUnit) {
        this.f30098b = j0Var;
        this.f30099c = controlUnit;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10;
        j0 this$0 = this.f30098b;
        kotlin.jvm.internal.i.e(this$0, "this$0");
        ControlUnit controlUnit = this.f30099c;
        kotlin.jvm.internal.i.e(controlUnit, "$controlUnit");
        C8.a aVar = (C8.a) C2680e.d(EmptyCoroutineContext.f43032b, new SfdLockCommand$lock$1$output$1(this$0, controlUnit, null));
        if (aVar instanceof C8.a.b) {
            i10 = 0;
        } else {
            if (!(aVar instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = -5;
        }
        return Integer.valueOf(i10);
    }
}
