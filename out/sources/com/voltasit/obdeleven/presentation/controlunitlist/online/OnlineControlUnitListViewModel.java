package com.voltasit.obdeleven.presentation.controlunitlist.online;

import A8.g;
import Aa.c;
import G8.D;
import J8.p;
import J8.x;
import K8.o;
import androidx.collection.Y;
import androidx.lifecycle.C;
import androidx.lifecycle.K;
import androidx.lifecycle.Z;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.f;
import com.voltasit.obdeleven.domain.exceptions.CouldNotSaveException;
import com.voltasit.obdeleven.domain.exceptions.SecurityAccessException;
import com.voltasit.obdeleven.domain.usecases.controlUnit.e;
import com.voltasit.obdeleven.domain.usecases.gateway.d;
import com.voltasit.obdeleven.domain.usecases.m;
import com.voltasit.obdeleven.domain.usecases.user.GetUserDetailsUC;
import com.voltasit.obdeleven.domain.usecases.user.v;
import com.voltasit.obdeleven.domain.usecases.vehicle.l;
import com.voltasit.obdeleven.domain.usecases.vehicle.n;
import com.voltasit.obdeleven.presentation.controlunitlist.h;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2673a0;
import kotlinx.coroutines.C2680e;
import me.zhanghai.android.materialprogressbar.R;
import p134k8.S0;
import p293xa.r;

