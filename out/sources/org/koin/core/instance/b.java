package org.koin.core.instance;

import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: InstanceContext.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E3.b f45764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final org.koin.core.scope.a f45765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ob.a f45766c;

    public b(E3.b logger, org.koin.core.scope.a scope, Ob.a aVar) {
        i.e(logger, "logger");
        i.e(scope, "scope");
        this.f45764a = logger;
        this.f45765b = scope;
        this.f45766c = aVar;
    }
}
