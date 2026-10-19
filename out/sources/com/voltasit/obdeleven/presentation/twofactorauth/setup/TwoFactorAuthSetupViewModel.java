package com.voltasit.obdeleven.presentation.twofactorauth.setup;

import Aa.c;
import Ia.p;
import Na.i;
import androidx.lifecycle.C;
import androidx.lifecycle.Z;
import com.voltasit.obdeleven.domain.usecases.h;
import com.voltasit.obdeleven.domain.usecases.user.C2125f;
import com.voltasit.obdeleven.presentation.d;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: TwoFactorAuthSetupViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TwoFactorAuthSetupViewModel extends d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C2125f f33329o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h f33330p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C<String> f33331q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C f33332r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final U7.a<Integer> f33333s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final U7.a f33334t;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.twofactorauth.setup.TwoFactorAuthSetupViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: TwoFactorAuthSetupViewModel.kt */
    @c(c = "com.voltasit.obdeleven.presentation.twofactorauth.setup.TwoFactorAuthSetupViewModel$1", f = "TwoFactorAuthSetupViewModel.kt", l = {R.styleable.AppCompatTheme_actionOverflowMenuStyle}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return TwoFactorAuthSetupViewModel.this.new AnonymousClass1(cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                TwoFactorAuthSetupViewModel.this.f32113b.j(PreloaderState.c.f32642a);
                C2125f c2125f = TwoFactorAuthSetupViewModel.this.f33329o;
                this.label = 1;
                obj = c2125f.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            C8.a aVar = (C8.a) obj;
            if (aVar instanceof C8.a.b) {
                TwoFactorAuthSetupViewModel.this.f33331q.j(((C8.a.b) aVar).f2463a);
            } else {
                if (!(aVar instanceof C8.a.C0024a)) {
                    throw new NoWhenBranchMatchedException();
                }
                B7.b.h(com.voltasit.obdeleven.R.string.common_something_went_wrong, TwoFactorAuthSetupViewModel.this.f32119h);
            }
            r rVar = r.f47939a;
            i iVar = E8.a.f3126a;
            TwoFactorAuthSetupViewModel.this.f32113b.j(PreloaderState.d.f32643a);
            return rVar;
        }
    }

    public TwoFactorAuthSetupViewModel(C2125f c2125f, h hVar) {
        this.f33329o = c2125f;
        this.f33330p = hVar;
        C<String> c10 = new C<>();
        this.f33331q = c10;
        this.f33332r = c10;
        U7.a<Integer> aVar = new U7.a<>();
        this.f33333s = aVar;
        this.f33334t = aVar;
        C2680e.c(Z.a(this), null, null, new AnonymousClass1(null), 3);
    }
}
