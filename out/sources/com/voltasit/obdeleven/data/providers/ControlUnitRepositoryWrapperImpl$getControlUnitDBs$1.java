package com.voltasit.obdeleven.data.providers;

import com.obdeleven.service.enums.GatewayType;
import com.parse.ControlUnitDB;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ControlUnitRepositoryWrapperImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.providers.ControlUnitRepositoryWrapperImpl$getControlUnitDBs$1", f = "ControlUnitRepositoryWrapperImpl.kt", l = {R.styleable.AppCompatTheme_buttonStyle}, m = "invokeSuspend")
final class ControlUnitRepositoryWrapperImpl$getControlUnitDBs$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super C8.a<? extends Map<Short, ? extends ControlUnitDB>>>, Object> {
    final /* synthetic */ List<Short> $controlUnitKLineIds;
    final /* synthetic */ GatewayType $gatewayType;
    final /* synthetic */ String $params;
    int label;
    final /* synthetic */ ControlUnitRepositoryWrapperImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlUnitRepositoryWrapperImpl$getControlUnitDBs$1(ControlUnitRepositoryWrapperImpl controlUnitRepositoryWrapperImpl, List<Short> list, GatewayType gatewayType, String str, kotlin.coroutines.c<? super ControlUnitRepositoryWrapperImpl$getControlUnitDBs$1> cVar) {
        super(2, cVar);
        this.this$0 = controlUnitRepositoryWrapperImpl;
        this.$controlUnitKLineIds = list;
        this.$gatewayType = gatewayType;
        this.$params = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ControlUnitRepositoryWrapperImpl$getControlUnitDBs$1(this.this$0, this.$controlUnitKLineIds, this.$gatewayType, this.$params, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super C8.a<? extends Map<Short, ? extends ControlUnitDB>>> cVar) {
        return ((ControlUnitRepositoryWrapperImpl$getControlUnitDBs$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            com.voltasit.obdeleven.domain.usecases.vehicle.i iVar = this.this$0.f30216d;
            List<Short> list = this.$controlUnitKLineIds;
            GatewayType gatewayType = this.$gatewayType;
            String str = this.$params;
            this.label = 1;
            obj = iVar.a(list, gatewayType, str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return obj;
    }
}
