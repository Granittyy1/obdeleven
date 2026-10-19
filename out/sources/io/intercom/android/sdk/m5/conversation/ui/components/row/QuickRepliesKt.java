package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.InterfaceC0928f;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.InterfaceC0965z;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import com.google.android.gms.internal.measurement.C1787c0;
import io.intercom.android.sdk.m5.components.C2293m0;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.m5.conversation.ui.C2409y;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.Z;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.c0;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: QuickReplies.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class QuickRepliesKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt$QuickReplies$1, reason: invalid class name */
    /* JADX INFO: compiled from: QuickReplies.kt */
    public static final class AnonymousClass1 implements Ia.q<InterfaceC0965z, InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ Ia.l<QuickReply, p293xa.r> $onQuickReplyClick;
        final /* synthetic */ List<QuickReply> $quickReplies;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(List<QuickReply> list, Ia.l<? super QuickReply, p293xa.r> lVar) {
            this.$quickReplies = list;
            this.$onQuickReplyClick = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$2$lambda$1$lambda$0(Ia.l onQuickReplyClick, QuickReply it) {
            kotlin.jvm.internal.i.e(onQuickReplyClick, "$onQuickReplyClick");
            kotlin.jvm.internal.i.e(it, "$it");
            onQuickReplyClick.invoke(it);
            return p293xa.r.f47939a;
        }

        @Override // Ia.q
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0965z interfaceC0965z, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC0965z, interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC0965z FlowRow, InterfaceC1084f interfaceC1084f, int i10) {
            kotlin.jvm.internal.i.e(FlowRow, "$this$FlowRow");
            if ((i10 & 81) == 16 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            List<QuickReply> list = this.$quickReplies;
            Object obj = this.$onQuickReplyClick;
            for (final QuickReply quickReply : list) {
                interfaceC1084f.L(373518625);
                boolean zK = interfaceC1084f.K(obj) | interfaceC1084f.K(quickReply);
                Object objF = interfaceC1084f.f();
                if (zK || objF == InterfaceC1084f.a.f12980a) {
                    objF = new F(obj, 0, quickReply);
                    interfaceC1084f.E(objF);
                }
                Ia.a aVar = (Ia.a) objF;
                interfaceC1084f.D();
                IntercomCardStyle intercomCardStyle = IntercomCardStyle.INSTANCE;
                p270w.f fVarB = p270w.g.b(20);
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i11 = IntercomTheme.$stable;
                IntercomCardKt.IntercomCard(aVar, null, false, intercomCardStyle.m531defaultStyleqUnfpCA(fVarB, intercomTheme.getColors(interfaceC1084f, i11).m621getBackground0d7_KjU(), intercomTheme.getColors(interfaceC1084f, i11).m645getPrimaryText0d7_KjU(), 0, C1787c0.a(1, intercomTheme.getColors(interfaceC1084f, i11).m623getBorder0d7_KjU()), 0L, interfaceC1084f, (IntercomCardStyle.$stable << 18) | 3072, 32), null, androidx.compose.runtime.internal.a.b(-1399332631, new Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt$QuickReplies$1$1$2
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0954n interfaceC0954n, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0954n, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0954n IntercomCard, InterfaceC1084f interfaceC1084f2, int i12) {
                        kotlin.jvm.internal.i.e(IntercomCard, "$this$IntercomCard");
                        if ((i12 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        androidx.compose.ui.h hVarG = PaddingKt.g(16, 12, androidx.compose.ui.h.a.f13984b);
                        String text = quickReply.getText();
                        IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                        int i13 = IntercomTheme.$stable;
                        TextKt.b(text, hVarG, intercomTheme2.getColors(interfaceC1084f2, i13).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme2.getTypography(interfaceC1084f2, i13).getType04Point5(), interfaceC1084f2, 0, 0, 65016);
                    }
                }, interfaceC1084f), interfaceC1084f, (IntercomCardStyle.Style.$stable << 9) | 196608, 22);
            }
        }
    }

    public static final void AnimatedQuickReplies(final List<ReplyOption> replyOptions, final Ia.l<? super ReplyOption, p293xa.r> onReplyClicked, InterfaceC1084f interfaceC1084f, final int i10) {
        kotlin.jvm.internal.i.e(replyOptions, "replyOptions");
        kotlin.jvm.internal.i.e(onReplyClicked, "onReplyClicked");
        C1086g c1086gP = interfaceC1084f.p(-2072519615);
        c1086gP.L(-407350720);
        Object objF = c1086gP.f();
        Object obj = objF;
        if (objF == InterfaceC1084f.a.f12980a) {
            androidx.compose.animation.core.K k10 = new androidx.compose.animation.core.K(Boolean.FALSE);
            k10.f(Boolean.TRUE);
            c1086gP.E(k10);
            obj = k10;
        }
        c1086gP.T(false);
        AnimatedVisibilityKt.b((androidx.compose.animation.core.K) obj, null, EnterExitTransitionKt.n(new o(1)).b(EnterExitTransitionKt.e(null, 0.0f, 3)), EnterExitTransitionKt.f(null, 3), null, androidx.compose.runtime.internal.a.b(992499481, new Ia.q<InterfaceC0928f, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt.AnimatedQuickReplies.2
            @Override // Ia.q
            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0928f interfaceC0928f, InterfaceC1084f interfaceC1084f2, Integer num) {
                invoke(interfaceC0928f, interfaceC1084f2, num.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(InterfaceC0928f AnimatedVisibility, InterfaceC1084f interfaceC1084f2, int i11) {
                kotlin.jvm.internal.i.e(AnimatedVisibility, "$this$AnimatedVisibility");
                float f10 = 16;
                QuickRepliesKt.ReplyOptions(PaddingKt.j(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), f10, 0.0f, f10, 0.0f, 10), replyOptions, onReplyClicked, interfaceC1084f2, 70, 0);
            }
        }, c1086gP), c1086gP, 200064, 18);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.C
                @Override // Ia.p
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return QuickRepliesKt.AnimatedQuickReplies$lambda$14(replyOptions, onReplyClicked, i10, (InterfaceC1084f) obj2, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AnimatedQuickReplies$lambda$13(int i10) {
        return i10 / 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r AnimatedQuickReplies$lambda$14(List replyOptions, Ia.l onReplyClicked, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(replyOptions, "$replyOptions");
        kotlin.jvm.internal.i.e(onReplyClicked, "$onReplyClicked");
        AnimatedQuickReplies(replyOptions, onReplyClicked, interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final void ComposerSuggestions(androidx.compose.ui.h hVar, List<ReplySuggestion> suggestions, Ia.l<? super ReplySuggestion, p293xa.r> onSuggestionClick, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        kotlin.jvm.internal.i.e(suggestions, "suggestions");
        kotlin.jvm.internal.i.e(onSuggestionClick, "onSuggestionClick");
        C1086g c1086gP = interfaceC1084f.p(-719570861);
        if ((i11 & 1) != 0) {
            hVar = androidx.compose.ui.h.a.f13984b;
        }
        List<ReplySuggestion> list = suggestions;
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(list, 10));
        for (ReplySuggestion replySuggestion : list) {
            arrayList.add(new QuickReply(replySuggestion.getId(), replySuggestion.getText()));
        }
        QuickReplies(arrayList, new c0(suggestions, 1, onSuggestionClick), hVar, c1086gP, ((i10 << 6) & 896) | 8, 0);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new E(i10, i11, onSuggestionClick, hVar, suggestions);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ComposerSuggestions$lambda$10(androidx.compose.ui.h hVar, List suggestions, Ia.l onSuggestionClick, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(suggestions, "$suggestions");
        kotlin.jvm.internal.i.e(onSuggestionClick, "$onSuggestionClick");
        ComposerSuggestions(hVar, suggestions, onSuggestionClick, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ComposerSuggestions$lambda$9(List suggestions, Ia.l onSuggestionClick, QuickReply quickReply) {
        Object next;
        kotlin.jvm.internal.i.e(suggestions, "$suggestions");
        kotlin.jvm.internal.i.e(onSuggestionClick, "$onSuggestionClick");
        kotlin.jvm.internal.i.e(quickReply, "quickReply");
        Iterator it = suggestions.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.i.a(((ReplySuggestion) next).getId(), quickReply.getId()));
        ReplySuggestion replySuggestion = (ReplySuggestion) next;
        if (replySuggestion != null) {
            onSuggestionClick.invoke(replySuggestion);
        }
        return p293xa.r.f47939a;
    }

    public static final void QuickReplies(final List<QuickReply> quickReplies, final Ia.l<? super QuickReply, p293xa.r> onQuickReplyClick, androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        kotlin.jvm.internal.i.e(quickReplies, "quickReplies");
        kotlin.jvm.internal.i.e(onQuickReplyClick, "onQuickReplyClick");
        C1086g c1086gP = interfaceC1084f.p(368433331);
        final androidx.compose.ui.h hVar2 = (i11 & 4) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        androidx.compose.ui.h hVarD = W.d(hVar2, 1.0f);
        C0945e.j jVar = C0945e.f10284a;
        float f10 = 8;
        FlowLayoutKt.a(hVarD, C0945e.h(f10, androidx.compose.ui.d.a.f13348o), C0945e.i(f10, androidx.compose.ui.d.a.f13345l), null, 0, 0, androidx.compose.runtime.internal.a.b(-458232018, new AnonymousClass1(quickReplies, onQuickReplyClick), c1086gP), c1086gP, 1573296, 56);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.D
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return QuickRepliesKt.QuickReplies$lambda$0(quickReplies, onQuickReplyClick, hVar2, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r QuickReplies$lambda$0(List quickReplies, Ia.l onQuickReplyClick, androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(quickReplies, "$quickReplies");
        kotlin.jvm.internal.i.e(onQuickReplyClick, "$onQuickReplyClick");
        QuickReplies(quickReplies, onQuickReplyClick, hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void QuickRepliesPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1503246755);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$QuickRepliesKt.INSTANCE.m235getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2293m0(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r QuickRepliesPreview$lambda$15(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        QuickRepliesPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final void ReplyOptions(androidx.compose.ui.h hVar, List<ReplyOption> replyOptions, Ia.l<? super ReplyOption, p293xa.r> onReplyClicked, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        kotlin.jvm.internal.i.e(replyOptions, "replyOptions");
        kotlin.jvm.internal.i.e(onReplyClicked, "onReplyClicked");
        C1086g c1086gP = interfaceC1084f.p(-1003293676);
        if ((i11 & 1) != 0) {
            hVar = androidx.compose.ui.h.a.f13984b;
        }
        List<ReplyOption> list = replyOptions;
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(list, 10));
        for (ReplyOption replyOption : list) {
            arrayList.add(new QuickReply(replyOption.getUuid(), replyOption.getText()));
        }
        QuickReplies(arrayList, new C2409y(replyOptions, 1, onReplyClicked), hVar, c1086gP, ((i10 << 6) & 896) | 8, 0);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Z(i10, i11, onReplyClicked, hVar, replyOptions);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ReplyOptions$lambda$4(List replyOptions, Ia.l onReplyClicked, QuickReply quickReply) {
        Object next;
        kotlin.jvm.internal.i.e(replyOptions, "$replyOptions");
        kotlin.jvm.internal.i.e(onReplyClicked, "$onReplyClicked");
        kotlin.jvm.internal.i.e(quickReply, "quickReply");
        Iterator it = replyOptions.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.i.a(((ReplyOption) next).getUuid(), quickReply.getId()));
        ReplyOption replyOption = (ReplyOption) next;
        if (replyOption != null) {
            onReplyClicked.invoke(replyOption);
        }
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ReplyOptions$lambda$5(androidx.compose.ui.h hVar, List replyOptions, Ia.l onReplyClicked, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(replyOptions, "$replyOptions");
        kotlin.jvm.internal.i.e(onReplyClicked, "$onReplyClicked");
        ReplyOptions(hVar, replyOptions, onReplyClicked, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }
}
