package io.intercom.android.sdk.ui.preview.ui;

import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.C0935g;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.N;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.U;
import androidx.compose.foundation.layout.W;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.C1051f;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.X;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.layout.InterfaceC1161g;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.model.PreviewUiState;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: PreviewBottomBar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PreviewBottomBarKt {
    public static final void PreviewBottomBar(androidx.compose.ui.h hVar, final PreviewUiState uiState, final Ia.l<? super Integer, p293xa.r> onThumbnailClick, final Ia.a<p293xa.r> onCtaClick, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        kotlin.jvm.internal.i.e(uiState, "uiState");
        kotlin.jvm.internal.i.e(onThumbnailClick, "onThumbnailClick");
        kotlin.jvm.internal.i.e(onCtaClick, "onCtaClick");
        C1086g c1086gP = interfaceC1084f.p(1411281377);
        int i12 = i11 & 1;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVar2 = i12 != 0 ? aVar : hVar;
        float f10 = 16;
        androidx.compose.ui.h hVarF = PaddingKt.f(C0932d.b(W.e(W.d(hVar2, 1.0f), 100), H.b(0.5f, H.f13495b), h0.f13629a), f10);
        T tA = S.a(C0945e.g(8), androidx.compose.ui.d.a.f13344k, c1086gP, 54);
        int i13 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarF);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        Ia.p<ComposeUiNode, E, p293xa.r> pVar = ComposeUiNode.Companion.f14337f;
        R0.a(pVar, c1086gP, tA);
        Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar2 = ComposeUiNode.Companion.f14336e;
        R0.a(pVar2, c1086gP, interfaceC1089h0P);
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
            J4.i.d(i13, c1086gP, i13, pVar3);
        }
        Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar4 = ComposeUiNode.Companion.f14335d;
        R0.a(pVar4, c1086gP, hVarC);
        c1086gP.L(-2090574877);
        if (1.0f <= 0.0d) {
            p258v.a.a("invalid weight; must be greater than zero");
        }
        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE));
        E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
        int i14 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
        androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, layoutWeightElement);
        c1086gP.r();
        final androidx.compose.ui.h hVar3 = hVar2;
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(pVar, c1086gP, eD);
        R0.a(pVar2, c1086gP, interfaceC1089h0P2);
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
            J4.i.d(i14, c1086gP, i14, pVar3);
        }
        R0.a(pVar4, c1086gP, hVarC2);
        c1086gP.L(654440355);
        if (uiState.getFiles().size() > 1) {
            ThumbnailList(uiState.getFiles(), uiState.getCurrentPage(), onThumbnailClick, c1086gP, (i10 & 896) | 8);
        }
        c1086gP.T(false);
        c1086gP.T(true);
        String confirmationText = uiState.getConfirmationText();
        if (confirmationText == null || kotlin.text.n.S(confirmationText)) {
            c1086gP.T(false);
        } else {
            androidx.compose.ui.h hVarJ = PaddingKt.j(aVar, 0.0f, 0.0f, f10, 0.0f, 11);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            p270w.a aVar3 = intercomTheme.getShapes(c1086gP, 6).f12430b;
            N n10 = C1051f.f12444a;
            ButtonKt.a(onCtaClick, hVarJ, false, aVar3, C1051f.a(intercomTheme.getColors(c1086gP, 6).m615getAction0d7_KjU(), 0L, 0L, 0L, c1086gP, 14), null, null, null, null, androidx.compose.runtime.internal.a.b(-950541555, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewBottomBarKt$PreviewBottomBar$1$2
                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(u10, interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(U Button, InterfaceC1084f interfaceC1084f2, int i15) {
                    kotlin.jvm.internal.i.e(Button, "$this$Button");
                    if ((i15 & 81) == 16 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                    } else {
                        TextKt.b(uiState.getConfirmationText(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                    }
                }
            }, c1086gP), c1086gP, ((i10 >> 9) & 14) | 805306416, 484);
            c1086gP.T(false);
        }
        c1086gP.T(true);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.preview.ui.i
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PreviewBottomBarKt.PreviewBottomBar$lambda$2(hVar3, uiState, onThumbnailClick, onCtaClick, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PreviewBottomBar$lambda$2(androidx.compose.ui.h hVar, PreviewUiState uiState, Ia.l onThumbnailClick, Ia.a onCtaClick, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(uiState, "$uiState");
        kotlin.jvm.internal.i.e(onThumbnailClick, "$onThumbnailClick");
        kotlin.jvm.internal.i.e(onCtaClick, "$onCtaClick");
        PreviewBottomBar(hVar, uiState, onThumbnailClick, onCtaClick, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    private static final void ThumbnailList(final List<? extends IntercomPreviewFile> list, final int i10, final Ia.l<? super Integer, p293xa.r> lVar, InterfaceC1084f interfaceC1084f, final int i11) {
        C1086g c1086gP = interfaceC1084f.p(-1185141070);
        final LazyListState lazyListStateA = androidx.compose.foundation.lazy.s.a(0, c1086gP, 0, 3);
        Object objF = c1086gP.f();
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        if (objF == c0153a) {
            objF = androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, c1086gP);
            c1086gP.E(objF);
        }
        final A a10 = (A) objF;
        c1086gP.L(1591198182);
        Object objF2 = c1086gP.f();
        if (objF2 == c0153a) {
            objF2 = J0.f(EmptyList.f42983b);
            c1086gP.E(objF2);
        }
        final X x10 = (X) objF2;
        c1086gP.T(false);
        c1086gP.L(1591201463);
        boolean zK = c1086gP.K(lazyListStateA);
        Object objF3 = c1086gP.f();
        if (zK || objF3 == c0153a) {
            objF3 = new PreviewBottomBarKt$ThumbnailList$1$1(lazyListStateA, x10, null);
            c1086gP.E(objF3);
        }
        c1086gP.T(false);
        androidx.compose.runtime.E.d((Ia.p) objF3, c1086gP, "");
        float f10 = 8;
        float f11 = 4;
        LazyDslKt.c(androidx.compose.ui.h.a.f13984b, lazyListStateA, new N(f10, f11, f10, f11), false, C0945e.f10284a, androidx.compose.ui.d.a.f13344k, null, false, null, new Ia.l() { // from class: io.intercom.android.sdk.ui.preview.ui.g
            @Override // Ia.l
            public final Object invoke(Object obj) {
                return PreviewBottomBarKt.ThumbnailList$lambda$8(list, x10, i10, a10, lVar, lazyListStateA, (androidx.compose.foundation.lazy.p) obj);
            }
        }, c1086gP, 221574, 456);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.preview.ui.h
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PreviewBottomBarKt.ThumbnailList$lambda$9(list, i10, lVar, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ThumbnailList$lambda$8(final List files, X visibleItems, final int i10, A scope, final Ia.l onThumbnailClick, LazyListState listState, androidx.compose.foundation.lazy.p LazyRow) {
        kotlin.jvm.internal.i.e(files, "$files");
        kotlin.jvm.internal.i.e(visibleItems, "$visibleItems");
        kotlin.jvm.internal.i.e(scope, "$scope");
        kotlin.jvm.internal.i.e(onThumbnailClick, "$onThumbnailClick");
        kotlin.jvm.internal.i.e(listState, "$listState");
        kotlin.jvm.internal.i.e(LazyRow, "$this$LazyRow");
        LazyRow.g(files.size(), null, new Ia.l<Integer, Object>() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewBottomBarKt$ThumbnailList$lambda$8$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i11) {
                files.get(i11);
                return null;
            }
        }, new ComposableLambdaImpl(true, -1091073711, new Ia.r<androidx.compose.foundation.lazy.b, Integer, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewBottomBarKt$ThumbnailList$lambda$8$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // Ia.r
            public /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.foundation.lazy.b bVar, Integer num, InterfaceC1084f interfaceC1084f, Integer num2) {
                invoke(bVar, num.intValue(), interfaceC1084f, num2.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(androidx.compose.foundation.lazy.b bVar, final int i11, InterfaceC1084f interfaceC1084f, int i12) {
                int i13;
                if ((i12 & 6) == 0) {
                    i13 = i12 | (interfaceC1084f.K(bVar) ? 4 : 2);
                } else {
                    i13 = i12;
                }
                if ((i12 & 48) == 0) {
                    i13 |= interfaceC1084f.h(i11) ? 32 : 16;
                }
                boolean z10 = true;
                if (!interfaceC1084f.C(i13 & 1, (i13 & 147) != 146)) {
                    interfaceC1084f.w();
                    return;
                }
                IntercomPreviewFile intercomPreviewFile = (IntercomPreviewFile) files.get(i11);
                interfaceC1084f.L(534177283);
                long j = i10 == i11 ? H.f13499f : H.f13503k;
                androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                androidx.compose.ui.h hVarF = PaddingKt.f(C0935g.a(aVar, 2, j, p270w.g.a(10)), 4);
                interfaceC1084f.L(-1229685931);
                boolean zK = interfaceC1084f.K(onThumbnailClick);
                if ((((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 || !interfaceC1084f.h(i11)) && (i13 & 48) != 32) {
                    z10 = false;
                }
                boolean z11 = zK | z10;
                Object objF = interfaceC1084f.f();
                if (z11 || objF == InterfaceC1084f.a.f12980a) {
                    final Ia.l lVar = onThumbnailClick;
                    objF = new Ia.a<p293xa.r>() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewBottomBarKt$ThumbnailList$2$1$1$1
                        @Override // Ia.a
                        public /* bridge */ /* synthetic */ p293xa.r invoke() {
                            invoke2();
                            return p293xa.r.f47939a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            lVar.invoke(Integer.valueOf(i11));
                        }
                    };
                    interfaceC1084f.E(objF);
                }
                interfaceC1084f.D();
                androidx.compose.ui.h hVarC = ClickableKt.c(hVarF, false, null, (Ia.a) objF, 7);
                E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                int iF = interfaceC1084f.F();
                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
                androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f, hVarC);
                ComposeUiNode.f14331c0.getClass();
                Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                if (interfaceC1084f.u() == null) {
                    I.b.k();
                    throw null;
                }
                interfaceC1084f.r();
                if (interfaceC1084f.m()) {
                    interfaceC1084f.v(aVar2);
                } else {
                    interfaceC1084f.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f, eD);
                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f, interfaceC1089h0Z);
                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
                    androidx.compose.animation.k.b(iF, interfaceC1084f, iF, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f, hVarC2);
                PreviewUriKt.ThumbnailPreview(A8.p.r(W.m(aVar, 48), p270w.g.a(10)), InterfaceC1161g.a.f14243a, intercomPreviewFile, interfaceC1084f, 560, 0);
                interfaceC1084f.J();
                interfaceC1084f.D();
            }
        }));
        if (!((List) visibleItems.getValue()).contains(Integer.valueOf(i10))) {
            C2680e.c(scope, null, null, new PreviewBottomBarKt$ThumbnailList$2$2(listState, i10, null), 3);
        }
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ThumbnailList$lambda$9(List files, int i10, Ia.l onThumbnailClick, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(files, "$files");
        kotlin.jvm.internal.i.e(onThumbnailClick, "$onThumbnailClick");
        ThumbnailList(files, i10, onThumbnailClick, interfaceC1084f, L4.b.l(i11 | 1));
        return p293xa.r.f47939a;
    }
}
