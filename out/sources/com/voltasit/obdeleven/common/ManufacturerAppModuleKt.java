package com.voltasit.obdeleven.common;

import A8.k;
import A8.n;
import Ia.l;
import Ia.p;
import J8.d;
import J8.x;
import K8.b;
import K8.j;
import Nb.a;
import V8.E;
import androidx.compose.foundation.C0936h;
import com.google.android.gms.internal.measurement.C1787c0;
import com.voltasit.obdeleven.data.providers.BluetoothProviderImpl;
import com.voltasit.obdeleven.data.repositories.m;
import com.voltasit.obdeleven.data.repositories.t;
import com.voltasit.obdeleven.domain.usecases.C2112a;
import com.voltasit.obdeleven.domain.usecases.controlUnit.connect.A;
import com.voltasit.obdeleven.domain.usecases.controlUnit.connect.C2115a;
import com.voltasit.obdeleven.domain.usecases.controlUnit.connect.h;
import com.voltasit.obdeleven.domain.usecases.controlUnit.connect.o;
import com.voltasit.obdeleven.domain.usecases.controlUnit.connect.u;
import com.voltasit.obdeleven.domain.usecases.controlUnit.connect.v;
import com.voltasit.obdeleven.domain.usecases.controlUnit.connect.w;
import com.voltasit.obdeleven.domain.usecases.controlUnit.connect.y;
import com.voltasit.obdeleven.domain.usecases.controlUnit.connect.z;
import com.voltasit.obdeleven.domain.usecases.device.B;
import com.voltasit.obdeleven.domain.usecases.device.C2116a;
import com.voltasit.obdeleven.domain.usecases.device.C2118c;
import com.voltasit.obdeleven.domain.usecases.device.requests.e;
import com.voltasit.obdeleven.domain.usecases.device.requests.f;
import com.voltasit.obdeleven.domain.usecases.device.requests.g;
import com.voltasit.obdeleven.domain.usecases.device.s;
import com.voltasit.obdeleven.domain.usecases.user.GetUserDetailsUC;
import com.voltasit.obdeleven.domain.usecases.vehicle.q;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.c;
import kotlin.jvm.internal.i;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.error.NoBeanDefFoundException;
import org.koin.core.instance.SingleInstanceFactory;
import p293xa.r;

