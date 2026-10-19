package io.intercom.android.sdk.m5.conversation.usecase;

import Aa.c;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.BlockFactory;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.logic.TextSplittingStrategy;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.data.GetConversationReason;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.TextInputSource;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.BotIntro;
import io.intercom.android.sdk.models.ComposerSuggestions;
import io.intercom.android.sdk.models.Config;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationResponse;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.y;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.q;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: SendMessageUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SendMessageUseCase {
    private final ConversationRepository conversationRepository;
    private final IntercomDataLayer intercomDataLayer;
    private final MetricTracker metricTracker;
    private final AtomicBoolean newConversationRequestPending;
    private final RefreshConversationUseCase refreshConversationUseCase;
    private final SoundEffectsUseCase soundEffectsUseCase;
    private final UserIdentity userIdentity;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: SendMessageUseCase.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public static /* synthetic */ void addBlocksToPendingMessages$default(Companion companion, q qVar, List list, String str, UserIdentity userIdentity, boolean z10, int i10, Object obj) {
            if ((i10 & 16) != 0) {
                z10 = false;
            }
            companion.addBlocksToPendingMessages(qVar, list, str, userIdentity, z10);
        }

        public final void addBlocksToPendingMessages(q<ConversationClientState> clientState, List<Block.Builder> blocks, String uuid, UserIdentity userIdentity, boolean z10) {
            ConversationClientState value;
            ConversationClientState conversationClientState;
            LinkedHashMap linkedHashMap;
            i.e(clientState, "clientState");
            i.e(blocks, "blocks");
            i.e(uuid, "uuid");
            i.e(userIdentity, "userIdentity");
            Part partBuild = new Part.Builder().withBlocks(blocks).withCreatedAt(TimeUnit.MILLISECONDS.toSeconds(TimeProvider.SYSTEM.currentTimeMillis())).withParticipantIsAdmin(false).withClientAssignedUuid(uuid).withFromVoiceDictation(z10).build();
            partBuild.setParticipant(new Participant.Builder().withId(userIdentity.getIntercomId()).build());
            partBuild.setMessageState(Part.MessageState.SENDING);
            do {
                value = clientState.getValue();
                conversationClientState = value;
                linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(conversationClientState.getPendingMessages());
                linkedHashMap.put(uuid, new PendingMessage(partBuild, false, null, 4, null));
            } while (!clientState.d(value, conversationClientState.copy((1048574 & 1) != 0 ? conversationClientState.pendingMessages : linkedHashMap, (1048574 & 2) != 0 ? conversationClientState.conversation : null, (1048574 & 4) != 0 ? conversationClientState.conversationId : null, (1048574 & 8) != 0 ? conversationClientState.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState.composerState : null, (1048574 & 32) != 0 ? conversationClientState.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState.launchMode : null, (1048574 & 128) != 0 ? conversationClientState.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState.networkState : null, (1048574 & 1024) != 0 ? conversationClientState.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState.dismissedPrivacyNotice : false)));
        }

        public final void updateFailedPendingMessages(q<ConversationClientState> clientState, String clientUUID) {
            ConversationClientState value;
            ConversationClientState conversationClientState;
            LinkedHashMap linkedHashMapY;
            i.e(clientState, "clientState");
            i.e(clientUUID, "clientUUID");
            do {
                value = clientState.getValue();
                conversationClientState = value;
                linkedHashMapY = y.y(clientState.getValue().getPendingMessages());
                PendingMessage pendingMessage = (PendingMessage) linkedHashMapY.get(clientUUID);
                if (pendingMessage != null) {
                    linkedHashMapY.put(clientUUID, PendingMessage.copy$default(pendingMessage, null, true, null, 5, null));
                }
            } while (!clientState.d(value, conversationClientState.copy((1048574 & 1) != 0 ? conversationClientState.pendingMessages : linkedHashMapY, (1048574 & 2) != 0 ? conversationClientState.conversation : null, (1048574 & 4) != 0 ? conversationClientState.conversationId : null, (1048574 & 8) != 0 ? conversationClientState.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState.composerState : null, (1048574 & 32) != 0 ? conversationClientState.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState.launchMode : null, (1048574 & 128) != 0 ? conversationClientState.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState.networkState : null, (1048574 & 1024) != 0 ? conversationClientState.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState.dismissedPrivacyNotice : false)));
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: SendMessageUseCase.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase", f = "SendMessageUseCase.kt", l = {R.styleable.AppCompatTheme_checkboxStyle}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SendMessageUseCase.this.invoke(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: SendMessageUseCase.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase", f = "SendMessageUseCase.kt", l = {R.styleable.AppCompatTheme_panelMenuListTheme, R.styleable.AppCompatTheme_tooltipFrameBackground, 139, 144, 162}, m = "invoke")
    public static final class AnonymousClass2 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SendMessageUseCase.this.invoke(null, null, null, false, this);
        }
    }

    public SendMessageUseCase(ConversationRepository conversationRepository, RefreshConversationUseCase refreshConversationUseCase, SoundEffectsUseCase soundEffectsUseCase, UserIdentity userIdentity, IntercomDataLayer intercomDataLayer, MetricTracker metricTracker) {
        i.e(conversationRepository, "conversationRepository");
        i.e(refreshConversationUseCase, "refreshConversationUseCase");
        i.e(soundEffectsUseCase, "soundEffectsUseCase");
        i.e(userIdentity, "userIdentity");
        i.e(intercomDataLayer, "intercomDataLayer");
        i.e(metricTracker, "metricTracker");
        this.conversationRepository = conversationRepository;
        this.refreshConversationUseCase = refreshConversationUseCase;
        this.soundEffectsUseCase = soundEffectsUseCase;
        this.userIdentity = userIdentity;
        this.intercomDataLayer = intercomDataLayer;
        this.metricTracker = metricTracker;
        this.newConversationRequestPending = new AtomicBoolean(false);
    }

    public static /* synthetic */ Object invoke$default(SendMessageUseCase sendMessageUseCase, q qVar, List list, String str, boolean z10, kotlin.coroutines.c cVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = UUID.randomUUID().toString();
        }
        String str2 = str;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return sendMessageUseCase.invoke(qVar, list, str2, z10, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object invoke(q<ConversationClientState> qVar, String str, TextInputSource textInputSource, kotlin.coroutines.c<? super r> cVar) {
        AnonymousClass1 anonymousClass1;
        String string;
        SendMessageUseCase sendMessageUseCase;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object obj = anonymousClass2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = anonymousClass2.label;
        if (i11 == 0) {
            b.b(obj);
            string = UUID.randomUUID().toString();
            i.d(string, "toString(...)");
            List<Block.Builder> blocksForText = new BlockFactory(new TextSplittingStrategy()).getBlocksForText(n.p0(str).toString());
            if (str.length() > 0) {
                i.b(blocksForText);
                boolean z10 = textInputSource != TextInputSource.KEYBOARD;
                anonymousClass2.L$0 = this;
                anonymousClass2.L$1 = qVar;
                anonymousClass2.L$2 = str;
                anonymousClass2.L$3 = textInputSource;
                anonymousClass2.L$4 = string;
                anonymousClass2.label = 1;
                if (invoke(qVar, blocksForText, string, z10, anonymousClass2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            sendMessageUseCase = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = (String) anonymousClass2.L$4;
            textInputSource = (TextInputSource) anonymousClass2.L$3;
            str = (String) anonymousClass2.L$2;
            q<ConversationClientState> qVar2 = (q) anonymousClass2.L$1;
            sendMessageUseCase = (SendMessageUseCase) anonymousClass2.L$0;
            b.b(obj);
            string = str2;
            qVar = qVar2;
        }
        if (sendMessageUseCase.intercomDataLayer.getConfig().getValue().getFinDictationUiEnabled()) {
            MetricTracker metricTracker = sendMessageUseCase.metricTracker;
            String lowerCase = textInputSource.name().toLowerCase(Locale.ROOT);
            i.d(lowerCase, "toLowerCase(...)");
            String strConcat = "message_sent_via_".concat(lowerCase);
            String conversationId = qVar.getValue().getConversationId();
            if (conversationId == null) {
                conversationId = "";
            }
            metricTracker.trackFinDictation(strConcat, conversationId, y.s(new Pair("client_uuid", string), new Pair("char_count", String.valueOf(str.length()))));
        }
        return r.f47939a;
    }

    public /* synthetic */ SendMessageUseCase(ConversationRepository conversationRepository, RefreshConversationUseCase refreshConversationUseCase, SoundEffectsUseCase soundEffectsUseCase, UserIdentity userIdentity, IntercomDataLayer intercomDataLayer, MetricTracker metricTracker, int i10, e eVar) {
        this(conversationRepository, refreshConversationUseCase, soundEffectsUseCase, (i10 & 8) != 0 ? Injector.get().getUserIdentity() : userIdentity, (i10 & 16) != 0 ? Injector.get().getDataLayer() : intercomDataLayer, (i10 & 32) != 0 ? Injector.get().getMetricTracker() : metricTracker);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02cf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:103:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:106:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:118:0x030a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0276  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:99:0x02b4  */
    /* JADX WARN: Failed to calculate best type for var: r2v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v17 ??, new type: java.util.concurrent.atomic.AtomicBoolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v17 ??, new type: java.util.concurrent.atomic.AtomicBoolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v17 java.util.concurrent.atomic.AtomicBoolean, new type: java.util.concurrent.atomic.AtomicBoolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 5 more
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object invoke(q<ConversationClientState> qVar, List<Block.Builder> list, String str, boolean z10, kotlin.coroutines.c<? super r> cVar) {
        AnonymousClass2 anonymousClass2;
        Part part;
        CoroutineSingletons coroutineSingletons;
        AnonymousClass2 anonymousClass3;
        String str2;
        String conversationId;
        List<Block.Builder> list2;
        boolean z11;
        SendMessageUseCase sendMessageUseCase;
        SendMessageUseCase sendMessageUseCase2;
        int i10;
        CoroutineSingletons coroutineSingletons2;
        AnonymousClass2 anonymousClass4;
        SendMessageUseCase sendMessageUseCase3;
        String str3;
        q<ConversationClientState> qVar2;
        Object obj;
        ComposerSuggestions composerSuggestions;
        ComposerSuggestions composerSuggestions2;
        NetworkResponse networkResponse;
        ConversationResponse conversationResponse;
        q<ConversationClientState> qVar3;
        String str4;
        SendMessageUseCase sendMessageUseCase4;
        ConversationClientState value;
        ConversationClientState conversationClientState;
        LinkedHashMap linkedHashMapY;
        boolean z12;
        String str5;
        q<ConversationClientState> qVar4;
        List<Block.Builder> list3;
        String str6;
        Conversation conversation;
        Object l10;
        AnonymousClass2 anonymousClass5;
        CoroutineSingletons coroutineSingletons3;
        Object objReplyToConversation;
        SendMessageUseCase sendMessageUseCase5;
        q<ConversationClientState> qVar5;
        List<Part> listParts;
        Part partPrevious;
        NetworkResponse networkResponse2;
        q<ConversationClientState> qVar6 = qVar;
        if (cVar instanceof AnonymousClass2) {
            anonymousClass2 = (AnonymousClass2) cVar;
            int i11 = anonymousClass2.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anonymousClass2.label = i11 - Integer.MIN_VALUE;
            } else {
                anonymousClass2 = new AnonymousClass2(cVar);
            }
        } else {
            anonymousClass2 = new AnonymousClass2(cVar);
        }
        AnonymousClass2 anonymousClass6 = anonymousClass2;
        Object objI = anonymousClass6.result;
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.f43038b;
        int i12 = anonymousClass6.label;
        if (i12 == 0) {
            b.b(objI);
            part = null;
            Companion.addBlocksToPendingMessages(qVar, list, str, this.userIdentity, z10);
            if (qVar.getValue().getConversationId() == null && this.newConversationRequestPending.compareAndSet(false, true)) {
                BotIntro value2 = this.intercomDataLayer.getBotIntro().getValue();
                String id = !i.a(BotIntro.NULL, value2) ? value2.getId() : null;
                ConversationRepository conversationRepository = this.conversationRepository;
                ArticleMetadata articleMetadata = qVar.getValue().getArticleMetadata();
                String id2 = articleMetadata != null ? articleMetadata.getId() : null;
                String value3 = this.intercomDataLayer.getBotBehaviourId().getValue();
                OpenMessengerResponse openResponse = this.intercomDataLayer.getOpenResponse();
                List<ComposerSuggestions.Suggestion> suggestions = (openResponse == null || (composerSuggestions2 = openResponse.getComposerSuggestions()) == null) ? null : composerSuggestions2.getSuggestions();
                OpenMessengerResponse openResponse2 = this.intercomDataLayer.getOpenResponse();
                Long snapshotId = (openResponse2 == null || (composerSuggestions = openResponse2.getComposerSuggestions()) == null) ? null : composerSuggestions.getSnapshotId();
                OpenMessengerResponse openResponse3 = this.intercomDataLayer.getOpenResponse();
                String requestId = openResponse3 != null ? openResponse3.getRequestId() : null;
                anonymousClass6.L$0 = this;
                anonymousClass6.L$1 = qVar6;
                anonymousClass6.L$2 = str;
                anonymousClass6.label = 1;
                String str7 = id2;
                i10 = 2;
                coroutineSingletons2 = coroutineSingletons4;
                List<ComposerSuggestions.Suggestion> list4 = suggestions;
                anonymousClass4 = anonymousClass6;
                Object objCreateNewConversation = conversationRepository.createNewConversation(list, id, str7, value3, list4, z10, snapshotId, requestId, str, anonymousClass4);
                if (objCreateNewConversation == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                sendMessageUseCase3 = this;
                str3 = str;
                qVar2 = qVar6;
                obj = objCreateNewConversation;
                networkResponse = (NetworkResponse) obj;
                if (networkResponse instanceof NetworkResponse.ClientError) {
                }
                sendMessageUseCase3.newConversationRequestPending.set(r11);
                sendMessageUseCase3.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_FAILED);
                Companion.updateFailedPendingMessages(qVar2, str3);
            } else {
                coroutineSingletons = coroutineSingletons4;
                anonymousClass3 = anonymousClass6;
                str2 = str;
                conversationId = qVar.getValue().getConversationId();
                if (conversationId == null) {
                    SendMessageUseCase$invoke$conversationId$1 sendMessageUseCase$invoke$conversationId$1 = new SendMessageUseCase$invoke$conversationId$1(null);
                    anonymousClass3.L$0 = this;
                    anonymousClass3.L$1 = qVar6;
                    list2 = list;
                    anonymousClass3.L$2 = list2;
                    anonymousClass3.L$3 = str2;
                    z11 = z10;
                    anonymousClass3.Z$0 = z11;
                    anonymousClass3.label = 3;
                    objI = C2688e.i(qVar6, sendMessageUseCase$invoke$conversationId$1, anonymousClass3);
                    if (objI == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    sendMessageUseCase2 = this;
                    conversationId = ((ConversationClientState) objI).getConversationId();
                    sendMessageUseCase = sendMessageUseCase2;
                } else {
                    list2 = list;
                    z11 = z10;
                    sendMessageUseCase = this;
                }
                z12 = z11;
                str5 = conversationId;
                qVar4 = qVar6;
                list3 = list2;
                str6 = str2;
                if (str5 != null) {
                    conversation = qVar4.getValue().getConversation();
                    if (conversation != null) {
                        l10 = part;
                    } else {
                        l10 = part;
                    }
                    ConversationRepository conversationRepository2 = sendMessageUseCase.conversationRepository;
                    anonymousClass3.L$0 = sendMessageUseCase;
                    anonymousClass3.L$1 = qVar4;
                    anonymousClass3.L$2 = str6;
                    anonymousClass3.L$3 = part;
                    anonymousClass3.label = 4;
                    anonymousClass5 = anonymousClass3;
                    coroutineSingletons3 = coroutineSingletons;
                    objReplyToConversation = conversationRepository2.replyToConversation(str5, str6, list3, l10, z12, anonymousClass5);
                    if (objReplyToConversation == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                    sendMessageUseCase5 = sendMessageUseCase;
                    qVar5 = qVar4;
                    objI = objReplyToConversation;
                    networkResponse2 = (NetworkResponse) objI;
                    if (networkResponse2 instanceof NetworkResponse.ClientError) {
                        sendMessageUseCase5.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_FAILED);
                        Companion.updateFailedPendingMessages(qVar5, str6);
                    } else {
                        sendMessageUseCase5.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_FAILED);
                        Companion.updateFailedPendingMessages(qVar5, str6);
                    }
                }
            }
        } else if (i12 == 1) {
            String str8 = (String) anonymousClass6.L$2;
            qVar2 = (q) anonymousClass6.L$1;
            SendMessageUseCase sendMessageUseCase6 = (SendMessageUseCase) anonymousClass6.L$0;
            b.b(objI);
            obj = objI;
            str3 = str8;
            sendMessageUseCase3 = sendMessageUseCase6;
            i10 = 2;
            coroutineSingletons2 = coroutineSingletons4;
            anonymousClass4 = anonymousClass6;
            networkResponse = (NetworkResponse) obj;
            if ((networkResponse instanceof NetworkResponse.ClientError) && !(networkResponse instanceof NetworkResponse.NetworkError) && !(networkResponse instanceof NetworkResponse.ServerError)) {
                if (networkResponse instanceof NetworkResponse.Success) {
                    sendMessageUseCase3.newConversationRequestPending.set(false);
                    sendMessageUseCase3.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_SENT);
                    ConversationResponse conversationResponseBuild = ((ConversationResponse.Builder) ((NetworkResponse.Success) networkResponse).getBody()).build();
                    IntercomDataLayer intercomDataLayer = sendMessageUseCase3.intercomDataLayer;
                    IntercomEvent.NewConversation newConversation = new IntercomEvent.NewConversation(conversationResponseBuild.getConversation());
                    anonymousClass4.L$0 = sendMessageUseCase3;
                    anonymousClass4.L$1 = qVar2;
                    anonymousClass4.L$2 = str3;
                    anonymousClass4.L$3 = conversationResponseBuild;
                    anonymousClass4.label = i10;
                    if (intercomDataLayer.emitEvent(newConversation, anonymousClass4) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    conversationResponse = conversationResponseBuild;
                    qVar3 = qVar2;
                    str4 = str3;
                    sendMessageUseCase4 = sendMessageUseCase3;
                    IntercomDataLayer intercomDataLayer2 = sendMessageUseCase4.intercomDataLayer;
                    Config config = conversationResponse.getConfig();
                    i.d(config, "getConfig(...)");
                    intercomDataLayer2.updateConfig(config);
                    do {
                        value = qVar3.getValue();
                        conversationClientState = value;
                        linkedHashMapY = y.y(qVar3.getValue().getPendingMessages());
                        linkedHashMapY.remove(str4);
                    } while (!qVar3.d(value, conversationClientState.copy((1048574 & 1) != 0 ? conversationClientState.pendingMessages : linkedHashMapY, (1048574 & 2) != 0 ? conversationClientState.conversation : conversationResponse.getConversation(), (1048574 & 4) != 0 ? conversationClientState.conversationId : conversationResponse.getConversation().getId(), (1048574 & 8) != 0 ? conversationClientState.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState.composerState : null, (1048574 & 32) != 0 ? conversationClientState.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState.launchMode : null, (1048574 & 128) != 0 ? conversationClientState.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState.networkState : null, (1048574 & 1024) != 0 ? conversationClientState.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState.dismissedPrivacyNotice : false)));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                sendMessageUseCase3.newConversationRequestPending.set(r11);
                sendMessageUseCase3.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_FAILED);
                Companion.updateFailedPendingMessages(qVar2, str3);
            }
        } else if (i12 == 2) {
            conversationResponse = (ConversationResponse) anonymousClass6.L$3;
            str4 = (String) anonymousClass6.L$2;
            qVar3 = (q) anonymousClass6.L$1;
            sendMessageUseCase4 = (SendMessageUseCase) anonymousClass6.L$0;
            b.b(objI);
            IntercomDataLayer intercomDataLayer3 = sendMessageUseCase4.intercomDataLayer;
            Config config2 = conversationResponse.getConfig();
            i.d(config2, "getConfig(...)");
            intercomDataLayer3.updateConfig(config2);
            do {
                value = qVar3.getValue();
                conversationClientState = value;
                linkedHashMapY = y.y(qVar3.getValue().getPendingMessages());
                linkedHashMapY.remove(str4);
            } while (!qVar3.d(value, conversationClientState.copy((1048574 & 1) != 0 ? conversationClientState.pendingMessages : linkedHashMapY, (1048574 & 2) != 0 ? conversationClientState.conversation : conversationResponse.getConversation(), (1048574 & 4) != 0 ? conversationClientState.conversationId : conversationResponse.getConversation().getId(), (1048574 & 8) != 0 ? conversationClientState.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState.composerState : null, (1048574 & 32) != 0 ? conversationClientState.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState.launchMode : null, (1048574 & 128) != 0 ? conversationClientState.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState.networkState : null, (1048574 & 1024) != 0 ? conversationClientState.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState.dismissedPrivacyNotice : false)));
        } else if (i12 == 3) {
            boolean z13 = anonymousClass6.Z$0;
            str2 = (String) anonymousClass6.L$3;
            List<Block.Builder> list5 = (List) anonymousClass6.L$2;
            q<ConversationClientState> qVar7 = (q) anonymousClass6.L$1;
            SendMessageUseCase sendMessageUseCase7 = (SendMessageUseCase) anonymousClass6.L$0;
            b.b(objI);
            part = null;
            sendMessageUseCase2 = sendMessageUseCase7;
            z11 = z13;
            list2 = list5;
            qVar6 = qVar7;
            coroutineSingletons = coroutineSingletons4;
            anonymousClass3 = anonymousClass6;
            conversationId = ((ConversationClientState) objI).getConversationId();
            sendMessageUseCase = sendMessageUseCase2;
            z12 = z11;
            str5 = conversationId;
            qVar4 = qVar6;
            list3 = list2;
            str6 = str2;
            if (str5 != null) {
                conversation = qVar4.getValue().getConversation();
                if (conversation != null || (listParts = conversation.parts()) == null) {
                    l10 = part;
                } else {
                    ListIterator<Part> listIterator = listParts.listIterator(listParts.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            partPrevious = part;
                            break;
                        }
                        partPrevious = listIterator.previous();
                    } while (!partPrevious.isAdmin());
                    Part part2 = partPrevious;
                    if (part2 != null) {
                        l10 = new Long(part2.getCreatedAt());
                    } else {
                        l10 = part;
                    }
                }
                ConversationRepository conversationRepository3 = sendMessageUseCase.conversationRepository;
                anonymousClass3.L$0 = sendMessageUseCase;
                anonymousClass3.L$1 = qVar4;
                anonymousClass3.L$2 = str6;
                anonymousClass3.L$3 = part;
                anonymousClass3.label = 4;
                anonymousClass5 = anonymousClass3;
                coroutineSingletons3 = coroutineSingletons;
                objReplyToConversation = conversationRepository3.replyToConversation(str5, str6, list3, l10, z12, anonymousClass5);
                if (objReplyToConversation == coroutineSingletons3) {
                    return coroutineSingletons3;
                }
                sendMessageUseCase5 = sendMessageUseCase;
                qVar5 = qVar4;
                objI = objReplyToConversation;
                networkResponse2 = (NetworkResponse) objI;
                if (networkResponse2 instanceof NetworkResponse.ClientError) {
                    sendMessageUseCase5.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_FAILED);
                    Companion.updateFailedPendingMessages(qVar5, str6);
                } else {
                    sendMessageUseCase5.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_FAILED);
                    Companion.updateFailedPendingMessages(qVar5, str6);
                }
            }
        } else if (i12 == 4) {
            str6 = (String) anonymousClass6.L$2;
            qVar5 = (q) anonymousClass6.L$1;
            sendMessageUseCase5 = (SendMessageUseCase) anonymousClass6.L$0;
            b.b(objI);
            part = null;
            coroutineSingletons3 = coroutineSingletons4;
            anonymousClass5 = anonymousClass6;
            networkResponse2 = (NetworkResponse) objI;
            if ((networkResponse2 instanceof NetworkResponse.ClientError) && !(networkResponse2 instanceof NetworkResponse.NetworkError) && !(networkResponse2 instanceof NetworkResponse.ServerError)) {
                if (networkResponse2 instanceof NetworkResponse.Success) {
                    sendMessageUseCase5.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_SENT);
                    RefreshConversationUseCase refreshConversationUseCase = sendMessageUseCase5.refreshConversationUseCase;
                    GetConversationReason getConversationReason = GetConversationReason.NEW_COMMENT;
                    anonymousClass5.L$0 = part;
                    anonymousClass5.L$1 = part;
                    anonymousClass5.L$2 = part;
                    anonymousClass5.label = 5;
                    if (refreshConversationUseCase.invoke(qVar5, getConversationReason, anonymousClass5) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                sendMessageUseCase5.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_FAILED);
                Companion.updateFailedPendingMessages(qVar5, str6);
            }
        } else {
            if (i12 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(objI);
        }
        return r.f47939a;
    }
}
