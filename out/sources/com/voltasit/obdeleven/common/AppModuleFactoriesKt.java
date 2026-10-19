package com.voltasit.obdeleven.common;

import A8.u;
import A8.z;
import Ia.l;
import Ia.p;
import J8.g;
import J8.q;
import J8.x;
import K8.h;
import K8.o;
import K8.s;
import K8.v;
import K8.w;
import Nb.a;
import Pb.b;
import com.google.android.gms.internal.measurement.C1787c0;
import com.voltasit.obdeleven.domain.providers.PurchaseProvider;
import com.voltasit.obdeleven.domain.repositories.AgreementRepository;
import com.voltasit.obdeleven.domain.timers.BasicSettingStatusTimer;
import com.voltasit.obdeleven.domain.usecases.A;
import com.voltasit.obdeleven.domain.usecases.B;
import com.voltasit.obdeleven.domain.usecases.C;
import com.voltasit.obdeleven.domain.usecases.C2113b;
import com.voltasit.obdeleven.domain.usecases.C2114c;
import com.voltasit.obdeleven.domain.usecases.GetSortedVehicleModelListUseCase;
import com.voltasit.obdeleven.domain.usecases.LoadVehicleIntoCacheUseCase;
import com.voltasit.obdeleven.domain.usecases.SaveBasicSettingHistoryUC;
import com.voltasit.obdeleven.domain.usecases.VehicleClearFaultsUseCase;
import com.voltasit.obdeleven.domain.usecases.WriteOcaCommandValueUC;
import com.voltasit.obdeleven.domain.usecases.controlUnit.GetControlUnitOdxVersionUC;
import com.voltasit.obdeleven.domain.usecases.controlUnit.ScanControlUnitUC;
import com.voltasit.obdeleven.domain.usecases.controlUnit.UpdateControlUnitOdxVersionUC;
import com.voltasit.obdeleven.domain.usecases.controlUnit.WriteWorkshopInfoUC;
import com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting.StartBasicSettingUC;
import com.voltasit.obdeleven.domain.usecases.controlUnit.connect.f;
import com.voltasit.obdeleven.domain.usecases.controlUnit.d;
import com.voltasit.obdeleven.domain.usecases.device.C2117b;
import com.voltasit.obdeleven.domain.usecases.device.C2119d;
import com.voltasit.obdeleven.domain.usecases.device.ForceDeviceUpdateUC;
import com.voltasit.obdeleven.domain.usecases.device.n;
import com.voltasit.obdeleven.domain.usecases.device.y;
import com.voltasit.obdeleven.domain.usecases.gateway.c;
import com.voltasit.obdeleven.domain.usecases.m;
import com.voltasit.obdeleven.domain.usecases.odx.GetBasicSettingRequestParamUC;
import com.voltasit.obdeleven.domain.usecases.odx.GetBasicSettingsUC;
import com.voltasit.obdeleven.domain.usecases.odx.e;
import com.voltasit.obdeleven.domain.usecases.sfd.TrackSfdWizardCompletionUC;
import com.voltasit.obdeleven.domain.usecases.user.C2120a;
import com.voltasit.obdeleven.domain.usecases.user.C2121b;
import com.voltasit.obdeleven.domain.usecases.user.C2122c;
import com.voltasit.obdeleven.domain.usecases.user.C2123d;
import com.voltasit.obdeleven.domain.usecases.user.C2124e;
import com.voltasit.obdeleven.domain.usecases.user.C2125f;
import com.voltasit.obdeleven.domain.usecases.user.C2126g;
import com.voltasit.obdeleven.domain.usecases.user.D;
import com.voltasit.obdeleven.domain.usecases.user.E;
import com.voltasit.obdeleven.domain.usecases.user.F;
import com.voltasit.obdeleven.domain.usecases.user.G;
import com.voltasit.obdeleven.domain.usecases.user.GetUserDetailsUC;
import com.voltasit.obdeleven.domain.usecases.user.SaveUserVehicleFromModificationUC;
import com.voltasit.obdeleven.domain.usecases.user.t;
import com.voltasit.obdeleven.domain.usecases.vehicle.j;
import com.voltasit.obdeleven.domain.usecases.vehicle.k;
import kotlin.jvm.internal.i;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import p293xa.r;

