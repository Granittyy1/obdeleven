package com.voltasit.obdeleven.data.extensions;

import Aa.c;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: ParseTaskExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.data.extensions.ParseTaskExtensionsKt", f = "ParseTaskExtensions.kt", l = {24}, m = "suspendResult")
final class ParseTaskExtensionsKt$suspendResult$1<T> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public ParseTaskExtensionsKt$suspendResult$1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objC = ParseTaskExtensionsKt.c(null, this);
        return objC == CoroutineSingletons.f43038b ? objC : new Result(objC);
    }
}
