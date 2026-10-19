package com.google.firebase.concurrent;

import A1.C0575j;
import A1.C0576k;
import A8.A;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import p217r6.b;
import p217r6.c;
import p217r6.d;
import p228s6.a;
import p228s6.l;
import p228s6.p;
import p240t6.j;
import p240t6.k;
import p240t6.m;

/* JADX INFO: loaded from: classes3.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l<ScheduledExecutorService> f28050a = new l<>(new j());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l<ScheduledExecutorService> f28051b = new l<>(new k());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l<ScheduledExecutorService> f28052c = new l<>(new p240t6.l());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l<ScheduledExecutorService> f28053d = new l<>(new m());

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<a<?>> getComponents() {
        p pVar = new p(p217r6.a.class, ScheduledExecutorService.class);
        p[] pVarArr = {new p(p217r6.a.class, ExecutorService.class), new p(p217r6.a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(pVar);
        for (p pVar2 : pVarArr) {
            A.d(pVar2, "Null interface");
        }
        Collections.addAll(hashSet, pVarArr);
        a aVar = new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new p005a4.p(7), hashSet3);
        p pVar3 = new p(b.class, ScheduledExecutorService.class);
        p[] pVarArr2 = {new p(b.class, ExecutorService.class), new p(b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(pVar3);
        for (p pVar4 : pVarArr2) {
            A.d(pVar4, "Null interface");
        }
        Collections.addAll(hashSet4, pVarArr2);
        a aVar2 = new a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new C0575j(7), hashSet6);
        p pVar5 = new p(c.class, ScheduledExecutorService.class);
        p[] pVarArr3 = {new p(c.class, ExecutorService.class), new p(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(pVar5);
        for (p pVar6 : pVarArr3) {
            A.d(pVar6, "Null interface");
        }
        Collections.addAll(hashSet7, pVarArr3);
        a aVar3 = new a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new C0576k(8), hashSet9);
        a.C0531a c0531aB = a.b(new p(d.class, Executor.class));
        c0531aB.f46942f = new H6.c(6);
        return Arrays.asList(aVar, aVar2, aVar3, c0531aB.b());
    }
}
