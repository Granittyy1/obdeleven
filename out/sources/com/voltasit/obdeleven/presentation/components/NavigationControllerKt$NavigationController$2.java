package com.voltasit.obdeleven.presentation.components;

import G8.C0707i;
import Ia.l;
import Ia.p;
import K8.i;
import com.voltasit.obdeleven.domain.models.NavigationType;
import com.voltasit.obdeleven.domain.models.Screen;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import p141l2.C;
import p141l2.C2749t;
import p141l2.H;
import p141l2.K;
import p141l2.T;
import p141l2.w;
import p293xa.r;

/* JADX INFO: compiled from: NavigationController.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.components.NavigationControllerKt$NavigationController$2", f = "NavigationController.kt", l = {}, m = "invokeSuspend")
public final class NavigationControllerKt$NavigationController$2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ J8.p $logger;
    final /* synthetic */ H $navController;
    final /* synthetic */ i $navigationProvider;
    final /* synthetic */ l<C0707i, r> $onNavigateCallback;
    final /* synthetic */ Screen $startScreen;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.components.NavigationControllerKt$NavigationController$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: NavigationController.kt */
    @Aa.c(c = "com.voltasit.obdeleven.presentation.components.NavigationControllerKt$NavigationController$2$1", f = "NavigationController.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<C0707i, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ J8.p $logger;
        final /* synthetic */ H $navController;
        final /* synthetic */ l<C0707i, r> $onNavigateCallback;
        final /* synthetic */ Screen $startScreen;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(H h8, l<? super C0707i, r> lVar, J8.p pVar, Screen screen, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$navController = h8;
            this.$onNavigateCallback = lVar;
            this.$logger = pVar;
            this.$startScreen = screen;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$navController, this.$onNavigateCallback, this.$logger, this.$startScreen, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // Ia.p
        public final Object invoke(C0707i c0707i, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(c0707i, cVar)).invokeSuspend(r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C c10;
            String str;
            C c11;
            String str2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            final C0707i c0707i = (C0707i) this.L$0;
            NavigationType navigationType = c0707i.f3507d;
            NavigationType navigationType2 = NavigationType.f30488c;
            String str3 = "";
            Screen screen = c0707i.f3504a;
            if (navigationType == navigationType2) {
                if (screen == Screen.None) {
                    this.$navController.f();
                } else {
                    w.g(this.$navController, screen.a(), false);
                }
                l<C0707i, r> lVar = this.$onNavigateCallback;
                Screen.a aVar = Screen.f30521b;
                C2749t c2749tG = this.$navController.f44310b.g();
                if (c2749tG != null && (c11 = c2749tG.f44299c) != null && (str2 = c11.f44219c.f44814e) != null) {
                    str3 = str2;
                }
                aVar.getClass();
                lVar.invoke(new C0707i(Screen.a.a(str3), null, false, null, 14));
            } else if (navigationType == NavigationType.f30489d) {
                if (screen == Screen.None) {
                    this.$navController.f();
                } else {
                    w.g(this.$navController, screen.a(), true);
                }
                l<C0707i, r> lVar2 = this.$onNavigateCallback;
                Screen.a aVar2 = Screen.f30521b;
                C2749t c2749tG2 = this.$navController.f44310b.g();
                if (c2749tG2 != null && (c10 = c2749tG2.f44299c) != null && (str = c10.f44219c.f44814e) != null) {
                    str3 = str;
                }
                aVar2.getClass();
                lVar2.invoke(new C0707i(Screen.a.a(str3), null, false, null, 14));
            } else {
                this.$onNavigateCallback.invoke(c0707i);
                if (screen != Screen.None) {
                    this.$logger.e("NavigationController", "WINDOW_OPEN(" + c0707i.a() + ")");
                    H h8 = this.$navController;
                    String strA = c0707i.a();
                    final Screen screen2 = this.$startScreen;
                    h8.c(new l<K, r>() { // from class: com.voltasit.obdeleven.presentation.components.NavigationControllerKt.NavigationController.2.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(K k10) {
                            K navigate = k10;
                            kotlin.jvm.internal.i.e(navigate, "$this$navigate");
                            if (c0707i.f3506c) {
                                navigate.a(new l<T, r>() { // from class: com.voltasit.obdeleven.presentation.components.NavigationControllerKt.NavigationController.2.1.1.1
                                    @Override // Ia.l
                                    public final r invoke(T t8) {
                                        T popUpTo = t8;
                                        kotlin.jvm.internal.i.e(popUpTo, "$this$popUpTo");
                                        popUpTo.f44280a = true;
                                        return r.f47939a;
                                    }
                                }, screen2.a());
                            }
                            return r.f47939a;
                        }
                    }, strA);
                }
            }
            return r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavigationControllerKt$NavigationController$2(i iVar, H h8, l<? super C0707i, r> lVar, J8.p pVar, Screen screen, kotlin.coroutines.c<? super NavigationControllerKt$NavigationController$2> cVar) {
        super(2, cVar);
        this.$navigationProvider = iVar;
        this.$navController = h8;
        this.$onNavigateCallback = lVar;
        this.$logger = pVar;
        this.$startScreen = screen;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        NavigationControllerKt$NavigationController$2 navigationControllerKt$NavigationController$2 = new NavigationControllerKt$NavigationController$2(this.$navigationProvider, this.$navController, this.$onNavigateCallback, this.$logger, this.$startScreen, cVar);
        navigationControllerKt$NavigationController$2.L$0 = obj;
        return navigationControllerKt$NavigationController$2;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((NavigationControllerKt$NavigationController$2) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        C2688e.l(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(this.$navController, this.$onNavigateCallback, this.$logger, this.$startScreen, null), this.$navigationProvider.c()), (A) this.L$0);
        return r.f47939a;
    }
}
