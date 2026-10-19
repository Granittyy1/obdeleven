package io.intercom.android.sdk.m5.conversation.ui.components;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.InterfaceC0928f;
import androidx.compose.animation.core.C0907g;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.C0955o;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.layout.InterfaceC1170p;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import io.intercom.android.sdk.m5.components.FooterNoticeKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.components.r0;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.m5.conversation.ui.C2389d;
import io.intercom.android.sdk.m5.conversation.ui.C2398m;
import io.intercom.android.sdk.m5.conversation.ui.C2399n;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.AskedAboutRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.DayDividerKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.EventRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.FinAnswerRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.FinStreamingRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.MergedConversationRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.NewMessagesRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.NoteCardRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.PostCardRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.SpecialNoticeKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.TeamIntroKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.TicketStatusRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.TypingIndicatorKt;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardStateKt;
import io.intercom.android.sdk.models.InlineSource;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.models.Source;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.C2680e;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: MessageList.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class MessageListKt {
    private static final float GroupedMessageGap = 2;
    private static final float DefaultMessageGap = 16;
    private static final float BigMessageGap = 24;
    private static final float LargeMessageGap = 32;

    /* JADX INFO: compiled from: MessageList.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupingPosition.values().length];
            try {
                iArr[GroupingPosition.STANDALONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupingPosition.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupingPosition.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GroupingPosition.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @IntercomPreviews
    private static final void EmptyMessageListPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1882438622);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MessageListKt.INSTANCE.m172getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.components.Q(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r EmptyMessageListPreview$lambda$42(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        EmptyMessageListPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0213  */
    /* JADX WARN: Code duplicated, block: B:103:0x021a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x021c  */
    /* JADX WARN: Code duplicated, block: B:107:0x023c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0242  */
    /* JADX WARN: Code duplicated, block: B:115:0x0254 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x0256  */
    /* JADX WARN: Code duplicated, block: B:119:0x0288  */
    /* JADX WARN: Code duplicated, block: B:120:0x028d  */
    /* JADX WARN: Code duplicated, block: B:123:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:126:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:127:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:130:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:132:0x030c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0327  */
    /* JADX WARN: Code duplicated, block: B:138:0x032f  */
    /* JADX WARN: Code duplicated, block: B:140:0x0342  */
    /* JADX WARN: Code duplicated, block: B:142:0x0372  */
    /* JADX WARN: Code duplicated, block: B:148:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:154:0x040a  */
    /* JADX WARN: Code duplicated, block: B:156:0x0413  */
    /* JADX WARN: Code duplicated, block: B:157:0x043b  */
    /* JADX WARN: Code duplicated, block: B:159:0x043f  */
    /* JADX WARN: Code duplicated, block: B:160:0x0467  */
    /* JADX WARN: Code duplicated, block: B:162:0x046d  */
    /* JADX WARN: Code duplicated, block: B:163:0x0496  */
    /* JADX WARN: Code duplicated, block: B:165:0x049a  */
    /* JADX WARN: Code duplicated, block: B:166:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:168:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:169:0x0504  */
    /* JADX WARN: Code duplicated, block: B:171:0x0508  */
    /* JADX WARN: Code duplicated, block: B:172:0x0535  */
    /* JADX WARN: Code duplicated, block: B:174:0x0539  */
    /* JADX WARN: Code duplicated, block: B:175:0x055e  */
    /* JADX WARN: Code duplicated, block: B:177:0x0562  */
    /* JADX WARN: Code duplicated, block: B:178:0x058f  */
    /* JADX WARN: Code duplicated, block: B:180:0x0593  */
    /* JADX WARN: Code duplicated, block: B:181:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:183:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:184:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:186:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:188:0x063a  */
    /* JADX WARN: Code duplicated, block: B:190:0x0640  */
    /* JADX WARN: Code duplicated, block: B:192:0x064e  */
    /* JADX WARN: Code duplicated, block: B:202:0x0686  */
    /* JADX WARN: Code duplicated, block: B:204:0x068a  */
    /* JADX WARN: Code duplicated, block: B:206:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:208:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:210:0x0712 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:211:0x0714  */
    /* JADX WARN: Code duplicated, block: B:213:0x0754  */
    /* JADX WARN: Code duplicated, block: B:215:0x075a  */
    /* JADX WARN: Code duplicated, block: B:217:0x076c  */
    /* JADX WARN: Code duplicated, block: B:219:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:221:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:222:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:224:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:232:0x0879  */
    /* JADX WARN: Code duplicated, block: B:238:0x089a  */
    /* JADX WARN: Code duplicated, block: B:241:0x0862 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x0852 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x01df  */
    /* JADX WARN: Code duplicated, block: B:97:0x020b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0211 A[PHI: r30
      0x0211: PHI (r30v13 androidx.compose.ui.h$a) = (r30v0 androidx.compose.ui.h$a), (r30v15 androidx.compose.ui.h$a) binds: [B:98:0x020f, B:96:0x0208] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void MessageList(androidx.compose.ui.h hVar, final List<? extends ContentRow> list, ScrollState scrollState, Ia.l<? super ReplySuggestion, p293xa.r> lVar, Ia.l<? super ReplyOption, p293xa.r> lVar2, Ia.l<? super Part, p293xa.r> lVar3, Ia.l<? super PendingMessage.FailedImageUploadData, p293xa.r> lVar4, Ia.l<? super AttributeData, p293xa.r> lVar5, Ia.a<p293xa.r> aVar, Ia.l<? super TicketType, p293xa.r> lVar6, boolean z10, Ia.l<? super String, p293xa.r> lVar7, Ia.p<? super List<InlineSource>, ? super List<Source>, p293xa.r> pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11, final int i12) {
        ScrollState scrollStateA;
        int i13;
        boolean z11;
        Ia.l<? super AttributeData, p293xa.r> lVar8;
        boolean z12;
        Object objF;
        androidx.compose.ui.h.a aVar2;
        boolean z13;
        Object objF2;
        boolean zK;
        Object objF3;
        float f10;
        float composerHalfSize;
        Object objF4;
        int i14;
        Ia.a<ComposeUiNode> aVar3;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar2;
        C0955o c0955o;
        Iterator it;
        int i15;
        final androidx.compose.ui.h hVar2;
        final Ia.p<? super List<InlineSource>, ? super List<Source>, p293xa.r> pVar3;
        C1105p0 c1105p0V;
        Object next;
        int i16;
        final ContentRow contentRow;
        final float fGapWithPrevious;
        androidx.compose.ui.h.a aVar4;
        Context context;
        Ia.p<? super List<InlineSource>, ? super List<Source>, p293xa.r> pVar4;
        Object objF5;
        Object obj;
        boolean zK2;
        Object objF6;
        ContentRow.MergedConversationRow mergedConversationRow;
        String description;
        String conversationId;
        final ComposableLambdaImpl composableLambdaImplB;
        ContentRow.BubbleMessageRow bubbleMessageRow;
        boolean z14;
        Object obj2;
        List<? extends ContentRow> contentRows = list;
        kotlin.jvm.internal.i.e(contentRows, "contentRows");
        C1086g c1086gP = interfaceC1084f.p(-1888642915);
        int i17 = i12 & 1;
        androidx.compose.ui.h.a aVar5 = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVar3 = i17 != 0 ? aVar5 : hVar;
        if ((i12 & 4) != 0) {
            scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
            i13 = i10 & (-897);
        } else {
            scrollStateA = scrollState;
            i13 = i10;
        }
        Ia.l<? super ReplySuggestion, p293xa.r> r0Var = (i12 & 8) != 0 ? new r0(2) : lVar;
        Ia.l<? super ReplyOption, p293xa.r> c2398m = (i12 & 16) != 0 ? new C2398m(2) : lVar2;
        Ia.l<? super Part, p293xa.r> c2399n = (i12 & 32) != 0 ? new C2399n(2) : lVar3;
        Ia.l<? super PendingMessage.FailedImageUploadData, p293xa.r> kVar = (i12 & 64) != 0 ? new p011ab.k(4) : lVar4;
        Ia.l<? super AttributeData, p293xa.r> yVar = (i12 & 128) != 0 ? new androidx.navigation.compose.y(5) : lVar5;
        Ia.a<p293xa.r> m7 = (i12 & 256) != 0 ? new M(0) : aVar;
        Ia.l<? super TicketType, p293xa.r> c2389d = (i12 & 512) != 0 ? new C2389d(1) : lVar6;
        boolean z15 = (i12 & 1024) != 0 ? false : z10;
        Ia.l<? super String, p293xa.r> n10 = (i12 & 2048) != 0 ? new io.intercom.android.sdk.m5.components.N(2) : lVar7;
        Ia.p<? super List<InlineSource>, ? super List<Source>, p293xa.r> pVar5 = (i12 & 4096) != 0 ? null : pVar;
        Context context2 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
        final p013b0.c cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
        Object objF7 = c1086gP.f();
        Ia.p<? super List<InlineSource>, ? super List<Source>, p293xa.r> pVar6 = pVar5;
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        if (objF7 == c0153a) {
            objF7 = androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, c1086gP);
            c1086gP.E(objF7);
        }
        kotlinx.coroutines.A a10 = (kotlinx.coroutines.A) objF7;
        Context context3 = context2;
        N0<KeyboardState> n0KeyboardAsState = KeyboardStateKt.keyboardAsState(c1086gP, 0);
        c1086gP.L(1713752547);
        Object objF8 = c1086gP.f();
        if (objF8 == c0153a) {
            objF8 = J0.f(new MessageListCoordinates(null, null, 0L, 7, null));
            c1086gP.E(objF8);
        }
        androidx.compose.runtime.X x10 = (androidx.compose.runtime.X) objF8;
        final Ia.a<p293xa.r> aVar6 = m7;
        c1086gP.T(false);
        c1086gP.L(1713756387);
        Object objF9 = c1086gP.f();
        if (objF9 == c0153a) {
            objF9 = J0.f(new MessageListCoordinates(null, null, 0L, 7, null));
            c1086gP.E(objF9);
        }
        final androidx.compose.runtime.X x11 = (androidx.compose.runtime.X) objF9;
        Ia.l<? super ReplyOption, p293xa.r> lVar9 = c2398m;
        c1086gP.T(false);
        c1086gP.L(1713763695);
        Object objF10 = c1086gP.f();
        if (objF10 == c0153a) {
            objF10 = J0.f(Boolean.TRUE);
            c1086gP.E(objF10);
        }
        final androidx.compose.runtime.X x12 = (androidx.compose.runtime.X) objF10;
        final Ia.l<? super ReplySuggestion, p293xa.r> lVar10 = r0Var;
        c1086gP.T(false);
        c1086gP.L(1713770160);
        Object objF11 = c1086gP.f();
        if (objF11 == c0153a) {
            objF11 = J0.f(Boolean.FALSE);
            c1086gP.E(objF11);
        }
        final androidx.compose.runtime.X x13 = (androidx.compose.runtime.X) objF11;
        int i18 = i13;
        c1086gP.T(false);
        List<? extends ContentRow> list2 = contentRows;
        final Ia.l<? super Part, p293xa.r> lVar11 = c2399n;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z11 = false;
                    break;
                }
                Iterator it3 = it2;
                if (((ContentRow) it2.next()) instanceof ContentRow.FinStreamingRow) {
                    z11 = true;
                    break;
                }
                it2 = it3;
            }
        } else {
            z11 = false;
            break;
        }
        c1086gP.L(1713776122);
        int i19 = (i10 & 896) ^ 384;
        final Ia.l<? super PendingMessage.FailedImageUploadData, p293xa.r> lVar12 = kVar;
        if (i19 <= 256 || !c1086gP.K(scrollStateA)) {
            lVar8 = yVar;
            if ((i10 & 384) != 256) {
                z12 = false;
            }
            objF = c1086gP.f();
            if (z12 || objF == c0153a) {
                objF = new MessageListKt$MessageList$9$1(scrollStateA, x12, x13, null);
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            androidx.compose.runtime.E.d((Ia.p) objF, c1086gP, "");
            kotlinx.coroutines.flow.v vVar = scrollStateA.f9826c.f10073a;
            c1086gP.L(1713797322);
            if (i19 > 256 || !c1086gP.K(scrollStateA)) {
                aVar2 = aVar5;
                if ((i10 & 384) != 256) {
                    z13 = false;
                }
                objF2 = c1086gP.f();
                if (z13 || objF2 == c0153a) {
                    objF2 = new MessageListKt$MessageList$10$1(scrollStateA, x13, null);
                    c1086gP.E(objF2);
                }
                c1086gP.T(false);
                androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, vVar);
                MessageListCoordinates messageListCoordinatesMessageList$lambda$13 = MessageList$lambda$13(x11);
                c1086gP.L(1713820513);
                zK = ((i19 <= 256 && c1086gP.K(scrollStateA)) || (i10 & 384) == 256) | c1086gP.K(n0KeyboardAsState);
                objF3 = c1086gP.f();
                if (zK || objF3 == c0153a) {
                    objF3 = new MessageListKt$MessageList$11$1(scrollStateA, x10, x11, n0KeyboardAsState, x13, x12, null);
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                androidx.compose.runtime.E.d((Ia.p) objF3, c1086gP, messageListCoordinatesMessageList$lambda$13);
                androidx.compose.ui.h hVarB = ScrollKt.b(hVar3.i(androidx.compose.foundation.layout.W.f10226c), scrollStateA, false, 6);
                f10 = 16;
                if (z15) {
                    composerHalfSize = MessageComposerKt.getComposerHalfSize();
                } else {
                    composerHalfSize = 0;
                }
                androidx.compose.ui.h hVarJ = PaddingKt.j(hVarB, 0.0f, 0.0f, 0.0f, f10 + composerHalfSize, 7);
                c1086gP.L(1713864494);
                objF4 = c1086gP.f();
                if (objF4 == c0153a) {
                    objF4 = new io.intercom.android.sdk.m5.conversation.ui.C(1, x11);
                    c1086gP.E(objF4);
                }
                c1086gP.T(false);
                androidx.compose.ui.h hVarA = androidx.compose.ui.layout.O.a(hVarJ, (Ia.l) objF4);
                C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                i14 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarA);
                ComposeUiNode.f14331c0.getClass();
                aVar3 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                pVar2 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
                    J4.i.d(i14, c1086gP, i14, pVar2);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                c0955o = C0955o.f10310a;
                c1086gP.L(1314348866);
                it = list2.iterator();
                i15 = 0;
                while (it.hasNext()) {
                    next = it.next();
                    i16 = i15 + 1;
                    if (i15 < 0) {
                        kotlin.collections.l.x();
                        throw null;
                    }
                    contentRow = (ContentRow) next;
                    fGapWithPrevious = gapWithPrevious(contentRow, i15, contentRows);
                    aVar4 = aVar2;
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar4, fGapWithPrevious));
                    if (contentRow instanceof ContentRow.BubbleMessageRow) {
                        c1086gP.L(39711070);
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(-134975690, new MessageListKt$MessageList$13$1$renderMessageRow$1(contentRow, lVar8, lVar12, c2389d, lVar11), c1086gP);
                        bubbleMessageRow = (ContentRow.BubbleMessageRow) contentRow;
                        if (bubbleMessageRow.getPartWrapper().getPart().getMessageState() == Part.MessageState.SENDING || !bubbleMessageRow.getPartWrapper().isLastPart()) {
                            z14 = false;
                            c1086gP.L(41959252);
                            composableLambdaImplB.invoke(c1086gP, 6);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(41325643);
                            c1086gP.L(1940996711);
                            Object objF12 = c1086gP.f();
                            if (objF12 == c0153a) {
                                obj2 = objF12;
                                androidx.compose.animation.core.K k10 = new androidx.compose.animation.core.K(Boolean.FALSE);
                                k10.f(Boolean.TRUE);
                                c1086gP.E(k10);
                                obj2 = k10;
                            }
                            obj2 = objF12;
                            c1086gP.T(false);
                            AnimatedVisibilityKt.c(c0955o, (androidx.compose.animation.core.K) obj2, null, EnterExitTransitionKt.e(C0907g.d(CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS, 0, null, 6), 0.0f, 2), null, null, androidx.compose.runtime.internal.a.b(-423001146, new Ia.q<InterfaceC0928f, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$13$1$1
                                @Override // Ia.q
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0928f interfaceC0928f, InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC0928f, interfaceC1084f2, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC0928f AnimatedVisibility, InterfaceC1084f interfaceC1084f2, int i20) {
                                    kotlin.jvm.internal.i.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                    composableLambdaImplB.invoke(interfaceC1084f2, 6);
                                }
                            }, c1086gP), c1086gP, 1575942, 26);
                            z14 = false;
                            c1086gP.T(false);
                        }
                        c1086gP.T(z14);
                    } else {
                        it = it;
                        i16 = i16;
                        if (contentRow instanceof ContentRow.PostCardRow) {
                            c1086gP.L(42092490);
                            ContentRow.PostCardRow postCardRow = (ContentRow.PostCardRow) contentRow;
                            PostCardRowKt.PostCardRow(null, postCardRow.getPart(), postCardRow.getCompanyName(), c1086gP, 64, 1);
                            c1086gP.T(false);
                        } else if (contentRow instanceof ContentRow.NoteCardRow) {
                            c1086gP.L(42309738);
                            ContentRow.NoteCardRow noteCardRow = (ContentRow.NoteCardRow) contentRow;
                            NoteCardRowKt.NoteCardRow(null, noteCardRow.getPart(), noteCardRow.getCompanyName(), c1086gP, 64, 1);
                            c1086gP.T(false);
                        } else if (contentRow instanceof ContentRow.SpecialNoticeRow) {
                            c1086gP.L(42551476);
                            SpecialNoticeKt.SpecialNotice(((ContentRow.SpecialNoticeRow) contentRow).getMessage(), PaddingKt.j(aVar4, f10, 0.0f, f10, 0.0f, 10), c1086gP, 48, 0);
                            c1086gP.T(false);
                        } else if (contentRow instanceof ContentRow.TeamIntroRow) {
                            c1086gP.L(42760912);
                            TeamIntroKt.TeamIntro(((ContentRow.TeamIntroRow) contentRow).getMessage(), PaddingKt.j(aVar4, f10, 0.0f, f10, 0.0f, 10), c1086gP, 48, 0);
                            c1086gP.T(false);
                        } else if (contentRow instanceof ContentRow.ComposerSuggestionRow) {
                            c1086gP.L(43020320);
                            Lb.a.a(c1086gP, c0955o.a(true));
                            QuickRepliesKt.ComposerSuggestions(PaddingKt.h(androidx.compose.foundation.layout.W.d(aVar4, 1.0f), f10, 0.0f, 2), ((ContentRow.ComposerSuggestionRow) contentRow).getSuggestions(), lVar10, c1086gP, 70 | ((i18 >> 3) & 896), 0);
                            c1086gP.T(false);
                        } else {
                            if (contentRow instanceof ContentRow.QuickRepliesRow) {
                                c1086gP.L(43469045);
                                Lb.a.a(c1086gP, c0955o.a(true));
                                Ia.l<? super ReplyOption, p293xa.r> lVar13 = lVar9;
                                QuickRepliesKt.AnimatedQuickReplies(((ContentRow.QuickRepliesRow) contentRow).getReplyOptions(), lVar13, c1086gP, ((i18 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
                                c1086gP.T(false);
                                cVar = cVar;
                                hVar3 = hVar3;
                                lVar9 = lVar13;
                            } else if (contentRow instanceof ContentRow.DayDividerRow) {
                                c1086gP.L(1941075241);
                                DayDividerKt.DayDivider(TimeFormatterExtKt.formattedDateForDayDivider(((ContentRow.DayDividerRow) contentRow).getTimestamp(), (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b)), androidx.compose.foundation.layout.W.d(aVar4, 1.0f), c1086gP, 48, 0);
                                c1086gP.T(false);
                            } else if (contentRow instanceof ContentRow.BigTicketRow) {
                                c1086gP.L(44027293);
                                BigTicketCardKt.BigTicketCard(((ContentRow.BigTicketRow) contentRow).getTicketDetailContentState(), aVar6, true, null, c1086gP, ((i18 >> 21) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 8);
                                c1086gP.T(false);
                            } else {
                                if (contentRow instanceof ContentRow.AskedAboutRow) {
                                    c1086gP.L(44321607);
                                    AskedAboutRowKt.AskedAboutRow(androidx.compose.foundation.layout.W.d(aVar4, 1.0f), ((ContentRow.AskedAboutRow) contentRow).getPart(), c1086gP, 70, 0);
                                    c1086gP.T(false);
                                } else if (contentRow instanceof ContentRow.EventRow) {
                                    c1086gP.L(44573637);
                                    ContentRow.EventRow eventRow = (ContentRow.EventRow) contentRow;
                                    EventRowKt.EventRow(androidx.compose.foundation.layout.W.d(aVar4, 1.0f), eventRow.getLabel(), new AvatarWrapper(eventRow.getAvatar(), false, 2, null), c1086gP, 518, 0);
                                    c1086gP.T(false);
                                } else {
                                    hVar3 = hVar3;
                                    if (contentRow instanceof ContentRow.TicketStatusRow) {
                                        c1086gP.L(44932369);
                                        ContentRow.TicketStatusRow ticketStatusRow = (ContentRow.TicketStatusRow) contentRow;
                                        context = context3;
                                        TicketStatusRowKt.TicketStatusRow(ticketStatusRow.getTicketEventStatus(), ticketStatusRow.getTicketStatusText(), TimeFormatterExtKt.formattedDateFromLong(ticketStatusRow.getCreatedAt(), context), PaddingKt.h(aVar4, f10, 0.0f, 2), ticketStatusRow.getCustomStateLabel(), ticketStatusRow.getCustomStatePrefix(), c1086gP, 3072, 0);
                                        c1086gP.T(false);
                                    } else {
                                        context = context3;
                                        if (contentRow instanceof ContentRow.MergedConversationRow) {
                                            c1086gP.L(45468080);
                                            mergedConversationRow = (ContentRow.MergedConversationRow) contentRow;
                                            description = mergedConversationRow.getDescription();
                                            if (description != null && description.length() != 0 && (conversationId = mergedConversationRow.getConversationId()) != null && conversationId.length() != 0) {
                                                MergedConversationRowKt.MergedConversationRow(null, mergedConversationRow.getDescription(), mergedConversationRow.getConversationId(), n10, c1086gP, (i11 << 6) & 7168, 1);
                                            }
                                            c1086gP.T(false);
                                        } else {
                                            if (contentRow instanceof ContentRow.FinAnswerRow) {
                                                c1086gP.L(45935188);
                                                ContentRow.FinAnswerRow finAnswerRow = (ContentRow.FinAnswerRow) contentRow;
                                                context3 = context;
                                                pVar4 = pVar6;
                                                FinAnswerRowKt.FinAnswerRow(finAnswerRow.getPart(), finAnswerRow.getGroupingPosition(), null, TimeFormatterExtKt.toHourOfDay(finAnswerRow.getPart().getCreatedAt()), new N(pVar4, 0, (ContentRow.FinAnswerRow) contentRow), c1086gP, 8, 4);
                                                c1086gP.T(false);
                                                cVar = cVar;
                                            } else {
                                                context3 = context;
                                                pVar4 = pVar6;
                                                if (contentRow instanceof ContentRow.FinStreamingRow) {
                                                    c1086gP.L(46446750);
                                                    androidx.compose.ui.h hVarD = androidx.compose.foundation.layout.W.d(PaddingKt.j(aVar4, 0.0f, 0.0f, 0.0f, f10, 7), 1.0f);
                                                    c1086gP.L(1941167915);
                                                    cVar = cVar;
                                                    zK2 = c1086gP.K(cVar) | c1086gP.g(fGapWithPrevious);
                                                    objF6 = c1086gP.f();
                                                    if (zK2 || objF6 == c0153a) {
                                                        objF6 = new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.P
                                                            @Override // Ia.l
                                                            public final Object invoke(Object obj3) {
                                                                return MessageListKt.MessageList$lambda$38$lambda$37$lambda$32$lambda$31(cVar, fGapWithPrevious, x13, x11, x12, (InterfaceC1170p) obj3);
                                                            }
                                                        };
                                                        c1086gP.E(objF6);
                                                    }
                                                    c1086gP.T(false);
                                                    ContentRow.FinStreamingRow finStreamingRow = (ContentRow.FinStreamingRow) contentRow;
                                                    FinStreamingRowKt.FinStreamingRow(finStreamingRow.getBlocks(), finStreamingRow.getStreamingPart(), androidx.compose.ui.layout.O.a(hVarD, (Ia.l) objF6), c1086gP, 72, 0);
                                                    c1086gP.T(false);
                                                } else {
                                                    cVar = cVar;
                                                    if (contentRow instanceof ContentRow.TypingIndicatorRow) {
                                                        c1086gP.L(47420863);
                                                        c1086gP.L(1941193447);
                                                        objF5 = c1086gP.f();
                                                        if (objF5 == c0153a) {
                                                            obj = objF5;
                                                            androidx.compose.animation.core.K k11 = new androidx.compose.animation.core.K(Boolean.FALSE);
                                                            k11.f(Boolean.TRUE);
                                                            c1086gP.E(k11);
                                                            obj = k11;
                                                        }
                                                        obj = objF5;
                                                        c1086gP.T(false);
                                                        c0153a = c0153a;
                                                        AnimatedVisibilityKt.c(c0955o, (androidx.compose.animation.core.K) obj, null, EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.n(new coil.compose.d(1))), EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.q(new C2388z(1), 1)), null, androidx.compose.runtime.internal.a.b(-1398882549, new Ia.q<InterfaceC0928f, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$13$1$6
                                                            @Override // Ia.q
                                                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0928f interfaceC0928f, InterfaceC1084f interfaceC1084f2, Integer num) {
                                                                invoke(interfaceC0928f, interfaceC1084f2, num.intValue());
                                                                return p293xa.r.f47939a;
                                                            }

                                                            public final void invoke(InterfaceC0928f AnimatedVisibility, InterfaceC1084f interfaceC1084f2, int i20) {
                                                                kotlin.jvm.internal.i.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                                                TypingIndicatorKt.m257TypingIndicator6a0pyJM(PaddingKt.h(androidx.compose.foundation.layout.W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 16, 0.0f, 2), ((ContentRow.TypingIndicatorRow) contentRow).getCurrentlyTypingState(), 36, interfaceC1084f2, 454, 0);
                                                            }
                                                        }, c1086gP), c1086gP, 1600518, 18);
                                                        c1086gP.T(false);
                                                    } else {
                                                        c0153a = c0153a;
                                                        if (contentRow instanceof ContentRow.NewMessagesRow) {
                                                            c1086gP.L(48601374);
                                                            NewMessagesRowKt.NewMessagesRow(null, c1086gP, 0, 1);
                                                            c1086gP.T(false);
                                                        } else {
                                                            if (!(contentRow instanceof ContentRow.FooterNoticeRow)) {
                                                                c1086gP.L(1940948829);
                                                                c1086gP.T(false);
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            c1086gP.L(48719050);
                                                            Lb.a.a(c1086gP, c0955o.a(true));
                                                            ContentRow.FooterNoticeRow footerNoticeRow = (ContentRow.FooterNoticeRow) contentRow;
                                                            FooterNoticeKt.ExpandedFooterNotice(PaddingKt.g(24, 4, aVar4), footerNoticeRow.getFooterNoticeState().getTitle(), footerNoticeRow.getFooterNoticeState().getSubtitle(), footerNoticeRow.getFooterNoticeState().getAvatars(), c1086gP, 4102, 0);
                                                            c1086gP.T(false);
                                                        }
                                                    }
                                                }
                                            }
                                            c0153a = c0153a;
                                        }
                                    }
                                    cVar = cVar;
                                    context3 = context;
                                }
                                contentRows = list;
                                c0153a = c0153a;
                                pVar6 = pVar4;
                                cVar = cVar;
                                it = it;
                                i15 = i16;
                                hVar3 = hVar3;
                                aVar2 = aVar4;
                            }
                            pVar4 = pVar6;
                            contentRows = list;
                            c0153a = c0153a;
                            pVar6 = pVar4;
                            cVar = cVar;
                            it = it;
                            i15 = i16;
                            hVar3 = hVar3;
                            aVar2 = aVar4;
                        }
                    }
                    pVar4 = pVar6;
                    contentRows = list;
                    c0153a = c0153a;
                    pVar6 = pVar4;
                    cVar = cVar;
                    it = it;
                    i15 = i16;
                    hVar3 = hVar3;
                    aVar2 = aVar4;
                }
                hVar2 = hVar3;
                pVar3 = pVar6;
                c1086gP.T(false);
                c1086gP.T(true);
                if (MessageList$lambda$16(x12) && scrollStateA.f9824a.o() != scrollStateA.f9827d.o() && !z11) {
                    c1086gP.l(new Q(a10, 0, scrollStateA));
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final ScrollState scrollState2 = scrollStateA;
                    final Ia.l<? super ReplyOption, p293xa.r> lVar14 = lVar9;
                    final Ia.l<? super AttributeData, p293xa.r> lVar15 = lVar8;
                    final Ia.l<? super TicketType, p293xa.r> lVar16 = c2389d;
                    final boolean z16 = z15;
                    final Ia.l<? super String, p293xa.r> lVar17 = n10;
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.S
                        @Override // Ia.p
                        public final Object invoke(Object obj3, Object obj4) {
                            int iIntValue = ((Integer) obj4).intValue();
                            androidx.compose.ui.h hVar4 = hVar2;
                            ScrollState scrollState3 = scrollState2;
                            int i20 = i11;
                            int i21 = i12;
                            return MessageListKt.MessageList$lambda$40(hVar4, list, scrollState3, lVar10, lVar14, lVar11, lVar12, lVar15, aVar6, lVar16, z16, lVar17, pVar3, i10, i20, i21, (InterfaceC1084f) obj3, iIntValue);
                        }
                    };
                }
            }
            aVar2 = aVar5;
            z13 = true;
            objF2 = c1086gP.f();
            if (z13) {
                objF2 = new MessageListKt$MessageList$10$1(scrollStateA, x13, null);
                c1086gP.E(objF2);
            } else {
                objF2 = new MessageListKt$MessageList$10$1(scrollStateA, x13, null);
                c1086gP.E(objF2);
            }
            c1086gP.T(false);
            androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, vVar);
            MessageListCoordinates messageListCoordinatesMessageList$lambda$14 = MessageList$lambda$13(x11);
            c1086gP.L(1713820513);
            zK = ((i19 <= 256 && c1086gP.K(scrollStateA)) || (i10 & 384) == 256) | c1086gP.K(n0KeyboardAsState);
            objF3 = c1086gP.f();
            if (zK) {
                objF3 = new MessageListKt$MessageList$11$1(scrollStateA, x10, x11, n0KeyboardAsState, x13, x12, null);
                c1086gP.E(objF3);
            } else {
                objF3 = new MessageListKt$MessageList$11$1(scrollStateA, x10, x11, n0KeyboardAsState, x13, x12, null);
                c1086gP.E(objF3);
            }
            c1086gP.T(false);
            androidx.compose.runtime.E.d((Ia.p) objF3, c1086gP, messageListCoordinatesMessageList$lambda$14);
            androidx.compose.ui.h hVarB2 = ScrollKt.b(hVar3.i(androidx.compose.foundation.layout.W.f10226c), scrollStateA, false, 6);
            f10 = 16;
            if (z15) {
                composerHalfSize = MessageComposerKt.getComposerHalfSize();
            } else {
                composerHalfSize = 0;
            }
            androidx.compose.ui.h hVarJ2 = PaddingKt.j(hVarB2, 0.0f, 0.0f, 0.0f, f10 + composerHalfSize, 7);
            c1086gP.L(1713864494);
            objF4 = c1086gP.f();
            if (objF4 == c0153a) {
                objF4 = new io.intercom.android.sdk.m5.conversation.ui.C(1, x11);
                c1086gP.E(objF4);
            }
            c1086gP.T(false);
            androidx.compose.ui.h hVarA2 = androidx.compose.ui.layout.O.a(hVarJ2, (Ia.l) objF4);
            C0953m c0953mA2 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
            i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarA2);
            ComposeUiNode.f14331c0.getClass();
            aVar3 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar3);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA2);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
            pVar2 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i14, c1086gP, i14, pVar2);
            } else {
                J4.i.d(i14, c1086gP, i14, pVar2);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
            c0955o = C0955o.f10310a;
            c1086gP.L(1314348866);
            it = list2.iterator();
            i15 = 0;
            while (it.hasNext()) {
                next = it.next();
                i16 = i15 + 1;
                if (i15 < 0) {
                    kotlin.collections.l.x();
                    throw null;
                }
                contentRow = (ContentRow) next;
                fGapWithPrevious = gapWithPrevious(contentRow, i15, contentRows);
                aVar4 = aVar2;
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar4, fGapWithPrevious));
                if (contentRow instanceof ContentRow.BubbleMessageRow) {
                    c1086gP.L(39711070);
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(-134975690, new MessageListKt$MessageList$13$1$renderMessageRow$1(contentRow, lVar8, lVar12, c2389d, lVar11), c1086gP);
                    bubbleMessageRow = (ContentRow.BubbleMessageRow) contentRow;
                    if (bubbleMessageRow.getPartWrapper().getPart().getMessageState() == Part.MessageState.SENDING) {
                        z14 = false;
                        c1086gP.L(41959252);
                        composableLambdaImplB.invoke(c1086gP, 6);
                        c1086gP.T(false);
                    } else {
                        z14 = false;
                        c1086gP.L(41959252);
                        composableLambdaImplB.invoke(c1086gP, 6);
                        c1086gP.T(false);
                    }
                    c1086gP.T(z14);
                } else {
                    it = it;
                    i16 = i16;
                    if (contentRow instanceof ContentRow.PostCardRow) {
                        c1086gP.L(42092490);
                        ContentRow.PostCardRow postCardRow2 = (ContentRow.PostCardRow) contentRow;
                        PostCardRowKt.PostCardRow(null, postCardRow2.getPart(), postCardRow2.getCompanyName(), c1086gP, 64, 1);
                        c1086gP.T(false);
                    } else if (contentRow instanceof ContentRow.NoteCardRow) {
                        c1086gP.L(42309738);
                        ContentRow.NoteCardRow noteCardRow2 = (ContentRow.NoteCardRow) contentRow;
                        NoteCardRowKt.NoteCardRow(null, noteCardRow2.getPart(), noteCardRow2.getCompanyName(), c1086gP, 64, 1);
                        c1086gP.T(false);
                    } else if (contentRow instanceof ContentRow.SpecialNoticeRow) {
                        c1086gP.L(42551476);
                        SpecialNoticeKt.SpecialNotice(((ContentRow.SpecialNoticeRow) contentRow).getMessage(), PaddingKt.j(aVar4, f10, 0.0f, f10, 0.0f, 10), c1086gP, 48, 0);
                        c1086gP.T(false);
                    } else if (contentRow instanceof ContentRow.TeamIntroRow) {
                        c1086gP.L(42760912);
                        TeamIntroKt.TeamIntro(((ContentRow.TeamIntroRow) contentRow).getMessage(), PaddingKt.j(aVar4, f10, 0.0f, f10, 0.0f, 10), c1086gP, 48, 0);
                        c1086gP.T(false);
                    } else if (contentRow instanceof ContentRow.ComposerSuggestionRow) {
                        c1086gP.L(43020320);
                        Lb.a.a(c1086gP, c0955o.a(true));
                        QuickRepliesKt.ComposerSuggestions(PaddingKt.h(androidx.compose.foundation.layout.W.d(aVar4, 1.0f), f10, 0.0f, 2), ((ContentRow.ComposerSuggestionRow) contentRow).getSuggestions(), lVar10, c1086gP, 70 | ((i18 >> 3) & 896), 0);
                        c1086gP.T(false);
                    } else {
                        if (contentRow instanceof ContentRow.QuickRepliesRow) {
                            c1086gP.L(43469045);
                            Lb.a.a(c1086gP, c0955o.a(true));
                            Ia.l<? super ReplyOption, p293xa.r> lVar18 = lVar9;
                            QuickRepliesKt.AnimatedQuickReplies(((ContentRow.QuickRepliesRow) contentRow).getReplyOptions(), lVar18, c1086gP, ((i18 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
                            c1086gP.T(false);
                            cVar = cVar;
                            hVar3 = hVar3;
                            lVar9 = lVar18;
                        } else if (contentRow instanceof ContentRow.DayDividerRow) {
                            c1086gP.L(1941075241);
                            DayDividerKt.DayDivider(TimeFormatterExtKt.formattedDateForDayDivider(((ContentRow.DayDividerRow) contentRow).getTimestamp(), (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b)), androidx.compose.foundation.layout.W.d(aVar4, 1.0f), c1086gP, 48, 0);
                            c1086gP.T(false);
                        } else if (contentRow instanceof ContentRow.BigTicketRow) {
                            c1086gP.L(44027293);
                            BigTicketCardKt.BigTicketCard(((ContentRow.BigTicketRow) contentRow).getTicketDetailContentState(), aVar6, true, null, c1086gP, ((i18 >> 21) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 8);
                            c1086gP.T(false);
                        } else {
                            if (contentRow instanceof ContentRow.AskedAboutRow) {
                                c1086gP.L(44321607);
                                AskedAboutRowKt.AskedAboutRow(androidx.compose.foundation.layout.W.d(aVar4, 1.0f), ((ContentRow.AskedAboutRow) contentRow).getPart(), c1086gP, 70, 0);
                                c1086gP.T(false);
                            } else if (contentRow instanceof ContentRow.EventRow) {
                                c1086gP.L(44573637);
                                ContentRow.EventRow eventRow2 = (ContentRow.EventRow) contentRow;
                                EventRowKt.EventRow(androidx.compose.foundation.layout.W.d(aVar4, 1.0f), eventRow2.getLabel(), new AvatarWrapper(eventRow2.getAvatar(), false, 2, null), c1086gP, 518, 0);
                                c1086gP.T(false);
                            } else {
                                hVar3 = hVar3;
                                if (contentRow instanceof ContentRow.TicketStatusRow) {
                                    c1086gP.L(44932369);
                                    ContentRow.TicketStatusRow ticketStatusRow2 = (ContentRow.TicketStatusRow) contentRow;
                                    context = context3;
                                    TicketStatusRowKt.TicketStatusRow(ticketStatusRow2.getTicketEventStatus(), ticketStatusRow2.getTicketStatusText(), TimeFormatterExtKt.formattedDateFromLong(ticketStatusRow2.getCreatedAt(), context), PaddingKt.h(aVar4, f10, 0.0f, 2), ticketStatusRow2.getCustomStateLabel(), ticketStatusRow2.getCustomStatePrefix(), c1086gP, 3072, 0);
                                    c1086gP.T(false);
                                } else {
                                    context = context3;
                                    if (contentRow instanceof ContentRow.MergedConversationRow) {
                                        c1086gP.L(45468080);
                                        mergedConversationRow = (ContentRow.MergedConversationRow) contentRow;
                                        description = mergedConversationRow.getDescription();
                                        if (description != null) {
                                            MergedConversationRowKt.MergedConversationRow(null, mergedConversationRow.getDescription(), mergedConversationRow.getConversationId(), n10, c1086gP, (i11 << 6) & 7168, 1);
                                        }
                                        c1086gP.T(false);
                                    } else {
                                        if (contentRow instanceof ContentRow.FinAnswerRow) {
                                            c1086gP.L(45935188);
                                            ContentRow.FinAnswerRow finAnswerRow2 = (ContentRow.FinAnswerRow) contentRow;
                                            context3 = context;
                                            pVar4 = pVar6;
                                            FinAnswerRowKt.FinAnswerRow(finAnswerRow2.getPart(), finAnswerRow2.getGroupingPosition(), null, TimeFormatterExtKt.toHourOfDay(finAnswerRow2.getPart().getCreatedAt()), new N(pVar4, 0, (ContentRow.FinAnswerRow) contentRow), c1086gP, 8, 4);
                                            c1086gP.T(false);
                                            cVar = cVar;
                                        } else {
                                            context3 = context;
                                            pVar4 = pVar6;
                                            if (contentRow instanceof ContentRow.FinStreamingRow) {
                                                c1086gP.L(46446750);
                                                androidx.compose.ui.h hVarD2 = androidx.compose.foundation.layout.W.d(PaddingKt.j(aVar4, 0.0f, 0.0f, 0.0f, f10, 7), 1.0f);
                                                c1086gP.L(1941167915);
                                                cVar = cVar;
                                                zK2 = c1086gP.K(cVar) | c1086gP.g(fGapWithPrevious);
                                                objF6 = c1086gP.f();
                                                if (zK2) {
                                                    objF6 = new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.P
                                                        @Override // Ia.l
                                                        public final Object invoke(Object obj3) {
                                                            return MessageListKt.MessageList$lambda$38$lambda$37$lambda$32$lambda$31(cVar, fGapWithPrevious, x13, x11, x12, (InterfaceC1170p) obj3);
                                                        }
                                                    };
                                                    c1086gP.E(objF6);
                                                } else {
                                                    objF6 = new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.P
                                                        @Override // Ia.l
                                                        public final Object invoke(Object obj3) {
                                                            return MessageListKt.MessageList$lambda$38$lambda$37$lambda$32$lambda$31(cVar, fGapWithPrevious, x13, x11, x12, (InterfaceC1170p) obj3);
                                                        }
                                                    };
                                                    c1086gP.E(objF6);
                                                }
                                                c1086gP.T(false);
                                                ContentRow.FinStreamingRow finStreamingRow2 = (ContentRow.FinStreamingRow) contentRow;
                                                FinStreamingRowKt.FinStreamingRow(finStreamingRow2.getBlocks(), finStreamingRow2.getStreamingPart(), androidx.compose.ui.layout.O.a(hVarD2, (Ia.l) objF6), c1086gP, 72, 0);
                                                c1086gP.T(false);
                                            } else {
                                                cVar = cVar;
                                                if (contentRow instanceof ContentRow.TypingIndicatorRow) {
                                                    c1086gP.L(47420863);
                                                    c1086gP.L(1941193447);
                                                    objF5 = c1086gP.f();
                                                    if (objF5 == c0153a) {
                                                        obj = objF5;
                                                        androidx.compose.animation.core.K k12 = new androidx.compose.animation.core.K(Boolean.FALSE);
                                                        k12.f(Boolean.TRUE);
                                                        c1086gP.E(k12);
                                                        obj = k12;
                                                    }
                                                    obj = objF5;
                                                    c1086gP.T(false);
                                                    c0153a = c0153a;
                                                    AnimatedVisibilityKt.c(c0955o, (androidx.compose.animation.core.K) obj, null, EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.n(new coil.compose.d(1))), EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.q(new C2388z(1), 1)), null, androidx.compose.runtime.internal.a.b(-1398882549, new Ia.q<InterfaceC0928f, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$13$1$6
                                                        @Override // Ia.q
                                                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0928f interfaceC0928f, InterfaceC1084f interfaceC1084f2, Integer num) {
                                                            invoke(interfaceC0928f, interfaceC1084f2, num.intValue());
                                                            return p293xa.r.f47939a;
                                                        }

                                                        public final void invoke(InterfaceC0928f AnimatedVisibility, InterfaceC1084f interfaceC1084f2, int i20) {
                                                            kotlin.jvm.internal.i.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                                            TypingIndicatorKt.m257TypingIndicator6a0pyJM(PaddingKt.h(androidx.compose.foundation.layout.W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 16, 0.0f, 2), ((ContentRow.TypingIndicatorRow) contentRow).getCurrentlyTypingState(), 36, interfaceC1084f2, 454, 0);
                                                        }
                                                    }, c1086gP), c1086gP, 1600518, 18);
                                                    c1086gP.T(false);
                                                } else {
                                                    c0153a = c0153a;
                                                    if (contentRow instanceof ContentRow.NewMessagesRow) {
                                                        c1086gP.L(48601374);
                                                        NewMessagesRowKt.NewMessagesRow(null, c1086gP, 0, 1);
                                                        c1086gP.T(false);
                                                    } else {
                                                        if (!(contentRow instanceof ContentRow.FooterNoticeRow)) {
                                                            c1086gP.L(1940948829);
                                                            c1086gP.T(false);
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        c1086gP.L(48719050);
                                                        Lb.a.a(c1086gP, c0955o.a(true));
                                                        ContentRow.FooterNoticeRow footerNoticeRow2 = (ContentRow.FooterNoticeRow) contentRow;
                                                        FooterNoticeKt.ExpandedFooterNotice(PaddingKt.g(24, 4, aVar4), footerNoticeRow2.getFooterNoticeState().getTitle(), footerNoticeRow2.getFooterNoticeState().getSubtitle(), footerNoticeRow2.getFooterNoticeState().getAvatars(), c1086gP, 4102, 0);
                                                        c1086gP.T(false);
                                                    }
                                                }
                                            }
                                        }
                                        c0153a = c0153a;
                                    }
                                }
                                cVar = cVar;
                                context3 = context;
                            }
                            contentRows = list;
                            c0153a = c0153a;
                            pVar6 = pVar4;
                            cVar = cVar;
                            it = it;
                            i15 = i16;
                            hVar3 = hVar3;
                            aVar2 = aVar4;
                        }
                        pVar4 = pVar6;
                        contentRows = list;
                        c0153a = c0153a;
                        pVar6 = pVar4;
                        cVar = cVar;
                        it = it;
                        i15 = i16;
                        hVar3 = hVar3;
                        aVar2 = aVar4;
                    }
                }
                pVar4 = pVar6;
                contentRows = list;
                c0153a = c0153a;
                pVar6 = pVar4;
                cVar = cVar;
                it = it;
                i15 = i16;
                hVar3 = hVar3;
                aVar2 = aVar4;
            }
            hVar2 = hVar3;
            pVar3 = pVar6;
            c1086gP.T(false);
            c1086gP.T(true);
            if (MessageList$lambda$16(x12)) {
                c1086gP.l(new Q(a10, 0, scrollStateA));
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final ScrollState scrollState3 = scrollStateA;
                final Ia.l lVar19 = lVar9;
                final Ia.l lVar110 = lVar8;
                final Ia.l lVar111 = c2389d;
                final boolean z17 = z15;
                final Ia.l lVar112 = n10;
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.S
                    @Override // Ia.p
                    public final Object invoke(Object obj3, Object obj4) {
                        int iIntValue = ((Integer) obj4).intValue();
                        androidx.compose.ui.h hVar4 = hVar2;
                        ScrollState scrollState4 = scrollState3;
                        int i20 = i11;
                        int i21 = i12;
                        return MessageListKt.MessageList$lambda$40(hVar4, list, scrollState4, lVar10, lVar19, lVar11, lVar12, lVar110, aVar6, lVar111, z17, lVar112, pVar3, i10, i20, i21, (InterfaceC1084f) obj3, iIntValue);
                    }
                };
            }
        }
        lVar8 = yVar;
        z12 = true;
        objF = c1086gP.f();
        if (z12) {
            objF = new MessageListKt$MessageList$9$1(scrollStateA, x12, x13, null);
            c1086gP.E(objF);
        } else {
            objF = new MessageListKt$MessageList$9$1(scrollStateA, x12, x13, null);
            c1086gP.E(objF);
        }
        c1086gP.T(false);
        androidx.compose.runtime.E.d((Ia.p) objF, c1086gP, "");
        kotlinx.coroutines.flow.v vVar2 = scrollStateA.f9826c.f10073a;
        c1086gP.L(1713797322);
        if (i19 > 256) {
            aVar2 = aVar5;
            if ((i10 & 384) != 256) {
                z13 = true;
            } else {
                z13 = false;
            }
        } else {
            aVar2 = aVar5;
            if ((i10 & 384) != 256) {
                z13 = true;
            } else {
                z13 = false;
            }
        }
        objF2 = c1086gP.f();
        if (z13) {
            objF2 = new MessageListKt$MessageList$10$1(scrollStateA, x13, null);
            c1086gP.E(objF2);
        } else {
            objF2 = new MessageListKt$MessageList$10$1(scrollStateA, x13, null);
            c1086gP.E(objF2);
        }
        c1086gP.T(false);
        androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, vVar2);
        MessageListCoordinates messageListCoordinatesMessageList$lambda$15 = MessageList$lambda$13(x11);
        c1086gP.L(1713820513);
        zK = ((i19 <= 256 && c1086gP.K(scrollStateA)) || (i10 & 384) == 256) | c1086gP.K(n0KeyboardAsState);
        objF3 = c1086gP.f();
        if (zK) {
            objF3 = new MessageListKt$MessageList$11$1(scrollStateA, x10, x11, n0KeyboardAsState, x13, x12, null);
            c1086gP.E(objF3);
        } else {
            objF3 = new MessageListKt$MessageList$11$1(scrollStateA, x10, x11, n0KeyboardAsState, x13, x12, null);
            c1086gP.E(objF3);
        }
        c1086gP.T(false);
        androidx.compose.runtime.E.d((Ia.p) objF3, c1086gP, messageListCoordinatesMessageList$lambda$15);
        androidx.compose.ui.h hVarB3 = ScrollKt.b(hVar3.i(androidx.compose.foundation.layout.W.f10226c), scrollStateA, false, 6);
        f10 = 16;
        if (z15) {
            composerHalfSize = MessageComposerKt.getComposerHalfSize();
        } else {
            composerHalfSize = 0;
        }
        androidx.compose.ui.h hVarJ3 = PaddingKt.j(hVarB3, 0.0f, 0.0f, 0.0f, f10 + composerHalfSize, 7);
        c1086gP.L(1713864494);
        objF4 = c1086gP.f();
        if (objF4 == c0153a) {
            objF4 = new io.intercom.android.sdk.m5.conversation.ui.C(1, x11);
            c1086gP.E(objF4);
        }
        c1086gP.T(false);
        androidx.compose.ui.h hVarA3 = androidx.compose.ui.layout.O.a(hVarJ3, (Ia.l) objF4);
        C0953m c0953mA3 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
        i14 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
        androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarA3);
        ComposeUiNode.f14331c0.getClass();
        aVar3 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar3);
        } else {
            c1086gP.A();
        }
        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA3);
        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
        pVar2 = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O) {
            J4.i.d(i14, c1086gP, i14, pVar2);
        } else {
            J4.i.d(i14, c1086gP, i14, pVar2);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
        c0955o = C0955o.f10310a;
        c1086gP.L(1314348866);
        it = list2.iterator();
        i15 = 0;
        while (it.hasNext()) {
            next = it.next();
            i16 = i15 + 1;
            if (i15 < 0) {
                kotlin.collections.l.x();
                throw null;
            }
            contentRow = (ContentRow) next;
            fGapWithPrevious = gapWithPrevious(contentRow, i15, contentRows);
            aVar4 = aVar2;
            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar4, fGapWithPrevious));
            if (contentRow instanceof ContentRow.BubbleMessageRow) {
                c1086gP.L(39711070);
                composableLambdaImplB = androidx.compose.runtime.internal.a.b(-134975690, new MessageListKt$MessageList$13$1$renderMessageRow$1(contentRow, lVar8, lVar12, c2389d, lVar11), c1086gP);
                bubbleMessageRow = (ContentRow.BubbleMessageRow) contentRow;
                if (bubbleMessageRow.getPartWrapper().getPart().getMessageState() == Part.MessageState.SENDING) {
                    z14 = false;
                    c1086gP.L(41959252);
                    composableLambdaImplB.invoke(c1086gP, 6);
                    c1086gP.T(false);
                } else {
                    z14 = false;
                    c1086gP.L(41959252);
                    composableLambdaImplB.invoke(c1086gP, 6);
                    c1086gP.T(false);
                }
                c1086gP.T(z14);
            } else {
                it = it;
                i16 = i16;
                if (contentRow instanceof ContentRow.PostCardRow) {
                    c1086gP.L(42092490);
                    ContentRow.PostCardRow postCardRow3 = (ContentRow.PostCardRow) contentRow;
                    PostCardRowKt.PostCardRow(null, postCardRow3.getPart(), postCardRow3.getCompanyName(), c1086gP, 64, 1);
                    c1086gP.T(false);
                } else if (contentRow instanceof ContentRow.NoteCardRow) {
                    c1086gP.L(42309738);
                    ContentRow.NoteCardRow noteCardRow3 = (ContentRow.NoteCardRow) contentRow;
                    NoteCardRowKt.NoteCardRow(null, noteCardRow3.getPart(), noteCardRow3.getCompanyName(), c1086gP, 64, 1);
                    c1086gP.T(false);
                } else if (contentRow instanceof ContentRow.SpecialNoticeRow) {
                    c1086gP.L(42551476);
                    SpecialNoticeKt.SpecialNotice(((ContentRow.SpecialNoticeRow) contentRow).getMessage(), PaddingKt.j(aVar4, f10, 0.0f, f10, 0.0f, 10), c1086gP, 48, 0);
                    c1086gP.T(false);
                } else if (contentRow instanceof ContentRow.TeamIntroRow) {
                    c1086gP.L(42760912);
                    TeamIntroKt.TeamIntro(((ContentRow.TeamIntroRow) contentRow).getMessage(), PaddingKt.j(aVar4, f10, 0.0f, f10, 0.0f, 10), c1086gP, 48, 0);
                    c1086gP.T(false);
                } else if (contentRow instanceof ContentRow.ComposerSuggestionRow) {
                    c1086gP.L(43020320);
                    Lb.a.a(c1086gP, c0955o.a(true));
                    QuickRepliesKt.ComposerSuggestions(PaddingKt.h(androidx.compose.foundation.layout.W.d(aVar4, 1.0f), f10, 0.0f, 2), ((ContentRow.ComposerSuggestionRow) contentRow).getSuggestions(), lVar10, c1086gP, 70 | ((i18 >> 3) & 896), 0);
                    c1086gP.T(false);
                } else {
                    if (contentRow instanceof ContentRow.QuickRepliesRow) {
                        c1086gP.L(43469045);
                        Lb.a.a(c1086gP, c0955o.a(true));
                        Ia.l<? super ReplyOption, p293xa.r> lVar113 = lVar9;
                        QuickRepliesKt.AnimatedQuickReplies(((ContentRow.QuickRepliesRow) contentRow).getReplyOptions(), lVar113, c1086gP, ((i18 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
                        c1086gP.T(false);
                        cVar = cVar;
                        hVar3 = hVar3;
                        lVar9 = lVar113;
                    } else if (contentRow instanceof ContentRow.DayDividerRow) {
                        c1086gP.L(1941075241);
                        DayDividerKt.DayDivider(TimeFormatterExtKt.formattedDateForDayDivider(((ContentRow.DayDividerRow) contentRow).getTimestamp(), (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b)), androidx.compose.foundation.layout.W.d(aVar4, 1.0f), c1086gP, 48, 0);
                        c1086gP.T(false);
                    } else if (contentRow instanceof ContentRow.BigTicketRow) {
                        c1086gP.L(44027293);
                        BigTicketCardKt.BigTicketCard(((ContentRow.BigTicketRow) contentRow).getTicketDetailContentState(), aVar6, true, null, c1086gP, ((i18 >> 21) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 8);
                        c1086gP.T(false);
                    } else {
                        if (contentRow instanceof ContentRow.AskedAboutRow) {
                            c1086gP.L(44321607);
                            AskedAboutRowKt.AskedAboutRow(androidx.compose.foundation.layout.W.d(aVar4, 1.0f), ((ContentRow.AskedAboutRow) contentRow).getPart(), c1086gP, 70, 0);
                            c1086gP.T(false);
                        } else if (contentRow instanceof ContentRow.EventRow) {
                            c1086gP.L(44573637);
                            ContentRow.EventRow eventRow3 = (ContentRow.EventRow) contentRow;
                            EventRowKt.EventRow(androidx.compose.foundation.layout.W.d(aVar4, 1.0f), eventRow3.getLabel(), new AvatarWrapper(eventRow3.getAvatar(), false, 2, null), c1086gP, 518, 0);
                            c1086gP.T(false);
                        } else {
                            hVar3 = hVar3;
                            if (contentRow instanceof ContentRow.TicketStatusRow) {
                                c1086gP.L(44932369);
                                ContentRow.TicketStatusRow ticketStatusRow3 = (ContentRow.TicketStatusRow) contentRow;
                                context = context3;
                                TicketStatusRowKt.TicketStatusRow(ticketStatusRow3.getTicketEventStatus(), ticketStatusRow3.getTicketStatusText(), TimeFormatterExtKt.formattedDateFromLong(ticketStatusRow3.getCreatedAt(), context), PaddingKt.h(aVar4, f10, 0.0f, 2), ticketStatusRow3.getCustomStateLabel(), ticketStatusRow3.getCustomStatePrefix(), c1086gP, 3072, 0);
                                c1086gP.T(false);
                            } else {
                                context = context3;
                                if (contentRow instanceof ContentRow.MergedConversationRow) {
                                    c1086gP.L(45468080);
                                    mergedConversationRow = (ContentRow.MergedConversationRow) contentRow;
                                    description = mergedConversationRow.getDescription();
                                    if (description != null) {
                                        MergedConversationRowKt.MergedConversationRow(null, mergedConversationRow.getDescription(), mergedConversationRow.getConversationId(), n10, c1086gP, (i11 << 6) & 7168, 1);
                                    }
                                    c1086gP.T(false);
                                } else {
                                    if (contentRow instanceof ContentRow.FinAnswerRow) {
                                        c1086gP.L(45935188);
                                        ContentRow.FinAnswerRow finAnswerRow3 = (ContentRow.FinAnswerRow) contentRow;
                                        context3 = context;
                                        pVar4 = pVar6;
                                        FinAnswerRowKt.FinAnswerRow(finAnswerRow3.getPart(), finAnswerRow3.getGroupingPosition(), null, TimeFormatterExtKt.toHourOfDay(finAnswerRow3.getPart().getCreatedAt()), new N(pVar4, 0, (ContentRow.FinAnswerRow) contentRow), c1086gP, 8, 4);
                                        c1086gP.T(false);
                                        cVar = cVar;
                                    } else {
                                        context3 = context;
                                        pVar4 = pVar6;
                                        if (contentRow instanceof ContentRow.FinStreamingRow) {
                                            c1086gP.L(46446750);
                                            androidx.compose.ui.h hVarD3 = androidx.compose.foundation.layout.W.d(PaddingKt.j(aVar4, 0.0f, 0.0f, 0.0f, f10, 7), 1.0f);
                                            c1086gP.L(1941167915);
                                            cVar = cVar;
                                            zK2 = c1086gP.K(cVar) | c1086gP.g(fGapWithPrevious);
                                            objF6 = c1086gP.f();
                                            if (zK2) {
                                                objF6 = new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.P
                                                    @Override // Ia.l
                                                    public final Object invoke(Object obj3) {
                                                        return MessageListKt.MessageList$lambda$38$lambda$37$lambda$32$lambda$31(cVar, fGapWithPrevious, x13, x11, x12, (InterfaceC1170p) obj3);
                                                    }
                                                };
                                                c1086gP.E(objF6);
                                            } else {
                                                objF6 = new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.P
                                                    @Override // Ia.l
                                                    public final Object invoke(Object obj3) {
                                                        return MessageListKt.MessageList$lambda$38$lambda$37$lambda$32$lambda$31(cVar, fGapWithPrevious, x13, x11, x12, (InterfaceC1170p) obj3);
                                                    }
                                                };
                                                c1086gP.E(objF6);
                                            }
                                            c1086gP.T(false);
                                            ContentRow.FinStreamingRow finStreamingRow3 = (ContentRow.FinStreamingRow) contentRow;
                                            FinStreamingRowKt.FinStreamingRow(finStreamingRow3.getBlocks(), finStreamingRow3.getStreamingPart(), androidx.compose.ui.layout.O.a(hVarD3, (Ia.l) objF6), c1086gP, 72, 0);
                                            c1086gP.T(false);
                                        } else {
                                            cVar = cVar;
                                            if (contentRow instanceof ContentRow.TypingIndicatorRow) {
                                                c1086gP.L(47420863);
                                                c1086gP.L(1941193447);
                                                objF5 = c1086gP.f();
                                                if (objF5 == c0153a) {
                                                    obj = objF5;
                                                    androidx.compose.animation.core.K k13 = new androidx.compose.animation.core.K(Boolean.FALSE);
                                                    k13.f(Boolean.TRUE);
                                                    c1086gP.E(k13);
                                                    obj = k13;
                                                }
                                                obj = objF5;
                                                c1086gP.T(false);
                                                c0153a = c0153a;
                                                AnimatedVisibilityKt.c(c0955o, (androidx.compose.animation.core.K) obj, null, EnterExitTransitionKt.e(null, 0.0f, 3).b(EnterExitTransitionKt.n(new coil.compose.d(1))), EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.q(new C2388z(1), 1)), null, androidx.compose.runtime.internal.a.b(-1398882549, new Ia.q<InterfaceC0928f, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$MessageList$13$1$6
                                                    @Override // Ia.q
                                                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0928f interfaceC0928f, InterfaceC1084f interfaceC1084f2, Integer num) {
                                                        invoke(interfaceC0928f, interfaceC1084f2, num.intValue());
                                                        return p293xa.r.f47939a;
                                                    }

                                                    public final void invoke(InterfaceC0928f AnimatedVisibility, InterfaceC1084f interfaceC1084f2, int i20) {
                                                        kotlin.jvm.internal.i.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                                        TypingIndicatorKt.m257TypingIndicator6a0pyJM(PaddingKt.h(androidx.compose.foundation.layout.W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 16, 0.0f, 2), ((ContentRow.TypingIndicatorRow) contentRow).getCurrentlyTypingState(), 36, interfaceC1084f2, 454, 0);
                                                    }
                                                }, c1086gP), c1086gP, 1600518, 18);
                                                c1086gP.T(false);
                                            } else {
                                                c0153a = c0153a;
                                                if (contentRow instanceof ContentRow.NewMessagesRow) {
                                                    c1086gP.L(48601374);
                                                    NewMessagesRowKt.NewMessagesRow(null, c1086gP, 0, 1);
                                                    c1086gP.T(false);
                                                } else {
                                                    if (!(contentRow instanceof ContentRow.FooterNoticeRow)) {
                                                        c1086gP.L(1940948829);
                                                        c1086gP.T(false);
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    c1086gP.L(48719050);
                                                    Lb.a.a(c1086gP, c0955o.a(true));
                                                    ContentRow.FooterNoticeRow footerNoticeRow3 = (ContentRow.FooterNoticeRow) contentRow;
                                                    FooterNoticeKt.ExpandedFooterNotice(PaddingKt.g(24, 4, aVar4), footerNoticeRow3.getFooterNoticeState().getTitle(), footerNoticeRow3.getFooterNoticeState().getSubtitle(), footerNoticeRow3.getFooterNoticeState().getAvatars(), c1086gP, 4102, 0);
                                                    c1086gP.T(false);
                                                }
                                            }
                                        }
                                    }
                                    c0153a = c0153a;
                                }
                            }
                            cVar = cVar;
                            context3 = context;
                        }
                        contentRows = list;
                        c0153a = c0153a;
                        pVar6 = pVar4;
                        cVar = cVar;
                        it = it;
                        i15 = i16;
                        hVar3 = hVar3;
                        aVar2 = aVar4;
                    }
                    pVar4 = pVar6;
                    contentRows = list;
                    c0153a = c0153a;
                    pVar6 = pVar4;
                    cVar = cVar;
                    it = it;
                    i15 = i16;
                    hVar3 = hVar3;
                    aVar2 = aVar4;
                }
            }
            pVar4 = pVar6;
            contentRows = list;
            c0153a = c0153a;
            pVar6 = pVar4;
            cVar = cVar;
            it = it;
            i15 = i16;
            hVar3 = hVar3;
            aVar2 = aVar4;
        }
        hVar2 = hVar3;
        pVar3 = pVar6;
        c1086gP.T(false);
        c1086gP.T(true);
        if (MessageList$lambda$16(x12)) {
            c1086gP.l(new Q(a10, 0, scrollStateA));
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final ScrollState scrollState4 = scrollStateA;
            final Ia.l lVar114 = lVar9;
            final Ia.l lVar115 = lVar8;
            final Ia.l lVar116 = c2389d;
            final boolean z18 = z15;
            final Ia.l lVar117 = n10;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.S
                @Override // Ia.p
                public final Object invoke(Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj4).intValue();
                    androidx.compose.ui.h hVar4 = hVar2;
                    ScrollState scrollState5 = scrollState4;
                    int i20 = i11;
                    int i21 = i12;
                    return MessageListKt.MessageList$lambda$40(hVar4, list, scrollState5, lVar10, lVar114, lVar11, lVar12, lVar115, aVar6, lVar116, z18, lVar117, pVar3, i10, i20, i21, (InterfaceC1084f) obj3, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MessageList$lambda$0(ReplySuggestion it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MessageList$lambda$1(ReplyOption it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessageListCoordinates MessageList$lambda$10(androidx.compose.runtime.X<MessageListCoordinates> x10) {
        return x10.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessageListCoordinates MessageList$lambda$13(androidx.compose.runtime.X<MessageListCoordinates> x10) {
        return x10.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MessageList$lambda$16(androidx.compose.runtime.X<Boolean> x10) {
        return x10.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MessageList$lambda$17(androidx.compose.runtime.X<Boolean> x10, boolean z10) {
        x10.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MessageList$lambda$19(androidx.compose.runtime.X<Boolean> x10) {
        return x10.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MessageList$lambda$2(Part it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MessageList$lambda$20(androidx.compose.runtime.X<Boolean> x10, boolean z10) {
        x10.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MessageList$lambda$26$lambda$25(androidx.compose.runtime.X currentBounds$delegate, InterfaceC1170p layoutCoordinates) {
        kotlin.jvm.internal.i.e(currentBounds$delegate, "$currentBounds$delegate");
        kotlin.jvm.internal.i.e(layoutCoordinates, "layoutCoordinates");
        currentBounds$delegate.setValue(new MessageListCoordinates(kotlin.jvm.internal.n.a(layoutCoordinates), kotlin.jvm.internal.n.c(layoutCoordinates), A8.A.k(layoutCoordinates.a()), null));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MessageList$lambda$3(PendingMessage.FailedImageUploadData it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MessageList$lambda$38$lambda$37$lambda$29(Ia.p pVar, ContentRow item, List clickedSource) {
        kotlin.jvm.internal.i.e(item, "$item");
        kotlin.jvm.internal.i.e(clickedSource, "clickedSource");
        if (pVar != null) {
            List<Source> sources = ((ContentRow.FinAnswerRow) item).getPart().getSources();
            kotlin.jvm.internal.i.d(sources, "getSources(...)");
            pVar.invoke(clickedSource, sources);
        }
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MessageList$lambda$38$lambda$37$lambda$32$lambda$31(p013b0.c density, float f10, androidx.compose.runtime.X hasUserScrolled$delegate, androidx.compose.runtime.X currentBounds$delegate, androidx.compose.runtime.X autoScrollEnabled$delegate, InterfaceC1170p it) {
        kotlin.jvm.internal.i.e(density, "$density");
        kotlin.jvm.internal.i.e(hasUserScrolled$delegate, "$hasUserScrolled$delegate");
        kotlin.jvm.internal.i.e(currentBounds$delegate, "$currentBounds$delegate");
        kotlin.jvm.internal.i.e(autoScrollEnabled$delegate, "$autoScrollEnabled$delegate");
        kotlin.jvm.internal.i.e(it, "it");
        I.f fVarC = kotlin.jvm.internal.n.c(it);
        float fT0 = density.T0(f10);
        if (!MessageList$lambda$19(hasUserScrolled$delegate)) {
            float f11 = MessageList$lambda$13(currentBounds$delegate).getBoundsInWindow().f3758b;
            float f12 = fVarC.f3758b;
            MessageList$lambda$17(autoScrollEnabled$delegate, f12 == f11 || f12 > MessageList$lambda$13(currentBounds$delegate).getBoundsInWindow().f3758b + fT0);
        }
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MessageList$lambda$39(kotlinx.coroutines.A scope, ScrollState scrollState) {
        kotlin.jvm.internal.i.e(scope, "$scope");
        C2680e.c(scope, null, null, new MessageListKt$MessageList$14$1(scrollState, null), 3);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MessageList$lambda$4(AttributeData it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MessageList$lambda$40(androidx.compose.ui.h hVar, List contentRows, ScrollState scrollState, Ia.l lVar, Ia.l lVar2, Ia.l lVar3, Ia.l lVar4, Ia.l lVar5, Ia.a aVar, Ia.l lVar6, boolean z10, Ia.l lVar7, Ia.p pVar, int i10, int i11, int i12, InterfaceC1084f interfaceC1084f, int i13) {
        kotlin.jvm.internal.i.e(contentRows, "$contentRows");
        MessageList(hVar, contentRows, scrollState, lVar, lVar2, lVar3, lVar4, lVar5, aVar, lVar6, z10, lVar7, pVar, interfaceC1084f, L4.b.l(i10 | 1), L4.b.l(i11), i12);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MessageList$lambda$6(TicketType it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MessageList$lambda$7(String it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyboardState MessageList$lambda$8(N0<KeyboardState> n10) {
        return n10.getValue();
    }

    @IntercomPreviews
    public static final void MessageListPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(394311697);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MessageListKt.INSTANCE.m170getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new O(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MessageListPreview$lambda$41(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        MessageListPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final float gapWithPrevious(ContentRow contentRow, int i10, List<? extends ContentRow> allContentRows) {
        GroupingPosition groupingPosition;
        kotlin.jvm.internal.i.e(contentRow, "contentRow");
        kotlin.jvm.internal.i.e(allContentRows, "allContentRows");
        if (contentRow instanceof ContentRow.DayDividerRow) {
            return LargeMessageGap;
        }
        if (!(contentRow instanceof ContentRow.SpecialNoticeRow) && !(contentRow instanceof ContentRow.TeamIntroRow) && !(contentRow instanceof ContentRow.BubbleMessageRow) && !(contentRow instanceof ContentRow.FinAnswerRow) && !(contentRow instanceof ContentRow.QuickRepliesRow) && !(contentRow instanceof ContentRow.AskedAboutRow) && !(contentRow instanceof ContentRow.BigTicketRow) && !(contentRow instanceof ContentRow.ComposerSuggestionRow) && !(contentRow instanceof ContentRow.EventRow) && !(contentRow instanceof ContentRow.TypingIndicatorRow) && !(contentRow instanceof ContentRow.NewMessagesRow) && !(contentRow instanceof ContentRow.FooterNoticeRow) && !(contentRow instanceof ContentRow.PostCardRow) && !(contentRow instanceof ContentRow.NoteCardRow) && !(contentRow instanceof ContentRow.FinStreamingRow)) {
            if (contentRow instanceof ContentRow.TicketStatusRow) {
                return BigMessageGap;
            }
            if (contentRow instanceof ContentRow.MergedConversationRow) {
                return BigMessageGap;
            }
            throw new NoWhenBranchMatchedException();
        }
        ContentRow.BubbleMessageRow bubbleMessageRow = contentRow instanceof ContentRow.BubbleMessageRow ? (ContentRow.BubbleMessageRow) contentRow : null;
        if (bubbleMessageRow == null || (groupingPosition = bubbleMessageRow.getGroupingPosition()) == null) {
            ContentRow.FinAnswerRow finAnswerRow = contentRow instanceof ContentRow.FinAnswerRow ? (ContentRow.FinAnswerRow) contentRow : null;
            groupingPosition = finAnswerRow != null ? finAnswerRow.getGroupingPosition() : GroupingPosition.STANDALONE;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[groupingPosition.ordinal()];
        if (i11 == 1 || i11 == 2) {
            ContentRow contentRow2 = (ContentRow) kotlin.collections.q.Q(i10 - 1, allContentRows);
            if (contentRow2 instanceof ContentRow.TicketStatusRow) {
                return BigMessageGap;
            }
            return contentRow2 instanceof ContentRow.MergedConversationRow ? BigMessageGap : DefaultMessageGap;
        }
        if (i11 == 3 || i11 == 4) {
            return GroupedMessageGap;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isAtBottom(ScrollState scrollState) {
        return scrollState.f9824a.o() == scrollState.f9827d.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MessageList$lambda$38$lambda$37$lambda$35(int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MessageList$lambda$38$lambda$37$lambda$36(int i10) {
        return i10;
    }
}
