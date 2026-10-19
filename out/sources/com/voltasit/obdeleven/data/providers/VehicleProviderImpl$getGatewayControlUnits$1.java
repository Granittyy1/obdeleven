package com.voltasit.obdeleven.data.providers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: VehicleProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.providers.VehicleProviderImpl", f = "VehicleProviderImpl.kt", l = {R.styleable.AppCompatTheme_listPreferredItemHeight}, m = "getGatewayControlUnits")
final class VehicleProviderImpl$getGatewayControlUnits$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ A this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VehicleProviderImpl$getGatewayControlUnits$1(A a10, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = a10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.i(this);
    }
}
