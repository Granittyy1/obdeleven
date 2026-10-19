package io.intercom.android.sdk.ui.preview.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.widget.Toast;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.L;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.InterfaceC1369l;
import androidx.lifecycle.a0;
import androidx.lifecycle.c0;
import io.intercom.android.sdk.m5.conversation.ui.C2398m;
import io.intercom.android.sdk.m5.conversation.ui.C2399n;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.model.PreviewUiState;
import io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.flow.InterfaceC2687d;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: PreviewRootScreen.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PreviewRootScreenKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt$PreviewRootScreen$1, reason: invalid class name */
    /* JADX INFO: compiled from: PreviewRootScreen.kt */
    @Aa.c(c = "io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt$PreviewRootScreen$1", f = "PreviewRootScreen.kt", l = {R.styleable.AppCompatTheme_listMenuViewStyle}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ PagerState $pagerState;
        final /* synthetic */ PreviewViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PagerState pagerState, PreviewViewModel previewViewModel, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$pagerState = pagerState;
            this.$viewModel = previewViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$pagerState, this.$viewModel, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                final PagerState pagerState = this.$pagerState;
                kotlinx.coroutines.flow.t tVarJ = J0.j(new Ia.a() { // from class: io.intercom.android.sdk.ui.preview.ui.n
                    @Override // Ia.a
                    public final Object invoke() {
                        return Integer.valueOf(pagerState.j());
                    }
                });
                final PreviewViewModel previewViewModel = this.$viewModel;
                InterfaceC2687d interfaceC2687d = new InterfaceC2687d() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt.PreviewRootScreen.1.2
                    @Override // kotlinx.coroutines.flow.InterfaceC2687d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.c cVar) {
                        return emit(((Number) obj2).intValue(), (kotlin.coroutines.c<? super p293xa.r>) cVar);
                    }

                    public final Object emit(int i11, kotlin.coroutines.c<? super p293xa.r> cVar) {
                        previewViewModel.onPageNavigated$intercom_sdk_ui_release(i11);
                        return p293xa.r.f47939a;
                    }
                };
                this.label = 1;
                if (tVarJ.collect(interfaceC2687d, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p293xa.r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt$PreviewRootScreen$2, reason: invalid class name */
    /* JADX INFO: compiled from: PreviewRootScreen.kt */
    public static final class AnonymousClass2 implements Ia.q<L, InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Ia.a<p293xa.r> $onBackCLick;
        final /* synthetic */ Ia.l<IntercomPreviewFile, p293xa.r> $onDeleteClick;
        final /* synthetic */ Ia.l<List<? extends Uri>, p293xa.r> $onSendClick;
        final /* synthetic */ PagerState $pagerState;
        final /* synthetic */ androidx.activity.compose.e<String, Boolean> $permissionLauncher;
        final /* synthetic */ A $scope;
        final /* synthetic */ PreviewUiState $state;
        final /* synthetic */ PreviewViewModel $viewModel;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(PreviewUiState previewUiState, Ia.a<p293xa.r> aVar, PagerState pagerState, Ia.l<? super IntercomPreviewFile, p293xa.r> lVar, Ia.l<? super List<? extends Uri>, p293xa.r> lVar2, Context context, androidx.activity.compose.e<String, Boolean> eVar, PreviewViewModel previewViewModel, A a10) {
            this.$state = previewUiState;
            this.$onBackCLick = aVar;
            this.$pagerState = pagerState;
            this.$onDeleteClick = lVar;
            this.$onSendClick = lVar2;
            this.$context = context;
            this.$permissionLauncher = eVar;
            this.$viewModel = previewViewModel;
            this.$scope = a10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$7$lambda$0(Ia.l onDeleteClick, PreviewUiState state) {
            kotlin.jvm.internal.i.e(onDeleteClick, "$onDeleteClick");
            kotlin.jvm.internal.i.e(state, "$state");
            onDeleteClick.invoke(state.getFiles().get(state.getCurrentPage()));
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$7$lambda$2(Ia.l onSendClick, PreviewUiState state) {
            kotlin.jvm.internal.i.e(onSendClick, "$onSendClick");
            kotlin.jvm.internal.i.e(state, "$state");
            List<IntercomPreviewFile> files = state.getFiles();
            ArrayList arrayList = new ArrayList(kotlin.collections.m.y(files, 10));
            Iterator<T> it = files.iterator();
            while (it.hasNext()) {
                arrayList.add(((IntercomPreviewFile) it.next()).getUri());
            }
            onSendClick.invoke(arrayList);
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$7$lambda$3(Context context, androidx.activity.compose.e permissionLauncher, PreviewViewModel previewViewModel, PreviewUiState state) {
            kotlin.jvm.internal.i.e(context, "$context");
            kotlin.jvm.internal.i.e(permissionLauncher, "$permissionLauncher");
            kotlin.jvm.internal.i.e(state, "$state");
            if (Build.VERSION.SDK_INT < 29 && p186p0.a.a(context, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                permissionLauncher.a("android.permission.WRITE_EXTERNAL_STORAGE");
            } else {
                PreviewRootScreenKt.PreviewRootScreen$saveFile(previewViewModel, state, context);
            }
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$7$lambda$4(A scope, PagerState pagerState, int i10) {
            kotlin.jvm.internal.i.e(scope, "$scope");
            kotlin.jvm.internal.i.e(pagerState, "$pagerState");
            C2680e.c(scope, null, null, new PreviewRootScreenKt$PreviewRootScreen$2$1$5$1(pagerState, i10, null), 3);
            return p293xa.r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$7$lambda$6(Ia.l onSendClick, PreviewUiState state) {
            kotlin.jvm.internal.i.e(onSendClick, "$onSendClick");
            kotlin.jvm.internal.i.e(state, "$state");
            List<IntercomPreviewFile> files = state.getFiles();
            ArrayList arrayList = new ArrayList(kotlin.collections.m.y(files, 10));
            Iterator<T> it = files.iterator();
            while (it.hasNext()) {
                arrayList.add(((IntercomPreviewFile) it.next()).getUri());
            }
            onSendClick.invoke(arrayList);
            return p293xa.r.f47939a;
        }

        @Override // Ia.q
        public /* bridge */ /* synthetic */ p293xa.r invoke(L l10, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(l10, interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(L it, InterfaceC1084f interfaceC1084f, int i10) {
            int i11;
            String confirmationText;
            kotlin.jvm.internal.i.e(it, "it");
            if ((i10 & 14) == 0) {
                i11 = i10 | (interfaceC1084f.K(it) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 91) == 18 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            O0 o10 = CompositionLocalsKt.f14852n;
            androidx.compose.ui.h hVarI = PaddingKt.i(aVar, PaddingKt.d(it, (LayoutDirection) interfaceC1084f.x(o10)), it.d(), PaddingKt.c(it, (LayoutDirection) interfaceC1084f.x(o10)), it.a()).i(W.f10226c);
            final PreviewUiState previewUiState = this.$state;
            Ia.a<p293xa.r> aVar2 = this.$onBackCLick;
            final PagerState pagerState = this.$pagerState;
            final Ia.l<IntercomPreviewFile, p293xa.r> lVar = this.$onDeleteClick;
            final Ia.l<List<? extends Uri>, p293xa.r> lVar2 = this.$onSendClick;
            final Context context = this.$context;
            final androidx.activity.compose.e<String, Boolean> eVar = this.$permissionLauncher;
            final PreviewViewModel previewViewModel = this.$viewModel;
            final A a10 = this.$scope;
            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f, 0);
            int iF = interfaceC1084f.F();
            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f, hVarI);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
            if (interfaceC1084f.u() == null) {
                I.b.k();
                throw null;
            }
            interfaceC1084f.r();
            if (interfaceC1084f.m()) {
                interfaceC1084f.v(aVar3);
            } else {
                interfaceC1084f.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f, c0953mA);
            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f, interfaceC1089h0Z);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
            if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
                androidx.compose.animation.k.b(iF, interfaceC1084f, iF, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f, hVarC);
            PreviewTopBarKt.PreviewTopBar(null, previewUiState.getShowDeleteAction(), previewUiState.getShowSendAction(), previewUiState.getShowDownloadAction(), aVar2, new Ia.a() { // from class: io.intercom.android.sdk.ui.preview.ui.o
                @Override // Ia.a
                public final Object invoke() {
                    return PreviewRootScreenKt.AnonymousClass2.invoke$lambda$7$lambda$0(lVar, previewUiState);
                }
            }, new Ia.a() { // from class: io.intercom.android.sdk.ui.preview.ui.p
                @Override // Ia.a
                public final Object invoke() {
                    return PreviewRootScreenKt.AnonymousClass2.invoke$lambda$7$lambda$2(lVar2, previewUiState);
                }
            }, new Ia.a() { // from class: io.intercom.android.sdk.ui.preview.ui.q
                @Override // Ia.a
                public final Object invoke() {
                    return PreviewRootScreenKt.AnonymousClass2.invoke$lambda$7$lambda$3(context, eVar, previewViewModel, previewUiState);
                }
            }, interfaceC1084f, 0, 1);
            if (1.0f <= 0.0d) {
                p258v.a.a("invalid weight; must be greater than zero");
            }
            PagerKt.a(pagerState, new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE)), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, androidx.compose.runtime.internal.a.b(-816981083, new Ia.r<androidx.compose.foundation.pager.n, Integer, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt$PreviewRootScreen$2$1$4
                @Override // Ia.r
                public /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.foundation.pager.n nVar, Integer num, InterfaceC1084f interfaceC1084f2, Integer num2) {
                    invoke(nVar, num.intValue(), interfaceC1084f2, num2.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(androidx.compose.foundation.pager.n HorizontalPager, int i12, InterfaceC1084f interfaceC1084f2, int i13) {
                    kotlin.jvm.internal.i.e(HorizontalPager, "$this$HorizontalPager");
                    PreviewUriKt.PreviewUri(androidx.compose.ui.h.a.f13984b, previewUiState.getFiles().get(i12), interfaceC1084f2, 70, 0);
                }
            }, interfaceC1084f), interfaceC1084f, 0, 24576, 16380);
            interfaceC1084f.L(1884493226);
            if (previewUiState.getFiles().size() > 1 || ((confirmationText = previewUiState.getConfirmationText()) != null && !kotlin.text.n.S(confirmationText))) {
                PreviewBottomBarKt.PreviewBottomBar(aVar, previewUiState, new Ia.l() { // from class: io.intercom.android.sdk.ui.preview.ui.r
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return PreviewRootScreenKt.AnonymousClass2.invoke$lambda$7$lambda$4(a10, pagerState, ((Integer) obj).intValue());
                    }
                }, new Ia.a() { // from class: io.intercom.android.sdk.ui.preview.ui.s
                    @Override // Ia.a
                    public final Object invoke() {
                        return PreviewRootScreenKt.AnonymousClass2.invoke$lambda$7$lambda$6(lVar2, previewUiState);
                    }
                }, interfaceC1084f, 70, 0);
            }
            interfaceC1084f.D();
            interfaceC1084f.J();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void PreviewRootScreen(androidx.compose.ui.h hVar, final IntercomPreviewArgs previewArgs, PreviewViewModel previewViewModel, final Ia.a<p293xa.r> onBackCLick, final Ia.l<? super IntercomPreviewFile, p293xa.r> onDeleteClick, final Ia.l<? super List<? extends Uri>, p293xa.r> onSendClick, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        final PreviewViewModel previewViewModel2;
        int i12;
        kotlin.jvm.internal.i.e(previewArgs, "previewArgs");
        kotlin.jvm.internal.i.e(onBackCLick, "onBackCLick");
        kotlin.jvm.internal.i.e(onDeleteClick, "onDeleteClick");
        kotlin.jvm.internal.i.e(onSendClick, "onSendClick");
        C1086g c1086gP = interfaceC1084f.p(1944224733);
        final androidx.compose.ui.h hVar2 = (i11 & 1) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        if ((i11 & 4) != 0) {
            String string = UUID.randomUUID().toString();
            a0.c cVarFactory$intercom_sdk_ui_release = PreviewViewModel.Companion.factory$intercom_sdk_ui_release(previewArgs);
            c0 c0VarA = p027c1.b.a(c1086gP);
            if (c0VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            previewViewModel2 = (PreviewViewModel) p027c1.c.a(kotlin.jvm.internal.l.a(PreviewViewModel.class), c0VarA, string, cVarFactory$intercom_sdk_ui_release, c0VarA instanceof InterfaceC1369l ? ((InterfaceC1369l) c0VarA).getDefaultViewModelCreationExtras() : p014b1.a.C0207a.f20498b, c1086gP);
            i12 = i10 & (-897);
        } else {
            previewViewModel2 = previewViewModel;
            i12 = i10;
        }
        final Context context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
        final PreviewUiState previewUiState = (PreviewUiState) J0.a(previewViewModel2.getState$intercom_sdk_ui_release(), c1086gP, 8).getValue();
        Object objF = c1086gP.f();
        if (objF == InterfaceC1084f.a.f12980a) {
            objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
            c1086gP.E(objF);
        }
        DefaultPagerState defaultPagerStateB = androidx.compose.foundation.pager.s.b(previewUiState.getCurrentPage(), new P9.a(2, previewUiState), c1086gP, 48, 0);
        androidx.activity.compose.e eVarA = ActivityResultRegistryKt.a(new p076g.c(), new Ia.l() { // from class: io.intercom.android.sdk.ui.preview.ui.k
            @Override // Ia.l
            public final Object invoke(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                return PreviewRootScreenKt.PreviewRootScreen$lambda$1(context, previewArgs, previewViewModel2, previewUiState, zBooleanValue);
            }
        }, c1086gP, 8);
        E.d(new AnonymousClass1(defaultPagerStateB, previewViewModel2, null), c1086gP, "Page Navigation");
        final PreviewViewModel previewViewModel3 = previewViewModel2;
        int i13 = (i12 & 14) | 819462144;
        ScaffoldKt.a(hVar2, null, null, null, null, 0, H.f13495b, H.f13499f, null, androidx.compose.runtime.internal.a.b(-1427415762, new AnonymousClass2(previewUiState, onBackCLick, defaultPagerStateB, onDeleteClick, onSendClick, context, eVarA, previewViewModel2, (A) objF), c1086gP), c1086gP, i13, 318);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.preview.ui.l
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    PreviewViewModel previewViewModel4 = previewViewModel3;
                    int i14 = i10;
                    int i15 = i11;
                    return PreviewRootScreenKt.PreviewRootScreen$lambda$2(hVar2, previewArgs, previewViewModel4, onBackCLick, onDeleteClick, onSendClick, i14, i15, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int PreviewRootScreen$lambda$0(PreviewUiState state) {
        kotlin.jvm.internal.i.e(state, "$state");
        return state.getFiles().size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PreviewRootScreen$lambda$1(Context context, IntercomPreviewArgs previewArgs, PreviewViewModel previewViewModel, PreviewUiState state, boolean z10) {
        kotlin.jvm.internal.i.e(context, "$context");
        kotlin.jvm.internal.i.e(previewArgs, "$previewArgs");
        kotlin.jvm.internal.i.e(state, "$state");
        if (z10) {
            PreviewRootScreen$saveFile(previewViewModel, state, context);
        } else {
            Toast.makeText(context, previewArgs.getDownloadState().getPermissionDeniedText(), 1).show();
        }
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PreviewRootScreen$lambda$2(androidx.compose.ui.h hVar, IntercomPreviewArgs previewArgs, PreviewViewModel previewViewModel, Ia.a onBackCLick, Ia.l onDeleteClick, Ia.l onSendClick, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(previewArgs, "$previewArgs");
        kotlin.jvm.internal.i.e(onBackCLick, "$onBackCLick");
        kotlin.jvm.internal.i.e(onDeleteClick, "$onDeleteClick");
        kotlin.jvm.internal.i.e(onSendClick, "$onSendClick");
        PreviewRootScreen(hVar, previewArgs, previewViewModel, onBackCLick, onDeleteClick, onSendClick, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PreviewRootScreen$saveFile(PreviewViewModel previewViewModel, PreviewUiState previewUiState, Context context) {
        previewViewModel.saveFile$intercom_sdk_ui_release(previewUiState.getFiles().get(previewUiState.getCurrentPage()), context);
    }

    @IntercomPreviews
    private static final void PreviewRootScreenPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(2020659128);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            EmptyList emptyList = EmptyList.f42983b;
            PreviewRootScreen(null, new IntercomPreviewArgs(emptyList, null, null, false, null, 30, null), new PreviewViewModel(new IntercomPreviewArgs(emptyList, null, null, false, null, 30, null)), new m(0), new C2398m(5), new C2399n(7), c1086gP, 224832, 1);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.components.avatar.a(i10, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PreviewRootScreenPreview$lambda$4(IntercomPreviewFile it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PreviewRootScreenPreview$lambda$5(List it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PreviewRootScreenPreview$lambda$6(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        PreviewRootScreenPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
