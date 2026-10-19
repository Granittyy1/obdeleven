package androidx.lifecycle;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: CoroutineLiveData.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LiveDataScopeImpl<T> implements A<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1362e<T> f17755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.coroutines.e f17756b;

    /* JADX INFO: renamed from: androidx.lifecycle.LiveDataScopeImpl$emit$2, reason: invalid class name */
    /* JADX INFO: compiled from: CoroutineLiveData.kt */
    @Aa.c(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", l = {R.styleable.AppCompatTheme_selectableItemBackgroundBorderless}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ T $value;
        int label;
        final /* synthetic */ LiveDataScopeImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LiveDataScopeImpl<T> liveDataScopeImpl, T t8, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.this$0 = liveDataScopeImpl;
            this.$value = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass2(this.this$0, this.$value, cVar);
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                C1362e<T> c1362e = this.this$0.f17755a;
                this.label = 1;
                if (c1362e.m(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            this.this$0.f17755a.j(this.$value);
            return p293xa.r.f47939a;
        }
    }

    public LiveDataScopeImpl(C1362e<T> c1362e, kotlin.coroutines.e context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f17755a = c1362e;
        Sa.b bVar = kotlinx.coroutines.N.f43198a;
        this.f17756b = context.plus(kotlinx.coroutines.internal.q.f43500a.d1());
    }

    @Override // androidx.lifecycle.A
    public final Object emit(T t8, kotlin.coroutines.c<? super p293xa.r> cVar) throws Throwable {
        Object objF = C2680e.f(this.f17756b, new AnonymousClass2(this, t8, null), cVar);
        return objF == CoroutineSingletons.f43038b ? objF : p293xa.r.f47939a;
    }
}
