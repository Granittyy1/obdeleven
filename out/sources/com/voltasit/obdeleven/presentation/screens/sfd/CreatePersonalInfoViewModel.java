package com.voltasit.obdeleven.presentation.screens.sfd;

import Aa.c;
import G8.C0705g;
import G8.G;
import J8.p;
import K8.v;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.lifecycle.Z;
import com.voltasit.obdeleven.domain.usecases.i;
import com.voltasit.obdeleven.domain.usecases.l;
import com.voltasit.obdeleven.domain.usecases.user.B;
import com.voltasit.obdeleven.domain.usecases.user.o;
import com.voltasit.obdeleven.presentation.d;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.I;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.r;
import kotlinx.coroutines.flow.w;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: CreatePersonalInfoViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public class CreatePersonalInfoViewModel extends d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final r f32997A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C1085f0 f32998B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C1085f0 f32999C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public List<C0705g> f33000D;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final B f33001o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p f33002p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o f33003q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v f33004r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f33005s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.o f33006t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final i f33007u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C1085f0 f33008v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C1085f0 f33009w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final kotlinx.coroutines.flow.v f33010x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final kotlinx.coroutines.flow.v f33011y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final kotlinx.coroutines.flow.v f33012z;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.screens.sfd.CreatePersonalInfoViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: CreatePersonalInfoViewModel.kt */
    @c(c = "com.voltasit.obdeleven.presentation.screens.sfd.CreatePersonalInfoViewModel$1", f = "CreatePersonalInfoViewModel.kt", l = {R.styleable.AppCompatTheme_panelMenuListWidth, R.styleable.AppCompatTheme_popupMenuStyle}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        int label;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return CreatePersonalInfoViewModel.this.new AnonymousClass1(cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    b.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b.b(obj);
                }
                return p293xa.r.f47939a;
            }
            b.b(obj);
            this.label = 1;
            if (I.b(50L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            CreatePersonalInfoViewModel createPersonalInfoViewModel = CreatePersonalInfoViewModel.this;
            this.label = 2;
            if (CreatePersonalInfoViewModel.b(createPersonalInfoViewModel, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return p293xa.r.f47939a;
        }
    }

    public CreatePersonalInfoViewModel(B b10, p pVar, o oVar, v vVar, l lVar, com.voltasit.obdeleven.domain.usecases.o oVar2, i iVar) {
        this.f33001o = b10;
        this.f33002p = pVar;
        this.f33003q = oVar;
        this.f33004r = vVar;
        this.f33005s = lVar;
        this.f33006t = oVar2;
        this.f33007u = iVar;
        C1085f0 c1085f0F = J0.f(Boolean.FALSE);
        this.f33008v = c1085f0F;
        this.f33009w = c1085f0F;
        BufferOverflow bufferOverflow = BufferOverflow.f43244c;
        kotlinx.coroutines.flow.v vVarB = w.b(0, 1, bufferOverflow, 1);
        this.f33010x = vVarB;
        this.f33011y = vVarB;
        kotlinx.coroutines.flow.v vVarB2 = w.b(0, 1, bufferOverflow, 1);
        this.f33012z = vVarB2;
        this.f32997A = C2688e.a(vVarB2);
        C1085f0 c1085f0F2 = J0.f(new a(new G("", "", "", "", "", "", "", "", 1792), "", false, false, null, null, null, null, true, false, false, false, false, true, false, false));
        this.f32998B = c1085f0F2;
        this.f32999C = c1085f0F2;
        C2680e.c(Z.a(this), this.f32112a, null, new AnonymousClass1(null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object b(CreatePersonalInfoViewModel createPersonalInfoViewModel, ContinuationImpl continuationImpl) {
        CreatePersonalInfoViewModel$setup$1 createPersonalInfoViewModel$setup$1;
        CreatePersonalInfoViewModel createPersonalInfoViewModel2 = createPersonalInfoViewModel;
        createPersonalInfoViewModel.getClass();
        if (continuationImpl instanceof CreatePersonalInfoViewModel$setup$1) {
            createPersonalInfoViewModel$setup$1 = (CreatePersonalInfoViewModel$setup$1) continuationImpl;
            int i10 = createPersonalInfoViewModel$setup$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                createPersonalInfoViewModel$setup$1.label = i10 - Integer.MIN_VALUE;
            } else {
                createPersonalInfoViewModel$setup$1 = new CreatePersonalInfoViewModel$setup$1(createPersonalInfoViewModel2, continuationImpl);
            }
        } else {
            createPersonalInfoViewModel$setup$1 = new CreatePersonalInfoViewModel$setup$1(createPersonalInfoViewModel2, continuationImpl);
        }
        Object objC = createPersonalInfoViewModel$setup$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = createPersonalInfoViewModel$setup$1.label;
        if (i11 == 0) {
            b.b(objC);
            createPersonalInfoViewModel2.f32998B.setValue(a.a((a) createPersonalInfoViewModel2.f32999C.getValue(), null, null, false, false, null, null, null, false, false, false, false, false, true, false, false, 57343));
            createPersonalInfoViewModel$setup$1.L$0 = createPersonalInfoViewModel2;
            createPersonalInfoViewModel$setup$1.label = 1;
            objC = createPersonalInfoViewModel2.c(createPersonalInfoViewModel$setup$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            createPersonalInfoViewModel2 = (CreatePersonalInfoViewModel) createPersonalInfoViewModel$setup$1.L$0;
            b.b(objC);
        }
        createPersonalInfoViewModel2.f32998B.setValue(a.a((a) createPersonalInfoViewModel2.f32999C.getValue(), null, null, false, false, null, null, null, false, false, false, false, false, false, ((Boolean) objC).booleanValue(), false, 40959));
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object d(CreatePersonalInfoViewModel createPersonalInfoViewModel, ContinuationImpl continuationImpl) {
        CreatePersonalInfoViewModel$loadData$1 createPersonalInfoViewModel$loadData$1;
        CreatePersonalInfoViewModel createPersonalInfoViewModel2 = createPersonalInfoViewModel;
        if (continuationImpl instanceof CreatePersonalInfoViewModel$loadData$1) {
            createPersonalInfoViewModel$loadData$1 = (CreatePersonalInfoViewModel$loadData$1) continuationImpl;
            int i10 = createPersonalInfoViewModel$loadData$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                createPersonalInfoViewModel$loadData$1.label = i10 - Integer.MIN_VALUE;
            } else {
                createPersonalInfoViewModel$loadData$1 = new CreatePersonalInfoViewModel$loadData$1(createPersonalInfoViewModel2, continuationImpl);
            }
        } else {
            createPersonalInfoViewModel$loadData$1 = new CreatePersonalInfoViewModel$loadData$1(createPersonalInfoViewModel2, continuationImpl);
        }
        Object objA = createPersonalInfoViewModel$loadData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = createPersonalInfoViewModel$loadData$1.label;
        boolean z10 = true;
        if (i11 == 0) {
            b.b(objA);
            com.voltasit.obdeleven.domain.usecases.o oVar = createPersonalInfoViewModel2.f33006t;
            createPersonalInfoViewModel$loadData$1.L$0 = createPersonalInfoViewModel2;
            createPersonalInfoViewModel$loadData$1.label = 1;
            objA = oVar.a(createPersonalInfoViewModel$loadData$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            createPersonalInfoViewModel2 = (CreatePersonalInfoViewModel) createPersonalInfoViewModel$loadData$1.L$0;
            b.b(objA);
        }
        C8.a aVar = (C8.a) objA;
        if (aVar instanceof C8.a.C0024a) {
            createPersonalInfoViewModel2.f33008v.setValue(Boolean.TRUE);
            z10 = false;
        } else {
            if (!(aVar instanceof C8.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            List<C0705g> list = (List) ((C8.a.b) aVar).f2463a;
            createPersonalInfoViewModel2.getClass();
            kotlin.jvm.internal.i.e(list, "<set-?>");
            createPersonalInfoViewModel2.f33000D = list;
            C0705g c0705gA = createPersonalInfoViewModel2.f33005s.a(list);
            C1085f0 c1085f0 = createPersonalInfoViewModel2.f32998B;
            c1085f0.setValue(a.a((a) createPersonalInfoViewModel2.f32999C.getValue(), G.a(((a) c1085f0.getValue()).f33037a, null, null, null, c0705gA.f3496b, null, null, null, null, 2039), null, false, false, null, null, null, false, false, false, false, false, false, false, false, 65534));
        }
        return Boolean.valueOf(z10);
    }

    public Object c(kotlin.coroutines.c<? super Boolean> cVar) {
        return d(this, (ContinuationImpl) cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(G g10) {
        C1085f0 c1085f0 = this.f32998B;
        G g11 = ((a) c1085f0.getValue()).f33037a;
        String str = g10.f3417a;
        if (!kotlin.jvm.internal.i.a(str, g11.f3417a)) {
            c1085f0.setValue(a.a((a) c1085f0.getValue(), null, null, false, false, null, null, null, false, false, false, false, false, false, false, false, 65519));
        }
        String str2 = g10.f3418b;
        if (!kotlin.jvm.internal.i.a(str2, g11.f3418b)) {
            c1085f0.setValue(a.a((a) c1085f0.getValue(), null, null, false, false, null, null, null, false, false, false, false, false, false, false, false, 65471));
        }
        String str3 = g10.f3421e;
        if (!kotlin.jvm.internal.i.a(str3, g11.f3421e)) {
            c1085f0.setValue(a.a((a) c1085f0.getValue(), null, null, false, false, null, null, null, false, false, false, false, false, false, false, false, 65407));
        }
        this.f33003q.getClass();
        if (str.length() < 128 && str2.length() < 128 && g10.f3424h.length() <= 1000) {
            String str4 = g10.f3423g;
            if (str4.length() <= 5) {
                if ((str4.length() <= 0 || kotlin.text.l.A(str4) != null) && str3.length() <= 15) {
                    if (str3.length() <= 0 || kotlin.text.l.B(str3) != null) {
                        c1085f0.setValue(a.a((a) c1085f0.getValue(), g10, null, false, false, null, null, null, false, false, false, false, false, false, false, false, 65534));
                    }
                }
            }
        }
    }
}
