package io.intercom.android.sdk.m5.conversation.ui.components;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0949i;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.InlineSource;
import io.intercom.android.sdk.models.Source;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.LinkOpener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: InlineSourcesSheetContent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class InlineSourcesSheetContentKt {
    public static final void InlineSourcesSheetContent(final List<InlineSource> selectedSources, final List<Source> sources, androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        String strP;
        kotlin.jvm.internal.i.e(selectedSources, "selectedSources");
        kotlin.jvm.internal.i.e(sources, "sources");
        C1086g c1086gP = interfaceC1084f.p(-2127469664);
        int i12 = i11 & 4;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVar2 = i12 != 0 ? aVar : hVar;
        androidx.compose.ui.h hVarG = androidx.compose.foundation.layout.W.g(androidx.compose.foundation.layout.W.d(aVar, 1.0f), 0.0f, ((Configuration) c1086gP.x(AndroidCompositionLocals_androidKt.f14792a)).screenHeightDp * 0.5f, 1);
        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
        int i13 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarG);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
            J4.i.d(i13, c1086gP, i13, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        androidx.compose.ui.h hVarJ = PaddingKt.j(PaddingKt.h(androidx.compose.foundation.layout.W.d(aVar, 1.0f), 40, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16, 7);
        if (sources.size() == 1) {
            c1086gP.L(504735737);
            strP = S4.o.p(c1086gP, R.string.intercom_source);
            c1086gP.T(false);
        } else {
            c1086gP.L(504813144);
            strP = S4.o.p(c1086gP, R.string.intercom_sources);
            c1086gP.T(false);
        }
        TextKt.b(strP, hVarJ, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04(), c1086gP, 48, 0, 65532);
        LazyDslKt.a(null, null, null, false, null, null, null, false, null, new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.w
            @Override // Ia.l
            public final Object invoke(Object obj) {
                return InlineSourcesSheetContentKt.InlineSourcesSheetContent$lambda$11$lambda$10(sources, selectedSources, (androidx.compose.foundation.lazy.p) obj);
            }
        }, c1086gP, 0, 511);
        c1086gP.T(true);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.h hVar3 = hVar2;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.x
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return InlineSourcesSheetContentKt.InlineSourcesSheetContent$lambda$12(selectedSources, sources, hVar3, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r InlineSourcesSheetContent$lambda$11$lambda$10(final List sources, final List selectedSources, androidx.compose.foundation.lazy.p LazyColumn) {
        kotlin.jvm.internal.i.e(sources, "$sources");
        kotlin.jvm.internal.i.e(selectedSources, "$selectedSources");
        kotlin.jvm.internal.i.e(LazyColumn, "$this$LazyColumn");
        final C2387y c2387y = new C2387y(0);
        LazyColumn.g(sources.size(), new Ia.l<Integer, Object>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.InlineSourcesSheetContentKt$InlineSourcesSheetContent$lambda$11$lambda$10$$inlined$itemsIndexed$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i10) {
                return c2387y.invoke(Integer.valueOf(i10), sources.get(i10));
            }
        }, new Ia.l<Integer, Object>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.InlineSourcesSheetContentKt$InlineSourcesSheetContent$lambda$11$lambda$10$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i10) {
                sources.get(i10);
                return null;
            }
        }, new ComposableLambdaImpl(true, -1091073711, new Ia.r<androidx.compose.foundation.lazy.b, Integer, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.InlineSourcesSheetContentKt$InlineSourcesSheetContent$lambda$11$lambda$10$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // Ia.r
            public /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.foundation.lazy.b bVar, Integer num, InterfaceC1084f interfaceC1084f, Integer num2) {
                invoke(bVar, num.intValue(), interfaceC1084f, num2.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(androidx.compose.foundation.lazy.b bVar, int i10, InterfaceC1084f interfaceC1084f, int i11) {
                int i12;
                boolean z10;
                long jM621getBackground0d7_KjU;
                Ia.a<ComposeUiNode> aVar;
                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar;
                int i13;
                IntercomTheme intercomTheme;
                final long jM618getAdminBackground0d7_KjU;
                if ((i11 & 6) == 0) {
                    i12 = i11 | (interfaceC1084f.K(bVar) ? 4 : 2);
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= interfaceC1084f.h(i10) ? 32 : 16;
                }
                if (!interfaceC1084f.C(i12 & 1, (i12 & 147) != 146)) {
                    interfaceC1084f.w();
                    return;
                }
                final Source source = (Source) sources.get(i10);
                interfaceC1084f.L(-1170768112);
                List list = selectedSources;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z10 = false;
                            break;
                        } else if (kotlin.jvm.internal.i.a(((InlineSource) it.next()).getHref(), source.getUrl())) {
                            z10 = true;
                            break;
                        }
                    }
                } else {
                    z10 = false;
                    break;
                }
                final boolean zA = kotlin.jvm.internal.i.a(source.getType(), "article");
                final Context context = (Context) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14793b);
                androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                C0945e.k kVar = C0945e.f10286c;
                androidx.compose.ui.f.a aVar3 = androidx.compose.ui.d.a.f13346m;
                C0953m c0953mA = C0952l.a(kVar, aVar3, interfaceC1084f, 0);
                int iF = interfaceC1084f.F();
                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f, aVar2);
                ComposeUiNode.f14331c0.getClass();
                Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
                if (interfaceC1084f.u() == null) {
                    I.b.k();
                    throw null;
                }
                interfaceC1084f.r();
                if (interfaceC1084f.m()) {
                    interfaceC1084f.v(aVar4);
                } else {
                    interfaceC1084f.A();
                }
                Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar2 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar2, interfaceC1084f, c0953mA);
                Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar3 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar3, interfaceC1084f, interfaceC1089h0Z);
                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar4 = ComposeUiNode.Companion.f14338g;
                if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
                    androidx.compose.animation.k.b(iF, interfaceC1084f, iF, pVar4);
                }
                Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar5 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar5, interfaceC1084f, hVarC);
                androidx.compose.ui.f.b bVar2 = androidx.compose.ui.d.a.f13344k;
                if (z10) {
                    interfaceC1084f.L(328418136);
                    jM621getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m618getAdminBackground0d7_KjU();
                    interfaceC1084f.D();
                } else {
                    interfaceC1084f.L(328531069);
                    jM621getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m621getBackground0d7_KjU();
                    interfaceC1084f.D();
                }
                float f10 = 24;
                androidx.compose.ui.h hVarJ = PaddingKt.j(PaddingKt.h(ClickableKt.c(C0932d.b(aVar2, jM621getBackground0d7_KjU, h0.f13629a), false, null, new Ia.a<p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.InlineSourcesSheetContentKt$InlineSourcesSheetContent$1$1$2$1$1
                    @Override // Ia.a
                    public /* bridge */ /* synthetic */ p293xa.r invoke() {
                        invoke2();
                        return p293xa.r.f47939a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        LinkOpener.handleUrl(source.getUrl(), context, Injector.get().getApi(), zA);
                    }
                }, 7), 0.0f, f10, 1), 0.0f, 0.0f, f10, 0.0f, 11);
                C0945e.j jVar = C0945e.f10284a;
                androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(jVar, bVar2, interfaceC1084f, 48);
                int iF2 = interfaceC1084f.F();
                InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f.z();
                androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f, hVarJ);
                if (interfaceC1084f.u() == null) {
                    I.b.k();
                    throw null;
                }
                interfaceC1084f.r();
                if (interfaceC1084f.m()) {
                    interfaceC1084f.v(aVar4);
                } else {
                    interfaceC1084f.A();
                }
                R0.a(pVar2, interfaceC1084f, tA);
                R0.a(pVar3, interfaceC1084f, interfaceC1089h0Z2);
                if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF2))) {
                    androidx.compose.animation.k.b(iF2, interfaceC1084f, iF2, pVar4);
                }
                R0.a(pVar5, interfaceC1084f, hVarC2);
                androidx.compose.ui.h hVarQ = androidx.compose.foundation.layout.W.q(aVar2, 40);
                androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13335a;
                androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                int iF3 = interfaceC1084f.F();
                InterfaceC1089h0 interfaceC1089h0Z3 = interfaceC1084f.z();
                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f, hVarQ);
                if (interfaceC1084f.u() == null) {
                    I.b.k();
                    throw null;
                }
                interfaceC1084f.r();
                if (interfaceC1084f.m()) {
                    interfaceC1084f.v(aVar4);
                } else {
                    interfaceC1084f.A();
                }
                R0.a(pVar2, interfaceC1084f, eD);
                R0.a(pVar3, interfaceC1084f, interfaceC1089h0Z3);
                if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF3))) {
                    androidx.compose.animation.k.b(iF3, interfaceC1084f, iF3, pVar4);
                }
                R0.a(pVar5, interfaceC1084f, hVarC3);
                C0949i c0949i = C0949i.f10304a;
                String strValueOf = String.valueOf(i10 + 1);
                IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                int i14 = IntercomTheme.$stable;
                androidx.compose.ui.text.F type05 = intercomTheme2.getTypography(interfaceC1084f, i14).getType05();
                androidx.compose.ui.text.font.l lVar = androidx.compose.ui.text.font.l.f15443h;
                androidx.compose.ui.f fVar2 = androidx.compose.ui.d.a.f13339e;
                TextKt.b(strValueOf, c0949i.f(aVar2, fVar2), 0L, 0L, null, lVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, type05, interfaceC1084f, 196608, 0, 65500);
                interfaceC1084f.J();
                androidx.compose.ui.h hVarD = androidx.compose.foundation.layout.W.d(aVar2, 1.0f);
                float f11 = 8;
                C0953m c0953mA2 = C0952l.a(C0945e.g(f11), aVar3, interfaceC1084f, 6);
                int iF4 = interfaceC1084f.F();
                InterfaceC1089h0 interfaceC1089h0Z4 = interfaceC1084f.z();
                androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(interfaceC1084f, hVarD);
                if (interfaceC1084f.u() == null) {
                    I.b.k();
                    throw null;
                }
                interfaceC1084f.r();
                if (interfaceC1084f.m()) {
                    aVar = aVar4;
                    interfaceC1084f.v(aVar);
                } else {
                    aVar = aVar4;
                    interfaceC1084f.A();
                }
                R0.a(pVar2, interfaceC1084f, c0953mA2);
                R0.a(pVar3, interfaceC1084f, interfaceC1089h0Z4);
                if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF4))) {
                    pVar = pVar4;
                    androidx.compose.animation.k.b(iF4, interfaceC1084f, iF4, pVar);
                } else {
                    pVar = pVar4;
                }
                R0.a(pVar5, interfaceC1084f, hVarC4);
                androidx.compose.foundation.layout.T tA2 = androidx.compose.foundation.layout.S.a(jVar, bVar2, interfaceC1084f, 48);
                int iF5 = interfaceC1084f.F();
                InterfaceC1089h0 interfaceC1089h0Z5 = interfaceC1084f.z();
                androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(interfaceC1084f, aVar2);
                if (interfaceC1084f.u() == null) {
                    I.b.k();
                    throw null;
                }
                interfaceC1084f.r();
                if (interfaceC1084f.m()) {
                    interfaceC1084f.v(aVar);
                } else {
                    interfaceC1084f.A();
                }
                R0.a(pVar2, interfaceC1084f, tA2);
                R0.a(pVar3, interfaceC1084f, interfaceC1089h0Z5);
                if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF5))) {
                    androidx.compose.animation.k.b(iF5, interfaceC1084f, iF5, pVar);
                }
                R0.a(pVar5, interfaceC1084f, hVarC5);
                if (z10) {
                    interfaceC1084f.L(1230588762);
                    i13 = i14;
                    intercomTheme = intercomTheme2;
                    jM618getAdminBackground0d7_KjU = intercomTheme.getColors(interfaceC1084f, i13).m648getSourceBackground0d7_KjU();
                    interfaceC1084f.D();
                } else {
                    i13 = i14;
                    intercomTheme = intercomTheme2;
                    interfaceC1084f.L(1230702811);
                    jM618getAdminBackground0d7_KjU = intercomTheme.getColors(interfaceC1084f, i13).m618getAdminBackground0d7_KjU();
                    interfaceC1084f.D();
                }
                androidx.compose.ui.h hVarM = androidx.compose.foundation.layout.W.m(aVar2, f10);
                interfaceC1084f.L(455352025);
                boolean zI = interfaceC1084f.i(jM618getAdminBackground0d7_KjU);
                Object objF = interfaceC1084f.f();
                if (zI || objF == InterfaceC1084f.a.f12980a) {
                    objF = new Ia.l<J.e, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.InlineSourcesSheetContentKt$InlineSourcesSheetContent$1$1$2$1$2$2$1$1$1
                        @Override // Ia.l
                        public /* bridge */ /* synthetic */ p293xa.r invoke(J.e eVar) {
                            invoke2(eVar);
                            return p293xa.r.f47939a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(J.e drawBehind) {
                            kotlin.jvm.internal.i.e(drawBehind, "$this$drawBehind");
                            drawBehind.S(jM618getAdminBackground0d7_KjU, (me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(drawBehind.j()) / 2.0f : 0.0f, (me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? drawBehind.j1() : 0L, 1.0f, J.h.f3954a, null, (me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
                        }
                    };
                    interfaceC1084f.E(objF);
                }
                interfaceC1084f.D();
                androidx.compose.ui.h hVarA = androidx.compose.ui.draw.f.a(hVarM, (Ia.l) objF);
                androidx.compose.ui.layout.E eD2 = BoxKt.d(fVar, false);
                int iF6 = interfaceC1084f.F();
                InterfaceC1089h0 interfaceC1089h0Z6 = interfaceC1084f.z();
                androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(interfaceC1084f, hVarA);
                if (interfaceC1084f.u() == null) {
                    I.b.k();
                    throw null;
                }
                interfaceC1084f.r();
                if (interfaceC1084f.m()) {
                    interfaceC1084f.v(aVar);
                } else {
                    interfaceC1084f.A();
                }
                R0.a(pVar2, interfaceC1084f, eD2);
                R0.a(pVar3, interfaceC1084f, interfaceC1089h0Z6);
                if (interfaceC1084f.m() || !kotlin.jvm.internal.i.a(interfaceC1084f.f(), Integer.valueOf(iF6))) {
                    androidx.compose.animation.k.b(iF6, interfaceC1084f, iF6, pVar);
                }
                R0.a(pVar5, interfaceC1084f, hVarC6);
                IconKt.a(U.c.a(zA ? io.intercom.android.sdk.ui.R.drawable.intercom_ic_public_article : io.intercom.android.sdk.ui.R.drawable.intercom_ic_link, interfaceC1084f, 0), null, c0949i.f(androidx.compose.foundation.layout.W.m(aVar2, 12), fVar2), intercomTheme.getColors(interfaceC1084f, i13).m630getDescriptionText0d7_KjU(), interfaceC1084f, 56, 0);
                interfaceC1084f.J();
                Lb.a.a(interfaceC1084f, androidx.compose.foundation.layout.W.q(aVar2, f11));
                interfaceC1084f.L(455394169);
                String strP = zA ? S4.o.p(interfaceC1084f, R.string.intercom_help_center_article) : InlineSourcesSheetContentKt.getHost(source.getUrl());
                interfaceC1084f.D();
                kotlin.jvm.internal.i.b(strP);
                TextKt.b(strP, null, intercomTheme.getColors(interfaceC1084f, i13).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(interfaceC1084f, i13).getType04Point5(), interfaceC1084f, 0, 0, 65530);
                interfaceC1084f.J();
                TextKt.b(source.getTitle(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, androidx.compose.ui.text.F.a(intercomTheme.getTypography(interfaceC1084f, i13).getType04Point5(), 0L, 0L, androidx.compose.ui.text.font.l.f15444i, null, 0L, null, 0, 0L, null, null, 16777211), interfaceC1084f, 0, 0, 65534);
                interfaceC1084f.J();
                interfaceC1084f.J();
                IntercomDividerKt.IntercomDivider(null, interfaceC1084f, 0, 1);
                interfaceC1084f.J();
                interfaceC1084f.D();
            }
        }));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object InlineSourcesSheetContent$lambda$11$lambda$10$lambda$0(int i10, Source source) {
        kotlin.jvm.internal.i.e(source, "source");
        return source.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r InlineSourcesSheetContent$lambda$12(List selectedSources, List sources, androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(selectedSources, "$selectedSources");
        kotlin.jvm.internal.i.e(sources, "$sources");
        InlineSourcesSheetContent(selectedSources, sources, hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void InlineSourcesSheetContentPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1197768873);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$InlineSourcesSheetContentKt.INSTANCE.m161getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.components.Q(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r InlineSourcesSheetContentPreview$lambda$13(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        InlineSourcesSheetContentPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getHost(String str) {
        try {
            return new URL(str).getHost();
        } catch (MalformedURLException unused) {
            return str;
        }
    }
}
