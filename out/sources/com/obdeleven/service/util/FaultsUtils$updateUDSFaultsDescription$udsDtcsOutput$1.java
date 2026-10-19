package com.obdeleven.service.util;

import Ia.p;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: FaultsUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.obdeleven.service.util.FaultsUtils$updateUDSFaultsDescription$udsDtcsOutput$1", f = "FaultsUtils.kt", l = {173}, m = "invokeSuspend")
public final class FaultsUtils$updateUDSFaultsDescription$udsDtcsOutput$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super C8.a<? extends Map<String, ? extends p072f8.a>>>, Object> {
    final /* synthetic */ List<String> $codes;
    final /* synthetic */ String $parsedOdxName;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaultsUtils$updateUDSFaultsDescription$udsDtcsOutput$1(List<String> list, String str, kotlin.coroutines.c<? super FaultsUtils$updateUDSFaultsDescription$udsDtcsOutput$1> cVar) {
        super(2, cVar);
        this.$codes = list;
        this.$parsedOdxName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new FaultsUtils$updateUDSFaultsDescription$udsDtcsOutput$1(this.$codes, this.$parsedOdxName, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super C8.a<? extends Map<String, ? extends p072f8.a>>> cVar) {
        return ((FaultsUtils$updateUDSFaultsDescription$udsDtcsOutput$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, xa.g] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            p084g8.a aVar = (p084g8.a) FaultsUtils.f29548b.getValue();
            List<String> list = this.$codes;
            String str = this.$parsedOdxName;
            this.label = 1;
            obj = aVar.q(list, str, this);
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
