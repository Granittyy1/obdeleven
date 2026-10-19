package io.intercom.android.sdk.m5.conversation.ui.components;

import android.content.Context;
import androidx.compose.animation.core.C0907g;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.C1079c0;
import androidx.compose.runtime.C1081d0;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.braze.support.BrazeLogger;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.components.FooterNoticeKt;
import io.intercom.android.sdk.m5.components.PoweredByBadgeKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.components.z0;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiStateKt;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.m5.conversation.ui.C2398m;
import io.intercom.android.sdk.m5.conversation.ui.C2399n;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.AskedAboutRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.DayDividerKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.EventRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.FailedMessage;
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
import io.intercom.android.sdk.ui.common.IntercomArrangement;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: LazyMessageList.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class LazyMessageListKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$13, reason: invalid class name */
    /* JADX INFO: compiled from: LazyMessageList.kt */
    @Aa.c(c = "io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$13", f = "LazyMessageList.kt", l = {153}, m = "invokeSuspend")
    public static final class AnonymousClass13 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ List<ContentRow> $contentRows;
        final /* synthetic */ androidx.compose.runtime.X<Boolean> $isListAtTheBottom$delegate;
        final /* synthetic */ LazyListState $lazyListState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass13(List<? extends ContentRow> list, LazyListState lazyListState, androidx.compose.runtime.X<Boolean> x10, kotlin.coroutines.c<? super AnonymousClass13> cVar) {
            super(2, cVar);
            this.$contentRows = list;
            this.$lazyListState = lazyListState;
            this.$isListAtTheBottom$delegate = x10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass13(this.$contentRows, this.$lazyListState, this.$isListAtTheBottom$delegate, cVar);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0062 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LazyListState lazyListState;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                if (LazyMessageListKt.LazyMessageList$lambda$17(this.$isListAtTheBottom$delegate)) {
                    lazyListState = this.$lazyListState;
                    this.label = 1;
                    W.f fVar = LazyListState.f10350w;
                    if (lazyListState.f(BrazeLogger.SUPPRESS, 0, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    List<ContentRow> list = this.$contentRows;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                ContentRow contentRow = (ContentRow) it.next();
                                ContentRow.BubbleMessageRow bubbleMessageRow = contentRow instanceof ContentRow.BubbleMessageRow ? (ContentRow.BubbleMessageRow) contentRow : null;
                                if (bubbleMessageRow != null && bubbleMessageRow.isPending()) {
                                    break;
                                }
                            }
                        }
                        lazyListState = this.$lazyListState;
                        this.label = 1;
                        W.f fVar2 = LazyListState.f10350w;
                        if (lazyListState.f(BrazeLogger.SUPPRESS, 0, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
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
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass13) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0217  */
    /* JADX WARN: Code duplicated, block: B:118:0x0249  */
    /* JADX WARN: Code duplicated, block: B:121:0x0270  */
    /* JADX WARN: Code duplicated, block: B:122:0x0275  */
    /* JADX WARN: Code duplicated, block: B:132:0x0296  */
    /* JADX WARN: Code duplicated, block: B:135:0x0300  */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x018e  */
    /* JADX WARN: Code duplicated, block: B:92:0x01db  */
    public static final void LazyMessageList(androidx.compose.ui.h hVar, final List<? extends ContentRow> contentRows, LazyListState lazyListState, Ia.l<? super ReplySuggestion, p293xa.r> lVar, Ia.l<? super ReplyOption, p293xa.r> lVar2, Ia.l<? super Part, p293xa.r> lVar3, Ia.l<? super PendingMessage.FailedImageUploadData, p293xa.r> lVar4, Ia.l<? super AttributeData, p293xa.r> lVar5, Ia.a<p293xa.r> aVar, Ia.l<? super TicketType, p293xa.r> lVar6, boolean z10, Ia.l<? super String, p293xa.r> lVar7, boolean z11, Ia.p<? super List<InlineSource>, ? super List<Source>, p293xa.r> pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11, final int i12) {
        LazyListState lazyListStateA;
        int i13;
        androidx.compose.ui.h hVar2;
        boolean z12;
        boolean z13;
        Object objF;
        boolean zK;
        Object objF2;
        boolean z14;
        Object objF3;
        Object objF4;
        kotlin.coroutines.c cVar;
        final androidx.compose.ui.h hVar3;
        float composerHalfSize;
        ContentRow contentRow;
        C0945e.l lVarItemAtBottom;
        final LazyListState lazyListState2;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(contentRows, "contentRows");
        C1086g c1086gP = interfaceC1084f.p(-1134649458);
        androidx.compose.ui.h hVar4 = (i12 & 1) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        if ((i12 & 4) != 0) {
            lazyListStateA = androidx.compose.foundation.lazy.s.a(0, c1086gP, 0, 3);
            i13 = i10 & (-897);
        } else {
            lazyListStateA = lazyListState;
            i13 = i10;
        }
        Ia.l<? super ReplySuggestion, p293xa.r> c2388z = (i12 & 8) != 0 ? new C2388z(0) : lVar;
        Ia.l<? super ReplyOption, p293xa.r> c2398m = (i12 & 16) != 0 ? new C2398m(1) : lVar2;
        Ia.l<? super Part, p293xa.r> c2399n = (i12 & 32) != 0 ? new C2399n(1) : lVar3;
        Ia.l<? super PendingMessage.FailedImageUploadData, p293xa.r> kVar = (i12 & 64) != 0 ? new p011ab.k(3) : lVar4;
        Ia.l<? super AttributeData, p293xa.r> yVar = (i12 & 128) != 0 ? new androidx.navigation.compose.y(4) : lVar5;
        Ia.a<p293xa.r> b10 = (i12 & 256) != 0 ? new B() : aVar;
        Ia.l<? super TicketType, p293xa.r> c2356e = (i12 & 512) != 0 ? new C2356e(1) : lVar6;
        boolean z15 = (i12 & 1024) != 0 ? false : z10;
        Ia.l<? super String, p293xa.r> c2357f = (i12 & 2048) != 0 ? new C2357f(1) : lVar7;
        boolean z16 = (i12 & 4096) != 0 ? false : z11;
        Ia.p<? super List<InlineSource>, ? super List<Source>, p293xa.r> pVar2 = (i12 & 8192) != 0 ? null : pVar;
        final Context context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
        N0<KeyboardState> n0KeyboardAsState = KeyboardStateKt.keyboardAsState(c1086gP, 0);
        c1086gP.L(-1167330466);
        Object objF5 = c1086gP.f();
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        if (objF5 == c0153a) {
            objF5 = new C1079c0(0.0f);
            c1086gP.E(objF5);
        }
        androidx.compose.runtime.U u10 = (androidx.compose.runtime.U) objF5;
        c1086gP.T(false);
        c1086gP.L(-1167328227);
        float fT0 = z16 ? ((p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h)).T0(PoweredByBadgeKt.getPoweredByBadgeHeight(c1086gP, 0)) : 0.0f;
        c1086gP.T(false);
        c1086gP.L(-1167323013);
        Object objF6 = c1086gP.f();
        if (objF6 == c0153a) {
            objF6 = new C1081d0(0);
            c1086gP.E(objF6);
        }
        final androidx.compose.runtime.V v10 = (androidx.compose.runtime.V) objF6;
        c1086gP.T(false);
        c1086gP.L(-1167320996);
        Object objF7 = c1086gP.f();
        if (objF7 == c0153a) {
            objF7 = J0.f(Boolean.FALSE);
            c1086gP.E(objF7);
        }
        final androidx.compose.runtime.X x10 = (androidx.compose.runtime.X) objF7;
        c1086gP.T(false);
        Boolean boolValueOf = Boolean.valueOf(LazyMessageList$lambda$8(n0KeyboardAsState).isVisible());
        Boolean boolValueOf2 = Boolean.valueOf(LazyMessageList$lambda$8(n0KeyboardAsState).isAnimating());
        c1086gP.L(-1167316386);
        boolean zK2 = c1086gP.K(n0KeyboardAsState) | c1086gP.g(fT0);
        int i14 = (i10 & 896) ^ 384;
        boolean z17 = true;
        if (i14 <= 256 || !c1086gP.K(lazyListStateA)) {
            hVar2 = hVar4;
            if ((i10 & 384) != 256) {
                z12 = false;
            }
            z13 = zK2 | z12;
            objF = c1086gP.f();
            if (z13 || objF == c0153a) {
                objF = new LazyMessageListKt$LazyMessageList$9$1(fT0, lazyListStateA, n0KeyboardAsState, u10, null);
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            androidx.compose.runtime.E.e(boolValueOf, boolValueOf2, (Ia.p) objF, c1086gP);
            Boolean boolValueOf3 = Boolean.valueOf(LazyMessageList$lambda$8(n0KeyboardAsState).isDismissed());
            c1086gP.L(-1167303537);
            zK = c1086gP.K(n0KeyboardAsState) | ((i14 <= 256 && c1086gP.K(lazyListStateA)) || (i10 & 384) == 256);
            objF2 = c1086gP.f();
            if (zK || objF2 == c0153a) {
                objF2 = new LazyMessageListKt$LazyMessageList$10$1(lazyListStateA, n0KeyboardAsState, x10, u10, null);
                c1086gP.E(objF2);
            }
            c1086gP.T(false);
            androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, boolValueOf3);
            c1086gP.L(-1167295622);
            z14 = (i14 <= 256 && c1086gP.K(lazyListStateA)) || (i10 & 384) == 256;
            objF3 = c1086gP.f();
            if (z14 || objF3 == c0153a) {
                objF3 = new LazyMessageListKt$LazyMessageList$11$1(lazyListStateA, v10, null);
                c1086gP.E(objF3);
            }
            c1086gP.T(false);
            androidx.compose.runtime.E.d((Ia.p) objF3, c1086gP, lazyListStateA);
            c1086gP.L(-1167289324);
            if ((i14 > 256 || !c1086gP.K(lazyListStateA)) && (i10 & 384) != 256) {
            }
            objF4 = c1086gP.f();
            if (!z17 || objF4 == c0153a) {
                cVar = null;
                objF4 = new LazyMessageListKt$LazyMessageList$12$1(lazyListStateA, x10, null);
                c1086gP.E(objF4);
            } else {
                cVar = null;
            }
            c1086gP.T(false);
            androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, lazyListStateA);
            androidx.compose.runtime.E.d(new AnonymousClass13(contentRows, lazyListStateA, x10, cVar), c1086gP, contentRows);
            hVar3 = hVar2;
            androidx.compose.ui.h hVarI = hVar3.i(androidx.compose.foundation.layout.W.f10226c);
            float f10 = 16;
            if (z15) {
                composerHalfSize = MessageComposerKt.getComposerHalfSize();
            } else {
                composerHalfSize = 0;
            }
            androidx.compose.foundation.layout.N nB = PaddingKt.b(0.0f, 0.0f, 0.0f, f10 + composerHalfSize, 7);
            contentRow = (ContentRow) kotlin.collections.q.W(contentRows);
            if (!(contentRow instanceof ContentRow.FooterNoticeRow) || (contentRow instanceof ContentRow.ComposerSuggestionRow) || (contentRow instanceof ContentRow.QuickRepliesRow)) {
                lVarItemAtBottom = IntercomArrangement.INSTANCE.itemAtBottom(kotlin.collections.l.r(contentRows));
            } else {
                lVarItemAtBottom = C0945e.f10286c;
            }
            final Ia.a<p293xa.r> aVar2 = b10;
            final Ia.l<? super ReplySuggestion, p293xa.r> lVar8 = c2388z;
            final Ia.l<? super ReplyOption, p293xa.r> lVar9 = c2398m;
            final LazyListState lazyListState3 = lazyListStateA;
            final Ia.l<? super String, p293xa.r> lVar10 = c2357f;
            final Ia.l<? super AttributeData, p293xa.r> lVar11 = yVar;
            final Ia.l<? super PendingMessage.FailedImageUploadData, p293xa.r> lVar12 = kVar;
            lazyListState2 = lazyListStateA;
            final Ia.l<? super TicketType, p293xa.r> lVar13 = c2356e;
            final Ia.p<? super List<InlineSource>, ? super List<Source>, p293xa.r> pVar3 = pVar2;
            final Ia.l<? super Part, p293xa.r> lVar14 = c2399n;
            LazyDslKt.a(hVarI, lazyListState2, nB, false, lVarItemAtBottom, androidx.compose.ui.d.a.f13347n, null, false, null, new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.C
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return LazyMessageListKt.LazyMessageList$lambda$26(contentRows, aVar2, lVar8, lVar9, lazyListState3, lVar10, lVar11, lVar12, lVar13, context, pVar3, x10, v10, lVar14, (androidx.compose.foundation.lazy.p) obj);
                }
            }, c1086gP, ((i13 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 199680, 448);
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final Ia.l<? super ReplySuggestion, p293xa.r> lVar15 = c2388z;
                final Ia.l<? super ReplyOption, p293xa.r> lVar16 = c2398m;
                final Ia.l<? super Part, p293xa.r> lVar17 = c2399n;
                final Ia.l<? super PendingMessage.FailedImageUploadData, p293xa.r> lVar18 = kVar;
                final Ia.l<? super AttributeData, p293xa.r> lVar19 = yVar;
                final Ia.a<p293xa.r> aVar3 = b10;
                final Ia.l<? super TicketType, p293xa.r> lVar20 = c2356e;
                final boolean z18 = z15;
                final Ia.l<? super String, p293xa.r> lVar21 = c2357f;
                final boolean z19 = z16;
                final Ia.p<? super List<InlineSource>, ? super List<Source>, p293xa.r> pVar4 = pVar2;
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.D
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        androidx.compose.ui.h hVar5 = hVar3;
                        int i15 = i11;
                        int i16 = i12;
                        return LazyMessageListKt.LazyMessageList$lambda$27(hVar5, contentRows, lazyListState2, lVar15, lVar16, lVar17, lVar18, lVar19, aVar3, lVar20, z18, lVar21, z19, pVar4, i10, i15, i16, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        hVar2 = hVar4;
        z12 = true;
        z13 = zK2 | z12;
        objF = c1086gP.f();
        if (z13) {
            objF = new LazyMessageListKt$LazyMessageList$9$1(fT0, lazyListStateA, n0KeyboardAsState, u10, null);
            c1086gP.E(objF);
        } else {
            objF = new LazyMessageListKt$LazyMessageList$9$1(fT0, lazyListStateA, n0KeyboardAsState, u10, null);
            c1086gP.E(objF);
        }
        c1086gP.T(false);
        androidx.compose.runtime.E.e(boolValueOf, boolValueOf2, (Ia.p) objF, c1086gP);
        Boolean boolValueOf4 = Boolean.valueOf(LazyMessageList$lambda$8(n0KeyboardAsState).isDismissed());
        c1086gP.L(-1167303537);
        zK = c1086gP.K(n0KeyboardAsState) | ((i14 <= 256 && c1086gP.K(lazyListStateA)) || (i10 & 384) == 256);
        objF2 = c1086gP.f();
        if (zK) {
            objF2 = new LazyMessageListKt$LazyMessageList$10$1(lazyListStateA, n0KeyboardAsState, x10, u10, null);
            c1086gP.E(objF2);
        } else {
            objF2 = new LazyMessageListKt$LazyMessageList$10$1(lazyListStateA, n0KeyboardAsState, x10, u10, null);
            c1086gP.E(objF2);
        }
        c1086gP.T(false);
        androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, boolValueOf4);
        c1086gP.L(-1167295622);
        if (i14 <= 256) {
        }
        objF3 = c1086gP.f();
        if (z14) {
            objF3 = new LazyMessageListKt$LazyMessageList$11$1(lazyListStateA, v10, null);
            c1086gP.E(objF3);
        } else {
            objF3 = new LazyMessageListKt$LazyMessageList$11$1(lazyListStateA, v10, null);
            c1086gP.E(objF3);
        }
        c1086gP.T(false);
        androidx.compose.runtime.E.d((Ia.p) objF3, c1086gP, lazyListStateA);
        c1086gP.L(-1167289324);
        z17 = i14 > 256 ? false : false;
        objF4 = c1086gP.f();
        if (z17) {
            cVar = null;
            objF4 = new LazyMessageListKt$LazyMessageList$12$1(lazyListStateA, x10, null);
            c1086gP.E(objF4);
        } else {
            cVar = null;
            objF4 = new LazyMessageListKt$LazyMessageList$12$1(lazyListStateA, x10, null);
            c1086gP.E(objF4);
        }
        c1086gP.T(false);
        androidx.compose.runtime.E.d((Ia.p) objF4, c1086gP, lazyListStateA);
        androidx.compose.runtime.E.d(new AnonymousClass13(contentRows, lazyListStateA, x10, cVar), c1086gP, contentRows);
        hVar3 = hVar2;
        androidx.compose.ui.h hVarI2 = hVar3.i(androidx.compose.foundation.layout.W.f10226c);
        float f11 = 16;
        if (z15) {
            composerHalfSize = MessageComposerKt.getComposerHalfSize();
        } else {
            composerHalfSize = 0;
        }
        androidx.compose.foundation.layout.N nB2 = PaddingKt.b(0.0f, 0.0f, 0.0f, f11 + composerHalfSize, 7);
        contentRow = (ContentRow) kotlin.collections.q.W(contentRows);
        if (contentRow instanceof ContentRow.FooterNoticeRow) {
            lVarItemAtBottom = IntercomArrangement.INSTANCE.itemAtBottom(kotlin.collections.l.r(contentRows));
        } else {
            lVarItemAtBottom = IntercomArrangement.INSTANCE.itemAtBottom(kotlin.collections.l.r(contentRows));
        }
        final Ia.a aVar4 = b10;
        final Ia.l lVar22 = c2388z;
        final Ia.l lVar23 = c2398m;
        final LazyListState lazyListState4 = lazyListStateA;
        final Ia.l lVar110 = c2357f;
        final Ia.l lVar111 = yVar;
        final Ia.l lVar112 = kVar;
        lazyListState2 = lazyListStateA;
        final Ia.l lVar113 = c2356e;
        final Ia.p pVar5 = pVar2;
        final Ia.l lVar114 = c2399n;
        LazyDslKt.a(hVarI2, lazyListState2, nB2, false, lVarItemAtBottom, androidx.compose.ui.d.a.f13347n, null, false, null, new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.C
            @Override // Ia.l
            public final Object invoke(Object obj) {
                return LazyMessageListKt.LazyMessageList$lambda$26(contentRows, aVar4, lVar22, lVar23, lazyListState4, lVar110, lVar111, lVar112, lVar113, context, pVar5, x10, v10, lVar114, (androidx.compose.foundation.lazy.p) obj);
            }
        }, c1086gP, ((i13 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 199680, 448);
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final Ia.l lVar115 = c2388z;
            final Ia.l lVar116 = c2398m;
            final Ia.l lVar117 = c2399n;
            final Ia.l lVar118 = kVar;
            final Ia.l lVar119 = yVar;
            final Ia.a aVar5 = b10;
            final Ia.l lVar24 = c2356e;
            final boolean z110 = z15;
            final Ia.l lVar25 = c2357f;
            final boolean z111 = z16;
            final Ia.p pVar6 = pVar2;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.D
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    androidx.compose.ui.h hVar5 = hVar3;
                    int i15 = i11;
                    int i16 = i12;
                    return LazyMessageListKt.LazyMessageList$lambda$27(hVar5, contentRows, lazyListState2, lVar115, lVar116, lVar117, lVar118, lVar119, aVar5, lVar24, z110, lVar25, z111, pVar6, i10, i15, i16, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r LazyMessageList$lambda$0(ReplySuggestion it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r LazyMessageList$lambda$1(ReplyOption it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LazyMessageList$lambda$17(androidx.compose.runtime.X<Boolean> x10) {
        return x10.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LazyMessageList$lambda$18(androidx.compose.runtime.X<Boolean> x10, boolean z10) {
        x10.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r LazyMessageList$lambda$2(Part it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r LazyMessageList$lambda$26(final List contentRows, final Ia.a aVar, final Ia.l lVar, final Ia.l lVar2, final LazyListState lazyListState, final Ia.l lVar3, final Ia.l lVar4, final Ia.l lVar5, final Ia.l lVar6, final Context context, final Ia.p pVar, final androidx.compose.runtime.X isListAtTheBottom$delegate, final androidx.compose.runtime.V firstVisibleItemIndex$delegate, final Ia.l lVar7, androidx.compose.foundation.lazy.p LazyColumn) {
        kotlin.jvm.internal.i.e(contentRows, "$contentRows");
        kotlin.jvm.internal.i.e(context, "$context");
        kotlin.jvm.internal.i.e(isListAtTheBottom$delegate, "$isListAtTheBottom$delegate");
        kotlin.jvm.internal.i.e(firstVisibleItemIndex$delegate, "$firstVisibleItemIndex$delegate");
        kotlin.jvm.internal.i.e(LazyColumn, "$this$LazyColumn");
        final A a10 = new A();
        LazyColumn.g(contentRows.size(), new Ia.l<Integer, Object>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$lambda$26$$inlined$itemsIndexed$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i10) {
                return a10.invoke(Integer.valueOf(i10), contentRows.get(i10));
            }
        }, new Ia.l<Integer, Object>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$lambda$26$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i10) {
                contentRows.get(i10);
                return null;
            }
        }, new ComposableLambdaImpl(true, -1091073711, new Ia.r<androidx.compose.foundation.lazy.b, Integer, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$lambda$26$$inlined$itemsIndexed$default$3
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
                FailedMessage failedMessage;
                String conversationId;
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
                final ContentRow contentRow = (ContentRow) contentRows.get(i10);
                interfaceC1084f.L(890740836);
                androidx.compose.ui.h hVarB = bVar.b(PaddingKt.j(androidx.compose.ui.h.a.f13984b, 0.0f, MessageListKt.gapWithPrevious(contentRow, i10, contentRows), 0.0f, 0.0f, 13), LazyMessageListKt.shouldFadeInItem(contentRow) ? C0907g.c(0.0f, 400.0f, null, 5) : null, LazyMessageListKt.shouldFadeOutItem(contentRow) ? C0907g.c(0.0f, 400.0f, null, 5) : null);
                if (contentRow instanceof ContentRow.AskedAboutRow) {
                    interfaceC1084f.L(891339476);
                    AskedAboutRowKt.AskedAboutRow(androidx.compose.foundation.layout.W.d(hVarB, 1.0f), ((ContentRow.AskedAboutRow) contentRow).getPart(), interfaceC1084f, 64, 0);
                    interfaceC1084f.D();
                } else if (contentRow instanceof ContentRow.BigTicketRow) {
                    interfaceC1084f.L(891571232);
                    BigTicketCardKt.BigTicketCard(((ContentRow.BigTicketRow) contentRow).getTicketDetailContentState(), aVar, true, hVarB, interfaceC1084f, 392, 0);
                    interfaceC1084f.D();
                } else if (contentRow instanceof ContentRow.ComposerSuggestionRow) {
                    interfaceC1084f.L(891925035);
                    QuickRepliesKt.ComposerSuggestions(PaddingKt.h(androidx.compose.foundation.layout.W.d(hVarB, 1.0f), 16, 0.0f, 2), ((ContentRow.ComposerSuggestionRow) contentRow).getSuggestions(), lVar, interfaceC1084f, 64, 0);
                    interfaceC1084f.D();
                } else if (contentRow instanceof ContentRow.QuickRepliesRow) {
                    interfaceC1084f.L(892323726);
                    float f10 = 16;
                    QuickRepliesKt.ReplyOptions(PaddingKt.j(androidx.compose.foundation.layout.W.d(hVarB, 1.0f), f10, 0.0f, f10, 0.0f, 10), ((ContentRow.QuickRepliesRow) contentRow).getReplyOptions(), lVar2, interfaceC1084f, 64, 0);
                    interfaceC1084f.D();
                } else if (contentRow instanceof ContentRow.DayDividerRow) {
                    interfaceC1084f.L(892713985);
                    DayDividerKt.DayDivider(TimeFormatterExtKt.formattedDateForDayDivider(((ContentRow.DayDividerRow) contentRow).getTimestamp(), (Context) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14793b)), androidx.compose.foundation.layout.W.d(hVarB, 1.0f), interfaceC1084f, 0, 0);
                    interfaceC1084f.D();
                } else if (contentRow instanceof ContentRow.EventRow) {
                    interfaceC1084f.L(892988986);
                    ContentRow.EventRow eventRow = (ContentRow.EventRow) contentRow;
                    EventRowKt.EventRow(androidx.compose.foundation.layout.W.d(hVarB, 1.0f), eventRow.getLabel(), new AvatarWrapper(eventRow.getAvatar(), false, 2, null), interfaceC1084f, 512, 0);
                    interfaceC1084f.D();
                } else if (contentRow instanceof ContentRow.FinAnswerRow) {
                    interfaceC1084f.L(893282835);
                    ContentRow.FinAnswerRow finAnswerRow = (ContentRow.FinAnswerRow) contentRow;
                    Part part = finAnswerRow.getPart();
                    GroupingPosition groupingPosition = finAnswerRow.getGroupingPosition();
                    String hourOfDay = TimeFormatterExtKt.toHourOfDay(finAnswerRow.getPart().getCreatedAt());
                    final Ia.p pVar2 = pVar;
                    FinAnswerRowKt.FinAnswerRow(part, groupingPosition, hVarB, hourOfDay, new Ia.l<List<? extends InlineSource>, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$14$2$1
                        @Override // Ia.l
                        public /* bridge */ /* synthetic */ p293xa.r invoke(List<? extends InlineSource> list) {
                            invoke2((List<InlineSource>) list);
                            return p293xa.r.f47939a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(List<InlineSource> selectedSources) {
                            kotlin.jvm.internal.i.e(selectedSources, "selectedSources");
                            Ia.p<List<InlineSource>, List<Source>, p293xa.r> pVar3 = pVar2;
                            if (pVar3 != null) {
                                List<Source> sources = ((ContentRow.FinAnswerRow) contentRow).getPart().getSources();
                                kotlin.jvm.internal.i.d(sources, "getSources(...)");
                                pVar3.invoke(selectedSources, sources);
                            }
                        }
                    }, interfaceC1084f, 8, 0);
                    interfaceC1084f.D();
                } else if (contentRow instanceof ContentRow.FinStreamingRow) {
                    interfaceC1084f.L(893832465);
                    ContentRow.FinStreamingRow finStreamingRow = (ContentRow.FinStreamingRow) contentRow;
                    List<Block> blocks = finStreamingRow.getBlocks();
                    interfaceC1084f.L(-248260056);
                    boolean zK = interfaceC1084f.K(lazyListState) | ((((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32 && interfaceC1084f.h(i10)) || (i12 & 48) == 32);
                    Object objF = interfaceC1084f.f();
                    if (zK || objF == InterfaceC1084f.a.f12980a) {
                        LazyMessageListKt$LazyMessageList$14$2$2$1 lazyMessageListKt$LazyMessageList$14$2$2$1 = new LazyMessageListKt$LazyMessageList$14$2$2$1(i10, lazyListState, isListAtTheBottom$delegate, firstVisibleItemIndex$delegate, null);
                        interfaceC1084f.E(lazyMessageListKt$LazyMessageList$14$2$2$1);
                        objF = lazyMessageListKt$LazyMessageList$14$2$2$1;
                    }
                    interfaceC1084f.D();
                    androidx.compose.runtime.E.d((Ia.p) objF, interfaceC1084f, blocks);
                    FinStreamingRowKt.FinStreamingRow(finStreamingRow.getBlocks(), finStreamingRow.getStreamingPart(), androidx.compose.foundation.layout.W.d(hVarB, 1.0f), interfaceC1084f, 72, 0);
                    interfaceC1084f.D();
                } else {
                    if (!(contentRow instanceof ContentRow.FooterNoticeRow)) {
                        if (contentRow instanceof ContentRow.MergedConversationRow) {
                            interfaceC1084f.L(894809647);
                            ContentRow.MergedConversationRow mergedConversationRow = (ContentRow.MergedConversationRow) contentRow;
                            String description = mergedConversationRow.getDescription();
                            if (description != null && description.length() != 0 && (conversationId = mergedConversationRow.getConversationId()) != null && conversationId.length() != 0) {
                                MergedConversationRowKt.MergedConversationRow(hVarB, mergedConversationRow.getDescription(), mergedConversationRow.getConversationId(), lVar3, interfaceC1084f, 0, 0);
                            }
                            interfaceC1084f.D();
                        } else if (contentRow instanceof ContentRow.BubbleMessageRow) {
                            interfaceC1084f.L(895359308);
                            androidx.compose.ui.h hVarD = androidx.compose.foundation.layout.W.d(hVarB, 1.0f);
                            ContentRow.BubbleMessageRow bubbleMessageRow = (ContentRow.BubbleMessageRow) contentRow;
                            Part part2 = bubbleMessageRow.getPartWrapper().getPart();
                            String hourOfDay2 = TimeFormatterExtKt.toHourOfDay(bubbleMessageRow.getPartWrapper().getPart().getCreatedAt());
                            List<String> failedAttributeIdentifiers = bubbleMessageRow.getPartWrapper().getFailedAttributeIdentifiers();
                            List<String> loadingAttributeIdentifiers = bubbleMessageRow.getPartWrapper().getLoadingAttributeIdentifiers();
                            GroupingPosition groupingPosition2 = bubbleMessageRow.getGroupingPosition();
                            boolean zIsAdminOrAltParticipant = bubbleMessageRow.getPartWrapper().isAdminOrAltParticipant();
                            PendingMessage.FailedImageUploadData failedImageUploadData = bubbleMessageRow.getFailedImageUploadData();
                            interfaceC1084f.L(-248183875);
                            if (bubbleMessageRow.isFailed()) {
                                String strP = S4.o.p(interfaceC1084f, io.intercom.android.sdk.R.string.intercom_failed_delivery);
                                final Ia.l lVar8 = lVar7;
                                failedMessage = new FailedMessage(strP, new Ia.a<p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$14$2$3
                                    @Override // Ia.a
                                    public /* bridge */ /* synthetic */ p293xa.r invoke() {
                                        invoke2();
                                        return p293xa.r.f47939a;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        lVar8.invoke(((ContentRow.BubbleMessageRow) contentRow).getPartWrapper().getPart());
                                    }
                                });
                            } else {
                                failedMessage = null;
                            }
                            interfaceC1084f.D();
                            BubbleMessageRowKt.BubbleMessageRow(part2, groupingPosition2, zIsAdminOrAltParticipant, hVarD, hourOfDay2, lVar4, failedAttributeIdentifiers, loadingAttributeIdentifiers, lVar5, failedImageUploadData, failedMessage, lVar6, interfaceC1084f, 18874376, 0, 0);
                            interfaceC1084f.D();
                        } else if (contentRow instanceof ContentRow.NewMessagesRow) {
                            interfaceC1084f.L(896702476);
                            NewMessagesRowKt.NewMessagesRow(hVarB, interfaceC1084f, 0, 0);
                            interfaceC1084f.D();
                        } else if (contentRow instanceof ContentRow.NoteCardRow) {
                            interfaceC1084f.L(896877037);
                            ContentRow.NoteCardRow noteCardRow = (ContentRow.NoteCardRow) contentRow;
                            NoteCardRowKt.NoteCardRow(hVarB, noteCardRow.getPart(), noteCardRow.getCompanyName(), interfaceC1084f, 64, 0);
                            interfaceC1084f.D();
                        } else if (contentRow instanceof ContentRow.PostCardRow) {
                            interfaceC1084f.L(897142893);
                            ContentRow.PostCardRow postCardRow = (ContentRow.PostCardRow) contentRow;
                            PostCardRowKt.PostCardRow(hVarB, postCardRow.getPart(), postCardRow.getCompanyName(), interfaceC1084f, 64, 0);
                            interfaceC1084f.D();
                        } else if (contentRow instanceof ContentRow.TeamIntroRow) {
                            interfaceC1084f.L(897409152);
                            float f11 = 16;
                            TeamIntroKt.TeamIntro(((ContentRow.TeamIntroRow) contentRow).getMessage(), PaddingKt.j(hVarB, f11, 0.0f, f11, 0.0f, 10), interfaceC1084f, 0, 0);
                            interfaceC1084f.D();
                        } else if (contentRow instanceof ContentRow.SpecialNoticeRow) {
                            interfaceC1084f.L(897661244);
                            float f12 = 16;
                            SpecialNoticeKt.SpecialNotice(((ContentRow.SpecialNoticeRow) contentRow).getMessage(), PaddingKt.j(hVarB, f12, 0.0f, f12, 0.0f, 10), interfaceC1084f, 0, 0);
                            interfaceC1084f.D();
                        } else if (contentRow instanceof ContentRow.TicketStatusRow) {
                            interfaceC1084f.L(897924961);
                            ContentRow.TicketStatusRow ticketStatusRow = (ContentRow.TicketStatusRow) contentRow;
                            TicketStatusRowKt.TicketStatusRow(ticketStatusRow.getTicketEventStatus(), ticketStatusRow.getTicketStatusText(), TimeFormatterExtKt.formattedDateFromLong(ticketStatusRow.getCreatedAt(), context), PaddingKt.h(hVarB, 16, 0.0f, 2), ticketStatusRow.getCustomStateLabel(), ticketStatusRow.getCustomStatePrefix(), interfaceC1084f, 0, 0);
                            interfaceC1084f.D();
                        } else {
                            if (!(contentRow instanceof ContentRow.TypingIndicatorRow)) {
                                interfaceC1084f.L(-248336320);
                                interfaceC1084f.D();
                                throw new NoWhenBranchMatchedException();
                            }
                            interfaceC1084f.L(898459153);
                            TypingIndicatorKt.m257TypingIndicator6a0pyJM(PaddingKt.h(androidx.compose.foundation.layout.W.d(hVarB, 1.0f), 16, 0.0f, 2), ((ContentRow.TypingIndicatorRow) contentRow).getCurrentlyTypingState(), 36, interfaceC1084f, 448, 0);
                            interfaceC1084f.D();
                        }
                        interfaceC1084f.D();
                    }
                    interfaceC1084f.L(894379925);
                    ContentRow.FooterNoticeRow footerNoticeRow = (ContentRow.FooterNoticeRow) contentRow;
                    FooterNoticeKt.ExpandedFooterNotice(PaddingKt.g(24, 4, hVarB), footerNoticeRow.getFooterNoticeState().getTitle(), footerNoticeRow.getFooterNoticeState().getSubtitle(), footerNoticeRow.getFooterNoticeState().getAvatars(), interfaceC1084f, 4096, 0);
                    interfaceC1084f.D();
                }
                interfaceC1084f.D();
            }
        }));
        androidx.compose.foundation.lazy.p.c(LazyColumn, ConversationUiStateKt.LastAnchorRowKey, ComposableSingletons$LazyMessageListKt.INSTANCE.m162getLambda1$intercom_sdk_base_release(), 2);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object LazyMessageList$lambda$26$lambda$23(int i10, ContentRow item) {
        kotlin.jvm.internal.i.e(item, "item");
        return item.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r LazyMessageList$lambda$27(androidx.compose.ui.h hVar, List contentRows, LazyListState lazyListState, Ia.l lVar, Ia.l lVar2, Ia.l lVar3, Ia.l lVar4, Ia.l lVar5, Ia.a aVar, Ia.l lVar6, boolean z10, Ia.l lVar7, boolean z11, Ia.p pVar, int i10, int i11, int i12, InterfaceC1084f interfaceC1084f, int i13) {
        kotlin.jvm.internal.i.e(contentRows, "$contentRows");
        LazyMessageList(hVar, contentRows, lazyListState, lVar, lVar2, lVar3, lVar4, lVar5, aVar, lVar6, z10, lVar7, z11, pVar, interfaceC1084f, L4.b.l(i10 | 1), L4.b.l(i11), i12);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r LazyMessageList$lambda$3(PendingMessage.FailedImageUploadData it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r LazyMessageList$lambda$4(AttributeData it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r LazyMessageList$lambda$6(TicketType it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r LazyMessageList$lambda$7(String it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyboardState LazyMessageList$lambda$8(N0<KeyboardState> n10) {
        return n10.getValue();
    }

    @IntercomPreviews
    public static final void LazyMessageListPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(834972857);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$LazyMessageListKt.INSTANCE.m164getLambda3$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new z0(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r LazyMessageListPreview$lambda$28(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        LazyMessageListPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:13:0x002a A[RETURN, SYNTHETIC] */
    public static final boolean shouldFadeInItem(ContentRow contentRow) {
        if (!(contentRow instanceof ContentRow.TypingIndicatorRow)) {
            if (contentRow instanceof ContentRow.BubbleMessageRow) {
                ContentRow.BubbleMessageRow bubbleMessageRow = (ContentRow.BubbleMessageRow) contentRow;
                if (!bubbleMessageRow.getPartWrapper().isLastPart() || bubbleMessageRow.getPartWrapper().getPart().getMessageState() != Part.MessageState.SENDING) {
                    if (contentRow instanceof ContentRow.QuickRepliesRow) {
                        return false;
                    }
                }
            } else if (contentRow instanceof ContentRow.QuickRepliesRow) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldFadeOutItem(ContentRow contentRow) {
        return (contentRow instanceof ContentRow.TypingIndicatorRow) || (contentRow instanceof ContentRow.QuickRepliesRow);
    }
}
