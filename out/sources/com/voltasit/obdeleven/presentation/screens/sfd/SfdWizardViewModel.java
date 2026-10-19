package com.voltasit.obdeleven.presentation.screens.sfd;

import Aa.c;
import G8.G;
import J8.p;
import K8.i;
import K8.v;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.lifecycle.Z;
import com.voltasit.obdeleven.domain.exceptions.NotFoundException;
import com.voltasit.obdeleven.domain.usecases.user.h;
import com.voltasit.obdeleven.domain.usecases.user.k;
import com.voltasit.obdeleven.domain.usecases.user.n;
import com.voltasit.obdeleven.presentation.d;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import com.voltasit.obdeleven.utils.NavigationManager;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.flow.InterfaceC2687d;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: SfdWizardViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SfdWizardViewModel extends d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final NavigationManager f33024o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v f33025p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f33026q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h f33027r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f33028s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p f33029t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final n f33030u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C1085f0 f33031v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C1085f0 f33032w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1085f0 f33033x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public G f33034y;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: SfdWizardViewModel.kt */
    @c(c = "com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardViewModel$1", f = "SfdWizardViewModel.kt", l = {R.styleable.AppCompatTheme_checkedTextViewStyle}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardViewModel$1$a */
        /* JADX INFO: compiled from: SfdWizardViewModel.kt */
        public static final class a<T> implements InterfaceC2687d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SfdWizardViewModel f33035b;

            public a(SfdWizardViewModel sfdWizardViewModel) {
                this.f33035b = sfdWizardViewModel;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2687d
            public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                SfdWizardViewModel sfdWizardViewModel = this.f33035b;
                sfdWizardViewModel.f33032w.setValue(Boolean.valueOf(sfdWizardViewModel.f33026q.f30999a.x()));
                sfdWizardViewModel.f33031v.setValue(Boolean.valueOf(sfdWizardViewModel.f33025p.L().getBoolean("emailVerified")));
                return r.f47939a;
            }
        }

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return SfdWizardViewModel.this.new AnonymousClass1(cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) throws Throwable {
            ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
            return CoroutineSingletons.f43038b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
                throw new KotlinNothingValueException();
            }
            b.b(obj);
            kotlinx.coroutines.flow.v vVarO = SfdWizardViewModel.this.f33025p.O();
            a aVar = new a(SfdWizardViewModel.this);
            this.label = 1;
            vVarO.collect(aVar, this);
            return coroutineSingletons;
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardViewModel$2, reason: invalid class name */
    /* JADX INFO: compiled from: SfdWizardViewModel.kt */
    @c(c = "com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardViewModel$2", f = "SfdWizardViewModel.kt", l = {R.styleable.AppCompatTheme_colorError, R.styleable.AppCompatTheme_editTextStyle}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.screens.sfd.SfdWizardViewModel$2$a */
        /* JADX INFO: compiled from: SfdWizardViewModel.kt */
        public static final class a<T> implements InterfaceC2687d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SfdWizardViewModel f33036b;

            public a(SfdWizardViewModel sfdWizardViewModel) {
                this.f33036b = sfdWizardViewModel;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2687d
            public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                this.f33036b.f33034y = (G) obj;
                return r.f47939a;
            }
        }

        public AnonymousClass2(kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return SfdWizardViewModel.this.new AnonymousClass2(cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) throws Throwable {
            ((AnonymousClass2) create(a10, cVar)).invokeSuspend(r.f47939a);
            return CoroutineSingletons.f43038b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                SfdWizardViewModel.this.f32113b.j(PreloaderState.c.f32642a);
                h hVar = SfdWizardViewModel.this.f33027r;
                this.label = 1;
                obj = hVar.f30992a.h(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b.b(obj);
                    throw new KotlinNothingValueException();
                }
                b.b(obj);
            }
            C8.a aVar = (C8.a) obj;
            if (aVar instanceof C8.a.b) {
                SfdWizardViewModel sfdWizardViewModel = SfdWizardViewModel.this;
                G g10 = (G) ((C8.a.b) aVar).f2463a;
                sfdWizardViewModel.f33034y = g10;
                sfdWizardViewModel.f33033x.setValue(Boolean.valueOf(!sfdWizardViewModel.f33030u.a(g10)));
            } else if (aVar instanceof C8.a.C0024a) {
                if (((C8.a.C0024a) aVar).f2462a instanceof NotFoundException) {
                    SfdWizardViewModel.this.f33033x.setValue(Boolean.FALSE);
                } else {
                    SfdWizardViewModel.this.f33024o.h();
                }
            }
            SfdWizardViewModel.this.f32113b.j(PreloaderState.d.f32643a);
            kotlinx.coroutines.flow.v vVarM = SfdWizardViewModel.this.f33025p.M();
            a aVar2 = new a(SfdWizardViewModel.this);
            this.label = 2;
            vVarM.collect(aVar2, this);
            return coroutineSingletons;
        }
    }

    public SfdWizardViewModel(NavigationManager navigationManager, v vVar, k kVar, h hVar, i iVar, p pVar, n nVar) {
        kotlin.jvm.internal.i.e(navigationManager, "navigationManager");
        this.f33024o = navigationManager;
        this.f33025p = vVar;
        this.f33026q = kVar;
        this.f33027r = hVar;
        this.f33028s = iVar;
        this.f33029t = pVar;
        this.f33030u = nVar;
        this.f33031v = J0.f(Boolean.valueOf(vVar.L().getBoolean("emailVerified")));
        this.f33032w = J0.f(Boolean.valueOf(kVar.f30999a.x()));
        this.f33033x = J0.f(Boolean.FALSE);
        C2680e.c(Z.a(this), this.f32112a, null, new AnonymousClass1(null), 2);
        C2680e.c(Z.a(this), this.f32112a, null, new AnonymousClass2(null), 2);
    }
}
