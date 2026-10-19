package com.voltasit.obdeleven.common;

import A8.A;
import A8.C0605a;
import A8.t;
import A8.z;
import F8.e;
import Ia.l;
import J8.d;
import J8.h;
import J8.j;
import J8.m;
import J8.p;
import J8.q;
import J8.s;
import K8.g;
import K8.o;
import K8.v;
import K8.x;
import K8.y;
import Nb.a;
import Pb.b;
import android.app.Application;
import android.content.Context;
import android.os.PowerManager;
import androidx.compose.foundation.C0936h;
import com.google.android.gms.internal.measurement.C1787c0;
import com.voltasit.obdeleven.data.providers.AppResourceProviderImpl;
import com.voltasit.obdeleven.data.providers.C2111a;
import com.voltasit.obdeleven.data.providers.ControlUnitRepositoryWrapperImpl;
import com.voltasit.obdeleven.data.providers.PlayIntegrityProvider;
import com.voltasit.obdeleven.data.providers.RemoteConfigCoreProviderImpl;
import com.voltasit.obdeleven.data.providers.n;
import com.voltasit.obdeleven.data.providers.u;
import com.voltasit.obdeleven.data.repositories.FileRepositoryImpl;
import com.voltasit.obdeleven.data.repositories.OdxWorkerRepositoryImpl;
import com.voltasit.obdeleven.data.repositories.PreferenceRepositoryImpl;
import com.voltasit.obdeleven.data.repositories.ReportRepositoryImpl;
import com.voltasit.obdeleven.data.repositories.UserRepositoryImpl;
import com.voltasit.obdeleven.data.repositories.VehicleRepositoryImpl;
import com.voltasit.obdeleven.data.repositories.f;
import com.voltasit.obdeleven.data.repositories.k;
import com.voltasit.obdeleven.data.repositories.w;
import com.voltasit.obdeleven.domain.providers.PurchaseProvider;
import com.voltasit.obdeleven.domain.repositories.AgreementRepository;
import com.voltasit.obdeleven.domain.repositories.InAppPurchaseRepository;
import com.voltasit.obdeleven.domain.timers.BasicSettingStatusTimer;
import com.voltasit.obdeleven.presentation.vagpromo.VagProRedirectPromoPresenter;
import com.voltasit.parse.Parse;
import com.voltasit.sharednetwork.ServerApiImpl;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.c;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.instance.SingleInstanceFactory;
import p293xa.r;

