package com.voltasit.obdeleven.data.repositories;

import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: UserRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.repositories.UserRepositoryImpl$logout$2", f = "UserRepositoryImpl.kt", l = {R.styleable.AppCompatTheme_ratingBarStyleSmall, R.styleable.AppCompatTheme_searchViewStyle}, m = "invokeSuspend")
public final class UserRepositoryImpl$logout$2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    int label;
    final /* synthetic */ UserRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRepositoryImpl$logout$2(UserRepositoryImpl userRepositoryImpl, kotlin.coroutines.c<? super UserRepositoryImpl$logout$2> cVar) {
        super(2, cVar);
        this.this$0 = userRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new UserRepositoryImpl$logout$2(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((UserRepositoryImpl$logout$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.b.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p293xa.r.f47939a;
        }
        kotlin.b.b(obj);
        UserRepositoryImpl userRepositoryImpl = this.this$0;
        EmptyList emptyList = EmptyList.f42983b;
        this.label = 1;
        if (userRepositoryImpl.w(emptyList, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        kotlinx.coroutines.flow.v vVar = this.this$0.f30318h;
        Boolean bool = Boolean.FALSE;
        this.label = 2;
        if (vVar.emit(bool, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return p293xa.r.f47939a;
    }
}
