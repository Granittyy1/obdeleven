package io.intercom.android.sdk.post;

import Ia.p;
import Ia.q;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.animation.k;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.L;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.h;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.activities.IntercomBaseActivity;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.C2333d;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockRenderTextStyle;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.survey.block.ImageRenderType;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.Phrase;
import io.intercom.android.sdk.utilities.TimeFormatter;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.l;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import p293xa.g;
import p293xa.r;

/* JADX INFO: compiled from: PostActivityV2.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class PostActivityV2 extends IntercomBaseActivity {
    private static final String COMPOSER_IS_VISIBLE = "composer_is_visible";
    private static final String LAST_PARTICIPANT = "last_participant";
    private static final String PARCEL_CONVERSATION_ID = "parcel_conversation_id";
    private static final String PARCEL_PART = "parcel_part";
    private static final String POST_PREVIEW = "is_post_preview";
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final g injector$delegate = kotlin.a.a(new C2333d(1));
    private final g appConfigProvider$delegate = kotlin.a.a(new coil.d(2, this));
    private final g timeFormatter$delegate = kotlin.a.a(new Y2.a(1, this));

    /* JADX INFO: compiled from: PostActivityV2.kt */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Provider appConfigProvider_delegate$lambda$1(PostActivityV2 this$0) {
        i.e(this$0, "this$0");
        return this$0.getInjector().getAppConfigProvider();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Provider<AppConfig> getAppConfigProvider() {
        return (Provider) this.appConfigProvider$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getConversationId() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        String string = extras.getString(PARCEL_CONVERSATION_ID, "");
        i.d(string, "getString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Injector getInjector() {
        return (Injector) this.injector$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Part getPart() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            extras.setClassLoader(Part.class.getClassLoader());
            if (extras.containsKey(PARCEL_PART)) {
                Part part = (Part) p271w0.b.a(extras, PARCEL_PART, Part.class);
                if (part != null) {
                    return part;
                }
                Part NULL = Part.NULL;
                i.d(NULL, "NULL");
                return NULL;
            }
        }
        Part NULL2 = Part.NULL;
        i.d(NULL2, "NULL");
        return NULL2;
    }

    private final TimeFormatter getTimeFormatter() {
        return (TimeFormatter) this.timeFormatter$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getUserStatus() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey(LAST_PARTICIPANT)) {
            return "";
        }
        LastParticipatingAdmin lastParticipatingAdmin = (LastParticipatingAdmin) p271w0.b.a(extras, LAST_PARTICIPANT, LastParticipatingAdmin.class);
        if (LastParticipatingAdmin.isNull(lastParticipatingAdmin)) {
            return "";
        }
        TimeFormatter timeFormatter = getTimeFormatter();
        i.b(lastParticipatingAdmin);
        timeFormatter.getAdminActiveStatus(lastParticipatingAdmin, getAppConfigProvider());
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isComposerVisible() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            return extras.getBoolean(COMPOSER_IS_VISIBLE, true);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPreview() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        return extras.getBoolean(POST_PREVIEW, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openConversation() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        String string = extras.getString(PARCEL_CONVERSATION_ID, "");
        getInjector().getMetricTracker().openedConversationFromFull(string, getPart().getId());
        startActivity(ConversationScreenOpenerKt.getConversationIntent(this, string));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendPostAsRead() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey(PARCEL_CONVERSATION_ID)) {
            return;
        }
        String string = extras.getString(PARCEL_CONVERSATION_ID, "");
        IntercomDataLayer dataLayer = getInjector().getDataLayer();
        i.b(string);
        dataLayer.markConversationAsRead(string);
        getInjector().getApi().markConversationAsRead(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TimeFormatter timeFormatter_delegate$lambda$2(PostActivityV2 this$0) {
        i.e(this$0, "this$0");
        return new TimeFormatter(this$0, this$0.getInjector().getTimeProvider());
    }

    @Override // io.intercom.android.sdk.activities.IntercomBaseActivity, androidx.fragment.app.ActivityC1347l, androidx.activity.ComponentActivity, androidx.core.app.k, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.activity.compose.d.a(this, new ComposableLambdaImpl(true, -1329969746, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.post.PostActivityV2.onCreate.1
            @Override // Ia.p
            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                invoke(interfaceC1084f, num.intValue());
                return r.f47939a;
            }

            public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
                if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                    interfaceC1084f.w();
                    return;
                }
                final ScrollState scrollStateA = ScrollKt.a(0, interfaceC1084f, 0, 1);
                final PostActivityV2 postActivityV2 = PostActivityV2.this;
                IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.a.b(1349674692, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.post.PostActivityV2.onCreate.1.1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.post.PostActivityV2$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
                    /* JADX INFO: compiled from: PostActivityV2.kt */
                    @Aa.c(c = "io.intercom.android.sdk.post.PostActivityV2$onCreate$1$1$1", f = "PostActivityV2.kt", l = {}, m = "invokeSuspend")
                    public static final class C04341 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
                        int label;
                        final /* synthetic */ PostActivityV2 this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C04341(PostActivityV2 postActivityV2, kotlin.coroutines.c<? super C04341> cVar) {
                            super(2, cVar);
                            this.this$0 = postActivityV2;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                            return new C04341(this.this$0, cVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.b.b(obj);
                            this.this$0.sendPostAsRead();
                            return r.f47939a;
                        }

                        @Override // Ia.p
                        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
                            return ((C04341) create(a10, cVar)).invokeSuspend(r.f47939a);
                        }
                    }

                    /* JADX INFO: renamed from: io.intercom.android.sdk.post.PostActivityV2$onCreate$1$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: PostActivityV2.kt */
                    public static final class AnonymousClass2 implements p<InterfaceC1084f, Integer, r> {
                        final /* synthetic */ Part $part;
                        final /* synthetic */ PostActivityV2 this$0;

                        public AnonymousClass2(Part part, PostActivityV2 postActivityV2) {
                            this.$part = part;
                            this.this$0 = postActivityV2;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final r invoke$lambda$0(PostActivityV2 this$0) {
                            i.e(this$0, "this$0");
                            this$0.finish();
                            return r.f47939a;
                        }

                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                            invoke(interfaceC1084f, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
                            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                                interfaceC1084f.w();
                                return;
                            }
                            CharSequence charSequence = Phrase.from((Context) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14793b), R.string.intercom_teammate_from_company).put("name", this.$part.getParticipant().getForename()).put("company", ((AppConfig) this.this$0.getAppConfigProvider().get()).getName()).format();
                            h.a aVar = h.a.f13984b;
                            Avatar avatar = this.$part.getParticipant().getAvatar();
                            i.d(avatar, "getAvatar(...)");
                            String string = charSequence.toString();
                            String userStatus = this.this$0.getUserStatus();
                            final PostActivityV2 postActivityV2 = this.this$0;
                            PostActivityV2Kt.TopBar(aVar, avatar, string, userStatus, new Ia.a() { // from class: io.intercom.android.sdk.post.a
                                @Override // Ia.a
                                public final Object invoke() {
                                    return PostActivityV2.AnonymousClass1.C04331.AnonymousClass2.invoke$lambda$0(postActivityV2);
                                }
                            }, interfaceC1084f, 70);
                        }
                    }

                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i11) {
                        if ((i11 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        E.d(new C04341(postActivityV2, null), interfaceC1084f2, "");
                        final Part part = postActivityV2.getPart();
                        long j = H.f13495b;
                        ComposableLambdaImpl composableLambdaImplB = androidx.compose.runtime.internal.a.b(-1416328832, new AnonymousClass2(part, postActivityV2), interfaceC1084f2);
                        final PostActivityV2 postActivityV3 = postActivityV2;
                        ComposableLambdaImpl composableLambdaImplB2 = androidx.compose.runtime.internal.a.b(294322015, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.post.PostActivityV2.onCreate.1.1.3
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                invoke(interfaceC1084f3, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f3, int i12) {
                                if ((i12 & 11) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                    return;
                                }
                                if (postActivityV3.isPreview()) {
                                    Part part2 = part;
                                    PostActivityV2 postActivityV4 = postActivityV3;
                                    h.a aVar = h.a.f13984b;
                                    C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f3, 0);
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    h hVarC = ComposedModifierKt.c(interfaceC1084f3, aVar);
                                    ComposeUiNode.f14331c0.getClass();
                                    Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                    if (interfaceC1084f3.u() == null) {
                                        I.b.k();
                                        throw null;
                                    }
                                    interfaceC1084f3.r();
                                    if (interfaceC1084f3.m()) {
                                        interfaceC1084f3.v(aVar2);
                                    } else {
                                        interfaceC1084f3.A();
                                    }
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                    p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        k.b(iF, interfaceC1084f3, iF, pVar);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                    DividerKt.a(null, (float) 0.65d, Q3.d.e(2594086558L), interfaceC1084f3, 432, 1);
                                    PostActivityV2Kt.BottomBarContent(aVar, androidx.compose.runtime.internal.a.b(-391111001, new PostActivityV2$onCreate$1$1$3$1$1(part2, postActivityV4), interfaceC1084f3), interfaceC1084f3, 54);
                                    interfaceC1084f3.J();
                                }
                            }
                        }, interfaceC1084f2);
                        final ScrollState scrollState = scrollStateA;
                        ScaffoldKt.a(null, composableLambdaImplB, composableLambdaImplB2, null, null, 0, j, 0L, null, androidx.compose.runtime.internal.a.b(-1777074859, new q<L, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.post.PostActivityV2.onCreate.1.1.4
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ r invoke(L l10, InterfaceC1084f interfaceC1084f3, Integer num) {
                                invoke(l10, interfaceC1084f3, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(L contentPadding, InterfaceC1084f interfaceC1084f3, int i12) {
                                List<Block> list;
                                int i13;
                                boolean z10;
                                float f10;
                                InterfaceC1084f interfaceC1084f4 = interfaceC1084f3;
                                i.e(contentPadding, "contentPadding");
                                if ((((i12 & 14) == 0 ? i12 | (interfaceC1084f4.K(contentPadding) ? 4 : 2) : i12) & 91) == 18 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                    return;
                                }
                                h.a aVar = h.a.f13984b;
                                int i14 = 16;
                                float f11 = 16;
                                h hVarJ = PaddingKt.j(PaddingKt.e(ScrollKt.b(aVar, scrollState, true, 12), contentPadding), f11, 0.0f, f11, f11, 2);
                                Part part2 = part;
                                C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f4, 0);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                h hVarC = ComposedModifierKt.c(interfaceC1084f4, hVarJ);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f4.v(aVar2);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f4, c0953mA);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f4, interfaceC1089h0Z);
                                p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    k.b(iF, interfaceC1084f4, iF, pVar);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f4, hVarC);
                                Lb.a.a(interfaceC1084f4, W.e(aVar, 8));
                                List<Block> blocks = part2.getBlocks();
                                if (blocks == null) {
                                    blocks = EmptyList.f42983b;
                                }
                                List<Block> list2 = blocks;
                                interfaceC1084f4.L(-1177115545);
                                int i15 = 0;
                                for (Object obj : list2) {
                                    int i16 = i15 + 1;
                                    if (i15 < 0) {
                                        l.x();
                                        throw null;
                                    }
                                    Block block = (Block) obj;
                                    h hVarD = W.d(aVar, 1.0f);
                                    i.b(block);
                                    long j10 = H.f13499f;
                                    H h8 = new H(j10);
                                    BlockRenderTextStyle blockRenderTextStyle = new BlockRenderTextStyle(G0.a.g(24), androidx.compose.ui.text.font.l.j, G0.a.g(36), new H(j10), null, null, 48, null);
                                    androidx.compose.ui.text.font.l lVar = androidx.compose.ui.text.font.l.f15442g;
                                    int i17 = i15;
                                    List<Block> list3 = list2;
                                    float f12 = f11;
                                    int i18 = i14;
                                    h.a aVar3 = aVar;
                                    BlockViewKt.BlockView(hVarD, new BlockRenderData(block, h8, blockRenderTextStyle, new BlockRenderTextStyle(G0.a.g(i14), lVar, G0.a.g(36), new H(j10), null, null, 48, null), new BlockRenderTextStyle(G0.a.g(i14), lVar, G0.a.g(24), new H(j10), null, new androidx.compose.ui.text.style.g(4), 16, null), null), false, null, false, null, ImageRenderType.FULL, null, null, false, null, null, interfaceC1084f3, 1572934, 0, 4028);
                                    if (i17 == l.r(list3)) {
                                        f10 = 56;
                                        list = list3;
                                        i13 = i16;
                                        z10 = false;
                                    } else {
                                        BlockType type = block.getType();
                                        BlockType blockType = BlockType.PARAGRAPH;
                                        list = list3;
                                        if (type == blockType) {
                                            i13 = i16;
                                            Block block2 = (Block) kotlin.collections.q.Q(i13, list);
                                            if ((block2 != null ? block2.getType() : null) == blockType) {
                                                z10 = false;
                                                f10 = 0;
                                            }
                                        } else {
                                            i13 = i16;
                                        }
                                        z10 = false;
                                        f10 = f12;
                                    }
                                    Lb.a.a(interfaceC1084f3, W.e(aVar3, f10));
                                    i15 = i13;
                                    list2 = list;
                                    aVar = aVar3;
                                    interfaceC1084f4 = interfaceC1084f3;
                                    f11 = f12;
                                    i14 = i18;
                                }
                                interfaceC1084f3.D();
                                interfaceC1084f3.J();
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 806879664, 441);
                    }
                }, interfaceC1084f), interfaceC1084f, 3072, 7);
            }
        }));
    }
}
