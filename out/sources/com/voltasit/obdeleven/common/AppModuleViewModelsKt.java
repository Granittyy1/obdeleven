package com.voltasit.obdeleven.common;

import Ia.l;
import Ia.p;
import J8.x;
import K8.o;
import K8.v;
import K8.y;
import Nb.a;
import Pb.b;
import androidx.lifecycle.K;
import com.google.android.gms.internal.measurement.C1787c0;
import com.voltasit.obdeleven.domain.models.Feature;
import com.voltasit.obdeleven.domain.providers.PurchaseProvider;
import com.voltasit.obdeleven.domain.repositories.AgreementRepository;
import com.voltasit.obdeleven.domain.usecases.B;
import com.voltasit.obdeleven.domain.usecases.C;
import com.voltasit.obdeleven.domain.usecases.C2113b;
import com.voltasit.obdeleven.domain.usecases.C2114c;
import com.voltasit.obdeleven.domain.usecases.GetSortedVehicleModelListUseCase;
import com.voltasit.obdeleven.domain.usecases.LoadVehicleIntoCacheUseCase;
import com.voltasit.obdeleven.domain.usecases.VehicleClearFaultsUseCase;
import com.voltasit.obdeleven.domain.usecases.controlUnit.GetControlUnitOdxVersionUC;
import com.voltasit.obdeleven.domain.usecases.controlUnit.UpdateControlUnitOdxVersionUC;
import com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting.StartBasicSettingUC;
import com.voltasit.obdeleven.domain.usecases.device.C2116a;
import com.voltasit.obdeleven.domain.usecases.device.C2117b;
import com.voltasit.obdeleven.domain.usecases.device.C2118c;
import com.voltasit.obdeleven.domain.usecases.device.C2119d;
import com.voltasit.obdeleven.domain.usecases.device.ForceDeviceUpdateUC;
import com.voltasit.obdeleven.domain.usecases.g;
import com.voltasit.obdeleven.domain.usecases.oca.d;
import com.voltasit.obdeleven.domain.usecases.oca.e;
import com.voltasit.obdeleven.domain.usecases.oca.f;
import com.voltasit.obdeleven.domain.usecases.oca.j;
import com.voltasit.obdeleven.domain.usecases.odx.GetBasicSettingRequestParamUC;
import com.voltasit.obdeleven.domain.usecases.odx.GetBasicSettingsUC;
import com.voltasit.obdeleven.domain.usecases.t;
import com.voltasit.obdeleven.domain.usecases.user.A;
import com.voltasit.obdeleven.domain.usecases.user.C2120a;
import com.voltasit.obdeleven.domain.usecases.user.C2121b;
import com.voltasit.obdeleven.domain.usecases.user.C2123d;
import com.voltasit.obdeleven.domain.usecases.user.C2124e;
import com.voltasit.obdeleven.domain.usecases.user.C2125f;
import com.voltasit.obdeleven.domain.usecases.user.D;
import com.voltasit.obdeleven.domain.usecases.user.E;
import com.voltasit.obdeleven.domain.usecases.user.G;
import com.voltasit.obdeleven.domain.usecases.user.GetUserDetailsUC;
import com.voltasit.obdeleven.domain.usecases.user.SaveUserVehicleFromModificationUC;
import com.voltasit.obdeleven.domain.usecases.user.h;
import com.voltasit.obdeleven.domain.usecases.user.k;
import com.voltasit.obdeleven.domain.usecases.user.n;
import com.voltasit.obdeleven.domain.usecases.user.q;
import com.voltasit.obdeleven.domain.usecases.user.u;
import com.voltasit.obdeleven.domain.usecases.user.w;
import com.voltasit.obdeleven.domain.usecases.user.z;
import com.voltasit.obdeleven.domain.usecases.vehicle.m;
import com.voltasit.obdeleven.domain.usecases.vehicle.s;
import com.voltasit.obdeleven.presentation.SfdViewModel;
import com.voltasit.obdeleven.presentation.appList.AppListViewModel;
import com.voltasit.obdeleven.presentation.controlUnit.ControlUnitViewModel;
import com.voltasit.obdeleven.presentation.controlUnit.F;
import com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListViewModel;
import com.voltasit.obdeleven.presentation.deviceupdate.DeviceUpdateViewModel;
import com.voltasit.obdeleven.presentation.dialogs.bonus.BonusDialogViewModel;
import com.voltasit.obdeleven.presentation.garage.GarageViewModel;
import com.voltasit.obdeleven.presentation.main.MainViewModel;
import com.voltasit.obdeleven.presentation.pro.ProViewModel;
import com.voltasit.obdeleven.presentation.profile.ProfileViewModel;
import com.voltasit.obdeleven.presentation.screens.emailVerification.EmailVerificationViewModel;
import com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoViewModel;
import com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoWizardViewModel;
import com.voltasit.obdeleven.presentation.screens.sfd.CreatePersonalInfoViewModel;
import com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardViewModel;
import com.voltasit.obdeleven.presentation.screens.sfd.countrySelectionDialog.CountrySelectionViewModel;
import com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.NumberConfirmationViewModel;
import com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.edit.EditPhoneNumberViewModel;
import com.voltasit.obdeleven.presentation.settings.SettingsViewModel;
import com.voltasit.obdeleven.presentation.startup.StartupActivityViewModel;
import com.voltasit.obdeleven.presentation.twofactorauth.backupCode.DisableTwoFactorBackupCodeViewModel;
import com.voltasit.obdeleven.presentation.twofactorauth.setup.TwoFactorAuthSetupViewModel;
import com.voltasit.obdeleven.presentation.vehicle.VehicleViewModel;
import com.voltasit.obdeleven.presentation.vehicleInfo.VehicleInfoViewModel;
import com.voltasit.obdeleven.ui.activity.MainActivityViewModel;
import com.voltasit.obdeleven.ui.dialogs.deviceSelectionSheet.DeviceSelectionViewModel;
import com.voltasit.obdeleven.utils.NavigationManager;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.c;
import kotlin.jvm.internal.i;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import p293xa.r;

