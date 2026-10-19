package com.voltasit.obdeleven.presentation.controlUnit;

import androidx.lifecycle.Z;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.usecases.user.GetUserDetailsUC;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: ControlUnitViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ControlUnitViewModel extends com.voltasit.obdeleven.presentation.d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final U7.a f31442A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final U7.a<p293xa.r> f31443B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final U7.a f31444C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final U7.a<p293xa.r> f31445D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final U7.a f31446E;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final GetUserDetailsUC f31447o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.sfd.d f31448p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.vehicle.l f31449q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final U7.a<ProCuScreen> f31450r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final U7.a f31451s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final U7.a<p293xa.r> f31452t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final U7.a f31453u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final U7.a<p293xa.r> f31454v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final U7.a f31455w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final U7.a<String> f31456x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final U7.a f31457y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final U7.a<Integer> f31458z;

    public ControlUnitViewModel(GetUserDetailsUC getUserDetailsUC, com.voltasit.obdeleven.domain.usecases.sfd.d dVar, com.voltasit.obdeleven.domain.usecases.vehicle.l lVar) {
        this.f31447o = getUserDetailsUC;
        this.f31448p = dVar;
        this.f31449q = lVar;
        U7.a<ProCuScreen> aVar = new U7.a<>();
        this.f31450r = aVar;
        this.f31451s = aVar;
        U7.a<p293xa.r> aVar2 = new U7.a<>();
        this.f31452t = aVar2;
        this.f31453u = aVar2;
        U7.a<p293xa.r> aVar3 = new U7.a<>();
        this.f31454v = aVar3;
        this.f31455w = aVar3;
        U7.a<String> aVar4 = new U7.a<>();
        this.f31456x = aVar4;
        this.f31457y = aVar4;
        U7.a<Integer> aVar5 = new U7.a<>();
        this.f31458z = aVar5;
        this.f31442A = aVar5;
        U7.a<p293xa.r> aVar6 = new U7.a<>();
        this.f31443B = aVar6;
        this.f31444C = aVar6;
        U7.a<p293xa.r> aVar7 = new U7.a<>();
        this.f31445D = aVar7;
        this.f31446E = aVar7;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object b(ControlUnitViewModel controlUnitViewModel, ContinuationImpl continuationImpl) {
        ControlUnitViewModel$isPopTheHoodRequired$1 controlUnitViewModel$isPopTheHoodRequired$1;
        boolean zBooleanValue;
        controlUnitViewModel.getClass();
        if (continuationImpl instanceof ControlUnitViewModel$isPopTheHoodRequired$1) {
            controlUnitViewModel$isPopTheHoodRequired$1 = (ControlUnitViewModel$isPopTheHoodRequired$1) continuationImpl;
            int i10 = controlUnitViewModel$isPopTheHoodRequired$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                controlUnitViewModel$isPopTheHoodRequired$1.label = i10 - Integer.MIN_VALUE;
            } else {
                controlUnitViewModel$isPopTheHoodRequired$1 = new ControlUnitViewModel$isPopTheHoodRequired$1(controlUnitViewModel, continuationImpl);
            }
        } else {
            controlUnitViewModel$isPopTheHoodRequired$1 = new ControlUnitViewModel$isPopTheHoodRequired$1(controlUnitViewModel, continuationImpl);
        }
        Object objA = controlUnitViewModel$isPopTheHoodRequired$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = controlUnitViewModel$isPopTheHoodRequired$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            controlUnitViewModel$isPopTheHoodRequired$1.label = 1;
            objA = controlUnitViewModel.f31449q.a(controlUnitViewModel$isPopTheHoodRequired$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(objA);
        }
        C8.a aVar = (C8.a) objA;
        if (aVar instanceof C8.a.C0024a) {
            zBooleanValue = false;
        } else {
            if (!(aVar instanceof C8.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            zBooleanValue = ((Boolean) ((C8.a.b) aVar).f2463a).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object c(ControlUnitViewModel controlUnitViewModel, short s10, ContinuationImpl continuationImpl) {
        ControlUnitViewModel$showSfdLockOrUnlock$1 controlUnitViewModel$showSfdLockOrUnlock$1;
        controlUnitViewModel.getClass();
        if (continuationImpl instanceof ControlUnitViewModel$showSfdLockOrUnlock$1) {
            controlUnitViewModel$showSfdLockOrUnlock$1 = (ControlUnitViewModel$showSfdLockOrUnlock$1) continuationImpl;
            int i10 = controlUnitViewModel$showSfdLockOrUnlock$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                controlUnitViewModel$showSfdLockOrUnlock$1.label = i10 - Integer.MIN_VALUE;
            } else {
                controlUnitViewModel$showSfdLockOrUnlock$1 = new ControlUnitViewModel$showSfdLockOrUnlock$1(controlUnitViewModel, continuationImpl);
            }
        } else {
            controlUnitViewModel$showSfdLockOrUnlock$1 = new ControlUnitViewModel$showSfdLockOrUnlock$1(controlUnitViewModel, continuationImpl);
        }
        Object objA = controlUnitViewModel$showSfdLockOrUnlock$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = controlUnitViewModel$showSfdLockOrUnlock$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            controlUnitViewModel$showSfdLockOrUnlock$1.L$0 = controlUnitViewModel;
            controlUnitViewModel$showSfdLockOrUnlock$1.label = 1;
            objA = controlUnitViewModel.f31448p.a(s10, controlUnitViewModel$showSfdLockOrUnlock$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            controlUnitViewModel = (ControlUnitViewModel) controlUnitViewModel$showSfdLockOrUnlock$1.L$0;
            kotlin.b.b(objA);
        }
        C8.a aVar = (C8.a) objA;
        if (aVar instanceof C8.a.C0024a) {
            U7.a<Integer> aVar2 = controlUnitViewModel.f32119h;
            Throwable th = ((C8.a.C0024a) aVar).f2462a;
            B7.b.h(R.string.common_something_went_wrong, aVar2);
        } else if (aVar instanceof C8.a.b) {
            G8.w wVar = (G8.w) ((C8.a.b) aVar).f2463a;
            if (wVar.f3553a) {
                controlUnitViewModel.f31458z.j(new Integer(wVar.f3554b));
            } else {
                controlUnitViewModel.f31443B.j(p293xa.r.f47939a);
            }
        }
        return p293xa.r.f47939a;
    }

    public final void d(ProCuScreen proCuScreen) {
        C2680e.c(Z.a(this), null, null, new ControlUnitViewModel$clickProFunction$1(this, proCuScreen, null), 3);
    }
}
