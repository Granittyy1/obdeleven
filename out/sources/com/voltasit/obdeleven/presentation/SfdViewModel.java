package com.voltasit.obdeleven.presentation;

import androidx.lifecycle.Z;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.exceptions.SfdRateLimitException;
import com.voltasit.obdeleven.domain.models.Feature;
import com.voltasit.obdeleven.domain.usecases.sfd.j;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2680e;
import p293xa.r;

/* JADX INFO: compiled from: SfdViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SfdViewModel extends d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final U7.a f31207A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final U7.a<r> f31208B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final U7.a f31209C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public String f31210D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public short f31211E;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Feature f31212o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f31213p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.sfd.a f31214q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final L8.a f31215r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.sfd.e f31216s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final U7.a<Integer> f31217t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final U7.a f31218u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final U7.a<r> f31219v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final U7.a f31220w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final U7.a<r> f31221x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final U7.a f31222y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final U7.a<Short> f31223z;

    public SfdViewModel(Feature feature, j jVar, com.voltasit.obdeleven.domain.usecases.sfd.a aVar, L8.a aVar2, com.voltasit.obdeleven.domain.usecases.sfd.e eVar) {
        i.e(feature, "feature");
        this.f31212o = feature;
        this.f31213p = jVar;
        this.f31214q = aVar;
        this.f31215r = aVar2;
        this.f31216s = eVar;
        U7.a<Integer> aVar3 = new U7.a<>();
        this.f31217t = aVar3;
        this.f31218u = aVar3;
        U7.a<r> aVar4 = new U7.a<>();
        this.f31219v = aVar4;
        this.f31220w = aVar4;
        U7.a<r> aVar5 = new U7.a<>();
        this.f31221x = aVar5;
        this.f31222y = aVar5;
        U7.a<Short> aVar6 = new U7.a<>();
        this.f31223z = aVar6;
        this.f31207A = aVar6;
        U7.a<r> aVar7 = new U7.a<>();
        this.f31208B = aVar7;
        this.f31209C = aVar7;
    }

    public final void b(String cuBaseId, short s10) {
        i.e(cuBaseId, "cuBaseId");
        this.f31210D = cuBaseId;
        this.f31211E = s10;
        C2680e.c(Z.a(this), null, null, new SfdViewModel$onLoginNrc$1(this, s10, null), 3);
    }

    public final void c() {
        C2680e.c(Z.a(this), this.f32112a, null, new SfdViewModel$onSfdAutoUnlockDialogResult$1(this, null), 2);
    }

    public final void d(String cuBaseId, short s10) {
        i.e(cuBaseId, "cuBaseId");
        C2680e.c(Z.a(this), null, null, new SfdViewModel$onSfdWizardCompleted$1(this, cuBaseId, s10, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object e(String str, ContinuationImpl continuationImpl, short s10) {
        SfdViewModel$unlockSfd$2 sfdViewModel$unlockSfd$2;
        SfdViewModel sfdViewModel;
        if (continuationImpl instanceof SfdViewModel$unlockSfd$2) {
            sfdViewModel$unlockSfd$2 = (SfdViewModel$unlockSfd$2) continuationImpl;
            int i10 = sfdViewModel$unlockSfd$2.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sfdViewModel$unlockSfd$2.label = i10 - Integer.MIN_VALUE;
            } else {
                sfdViewModel$unlockSfd$2 = new SfdViewModel$unlockSfd$2(this, continuationImpl);
            }
        } else {
            sfdViewModel$unlockSfd$2 = new SfdViewModel$unlockSfd$2(this, continuationImpl);
        }
        Object objA = sfdViewModel$unlockSfd$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = sfdViewModel$unlockSfd$2.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            sfdViewModel$unlockSfd$2.L$0 = this;
            sfdViewModel$unlockSfd$2.label = 1;
            objA = this.f31213p.a(str, s10, this.f31212o, sfdViewModel$unlockSfd$2);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            sfdViewModel = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sfdViewModel = (SfdViewModel) sfdViewModel$unlockSfd$2.L$0;
            kotlin.b.b(objA);
        }
        C8.a aVar = (C8.a) objA;
        if (aVar instanceof C8.a.C0024a) {
            Object obj = ((C8.a.C0024a) aVar).f2462a;
            sfdViewModel.f32113b.j(PreloaderState.d.f32643a);
            if (obj instanceof SfdRateLimitException) {
                sfdViewModel.f31217t.j(Integer.valueOf(((SfdRateLimitException) obj).a()));
            } else {
                boolean z10 = obj instanceof D8.a;
                U7.a<Integer> aVar2 = sfdViewModel.f32119h;
                if (z10) {
                    aVar2.j(Integer.valueOf(((D8.a) obj).a()));
                } else {
                    aVar2.j(Integer.valueOf(R.string.common_something_went_wrong));
                }
            }
        } else if (aVar instanceof C8.a.b) {
            boolean zBooleanValue = ((Boolean) ((C8.a.b) aVar).f2463a).booleanValue();
            sfdViewModel.f32113b.j(PreloaderState.d.f32643a);
            if (zBooleanValue) {
                sfdViewModel.f31221x.j(r.f47939a);
            } else {
                sfdViewModel.f32119h.j(Integer.valueOf(R.string.common_something_went_wrong));
            }
        }
        return r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object f(ContinuationImpl continuationImpl) {
        SfdViewModel$unlockSfd$1 sfdViewModel$unlockSfd$1;
        SfdViewModel sfdViewModel;
        if (continuationImpl instanceof SfdViewModel$unlockSfd$1) {
            sfdViewModel$unlockSfd$1 = (SfdViewModel$unlockSfd$1) continuationImpl;
            int i10 = sfdViewModel$unlockSfd$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sfdViewModel$unlockSfd$1.label = i10 - Integer.MIN_VALUE;
            } else {
                sfdViewModel$unlockSfd$1 = new SfdViewModel$unlockSfd$1(this, continuationImpl);
            }
        } else {
            sfdViewModel$unlockSfd$1 = new SfdViewModel$unlockSfd$1(this, continuationImpl);
        }
        Object objA = sfdViewModel$unlockSfd$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = sfdViewModel$unlockSfd$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                sfdViewModel = (SfdViewModel) sfdViewModel$unlockSfd$1.L$0;
                kotlin.b.b(objA);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objA);
            }
            return r.f47939a;
        }
        kotlin.b.b(objA);
        sfdViewModel$unlockSfd$1.L$0 = this;
        sfdViewModel$unlockSfd$1.label = 1;
        objA = this.f31216s.a(sfdViewModel$unlockSfd$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        sfdViewModel = this;
        C8.a aVar = (C8.a) objA;
        if (aVar instanceof C8.a.C0024a) {
            B7.b.h(R.string.common_something_went_wrong, sfdViewModel.f32119h);
        } else if (aVar instanceof C8.a.b) {
            if (((Boolean) ((C8.a.b) aVar).f2463a).booleanValue()) {
                String str = sfdViewModel.f31210D;
                if (str == null) {
                    i.m("cuBaseId");
                    throw null;
                }
                short s10 = sfdViewModel.f31211E;
                sfdViewModel$unlockSfd$1.L$0 = null;
                sfdViewModel$unlockSfd$1.label = 2;
                if (sfdViewModel.e(str, sfdViewModel$unlockSfd$1, s10) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return r.f47939a;
            }
            sfdViewModel.f32113b.j(PreloaderState.d.f32643a);
            sfdViewModel.f31223z.j(new Short(sfdViewModel.f31211E));
        }
        return r.f47939a;
    }
}
