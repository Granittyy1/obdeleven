package com.voltasit.obdeleven.data.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: PermissionRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.repositories.PermissionRepositoryImpl", f = "PermissionRepositoryImpl.kt", l = {17}, m = "getPermissions")
final class PermissionRepositoryImpl$getPermissions$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionRepositoryImpl$getPermissions$1(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