/* JADX INFO: compiled from: OnlineControlUnitListViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class OnlineControlUnitListViewModel extends h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final e f32066A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final GetUserDetailsUC f32067B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final v f32068C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final l f32069D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final n f32070E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final L8.a f32071F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final C f32072G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final U7.a<r> f32073H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final U7.a f32074I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final U7.a<List<f>> f32075J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final U7.a f32076K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final U7.a<SfdUnlockDialogOrigin> f32077L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final U7.a f32078M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final U7.a<a> f32079N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final U7.a f32080O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final U7.a<Map<Short, f>> f32081P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final U7.a f32082Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final U7.a<r> f32083R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final U7.a f32084S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final U7.a<b> f32085T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final U7.a f32086U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final U7.a<Boolean> f32087V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final U7.a f32088W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public List<? extends ControlUnit> f32089X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f32090Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final U7.a<r> f32091Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final U7.a f32092a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public f f32093b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Y<S0> f32094c0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o f32095s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p f32096t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final m f32097u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.vehicle.a f32098v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.vehicle.e f32099w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final d f32100x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.vehicle.d f32101y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final g f32102z;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: OnlineControlUnitListViewModel.kt */
    @c(c = "com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListViewModel$1", f = "OnlineControlUnitListViewModel.kt", l = {R.styleable.AppCompatTheme_ratingBarStyleSmall}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return OnlineControlUnitListViewModel.this.new AnonymousClass1(cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                final OnlineControlUnitListViewModel onlineControlUnitListViewModel = OnlineControlUnitListViewModel.this;
                e eVar = onlineControlUnitListViewModel.f32066A;
                Ia.l<Short, r> lVar = new Ia.l<Short, r>() { // from class: com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListViewModel.1.1
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(Short sh) {
                        sh.shortValue();
                        onlineControlUnitListViewModel.f32096t.e("OnlineControlUnitListViewModel", "Received update control units notification");
                        OnlineControlUnitListViewModel onlineControlUnitListViewModel2 = onlineControlUnitListViewModel;
                        onlineControlUnitListViewModel2.getClass();
                        C2680e.c(Z.a(onlineControlUnitListViewModel2), onlineControlUnitListViewModel2.f32112a, null, new OnlineControlUnitListViewModel$requestControlUnits$1(onlineControlUnitListViewModel2, false, null), 2);
                        return r.f47939a;
                    }
                };
                this.label = 1;
                if (eVar.a(lVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return r.f47939a;
        }
    }

    /* JADX INFO: compiled from: OnlineControlUnitListViewModel.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ControlUnit f32103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f32104b;

        public a(int i10, ControlUnit controlUnit) {
            this.f32103a = controlUnit;
            this.f32104b = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return i.a(this.f32103a, aVar.f32103a) && this.f32104b == aVar.f32104b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f32104b) + (this.f32103a.hashCode() * 31);
        }

        public final String toString() {
            return "ControlUnitNavigationParams(controlUnit=" + this.f32103a + ", position=" + this.f32104b + ")";
        }
    }

    /* JADX INFO: compiled from: OnlineControlUnitListViewModel.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f32105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final short f32106b;

        public b(String str, short s10) {
            this.f32105a = str;
            this.f32106b = s10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return i.a(this.f32105a, bVar.f32105a) && this.f32106b == bVar.f32106b;
        }

        public final int hashCode() {
            return Short.hashCode(this.f32106b) + (this.f32105a.hashCode() * 31);
        }

        public final String toString() {
            return "SecurityAccessParams(cuBaseId=" + this.f32105a + ", klineId=" + ((int) this.f32106b) + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnlineControlUnitListViewModel(K k10, String vehicleId, o oVar, p pVar, m mVar, com.voltasit.obdeleven.domain.usecases.vehicle.a aVar, com.voltasit.obdeleven.domain.usecases.vehicle.e eVar, d dVar, com.voltasit.obdeleven.domain.usecases.vehicle.b bVar, com.voltasit.obdeleven.domain.usecases.vehicle.d dVar2, g gVar, com.voltasit.obdeleven.domain.usecases.controlUnit.c cVar, com.voltasit.obdeleven.domain.usecases.vehicle.m mVar2, e eVar2, GetUserDetailsUC getUserDetailsUC, v vVar, l lVar, n nVar, L8.a aVar2) {
        super(k10, vehicleId, cVar);
        i.e(vehicleId, "vehicleId");
        this.f32095s = oVar;
        this.f32096t = pVar;
        this.f32097u = mVar;
        this.f32098v = aVar;
        this.f32099w = eVar;
        this.f32100x = dVar;
        this.f32101y = dVar2;
        this.f32102z = gVar;
        this.f32066A = eVar2;
        this.f32067B = getUserDetailsUC;
        this.f32068C = vVar;
        this.f32069D = lVar;
        this.f32070E = nVar;
        this.f32071F = aVar2;
        C c10 = new C();
        this.f32072G = c10;
        U7.a<r> aVar3 = new U7.a<>();
        this.f32073H = aVar3;
        this.f32074I = aVar3;
        U7.a<List<f>> aVar4 = new U7.a<>();
        this.f32075J = aVar4;
        this.f32076K = aVar4;
        U7.a<SfdUnlockDialogOrigin> aVar5 = new U7.a<>();
        this.f32077L = aVar5;
        this.f32078M = aVar5;
        U7.a<a> aVar6 = new U7.a<>();
        this.f32079N = aVar6;
        this.f32080O = aVar6;
        U7.a<Map<Short, f>> aVar7 = new U7.a<>();
        this.f32081P = aVar7;
        this.f32082Q = aVar7;
        U7.a<r> aVar8 = new U7.a<>();
        this.f32083R = aVar8;
        this.f32084S = aVar8;
        U7.a<b> aVar9 = new U7.a<>();
        this.f32085T = aVar9;
        this.f32086U = aVar9;
        U7.a<Boolean> aVar10 = new U7.a<>();
        this.f32087V = aVar10;
        this.f32088W = aVar10;
        this.f32089X = EmptyList.f42983b;
        U7.a<r> aVar11 = new U7.a<>();
        this.f32091Z = aVar11;
        this.f32092a0 = aVar11;
        if (!mVar2.f31062a.b()) {
            this.f32117f.j(r.f47939a);
            return;
        }
        r params = r.f47939a;
        i.e(params, "params");
        c10.j(Boolean.valueOf(bVar.f31041c.r()));
        C2680e.c(Z.a(this), this.f32112a, null, new OnlineControlUnitListViewModel$requestControlUnits$1(this, false, null), 2);
        C2680e.c(Z.a(this), this.f32112a, null, new AnonymousClass1(null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object f(OnlineControlUnitListViewModel onlineControlUnitListViewModel, ContinuationImpl continuationImpl) {
        OnlineControlUnitListViewModel$isPopTheHoodRequired$1 onlineControlUnitListViewModel$isPopTheHoodRequired$1;
        boolean zBooleanValue;
        onlineControlUnitListViewModel.getClass();
        if (continuationImpl instanceof OnlineControlUnitListViewModel$isPopTheHoodRequired$1) {
            onlineControlUnitListViewModel$isPopTheHoodRequired$1 = (OnlineControlUnitListViewModel$isPopTheHoodRequired$1) continuationImpl;
            int i10 = onlineControlUnitListViewModel$isPopTheHoodRequired$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                onlineControlUnitListViewModel$isPopTheHoodRequired$1.label = i10 - Integer.MIN_VALUE;
            } else {
                onlineControlUnitListViewModel$isPopTheHoodRequired$1 = new OnlineControlUnitListViewModel$isPopTheHoodRequired$1(onlineControlUnitListViewModel, continuationImpl);
            }
        } else {
            onlineControlUnitListViewModel$isPopTheHoodRequired$1 = new OnlineControlUnitListViewModel$isPopTheHoodRequired$1(onlineControlUnitListViewModel, continuationImpl);
        }
        Object objA = onlineControlUnitListViewModel$isPopTheHoodRequired$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = onlineControlUnitListViewModel$isPopTheHoodRequired$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            onlineControlUnitListViewModel$isPopTheHoodRequired$1.label = 1;
            objA = onlineControlUnitListViewModel.f32069D.a(onlineControlUnitListViewModel$isPopTheHoodRequired$1);
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
    public static final Object g(OnlineControlUnitListViewModel onlineControlUnitListViewModel, ContinuationImpl continuationImpl) {
        OnlineControlUnitListViewModel$isVehicleSfdProtected$1 onlineControlUnitListViewModel$isVehicleSfdProtected$1;
        boolean zBooleanValue;
        onlineControlUnitListViewModel.getClass();
        if (continuationImpl instanceof OnlineControlUnitListViewModel$isVehicleSfdProtected$1) {
            onlineControlUnitListViewModel$isVehicleSfdProtected$1 = (OnlineControlUnitListViewModel$isVehicleSfdProtected$1) continuationImpl;
            int i10 = onlineControlUnitListViewModel$isVehicleSfdProtected$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                onlineControlUnitListViewModel$isVehicleSfdProtected$1.label = i10 - Integer.MIN_VALUE;
            } else {
                onlineControlUnitListViewModel$isVehicleSfdProtected$1 = new OnlineControlUnitListViewModel$isVehicleSfdProtected$1(onlineControlUnitListViewModel, continuationImpl);
            }
        } else {
            onlineControlUnitListViewModel$isVehicleSfdProtected$1 = new OnlineControlUnitListViewModel$isVehicleSfdProtected$1(onlineControlUnitListViewModel, continuationImpl);
        }
        Object objA = onlineControlUnitListViewModel$isVehicleSfdProtected$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = onlineControlUnitListViewModel$isVehicleSfdProtected$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            onlineControlUnitListViewModel.f32113b.j(PreloaderState.c.f32642a);
            String str = (String) onlineControlUnitListViewModel.f32040p.d();
            if (str == null) {
                str = "";
            }
            onlineControlUnitListViewModel$isVehicleSfdProtected$1.L$0 = onlineControlUnitListViewModel;
            onlineControlUnitListViewModel$isVehicleSfdProtected$1.label = 1;
            objA = onlineControlUnitListViewModel.f32070E.a(str, onlineControlUnitListViewModel$isVehicleSfdProtected$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            onlineControlUnitListViewModel = (OnlineControlUnitListViewModel) onlineControlUnitListViewModel$isVehicleSfdProtected$1.L$0;
            kotlin.b.b(objA);
        }
        C8.a aVar = (C8.a) objA;
        if (aVar instanceof C8.a.C0024a) {
            onlineControlUnitListViewModel.f32096t.d(((C8.a.C0024a) aVar).f2462a, true);
            zBooleanValue = false;
        } else {
            if (!(aVar instanceof C8.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            zBooleanValue = ((Boolean) ((C8.a.b) aVar).f2463a).booleanValue();
        }
        onlineControlUnitListViewModel.f32113b.j(PreloaderState.d.f32643a);
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object h(OnlineControlUnitListViewModel onlineControlUnitListViewModel, f fVar, Y y10, ContinuationImpl continuationImpl) {
        OnlineControlUnitListViewModel$writeGatewayCoding$1 onlineControlUnitListViewModel$writeGatewayCoding$1;
        Short shN;
        String str;
        onlineControlUnitListViewModel.getClass();
        if (continuationImpl instanceof OnlineControlUnitListViewModel$writeGatewayCoding$1) {
            onlineControlUnitListViewModel$writeGatewayCoding$1 = (OnlineControlUnitListViewModel$writeGatewayCoding$1) continuationImpl;
            int i10 = onlineControlUnitListViewModel$writeGatewayCoding$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                onlineControlUnitListViewModel$writeGatewayCoding$1.label = i10 - Integer.MIN_VALUE;
            } else {
                onlineControlUnitListViewModel$writeGatewayCoding$1 = new OnlineControlUnitListViewModel$writeGatewayCoding$1(onlineControlUnitListViewModel, continuationImpl);
            }
        } else {
            onlineControlUnitListViewModel$writeGatewayCoding$1 = new OnlineControlUnitListViewModel$writeGatewayCoding$1(onlineControlUnitListViewModel, continuationImpl);
        }
        Object obj = onlineControlUnitListViewModel$writeGatewayCoding$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = onlineControlUnitListViewModel$writeGatewayCoding$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                Short sh = (Short) onlineControlUnitListViewModel$writeGatewayCoding$1.L$2;
                str = (String) onlineControlUnitListViewModel$writeGatewayCoding$1.L$1;
                OnlineControlUnitListViewModel onlineControlUnitListViewModel2 = (OnlineControlUnitListViewModel) onlineControlUnitListViewModel$writeGatewayCoding$1.L$0;
                kotlin.b.b(obj);
                shN = sh;
                onlineControlUnitListViewModel = onlineControlUnitListViewModel2;
            } else {
                if (i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            r rVar = r.f47939a;
            Na.i iVar = E8.a.f3126a;
            return rVar;
        }
        kotlin.b.b(obj);
        String objectId = fVar.f29320b.getControlUnitBase().getObjectId();
        shN = fVar.n();
        T tD = onlineControlUnitListViewModel.f32040p.d();
        i.b(tD);
        d.a aVar = new d.a((String) tD, fVar, y10, new Y(0));
        onlineControlUnitListViewModel$writeGatewayCoding$1.L$0 = onlineControlUnitListViewModel;
        onlineControlUnitListViewModel$writeGatewayCoding$1.L$1 = objectId;
        onlineControlUnitListViewModel$writeGatewayCoding$1.L$2 = shN;
        onlineControlUnitListViewModel$writeGatewayCoding$1.label = 1;
        Object objB = onlineControlUnitListViewModel.f32100x.b(aVar, onlineControlUnitListViewModel$writeGatewayCoding$1);
        if (objB == coroutineSingletons) {
            return coroutineSingletons;
        }
        obj = objB;
        str = objectId;
        C8.a aVar2 = (C8.a) obj;
        if (aVar2 instanceof C8.a.b) {
            onlineControlUnitListViewModel$writeGatewayCoding$1.L$0 = null;
            onlineControlUnitListViewModel$writeGatewayCoding$1.L$1 = null;
            onlineControlUnitListViewModel$writeGatewayCoding$1.L$2 = null;
            onlineControlUnitListViewModel$writeGatewayCoding$1.label = 2;
            if (onlineControlUnitListViewModel.l(false, onlineControlUnitListViewModel$writeGatewayCoding$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (!(aVar2 instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            Throwable throwable = ((C8.a.C0024a) aVar2).f2462a;
            if (throwable instanceof CouldNotSaveException) {
                onlineControlUnitListViewModel$writeGatewayCoding$1.L$0 = null;
                onlineControlUnitListViewModel$writeGatewayCoding$1.L$1 = null;
                onlineControlUnitListViewModel$writeGatewayCoding$1.L$2 = null;
                onlineControlUnitListViewModel$writeGatewayCoding$1.label = 3;
                if (onlineControlUnitListViewModel.l(true, onlineControlUnitListViewModel$writeGatewayCoding$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                i.b(str);
                i.b(shN);
                short sShortValue = shN.shortValue();
                onlineControlUnitListViewModel.getClass();
                i.e(throwable, "throwable");
                if (throwable instanceof SecurityAccessException) {
                    onlineControlUnitListViewModel.f32085T.j(new b(str, sShortValue));
                } else {
                    onlineControlUnitListViewModel.f32119h.j(Integer.valueOf(com.voltasit.obdeleven.R.string.view_cu_list_gateway_list_coding_rejected));
                    onlineControlUnitListViewModel.f32096t.d(throwable, false);
                    onlineControlUnitListViewModel.f32113b.j(PreloaderState.d.f32643a);
                }
            }
        }
        r rVar2 = r.f47939a;
        Na.i iVar2 = E8.a.f3126a;
        return rVar2;
    }

    @Override // com.voltasit.obdeleven.presentation.controlunitlist.h
    public final void b(int i10) {
        Object obj;
        G8.C c10;
        Iterator<T> it = this.f32089X.iterator();
        while (true) {
            obj = null;
            pVar = null;
            p293xa.p pVar = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            short sShortValue = ((ControlUnit) next).n().shortValue();
            List list = (List) this.f32042r.d();
            if (list != null && (c10 = (G8.C) list.get(i10)) != null) {
                pVar = new p293xa.p(c10.f3406a);
            }
            if (pVar != null && sShortValue == pVar.f47935b) {
                obj = next;
                break;
            }
        }
        ControlUnit controlUnit = (ControlUnit) obj;
        if (controlUnit != null) {
            this.f32079N.j(new a(i10, controlUnit));
        }
    }

    @Override // com.voltasit.obdeleven.presentation.controlunitlist.h
    public final void c(int i10) {
        this.f32095s.f(i10, false);
        C<List<G8.C>> c10 = this.f32041q;
        List list = (List) this.f32042r.d();
        if (list == null) {
            list = EmptyList.f42983b;
        }
        c10.j(h.e(i10, list));
    }

    public final Object i(List list, boolean z10, ContinuationImpl continuationImpl) {
        this.f32089X = list;
        List<ControlUnit> list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(list2, 10));
        for (ControlUnit controlUnit : list2) {
            this.f32096t.e("OnlineControlUnitListViewModel", B7.b.c("Mapping control unit with id: ", controlUnit.f29320b.getObjectId()));
            arrayList.add(this.f32102z.a(controlUnit));
        }
        d(this.f32095s.X(false), arrayList);
        if (z10) {
            this.f32119h.j(new Integer(com.voltasit.obdeleven.R.string.snackbar_failed_to_save_history));
        }
        Object objM = m(continuationImpl);
        return objM == CoroutineSingletons.f43038b ? objM : r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(List list, boolean z10, ContinuationImpl continuationImpl) {
        OnlineControlUnitListViewModel$handleGatewayCodingSuccess$1 onlineControlUnitListViewModel$handleGatewayCodingSuccess$1;
        OnlineControlUnitListViewModel onlineControlUnitListViewModel;
        if (continuationImpl instanceof OnlineControlUnitListViewModel$handleGatewayCodingSuccess$1) {
            onlineControlUnitListViewModel$handleGatewayCodingSuccess$1 = (OnlineControlUnitListViewModel$handleGatewayCodingSuccess$1) continuationImpl;
            int i10 = onlineControlUnitListViewModel$handleGatewayCodingSuccess$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                onlineControlUnitListViewModel$handleGatewayCodingSuccess$1.label = i10 - Integer.MIN_VALUE;
            } else {
                onlineControlUnitListViewModel$handleGatewayCodingSuccess$1 = new OnlineControlUnitListViewModel$handleGatewayCodingSuccess$1(this, continuationImpl);
            }
        } else {
            onlineControlUnitListViewModel$handleGatewayCodingSuccess$1 = new OnlineControlUnitListViewModel$handleGatewayCodingSuccess$1(this, continuationImpl);
        }
        Object obj = onlineControlUnitListViewModel$handleGatewayCodingSuccess$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = onlineControlUnitListViewModel$handleGatewayCodingSuccess$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            onlineControlUnitListViewModel$handleGatewayCodingSuccess$1.L$0 = this;
            onlineControlUnitListViewModel$handleGatewayCodingSuccess$1.Z$0 = z10;
            onlineControlUnitListViewModel$handleGatewayCodingSuccess$1.label = 1;
            if (i(list, false, onlineControlUnitListViewModel$handleGatewayCodingSuccess$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            onlineControlUnitListViewModel = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = onlineControlUnitListViewModel$handleGatewayCodingSuccess$1.Z$0;
            onlineControlUnitListViewModel = (OnlineControlUnitListViewModel) onlineControlUnitListViewModel$handleGatewayCodingSuccess$1.L$0;
            kotlin.b.b(obj);
        }
        onlineControlUnitListViewModel.getClass();
        C2680e.c(C2673a0.f43223b, onlineControlUnitListViewModel.f32112a, null, new OnlineControlUnitListViewModel$notifySubscriptionFunctionUsed$1(onlineControlUnitListViewModel, null), 2);
        onlineControlUnitListViewModel.f32087V.j(Boolean.valueOf(z10));
        return r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(boolean z10, boolean z11, ContinuationImpl continuationImpl) {
        OnlineControlUnitListViewModel$loadControlUnitList$1 onlineControlUnitListViewModel$loadControlUnitList$1;
        OnlineControlUnitListViewModel onlineControlUnitListViewModel;
        if (continuationImpl instanceof OnlineControlUnitListViewModel$loadControlUnitList$1) {
            onlineControlUnitListViewModel$loadControlUnitList$1 = (OnlineControlUnitListViewModel$loadControlUnitList$1) continuationImpl;
            int i10 = onlineControlUnitListViewModel$loadControlUnitList$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                onlineControlUnitListViewModel$loadControlUnitList$1.label = i10 - Integer.MIN_VALUE;
            } else {
                onlineControlUnitListViewModel$loadControlUnitList$1 = new OnlineControlUnitListViewModel$loadControlUnitList$1(this, continuationImpl);
            }
        } else {
            onlineControlUnitListViewModel$loadControlUnitList$1 = new OnlineControlUnitListViewModel$loadControlUnitList$1(this, continuationImpl);
        }
        Object objH = onlineControlUnitListViewModel$loadControlUnitList$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = onlineControlUnitListViewModel$loadControlUnitList$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                z11 = onlineControlUnitListViewModel$loadControlUnitList$1.Z$0;
                onlineControlUnitListViewModel = (OnlineControlUnitListViewModel) onlineControlUnitListViewModel$loadControlUnitList$1.L$0;
                kotlin.b.b(objH);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                onlineControlUnitListViewModel = (OnlineControlUnitListViewModel) onlineControlUnitListViewModel$loadControlUnitList$1.L$0;
                kotlin.b.b(objH);
            }
            r rVar = r.f47939a;
            Na.i iVar = E8.a.f3126a;
            onlineControlUnitListViewModel.f32113b.j(PreloaderState.d.f32643a);
            return rVar;
        }
        kotlin.b.b(objH);
        this.f32096t.f("OnlineControlUnitListViewModel", "loadControlUnitList(forceRead: " + z10 + ")");
        this.f32113b.j(new PreloaderState.a(com.voltasit.obdeleven.R.string.view_cu_list_loading_control_units));
        onlineControlUnitListViewModel$loadControlUnitList$1.L$0 = this;
        onlineControlUnitListViewModel$loadControlUnitList$1.Z$0 = z11;
        onlineControlUnitListViewModel$loadControlUnitList$1.label = 1;
        m mVar = this.f32097u;
        mVar.getClass();
        objH = mVar.f30863c.h(z10, onlineControlUnitListViewModel$loadControlUnitList$1);
        if (objH == coroutineSingletons) {
            return coroutineSingletons;
        }
        onlineControlUnitListViewModel = this;
        C8.a aVar = (C8.a) objH;
        if (aVar instanceof C8.a.b) {
            List list = (List) ((C8.a.b) aVar).f2463a;
            onlineControlUnitListViewModel$loadControlUnitList$1.L$0 = onlineControlUnitListViewModel;
            onlineControlUnitListViewModel$loadControlUnitList$1.label = 2;
            if (onlineControlUnitListViewModel.i(list, z11, onlineControlUnitListViewModel$loadControlUnitList$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (!(aVar instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            B7.b.h(I.e.g(((C8.a.C0024a) aVar).f2462a), onlineControlUnitListViewModel.f32119h);
        }
        r rVar2 = r.f47939a;
        Na.i iVar2 = E8.a.f3126a;
        onlineControlUnitListViewModel.f32113b.j(PreloaderState.d.f32643a);
        return rVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(boolean z10, ContinuationImpl continuationImpl) {
        OnlineControlUnitListViewModel$onListWriteSuccess$1 onlineControlUnitListViewModel$onListWriteSuccess$1;
        Object obj;
        boolean z11;
        OnlineControlUnitListViewModel onlineControlUnitListViewModel;
        if (continuationImpl instanceof OnlineControlUnitListViewModel$onListWriteSuccess$1) {
            onlineControlUnitListViewModel$onListWriteSuccess$1 = (OnlineControlUnitListViewModel$onListWriteSuccess$1) continuationImpl;
            int i10 = onlineControlUnitListViewModel$onListWriteSuccess$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                onlineControlUnitListViewModel$onListWriteSuccess$1.label = i10 - Integer.MIN_VALUE;
            } else {
                onlineControlUnitListViewModel$onListWriteSuccess$1 = new OnlineControlUnitListViewModel$onListWriteSuccess$1(this, continuationImpl);
            }
        } else {
            onlineControlUnitListViewModel$onListWriteSuccess$1 = new OnlineControlUnitListViewModel$onListWriteSuccess$1(this, continuationImpl);
        }
        Object obj2 = onlineControlUnitListViewModel$onListWriteSuccess$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = onlineControlUnitListViewModel$onListWriteSuccess$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                boolean z12 = onlineControlUnitListViewModel$onListWriteSuccess$1.Z$0;
                OnlineControlUnitListViewModel onlineControlUnitListViewModel2 = (OnlineControlUnitListViewModel) onlineControlUnitListViewModel$onListWriteSuccess$1.L$0;
                kotlin.b.b(obj2);
                z11 = z12;
                onlineControlUnitListViewModel = onlineControlUnitListViewModel2;
                obj = obj2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                onlineControlUnitListViewModel = (OnlineControlUnitListViewModel) onlineControlUnitListViewModel$onListWriteSuccess$1.L$0;
                kotlin.b.b(obj2);
            }
            r rVar = r.f47939a;
            Na.i iVar = E8.a.f3126a;
            onlineControlUnitListViewModel.f32113b.j(PreloaderState.d.f32643a);
            return rVar;
        }
        kotlin.b.b(obj2);
        this.f32113b.j(new PreloaderState.a(com.voltasit.obdeleven.R.string.view_cu_list_loading_control_units));
        onlineControlUnitListViewModel$onListWriteSuccess$1.L$0 = this;
        onlineControlUnitListViewModel$onListWriteSuccess$1.Z$0 = z10;
        onlineControlUnitListViewModel$onListWriteSuccess$1.label = 1;
        m mVar = this.f32097u;
        mVar.getClass();
        Object objH = mVar.f30863c.h(true, onlineControlUnitListViewModel$onListWriteSuccess$1);
        if (objH == coroutineSingletons) {
            return coroutineSingletons;
        }
        obj = objH;
        z11 = z10;
        onlineControlUnitListViewModel = this;
        C8.a aVar = (C8.a) obj;
        if (aVar instanceof C8.a.b) {
            List list = (List) ((C8.a.b) aVar).f2463a;
            onlineControlUnitListViewModel$onListWriteSuccess$1.L$0 = onlineControlUnitListViewModel;
            onlineControlUnitListViewModel$onListWriteSuccess$1.label = 2;
            if (onlineControlUnitListViewModel.j(list, z11, onlineControlUnitListViewModel$onListWriteSuccess$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (!(aVar instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            B7.b.h(I.e.g(((C8.a.C0024a) aVar).f2462a), onlineControlUnitListViewModel.f32119h);
        }
        r rVar2 = r.f47939a;
        Na.i iVar2 = E8.a.f3126a;
        onlineControlUnitListViewModel.f32113b.j(PreloaderState.d.f32643a);
        return rVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object m(ContinuationImpl continuationImpl) {
        OnlineControlUnitListViewModel$showAutocodeDialog$1 onlineControlUnitListViewModel$showAutocodeDialog$1;
        OnlineControlUnitListViewModel onlineControlUnitListViewModel;
        Object next;
        if (continuationImpl instanceof OnlineControlUnitListViewModel$showAutocodeDialog$1) {
            onlineControlUnitListViewModel$showAutocodeDialog$1 = (OnlineControlUnitListViewModel$showAutocodeDialog$1) continuationImpl;
            int i10 = onlineControlUnitListViewModel$showAutocodeDialog$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                onlineControlUnitListViewModel$showAutocodeDialog$1.label = i10 - Integer.MIN_VALUE;
            } else {
                onlineControlUnitListViewModel$showAutocodeDialog$1 = new OnlineControlUnitListViewModel$showAutocodeDialog$1(this, continuationImpl);
            }
        } else {
            onlineControlUnitListViewModel$showAutocodeDialog$1 = new OnlineControlUnitListViewModel$showAutocodeDialog$1(this, continuationImpl);
        }
        Object objA = onlineControlUnitListViewModel$showAutocodeDialog$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = onlineControlUnitListViewModel$showAutocodeDialog$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            onlineControlUnitListViewModel$showAutocodeDialog$1.L$0 = this;
            onlineControlUnitListViewModel$showAutocodeDialog$1.label = 1;
            objA = this.f32067B.a(onlineControlUnitListViewModel$showAutocodeDialog$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            onlineControlUnitListViewModel = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            onlineControlUnitListViewModel = (OnlineControlUnitListViewModel) onlineControlUnitListViewModel$showAutocodeDialog$1.L$0;
            kotlin.b.b(objA);
        }
        C8.a aVar = (C8.a) objA;
        if (aVar instanceof C8.a.b) {
            if (((D) ((C8.a.b) aVar).f2463a).f3410a.c()) {
                com.voltasit.obdeleven.domain.usecases.vehicle.a aVar2 = onlineControlUnitListViewModel.f32098v;
                r params = r.f47939a;
                aVar2.getClass();
                i.e(params, "params");
                x xVar = aVar2.f31040c;
                if (xVar.r()) {
                    Iterator<T> it = xVar.o().values().iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!((f) next).O0());
                    if (next != null && !onlineControlUnitListViewModel.f32090Y && onlineControlUnitListViewModel.f32095s.r()) {
                        onlineControlUnitListViewModel.f32090Y = true;
                        onlineControlUnitListViewModel.f32073H.j(r.f47939a);
                    }
                }
            }
        } else if (aVar instanceof C8.a.C0024a) {
            onlineControlUnitListViewModel.f32083R.j(r.f47939a);
        }
        return r.f47939a;
    }

    public final void n() {
        r params = r.f47939a;
        com.voltasit.obdeleven.domain.usecases.vehicle.d dVar = this.f32101y;
        dVar.getClass();
        i.e(params, "params");
        Collection<f> collectionValues = dVar.f31045c.o().values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((f) obj).O0()) {
                arrayList.add(obj);
            }
        }
        this.f32075J.j(arrayList);
        this.f32090Y = true;
    }

    public final void o() {
        C2680e.c(Z.a(this), this.f32112a, null, new OnlineControlUnitListViewModel$showGatewayCodingIfPossible$1(this, null), 2);
    }
}
