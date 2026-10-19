package com.voltasit.obdeleven.presentation.twofactorauth.verify;

import K8.v;
import androidx.lifecycle.C;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.usecases.user.C2124e;
import com.voltasit.obdeleven.domain.usecases.user.F;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import com.voltasit.sharednetwork.domain.common.CloudException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: TwoFactorVerifyViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends com.voltasit.obdeleven.presentation.d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C<Integer> f33346A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C f33347B;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f33348o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final F f33349p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C2124e f33350q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v f33351r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final U7.a<r> f33352s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final U7.a f33353t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final U7.a<String> f33354u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final U7.a f33355v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final U7.a<r> f33356w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final U7.a f33357x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final U7.a<r> f33358y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final U7.a f33359z;

    public e(String flow, F f10, C2124e c2124e, v vVar) {
        i.e(flow, "flow");
        this.f33348o = flow;
        this.f33349p = f10;
        this.f33350q = c2124e;
        this.f33351r = vVar;
        U7.a<r> aVar = new U7.a<>();
        this.f33352s = aVar;
        this.f33353t = aVar;
        U7.a<String> aVar2 = new U7.a<>();
        this.f33354u = aVar2;
        this.f33355v = aVar2;
        U7.a<r> aVar3 = new U7.a<>();
        this.f33356w = aVar3;
        this.f33357x = aVar3;
        U7.a<r> aVar4 = new U7.a<>();
        this.f33358y = aVar4;
        this.f33359z = aVar4;
        C<Integer> c10 = new C<>();
        this.f33346A = c10;
        this.f33347B = c10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(e eVar, String str, ContinuationImpl continuationImpl) {
        TwoFactorVerifyViewModel$disable2Fa$1 twoFactorVerifyViewModel$disable2Fa$1;
        eVar.getClass();
        if (continuationImpl instanceof TwoFactorVerifyViewModel$disable2Fa$1) {
            twoFactorVerifyViewModel$disable2Fa$1 = (TwoFactorVerifyViewModel$disable2Fa$1) continuationImpl;
            int i10 = twoFactorVerifyViewModel$disable2Fa$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                twoFactorVerifyViewModel$disable2Fa$1.label = i10 - Integer.MIN_VALUE;
            } else {
                twoFactorVerifyViewModel$disable2Fa$1 = new TwoFactorVerifyViewModel$disable2Fa$1(eVar, continuationImpl);
            }
        } else {
            twoFactorVerifyViewModel$disable2Fa$1 = new TwoFactorVerifyViewModel$disable2Fa$1(eVar, continuationImpl);
        }
        Object objA = twoFactorVerifyViewModel$disable2Fa$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = twoFactorVerifyViewModel$disable2Fa$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                eVar = (e) twoFactorVerifyViewModel$disable2Fa$1.L$0;
                kotlin.b.b(objA);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eVar = (e) twoFactorVerifyViewModel$disable2Fa$1.L$0;
                kotlin.b.b(objA);
            }
            eVar.f33356w.j(r.f47939a);
            eVar.f32113b.j(PreloaderState.d.f32643a);
            return r.f47939a;
        }
        kotlin.b.b(objA);
        eVar.f32113b.j(PreloaderState.c.f32642a);
        twoFactorVerifyViewModel$disable2Fa$1.L$0 = eVar;
        twoFactorVerifyViewModel$disable2Fa$1.label = 1;
        objA = eVar.f33350q.a(str, twoFactorVerifyViewModel$disable2Fa$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        C2124e.a aVar = (C2124e.a) objA;
        if (i.a(aVar, C2124e.a.c.f30989a)) {
            v vVar = eVar.f33351r;
            twoFactorVerifyViewModel$disable2Fa$1.L$0 = eVar;
            twoFactorVerifyViewModel$disable2Fa$1.label = 2;
            if (vVar.F(twoFactorVerifyViewModel$disable2Fa$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            eVar.f33356w.j(r.f47939a);
        } else if (i.a(aVar, C2124e.a.b.f30988a)) {
            eVar.f33346A.j(new Integer(R.string.view_two_factor_invalid_auth_code));
        } else {
            B7.b.h(R.string.common_something_went_wrong, eVar.f32119h);
        }
        eVar.f32113b.j(PreloaderState.d.f32643a);
        return r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
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
    public static final Object c(e eVar, String str, ContinuationImpl continuationImpl) {
        TwoFactorVerifyViewModel$enable2Fa$1 twoFactorVerifyViewModel$enable2Fa$1;
        e eVar2;
        C8.a aVar;
        eVar.getClass();
        if (continuationImpl instanceof TwoFactorVerifyViewModel$enable2Fa$1) {
            twoFactorVerifyViewModel$enable2Fa$1 = (TwoFactorVerifyViewModel$enable2Fa$1) continuationImpl;
            int i10 = twoFactorVerifyViewModel$enable2Fa$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                twoFactorVerifyViewModel$enable2Fa$1.label = i10 - Integer.MIN_VALUE;
            } else {
                twoFactorVerifyViewModel$enable2Fa$1 = new TwoFactorVerifyViewModel$enable2Fa$1(eVar, continuationImpl);
            }
        } else {
            twoFactorVerifyViewModel$enable2Fa$1 = new TwoFactorVerifyViewModel$enable2Fa$1(eVar, continuationImpl);
        }
        Object objM = twoFactorVerifyViewModel$enable2Fa$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = twoFactorVerifyViewModel$enable2Fa$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                eVar = (e) twoFactorVerifyViewModel$enable2Fa$1.L$0;
                kotlin.b.b(objM);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (C8.a) twoFactorVerifyViewModel$enable2Fa$1.L$1;
                eVar2 = (e) twoFactorVerifyViewModel$enable2Fa$1.L$0;
                kotlin.b.b(objM);
            }
            eVar2.f33354u.j(((C8.a.b) aVar).f2463a);
            eVar = eVar2;
            eVar.f32113b.j(PreloaderState.d.f32643a);
            return r.f47939a;
        }
        kotlin.b.b(objM);
        eVar.f32113b.j(PreloaderState.c.f32642a);
        twoFactorVerifyViewModel$enable2Fa$1.L$0 = eVar;
        twoFactorVerifyViewModel$enable2Fa$1.label = 1;
        objM = eVar.f33349p.f30968a.m(str, twoFactorVerifyViewModel$enable2Fa$1);
        if (objM == coroutineSingletons) {
            return coroutineSingletons;
        }
        C8.a aVar2 = (C8.a) objM;
        if (aVar2 instanceof C8.a.b) {
            v vVar = eVar.f33351r;
            twoFactorVerifyViewModel$enable2Fa$1.L$0 = eVar;
            twoFactorVerifyViewModel$enable2Fa$1.L$1 = aVar2;
            twoFactorVerifyViewModel$enable2Fa$1.label = 2;
            if (vVar.F(twoFactorVerifyViewModel$enable2Fa$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            eVar2 = eVar;
            aVar = aVar2;
            eVar2.f33354u.j(((C8.a.b) aVar).f2463a);
            eVar = eVar2;
        } else if (aVar2 instanceof C8.a.C0024a) {
            Throwable th = ((C8.a.C0024a) aVar2).f2462a;
            CloudException.UnknownCloudException unknownCloudException = th instanceof CloudException.UnknownCloudException ? (CloudException.UnknownCloudException) th : null;
            if (unknownCloudException == null || unknownCloudException.a() != 400) {
                B7.b.h(R.string.common_something_went_wrong, eVar.f32119h);
            } else {
                eVar.f33346A.j(new Integer(R.string.view_two_factor_invalid_auth_code));
            }
        }
        eVar.f32113b.j(PreloaderState.d.f32643a);
        return r.f47939a;
    }
}
