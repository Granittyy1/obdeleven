package io.intercom.android.sdk.m5.helpcenter.ui.components;

import android.content.Context;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.sections.Author;
import io.intercom.android.sdk.m5.components.AvatarGroupKt;
import io.intercom.android.sdk.m5.components.C2278f;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: CollectionSummaryComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CollectionSummaryComponentKt {
    /* JADX WARN: Code duplicated, block: B:19:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:20:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:25:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:28:0x013e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0191  */
    /* JADX WARN: Code duplicated, block: B:33:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:35:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:40:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:43:0x020f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0213  */
    /* JADX WARN: Code duplicated, block: B:49:0x022e  */
    /* JADX WARN: Code duplicated, block: B:53:0x02a5 A[LOOP:0: B:51:0x029f->B:53:0x02a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    public static final void CollectionSummaryComponent(CollectionDetailsUiState.Content state, androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        androidx.compose.ui.h hVar2;
        int i12;
        int i13;
        IntercomTheme intercomTheme;
        androidx.compose.ui.h.a aVar;
        int i14;
        Ia.a<ComposeUiNode> aVar2;
        int i15;
        ArrayList arrayList;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(state, "state");
        C1086g c1086gP = interfaceC1084f.p(-2122142392);
        int i16 = i11 & 2;
        androidx.compose.ui.h.a aVar3 = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVar3 = i16 != 0 ? aVar3 : hVar;
        Context context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
        androidx.compose.ui.h hVarD = W.d(hVar3, 1.0f);
        IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
        int i17 = IntercomTheme.$stable;
        androidx.compose.ui.h hVarB = C0932d.b(hVarD, intercomTheme2.getColors(c1086gP, i17).m621getBackground0d7_KjU(), h0.f13629a);
        C0945e.k kVar = C0945e.f10286c;
        androidx.compose.ui.f.a aVar4 = androidx.compose.ui.d.a.f13346m;
        C0953m c0953mA = C0952l.a(kVar, aVar4, c1086gP, 0);
        int i18 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarB);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar5 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar5);
        } else {
            c1086gP.A();
        }
        Ia.p<ComposeUiNode, E, p293xa.r> pVar = ComposeUiNode.Companion.f14337f;
        R0.a(pVar, c1086gP, c0953mA);
        Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar2 = ComposeUiNode.Companion.f14336e;
        R0.a(pVar2, c1086gP, interfaceC1089h0P);
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
        if (!c1086gP.f12995O) {
            hVar2 = hVar3;
            if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i18))) {
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar4 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar4, c1086gP, hVarC);
            androidx.compose.ui.h hVarF = PaddingKt.f(aVar3, 16);
            C0953m c0953mA2 = C0952l.a(kVar, aVar4, c1086gP, 0);
            i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarF);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar5);
            } else {
                c1086gP.A();
            }
            R0.a(pVar, c1086gP, c0953mA2);
            R0.a(pVar2, c1086gP, interfaceC1089h0P2);
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar3);
            }
            R0.a(pVar4, c1086gP, hVarC2);
            TextKt.b(state.getTitle(), null, intercomTheme2.getColors(c1086gP, i17).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme2.getTypography(c1086gP, i17).getType04SemiBold(), c1086gP, 0, 0, 65530);
            c1086gP.L(2075464466);
            if (kotlin.text.n.S(state.getSummary())) {
                i13 = i17;
                intercomTheme = intercomTheme2;
                aVar = aVar3;
            } else {
                Lb.a.a(c1086gP, W.e(aVar3, 4));
                i13 = i17;
                intercomTheme = intercomTheme2;
                aVar = aVar3;
                TextKt.b(state.getSummary(), null, intercomTheme2.getColors(c1086gP, i17).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme2.getTypography(c1086gP, i17).getType04Point5(), c1086gP, 0, 0, 65530);
            }
            c1086gP.T(false);
            androidx.compose.ui.h.a aVar6 = aVar;
            Lb.a.a(c1086gP, W.e(aVar6, 20));
            androidx.compose.ui.h hVarD2 = W.d(aVar6, 1.0f);
            T tA = S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
            i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarD2);
            c1086gP.r();
            if (c1086gP.f12995O) {
                aVar2 = aVar5;
                c1086gP.v(aVar2);
            } else {
                aVar2 = aVar5;
                c1086gP.A();
            }
            R0.a(pVar, c1086gP, tA);
            R0.a(pVar2, c1086gP, interfaceC1089h0P3);
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
                J4.i.d(i14, c1086gP, i14, pVar3);
            }
            R0.a(pVar4, c1086gP, hVarC3);
            C0953m c0953mA3 = C0952l.a(kVar, aVar4, c1086gP, 0);
            i15 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
            androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, aVar6);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar, c1086gP, c0953mA3);
            R0.a(pVar2, c1086gP, interfaceC1089h0P4);
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i15))) {
                J4.i.d(i15, c1086gP, i15, pVar3);
            }
            R0.a(pVar4, c1086gP, hVarC4);
            ArticleCountComponentKt.ArticleCountComponent(null, state.getArticlesCount(), c1086gP, 0, 1);
            TextKt.b(constructByAuthorsText(context, state.getAuthors()), null, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i13).getType04Point5(), c1086gP, 384, 48, 63482);
            c1086gP.T(true);
            List<Author> listI0 = kotlin.collections.q.i0(state.getAuthors(), 3);
            arrayList = new ArrayList(kotlin.collections.m.y(listI0, 10));
            for (Author author : listI0) {
                Avatar avatarCreate = Avatar.create(author.getAvatar().getImageUrl(), author.getAvatar().getInitials());
                kotlin.jvm.internal.i.d(avatarCreate, "create(...)");
                arrayList.add(new AvatarWrapper(avatarCreate, false));
            }
            AvatarGroupKt.m59AvatarGroupJ8mCjc(arrayList, null, 32, 0L, c1086gP, 392, 10);
            c1086gP.T(true);
            c1086gP.T(true);
            IntercomDividerKt.IntercomDivider(null, c1086gP, 0, 1);
            c1086gP.T(true);
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new io.intercom.android.sdk.m5.conversation.ui.components.row.q(state, hVar2, i10, i11, 1);
            }
        }
        hVar2 = hVar3;
        J4.i.d(i18, c1086gP, i18, pVar3);
        Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar5 = ComposeUiNode.Companion.f14335d;
        R0.a(pVar5, c1086gP, hVarC);
        androidx.compose.ui.h hVarF2 = PaddingKt.f(aVar3, 16);
        C0953m c0953mA4 = C0952l.a(kVar, aVar4, c1086gP, 0);
        i12 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
        androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, hVarF2);
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar5);
        } else {
            c1086gP.A();
        }
        R0.a(pVar, c1086gP, c0953mA4);
        R0.a(pVar2, c1086gP, interfaceC1089h0P5);
        if (c1086gP.f12995O) {
            J4.i.d(i12, c1086gP, i12, pVar3);
        } else {
            J4.i.d(i12, c1086gP, i12, pVar3);
        }
        R0.a(pVar5, c1086gP, hVarC5);
        TextKt.b(state.getTitle(), null, intercomTheme2.getColors(c1086gP, i17).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme2.getTypography(c1086gP, i17).getType04SemiBold(), c1086gP, 0, 0, 65530);
        c1086gP.L(2075464466);
        if (kotlin.text.n.S(state.getSummary())) {
            Lb.a.a(c1086gP, W.e(aVar3, 4));
            i13 = i17;
            intercomTheme = intercomTheme2;
            aVar = aVar3;
            TextKt.b(state.getSummary(), null, intercomTheme2.getColors(c1086gP, i17).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme2.getTypography(c1086gP, i17).getType04Point5(), c1086gP, 0, 0, 65530);
        } else {
            i13 = i17;
            intercomTheme = intercomTheme2;
            aVar = aVar3;
        }
        c1086gP.T(false);
        androidx.compose.ui.h.a aVar7 = aVar;
        Lb.a.a(c1086gP, W.e(aVar7, 20));
        androidx.compose.ui.h hVarD3 = W.d(aVar7, 1.0f);
        T tA2 = S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
        i14 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
        androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086gP, hVarD3);
        c1086gP.r();
        if (c1086gP.f12995O) {
            aVar2 = aVar5;
            c1086gP.v(aVar2);
        } else {
            aVar2 = aVar5;
            c1086gP.A();
        }
        R0.a(pVar, c1086gP, tA2);
        R0.a(pVar2, c1086gP, interfaceC1089h0P6);
        if (c1086gP.f12995O) {
            J4.i.d(i14, c1086gP, i14, pVar3);
        } else {
            J4.i.d(i14, c1086gP, i14, pVar3);
        }
        R0.a(pVar5, c1086gP, hVarC6);
        C0953m c0953mA5 = C0952l.a(kVar, aVar4, c1086gP, 0);
        i15 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
        androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(c1086gP, aVar7);
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(pVar, c1086gP, c0953mA5);
        R0.a(pVar2, c1086gP, interfaceC1089h0P7);
        if (c1086gP.f12995O) {
            J4.i.d(i15, c1086gP, i15, pVar3);
        } else {
            J4.i.d(i15, c1086gP, i15, pVar3);
        }
        R0.a(pVar5, c1086gP, hVarC7);
        ArticleCountComponentKt.ArticleCountComponent(null, state.getArticlesCount(), c1086gP, 0, 1);
        TextKt.b(constructByAuthorsText(context, state.getAuthors()), null, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i13).getType04Point5(), c1086gP, 384, 48, 63482);
        c1086gP.T(true);
        List<Author> listI1 = kotlin.collections.q.i0(state.getAuthors(), 3);
        arrayList = new ArrayList(kotlin.collections.m.y(listI1, 10));
        while (r1.hasNext()) {
            Avatar avatarCreate2 = Avatar.create(author.getAvatar().getImageUrl(), author.getAvatar().getInitials());
            kotlin.jvm.internal.i.d(avatarCreate2, "create(...)");
            arrayList.add(new AvatarWrapper(avatarCreate2, false));
        }
        AvatarGroupKt.m59AvatarGroupJ8mCjc(arrayList, null, 32, 0L, c1086gP, 392, 10);
        c1086gP.T(true);
        c1086gP.T(true);
        IntercomDividerKt.IntercomDivider(null, c1086gP, 0, 1);
        c1086gP.T(true);
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.conversation.ui.components.row.q(state, hVar2, i10, i11, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r CollectionSummaryComponent$lambda$5(CollectionDetailsUiState.Content state, androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(state, "$state");
        CollectionSummaryComponent(state, hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void CollectionSummaryComponentPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1054855652);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CollectionSummaryComponentKt.INSTANCE.m284getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2278f(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r CollectionSummaryComponentPreview$lambda$6(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        CollectionSummaryComponentPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    private static final String constructByAuthorsText(Context context, List<Author> list) {
        CharSequence charSequence;
        if (list.isEmpty()) {
            return "";
        }
        int size = list.size();
        if (size != 1) {
            charSequence = size != 2 ? Phrase.from(context, R.string.intercom_article_multiple_authors).put("author_first_name1", ((Author) kotlin.collections.q.O(list)).getName()).put("number_of_other_authors", list.size() - 1).format() : Phrase.from(context, R.string.intercom_article_double_author).put("author_first_name1", ((Author) kotlin.collections.q.O(list)).getName()).put("author_first_name2", ((Author) kotlin.collections.q.V(list)).getName()).format();
        } else {
            charSequence = Phrase.from(context, R.string.intercom_article_single_author).put("author_first_name", ((Author) kotlin.collections.q.O(list)).getName()).format();
        }
        return charSequence.toString();
    }
}