/* JADX INFO: compiled from: AppModuleSingles.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AppModuleSinglesKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f29806a = C1787c0.p(new l<a, r>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1
        @Override // Ia.l
        public final r invoke(a aVar) {
            a module = aVar;
            i.e(module, "$this$module");
            Kind kind = Kind.f45760b;
            EmptyList emptyList = EmptyList.f42983b;
            c cVarA = kotlin.jvm.internal.l.a(p.class);
            AnonymousClass1 anonymousClass1 = new Ia.p<org.koin.core.scope.a, Ob.a, p>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.1
                @Override // Ia.p
                public final p invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new n();
                }
            };
            b bVar = Qb.b.f5141c;
            SingleInstanceFactory<?> singleInstanceFactoryE = C0936h.e(new BeanDefinition(bVar, cVarA, anonymousClass1, kind, emptyList), module);
            boolean z10 = module.f4702a;
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE2 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.sharednetwork.a.class), new Ia.p<org.koin.core.scope.a, Ob.a, com.voltasit.sharednetwork.a>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.2
                @Override // Ia.p
                public final com.voltasit.sharednetwork.a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new ServerApiImpl((com.voltasit.sharednetwork.dataSources.a) single.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.sharednetwork.dataSources.a.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE2);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE3 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(J8.b.class), new Ia.p<org.koin.core.scope.a, Ob.a, J8.b>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.3
                @Override // Ia.p
                public final J8.b invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.providers.b((Context) single.a(null, null, kotlin.jvm.internal.l.a(Context.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE3);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE4 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(m.class), new Ia.p<org.koin.core.scope.a, Ob.a, m>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.4
                @Override // Ia.p
                public final m invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    Context context = (Context) single.a(null, null, kotlin.jvm.internal.l.a(Context.class));
                    return new PlayIntegrityProvider(context, 853837094302L, (p) single.a(null, null, kotlin.jvm.internal.l.a(p.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE4);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE5 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.network.b.class), new Ia.p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.network.b>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.5
                @Override // Ia.p
                public final com.voltasit.obdeleven.network.b invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a aVar4 = aVar2;
                    J8.b bVar2 = (J8.b) aVar4.a(null, null, C4.a.j(aVar4, "$this$single", aVar3, "it", J8.b.class));
                    return new com.voltasit.obdeleven.network.a("https://api.obdeleven.com/v1", false, bVar2.b(), bVar2.a(), EmptyList.f42983b, new p291x8.a(), new O.a());
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE5);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE6 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.network.c.class), new Ia.p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.network.c>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.6
                @Override // Ia.p
                public final com.voltasit.obdeleven.network.c invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.network.ServerApiImpl((com.voltasit.obdeleven.network.b) single.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.network.b.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE6);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE7 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.sharednetwork.dataSources.a.class), new Ia.p<org.koin.core.scope.a, Ob.a, com.voltasit.sharednetwork.dataSources.a>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.7
                @Override // Ia.p
                public final com.voltasit.sharednetwork.dataSources.a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    com.voltasit.sharednetwork.dataSources.b client = Parse.f34394a;
                    i.d(client, "client");
                    return client;
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE7);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE8 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(o.class), new Ia.p<org.koin.core.scope.a, Ob.a, o>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.8
                @Override // Ia.p
                public final o invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new PreferenceRepositoryImpl((Context) single.a(null, null, kotlin.jvm.internal.l.a(Context.class)), (K8.b) single.a(null, null, kotlin.jvm.internal.l.a(K8.b.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE8);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE9 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(s.class), new Ia.p<org.koin.core.scope.a, Ob.a, s>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.9
                @Override // Ia.p
                public final s invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.providers.r((Context) single.a(null, null, kotlin.jvm.internal.l.a(Context.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE9);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE10 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(d.class), new Ia.p<org.koin.core.scope.a, Ob.a, d>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.10
                @Override // Ia.p
                public final d invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    Context context = (Context) single.a(null, null, kotlin.jvm.internal.l.a(Context.class));
                    com.voltasit.obdeleven.data.providers.c cVar = new com.voltasit.obdeleven.data.providers.c();
                    cVar.f30258a = context;
                    return cVar;
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE10);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE11 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(InAppPurchaseRepository.class), new Ia.p<org.koin.core.scope.a, Ob.a, InAppPurchaseRepository>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.11
                @Override // Ia.p
                public final InAppPurchaseRepository invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    com.voltasit.sharednetwork.dataSources.b client = Parse.f34394a;
                    i.d(client, "client");
                    return new com.voltasit.obdeleven.data.repositories.l(client, (F8.c) single.a(null, null, kotlin.jvm.internal.l.a(F8.c.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE11);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE12 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(K8.l.class), new Ia.p<org.koin.core.scope.a, Ob.a, K8.l>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.12
                @Override // Ia.p
                public final K8.l invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new OdxWorkerRepositoryImpl((x) single.a(null, null, kotlin.jvm.internal.l.a(x.class)), (K8.d) single.a(null, null, kotlin.jvm.internal.l.a(K8.d.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE12);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE13 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(y.class), new Ia.p<org.koin.core.scope.a, Ob.a, y>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.13
                @Override // Ia.p
                public final y invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    Context context = (Context) single.a(null, null, kotlin.jvm.internal.l.a(Context.class));
                    com.voltasit.obdeleven.data.repositories.y yVar = new com.voltasit.obdeleven.data.repositories.y();
                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                    if (powerManager != null) {
                        yVar.f30399a = powerManager.newWakeLock(536870938, com.voltasit.obdeleven.data.repositories.y.class.getName());
                    }
                    return yVar;
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE13);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE14 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(g.class), new Ia.p<org.koin.core.scope.a, Ob.a, g>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.14
                @Override // Ia.p
                public final g invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new FileRepositoryImpl((Context) single.a(null, null, kotlin.jvm.internal.l.a(Context.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE14);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE15 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(v.class), new Ia.p<org.koin.core.scope.a, Ob.a, v>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.15
                @Override // Ia.p
                public final v invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new UserRepositoryImpl((p) single.a(null, null, kotlin.jvm.internal.l.a(p.class)), (com.voltasit.sharednetwork.a) single.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.sharednetwork.a.class)), (com.voltasit.obdeleven.network.c) single.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.network.c.class)), (K8.b) single.a(null, null, kotlin.jvm.internal.l.a(K8.b.class)), (F8.c) single.a(null, null, kotlin.jvm.internal.l.a(F8.c.class)), (e) single.a(null, null, kotlin.jvm.internal.l.a(e.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE15);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE16 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(K8.n.class), new Ia.p<org.koin.core.scope.a, Ob.a, K8.n>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.16
                @Override // Ia.p
                public final K8.n invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new f((o) single.a(null, null, kotlin.jvm.internal.l.a(o.class)), (com.voltasit.sharednetwork.a) single.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.sharednetwork.a.class)), (F8.c) single.a(null, null, kotlin.jvm.internal.l.a(F8.c.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE16);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE17 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(p084g8.b.class), new Ia.p<org.koin.core.scope.a, Ob.a, p084g8.b>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.17
                @Override // Ia.p
                public final p084g8.b invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new k((p) single.a(null, null, kotlin.jvm.internal.l.a(p.class)), (com.voltasit.sharednetwork.a) single.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.sharednetwork.a.class)), (K8.b) single.a(null, null, kotlin.jvm.internal.l.a(K8.b.class)), (v) single.a(null, null, kotlin.jvm.internal.l.a(v.class)), (F8.c) single.a(null, null, kotlin.jvm.internal.l.a(F8.c.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE17);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE18 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(K8.b.class), new Ia.p<org.koin.core.scope.a, Ob.a, K8.b>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.18
                @Override // Ia.p
                public final K8.b invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.repositories.c();
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE18);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE19 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(x.class), new Ia.p<org.koin.core.scope.a, Ob.a, x>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.19
                @Override // Ia.p
                public final x invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new VehicleRepositoryImpl(new A(), (K8.b) single.a(null, null, kotlin.jvm.internal.l.a(K8.b.class)), (o) single.a(null, null, kotlin.jvm.internal.l.a(o.class)), (p) single.a(null, null, kotlin.jvm.internal.l.a(p.class)), (com.voltasit.obdeleven.domain.usecases.vehicle.f) single.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.f.class)), (F8.c) single.a(null, null, kotlin.jvm.internal.l.a(F8.c.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE19);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE20 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(J8.o.class), new Ia.p<org.koin.core.scope.a, Ob.a, J8.o>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.20
                @Override // Ia.p
                public final J8.o invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.providers.m((Context) single.a(null, null, kotlin.jvm.internal.l.a(Context.class)), (p) single.a(null, null, kotlin.jvm.internal.l.a(p.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE20);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE21 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(J8.x.class), new Ia.p<org.koin.core.scope.a, Ob.a, J8.x>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.21
                @Override // Ia.p
                public final J8.x invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.providers.A((p) single.a(null, null, kotlin.jvm.internal.l.a(p.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE21);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE22 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(PurchaseProvider.class), new Ia.p<org.koin.core.scope.a, Ob.a, PurchaseProvider>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.22
                @Override // Ia.p
                public final PurchaseProvider invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new u((p) single.a(null, null, kotlin.jvm.internal.l.a(p.class)), (d) single.a(null, null, kotlin.jvm.internal.l.a(d.class)), (o) single.a(null, null, kotlin.jvm.internal.l.a(o.class)), (InAppPurchaseRepository) single.a(null, null, kotlin.jvm.internal.l.a(InAppPurchaseRepository.class)), (J8.a) single.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE22);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE23 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(K8.p.class), new Ia.p<org.koin.core.scope.a, Ob.a, K8.p>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.23
                @Override // Ia.p
                public final K8.p invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.repositories.r((com.voltasit.sharednetwork.a) single.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.sharednetwork.a.class)), new A8.i(), new A8.s(), (t) single.a(null, null, kotlin.jvm.internal.l.a(t.class)), (p) single.a(null, null, kotlin.jvm.internal.l.a(p.class)), (PurchaseProvider) single.a(null, null, kotlin.jvm.internal.l.a(PurchaseProvider.class)), (F8.c) single.a(null, null, kotlin.jvm.internal.l.a(F8.c.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE23);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE24 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(K8.e.class), new Ia.p<org.koin.core.scope.a, Ob.a, K8.e>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.24
                @Override // Ia.p
                public final K8.e invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.repositories.g((p) single.a(null, null, kotlin.jvm.internal.l.a(p.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE24);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE25 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(J8.g.class), new Ia.p<org.koin.core.scope.a, Ob.a, J8.g>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.25
                @Override // Ia.p
                public final J8.g invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.providers.f();
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE25);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE26 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(K8.t.class), new Ia.p<org.koin.core.scope.a, Ob.a, K8.t>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.26
                @Override // Ia.p
                public final K8.t invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.repositories.v();
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE26);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE27 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(h.class), new Ia.p<org.koin.core.scope.a, Ob.a, h>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.27
                @Override // Ia.p
                public final h invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.providers.g();
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE27);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE28 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(j.class), new Ia.p<org.koin.core.scope.a, Ob.a, j>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.28
                @Override // Ia.p
                public final j invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.providers.i();
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE28);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE29 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(K8.u.class), new Ia.p<org.koin.core.scope.a, Ob.a, K8.u>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.29
                @Override // Ia.p
                public final K8.u invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new w((F8.c) single.a(null, null, kotlin.jvm.internal.l.a(F8.c.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE29);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE30 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(K8.m.class), new Ia.p<org.koin.core.scope.a, Ob.a, K8.m>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.30
                @Override // Ia.p
                public final K8.m invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.repositories.o((com.voltasit.sharednetwork.a) single.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.sharednetwork.a.class)), new A8.y(), (F8.c) single.a(null, null, kotlin.jvm.internal.l.a(F8.c.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE30);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE31 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(q.class), new Ia.p<org.koin.core.scope.a, Ob.a, q>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.31
                @Override // Ia.p
                public final q invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.providers.p((J8.a) single.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)), (com.voltasit.obdeleven.domain.usecases.oca.a) single.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.oca.a.class)), (p) single.a(null, null, kotlin.jvm.internal.l.a(p.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE31);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE32 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(K8.j.class), new Ia.p<org.koin.core.scope.a, Ob.a, K8.j>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.32
                @Override // Ia.p
                public final K8.j invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.repositories.m((com.voltasit.sharednetwork.a) single.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.sharednetwork.a.class)), new A8.m(), (A8.l) single.a(null, null, kotlin.jvm.internal.l.a(A8.l.class)), (K8.b) single.a(null, null, kotlin.jvm.internal.l.a(K8.b.class)), (A8.n) single.a(null, null, kotlin.jvm.internal.l.a(A8.n.class)), (A8.k) single.a(null, null, kotlin.jvm.internal.l.a(A8.k.class)), (F8.c) single.a(null, null, kotlin.jvm.internal.l.a(F8.c.class)), (p) single.a(null, null, kotlin.jvm.internal.l.a(p.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE32);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE33 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(J8.e.class), new Ia.p<org.koin.core.scope.a, Ob.a, J8.e>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.33
                @Override // Ia.p
                public final J8.e invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.providers.d();
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE33);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE34 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(AgreementRepository.class), new Ia.p<org.koin.core.scope.a, Ob.a, AgreementRepository>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.34
                @Override // Ia.p
                public final AgreementRepository invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.repositories.a((com.voltasit.sharednetwork.a) single.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.sharednetwork.a.class)), new C(), new C0605a(), (F8.c) single.a(null, null, kotlin.jvm.internal.l.a(F8.c.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE34);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE35 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(K8.k.class), new Ia.p<org.koin.core.scope.a, Ob.a, K8.k>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.35
                @Override // Ia.p
                public final K8.k invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.repositories.n((com.voltasit.sharednetwork.a) single.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.sharednetwork.a.class)), new A8.p(), (F8.c) single.a(null, null, kotlin.jvm.internal.l.a(F8.c.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE35);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE36 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(p242t9.a.class), new Ia.p<org.koin.core.scope.a, Ob.a, p242t9.a>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.36
                @Override // Ia.p
                public final p242t9.a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new AppResourceProviderImpl((Application) single.a(null, null, kotlin.jvm.internal.l.a(Application.class)), (com.voltasit.obdeleven.domain.usecases.odx.g) single.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.odx.g.class)), new A8.o(), (p) single.a(null, null, kotlin.jvm.internal.l.a(p.class)), (s) single.a(null, null, kotlin.jvm.internal.l.a(s.class)), (com.voltasit.obdeleven.domain.usecases.user.v) single.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.v.class)), (com.voltasit.obdeleven.domain.usecases.odx.b) single.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.odx.b.class)), (com.voltasit.obdeleven.domain.usecases.odx.c) single.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.odx.c.class)), (J8.a) single.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE36);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE37 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(K8.s.class), new Ia.p<org.koin.core.scope.a, Ob.a, K8.s>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.37
                @Override // Ia.p
                public final K8.s invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.repositories.u((com.voltasit.sharednetwork.a) single.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.sharednetwork.a.class)), (K8.b) single.a(null, null, kotlin.jvm.internal.l.a(K8.b.class)), new A8.u(), new A8.v(), (F8.c) single.a(null, null, kotlin.jvm.internal.l.a(F8.c.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE37);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE38 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(K8.d.class), new Ia.p<org.koin.core.scope.a, Ob.a, K8.d>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.38
                @Override // Ia.p
                public final K8.d invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.repositories.e((com.voltasit.sharednetwork.a) single.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.sharednetwork.a.class)), (K8.b) single.a(null, null, kotlin.jvm.internal.l.a(K8.b.class)), (A8.e) single.a(null, null, kotlin.jvm.internal.l.a(A8.e.class)), (A8.h) single.a(null, null, kotlin.jvm.internal.l.a(A8.h.class)), (A8.c) single.a(null, null, kotlin.jvm.internal.l.a(A8.c.class)), (A8.d) single.a(null, null, kotlin.jvm.internal.l.a(A8.d.class)), (F8.c) single.a(null, null, kotlin.jvm.internal.l.a(F8.c.class)), (p) single.a(null, null, kotlin.jvm.internal.l.a(p.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE38);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE39 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(J8.a.class), new Ia.p<org.koin.core.scope.a, Ob.a, J8.a>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.39
                @Override // Ia.p
                public final J8.a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new C2111a((d) single.a(null, null, kotlin.jvm.internal.l.a(d.class)), (p) single.a(null, null, kotlin.jvm.internal.l.a(p.class)), (com.voltasit.obdeleven.data.providers.q) single.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.data.providers.q.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE39);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE40 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(K8.w.class), new Ia.p<org.koin.core.scope.a, Ob.a, K8.w>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.40
                @Override // Ia.p
                public final K8.w invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.repositories.x((K8.b) single.a(null, null, kotlin.jvm.internal.l.a(K8.b.class)), (com.voltasit.sharednetwork.a) single.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.sharednetwork.a.class)), (z) single.a(null, null, kotlin.jvm.internal.l.a(z.class)), (F8.c) single.a(null, null, kotlin.jvm.internal.l.a(F8.c.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE40);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE41 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(BasicSettingStatusTimer.class), new Ia.p<org.koin.core.scope.a, Ob.a, BasicSettingStatusTimer>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.41
                @Override // Ia.p
                public final BasicSettingStatusTimer invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new BasicSettingStatusTimer((p) single.a(null, null, kotlin.jvm.internal.l.a(p.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE41);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE42 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.obdeleven.service.odx.f.class), new Ia.p<org.koin.core.scope.a, Ob.a, com.obdeleven.service.odx.f>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.42
                @Override // Ia.p
                public final com.obdeleven.service.odx.f invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.obdeleven.service.odx.f();
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE42);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE43 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(J8.w.class), new Ia.p<org.koin.core.scope.a, Ob.a, J8.w>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.43
                @Override // Ia.p
                public final J8.w invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.providers.z((Context) single.a(null, null, kotlin.jvm.internal.l.a(Context.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE43);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE44 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(K8.q.class), new Ia.p<org.koin.core.scope.a, Ob.a, K8.q>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.44
                @Override // Ia.p
                public final K8.q invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new ReportRepositoryImpl((v) single.a(null, null, kotlin.jvm.internal.l.a(v.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE44);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE45 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(F8.c.class), new Ia.p<org.koin.core.scope.a, Ob.a, F8.c>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.45
                @Override // Ia.p
                public final F8.c invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new A8.w((p) single.a(null, null, kotlin.jvm.internal.l.a(p.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE45);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE46 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(J8.f.class), new Ia.p<org.koin.core.scope.a, Ob.a, J8.f>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.46
                @Override // Ia.p
                public final J8.f invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.providers.e();
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE46);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE47 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(K8.f.class), new Ia.p<org.koin.core.scope.a, Ob.a, K8.f>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.47
                @Override // Ia.p
                public final K8.f invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.repositories.h((com.voltasit.sharednetwork.a) single.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.sharednetwork.a.class)), (com.voltasit.obdeleven.network.c) single.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.network.c.class)), (A8.j) single.a(null, null, kotlin.jvm.internal.l.a(A8.j.class)), (F8.c) single.a(null, null, kotlin.jvm.internal.l.a(F8.c.class)), (p) single.a(null, null, kotlin.jvm.internal.l.a(p.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE47);
            }
            c cVarA2 = kotlin.jvm.internal.l.a(p084g8.c.class);
            AnonymousClass48 anonymousClass48 = new Ia.p<org.koin.core.scope.a, Ob.a, p084g8.c>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.48
                @Override // Ia.p
                public final p084g8.c invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.repositories.s();
                }
            };
            b bVar2 = Qb.b.f5141c;
            SingleInstanceFactory<?> singleInstanceFactoryE48 = C0936h.e(new BeanDefinition(bVar2, cVarA2, anonymousClass48, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE48);
            }
            EmptyList emptyList2 = EmptyList.f42983b;
            SingleInstanceFactory<?> singleInstanceFactoryE49 = C0936h.e(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(p084g8.a.class), new Ia.p<org.koin.core.scope.a, Ob.a, p084g8.a>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.49
                @Override // Ia.p
                public final p084g8.a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.repositories.i((com.voltasit.sharednetwork.a) single.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.sharednetwork.a.class)), (A8.x) single.a(null, null, kotlin.jvm.internal.l.a(A8.x.class)));
                }
            }, kind, emptyList2), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE49);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE50 = C0936h.e(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(J8.i.class), new Ia.p<org.koin.core.scope.a, Ob.a, J8.i>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.50
                @Override // Ia.p
                public final J8.i invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.providers.h();
                }
            }, kind, emptyList2), module);
            if (module.a()) {
                module.c(singleInstanceFactoryE50);
            }
            b bVarA = Qb.b.a.a();
            Kind kind2 = Kind.f45760b;
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(bVarA, kotlin.jvm.internal.l.a(J8.l.class), new Ia.p<org.koin.core.scope.a, Ob.a, J8.l>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.51
                @Override // Ia.p
                public final J8.l invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.providers.k();
                }
            }, kind2, kotlin.collections.l.q()));
            module.b(singleInstanceFactory);
            if (module.a()) {
                module.c(singleInstanceFactory);
            }
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(new BeanDefinition(Qb.b.a.a(), kotlin.jvm.internal.l.a(K8.i.class), new Ia.p<org.koin.core.scope.a, Ob.a, K8.i>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.52
                @Override // Ia.p
                public final K8.i invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.providers.o();
                }
            }, kind2, kotlin.collections.l.q()));
            module.b(singleInstanceFactory2);
            if (module.a()) {
                module.c(singleInstanceFactory2);
            }
            SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(new BeanDefinition(Qb.b.a.a(), kotlin.jvm.internal.l.a(J8.v.class), new Ia.p<org.koin.core.scope.a, Ob.a, J8.v>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.53
                @Override // Ia.p
                public final J8.v invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.providers.y((p) single.a(null, null, kotlin.jvm.internal.l.a(p.class)), (v) single.a(null, null, kotlin.jvm.internal.l.a(v.class)));
                }
            }, kind2, kotlin.collections.l.q()));
            module.b(singleInstanceFactory3);
            if (module.a()) {
                module.c(singleInstanceFactory3);
            }
            SingleInstanceFactory<?> singleInstanceFactory4 = new SingleInstanceFactory<>(new BeanDefinition(Qb.b.a.a(), kotlin.jvm.internal.l.a(J8.k.class), new Ia.p<org.koin.core.scope.a, Ob.a, J8.k>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.54
                @Override // Ia.p
                public final J8.k invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.providers.j((d) single.a(null, null, kotlin.jvm.internal.l.a(d.class)), (p) single.a(null, null, kotlin.jvm.internal.l.a(p.class)));
                }
            }, kind2, kotlin.collections.l.q()));
            module.b(singleInstanceFactory4);
            if (module.a()) {
                module.c(singleInstanceFactory4);
            }
            SingleInstanceFactory<?> singleInstanceFactory5 = new SingleInstanceFactory<>(new BeanDefinition(Qb.b.a.a(), kotlin.jvm.internal.l.a(p109i8.g.class), new Ia.p<org.koin.core.scope.a, Ob.a, p109i8.g>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.55
                @Override // Ia.p
                public final p109i8.g invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new ControlUnitRepositoryWrapperImpl((K8.d) single.a(null, null, kotlin.jvm.internal.l.a(K8.d.class)), (com.voltasit.obdeleven.domain.usecases.vehicle.h) single.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.h.class)), (com.voltasit.obdeleven.domain.usecases.vehicle.g) single.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.g.class)), (com.voltasit.obdeleven.domain.usecases.vehicle.i) single.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.i.class)), (K8.c) single.a(null, null, kotlin.jvm.internal.l.a(K8.c.class)));
                }
            }, kind2, kotlin.collections.l.q()));
            module.b(singleInstanceFactory5);
            if (module.a()) {
                module.c(singleInstanceFactory5);
            }
            SingleInstanceFactory<?> singleInstanceFactory6 = new SingleInstanceFactory<>(new BeanDefinition(Qb.b.a.a(), kotlin.jvm.internal.l.a(K8.c.class), new Ia.p<org.koin.core.scope.a, Ob.a, K8.c>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.56
                @Override // Ia.p
                public final K8.c invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.repositories.d();
                }
            }, kind2, kotlin.collections.l.q()));
            module.b(singleInstanceFactory6);
            if (module.a()) {
                module.c(singleInstanceFactory6);
            }
            SingleInstanceFactory<?> singleInstanceFactory7 = new SingleInstanceFactory<>(new BeanDefinition(Qb.b.a.a(), kotlin.jvm.internal.l.a(J8.n.class), new Ia.p<org.koin.core.scope.a, Ob.a, J8.n>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.57
                @Override // Ia.p
                public final J8.n invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.providers.l((o) single.a(null, null, kotlin.jvm.internal.l.a(o.class)));
                }
            }, kind2, kotlin.collections.l.q()));
            module.b(singleInstanceFactory7);
            if (module.a()) {
                module.c(singleInstanceFactory7);
            }
            SingleInstanceFactory<?> singleInstanceFactory8 = new SingleInstanceFactory<>(new BeanDefinition(Qb.b.a.a(), kotlin.jvm.internal.l.a(K8.a.class), new Ia.p<org.koin.core.scope.a, Ob.a, K8.a>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.58
                @Override // Ia.p
                public final K8.a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.repositories.b((K8.b) single.a(null, null, kotlin.jvm.internal.l.a(K8.b.class)), (com.voltasit.sharednetwork.a) single.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.sharednetwork.a.class)), new F8.a(), (F8.c) single.a(null, null, kotlin.jvm.internal.l.a(F8.c.class)));
                }
            }, kind2, kotlin.collections.l.q()));
            module.b(singleInstanceFactory8);
            if (module.a()) {
                module.c(singleInstanceFactory8);
            }
            SingleInstanceFactory<?> singleInstanceFactory9 = new SingleInstanceFactory<>(new BeanDefinition(Qb.b.a.a(), kotlin.jvm.internal.l.a(K8.h.class), new Ia.p<org.koin.core.scope.a, Ob.a, K8.h>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.59
                @Override // Ia.p
                public final K8.h invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.repositories.j((F8.c) single.a(null, null, kotlin.jvm.internal.l.a(F8.c.class)), (p) single.a(null, null, kotlin.jvm.internal.l.a(p.class)));
                }
            }, kind2, kotlin.collections.l.q()));
            module.b(singleInstanceFactory9);
            if (module.a()) {
                module.c(singleInstanceFactory9);
            }
            SingleInstanceFactory<?> singleInstanceFactory10 = new SingleInstanceFactory<>(new BeanDefinition(Qb.b.a.a(), kotlin.jvm.internal.l.a(J8.t.class), new Ia.p<org.koin.core.scope.a, Ob.a, J8.t>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.60
                @Override // Ia.p
                public final J8.t invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new RemoteConfigCoreProviderImpl((p) single.a(null, null, kotlin.jvm.internal.l.a(p.class)));
                }
            }, kind2, kotlin.collections.l.q()));
            module.b(singleInstanceFactory10);
            if (module.a()) {
                module.c(singleInstanceFactory10);
            }
            SingleInstanceFactory<?> singleInstanceFactory11 = new SingleInstanceFactory<>(new BeanDefinition(Qb.b.a.a(), kotlin.jvm.internal.l.a(J8.u.class), new Ia.p<org.koin.core.scope.a, Ob.a, J8.u>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.61
                @Override // Ia.p
                public final J8.u invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.providers.x((J8.t) single.a(null, null, kotlin.jvm.internal.l.a(J8.t.class)));
                }
            }, kind2, kotlin.collections.l.q()));
            module.b(singleInstanceFactory11);
            if (module.a()) {
                module.c(singleInstanceFactory11);
            }
            SingleInstanceFactory<?> singleInstanceFactory12 = new SingleInstanceFactory<>(new BeanDefinition(Qb.b.a.a(), kotlin.jvm.internal.l.a(VagProRedirectPromoPresenter.class), new Ia.p<org.koin.core.scope.a, Ob.a, VagProRedirectPromoPresenter>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.62
                @Override // Ia.p
                public final VagProRedirectPromoPresenter invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new VagProRedirectPromoPresenter((J8.a) single.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)), (J8.u) single.a(null, null, kotlin.jvm.internal.l.a(J8.u.class)), (d) single.a(null, null, kotlin.jvm.internal.l.a(d.class)));
                }
            }, kind2, kotlin.collections.l.q()));
            module.b(singleInstanceFactory12);
            if (module.a()) {
                module.c(singleInstanceFactory12);
            }
            SingleInstanceFactory<?> singleInstanceFactory13 = new SingleInstanceFactory<>(new BeanDefinition(Qb.b.a.a(), kotlin.jvm.internal.l.a(com.voltasit.obdeleven.data.providers.q.class), new Ia.p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.data.providers.q>() { // from class: com.voltasit.obdeleven.common.AppModuleSinglesKt$appModuleSingles$1.63
                @Override // Ia.p
                public final com.voltasit.obdeleven.data.providers.q invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.data.providers.q((Context) single.a(null, null, kotlin.jvm.internal.l.a(Context.class)));
                }
            }, kind2, kotlin.collections.l.q()));
            module.b(singleInstanceFactory13);
            if (module.a()) {
                module.c(singleInstanceFactory13);
            }
            return r.f47939a;
        }
    });
}
