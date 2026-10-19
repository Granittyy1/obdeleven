package com.voltasit.obdeleven.presentation.controlUnit;

import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.exceptions.SfdRateLimitException;
import com.voltasit.obdeleven.domain.models.Feature;
import com.voltasit.obdeleven.domain.usecases.user.GetUserDetailsUC;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: OnlineControlUnitViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class F extends com.voltasit.obdeleven.presentation.d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final U7.a<Integer> f31462A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final U7.a f31463B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f31464C;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.controlUnit.d f31465o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final GetUserDetailsUC f31466p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final K8.b f31467q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.sfd.e f31468r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.sfd.j f31469s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.sfd.g f31470t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final U7.a<p293xa.r> f31471u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final U7.a f31472v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final U7.a<p293xa.r> f31473w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final U7.a f31474x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final U7.a<Short> f31475y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final U7.a f31476z;

    public F(com.voltasit.obdeleven.domain.usecases.controlUnit.d dVar, GetUserDetailsUC getUserDetailsUC, K8.b bVar, com.voltasit.obdeleven.domain.usecases.sfd.e eVar, com.voltasit.obdeleven.domain.usecases.sfd.j jVar, com.voltasit.obdeleven.domain.usecases.sfd.g gVar) {
        this.f31465o = dVar;
        this.f31466p = getUserDetailsUC;
        this.f31467q = bVar;
        this.f31468r = eVar;
        this.f31469s = jVar;
        this.f31470t = gVar;
        U7.a<p293xa.r> aVar = new U7.a<>();
        this.f31471u = aVar;
        this.f31472v = aVar;
        U7.a<p293xa.r> aVar2 = new U7.a<>();
        this.f31473w = aVar2;
        this.f31474x = aVar2;
        U7.a<Short> aVar3 = new U7.a<>();
        this.f31475y = aVar3;
        this.f31476z = aVar3;
        U7.a<Integer> aVar4 = new U7.a<>();
        this.f31462A = aVar4;
        this.f31463B = aVar4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object b(F f10, String str, short s10, ContinuationImpl continuationImpl) {
        OnlineControlUnitViewModel$unlockSfd$1 onlineControlUnitViewModel$unlockSfd$1;
        f10.getClass();
        if (continuationImpl instanceof OnlineControlUnitViewModel$unlockSfd$1) {
            onlineControlUnitViewModel$unlockSfd$1 = (OnlineControlUnitViewModel$unlockSfd$1) continuationImpl;
            int i10 = onlineControlUnitViewModel$unlockSfd$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                onlineControlUnitViewModel$unlockSfd$1.label = i10 - Integer.MIN_VALUE;
            } else {
                onlineControlUnitViewModel$unlockSfd$1 = new OnlineControlUnitViewModel$unlockSfd$1(f10, continuationImpl);
            }
        } else {
            onlineControlUnitViewModel$unlockSfd$1 = new OnlineControlUnitViewModel$unlockSfd$1(f10, continuationImpl);
        }
        Object objA = onlineControlUnitViewModel$unlockSfd$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = onlineControlUnitViewModel$unlockSfd$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            Feature feature = Feature.ControlUnit;
            onlineControlUnitViewModel$unlockSfd$1.L$0 = f10;
            onlineControlUnitViewModel$unlockSfd$1.label = 1;
            objA = f10.f31469s.a(str, s10, feature, onlineControlUnitViewModel$unlockSfd$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f10 = (F) onlineControlUnitViewModel$unlockSfd$1.L$0;
            kotlin.b.b(objA);
        }
        C8.a aVar = (C8.a) objA;
        if (aVar instanceof C8.a.C0024a) {
            Object obj = ((C8.a.C0024a) aVar).f2462a;
            f10.getClass();
            if (obj instanceof SfdRateLimitException) {
                f10.f31462A.j(Integer.valueOf(((SfdRateLimitException) obj).a()));
            } else {
                boolean z10 = obj instanceof D8.a;
                U7.a<Integer> aVar2 = f10.f32119h;
                if (z10) {
                    aVar2.j(Integer.valueOf(((D8.a) obj).a()));
                } else {
                    aVar2.j(Integer.valueOf(R.string.common_something_went_wrong));
                }
            }
        } else if (aVar instanceof C8.a.b) {
            if (((Boolean) ((C8.a.b) aVar).f2463a).booleanValue()) {
                f10.f32122l.j(Integer.valueOf(R.string.common_success));
            } else {
                f10.f32119h.j(Integer.valueOf(R.string.common_something_went_wrong));
            }
        }
        return p293xa.r.f47939a;
    }
}
