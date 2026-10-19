package com.voltasit.obdeleven.presentation.profile;

import G8.C0706h;
import G8.D;
import G8.z;
import K8.p;
import androidx.lifecycle.C;
import androidx.lifecycle.Z;
import com.voltasit.obdeleven.domain.models.SubscriptionType;
import com.voltasit.obdeleven.domain.providers.PurchaseProvider;
import com.voltasit.obdeleven.domain.usecases.C2113b;
import com.voltasit.obdeleven.domain.usecases.user.A;
import com.voltasit.obdeleven.domain.usecases.user.C2121b;
import com.voltasit.obdeleven.domain.usecases.user.q;
import com.voltasit.obdeleven.domain.usecases.user.w;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.v;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: ProfileViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ProfileViewModel extends com.voltasit.obdeleven.presentation.d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.iap.b f32828A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final p f32829B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final K8.b f32830C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final K8.e f32831D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final U7.a<String> f32832E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final U7.a f32833F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final C<Boolean> f32834G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C f32835H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final U7.a<r> f32836I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final U7.a f32837J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final U7.a<r> f32838K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final U7.a f32839L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final C<Boolean> f32840M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final C<String> f32841N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final C f32842O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final C<Integer> f32843P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final C f32844Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final C<D> f32845R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final C f32846S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final v f32847T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final kotlinx.coroutines.flow.r f32848U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final U7.a<r> f32849V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final U7.a f32850W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final U7.a<r> f32851X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final U7.a f32852Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final C<List<a>> f32853Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final C f32854a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final U7.a<b> f32855b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final U7.a f32856c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final U7.a<String> f32857d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final U7.a f32858e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final U7.a<String> f32859f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final U7.a f32860g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final U7.a<c> f32861h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final U7.a f32862i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public z f32863j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final U7.a<List<C0706h>> f32864k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final U7.a f32865l0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final PurchaseProvider f32866o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C2121b f32867p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w f32868q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.user.k f32869r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final K8.v f32870s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f32871t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final A f32872u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.j f32873v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final J8.p f32874w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.iap.d f32875x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C2113b f32876y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.user.D f32877z;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.profile.ProfileViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: ProfileViewModel.kt */
    @Aa.c(c = "com.voltasit.obdeleven.presentation.profile.ProfileViewModel$1", f = "ProfileViewModel.kt", l = {R.styleable.AppCompatTheme_textAppearanceListItemSecondary}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.profile.ProfileViewModel$1$a */
        /* JADX INFO: compiled from: ProfileViewModel.kt */
        public static final class a<T> implements InterfaceC2687d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProfileViewModel f32878b;

            public a(ProfileViewModel profileViewModel) {
                this.f32878b = profileViewModel;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlinx.coroutines.flow.InterfaceC2687d
            public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                D d10 = (D) obj;
                ProfileViewModel profileViewModel = this.f32878b;
                profileViewModel.f32841N.j(d10.f3410a.a());
                profileViewModel.f32840M.j(Boolean.valueOf(d10.f3410a.c()));
                C8.a<Integer> aVarA = profileViewModel.f32873v.a(d10.f3411b);
                boolean z10 = aVarA instanceof C8.a.b;
                C<Integer> c10 = profileViewModel.f32843P;
                if (z10) {
                    c10.j((Integer) ((C8.a.b) aVarA).f2463a);
                } else {
                    if (!(aVarA instanceof C8.a.C0024a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    profileViewModel.f32119h.j(Integer.valueOf(com.voltasit.obdeleven.R.string.common_something_went_wrong));
                    c10.j(0);
                }
                r rVar = r.f47939a;
                Na.i iVar = E8.a.f3126a;
                profileViewModel.f32845R.j(d10);
                return r.f47939a;
            }
        }

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return ProfileViewModel.this.new AnonymousClass1(cVar);
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return r.f47939a;
            }
            kotlin.b.b(obj);
            StateFlowImpl stateFlowImplA = ProfileViewModel.this.f32868q.f31027a.A();
            a aVar = new a(ProfileViewModel.this);
            this.label = 1;
            stateFlowImplA.collect(aVar, this);
            return coroutineSingletons;
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.profile.ProfileViewModel$2, reason: invalid class name */
    /* JADX INFO: compiled from: ProfileViewModel.kt */
    @Aa.c(c = "com.voltasit.obdeleven.presentation.profile.ProfileViewModel$2", f = "ProfileViewModel.kt", l = {R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.profile.ProfileViewModel$2$a */
        /* JADX INFO: compiled from: ProfileViewModel.kt */
        public static final class a<T> implements InterfaceC2687d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProfileViewModel f32879b;

            public a(ProfileViewModel profileViewModel) {
                this.f32879b = profileViewModel;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2687d
            public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                ProfileViewModel profileViewModel = this.f32879b;
                profileViewModel.f32834G.j(Boolean.valueOf(profileViewModel.f32869r.f30999a.x()));
                return r.f47939a;
            }
        }

        public AnonymousClass2(kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return ProfileViewModel.this.new AnonymousClass2(cVar);
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super r> cVar) throws Throwable {
            ((AnonymousClass2) create(a10, cVar)).invokeSuspend(r.f47939a);
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
                kotlin.b.b(obj);
                throw new KotlinNothingValueException();
            }
            kotlin.b.b(obj);
            v vVarO = ProfileViewModel.this.f32870s.O();
            a aVar = new a(ProfileViewModel.this);
            this.label = 1;
            vVarO.collect(aVar, this);
            return coroutineSingletons;
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.profile.ProfileViewModel$3, reason: invalid class name */
    /* JADX INFO: compiled from: ProfileViewModel.kt */
    @Aa.c(c = "com.voltasit.obdeleven.presentation.profile.ProfileViewModel$3", f = "ProfileViewModel.kt", l = {R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        public AnonymousClass3(kotlin.coroutines.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return ProfileViewModel.this.new AnonymousClass3(cVar);
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass3) create(a10, cVar)).invokeSuspend(r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                ProfileViewModel.this.f32113b.j(PreloaderState.c.f32642a);
                ProfileViewModel profileViewModel = ProfileViewModel.this;
                this.label = 1;
                if (ProfileViewModel.b(profileViewModel, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            ProfileViewModel.this.f32113b.j(PreloaderState.d.f32643a);
            return r.f47939a;
        }
    }

    /* JADX INFO: compiled from: ProfileViewModel.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z f32880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f32881b;

        public a(z product, String text) {
            kotlin.jvm.internal.i.e(product, "product");
            kotlin.jvm.internal.i.e(text, "text");
            this.f32880a = product;
            this.f32881b = text;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.i.a(this.f32880a, aVar.f32880a) && kotlin.jvm.internal.i.a(this.f32881b, aVar.f32881b);
        }

        public final int hashCode() {
            return this.f32881b.hashCode() + (this.f32880a.hashCode() * 31);
        }

        public final String toString() {
            return "PurchaseButtonArguments(product=" + this.f32880a + ", text=" + this.f32881b + ")";
        }
    }

    /* JADX INFO: compiled from: ProfileViewModel.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f32882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final z.a f32883b;

        public b(String productId, z.a aVar) {
            kotlin.jvm.internal.i.e(productId, "productId");
            this.f32882a = productId;
            this.f32883b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.i.a(this.f32882a, bVar.f32882a) && kotlin.jvm.internal.i.a(this.f32883b, bVar.f32883b);
        }

        public final int hashCode() {
            return this.f32883b.hashCode() + (this.f32882a.hashCode() * 31);
        }

        public final String toString() {
            return "PurchaseDialogArguments(productId=" + this.f32882a + ", translationIds=" + this.f32883b + ")";
        }
    }

    /* JADX INFO: compiled from: ProfileViewModel.kt */
    public static abstract class c {

        /* JADX INFO: compiled from: ProfileViewModel.kt */
        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f32884a;

            public a(String message) {
                kotlin.jvm.internal.i.e(message, "message");
                this.f32884a = message;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && kotlin.jvm.internal.i.a(this.f32884a, ((a) obj).f32884a);
            }

            public final int hashCode() {
                return this.f32884a.hashCode();
            }

            public final String toString() {
                return Q8.d.a(new StringBuilder("Message(message="), this.f32884a, ")");
            }
        }

        /* JADX INFO: compiled from: ProfileViewModel.kt */
        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f32885a = new b();
        }
    }

    public ProfileViewModel(PurchaseProvider purchaseProvider, C2121b c2121b, w wVar, com.voltasit.obdeleven.domain.usecases.user.k kVar, K8.v vVar, q qVar, A a10, com.voltasit.obdeleven.domain.usecases.j jVar, J8.p pVar, com.voltasit.obdeleven.domain.usecases.iap.d dVar, C2113b c2113b, com.voltasit.obdeleven.domain.usecases.user.D d10, com.voltasit.obdeleven.domain.usecases.iap.b bVar, p pVar2, K8.b bVar2, K8.e eVar) {
        this.f32866o = purchaseProvider;
        this.f32867p = c2121b;
        this.f32868q = wVar;
        this.f32869r = kVar;
        this.f32870s = vVar;
        this.f32871t = qVar;
        this.f32872u = a10;
        this.f32873v = jVar;
        this.f32874w = pVar;
        this.f32875x = dVar;
        this.f32876y = c2113b;
        this.f32877z = d10;
        this.f32828A = bVar;
        this.f32829B = pVar2;
        this.f32830C = bVar2;
        this.f32831D = eVar;
        U7.a<String> aVar = new U7.a<>();
        this.f32832E = aVar;
        this.f32833F = aVar;
        C<Boolean> c10 = new C<>(Boolean.valueOf(kVar.f30999a.x()));
        this.f32834G = c10;
        this.f32835H = c10;
        U7.a<r> aVar2 = new U7.a<>();
        this.f32836I = aVar2;
        this.f32837J = aVar2;
        U7.a<r> aVar3 = new U7.a<>();
        this.f32838K = aVar3;
        this.f32839L = aVar3;
        this.f32840M = new C<>(Boolean.FALSE);
        C<String> c11 = new C<>(SubscriptionType.None.a());
        this.f32841N = c11;
        this.f32842O = c11;
        C<Integer> c12 = new C<>();
        this.f32843P = c12;
        this.f32844Q = c12;
        C<D> c13 = new C<>();
        this.f32845R = c13;
        this.f32846S = c13;
        v vVarB = kotlinx.coroutines.flow.w.b(0, 1, BufferOverflow.f43244c, 1);
        this.f32847T = vVarB;
        this.f32848U = C2688e.a(vVarB);
        U7.a<r> aVar4 = new U7.a<>();
        this.f32849V = aVar4;
        this.f32850W = aVar4;
        U7.a<r> aVar5 = new U7.a<>();
        this.f32851X = aVar5;
        this.f32852Y = aVar5;
        C<List<a>> c14 = new C<>();
        this.f32853Z = c14;
        this.f32854a0 = c14;
        U7.a<b> aVar6 = new U7.a<>();
        this.f32855b0 = aVar6;
        this.f32856c0 = aVar6;
        U7.a<String> aVar7 = new U7.a<>();
        this.f32857d0 = aVar7;
        this.f32858e0 = aVar7;
        U7.a<String> aVar8 = new U7.a<>();
        this.f32859f0 = aVar8;
        this.f32860g0 = aVar8;
        U7.a<c> aVar9 = new U7.a<>();
        this.f32861h0 = aVar9;
        this.f32862i0 = aVar9;
        U7.a<List<C0706h>> aVar10 = new U7.a<>();
        this.f32864k0 = aVar10;
        this.f32865l0 = aVar10;
        C2680e.c(Z.a(this), this.f32112a, null, new AnonymousClass1(null), 2);
        C2680e.c(Z.a(this), this.f32112a, null, new AnonymousClass2(null), 2);
        C2680e.c(Z.a(this), null, null, new AnonymousClass3(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x009f A[LOOP:0: B:33:0x0099->B:35:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object b(ProfileViewModel profileViewModel, ContinuationImpl continuationImpl) {
        ProfileViewModel$updateSubscriptionPurchaseButtons$1 profileViewModel$updateSubscriptionPurchaseButtons$1;
        C8.a aVar;
        ArrayList arrayList;
        profileViewModel.getClass();
        if (continuationImpl instanceof ProfileViewModel$updateSubscriptionPurchaseButtons$1) {
            profileViewModel$updateSubscriptionPurchaseButtons$1 = (ProfileViewModel$updateSubscriptionPurchaseButtons$1) continuationImpl;
            int i10 = profileViewModel$updateSubscriptionPurchaseButtons$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                profileViewModel$updateSubscriptionPurchaseButtons$1.label = i10 - Integer.MIN_VALUE;
            } else {
                profileViewModel$updateSubscriptionPurchaseButtons$1 = new ProfileViewModel$updateSubscriptionPurchaseButtons$1(profileViewModel, continuationImpl);
            }
        } else {
            profileViewModel$updateSubscriptionPurchaseButtons$1 = new ProfileViewModel$updateSubscriptionPurchaseButtons$1(profileViewModel, continuationImpl);
        }
        Object objH = profileViewModel$updateSubscriptionPurchaseButtons$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = profileViewModel$updateSubscriptionPurchaseButtons$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                profileViewModel = (ProfileViewModel) profileViewModel$updateSubscriptionPurchaseButtons$1.L$0;
                kotlin.b.b(objH);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                profileViewModel = (ProfileViewModel) profileViewModel$updateSubscriptionPurchaseButtons$1.L$0;
                kotlin.b.b(objH);
            }
            aVar = (C8.a) objH;
            if (aVar instanceof C8.a.C0024a) {
                return r.f47939a;
            }
            if (aVar instanceof C8.a.b) {
                C<List<a>> c10 = profileViewModel.f32853Z;
                Map map = (Map) ((C8.a.b) aVar).f2463a;
                arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add(new a((z) entry.getKey(), (String) entry.getValue()));
                }
                c10.j(arrayList);
            }
            return r.f47939a;
        }
        kotlin.b.b(objH);
        profileViewModel$updateSubscriptionPurchaseButtons$1.L$0 = profileViewModel;
        profileViewModel$updateSubscriptionPurchaseButtons$1.label = 1;
        objH = profileViewModel.f32875x.f30858a.h(profileViewModel$updateSubscriptionPurchaseButtons$1);
        if (objH == coroutineSingletons) {
            return coroutineSingletons;
        }
        C8.a aVar2 = (C8.a) objH;
        if (aVar2 instanceof C8.a.C0024a) {
            return r.f47939a;
        }
        if (!(aVar2 instanceof C8.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        List list = (List) ((C8.a.b) aVar2).f2463a;
        com.voltasit.obdeleven.domain.usecases.iap.b bVar = profileViewModel.f32828A;
        profileViewModel$updateSubscriptionPurchaseButtons$1.L$0 = profileViewModel;
        profileViewModel$updateSubscriptionPurchaseButtons$1.label = 2;
        objH = bVar.a(list, profileViewModel$updateSubscriptionPurchaseButtons$1);
        if (objH == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar = (C8.a) objH;
        if (aVar instanceof C8.a.C0024a) {
            return r.f47939a;
        }
        if (aVar instanceof C8.a.b) {
            C<List<a>> c11 = profileViewModel.f32853Z;
            Map map2 = (Map) ((C8.a.b) aVar).f2463a;
            arrayList = new ArrayList(map2.size());
            while (r6.hasNext()) {
                arrayList.add(new a((z) entry.getKey(), (String) entry.getValue()));
            }
            c11.j(arrayList);
        }
        return r.f47939a;
    }
}