/* JADX INFO: compiled from: AppModuleFactories.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AppModuleFactoriesKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f29645a = C1787c0.p(new l<a, r>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1
        @Override // Ia.l
        public final r invoke(a aVar) {
            a module = aVar;
            i.e(module, "$this$module");
            b bVarA = Qb.b.a.a();
            Kind kind = Kind.f45761c;
            module.b(new org.koin.core.instance.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(bVarA, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.iap.b.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.iap.b>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.1
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.iap.b invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.iap.b((s) factory.a(null, null, kotlin.jvm.internal.l.a(s.class)), (o) factory.a(null, null, kotlin.jvm.internal.l.a(o.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.iap.a.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.iap.a>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.2
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.iap.a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.iap.a((PurchaseProvider) factory.a(null, null, kotlin.jvm.internal.l.a(PurchaseProvider.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(e.class), new p<org.koin.core.scope.a, Ob.a, e>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.3
                @Override // Ia.p
                public final e invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new e((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.agreement.a.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.agreement.a>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.4
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.agreement.a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.agreement.a((AgreementRepository) factory.a(null, null, kotlin.jvm.internal.l.a(AgreementRepository.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(WriteOcaCommandValueUC.class), new p<org.koin.core.scope.a, Ob.a, WriteOcaCommandValueUC>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.5
                @Override // Ia.p
                public final WriteOcaCommandValueUC invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new WriteOcaCommandValueUC((g) factory.a(null, null, kotlin.jvm.internal.l.a(g.class)), (q) factory.a(null, null, kotlin.jvm.internal.l.a(q.class)), (J8.a) factory.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(j.class), new p<org.koin.core.scope.a, Ob.a, j>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.6
                @Override // Ia.p
                public final j invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new j((x) factory.a(null, null, kotlin.jvm.internal.l.a(x.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.r.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.vehicle.r>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.7
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.vehicle.r invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.vehicle.r((x) factory.a(null, null, kotlin.jvm.internal.l.a(x.class)), (p084g8.b) factory.a(null, null, kotlin.jvm.internal.l.a(p084g8.b.class)), (o) factory.a(null, null, kotlin.jvm.internal.l.a(o.class)), (d) factory.a(null, null, kotlin.jvm.internal.l.a(d.class)), (K8.b) factory.a(null, null, kotlin.jvm.internal.l.a(K8.b.class)), (GetUserDetailsUC) factory.a(null, null, kotlin.jvm.internal.l.a(GetUserDetailsUC.class)), (ScanControlUnitUC) factory.a(null, null, kotlin.jvm.internal.l.a(ScanControlUnitUC.class)), (J8.a) factory.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(ScanControlUnitUC.class), new p<org.koin.core.scope.a, Ob.a, ScanControlUnitUC>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.8
                @Override // Ia.p
                public final ScanControlUnitUC invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new ScanControlUnitUC((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (f) factory.a(null, null, kotlin.jvm.internal.l.a(f.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(VehicleClearFaultsUseCase.class), new p<org.koin.core.scope.a, Ob.a, VehicleClearFaultsUseCase>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.9
                @Override // Ia.p
                public final VehicleClearFaultsUseCase invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new VehicleClearFaultsUseCase((x) factory.a(null, null, kotlin.jvm.internal.l.a(x.class)), (p084g8.b) factory.a(null, null, kotlin.jvm.internal.l.a(p084g8.b.class)), (v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)), (J8.a) factory.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(m.class), new p<org.koin.core.scope.a, Ob.a, m>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.10
                @Override // Ia.p
                public final m invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new m((x) factory.a(null, null, kotlin.jvm.internal.l.a(x.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(LoadVehicleIntoCacheUseCase.class), new p<org.koin.core.scope.a, Ob.a, LoadVehicleIntoCacheUseCase>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.11
                @Override // Ia.p
                public final LoadVehicleIntoCacheUseCase invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new LoadVehicleIntoCacheUseCase((o) factory.a(null, null, kotlin.jvm.internal.l.a(o.class)), (K8.b) factory.a(null, null, kotlin.jvm.internal.l.a(K8.b.class)));
                }
            }, kind, kotlin.collections.l.q())));
            module.b(new org.koin.core.instance.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(Qb.b.a.a(), kotlin.jvm.internal.l.a(A.class), new p<org.koin.core.scope.a, Ob.a, A>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.12
                @Override // Ia.p
                public final A invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new A((m) factory.a(null, null, kotlin.jvm.internal.l.a(m.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(GetSortedVehicleModelListUseCase.class), new p<org.koin.core.scope.a, Ob.a, GetSortedVehicleModelListUseCase>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.13
                @Override // Ia.p
                public final GetSortedVehicleModelListUseCase invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new GetSortedVehicleModelListUseCase((K8.x) factory.a(null, null, kotlin.jvm.internal.l.a(K8.x.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.b.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.vehicle.b>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.14
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.vehicle.b invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.vehicle.b((x) factory.a(null, null, kotlin.jvm.internal.l.a(x.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.a.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.vehicle.a>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.15
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.vehicle.a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.vehicle.a((x) factory.a(null, null, kotlin.jvm.internal.l.a(x.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.d.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.vehicle.d>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.16
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.vehicle.d invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.vehicle.d((x) factory.a(null, null, kotlin.jvm.internal.l.a(x.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.e.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.vehicle.e>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.17
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.vehicle.e invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.vehicle.e((x) factory.a(null, null, kotlin.jvm.internal.l.a(x.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.gateway.d.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.gateway.d>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.18
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.gateway.d invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.gateway.d((J8.j) factory.a(null, null, kotlin.jvm.internal.l.a(J8.j.class)), (c) factory.a(null, null, kotlin.jvm.internal.l.a(c.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.c.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.controlUnit.c>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.19
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.controlUnit.c invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.controlUnit.c((o) factory.a(null, null, kotlin.jvm.internal.l.a(o.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.b.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.controlUnit.b>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.20
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.controlUnit.b invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.controlUnit.b((K8.d) factory.a(null, null, kotlin.jvm.internal.l.a(K8.d.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(C.class), new p<org.koin.core.scope.a, Ob.a, C>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.21
                @Override // Ia.p
                public final C invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new C((x) factory.a(null, null, kotlin.jvm.internal.l.a(x.class)), (v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)), (p084g8.b) factory.a(null, null, kotlin.jvm.internal.l.a(p084g8.b.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.g.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.g>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.22
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.g invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.g((x) factory.a(null, null, kotlin.jvm.internal.l.a(x.class)), (v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)), (p084g8.b) factory.a(null, null, kotlin.jvm.internal.l.a(p084g8.b.class)));
                }
            }, kind, kotlin.collections.l.q())));
            module.b(new org.koin.core.instance.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(Qb.b.a.a(), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.l.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.vehicle.l>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.23
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.vehicle.l invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.vehicle.l((x) factory.a(null, null, kotlin.jvm.internal.l.a(x.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(k.class), new p<org.koin.core.scope.a, Ob.a, k>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.24
                @Override // Ia.p
                public final k invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new k();
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(C2122c.class), new p<org.koin.core.scope.a, Ob.a, C2122c>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.25
                @Override // Ia.p
                public final C2122c invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new C2122c((v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(d.class), new p<org.koin.core.scope.a, Ob.a, d>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.26
                @Override // Ia.p
                public final d invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new d((J8.e) factory.a(null, null, kotlin.jvm.internal.l.a(J8.e.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.e.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.controlUnit.e>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.27
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.controlUnit.e invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.controlUnit.e((J8.e) factory.a(null, null, kotlin.jvm.internal.l.a(J8.e.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.m.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.vehicle.m>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.28
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.vehicle.m invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.vehicle.m((x) factory.a(null, null, kotlin.jvm.internal.l.a(x.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(A8.e.class), new p<org.koin.core.scope.a, Ob.a, A8.e>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.29
                @Override // Ia.p
                public final A8.e invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new A8.e();
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(A8.g.class), new p<org.koin.core.scope.a, Ob.a, A8.g>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.30
                @Override // Ia.p
                public final A8.g invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new A8.g((A8.e) factory.a(null, null, kotlin.jvm.internal.l.a(A8.e.class)), (u) factory.a(null, null, kotlin.jvm.internal.l.a(u.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.odx.i.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.odx.i>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.31
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.odx.i invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.odx.i((K8.k) factory.a(null, null, kotlin.jvm.internal.l.a(K8.k.class)), (J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.odx.g.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.odx.g>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.32
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.odx.g invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.odx.g((com.voltasit.obdeleven.domain.usecases.odx.i) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.odx.i.class)), (com.voltasit.obdeleven.domain.usecases.odx.f) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.odx.f.class)), (K8.k) factory.a(null, null, kotlin.jvm.internal.l.a(K8.k.class)), (J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(UpdateControlUnitOdxVersionUC.class), new p<org.koin.core.scope.a, Ob.a, UpdateControlUnitOdxVersionUC>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.33
                @Override // Ia.p
                public final UpdateControlUnitOdxVersionUC invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new UpdateControlUnitOdxVersionUC((K8.k) factory.a(null, null, kotlin.jvm.internal.l.a(K8.k.class)), (J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind, kotlin.collections.l.q())));
            module.b(new org.koin.core.instance.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(Qb.b.a.a(), kotlin.jvm.internal.l.a(GetControlUnitOdxVersionUC.class), new p<org.koin.core.scope.a, Ob.a, GetControlUnitOdxVersionUC>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.34
                @Override // Ia.p
                public final GetControlUnitOdxVersionUC invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new GetControlUnitOdxVersionUC((K8.k) factory.a(null, null, kotlin.jvm.internal.l.a(K8.k.class)), (J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.odx.a.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.odx.a>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.35
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.odx.a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.odx.a((K8.k) factory.a(null, null, kotlin.jvm.internal.l.a(K8.k.class)), (J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(z.class), new p<org.koin.core.scope.a, Ob.a, z>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.36
                @Override // Ia.p
                public final z invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new z();
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.f.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.vehicle.f>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.37
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.vehicle.f invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.vehicle.f((w) factory.a(null, null, kotlin.jvm.internal.l.a(w.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.f.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.f>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.38
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.f invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.f((v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)), (o) factory.a(null, null, kotlin.jvm.internal.l.a(o.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.notifications.c.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.notifications.c>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.39
                @Override // Ia.p
                public final com.voltasit.obdeleven.notifications.c invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.notifications.c();
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(SaveUserVehicleFromModificationUC.class), new p<org.koin.core.scope.a, Ob.a, SaveUserVehicleFromModificationUC>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.40
                @Override // Ia.p
                public final SaveUserVehicleFromModificationUC invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new SaveUserVehicleFromModificationUC((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(ForceDeviceUpdateUC.class), new p<org.koin.core.scope.a, Ob.a, ForceDeviceUpdateUC>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.41
                @Override // Ia.p
                public final ForceDeviceUpdateUC invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new ForceDeviceUpdateUC((g) factory.a(null, null, kotlin.jvm.internal.l.a(g.class)), (y) factory.a(null, null, kotlin.jvm.internal.l.a(y.class)), (J8.a) factory.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)), (n) factory.a(null, null, kotlin.jvm.internal.l.a(n.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(y.class), new p<org.koin.core.scope.a, Ob.a, y>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.42
                @Override // Ia.p
                public final y invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new y((h) factory.a(null, null, kotlin.jvm.internal.l.a(h.class)), (com.voltasit.obdeleven.domain.usecases.device.f) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.f.class)), (com.voltasit.obdeleven.domain.usecases.device.z) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.z.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.z.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.device.z>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.43
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.device.z invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.device.z((h) factory.a(null, null, kotlin.jvm.internal.l.a(h.class)), (J8.a) factory.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)), (n) factory.a(null, null, kotlin.jvm.internal.l.a(n.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.odx.f.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.odx.f>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.44
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.odx.f invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.odx.f((K8.k) factory.a(null, null, kotlin.jvm.internal.l.a(K8.k.class)), (J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind, kotlin.collections.l.q())));
            module.b(new org.koin.core.instance.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(Qb.b.a.a(), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.oca.d.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.oca.d>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.45
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.oca.d invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.oca.d((K8.j) factory.a(null, null, kotlin.jvm.internal.l.a(K8.j.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.oca.e.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.oca.e>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.46
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.oca.e invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.oca.e((K8.b) factory.a(null, null, kotlin.jvm.internal.l.a(K8.b.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.oca.b.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.oca.b>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.47
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.oca.b invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.oca.b((K8.j) factory.a(null, null, kotlin.jvm.internal.l.a(K8.j.class)), (x) factory.a(null, null, kotlin.jvm.internal.l.a(x.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.oca.g.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.oca.g>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.48
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.oca.g invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.oca.g((K8.j) factory.a(null, null, kotlin.jvm.internal.l.a(K8.j.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(A8.l.class), new p<org.koin.core.scope.a, Ob.a, A8.l>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.49
                @Override // Ia.p
                public final A8.l invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new A8.l();
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(A8.k.class), new p<org.koin.core.scope.a, Ob.a, A8.k>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.50
                @Override // Ia.p
                public final A8.k invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new A8.k();
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(A8.n.class), new p<org.koin.core.scope.a, Ob.a, A8.n>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.51
                @Override // Ia.p
                public final A8.n invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new A8.n();
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.oca.k.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.oca.k>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.52
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.oca.k invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.oca.k((K8.j) factory.a(null, null, kotlin.jvm.internal.l.a(K8.j.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.oca.j.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.oca.j>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.53
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.oca.j invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.oca.j((K8.j) factory.a(null, null, kotlin.jvm.internal.l.a(K8.j.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.z.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.user.z>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.54
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.user.z invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.user.z((v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)), (o) factory.a(null, null, kotlin.jvm.internal.l.a(o.class)), (com.voltasit.obdeleven.domain.usecases.user.x) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.x.class)), (J8.v) factory.a(null, null, kotlin.jvm.internal.l.a(J8.v.class)), (K8.b) factory.a(null, null, kotlin.jvm.internal.l.a(K8.b.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.l.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.user.l>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.55
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.user.l invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.user.l((v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)));
                }
            }, kind, kotlin.collections.l.q())));
            module.b(new org.koin.core.instance.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(Qb.b.a.a(), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.n.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.n>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.56
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.n invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.n((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (com.voltasit.obdeleven.domain.usecases.e) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.e.class)), (com.voltasit.obdeleven.domain.usecases.d) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.d.class)), (F8.c) factory.a(null, null, kotlin.jvm.internal.l.a(F8.c.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.i.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.user.i>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.57
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.user.i invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.user.i((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)), (K8.m) factory.a(null, null, kotlin.jvm.internal.l.a(K8.m.class)), (com.voltasit.obdeleven.network.b) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.network.b.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.u.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.user.u>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.58
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.user.u invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.user.u((o) factory.a(null, null, kotlin.jvm.internal.l.a(o.class)), (K8.b) factory.a(null, null, kotlin.jvm.internal.l.a(K8.b.class)), (com.voltasit.obdeleven.domain.usecases.user.z) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.z.class)), (com.voltasit.sharednetwork.dataSources.a) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.sharednetwork.dataSources.a.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.e.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.e>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.59
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.e invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.e((J8.d) factory.a(null, null, kotlin.jvm.internal.l.a(J8.d.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.d.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.d>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.60
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.d invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.d();
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.o.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.vehicle.o>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.61
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.vehicle.o invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.vehicle.o((v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)), (K8.x) factory.a(null, null, kotlin.jvm.internal.l.a(K8.x.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(GetBasicSettingsUC.class), new p<org.koin.core.scope.a, Ob.a, GetBasicSettingsUC>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.62
                @Override // Ia.p
                public final GetBasicSettingsUC invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new GetBasicSettingsUC((A8.b) factory.a(null, null, kotlin.jvm.internal.l.a(A8.b.class)), (com.voltasit.obdeleven.domain.usecases.odx.j) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.odx.j.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(A8.b.class), new p<org.koin.core.scope.a, Ob.a, A8.b>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.63
                @Override // Ia.p
                public final A8.b invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new A8.b();
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.odx.d.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.odx.d>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.64
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.odx.d invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.odx.d((com.voltasit.obdeleven.domain.usecases.f) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.f.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(GetBasicSettingRequestParamUC.class), new p<org.koin.core.scope.a, Ob.a, GetBasicSettingRequestParamUC>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.65
                @Override // Ia.p
                public final GetBasicSettingRequestParamUC invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new GetBasicSettingRequestParamUC();
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(SaveBasicSettingHistoryUC.class), new p<org.koin.core.scope.a, Ob.a, SaveBasicSettingHistoryUC>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.66
                @Override // Ia.p
                public final SaveBasicSettingHistoryUC invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new SaveBasicSettingHistoryUC((v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)), (p084g8.b) factory.a(null, null, kotlin.jvm.internal.l.a(p084g8.b.class)), (J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind, kotlin.collections.l.q())));
            module.b(new org.koin.core.instance.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(Qb.b.a.a(), kotlin.jvm.internal.l.a(StartBasicSettingUC.class), new p<org.koin.core.scope.a, Ob.a, StartBasicSettingUC>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.67
                @Override // Ia.p
                public final StartBasicSettingUC invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new StartBasicSettingUC((J8.a) factory.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)), (J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (BasicSettingStatusTimer) factory.a(null, null, kotlin.jvm.internal.l.a(BasicSettingStatusTimer.class)), (p084g8.b) factory.a(null, null, kotlin.jvm.internal.l.a(p084g8.b.class)), (SaveBasicSettingHistoryUC) factory.a(null, null, kotlin.jvm.internal.l.a(SaveBasicSettingHistoryUC.class)), (WriteWorkshopInfoUC) factory.a(null, null, kotlin.jvm.internal.l.a(WriteWorkshopInfoUC.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting.a.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting.a>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.68
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting.a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting.a((J8.a) factory.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)), (J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (BasicSettingStatusTimer) factory.a(null, null, kotlin.jvm.internal.l.a(BasicSettingStatusTimer.class)), (SaveBasicSettingHistoryUC) factory.a(null, null, kotlin.jvm.internal.l.a(SaveBasicSettingHistoryUC.class)), (com.obdeleven.service.odx.f) factory.a(null, null, kotlin.jvm.internal.l.a(com.obdeleven.service.odx.f.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.k.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.user.k>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.69
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.user.k invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.user.k((v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(C2125f.class), new p<org.koin.core.scope.a, Ob.a, C2125f>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.70
                @Override // Ia.p
                public final C2125f invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new C2125f((v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(F.class), new p<org.koin.core.scope.a, Ob.a, F>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.71
                @Override // Ia.p
                public final F invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new F((v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.h.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.h>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.72
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.h invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.h();
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(E.class), new p<org.koin.core.scope.a, Ob.a, E>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.73
                @Override // Ia.p
                public final E invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new E();
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.s.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.user.s>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.74
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.user.s invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.user.s((v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)), (J8.a) factory.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.r.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.user.r>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.75
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.user.r invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.user.r((com.voltasit.obdeleven.domain.usecases.user.s) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.s.class)), (t) factory.a(null, null, kotlin.jvm.internal.l.a(t.class)), (com.voltasit.obdeleven.domain.usecases.n) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.n.class)), (com.voltasit.obdeleven.domain.usecases.user.i) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.i.class)), (com.voltasit.obdeleven.domain.usecases.vehicle.o) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.o.class)), (B) factory.a(null, null, kotlin.jvm.internal.l.a(B.class)), (v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)), (com.voltasit.sharednetwork.dataSources.a) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.sharednetwork.dataSources.a.class)), (D) factory.a(null, null, kotlin.jvm.internal.l.a(D.class)), (com.voltasit.obdeleven.domain.usecases.user.x) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.x.class)), (J8.a) factory.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(C2124e.class), new p<org.koin.core.scope.a, Ob.a, C2124e>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.76
                @Override // Ia.p
                public final C2124e invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new C2124e((v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(C2126g.class), new p<org.koin.core.scope.a, Ob.a, C2126g>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.77
                @Override // Ia.p
                public final C2126g invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new C2126g((v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)));
                }
            }, kind, kotlin.collections.l.q())));
            module.b(new org.koin.core.instance.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(Qb.b.a.a(), kotlin.jvm.internal.l.a(C2123d.class), new p<org.koin.core.scope.a, Ob.a, C2123d>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.78
                @Override // Ia.p
                public final C2123d invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new C2123d((v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(t.class), new p<org.koin.core.scope.a, Ob.a, t>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.79
                @Override // Ia.p
                public final t invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    v vVar = (v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class));
                    return new t((J8.a) factory.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)), (J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), vVar);
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.q.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.user.q>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.80
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.user.q invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.user.q((v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.A.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.user.A>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.81
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.user.A invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.user.A((v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.v.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.v>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.82
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.v invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.v((K8.g) factory.a(null, null, kotlin.jvm.internal.l.a(K8.g.class)), (K8.q) factory.a(null, null, kotlin.jvm.internal.l.a(K8.q.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.s.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.s>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.83
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.s invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.s();
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(B.class), new p<org.koin.core.scope.a, Ob.a, B>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.84
                @Override // Ia.p
                public final B invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new B((J8.a) factory.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)), (J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(C2121b.class), new p<org.koin.core.scope.a, Ob.a, C2121b>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.85
                @Override // Ia.p
                public final C2121b invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new C2121b((v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)), (com.voltasit.obdeleven.network.b) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.network.b.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.odx.j.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.odx.j>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.86
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.odx.j invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.odx.j((s) factory.a(null, null, kotlin.jvm.internal.l.a(s.class)), (v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(D.class), new p<org.koin.core.scope.a, Ob.a, D>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.87
                @Override // Ia.p
                public final D invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new D((v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.w.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.user.w>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.88
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.user.w invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.user.w((v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)));
                }
            }, kind, kotlin.collections.l.q())));
            module.b(new org.koin.core.instance.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(Qb.b.a.a(), kotlin.jvm.internal.l.a(GetUserDetailsUC.class), new p<org.koin.core.scope.a, Ob.a, GetUserDetailsUC>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.89
                @Override // Ia.p
                public final GetUserDetailsUC invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new GetUserDetailsUC((v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)), (o) factory.a(null, null, kotlin.jvm.internal.l.a(o.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.v.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.user.v>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.90
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.user.v invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.user.v((K8.b) factory.a(null, null, kotlin.jvm.internal.l.a(K8.b.class)), (v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)), (J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(A8.j.class), new p<org.koin.core.scope.a, Ob.a, A8.j>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.91
                @Override // Ia.p
                public final A8.j invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new A8.j();
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.bonus.a.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.bonus.a>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.92
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.bonus.a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.bonus.a((K8.f) factory.a(null, null, kotlin.jvm.internal.l.a(K8.f.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.j.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.j>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.93
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.j invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.j((J8.f) factory.a(null, null, kotlin.jvm.internal.l.a(J8.f.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(C2120a.class), new p<org.koin.core.scope.a, Ob.a, C2120a>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.94
                @Override // Ia.p
                public final C2120a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new C2120a((GetUserDetailsUC) factory.a(null, null, kotlin.jvm.internal.l.a(GetUserDetailsUC.class)), (com.voltasit.obdeleven.domain.usecases.j) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.j.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.C.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.user.C>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.95
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.user.C invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.user.C((v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)), (K8.e) factory.a(null, null, kotlin.jvm.internal.l.a(K8.e.class)), (J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.adaptation.a.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.controlUnit.adaptation.a>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.96
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.controlUnit.adaptation.a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.controlUnit.adaptation.a((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.y.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.user.y>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.97
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.user.y invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.user.y((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(C2119d.class), new p<org.koin.core.scope.a, Ob.a, C2119d>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.98
                @Override // Ia.p
                public final C2119d invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new C2119d((K8.f) factory.a(null, null, kotlin.jvm.internal.l.a(K8.f.class)), (g) factory.a(null, null, kotlin.jvm.internal.l.a(g.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.D.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.device.D>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.99
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.device.D invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.device.D((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (K8.f) factory.a(null, null, kotlin.jvm.internal.l.a(K8.f.class)), (g) factory.a(null, null, kotlin.jvm.internal.l.a(g.class)));
                }
            }, kind, kotlin.collections.l.q())));
            module.b(new org.koin.core.instance.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(Qb.b.a.a(), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.e.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.device.e>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.100
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.device.e invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.device.e((K8.f) factory.a(null, null, kotlin.jvm.internal.l.a(K8.f.class)), (g) factory.a(null, null, kotlin.jvm.internal.l.a(g.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.odx.b.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.odx.b>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.101
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.odx.b invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.odx.b((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (J8.i) factory.a(null, null, kotlin.jvm.internal.l.a(J8.i.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.bonus.b.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.bonus.b>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.102
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.bonus.b invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.bonus.b((K8.f) factory.a(null, null, kotlin.jvm.internal.l.a(K8.f.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.a.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.controlUnit.a>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.103
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.controlUnit.a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.controlUnit.a((K8.d) factory.a(null, null, kotlin.jvm.internal.l.a(K8.d.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(A8.c.class), new p<org.koin.core.scope.a, Ob.a, A8.c>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.104
                @Override // Ia.p
                public final A8.c invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new A8.c();
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(u.class), new p<org.koin.core.scope.a, Ob.a, u>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.105
                @Override // Ia.p
                public final u invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new u();
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(A8.h.class), new p<org.koin.core.scope.a, Ob.a, A8.h>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.106
                @Override // Ia.p
                public final A8.h invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new A8.h();
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(A8.d.class), new p<org.koin.core.scope.a, Ob.a, A8.d>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.107
                @Override // Ia.p
                public final A8.d invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new A8.d();
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(A8.v.class), new p<org.koin.core.scope.a, Ob.a, A8.v>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.108
                @Override // Ia.p
                public final A8.v invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new A8.v();
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(A8.r.class), new p<org.koin.core.scope.a, Ob.a, A8.r>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.109
                @Override // Ia.p
                public final A8.r invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new A8.r();
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(A8.q.class), new p<org.koin.core.scope.a, Ob.a, A8.q>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.110
                @Override // Ia.p
                public final A8.q invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new A8.q();
                }
            }, kind, kotlin.collections.l.q())));
            module.b(new org.koin.core.instance.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(Qb.b.a.a(), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.C.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.device.C>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.111
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.device.C invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.device.C((K8.f) factory.a(null, null, kotlin.jvm.internal.l.a(K8.f.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.permissions.c.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.permissions.c>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.112
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.permissions.c invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.permissions.c();
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.permissions.b.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.permissions.b>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.113
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.permissions.b invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.permissions.b((J8.d) factory.a(null, null, kotlin.jvm.internal.l.a(J8.d.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.permissions.a.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.permissions.a>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.114
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.permissions.a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.permissions.a();
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(F8.d.class), new p<org.koin.core.scope.a, Ob.a, F8.d>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.115
                @Override // Ia.p
                public final F8.d invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new F8.d();
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.B.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.user.B>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.116
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.user.B invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.user.B((v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)), (F8.d) factory.a(null, null, kotlin.jvm.internal.l.a(F8.d.class)), (o) factory.a(null, null, kotlin.jvm.internal.l.a(o.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.h.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.user.h>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.117
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.user.h invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.user.h((v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(F8.e.class), new p<org.koin.core.scope.a, Ob.a, F8.e>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.118
                @Override // Ia.p
                public final F8.e invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new F8.e((J8.f) factory.a(null, null, kotlin.jvm.internal.l.a(J8.f.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.o.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.user.o>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.119
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.user.o invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.user.o();
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.o.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.o>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.120
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.o invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.o((K8.n) factory.a(null, null, kotlin.jvm.internal.l.a(K8.n.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(TrackSfdWizardCompletionUC.class), new p<org.koin.core.scope.a, Ob.a, TrackSfdWizardCompletionUC>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.121
                @Override // Ia.p
                public final TrackSfdWizardCompletionUC invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new TrackSfdWizardCompletionUC((J8.a) factory.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)), (x) factory.a(null, null, kotlin.jvm.internal.l.a(x.class)));
                }
            }, kind, kotlin.collections.l.q())));
            module.b(new org.koin.core.instance.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(Qb.b.a.a(), kotlin.jvm.internal.l.a(G.class), new p<org.koin.core.scope.a, Ob.a, G>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.122
                @Override // Ia.p
                public final G invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new G((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.gateway.a.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.gateway.a>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.123
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.gateway.a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.gateway.a((J8.j) factory.a(null, null, kotlin.jvm.internal.l.a(J8.j.class)), (c) factory.a(null, null, kotlin.jvm.internal.l.a(c.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.x.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.user.x>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.124
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.user.x invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.user.x((v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)), (J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (J8.v) factory.a(null, null, kotlin.jvm.internal.l.a(J8.v.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.g.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.device.g>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.125
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.device.g invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.device.g((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (o) factory.a(null, null, kotlin.jvm.internal.l.a(o.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.k.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.k>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.126
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.k invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.k((J8.w) factory.a(null, null, kotlin.jvm.internal.l.a(J8.w.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.l.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.l>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.127
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.l invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.l((com.voltasit.obdeleven.domain.usecases.k) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.k.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(L8.a.class), new p<org.koin.core.scope.a, Ob.a, L8.a>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.128
                @Override // Ia.p
                public final L8.a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new L8.a((o) factory.a(null, null, kotlin.jvm.internal.l.a(o.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.m.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.user.m>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.129
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.user.m invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.user.m((v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(A8.x.class), new p<org.koin.core.scope.a, Ob.a, A8.x>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.130
                @Override // Ia.p
                public final A8.x invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new A8.x();
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.n.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.vehicle.n>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.131
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.vehicle.n invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.vehicle.n((K8.x) factory.a(null, null, kotlin.jvm.internal.l.a(K8.x.class)), (w) factory.a(null, null, kotlin.jvm.internal.l.a(w.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(c.class), new p<org.koin.core.scope.a, Ob.a, c>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.132
                @Override // Ia.p
                public final c invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new c((x) factory.a(null, null, kotlin.jvm.internal.l.a(x.class)), (p084g8.b) factory.a(null, null, kotlin.jvm.internal.l.a(p084g8.b.class)), (J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind, kotlin.collections.l.q())));
            module.b(new org.koin.core.instance.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(Qb.b.a.a(), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.h.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.vehicle.h>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.133
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.vehicle.h invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.vehicle.h((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (x) factory.a(null, null, kotlin.jvm.internal.l.a(x.class)), (K8.c) factory.a(null, null, kotlin.jvm.internal.l.a(K8.c.class)), (K8.d) factory.a(null, null, kotlin.jvm.internal.l.a(K8.d.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.g.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.vehicle.g>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.134
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.vehicle.g invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.vehicle.g((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (x) factory.a(null, null, kotlin.jvm.internal.l.a(x.class)), (K8.c) factory.a(null, null, kotlin.jvm.internal.l.a(K8.c.class)), (K8.d) factory.a(null, null, kotlin.jvm.internal.l.a(K8.d.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.i.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.vehicle.i>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.135
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.vehicle.i invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.vehicle.i((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (x) factory.a(null, null, kotlin.jvm.internal.l.a(x.class)), (K8.c) factory.a(null, null, kotlin.jvm.internal.l.a(K8.c.class)), (K8.d) factory.a(null, null, kotlin.jvm.internal.l.a(K8.d.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.i.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.i>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.136
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.i invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.i((J8.n) factory.a(null, null, kotlin.jvm.internal.l.a(J8.n.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.p.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.p>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.137
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.p invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.p((J8.f) factory.a(null, null, kotlin.jvm.internal.l.a(J8.f.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.r.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.r>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.138
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.r invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.r((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (GetUserDetailsUC) factory.a(null, null, kotlin.jvm.internal.l.a(GetUserDetailsUC.class)), (o) factory.a(null, null, kotlin.jvm.internal.l.a(o.class)), (K8.b) factory.a(null, null, kotlin.jvm.internal.l.a(K8.b.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.w.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.w>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.139
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.w invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.w((K8.b) factory.a(null, null, kotlin.jvm.internal.l.a(K8.b.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.iap.d.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.iap.d>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.140
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.iap.d invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.iap.d((K8.p) factory.a(null, null, kotlin.jvm.internal.l.a(K8.p.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(A8.t.class), new p<org.koin.core.scope.a, Ob.a, A8.t>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.141
                @Override // Ia.p
                public final A8.t invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new A8.t((F8.b) factory.a(null, null, kotlin.jvm.internal.l.a(F8.b.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.iap.c.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.iap.c>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.142
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.iap.c invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.iap.c((s) factory.a(null, null, kotlin.jvm.internal.l.a(s.class)), (o) factory.a(null, null, kotlin.jvm.internal.l.a(o.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(C2113b.class), new p<org.koin.core.scope.a, Ob.a, C2113b>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.143
                @Override // Ia.p
                public final C2113b invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new C2113b((PurchaseProvider) factory.a(null, null, kotlin.jvm.internal.l.a(PurchaseProvider.class)), (v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)), (com.voltasit.obdeleven.domain.usecases.u) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.u.class)));
                }
            }, kind, kotlin.collections.l.q())));
            module.b(new org.koin.core.instance.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(Qb.b.a.a(), kotlin.jvm.internal.l.a(F8.b.class), new p<org.koin.core.scope.a, Ob.a, F8.b>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.144
                @Override // Ia.p
                public final F8.b invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new F8.b();
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(C2117b.class), new p<org.koin.core.scope.a, Ob.a, C2117b>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.145
                @Override // Ia.p
                public final C2117b invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new C2117b((K8.f) factory.a(null, null, kotlin.jvm.internal.l.a(K8.f.class)), (g) factory.a(null, null, kotlin.jvm.internal.l.a(g.class)), (v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)), (J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.m.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.device.m>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.146
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.device.m invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.device.m((h) factory.a(null, null, kotlin.jvm.internal.l.a(h.class)), (J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (com.voltasit.obdeleven.domain.usecases.device.f) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.f.class)), (com.voltasit.obdeleven.domain.usecases.device.l) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.l.class)), (J8.u) factory.a(null, null, kotlin.jvm.internal.l.a(J8.u.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.l.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.device.l>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.147
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.device.l invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.device.l((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (o) factory.a(null, null, kotlin.jvm.internal.l.a(o.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.x.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.device.x>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.148
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.device.x invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.device.x((o) factory.a(null, null, kotlin.jvm.internal.l.a(o.class)), (K8.u) factory.a(null, null, kotlin.jvm.internal.l.a(K8.u.class)), (J8.a) factory.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.t.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.t>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.149
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.t invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.t((o) factory.a(null, null, kotlin.jvm.internal.l.a(o.class)), (J8.k) factory.a(null, null, kotlin.jvm.internal.l.a(J8.k.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.u.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.u>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.150
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.u invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.u((o) factory.a(null, null, kotlin.jvm.internal.l.a(o.class)), (J8.k) factory.a(null, null, kotlin.jvm.internal.l.a(J8.k.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.f.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.device.f>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.151
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.device.f invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.device.f((J8.u) factory.a(null, null, kotlin.jvm.internal.l.a(J8.u.class)), (g) factory.a(null, null, kotlin.jvm.internal.l.a(g.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.p.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.user.p>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.152
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.user.p invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.user.p((v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(C2114c.class), new p<org.koin.core.scope.a, Ob.a, C2114c>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.153
                @Override // Ia.p
                public final C2114c invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new C2114c((J8.u) factory.a(null, null, kotlin.jvm.internal.l.a(J8.u.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.j.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.user.j>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.154
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.user.j invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.user.j((F8.c) factory.a(null, null, kotlin.jvm.internal.l.a(F8.c.class)), (com.voltasit.obdeleven.domain.usecases.user.u) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.u.class)));
                }
            }, kind, kotlin.collections.l.q())));
            module.b(new org.koin.core.instance.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(com.google.gson.internal.b.a(new BeanDefinition(Qb.b.a.a(), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.c.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.vehicle.c>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.155
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.vehicle.c invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.vehicle.c((J8.u) factory.a(null, null, kotlin.jvm.internal.l.a(J8.u.class)), (v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)), (g) factory.a(null, null, kotlin.jvm.internal.l.a(g.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.s.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.vehicle.s>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.156
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.vehicle.s invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.vehicle.s((J8.u) factory.a(null, null, kotlin.jvm.internal.l.a(J8.u.class)), (v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(n.class), new p<org.koin.core.scope.a, Ob.a, n>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.157
                @Override // Ia.p
                public final n invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new n((v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)), (g) factory.a(null, null, kotlin.jvm.internal.l.a(g.class)), (J8.a) factory.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(WriteWorkshopInfoUC.class), new p<org.koin.core.scope.a, Ob.a, WriteWorkshopInfoUC>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.158
                @Override // Ia.p
                public final WriteWorkshopInfoUC invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new WriteWorkshopInfoUC((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (J8.f) factory.a(null, null, kotlin.jvm.internal.l.a(J8.f.class)));
                }
            }, kind, kotlin.collections.l.q()), module), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.y.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.y>() { // from class: com.voltasit.obdeleven.common.AppModuleFactoriesKt$appModuleFactories$1.159
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.y invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.y((o) factory.a(null, null, kotlin.jvm.internal.l.a(o.class)));
                }
            }, kind, kotlin.collections.l.q())));
            return r.f47939a;
        }
    });
}