/* JADX INFO: compiled from: AppModuleViewModels.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AppModuleViewModelsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f29871a = C1787c0.p(new l<a, r>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1
        @Override // Ia.l
        public final r invoke(a aVar) {
            a module = aVar;
            i.e(module, "$this$module");
            Kind kind = Kind.f45761c;
            EmptyList emptyList = EmptyList.f42983b;
            c cVarA = kotlin.jvm.internal.l.a(SfdWizardViewModel.class);
            AnonymousClass1 anonymousClass1 = new p<org.koin.core.scope.a, Ob.a, SfdWizardViewModel>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.1
                @Override // Ia.p
                public final SfdWizardViewModel invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a aVar4 = aVar2;
                    Ob.a aVar5 = aVar3;
                    return new SfdWizardViewModel((NavigationManager) aVar5.a(0, C4.a.j(aVar4, "$this$viewModel", aVar5, "<name for destructuring parameter 0>", NavigationManager.class)), (v) aVar4.a(null, null, kotlin.jvm.internal.l.a(v.class)), (k) aVar4.a(null, null, kotlin.jvm.internal.l.a(k.class)), (h) aVar4.a(null, null, kotlin.jvm.internal.l.a(h.class)), (K8.i) aVar4.a(null, null, kotlin.jvm.internal.l.a(K8.i.class)), (J8.p) aVar4.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (n) aVar4.a(null, null, kotlin.jvm.internal.l.a(n.class)));
                }
            };
            b bVar = Qb.b.f5141c;
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, cVarA, anonymousClass1, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(EditPhoneNumberViewModel.class), new p<org.koin.core.scope.a, Ob.a, EditPhoneNumberViewModel>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.2
                @Override // Ia.p
                public final EditPhoneNumberViewModel invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new EditPhoneNumberViewModel((h) viewModel.a(null, null, kotlin.jvm.internal.l.a(h.class)), (v) viewModel.a(null, null, kotlin.jvm.internal.l.a(v.class)), (K8.i) viewModel.a(null, null, kotlin.jvm.internal.l.a(K8.i.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(AppListViewModel.class), new p<org.koin.core.scope.a, Ob.a, AppListViewModel>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.3
                @Override // Ia.p
                public final AppListViewModel invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new AppListViewModel((v) viewModel.a(null, null, kotlin.jvm.internal.l.a(v.class)), (x) viewModel.a(null, null, kotlin.jvm.internal.l.a(x.class)), (C) viewModel.a(null, null, kotlin.jvm.internal.l.a(C.class)), (g) viewModel.a(null, null, kotlin.jvm.internal.l.a(g.class)), (AgreementRepository) viewModel.a(null, null, kotlin.jvm.internal.l.a(AgreementRepository.class)), (J8.p) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (com.voltasit.obdeleven.domain.usecases.agreement.a) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.agreement.a.class)), (d) viewModel.a(null, null, kotlin.jvm.internal.l.a(d.class)), (K8.b) viewModel.a(null, null, kotlin.jvm.internal.l.a(K8.b.class)), (J8.d) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.d.class)), (GetUserDetailsUC) viewModel.a(null, null, kotlin.jvm.internal.l.a(GetUserDetailsUC.class)), (K8.a) viewModel.a(null, null, kotlin.jvm.internal.l.a(K8.a.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.signIn.b.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.signIn.b>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.4
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.signIn.b invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.presentation.signIn.b((z) viewModel.a(null, null, kotlin.jvm.internal.l.a(z.class)), (com.voltasit.obdeleven.domain.usecases.user.r) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.r.class)), (J8.d) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.d.class)), (J8.p) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(VehicleInfoViewModel.class), new p<org.koin.core.scope.a, Ob.a, VehicleInfoViewModel>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.5
                @Override // Ia.p
                public final VehicleInfoViewModel invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new VehicleInfoViewModel((K8.x) viewModel.a(null, null, kotlin.jvm.internal.l.a(K8.x.class)), (o) viewModel.a(null, null, kotlin.jvm.internal.l.a(o.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(ProViewModel.class), new p<org.koin.core.scope.a, Ob.a, ProViewModel>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.6
                @Override // Ia.p
                public final ProViewModel invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new ProViewModel((D) viewModel.a(null, null, kotlin.jvm.internal.l.a(D.class)), (m) viewModel.a(null, null, kotlin.jvm.internal.l.a(m.class)), (w) viewModel.a(null, null, kotlin.jvm.internal.l.a(w.class)), (com.voltasit.obdeleven.domain.usecases.user.v) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.v.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.oca.k.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.oca.k>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.7
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.oca.k invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a aVar4 = aVar2;
                    Ob.a aVar5 = aVar3;
                    String str = (String) aVar5.a(0, C4.a.j(aVar4, "$this$viewModel", aVar5, "<name for destructuring parameter 0>", String.class));
                    String str2 = (String) aVar5.a(1, kotlin.jvm.internal.l.a(String.class));
                    ((Boolean) aVar5.a(2, kotlin.jvm.internal.l.a(Boolean.class))).getClass();
                    return new com.voltasit.obdeleven.presentation.oca.k((K) aVar4.a(null, null, kotlin.jvm.internal.l.a(K.class)), str, str2, (PurchaseProvider) aVar4.a(null, null, kotlin.jvm.internal.l.a(PurchaseProvider.class)), (K8.p) aVar4.a(null, null, kotlin.jvm.internal.l.a(K8.p.class)), (v) aVar4.a(null, null, kotlin.jvm.internal.l.a(v.class)), (J8.p) aVar4.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (y) aVar4.a(null, null, kotlin.jvm.internal.l.a(y.class)), (com.voltasit.obdeleven.domain.usecases.vehicle.l) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.l.class)), (e) aVar4.a(null, null, kotlin.jvm.internal.l.a(e.class)), (J8.d) aVar4.a(null, null, kotlin.jvm.internal.l.a(J8.d.class)), (com.voltasit.obdeleven.domain.usecases.oca.b) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.oca.b.class)), (x) aVar4.a(null, null, kotlin.jvm.internal.l.a(x.class)), (com.voltasit.obdeleven.domain.usecases.oca.g) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.oca.g.class)), (com.voltasit.obdeleven.domain.usecases.oca.k) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.oca.k.class)), (j) aVar4.a(null, null, kotlin.jvm.internal.l.a(j.class)), (o) aVar4.a(null, null, kotlin.jvm.internal.l.a(o.class)), (J8.a) aVar4.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)), (GetUserDetailsUC) aVar4.a(null, null, kotlin.jvm.internal.l.a(GetUserDetailsUC.class)), (com.voltasit.obdeleven.domain.usecases.user.v) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.v.class)), (f) aVar4.a(null, null, kotlin.jvm.internal.l.a(f.class)), (com.voltasit.obdeleven.domain.usecases.oca.a) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.oca.a.class)), (com.voltasit.obdeleven.domain.usecases.oca.h) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.oca.h.class)), (C2113b) aVar4.a(null, null, kotlin.jvm.internal.l.a(C2113b.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(ProfileViewModel.class), new p<org.koin.core.scope.a, Ob.a, ProfileViewModel>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.8
                @Override // Ia.p
                public final ProfileViewModel invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new ProfileViewModel((PurchaseProvider) viewModel.a(null, null, kotlin.jvm.internal.l.a(PurchaseProvider.class)), (C2121b) viewModel.a(null, null, kotlin.jvm.internal.l.a(C2121b.class)), (w) viewModel.a(null, null, kotlin.jvm.internal.l.a(w.class)), (k) viewModel.a(null, null, kotlin.jvm.internal.l.a(k.class)), (v) viewModel.a(null, null, kotlin.jvm.internal.l.a(v.class)), (q) viewModel.a(null, null, kotlin.jvm.internal.l.a(q.class)), (A) viewModel.a(null, null, kotlin.jvm.internal.l.a(A.class)), (com.voltasit.obdeleven.domain.usecases.j) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.j.class)), (J8.p) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (com.voltasit.obdeleven.domain.usecases.iap.d) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.iap.d.class)), (C2113b) viewModel.a(null, null, kotlin.jvm.internal.l.a(C2113b.class)), (D) viewModel.a(null, null, kotlin.jvm.internal.l.a(D.class)), (com.voltasit.obdeleven.domain.usecases.iap.b) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.iap.b.class)), (K8.p) viewModel.a(null, null, kotlin.jvm.internal.l.a(K8.p.class)), (K8.b) viewModel.a(null, null, kotlin.jvm.internal.l.a(K8.b.class)), (K8.e) viewModel.a(null, null, kotlin.jvm.internal.l.a(K8.e.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(StartupActivityViewModel.class), new p<org.koin.core.scope.a, Ob.a, StartupActivityViewModel>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.9
                @Override // Ia.p
                public final StartupActivityViewModel invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new StartupActivityViewModel((v) viewModel.a(null, null, kotlin.jvm.internal.l.a(v.class)), (u) viewModel.a(null, null, kotlin.jvm.internal.l.a(u.class)), (com.voltasit.obdeleven.domain.usecases.n) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.n.class)), (com.voltasit.obdeleven.domain.usecases.user.i) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.i.class)), (com.voltasit.obdeleven.domain.usecases.vehicle.o) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.o.class)), (J8.p) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (D) viewModel.a(null, null, kotlin.jvm.internal.l.a(D.class)), (com.voltasit.obdeleven.domain.usecases.user.x) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.x.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(MainActivityViewModel.class), new p<org.koin.core.scope.a, Ob.a, MainActivityViewModel>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.10
                @Override // Ia.p
                public final MainActivityViewModel invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new MainActivityViewModel((y) viewModel.a(null, null, kotlin.jvm.internal.l.a(y.class)), (o) viewModel.a(null, null, kotlin.jvm.internal.l.a(o.class)), (PurchaseProvider) viewModel.a(null, null, kotlin.jvm.internal.l.a(PurchaseProvider.class)), (v) viewModel.a(null, null, kotlin.jvm.internal.l.a(v.class)), (J8.d) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.d.class)), (J8.p) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (SaveUserVehicleFromModificationUC) viewModel.a(null, null, kotlin.jvm.internal.l.a(SaveUserVehicleFromModificationUC.class)), (z) viewModel.a(null, null, kotlin.jvm.internal.l.a(z.class)), (J8.a) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)), (w) viewModel.a(null, null, kotlin.jvm.internal.l.a(w.class)), (B) viewModel.a(null, null, kotlin.jvm.internal.l.a(B.class)), (C2118c) viewModel.a(null, null, kotlin.jvm.internal.l.a(C2118c.class)), (J8.c) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.c.class)), (C2120a) viewModel.a(null, null, kotlin.jvm.internal.l.a(C2120a.class)), (com.voltasit.obdeleven.domain.usecases.device.B) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.B.class)), (com.voltasit.obdeleven.domain.usecases.device.D) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.D.class)), (com.voltasit.obdeleven.domain.usecases.device.e) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.e.class)), (com.voltasit.obdeleven.domain.usecases.vehicle.q) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.q.class)), (com.voltasit.obdeleven.domain.usecases.device.k) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.k.class)), (com.voltasit.obdeleven.domain.usecases.device.C) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.C.class)), (com.voltasit.obdeleven.domain.usecases.permissions.c) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.permissions.c.class)), (com.voltasit.obdeleven.domain.usecases.permissions.a) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.permissions.a.class)), (com.voltasit.obdeleven.domain.usecases.device.g) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.g.class)), (com.voltasit.obdeleven.domain.usecases.r) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.r.class)), (com.voltasit.obdeleven.network.b) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.network.b.class)), (J8.g) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.g.class)), (com.voltasit.obdeleven.domain.usecases.device.m) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.m.class)), (C2117b) viewModel.a(null, null, kotlin.jvm.internal.l.a(C2117b.class)), (com.voltasit.obdeleven.domain.usecases.permissions.b) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.permissions.b.class)), (t) viewModel.a(null, null, kotlin.jvm.internal.l.a(t.class)), (com.voltasit.obdeleven.domain.usecases.user.p) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.p.class)), (com.voltasit.obdeleven.domain.usecases.user.j) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.j.class)), (com.voltasit.obdeleven.domain.usecases.vehicle.c) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.c.class)), (s) viewModel.a(null, null, kotlin.jvm.internal.l.a(s.class)), (com.voltasit.obdeleven.domain.usecases.z) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.z.class)), (x) viewModel.a(null, null, kotlin.jvm.internal.l.a(x.class)), (com.voltasit.obdeleven.domain.usecases.y) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.y.class)), (J8.u) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.u.class)), (J8.m) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.m.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.about.a.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.about.a>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.11
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.about.a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    Ob.a aVar4 = aVar3;
                    return new com.voltasit.obdeleven.presentation.about.a((NavigationManager) aVar4.a(0, C4.a.j(aVar2, "$this$viewModel", aVar4, "<name for destructuring parameter 0>", NavigationManager.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(MainViewModel.class), new p<org.koin.core.scope.a, Ob.a, MainViewModel>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.12
                @Override // Ia.p
                public final MainViewModel invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a aVar4 = aVar2;
                    Ob.a aVar5 = aVar3;
                    return new MainViewModel((J8.d) aVar4.a(null, null, kotlin.jvm.internal.l.a(J8.d.class)), (NavigationManager) aVar5.a(0, C4.a.j(aVar4, "$this$viewModel", aVar5, "<name for destructuring parameter 0>", NavigationManager.class)), (y) aVar4.a(null, null, kotlin.jvm.internal.l.a(y.class)), (o) aVar4.a(null, null, kotlin.jvm.internal.l.a(o.class)), (v) aVar4.a(null, null, kotlin.jvm.internal.l.a(v.class)), (x) aVar4.a(null, null, kotlin.jvm.internal.l.a(x.class)), (K8.b) aVar4.a(null, null, kotlin.jvm.internal.l.a(K8.b.class)), (J8.o) aVar4.a(null, null, kotlin.jvm.internal.l.a(J8.o.class)), (com.voltasit.obdeleven.domain.usecases.vehicle.r) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.r.class)), (VehicleClearFaultsUseCase) aVar4.a(null, null, kotlin.jvm.internal.l.a(VehicleClearFaultsUseCase.class)), (K8.x) aVar4.a(null, null, kotlin.jvm.internal.l.a(K8.x.class)), (LoadVehicleIntoCacheUseCase) aVar4.a(null, null, kotlin.jvm.internal.l.a(LoadVehicleIntoCacheUseCase.class)), (com.voltasit.obdeleven.domain.usecases.m) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.m.class)), (com.voltasit.obdeleven.domain.usecases.A) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.A.class)), (J8.g) aVar4.a(null, null, kotlin.jvm.internal.l.a(J8.g.class)), (m) aVar4.a(null, null, kotlin.jvm.internal.l.a(m.class)), (com.voltasit.obdeleven.domain.usecases.odx.a) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.odx.a.class)), (J8.a) aVar4.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)), (J8.p) aVar4.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (com.voltasit.obdeleven.domain.usecases.vehicle.j) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.j.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(GarageViewModel.class), new p<org.koin.core.scope.a, Ob.a, GarageViewModel>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.13
                @Override // Ia.p
                public final GarageViewModel invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a aVar4 = aVar2;
                    Ob.a aVar5 = aVar3;
                    return new GarageViewModel((J8.p) aVar4.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (J8.d) aVar4.a(null, null, kotlin.jvm.internal.l.a(J8.d.class)), (NavigationManager) aVar5.a(0, C4.a.j(aVar4, "$this$viewModel", aVar5, "<name for destructuring parameter 0>", NavigationManager.class)), (v) aVar4.a(null, null, kotlin.jvm.internal.l.a(v.class)), (o) aVar4.a(null, null, kotlin.jvm.internal.l.a(o.class)), (K8.b) aVar4.a(null, null, kotlin.jvm.internal.l.a(K8.b.class)), (K8.x) aVar4.a(null, null, kotlin.jvm.internal.l.a(K8.x.class)), (GetSortedVehicleModelListUseCase) aVar4.a(null, null, kotlin.jvm.internal.l.a(GetSortedVehicleModelListUseCase.class)), (com.voltasit.obdeleven.domain.usecases.odx.a) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.odx.a.class)), (com.voltasit.obdeleven.domain.usecases.user.l) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.l.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(VehicleViewModel.class), new p<org.koin.core.scope.a, Ob.a, VehicleViewModel>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.14
                @Override // Ia.p
                public final VehicleViewModel invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a aVar4 = aVar2;
                    Ob.a aVar5 = aVar3;
                    return new VehicleViewModel((K) aVar4.a(null, null, kotlin.jvm.internal.l.a(K.class)), (com.voltasit.obdeleven.presentation.vehicle.e) aVar5.a(0, C4.a.j(aVar4, "$this$viewModel", aVar5, "<name for destructuring parameter 0>", com.voltasit.obdeleven.presentation.vehicle.e.class)), (J8.p) aVar4.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (K8.x) aVar4.a(null, null, kotlin.jvm.internal.l.a(K8.x.class)), (J8.d) aVar4.a(null, null, kotlin.jvm.internal.l.a(J8.d.class)), (J8.a) aVar4.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)), (o) aVar4.a(null, null, kotlin.jvm.internal.l.a(o.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(SettingsViewModel.class), new p<org.koin.core.scope.a, Ob.a, SettingsViewModel>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.15
                @Override // Ia.p
                public final SettingsViewModel invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new SettingsViewModel((o) viewModel.a(null, null, kotlin.jvm.internal.l.a(o.class)), (J8.g) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.g.class)), (v) viewModel.a(null, null, kotlin.jvm.internal.l.a(v.class)), (K8.t) viewModel.a(null, null, kotlin.jvm.internal.l.a(K8.t.class)), (J8.d) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.d.class)), (K8.b) viewModel.a(null, null, kotlin.jvm.internal.l.a(K8.b.class)), (J8.h) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.h.class)), (K8.f) viewModel.a(null, null, kotlin.jvm.internal.l.a(K8.f.class)), (K8.g) viewModel.a(null, null, kotlin.jvm.internal.l.a(K8.g.class)), (GetUserDetailsUC) viewModel.a(null, null, kotlin.jvm.internal.l.a(GetUserDetailsUC.class)), (J8.p) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(OnlineControlUnitListViewModel.class), new p<org.koin.core.scope.a, Ob.a, OnlineControlUnitListViewModel>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.16
                @Override // Ia.p
                public final OnlineControlUnitListViewModel invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a aVar4 = aVar2;
                    Ob.a aVar5 = aVar3;
                    return new OnlineControlUnitListViewModel((K) aVar4.a(null, null, kotlin.jvm.internal.l.a(K.class)), (String) aVar5.a(0, C4.a.j(aVar4, "$this$viewModel", aVar5, "<name for destructuring parameter 0>", String.class)), (o) aVar4.a(null, null, kotlin.jvm.internal.l.a(o.class)), (J8.p) aVar4.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (com.voltasit.obdeleven.domain.usecases.m) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.m.class)), (com.voltasit.obdeleven.domain.usecases.vehicle.a) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.a.class)), (com.voltasit.obdeleven.domain.usecases.vehicle.e) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.e.class)), (com.voltasit.obdeleven.domain.usecases.gateway.d) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.gateway.d.class)), (com.voltasit.obdeleven.domain.usecases.vehicle.b) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.b.class)), (com.voltasit.obdeleven.domain.usecases.vehicle.d) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.d.class)), (A8.g) aVar4.a(null, null, kotlin.jvm.internal.l.a(A8.g.class)), (com.voltasit.obdeleven.domain.usecases.controlUnit.c) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.c.class)), (m) aVar4.a(null, null, kotlin.jvm.internal.l.a(m.class)), (com.voltasit.obdeleven.domain.usecases.controlUnit.e) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.e.class)), (GetUserDetailsUC) aVar4.a(null, null, kotlin.jvm.internal.l.a(GetUserDetailsUC.class)), (com.voltasit.obdeleven.domain.usecases.user.v) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.v.class)), (com.voltasit.obdeleven.domain.usecases.vehicle.l) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.l.class)), (com.voltasit.obdeleven.domain.usecases.vehicle.n) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.n.class)), (L8.a) aVar4.a(null, null, kotlin.jvm.internal.l.a(L8.a.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.controlunitlist.offline.a.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.controlunitlist.offline.a>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.17
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.controlunitlist.offline.a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a aVar4 = aVar2;
                    Ob.a aVar5 = aVar3;
                    return new com.voltasit.obdeleven.presentation.controlunitlist.offline.a((K) aVar4.a(null, null, kotlin.jvm.internal.l.a(K.class)), (String) aVar5.a(0, C4.a.j(aVar4, "$this$viewModel", aVar5, "<name for destructuring parameter 0>", String.class)), (o) aVar4.a(null, null, kotlin.jvm.internal.l.a(o.class)), (com.voltasit.obdeleven.domain.usecases.controlUnit.b) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.b.class)), (K8.x) aVar4.a(null, null, kotlin.jvm.internal.l.a(K8.x.class)), (A8.e) aVar4.a(null, null, kotlin.jvm.internal.l.a(A8.e.class)), (com.voltasit.obdeleven.domain.usecases.controlUnit.c) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.c.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.controlUnit.faults.b.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.controlUnit.faults.b>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.18
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.controlUnit.faults.b invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.presentation.controlUnit.faults.b((com.voltasit.obdeleven.domain.usecases.controlUnit.d) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.d.class)), (GetUserDetailsUC) viewModel.a(null, null, kotlin.jvm.internal.l.a(GetUserDetailsUC.class)), (K8.b) viewModel.a(null, null, kotlin.jvm.internal.l.a(K8.b.class)), (o) viewModel.a(null, null, kotlin.jvm.internal.l.a(o.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(F.class), new p<org.koin.core.scope.a, Ob.a, F>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.19
                @Override // Ia.p
                public final F invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new F((com.voltasit.obdeleven.domain.usecases.controlUnit.d) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.d.class)), (GetUserDetailsUC) viewModel.a(null, null, kotlin.jvm.internal.l.a(GetUserDetailsUC.class)), (K8.b) viewModel.a(null, null, kotlin.jvm.internal.l.a(K8.b.class)), (com.voltasit.obdeleven.domain.usecases.sfd.e) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.sfd.e.class)), (com.voltasit.obdeleven.domain.usecases.sfd.j) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.sfd.j.class)), (com.voltasit.obdeleven.domain.usecases.sfd.g) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.sfd.g.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.controlUnit.info.c.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.controlUnit.info.c>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.20
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.controlUnit.info.c invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.presentation.controlUnit.info.c((com.voltasit.obdeleven.domain.usecases.odx.i) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.odx.i.class)), (J8.d) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.d.class)), (A8.g) viewModel.a(null, null, kotlin.jvm.internal.l.a(A8.g.class)), (UpdateControlUnitOdxVersionUC) viewModel.a(null, null, kotlin.jvm.internal.l.a(UpdateControlUnitOdxVersionUC.class)), (GetControlUnitOdxVersionUC) viewModel.a(null, null, kotlin.jvm.internal.l.a(GetControlUnitOdxVersionUC.class)), (J8.p) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (J8.a) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.dialogs.backup.h.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.dialogs.backup.h>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.21
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.dialogs.backup.h invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.presentation.dialogs.backup.h((J8.a) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.notification.b.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.notification.b>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.22
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.notification.b invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.presentation.notification.b((J8.a) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(DeviceUpdateViewModel.class), new p<org.koin.core.scope.a, Ob.a, DeviceUpdateViewModel>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.23
                @Override // Ia.p
                public final DeviceUpdateViewModel invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new DeviceUpdateViewModel((ForceDeviceUpdateUC) viewModel.a(null, null, kotlin.jvm.internal.l.a(ForceDeviceUpdateUC.class)), (com.voltasit.obdeleven.domain.usecases.device.y) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.y.class)), (com.voltasit.obdeleven.domain.usecases.device.x) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.x.class)), (com.voltasit.obdeleven.domain.usecases.device.l) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.l.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.twofactorauth.backup.b.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.twofactorauth.backup.b>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.24
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.twofactorauth.backup.b invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    Ob.a aVar4 = aVar3;
                    return new com.voltasit.obdeleven.presentation.twofactorauth.backup.b((String) aVar4.a(0, C4.a.j(aVar2, "$this$viewModel", aVar4, "<name for destructuring parameter 0>", String.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(TwoFactorAuthSetupViewModel.class), new p<org.koin.core.scope.a, Ob.a, TwoFactorAuthSetupViewModel>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.25
                @Override // Ia.p
                public final TwoFactorAuthSetupViewModel invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new TwoFactorAuthSetupViewModel((C2125f) viewModel.a(null, null, kotlin.jvm.internal.l.a(C2125f.class)), (com.voltasit.obdeleven.domain.usecases.h) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.h.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.signIn.l.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.signIn.l>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.26
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.signIn.l invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a aVar4 = aVar2;
                    Ob.a aVar5 = aVar3;
                    return new com.voltasit.obdeleven.presentation.signIn.l((G8.r) aVar5.a(0, C4.a.j(aVar4, "$this$viewModel", aVar5, "<name for destructuring parameter 0>", G8.r.class)), (com.voltasit.obdeleven.domain.usecases.user.r) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.r.class)), (J8.d) aVar4.a(null, null, kotlin.jvm.internal.l.a(J8.d.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.twofactorauth.verify.e.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.twofactorauth.verify.e>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.27
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.twofactorauth.verify.e invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a aVar4 = aVar2;
                    Ob.a aVar5 = aVar3;
                    return new com.voltasit.obdeleven.presentation.twofactorauth.verify.e((String) aVar5.a(0, C4.a.j(aVar4, "$this$viewModel", aVar5, "<name for destructuring parameter 0>", String.class)), (com.voltasit.obdeleven.domain.usecases.user.F) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.F.class)), (C2124e) aVar4.a(null, null, kotlin.jvm.internal.l.a(C2124e.class)), (v) aVar4.a(null, null, kotlin.jvm.internal.l.a(v.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.twofactorauth.backupCode.b.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.twofactorauth.backupCode.b>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.28
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.twofactorauth.backupCode.b invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a aVar4 = aVar2;
                    Ob.a aVar5 = aVar3;
                    return new com.voltasit.obdeleven.presentation.twofactorauth.backupCode.b((G8.r) aVar5.a(0, C4.a.j(aVar4, "$this$viewModel", aVar5, "<name for destructuring parameter 0>", G8.r.class)), (com.voltasit.obdeleven.domain.usecases.user.r) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.r.class)), (C2123d) aVar4.a(null, null, kotlin.jvm.internal.l.a(C2123d.class)), (v) aVar4.a(null, null, kotlin.jvm.internal.l.a(v.class)), (J8.d) aVar4.a(null, null, kotlin.jvm.internal.l.a(J8.d.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(DisableTwoFactorBackupCodeViewModel.class), new p<org.koin.core.scope.a, Ob.a, DisableTwoFactorBackupCodeViewModel>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.29
                @Override // Ia.p
                public final DisableTwoFactorBackupCodeViewModel invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new DisableTwoFactorBackupCodeViewModel((C2123d) viewModel.a(null, null, kotlin.jvm.internal.l.a(C2123d.class)), (v) viewModel.a(null, null, kotlin.jvm.internal.l.a(v.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.basicsettings.a.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.basicsettings.a>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.30
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.basicsettings.a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.presentation.basicsettings.a((GetBasicSettingsUC) viewModel.a(null, null, kotlin.jvm.internal.l.a(GetBasicSettingsUC.class)), (com.voltasit.obdeleven.domain.usecases.f) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.f.class)), (com.voltasit.obdeleven.domain.usecases.odx.d) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.odx.d.class)), (GetBasicSettingRequestParamUC) viewModel.a(null, null, kotlin.jvm.internal.l.a(GetBasicSettingRequestParamUC.class)), (StartBasicSettingUC) viewModel.a(null, null, kotlin.jvm.internal.l.a(StartBasicSettingUC.class)), (com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting.a) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting.a.class)), (com.voltasit.obdeleven.domain.usecases.vehicle.l) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.l.class)), (J8.a) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.controlUnit.uds.readdata.b.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.controlUnit.uds.readdata.b>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.31
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.controlUnit.uds.readdata.b invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.presentation.controlUnit.uds.readdata.b((com.voltasit.obdeleven.domain.usecases.v) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.v.class)), (J8.a) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.i.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.i>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.32
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.i invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.i((com.voltasit.obdeleven.domain.usecases.v) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.v.class)), (com.voltasit.obdeleven.domain.usecases.odx.j) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.odx.j.class)), (J8.p) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (com.voltasit.obdeleven.domain.usecases.controlUnit.adaptation.a) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.adaptation.a.class)), (J8.a) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.r.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.r>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.33
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.r invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.r((GetUserDetailsUC) viewModel.a(null, null, kotlin.jvm.internal.l.a(GetUserDetailsUC.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online.a.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online.a>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.34
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online.a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online.a((GetUserDetailsUC) viewModel.a(null, null, kotlin.jvm.internal.l.a(GetUserDetailsUC.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.controlUnit.kwp.coding.a.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.controlUnit.kwp.coding.a>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.35
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.controlUnit.kwp.coding.a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.presentation.controlUnit.kwp.coding.a((GetUserDetailsUC) viewModel.a(null, null, kotlin.jvm.internal.l.a(GetUserDetailsUC.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.controlUnit.kwp.livedata.g.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.controlUnit.kwp.livedata.g>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.36
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.controlUnit.kwp.livedata.g invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.presentation.controlUnit.kwp.livedata.g((GetUserDetailsUC) viewModel.a(null, null, kotlin.jvm.internal.l.a(GetUserDetailsUC.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(ControlUnitViewModel.class), new p<org.koin.core.scope.a, Ob.a, ControlUnitViewModel>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.37
                @Override // Ia.p
                public final ControlUnitViewModel invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new ControlUnitViewModel((GetUserDetailsUC) viewModel.a(null, null, kotlin.jvm.internal.l.a(GetUserDetailsUC.class)), (com.voltasit.obdeleven.domain.usecases.sfd.d) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.sfd.d.class)), (com.voltasit.obdeleven.domain.usecases.vehicle.l) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.l.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(X8.t.class), new p<org.koin.core.scope.a, Ob.a, X8.t>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.38
                @Override // Ia.p
                public final X8.t invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new X8.t();
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(Z8.a.class), new p<org.koin.core.scope.a, Ob.a, Z8.a>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.39
                @Override // Ia.p
                public final Z8.a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new Z8.a();
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.e.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.e>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.40
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.e invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.e((com.voltasit.obdeleven.domain.usecases.vehicle.l) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.l.class)), (J8.a) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(BonusDialogViewModel.class), new p<org.koin.core.scope.a, Ob.a, BonusDialogViewModel>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.41
                @Override // Ia.p
                public final BonusDialogViewModel invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a aVar4 = aVar2;
                    Ob.a aVar5 = aVar3;
                    return new BonusDialogViewModel((K) aVar4.a(null, null, kotlin.jvm.internal.l.a(K.class)), (com.voltasit.obdeleven.presentation.dialogs.bonus.c) aVar5.a(0, C4.a.j(aVar4, "$this$viewModel", aVar5, "<name for destructuring parameter 0>", com.voltasit.obdeleven.presentation.dialogs.bonus.c.class)), (D) aVar4.a(null, null, kotlin.jvm.internal.l.a(D.class)), (com.voltasit.obdeleven.domain.usecases.bonus.a) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.bonus.a.class)), (v) aVar4.a(null, null, kotlin.jvm.internal.l.a(v.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.dialogs.devicePassword.d.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.dialogs.devicePassword.d>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.42
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.dialogs.devicePassword.d invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.presentation.dialogs.devicePassword.d((C2119d) viewModel.a(null, null, kotlin.jvm.internal.l.a(C2119d.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.dialogs.devicePassword.g.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.dialogs.devicePassword.g>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.43
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.dialogs.devicePassword.g invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.presentation.dialogs.devicePassword.g((com.voltasit.obdeleven.domain.usecases.bonus.b) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.bonus.b.class)), (K8.f) viewModel.a(null, null, kotlin.jvm.internal.l.a(K8.f.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(DeviceSelectionViewModel.class), new p<org.koin.core.scope.a, Ob.a, DeviceSelectionViewModel>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.44
                @Override // Ia.p
                public final DeviceSelectionViewModel invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new DeviceSelectionViewModel((J8.c) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.c.class)), (J8.p) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (com.voltasit.obdeleven.domain.usecases.device.i) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.i.class)), (com.voltasit.obdeleven.domain.usecases.device.j) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.j.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(CreatePersonalInfoViewModel.class), new p<org.koin.core.scope.a, Ob.a, CreatePersonalInfoViewModel>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.45
                @Override // Ia.p
                public final CreatePersonalInfoViewModel invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new CreatePersonalInfoViewModel((com.voltasit.obdeleven.domain.usecases.user.B) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.B.class)), (J8.p) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (com.voltasit.obdeleven.domain.usecases.user.o) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.o.class)), (v) viewModel.a(null, null, kotlin.jvm.internal.l.a(v.class)), (com.voltasit.obdeleven.domain.usecases.l) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.l.class)), (com.voltasit.obdeleven.domain.usecases.o) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.o.class)), (com.voltasit.obdeleven.domain.usecases.i) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.i.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(CountrySelectionViewModel.class), new p<org.koin.core.scope.a, Ob.a, CountrySelectionViewModel>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.46
                @Override // Ia.p
                public final CountrySelectionViewModel invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new CountrySelectionViewModel((com.voltasit.obdeleven.domain.usecases.o) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.o.class)));
                }
            }, kind, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(EditPersonalInfoViewModel.class), new p<org.koin.core.scope.a, Ob.a, EditPersonalInfoViewModel>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.47
                @Override // Ia.p
                public final EditPersonalInfoViewModel invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new EditPersonalInfoViewModel((com.voltasit.obdeleven.domain.usecases.user.B) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.B.class)), (J8.p) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (com.voltasit.obdeleven.domain.usecases.user.o) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.o.class)), (h) viewModel.a(null, null, kotlin.jvm.internal.l.a(h.class)), (v) viewModel.a(null, null, kotlin.jvm.internal.l.a(v.class)), (com.voltasit.obdeleven.domain.usecases.l) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.l.class)), (com.voltasit.obdeleven.domain.usecases.o) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.o.class)), (com.voltasit.obdeleven.domain.usecases.i) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.i.class)));
                }
            }, kind, emptyList)));
            c cVarA2 = kotlin.jvm.internal.l.a(EmailVerificationViewModel.class);
            AnonymousClass48 anonymousClass48 = new p<org.koin.core.scope.a, Ob.a, EmailVerificationViewModel>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.48
                @Override // Ia.p
                public final EmailVerificationViewModel invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new EmailVerificationViewModel((v) viewModel.a(null, null, kotlin.jvm.internal.l.a(v.class)), (J8.l) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.l.class)), (G) viewModel.a(null, null, kotlin.jvm.internal.l.a(G.class)), (K8.i) viewModel.a(null, null, kotlin.jvm.internal.l.a(K8.i.class)));
                }
            };
            b bVar2 = Qb.b.f5141c;
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, cVarA2, anonymousClass48, kind, emptyList)));
            EmptyList emptyList2 = EmptyList.f42983b;
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.ui.dialogs.autocodeprogress.b.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.ui.dialogs.autocodeprogress.b>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.49
                @Override // Ia.p
                public final com.voltasit.obdeleven.ui.dialogs.autocodeprogress.b invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a aVar4 = aVar2;
                    Ob.a aVar5 = aVar3;
                    return new com.voltasit.obdeleven.ui.dialogs.autocodeprogress.b((List) aVar5.a(0, C4.a.j(aVar4, "$this$viewModel", aVar5, "<name for destructuring parameter 0>", List.class)), (com.voltasit.obdeleven.domain.usecases.sfd.e) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.sfd.e.class)), (com.voltasit.obdeleven.domain.usecases.sfd.a) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.sfd.a.class)), (com.voltasit.obdeleven.domain.usecases.sfd.j) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.sfd.j.class)), (com.voltasit.obdeleven.domain.usecases.gateway.a) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.gateway.a.class)));
                }
            }, kind, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(SfdViewModel.class), new p<org.koin.core.scope.a, Ob.a, SfdViewModel>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.50
                @Override // Ia.p
                public final SfdViewModel invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a aVar4 = aVar2;
                    Ob.a aVar5 = aVar3;
                    return new SfdViewModel((Feature) aVar5.a(0, C4.a.j(aVar4, "$this$viewModel", aVar5, "<name for destructuring parameter 0>", Feature.class)), (com.voltasit.obdeleven.domain.usecases.sfd.j) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.sfd.j.class)), (com.voltasit.obdeleven.domain.usecases.sfd.a) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.sfd.a.class)), (L8.a) aVar4.a(null, null, kotlin.jvm.internal.l.a(L8.a.class)), (com.voltasit.obdeleven.domain.usecases.sfd.e) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.sfd.e.class)));
                }
            }, kind, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.dialogs.sfd.d.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.dialogs.sfd.d>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.51
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.dialogs.sfd.d invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a aVar4 = aVar2;
                    Ob.a aVar5 = aVar3;
                    return new com.voltasit.obdeleven.presentation.dialogs.sfd.d((J8.a) aVar4.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)), (NavigationManager) aVar5.a(0, C4.a.j(aVar4, "$this$viewModel", aVar5, "<name for destructuring parameter 0>", NavigationManager.class)), (o) aVar4.a(null, null, kotlin.jvm.internal.l.a(o.class)));
                }
            }, kind, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(EditPersonalInfoWizardViewModel.class), new p<org.koin.core.scope.a, Ob.a, EditPersonalInfoWizardViewModel>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.52
                @Override // Ia.p
                public final EditPersonalInfoWizardViewModel invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new EditPersonalInfoWizardViewModel((K8.i) viewModel.a(null, null, kotlin.jvm.internal.l.a(K8.i.class)), (com.voltasit.obdeleven.domain.usecases.user.m) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.m.class)), (J8.p) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.a.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.a>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.53
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a aVar4 = aVar2;
                    Ob.a aVar5 = aVar3;
                    return new com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.a((K) aVar4.a(null, null, kotlin.jvm.internal.l.a(K.class)), ((Boolean) aVar5.a(0, C4.a.j(aVar4, "$this$viewModel", aVar5, "<name for destructuring parameter 0>", Boolean.class))).booleanValue(), (K8.i) aVar4.a(null, null, kotlin.jvm.internal.l.a(K8.i.class)), (u) aVar4.a(null, null, kotlin.jvm.internal.l.a(u.class)), (com.voltasit.obdeleven.domain.usecases.w) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.w.class)), (J8.p) aVar4.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.c.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.c>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.54
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.c invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.c((com.voltasit.obdeleven.domain.usecases.user.B) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.B.class)), (K8.i) viewModel.a(null, null, kotlin.jvm.internal.l.a(K8.i.class)), (h) viewModel.a(null, null, kotlin.jvm.internal.l.a(h.class)), (com.voltasit.obdeleven.domain.usecases.i) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.i.class)), (com.voltasit.obdeleven.domain.usecases.p) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.p.class)));
                }
            }, kind, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.dialogs.autocode.b.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.dialogs.autocode.b>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.55
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.dialogs.autocode.b invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.presentation.dialogs.autocode.b((o) viewModel.a(null, null, kotlin.jvm.internal.l.a(o.class)));
                }
            }, kind, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.profile.m.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.profile.m>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.56
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.profile.m invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a aVar4 = aVar2;
                    Ob.a aVar5 = aVar3;
                    return new com.voltasit.obdeleven.presentation.profile.m((String) aVar5.a(0, C4.a.j(aVar4, "$this$viewModel", aVar5, "<name for destructuring parameter 0>", String.class)), (G8.z.a) aVar5.a(1, kotlin.jvm.internal.l.a(G8.z.a.class)), (com.voltasit.obdeleven.domain.usecases.iap.c) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.iap.c.class)), (com.voltasit.obdeleven.domain.usecases.iap.a) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.iap.a.class)));
                }
            }, kind, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.devices.a.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.devices.a>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.57
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.devices.a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.presentation.devices.a((com.voltasit.obdeleven.domain.usecases.permissions.c) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.permissions.c.class)), (com.voltasit.obdeleven.domain.usecases.permissions.a) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.permissions.a.class)), (C2116a) viewModel.a(null, null, kotlin.jvm.internal.l.a(C2116a.class)));
                }
            }, kind, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(NumberConfirmationViewModel.class), new p<org.koin.core.scope.a, Ob.a, NumberConfirmationViewModel>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.58
                @Override // Ia.p
                public final NumberConfirmationViewModel invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a aVar4 = aVar2;
                    Ob.a aVar5 = aVar3;
                    return new NumberConfirmationViewModel((String) aVar5.a(0, C4.a.j(aVar4, "$this$viewModel", aVar5, "<name for destructuring parameter 0>", String.class)), (J8.d) aVar4.a(null, null, kotlin.jvm.internal.l.a(J8.d.class)), (K8.i) aVar4.a(null, null, kotlin.jvm.internal.l.a(K8.i.class)), (v) aVar4.a(null, null, kotlin.jvm.internal.l.a(v.class)));
                }
            }, kind, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.ui.dialogs.user.b.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.ui.dialogs.user.b>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.59
                @Override // Ia.p
                public final com.voltasit.obdeleven.ui.dialogs.user.b invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.ui.dialogs.user.b((C2114c) viewModel.a(null, null, kotlin.jvm.internal.l.a(C2114c.class)), (E) viewModel.a(null, null, kotlin.jvm.internal.l.a(E.class)), (C2121b) viewModel.a(null, null, kotlin.jvm.internal.l.a(C2121b.class)));
                }
            }, kind, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.ui.feature.boomboarding.b.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.ui.feature.boomboarding.b>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.60
                @Override // Ia.p
                public final com.voltasit.obdeleven.ui.feature.boomboarding.b invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.ui.feature.boomboarding.b((NavigationManager) viewModel.a(null, null, kotlin.jvm.internal.l.a(NavigationManager.class)), (J8.u) viewModel.a(null, null, kotlin.jvm.internal.l.a(J8.u.class)));
                }
            }, kind, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.obdeleven.feature.boomboarding.ui.a.class), new p<org.koin.core.scope.a, Ob.a, com.obdeleven.feature.boomboarding.ui.a>() { // from class: com.voltasit.obdeleven.common.AppModuleViewModelsKt$appModuleViewModels$1.61
                @Override // Ia.p
                public final com.obdeleven.feature.boomboarding.ui.a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new com.obdeleven.feature.boomboarding.ui.a();
                }
            }, kind, emptyList2)));
            return r.f47939a;
        }
    });
}
