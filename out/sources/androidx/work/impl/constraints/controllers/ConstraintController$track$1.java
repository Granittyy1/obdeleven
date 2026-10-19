package androidx.work.impl.constraints.controllers;

import Ia.p;
import O2.i;
import androidx.work.k;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.l;
import kotlinx.coroutines.channels.n;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: ContraintControllers.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.work.impl.constraints.controllers.ConstraintController$track$1", f = "ContraintControllers.kt", l = {R.styleable.AppCompatTheme_colorControlNormal}, m = "invokeSuspend")
final class ConstraintController$track$1 extends SuspendLambda implements p<n<? super androidx.work.impl.constraints.b>, kotlin.coroutines.c<? super r>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c<Object> this$0;

    /* JADX INFO: compiled from: ContraintControllers.kt */
    public static final class a implements androidx.work.impl.constraints.a<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c<Object> f20396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n<androidx.work.impl.constraints.b> f20397b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(c<Object> cVar, n<? super androidx.work.impl.constraints.b> nVar) {
            this.f20396a = cVar;
            this.f20397b = nVar;
        }

        @Override // androidx.work.impl.constraints.a
        public final void a(Object obj) {
            c<Object> cVar = this.f20396a;
            this.f20397b.getChannel().n(cVar.c(obj) ? new androidx.work.impl.constraints.b.C0202b(cVar.a()) : androidx.work.impl.constraints.b.a.f20390a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintController$track$1(c<Object> cVar, kotlin.coroutines.c<? super ConstraintController$track$1> cVar2) {
        super(2, cVar2);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ConstraintController$track$1 constraintController$track$1 = new ConstraintController$track$1(this.this$0, cVar);
        constraintController$track$1.L$0 = obj;
        return constraintController$track$1;
    }

    @Override // Ia.p
    public final Object invoke(n<? super androidx.work.impl.constraints.b> nVar, kotlin.coroutines.c<? super r> cVar) {
        return ((ConstraintController$track$1) create(nVar, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            n nVar = (n) this.L$0;
            c<Object> cVar = this.this$0;
            final a aVar = new a(cVar, nVar);
            O2.h<Object> hVar = cVar.f20400a;
            hVar.getClass();
            synchronized (hVar.f4781c) {
                try {
                    if (hVar.f4782d.add(aVar)) {
                        if (hVar.f4782d.size() == 1) {
                            hVar.f4783e = hVar.a();
                            k kVarC = k.c();
                            int i11 = i.f4784a;
                            Objects.toString(hVar.f4783e);
                            kVarC.getClass();
                            hVar.c();
                        }
                        aVar.a(hVar.f4783e);
                    }
                    r rVar = r.f47939a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            final c<Object> cVar2 = this.this$0;
            Ia.a<r> aVar2 = new Ia.a<r>() { // from class: androidx.work.impl.constraints.controllers.ConstraintController$track$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    O2.h<Object> hVar2 = cVar2.f20400a;
                    a listener = aVar;
                    hVar2.getClass();
                    kotlin.jvm.internal.i.e(listener, "listener");
                    synchronized (hVar2.f4781c) {
                        if (hVar2.f4782d.remove(listener) && hVar2.f4782d.isEmpty()) {
                            hVar2.d();
                        }
                    }
                    return r.f47939a;
                }
            };
            this.label = 1;
            if (l.a(nVar, aVar2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return r.f47939a;
    }
}
