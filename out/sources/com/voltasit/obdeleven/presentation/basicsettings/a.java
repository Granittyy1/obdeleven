package com.voltasit.obdeleven.presentation.basicsettings;

import androidx.lifecycle.C;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.odx.Param;
import com.obdeleven.service.util.Texttabe;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting.StartBasicSettingUC;
import com.voltasit.obdeleven.domain.usecases.f;
import com.voltasit.obdeleven.domain.usecases.odx.GetBasicSettingRequestParamUC;
import com.voltasit.obdeleven.domain.usecases.odx.GetBasicSettingsUC;
import com.voltasit.obdeleven.domain.usecases.vehicle.l;
import com.voltasit.obdeleven.presentation.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import m8.o;
import p293xa.r;

/* JADX INFO: compiled from: UDSBasicSettingsViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C<C0329a> f31338A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C f31339B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final U7.a<Pair<Integer, Boolean>> f31340C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final U7.a f31341D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final U7.a<String> f31342E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final U7.a f31343F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final U7.a<r> f31344G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final U7.a f31345H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final U7.a<r> f31346I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final U7.a f31347J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public Param f31348K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public p207q8.a f31349L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final ArrayList f31350M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final U7.a<r> f31351N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final U7.a f31352O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final U7.a<r> f31353P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final U7.a f31354Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final U7.a<r> f31355R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final U7.a f31356S;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final GetBasicSettingsUC f31357o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f31358p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.odx.d f31359q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final GetBasicSettingRequestParamUC f31360r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final StartBasicSettingUC f31361s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting.a f31362t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final l f31363u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final J8.a f31364v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final U7.a<List<p207q8.a>> f31365w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final U7.a f31366x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C<Pair<List<Param>, Boolean>> f31367y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C f31368z;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.basicsettings.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: UDSBasicSettingsViewModel.kt */
    public static final class C0329a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f31369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f31370b;

        public C0329a(String str, boolean z10) {
            this.f31369a = str;
            this.f31370b = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0329a)) {
                return false;
            }
            C0329a c0329a = (C0329a) obj;
            return i.a(this.f31369a, c0329a.f31369a) && this.f31370b == c0329a.f31370b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f31370b) + (this.f31369a.hashCode() * 31);
        }

        public final String toString() {
            return "BasicSettingState(statusName=" + this.f31369a + ", isBasicSettingRunning=" + this.f31370b + ")";
        }
    }

    public a(GetBasicSettingsUC getBasicSettingsUC, f fVar, com.voltasit.obdeleven.domain.usecases.odx.d dVar, GetBasicSettingRequestParamUC getBasicSettingRequestParamUC, StartBasicSettingUC startBasicSettingUC, com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting.a aVar, l lVar, J8.a aVar2) {
        this.f31357o = getBasicSettingsUC;
        this.f31358p = fVar;
        this.f31359q = dVar;
        this.f31360r = getBasicSettingRequestParamUC;
        this.f31361s = startBasicSettingUC;
        this.f31362t = aVar;
        this.f31363u = lVar;
        this.f31364v = aVar2;
        U7.a<List<p207q8.a>> aVar3 = new U7.a<>();
        this.f31365w = aVar3;
        this.f31366x = aVar3;
        C<Pair<List<Param>, Boolean>> c10 = new C<>();
        this.f31367y = c10;
        this.f31368z = c10;
        C<C0329a> c11 = new C<>();
        this.f31338A = c11;
        this.f31339B = c11;
        U7.a<Pair<Integer, Boolean>> aVar4 = new U7.a<>();
        this.f31340C = aVar4;
        this.f31341D = aVar4;
        U7.a<String> aVar5 = new U7.a<>();
        this.f31342E = aVar5;
        this.f31343F = aVar5;
        U7.a<r> aVar6 = new U7.a<>();
        this.f31344G = aVar6;
        this.f31345H = aVar6;
        U7.a<r> aVar7 = new U7.a<>();
        this.f31346I = aVar7;
        this.f31347J = aVar7;
        this.f31350M = new ArrayList();
        U7.a<r> aVar8 = new U7.a<>();
        this.f31351N = aVar8;
        this.f31352O = aVar8;
        U7.a<r> aVar9 = new U7.a<>();
        this.f31353P = aVar9;
        this.f31354Q = aVar9;
        U7.a<r> aVar10 = new U7.a<>();
        this.f31355R = aVar10;
        this.f31356S = aVar10;
        String strC = Texttabe.c("MAS00112");
        i.b(strC);
        c11.k(new C0329a(strC, false));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object b(a aVar, ContinuationImpl continuationImpl) {
        UDSBasicSettingsViewModel$isPopTheHoodRequired$1 uDSBasicSettingsViewModel$isPopTheHoodRequired$1;
        boolean zBooleanValue;
        aVar.getClass();
        if (continuationImpl instanceof UDSBasicSettingsViewModel$isPopTheHoodRequired$1) {
            uDSBasicSettingsViewModel$isPopTheHoodRequired$1 = (UDSBasicSettingsViewModel$isPopTheHoodRequired$1) continuationImpl;
            int i10 = uDSBasicSettingsViewModel$isPopTheHoodRequired$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                uDSBasicSettingsViewModel$isPopTheHoodRequired$1.label = i10 - Integer.MIN_VALUE;
            } else {
                uDSBasicSettingsViewModel$isPopTheHoodRequired$1 = new UDSBasicSettingsViewModel$isPopTheHoodRequired$1(aVar, continuationImpl);
            }
        } else {
            uDSBasicSettingsViewModel$isPopTheHoodRequired$1 = new UDSBasicSettingsViewModel$isPopTheHoodRequired$1(aVar, continuationImpl);
        }
        Object objA = uDSBasicSettingsViewModel$isPopTheHoodRequired$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = uDSBasicSettingsViewModel$isPopTheHoodRequired$1.label;
        if (i11 == 0) {
            b.b(objA);
            uDSBasicSettingsViewModel$isPopTheHoodRequired$1.label = 1;
            objA = aVar.f31363u.a(uDSBasicSettingsViewModel$isPopTheHoodRequired$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(objA);
        }
        C8.a aVar2 = (C8.a) objA;
        if (aVar2 instanceof C8.a.C0024a) {
            zBooleanValue = false;
        } else {
            if (!(aVar2 instanceof C8.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            zBooleanValue = ((Boolean) ((C8.a.b) aVar2).f2463a).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009f  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object c(final a aVar, ControlUnit controlUnit, ContinuationImpl continuationImpl) {
        UDSBasicSettingsViewModel$startBasicSetting$1 uDSBasicSettingsViewModel$startBasicSetting$1;
        ControlUnit controlUnit2;
        Param param;
        p207q8.a aVar2;
        C8.a aVar3;
        StartBasicSettingUC.a aVar4;
        aVar.getClass();
        if (continuationImpl instanceof UDSBasicSettingsViewModel$startBasicSetting$1) {
            uDSBasicSettingsViewModel$startBasicSetting$1 = (UDSBasicSettingsViewModel$startBasicSetting$1) continuationImpl;
            int i10 = uDSBasicSettingsViewModel$startBasicSetting$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                uDSBasicSettingsViewModel$startBasicSetting$1.label = i10 - Integer.MIN_VALUE;
            } else {
                uDSBasicSettingsViewModel$startBasicSetting$1 = new UDSBasicSettingsViewModel$startBasicSetting$1(aVar, continuationImpl);
            }
        } else {
            uDSBasicSettingsViewModel$startBasicSetting$1 = new UDSBasicSettingsViewModel$startBasicSetting$1(aVar, continuationImpl);
        }
        UDSBasicSettingsViewModel$startBasicSetting$1 uDSBasicSettingsViewModel$startBasicSetting$2 = uDSBasicSettingsViewModel$startBasicSetting$1;
        Object objC = uDSBasicSettingsViewModel$startBasicSetting$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = uDSBasicSettingsViewModel$startBasicSetting$2.label;
        if (i11 != 0) {
            if (i11 == 1) {
                p207q8.a aVar5 = (p207q8.a) uDSBasicSettingsViewModel$startBasicSetting$2.L$3;
                Param param2 = (Param) uDSBasicSettingsViewModel$startBasicSetting$2.L$2;
                ControlUnit controlUnit3 = (ControlUnit) uDSBasicSettingsViewModel$startBasicSetting$2.L$1;
                a aVar6 = (a) uDSBasicSettingsViewModel$startBasicSetting$2.L$0;
                b.b(objC);
                aVar2 = aVar5;
                param = param2;
                aVar = aVar6;
                controlUnit2 = controlUnit3;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (a) uDSBasicSettingsViewModel$startBasicSetting$2.L$0;
                b.b(objC);
            }
            aVar3 = (C8.a) objC;
            if (aVar3 instanceof C8.a.b) {
                aVar4 = (StartBasicSettingUC.a) ((C8.a.b) aVar3).f2463a;
                if (aVar4 instanceof StartBasicSettingUC.a.C0321a) {
                    int i12 = ((StartBasicSettingUC.a.C0321a) aVar4).f30662a;
                    aVar.j.j(String.format(Locale.US, "(%02X) %s", Arrays.copyOf(new Object[]{new Integer(i12), Texttabe.a(i12)}, 2)));
                } else {
                    aVar.f31346I.j(r.f47939a);
                }
            } else if (aVar3 instanceof C8.a.C0024a) {
                aVar.e(((C8.a.C0024a) aVar3).f2462a, false);
            }
            return r.f47939a;
        }
        b.b(objC);
        Param param3 = aVar.f31348K;
        if (param3 == null) {
            return r.f47939a;
        }
        p207q8.a aVar7 = aVar.f31349L;
        if (aVar7 == null) {
            return r.f47939a;
        }
        uDSBasicSettingsViewModel$startBasicSetting$2.L$0 = aVar;
        uDSBasicSettingsViewModel$startBasicSetting$2.L$1 = controlUnit;
        uDSBasicSettingsViewModel$startBasicSetting$2.L$2 = param3;
        uDSBasicSettingsViewModel$startBasicSetting$2.L$3 = aVar7;
        uDSBasicSettingsViewModel$startBasicSetting$2.label = 1;
        if (aVar.f31362t.b(controlUnit, aVar7, true, uDSBasicSettingsViewModel$startBasicSetting$2) == coroutineSingletons) {
            return coroutineSingletons;
        }
        controlUnit2 = controlUnit;
        param = param3;
        aVar2 = aVar7;
        StartBasicSettingUC startBasicSettingUC = aVar.f31361s;
        Ia.l<o, r> lVar = new Ia.l<o, r>() { // from class: com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsViewModel$startBasicSetting$result$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(o oVar) {
                o it = oVar;
                i.e(it, "it");
                a aVar8 = this.this$0;
                aVar8.getClass();
                String strC = Texttabe.c(it.f44637a);
                C<a.C0329a> c10 = aVar8.f31338A;
                i.b(strC);
                c10.k(new a.C0329a(strC, !it.equals(o.h.f44643b)));
                return r.f47939a;
            }
        };
        uDSBasicSettingsViewModel$startBasicSetting$2.L$0 = aVar;
        uDSBasicSettingsViewModel$startBasicSetting$2.L$1 = controlUnit2;
        uDSBasicSettingsViewModel$startBasicSetting$2.L$2 = null;
        uDSBasicSettingsViewModel$startBasicSetting$2.L$3 = null;
        uDSBasicSettingsViewModel$startBasicSetting$2.label = 2;
        objC = startBasicSettingUC.c(controlUnit2, aVar2, param, lVar, uDSBasicSettingsViewModel$startBasicSetting$2);
        if (objC == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar3 = (C8.a) objC;
        if (aVar3 instanceof C8.a.b) {
            aVar4 = (StartBasicSettingUC.a) ((C8.a.b) aVar3).f2463a;
            if (aVar4 instanceof StartBasicSettingUC.a.C0321a) {
                int i13 = ((StartBasicSettingUC.a.C0321a) aVar4).f30662a;
                aVar.j.j(String.format(Locale.US, "(%02X) %s", Arrays.copyOf(new Object[]{new Integer(i13), Texttabe.a(i13)}, 2)));
            } else {
                aVar.f31346I.j(r.f47939a);
            }
        } else if (aVar3 instanceof C8.a.C0024a) {
            aVar.e(((C8.a.C0024a) aVar3).f2462a, false);
        }
        return r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object d(a aVar, ControlUnit controlUnit, ContinuationImpl continuationImpl) {
        UDSBasicSettingsViewModel$stopBasicSetting$1 uDSBasicSettingsViewModel$stopBasicSetting$1;
        aVar.getClass();
        if (continuationImpl instanceof UDSBasicSettingsViewModel$stopBasicSetting$1) {
            uDSBasicSettingsViewModel$stopBasicSetting$1 = (UDSBasicSettingsViewModel$stopBasicSetting$1) continuationImpl;
            int i10 = uDSBasicSettingsViewModel$stopBasicSetting$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                uDSBasicSettingsViewModel$stopBasicSetting$1.label = i10 - Integer.MIN_VALUE;
            } else {
                uDSBasicSettingsViewModel$stopBasicSetting$1 = new UDSBasicSettingsViewModel$stopBasicSetting$1(aVar, continuationImpl);
            }
        } else {
            uDSBasicSettingsViewModel$stopBasicSetting$1 = new UDSBasicSettingsViewModel$stopBasicSetting$1(aVar, continuationImpl);
        }
        Object obj = uDSBasicSettingsViewModel$stopBasicSetting$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = uDSBasicSettingsViewModel$stopBasicSetting$1.label;
        if (i11 == 0) {
            b.b(obj);
            p207q8.a aVar2 = aVar.f31349L;
            if (aVar2 == null) {
                return r.f47939a;
            }
            uDSBasicSettingsViewModel$stopBasicSetting$1.L$0 = aVar;
            uDSBasicSettingsViewModel$stopBasicSetting$1.label = 1;
            if (aVar.f31362t.b(controlUnit, aVar2, false, uDSBasicSettingsViewModel$stopBasicSetting$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) uDSBasicSettingsViewModel$stopBasicSetting$1.L$0;
            b.b(obj);
        }
        aVar.getClass();
        String strC = Texttabe.c("MAS00112");
        i.b(strC);
        aVar.f31338A.k(new C0329a(strC, false));
        return r.f47939a;
    }

    public final void e(Throwable th, boolean z10) {
        if (th instanceof BasicSettingsNotAvailable) {
            this.f31344G.j(r.f47939a);
            return;
        }
        boolean z11 = th instanceof DescriptionNotFound;
        U7.a<Pair<Integer, Boolean>> aVar = this.f31340C;
        if (z11) {
            aVar.j(new Pair<>(Integer.valueOf(R.string.common_description_data_na), Boolean.valueOf(z10)));
            return;
        }
        if (th instanceof CheckNetworkConnection) {
            aVar.j(new Pair<>(Integer.valueOf(R.string.common_check_network_try_again), Boolean.valueOf(z10)));
        } else if (th instanceof StartBasicSettingUC.SecurityAccessException) {
            this.f31353P.j(r.f47939a);
        } else {
            aVar.j(new Pair<>(Integer.valueOf(R.string.common_something_went_wrong), Boolean.valueOf(z10)));
        }
    }
}
