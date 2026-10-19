package com.voltasit.obdeleven.ui.activity;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class MainActivity$requestPermissions$1 extends Lambda implements Ia.l<Boolean, p293xa.r> {
    final /* synthetic */ Ia.l<Boolean, p293xa.r> $onResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MainActivity$requestPermissions$1(Ia.l<? super Boolean, p293xa.r> lVar) {
        super(1);
        this.$onResult = lVar;
    }

    @Override // Ia.l
    public final p293xa.r invoke(Boolean bool) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        this.$onResult.invoke(bool2);
        return p293xa.r.f47939a;
    }
}
