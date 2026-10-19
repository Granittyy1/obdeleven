package com.voltasit.obdeleven.presentation.appList;

import G8.C0700b;
import G8.D;
import Ia.l;
import J8.p;
import J8.x;
import K8.v;
import androidx.compose.ui.text.font.s;
import androidx.lifecycle.B;
import androidx.lifecycle.C;
import androidx.lifecycle.Z;
import com.parse.ParseConfig;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.models.SubscriptionType;
import com.voltasit.obdeleven.domain.models.UserPermission;
import com.voltasit.obdeleven.domain.models.oca.OcaCategory;
import com.voltasit.obdeleven.domain.repositories.AgreementRepository;
import com.voltasit.obdeleven.domain.usecases.device.u;
import com.voltasit.obdeleven.domain.usecases.g;
import com.voltasit.obdeleven.domain.usecases.user.GetUserDetailsUC;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import io.intercom.android.sdk.models.Participant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.EmptyList;
import kotlin.collections.m;
import kotlin.collections.q;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import kotlinx.coroutines.C2680e;
import p255u9.E;
import p255u9.z;
import p293xa.r;

/* JADX INFO: compiled from: AppListViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AppListViewModel extends com.voltasit.obdeleven.presentation.d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C<f> f31244A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C f31245B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C<List<I8.a>> f31246C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final B<List<d>> f31247D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final B f31248E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final U7.a<r> f31249F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final U7.a f31250G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final U7.a<r> f31251H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final U7.a f31252I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final U7.a<r> f31253J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final U7.a f31254K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final U7.a<String> f31255L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final U7.a f31256M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final U7.a<String> f31257N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final U7.a f31258O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final U7.a<r> f31259P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final U7.a f31260Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final U7.a<Boolean> f31261R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final U7.a f31262S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final U7.a<r> f31263T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final U7.a f31264U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final U7.a<r> f31265V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final U7.a f31266W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final U7.a<r> f31267X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final U7.a f31268Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final U7.a<Boolean> f31269Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final U7.a f31270a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public List<C0700b> f31271b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public long f31272c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public volatile p255u9.r f31273d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public D f31274e0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final v f31275o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f31276p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.C f31277q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f31278r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AgreementRepository f31279s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p f31280t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.agreement.a f31281u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.oca.d f31282v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final K8.b f31283w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final J8.d f31284x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final GetUserDetailsUC f31285y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final K8.a f31286z;

    /* JADX INFO: compiled from: AppListViewModel.kt */
    public static final class a<V> implements Callable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ E f31287b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p279w9.a f31288c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AppListViewModel f31289d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p279w9.a f31290e;

        public a(E e10, p279w9.a aVar, AppListViewModel appListViewModel, p279w9.a aVar2) {
            this.f31287b = e10;
            this.f31288c = aVar;
            this.f31289d = appListViewModel;
            this.f31290e = aVar2;
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
        @Override // java.util.concurrent.Callable
        public final Object call() throws Throwable {
            int i10 = z.f47484b;
            z zVar = (z) ParseUser.getCurrentUser();
            E e10 = this.f31287b;
            i.b(e10);
            p255u9.D dI = e10.i();
            int i11 = p255u9.r.f47480b;
            ParseQuery parseQuery = new ParseQuery(p255u9.r.class);
            parseQuery.selectKeys(Collections.singletonList("timestamp"));
            parseQuery.whereEqualTo(Participant.USER_TYPE, zVar);
            parseQuery.whereEqualTo("vehicleBase", dI);
            List<T> list = p279w9.d.d(parseQuery, this.f31288c).f47831b;
            i.b(list);
            AppListViewModel appListViewModel = this.f31289d;
            appListViewModel.g(list);
            p255u9.D dI2 = e10.i();
            String objectId = dI2 != null ? dI2.getObjectId() : null;
            if (objectId == null) {
                objectId = "";
            }
            p279w9.a aVar = this.f31290e;
            appListViewModel.f31283w.g(aVar);
            C2680e.d(EmptyCoroutineContext.f43032b, new AppListViewModel$downloadApps$1(appListViewModel, objectId, aVar, null));
            return null;
        }
    }

    /* JADX INFO: compiled from: AppListViewModel.kt */
    public static final class b<TTaskResult, TContinuationResult> implements Continuation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f31291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AppListViewModel f31292b;

        public b(boolean z10, AppListViewModel appListViewModel) {
            this.f31291a = z10;
            this.f31292b = appListViewModel;
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Object then(Task task) {
            AppListViewModel appListViewModel = this.f31292b;
            boolean z10 = this.f31291a;
            if (z10) {
                appListViewModel.f31261R.j(Boolean.valueOf(z10));
            } else {
                appListViewModel.f32113b.j(PreloaderState.d.f32643a);
            }
            List<I8.a> listD = appListViewModel.f31246C.d();
            if (listD == null) {
                listD = EmptyList.f42983b;
            }
            if (!listD.isEmpty() || u.k(appListViewModel.f31284x.getContext())) {
                return null;
            }
            appListViewModel.f31263T.j(r.f47939a);
            return null;
        }
    }

    /* JADX INFO: compiled from: AppListViewModel.kt */
    public static final class c implements androidx.lifecycle.D, kotlin.jvm.internal.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f31293b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(l lVar) {
            this.f31293b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final p293xa.e<?> b() {
            return this.f31293b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f31293b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.D) || !(obj instanceof kotlin.jvm.internal.f)) {
                return false;
            }
            return this.f31293b.equals(((kotlin.jvm.internal.f) obj).b());
        }

        public final int hashCode() {
            return this.f31293b.hashCode();
        }
    }

    public AppListViewModel(v vVar, x xVar, com.voltasit.obdeleven.domain.usecases.C c10, g gVar, AgreementRepository agreementRepository, p pVar, com.voltasit.obdeleven.domain.usecases.agreement.a aVar, com.voltasit.obdeleven.domain.usecases.oca.d dVar, K8.b bVar, J8.d dVar2, GetUserDetailsUC getUserDetailsUC, K8.a aVar2) {
        this.f31275o = vVar;
        this.f31276p = xVar;
        this.f31277q = c10;
        this.f31278r = gVar;
        this.f31279s = agreementRepository;
        this.f31280t = pVar;
        this.f31281u = aVar;
        this.f31282v = dVar;
        this.f31283w = bVar;
        this.f31284x = dVar2;
        this.f31285y = getUserDetailsUC;
        this.f31286z = aVar2;
        C<f> c11 = new C<>(new f(OcaCategory.ADJUSTMENT, "", true));
        this.f31244A = c11;
        this.f31245B = c11;
        EmptyList emptyList = EmptyList.f42983b;
        C<List<I8.a>> c12 = new C<>(emptyList);
        this.f31246C = c12;
        B<List<d>> b10 = new B<>();
        this.f31247D = b10;
        this.f31248E = b10;
        U7.a<r> aVar3 = new U7.a<>();
        this.f31249F = aVar3;
        this.f31250G = aVar3;
        U7.a<r> aVar4 = new U7.a<>();
        this.f31251H = aVar4;
        this.f31252I = aVar4;
        U7.a<r> aVar5 = new U7.a<>();
        this.f31253J = aVar5;
        this.f31254K = aVar5;
        U7.a<String> aVar6 = new U7.a<>();
        this.f31255L = aVar6;
        this.f31256M = aVar6;
        U7.a<String> aVar7 = new U7.a<>();
        this.f31257N = aVar7;
        this.f31258O = aVar7;
        U7.a<r> aVar8 = new U7.a<>();
        this.f31259P = aVar8;
        this.f31260Q = aVar8;
        U7.a<Boolean> aVar9 = new U7.a<>();
        this.f31261R = aVar9;
        this.f31262S = aVar9;
        U7.a<r> aVar10 = new U7.a<>();
        this.f31263T = aVar10;
        this.f31264U = aVar10;
        U7.a<r> aVar11 = new U7.a<>();
        this.f31265V = aVar11;
        this.f31266W = aVar11;
        U7.a<r> aVar12 = new U7.a<>();
        this.f31267X = aVar12;
        this.f31268Y = aVar12;
        U7.a<Boolean> aVar13 = new U7.a<>();
        this.f31269Z = aVar13;
        this.f31270a0 = aVar13;
        this.f31271b0 = emptyList;
        final Ia.a<List<d>> aVar14 = new Ia.a<List<d>>() { // from class: com.voltasit.obdeleven.presentation.appList.AppListViewModel$generateFilteredList$1
            {
                super(0);
            }

            @Override // Ia.a
            public final List<d> invoke() {
                ArrayList arrayList;
                Object next;
                List<I8.a> listD = this.this$0.f31246C.d();
                if (listD == null) {
                    listD = new ArrayList<>();
                }
                f fVarD = this.this$0.f31244A.d();
                if (fVarD == null) {
                    fVarD = this.this$0.c();
                }
                String str = fVarD.f31320b;
                boolean zS = n.S(str);
                boolean z10 = fVarD.f31321c;
                if (zS) {
                    arrayList = new ArrayList();
                    for (Object obj : listD) {
                        I8.a aVar15 = (I8.a) obj;
                        if (aVar15.f3911l == fVarD.f31319a && aVar15.j == z10) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    AppListViewModel appListViewModel = this.this$0;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : listD) {
                        I8.a aVar16 = (I8.a) obj2;
                        Iterator<T> it = appListViewModel.f31271b0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            C0700b c0700b = (C0700b) next;
                            if (i.a(c0700b.f3444c, "name")) {
                                if (i.a(c0700b.f3442a, aVar16.f3901a)) {
                                    break;
                                }
                            }
                        }
                        C0700b c0700b2 = (C0700b) next;
                        String lowerCase = (c0700b2 != null ? c0700b2.f3445d : aVar16.f3903c).toLowerCase();
                        i.d(lowerCase, "toLowerCase(...)");
                        String lowerCase2 = str.toLowerCase();
                        i.d(lowerCase2, "toLowerCase(...)");
                        if (n.J(lowerCase, lowerCase2, false) && aVar16.j == z10) {
                            arrayList2.add(obj2);
                        }
                    }
                    arrayList = arrayList2;
                }
                ArrayList arrayList3 = new ArrayList(m.y(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new d.b((I8.a) it2.next()));
                }
                ArrayList arrayListP0 = q.p0(arrayList3);
                if (!z10) {
                    AppListViewModel appListViewModel2 = this.this$0;
                    D d10 = appListViewModel2.f31274e0;
                    if (d10 == null) {
                        i.m("userDetails");
                        throw null;
                    }
                    int i10 = (d10.f3410a == SubscriptionType.Ultimate || appListViewModel2.d(UserPermission.SEE_TESTING_OCA, UserPermission.SEE_NON_PUBLIC_OCAS)) ? R.string.view_oca_list_add : R.string.view_oca_list_upgrade;
                    String string = ParseConfig.getCurrentConfig().getString("oca_builder_url");
                    if (string == null) {
                        string = "";
                    }
                    arrayListP0.add(new d.a(i10, string));
                }
                return arrayListP0;
            }
        };
        b10.l(c11, new c(new l<f, r>() { // from class: com.voltasit.obdeleven.presentation.appList.AppListViewModel.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(f fVar) {
                AppListViewModel.this.f31247D.j(aVar14.invoke());
                return r.f47939a;
            }
        }));
        b10.l(c12, new c(new l<List<? extends I8.a>, r>() { // from class: com.voltasit.obdeleven.presentation.appList.AppListViewModel.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(List<? extends I8.a> list) {
                AppListViewModel.this.f31247D.j(aVar14.invoke());
                return r.f47939a;
            }
        }));
    }

    public static void f(AppListViewModel appListViewModel, OcaCategory selectedCategory, String searchKeyword, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            f fVarD = appListViewModel.f31244A.d();
            selectedCategory = fVarD != null ? fVarD.f31319a : OcaCategory.ADJUSTMENT;
        }
        if ((i10 & 2) != 0) {
            f fVarD2 = appListViewModel.f31244A.d();
            searchKeyword = fVarD2 != null ? fVarD2.f31320b : "";
        }
        if ((i10 & 4) != 0) {
            f fVarD3 = appListViewModel.f31244A.d();
            z10 = fVarD3 != null ? fVarD3.f31321c : true;
        }
        appListViewModel.getClass();
        i.e(selectedCategory, "selectedCategory");
        i.e(searchKeyword, "searchKeyword");
        appListViewModel.f31244A.j(new f(selectedCategory, searchKeyword, z10));
    }

    public final void b() {
        C2680e.c(Z.a(this), this.f32112a, null, new AppListViewModel$checkBackup$1(this, null), 2);
    }

    public final f c() {
        f fVarD = this.f31244A.d();
        i.b(fVarD);
        return fVarD;
    }

    public final boolean d(UserPermission... userPermissionArr) {
        return this.f31275o.C((UserPermission[]) Arrays.copyOf(userPermissionArr, userPermissionArr.length));
    }

    public final void e(boolean z10, E e10, String appIdWithoutCategory) {
        i.e(appIdWithoutCategory, "appIdWithoutCategory");
        p279w9.a aVar = new p279w9.a(B7.b.c("OCA_PREVIEW_LIST", s.b(appIdWithoutCategory, c().f31319a.a())), 86400000L);
        p279w9.a aVar2 = new p279w9.a("APP_TIMESTAMP".concat(appIdWithoutCategory), 86400000L);
        if (z10) {
            p279w9.b bVar = Application.f29634b;
            bVar.a(aVar);
            bVar.a(aVar2);
        }
        if (!z10) {
            p279w9.b bVar2 = Application.f29634b;
            if (bVar2.e(aVar) != null && bVar2.e(aVar2) != null) {
                List<? extends p255u9.r> list = (List) bVar2.e(aVar2);
                i.b(list);
                g(list);
                Object objE = bVar2.e(aVar);
                i.c(objE, "null cannot be cast to non-null type kotlin.collections.List<com.voltasit.obdeleven.domain.models.oca.Oca>");
                List<I8.a> list2 = (List) objE;
                Iterator<I8.a> it = list2.iterator();
                while (it.hasNext()) {
                    long j = it.next().f3912m;
                    if (j > this.f31272c0) {
                        this.f31272c0 = j;
                    }
                }
                this.f31246C.j(list2);
                return;
            }
        }
        if (!z10) {
            this.f32113b.j(PreloaderState.c.f32642a);
        }
        Task.callInBackground(new a(e10, aVar2, this, aVar)).continueWith(new b(z10, this), Task.UI_THREAD_EXECUTOR);
    }

    public final void g(List<? extends p255u9.r> list) {
        if (list.isEmpty()) {
            return;
        }
        this.f31273d0 = list.get(0);
        if (this.f31272c0 == 0) {
            p255u9.r rVar = this.f31273d0;
            i.b(rVar);
            this.f31272c0 = rVar.getLong("timestamp");
        }
    }
}
