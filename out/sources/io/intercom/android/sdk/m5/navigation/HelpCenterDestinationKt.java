package io.intercom.android.sdk.m5.navigation;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.animation.InterfaceC0900c;
import androidx.compose.animation.InterfaceC0927e;
import androidx.compose.runtime.C1081d0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.m5.conversation.ui.components.C2388z;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionStyleKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.extension.NavBackStackEntryExtensionKt;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p141l2.C2748s;
import p141l2.C2749t;

/* JADX INFO: compiled from: HelpCenterDestination.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterDestinationKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.HelpCenterDestinationKt$helpCenterDestination$7, reason: invalid class name */
    /* JADX INFO: compiled from: HelpCenterDestination.kt */
    public static final class AnonymousClass7 implements Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ IntercomRootActivityArgs $intercomRootActivityArgs;
        final /* synthetic */ p141l2.H $navController;
        final /* synthetic */ ComponentActivity $rootActivity;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.HelpCenterDestinationKt$helpCenterDestination$7$2, reason: invalid class name */
        /* JADX INFO: compiled from: HelpCenterDestination.kt */
        @Aa.c(c = "io.intercom.android.sdk.m5.navigation.HelpCenterDestinationKt$helpCenterDestination$7$2", f = "HelpCenterDestination.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
            int label;

            public AnonymousClass2(kotlin.coroutines.c<? super AnonymousClass2> cVar) {
                super(2, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                return new AnonymousClass2(cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                Injector.get().getMetricTracker().viewedSpace("help");
                return p293xa.r.f47939a;
            }

            @Override // Ia.p
            public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                return ((AnonymousClass2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
            }
        }

        public AnonymousClass7(ComponentActivity componentActivity, IntercomRootActivityArgs intercomRootActivityArgs, p141l2.H h8) {
            this.$rootActivity = componentActivity;
            this.$intercomRootActivityArgs = intercomRootActivityArgs;
            this.$navController = h8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$1(p141l2.H navController, ComponentActivity rootActivity) {
            kotlin.jvm.internal.i.e(navController, "$navController");
            kotlin.jvm.internal.i.e(rootActivity, "$rootActivity");
            if (navController.b() == null) {
                rootActivity.finish();
            } else {
                navController.e();
            }
            return p293xa.r.f47939a;
        }

        @Override // Ia.r
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0900c interfaceC0900c, C2749t c2749t, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC0900c, c2749t, interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC0900c composable, C2749t it, InterfaceC1084f interfaceC1084f, int i10) {
            List<String> listK;
            int i11;
            kotlin.jvm.internal.i.e(composable, "$this$composable");
            kotlin.jvm.internal.i.e(it, "it");
            Bundle bundleA = it.f44305i.a();
            boolean z10 = bundleA != null ? bundleA.getBoolean("isLaunchedProgrammatically") : false;
            HelpCenterViewModel.Companion companion = HelpCenterViewModel.Companion;
            ComponentActivity componentActivity = this.$rootActivity;
            HelpCenterApi helpCenterApi = Injector.get().getHelpCenterApi();
            kotlin.jvm.internal.i.d(helpCenterApi, "getHelpCenterApi(...)");
            HelpCenterViewModel helpCenterViewModelCreate = companion.create(componentActivity, helpCenterApi, MetricTracker.Place.COLLECTION_LIST);
            interfaceC1084f.L(-102150257);
            p141l2.H h8 = this.$navController;
            Object objF = interfaceC1084f.f();
            if (objF == InterfaceC1084f.a.f12980a) {
                if (h8.b() == null) {
                    i11 = R.drawable.intercom_ic_close;
                } else {
                    i11 = z10 ? R.drawable.intercom_ic_chevron_down : R.drawable.intercom_ic_back;
                }
                objF = new C1081d0(i11);
                interfaceC1084f.E(objF);
            }
            androidx.compose.runtime.V v10 = (androidx.compose.runtime.V) objF;
            interfaceC1084f.D();
            IntercomRootActivityArgs intercomRootActivityArgs = this.$intercomRootActivityArgs;
            if (intercomRootActivityArgs instanceof IntercomRootActivityArgs.HelpCenterCollectionsArgs) {
                listK = ((IntercomRootActivityArgs.HelpCenterCollectionsArgs) intercomRootActivityArgs).getCollectionIds();
            } else {
                listK = intercomRootActivityArgs instanceof IntercomRootActivityArgs.HelpCenterCollectionArgs ? M1.k(((IntercomRootActivityArgs.HelpCenterCollectionArgs) intercomRootActivityArgs).getCollectionId()) : EmptyList.f42983b;
            }
            List<String> list = listK;
            final p141l2.H h10 = this.$navController;
            final ComponentActivity componentActivity2 = this.$rootActivity;
            HelpCenterScreenKt.HelpCenterScreen(helpCenterViewModelCreate, list, new Ia.a() { // from class: io.intercom.android.sdk.m5.navigation.t
                @Override // Ia.a
                public final Object invoke() {
                    return HelpCenterDestinationKt.AnonymousClass7.invoke$lambda$1(h10, componentActivity2);
                }
            }, v10.o(), interfaceC1084f, 72);
            androidx.compose.runtime.E.d(new AnonymousClass2(null), interfaceC1084f, "");
        }
    }

    public static final void helpCenterDestination(p141l2.F f10, ComponentActivity rootActivity, p141l2.H navController, IntercomRootActivityArgs intercomRootActivityArgs) {
        kotlin.jvm.internal.i.e(f10, "<this>");
        kotlin.jvm.internal.i.e(rootActivity, "rootActivity");
        kotlin.jvm.internal.i.e(navController, "navController");
        kotlin.jvm.internal.i.e(intercomRootActivityArgs, "intercomRootActivityArgs");
        androidx.navigation.compose.u.a(f10, "HELP_CENTER?transitionArgs={transitionArgs}&isLaunchedProgrammatically={isLaunchedProgrammatically}", kotlin.collections.l.s(L4.b.e(new N(1), "transitionArgs"), L4.b.e(new O(1), "isLaunchedProgrammatically")), new androidx.navigation.compose.r(1), new coil.compose.c(1), new coil.compose.d(2), new C2388z(3), new ComposableLambdaImpl(true, -2139595832, new AnonymousClass7(rootActivity, intercomRootActivityArgs, navController)), 132);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r helpCenterDestination$lambda$0(C2748s navArgument) {
        kotlin.jvm.internal.i.e(navArgument, "$this$navArgument");
        navArgument.b(TransitionStyleKt.getTransitionArgNavType());
        navArgument.a(new TransitionArgs(null, null, null, null, 15, null));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r helpCenterDestination$lambda$1(C2748s navArgument) {
        kotlin.jvm.internal.i.e(navArgument, "$this$navArgument");
        navArgument.b(p141l2.L.BoolType);
        navArgument.f44296a.f44293b = false;
        navArgument.a(Boolean.FALSE);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.m helpCenterDestination$lambda$2(InterfaceC0927e composable) {
        kotlin.jvm.internal.i.e(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((C2749t) composable.h(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.o helpCenterDestination$lambda$3(InterfaceC0927e composable) {
        kotlin.jvm.internal.i.e(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((C2749t) composable.c(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.m helpCenterDestination$lambda$4(InterfaceC0927e composable) {
        kotlin.jvm.internal.i.e(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((C2749t) composable.h(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.o helpCenterDestination$lambda$5(InterfaceC0927e composable) {
        kotlin.jvm.internal.i.e(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((C2749t) composable.c(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopExit().transition();
    }
}