/* JADX INFO: compiled from: ManufacturerAppModule.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ManufacturerAppModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f29934a = C1787c0.p(new l<a, r>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1
        @Override // Ia.l
        public final r invoke(a aVar) {
            a module = aVar;
            i.e(module, "$this$module");
            Kind kind = Kind.f45760b;
            EmptyList emptyList = EmptyList.f42983b;
            c cVarA = kotlin.jvm.internal.l.a(j.class);
            AnonymousClass1 anonymousClass1 = new p<org.koin.core.scope.a, Ob.a, j>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.1
                @Override // Ia.p
                public final j invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new m((com.voltasit.sharednetwork.a) single.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.sharednetwork.a.class)), new A8.m(), (A8.l) single.a(null, null, kotlin.jvm.internal.l.a(A8.l.class)), (b) single.a(null, null, kotlin.jvm.internal.l.a(b.class)), (n) single.a(null, null, kotlin.jvm.internal.l.a(n.class)), (k) single.a(null, null, kotlin.jvm.internal.l.a(k.class)), (F8.c) single.a(null, null, kotlin.jvm.internal.l.a(F8.c.class)), (J8.p) single.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            };
            Pb.b bVar = Qb.b.f5141c;
            SingleInstanceFactory<?> singleInstanceFactoryE = C0936h.e(new BeanDefinition(bVar, cVarA, anonymousClass1, kind, emptyList), module);
            boolean z10 = module.f4702a;
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE2 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(J8.c.class), new p<org.koin.core.scope.a, Ob.a, J8.c>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.2
                @Override // Ia.p
                public final J8.c invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new BluetoothProviderImpl((d) single.a(null, null, kotlin.jvm.internal.l.a(d.class)), (J8.p) single.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (F8.c) single.a(null, null, kotlin.jvm.internal.l.a(F8.c.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE2);
            }
            SingleInstanceFactory<?> singleInstanceFactoryE3 = C0936h.e(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(K8.r.class), new p<org.koin.core.scope.a, Ob.a, K8.r>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.3
                @Override // Ia.p
                public final K8.r invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a single = aVar2;
                    Ob.a it = aVar3;
                    i.e(single, "$this$single");
                    i.e(it, "it");
                    return new t((com.voltasit.sharednetwork.a) single.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.sharednetwork.a.class)), (F8.c) single.a(null, null, kotlin.jvm.internal.l.a(F8.c.class)), (J8.i) single.a(null, null, kotlin.jvm.internal.l.a(J8.i.class)));
                }
            }, kind, emptyList), module);
            if (z10) {
                module.f4704c.add(singleInstanceFactoryE3);
            }
            Kind kind2 = Kind.f45761c;
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.k.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.device.k>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.4
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.device.k invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.device.k((h) factory.a(null, null, kotlin.jvm.internal.l.a(h.class)), (com.voltasit.obdeleven.domain.usecases.device.requests.d) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.requests.d.class)), (e) factory.a(null, null, kotlin.jvm.internal.l.a(e.class)), (g) factory.a(null, null, kotlin.jvm.internal.l.a(g.class)), (u) factory.a(null, null, kotlin.jvm.internal.l.a(u.class)), (f) factory.a(null, null, kotlin.jvm.internal.l.a(f.class)), (com.voltasit.obdeleven.domain.usecases.device.requests.h) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.requests.h.class)), (J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (com.voltasit.obdeleven.domain.usecases.controlUnit.a) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.a.class)), (A) factory.a(null, null, kotlin.jvm.internal.l.a(A.class)), (J8.a) factory.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.connect.c.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.controlUnit.connect.c>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.5
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.controlUnit.connect.c invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.controlUnit.connect.c((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (p084g8.c) factory.a(null, null, kotlin.jvm.internal.l.a(p084g8.c.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(h.class), new p<org.koin.core.scope.a, Ob.a, h>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.6
                @Override // Ia.p
                public final h invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new h((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (x) factory.a(null, null, kotlin.jvm.internal.l.a(x.class)), (com.voltasit.obdeleven.domain.usecases.controlUnit.connect.e) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.connect.e.class)), (w) factory.a(null, null, kotlin.jvm.internal.l.a(w.class)), (v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)), (com.voltasit.obdeleven.domain.usecases.controlUnit.connect.l) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.connect.l.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.connect.l.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.controlUnit.connect.l>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.7
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.controlUnit.connect.l invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.controlUnit.connect.l((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (com.voltasit.obdeleven.domain.usecases.device.w) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.w.class)), (com.voltasit.obdeleven.domain.usecases.controlUnit.connect.t) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.connect.t.class)), (p084g8.c) factory.a(null, null, kotlin.jvm.internal.l.a(p084g8.c.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(o.class), new p<org.koin.core.scope.a, Ob.a, o>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.8
                @Override // Ia.p
                public final o invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new o((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (p084g8.c) factory.a(null, null, kotlin.jvm.internal.l.a(p084g8.c.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.connect.t.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.controlUnit.connect.t>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.9
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.controlUnit.connect.t invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.controlUnit.connect.t((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(u.class), new p<org.koin.core.scope.a, Ob.a, u>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.10
                @Override // Ia.p
                public final u invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new u((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (com.voltasit.obdeleven.domain.usecases.controlUnit.connect.c) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.connect.c.class)), (com.voltasit.obdeleven.domain.usecases.controlUnit.connect.d) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.connect.d.class)), (o) factory.a(null, null, kotlin.jvm.internal.l.a(o.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(v.class), new p<org.koin.core.scope.a, Ob.a, v>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.11
                @Override // Ia.p
                public final v invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new v((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (com.voltasit.obdeleven.domain.usecases.device.w) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.w.class)), (s) factory.a(null, null, kotlin.jvm.internal.l.a(s.class)), (com.voltasit.obdeleven.domain.usecases.device.r) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.r.class)), (com.voltasit.obdeleven.domain.usecases.controlUnit.connect.t) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.connect.t.class)), (com.voltasit.obdeleven.domain.usecases.device.p) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.p.class)), (p084g8.c) factory.a(null, null, kotlin.jvm.internal.l.a(p084g8.c.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(w.class), new p<org.koin.core.scope.a, Ob.a, w>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.12
                @Override // Ia.p
                public final w invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new w((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (com.voltasit.obdeleven.domain.usecases.device.w) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.w.class)), (s) factory.a(null, null, kotlin.jvm.internal.l.a(s.class)), (com.voltasit.obdeleven.domain.usecases.device.p) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.p.class)), (p084g8.c) factory.a(null, null, kotlin.jvm.internal.l.a(p084g8.c.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.connect.e.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.controlUnit.connect.e>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.13
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.controlUnit.connect.e invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.controlUnit.connect.e((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (com.voltasit.obdeleven.domain.usecases.device.w) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.w.class)), (y) factory.a(null, null, kotlin.jvm.internal.l.a(y.class)), (com.voltasit.obdeleven.domain.usecases.controlUnit.connect.x) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.connect.x.class)), (p084g8.c) factory.a(null, null, kotlin.jvm.internal.l.a(p084g8.c.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.requests.a.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.device.requests.a>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.14
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.device.requests.a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.device.requests.a((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.requests.b.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.device.requests.b>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.15
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.device.requests.b invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.device.requests.b((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (com.voltasit.obdeleven.domain.usecases.device.p) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.p.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.requests.c.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.device.requests.c>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.16
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.device.requests.c invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.device.requests.c((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (com.voltasit.obdeleven.domain.usecases.device.p) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.p.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.requests.d.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.device.requests.d>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.17
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.device.requests.d invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.device.requests.d((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (com.voltasit.obdeleven.domain.usecases.device.p) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.p.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(e.class), new p<org.koin.core.scope.a, Ob.a, e>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.18
                @Override // Ia.p
                public final e invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new e((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (com.voltasit.obdeleven.domain.usecases.device.requests.b) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.requests.b.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(f.class), new p<org.koin.core.scope.a, Ob.a, f>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.19
                @Override // Ia.p
                public final f invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new f((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (com.voltasit.obdeleven.domain.usecases.device.requests.c) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.requests.c.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(g.class), new p<org.koin.core.scope.a, Ob.a, g>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.20
                @Override // Ia.p
                public final g invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new g((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (com.voltasit.obdeleven.domain.usecases.device.requests.c) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.requests.c.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.requests.h.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.device.requests.h>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.21
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.device.requests.h invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.device.requests.h();
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.j.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.device.j>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.22
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.device.j invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.device.j((K8.o) factory.a(null, null, kotlin.jvm.internal.l.a(K8.o.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(q.class), new p<org.koin.core.scope.a, Ob.a, q>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.23
                @Override // Ia.p
                public final q invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new q((x) factory.a(null, null, kotlin.jvm.internal.l.a(x.class)), (J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.w.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.device.w>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.24
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.device.w invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.device.w((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.v.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.device.v>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.25
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.device.v invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.device.v();
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.u.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.device.u>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.26
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.device.u invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.device.u();
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.t.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.device.t>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.27
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.device.t invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.device.t((com.voltasit.obdeleven.domain.usecases.device.o) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.o.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(s.class), new p<org.koin.core.scope.a, Ob.a, s>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.28
                @Override // Ia.p
                public final s invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new s((com.voltasit.obdeleven.domain.usecases.device.o) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.o.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.r.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.device.r>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.29
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.device.r invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.device.r();
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.p.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.device.p>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.30
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.device.p invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.device.p((p084g8.c) factory.a(null, null, kotlin.jvm.internal.l.a(p084g8.c.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.o.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.device.o>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.31
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.device.o invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.device.o();
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(y.class), new p<org.koin.core.scope.a, Ob.a, y>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.32
                @Override // Ia.p
                public final y invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new y((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (s) factory.a(null, null, kotlin.jvm.internal.l.a(s.class)), (com.voltasit.obdeleven.domain.usecases.device.t) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.t.class)), (z) factory.a(null, null, kotlin.jvm.internal.l.a(z.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.connect.x.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.controlUnit.connect.x>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.33
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.controlUnit.connect.x invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.controlUnit.connect.x((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (s) factory.a(null, null, kotlin.jvm.internal.l.a(s.class)), (com.voltasit.obdeleven.domain.usecases.device.t) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.t.class)), (z) factory.a(null, null, kotlin.jvm.internal.l.a(z.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(z.class), new p<org.koin.core.scope.a, Ob.a, z>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.34
                @Override // Ia.p
                public final z invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new z();
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(A.class), new p<org.koin.core.scope.a, Ob.a, A>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.35
                @Override // Ia.p
                public final A invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new A((x) factory.a(null, null, kotlin.jvm.internal.l.a(x.class)), (J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (p084g8.c) factory.a(null, null, kotlin.jvm.internal.l.a(p084g8.c.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.odx.c.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.odx.c>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.36
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.odx.c invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.odx.c();
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(C2118c.class), new p<org.koin.core.scope.a, Ob.a, C2118c>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.37
                @Override // Ia.p
                public final C2118c invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new C2118c((d) factory.a(null, null, kotlin.jvm.internal.l.a(d.class)), (J8.c) factory.a(null, null, kotlin.jvm.internal.l.a(J8.c.class)), (J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (C2116a) factory.a(null, null, kotlin.jvm.internal.l.a(C2116a.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(B.class), new p<org.koin.core.scope.a, Ob.a, B>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.38
                @Override // Ia.p
                public final B invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new B((K8.o) factory.a(null, null, kotlin.jvm.internal.l.a(K8.o.class)), (J8.c) factory.a(null, null, kotlin.jvm.internal.l.a(J8.c.class)), (C2116a) factory.a(null, null, kotlin.jvm.internal.l.a(C2116a.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(C2116a.class), new p<org.koin.core.scope.a, Ob.a, C2116a>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.39
                @Override // Ia.p
                public final C2116a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new C2116a((K8.o) factory.a(null, null, kotlin.jvm.internal.l.a(K8.o.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.i.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.device.i>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.40
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.device.i invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.device.i();
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.g.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.controlUnit.g>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.41
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.controlUnit.g invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.controlUnit.g((C2112a) factory.a(null, null, kotlin.jvm.internal.l.a(C2112a.class)), (p084g8.c) factory.a(null, null, kotlin.jvm.internal.l.a(p084g8.c.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.f.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.controlUnit.f>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.42
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.controlUnit.f invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.controlUnit.f((C2112a) factory.a(null, null, kotlin.jvm.internal.l.a(C2112a.class)), (p084g8.c) factory.a(null, null, kotlin.jvm.internal.l.a(p084g8.c.class)), (J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.sfd.a.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.sfd.a>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.43
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.sfd.a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.sfd.a((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (com.voltasit.obdeleven.domain.usecases.controlUnit.connect.f) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.connect.f.class)), (com.voltasit.obdeleven.domain.usecases.sfd.b) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.sfd.b.class)), (com.voltasit.obdeleven.domain.usecases.sfd.d) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.sfd.d.class)), (J8.a) factory.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)), (x) factory.a(null, null, kotlin.jvm.internal.l.a(x.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.sfd.f.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.sfd.f>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.44
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.sfd.f invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.sfd.f((com.voltasit.obdeleven.domain.usecases.controlUnit.g) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.g.class)), (J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.sfd.b.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.sfd.b>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.45
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.sfd.b invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.sfd.b((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (K8.l) factory.a(null, null, kotlin.jvm.internal.l.a(K8.l.class)), (com.voltasit.obdeleven.domain.usecases.controlUnit.f) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.f.class)), (x) factory.a(null, null, kotlin.jvm.internal.l.a(x.class)), (com.voltasit.obdeleven.domain.usecases.controlUnit.connect.f) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.connect.f.class)));
                }
            }, kind2, emptyList)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.sfd.d.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.sfd.d>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.46
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.sfd.d invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.sfd.d((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (com.voltasit.obdeleven.domain.usecases.controlUnit.f) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.f.class)), (J8.f) factory.a(null, null, kotlin.jvm.internal.l.a(J8.f.class)), (com.voltasit.obdeleven.domain.usecases.controlUnit.connect.f) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.connect.f.class)));
                }
            }, kind2, emptyList)));
            c cVarA2 = kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.sfd.c.class);
            AnonymousClass47 anonymousClass47 = new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.sfd.c>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.47
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.sfd.c invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.sfd.c((com.voltasit.obdeleven.domain.usecases.controlUnit.g) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.g.class)), (J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            };
            Pb.b bVar2 = Qb.b.f5141c;
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, cVarA2, anonymousClass47, kind2, emptyList)));
            EmptyList emptyList2 = EmptyList.f42983b;
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.sfd.i.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.sfd.i>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.48
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.sfd.i invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.sfd.i((com.voltasit.obdeleven.domain.usecases.controlUnit.g) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.g.class)), (J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind2, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.sfd.j.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.sfd.j>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.49
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.sfd.j invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.sfd.j((com.voltasit.obdeleven.domain.usecases.controlUnit.connect.f) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.connect.f.class)), (com.voltasit.obdeleven.domain.usecases.sfd.h) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.sfd.h.class)), (J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind2, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(C2112a.class), new p<org.koin.core.scope.a, Ob.a, C2112a>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.50
                @Override // Ia.p
                public final C2112a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new C2112a((p084g8.c) factory.a(null, null, kotlin.jvm.internal.l.a(p084g8.c.class)));
                }
            }, kind2, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.connect.i.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.controlUnit.connect.i>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.51
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.controlUnit.connect.i invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.controlUnit.connect.i((p084g8.c) factory.a(null, null, kotlin.jvm.internal.l.a(p084g8.c.class)));
                }
            }, kind2, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.connect.f.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.controlUnit.connect.f>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.52
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.controlUnit.connect.f invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.controlUnit.connect.f((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (x) factory.a(null, null, kotlin.jvm.internal.l.a(x.class)), (com.voltasit.obdeleven.domain.usecases.controlUnit.connect.g) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.connect.g.class)), (A8.g) factory.a(null, null, kotlin.jvm.internal.l.a(A8.g.class)));
                }
            }, kind2, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.connect.g.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.controlUnit.connect.g>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.53
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.controlUnit.connect.g invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.controlUnit.connect.g((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (com.voltasit.obdeleven.domain.usecases.controlUnit.connect.e) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.connect.e.class)), (w) factory.a(null, null, kotlin.jvm.internal.l.a(w.class)), (v) factory.a(null, null, kotlin.jvm.internal.l.a(v.class)), (com.voltasit.obdeleven.domain.usecases.controlUnit.connect.i) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.connect.i.class)), (com.voltasit.obdeleven.domain.usecases.controlUnit.connect.c) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.connect.c.class)), (com.voltasit.obdeleven.domain.usecases.controlUnit.connect.d) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.connect.d.class)), (com.voltasit.obdeleven.domain.usecases.controlUnit.connect.s) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.connect.s.class)), (x) factory.a(null, null, kotlin.jvm.internal.l.a(x.class)));
                }
            }, kind2, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.connect.s.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.controlUnit.connect.s>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.54
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.controlUnit.connect.s invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.controlUnit.connect.s((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (p084g8.c) factory.a(null, null, kotlin.jvm.internal.l.a(p084g8.c.class)));
                }
            }, kind2, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.oca.f.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.oca.f>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.55
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.oca.f invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.oca.f((j) factory.a(null, null, kotlin.jvm.internal.l.a(j.class)), (com.voltasit.obdeleven.domain.usecases.oca.i) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.oca.i.class)), (J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind2, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.oca.a.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.oca.a>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.56
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.oca.a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.oca.a((j) factory.a(null, null, kotlin.jvm.internal.l.a(j.class)), (x) factory.a(null, null, kotlin.jvm.internal.l.a(x.class)), (J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind2, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.oca.h.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.oca.h>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.57
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.oca.h invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.oca.h((com.voltasit.obdeleven.domain.usecases.sfd.e) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.sfd.e.class)), (J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind2, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.sfd.e.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.sfd.e>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.58
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.sfd.e invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.sfd.e((K8.v) factory.a(null, null, kotlin.jvm.internal.l.a(K8.v.class)), (com.voltasit.obdeleven.domain.usecases.user.h) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.h.class)), (com.voltasit.obdeleven.domain.usecases.user.k) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.k.class)), (com.voltasit.obdeleven.domain.usecases.user.n) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.n.class)));
                }
            }, kind2, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.sfd.g.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.sfd.g>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.59
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.sfd.g invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.sfd.g((J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (com.voltasit.obdeleven.domain.usecases.controlUnit.connect.f) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.connect.f.class)), (com.voltasit.obdeleven.domain.usecases.sfd.f) factory.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.sfd.f.class)));
                }
            }, kind2, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.user.n.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.user.n>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.60
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.user.n invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.user.n((J8.f) factory.a(null, null, kotlin.jvm.internal.l.a(J8.f.class)));
                }
            }, kind2, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.oca.i.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.oca.i>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.61
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.oca.i invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.domain.usecases.oca.i((j) factory.a(null, null, kotlin.jvm.internal.l.a(j.class)), (x) factory.a(null, null, kotlin.jvm.internal.l.a(x.class)), (J8.p) factory.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind2, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.z.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.z>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1$invoke$$inlined$factoryOf$default$1
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.z invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) throws NoBeanDefFoundException {
                    org.koin.core.scope.a aVar4 = aVar2;
                    Object objA = aVar4.a(null, null, C4.a.j(aVar4, "$this$factory", aVar3, "it", com.voltasit.obdeleven.domain.usecases.sfd.e.class));
                    Object objA2 = aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.sfd.h.class));
                    Object objA3 = aVar4.a(null, null, kotlin.jvm.internal.l.a(h.class));
                    Object objA4 = aVar4.a(null, null, kotlin.jvm.internal.l.a(K8.d.class));
                    Object objA5 = aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.h.class));
                    Object objA6 = aVar4.a(null, null, kotlin.jvm.internal.l.a(J8.p.class));
                    Object objA7 = aVar4.a(null, null, kotlin.jvm.internal.l.a(A.class));
                    Object objA8 = aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.x.class));
                    return new com.voltasit.obdeleven.domain.usecases.z((com.voltasit.obdeleven.domain.usecases.sfd.e) objA, (com.voltasit.obdeleven.domain.usecases.sfd.h) objA2, (h) objA3, (K8.d) objA4, (com.voltasit.obdeleven.domain.usecases.controlUnit.h) objA5, (J8.p) objA6, (A) objA7, (com.voltasit.obdeleven.domain.usecases.x) objA8, (J8.a) aVar4.a(null, null, kotlin.jvm.internal.l.a(J8.a.class)), (x) aVar4.a(null, null, kotlin.jvm.internal.l.a(x.class)));
                }
            }, kind2, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.h.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.controlUnit.h>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1$invoke$$inlined$factoryOf$default$2
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.controlUnit.h invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) throws NoBeanDefFoundException {
                    org.koin.core.scope.a aVar4 = aVar2;
                    Object objA = aVar4.a(null, null, C4.a.j(aVar4, "$this$factory", aVar3, "it", C2112a.class));
                    return new com.voltasit.obdeleven.domain.usecases.controlUnit.h((C2112a) objA, (p084g8.c) aVar4.a(null, null, kotlin.jvm.internal.l.a(p084g8.c.class)), (J8.p) aVar4.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind2, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.sfd.h.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.sfd.h>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1$invoke$$inlined$factoryOf$default$3
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.sfd.h invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) throws NoBeanDefFoundException {
                    org.koin.core.scope.a aVar4 = aVar2;
                    Object objA = aVar4.a(null, null, C4.a.j(aVar4, "$this$factory", aVar3, "it", com.voltasit.obdeleven.domain.usecases.sfd.c.class));
                    Object objA2 = aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.sfd.i.class));
                    Object objA3 = aVar4.a(null, null, kotlin.jvm.internal.l.a(K8.r.class));
                    Object objA4 = aVar4.a(null, null, kotlin.jvm.internal.l.a(x.class));
                    Object objA5 = aVar4.a(null, null, kotlin.jvm.internal.l.a(J8.a.class));
                    return new com.voltasit.obdeleven.domain.usecases.sfd.h((com.voltasit.obdeleven.domain.usecases.sfd.c) objA, (com.voltasit.obdeleven.domain.usecases.sfd.i) objA2, (K8.r) objA3, (x) objA4, (J8.a) objA5, (J8.p) aVar4.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)), (J8.f) aVar4.a(null, null, kotlin.jvm.internal.l.a(J8.f.class)));
                }
            }, kind2, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.x.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.x>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1$invoke$$inlined$factoryOf$default$4
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.x invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) throws NoBeanDefFoundException {
                    org.koin.core.scope.a aVar4 = aVar2;
                    Object objA = aVar4.a(null, null, C4.a.j(aVar4, "$this$factory", aVar3, "it", x.class));
                    return new com.voltasit.obdeleven.domain.usecases.x((x) objA, (com.voltasit.obdeleven.domain.usecases.controlUnit.f) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.f.class)), (J8.p) aVar4.a(null, null, kotlin.jvm.internal.l.a(J8.p.class)));
                }
            }, kind2, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.controlUnit.connect.d.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.domain.usecases.controlUnit.connect.d>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1$invoke$$inlined$factoryOf$default$5
                @Override // Ia.p
                public final com.voltasit.obdeleven.domain.usecases.controlUnit.connect.d invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) throws NoBeanDefFoundException {
                    org.koin.core.scope.a aVar4 = aVar2;
                    Object objA = aVar4.a(null, null, C4.a.j(aVar4, "$this$factory", aVar3, "it", J8.p.class));
                    Object objA2 = aVar4.a(null, null, kotlin.jvm.internal.l.a(p084g8.c.class));
                    Object objA3 = aVar4.a(null, null, kotlin.jvm.internal.l.a(s.class));
                    Object objA4 = aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.t.class));
                    return new com.voltasit.obdeleven.domain.usecases.controlUnit.connect.d((J8.p) objA, (p084g8.c) objA2, (s) objA3, (com.voltasit.obdeleven.domain.usecases.device.t) objA4, (C2115a) aVar4.a(null, null, kotlin.jvm.internal.l.a(C2115a.class)), (com.voltasit.obdeleven.domain.usecases.device.w) aVar4.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.device.w.class)));
                }
            }, kind2, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(C2115a.class), new p<org.koin.core.scope.a, Ob.a, C2115a>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1$invoke$$inlined$factoryOf$default$6
                @Override // Ia.p
                public final C2115a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a factory = aVar2;
                    Ob.a it = aVar3;
                    i.e(factory, "$this$factory");
                    i.e(it, "it");
                    return new C2115a();
                }
            }, kind2, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(V8.i.class), new p<org.koin.core.scope.a, Ob.a, V8.i>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.68
                @Override // Ia.p
                public final V8.i invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new V8.i();
                }
            }, kind2, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(E.class), new p<org.koin.core.scope.a, Ob.a, E>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.69
                @Override // Ia.p
                public final E invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new E();
                }
            }, kind2, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.controlUnit.basicsettings.a.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.controlUnit.basicsettings.a>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.70
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.controlUnit.basicsettings.a invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.presentation.controlUnit.basicsettings.a((GetUserDetailsUC) viewModel.a(null, null, kotlin.jvm.internal.l.a(GetUserDetailsUC.class)));
                }
            }, kind2, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.controlUnit.eeprom.h.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.controlUnit.eeprom.h>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.71
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.controlUnit.eeprom.h invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.presentation.controlUnit.eeprom.h((com.voltasit.obdeleven.domain.usecases.vehicle.l) viewModel.a(null, null, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.domain.usecases.vehicle.l.class)));
                }
            }, kind2, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.controlUnit.sfd.unlock.b.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.controlUnit.sfd.unlock.b>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.72
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.controlUnit.sfd.unlock.b invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.presentation.controlUnit.sfd.unlock.b((K8.o) viewModel.a(null, null, kotlin.jvm.internal.l.a(K8.o.class)));
                }
            }, kind2, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.history.child.d.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.history.child.d>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.73
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.history.child.d invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.presentation.history.child.d();
                }
            }, kind2, emptyList2)));
            module.b(new org.koin.core.instance.a(new BeanDefinition(bVar2, kotlin.jvm.internal.l.a(com.voltasit.obdeleven.presentation.history.vehicle.l.class), new p<org.koin.core.scope.a, Ob.a, com.voltasit.obdeleven.presentation.history.vehicle.l>() { // from class: com.voltasit.obdeleven.common.ManufacturerAppModuleKt$manufacturerModule$1.74
                @Override // Ia.p
                public final com.voltasit.obdeleven.presentation.history.vehicle.l invoke(org.koin.core.scope.a aVar2, Ob.a aVar3) {
                    org.koin.core.scope.a viewModel = aVar2;
                    Ob.a it = aVar3;
                    i.e(viewModel, "$this$viewModel");
                    i.e(it, "it");
                    return new com.voltasit.obdeleven.presentation.history.vehicle.l((F8.c) viewModel.a(null, null, kotlin.jvm.internal.l.a(F8.c.class)));
                }
            }, kind2, emptyList2)));
            return r.f47939a;
        }
    });
}
