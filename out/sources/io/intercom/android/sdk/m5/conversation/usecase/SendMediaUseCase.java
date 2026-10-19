package io.intercom.android.sdk.m5.conversation.usecase;

import Aa.c;
import Ia.p;
import Z3.o;
import android.content.Context;
import android.net.Uri;
import androidx.recyclerview.widget.t;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiEffect;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.ui.C2402q;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.m5.utils.MediaCompressionKt;
import io.intercom.android.sdk.models.AttachmentSettings;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.Upload;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import kotlinx.coroutines.B;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.F;
import kotlinx.coroutines.G;
import kotlinx.coroutines.flow.q;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: SendMediaUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SendMediaUseCase {
    public static final int $stable = 8;
    private final Context applicationContext;
    private final Ia.a<AttachmentSettings> attachmentSettings;
    private final ConversationRepository conversationRepository;
    private final SendMessageUseCase sendMessageUseCase;
    private final UserIdentity userIdentity;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase$sendMedia$1, reason: invalid class name */
    /* JADX INFO: compiled from: SendMediaUseCase.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase", f = "SendMediaUseCase.kt", l = {R.styleable.AppCompatTheme_textColorSearchUrl, R.styleable.AppCompatTheme_windowFixedHeightMajor, R.styleable.AppCompatTheme_windowFixedWidthMinor, 173}, m = "sendMedia")
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SendMediaUseCase.this.sendMedia(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase$sendMediaNewWay$2, reason: invalid class name */
    /* JADX INFO: compiled from: SendMediaUseCase.kt */
    @c(c = "io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase$sendMediaNewWay$2", f = "SendMediaUseCase.kt", l = {t.d.DEFAULT_SWIPE_ANIMATION_DURATION, 259, 270, 304, 329}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ q<ConversationClientState> $clientState;
        final /* synthetic */ MediaData.Media $mediaData;
        final /* synthetic */ kotlinx.coroutines.flow.p<ConversationUiEffect> $uiEffect;
        final /* synthetic */ String $uuid;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ SendMediaUseCase this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MediaData.Media media, String str, q<ConversationClientState> qVar, SendMediaUseCase sendMediaUseCase, kotlinx.coroutines.flow.p<ConversationUiEffect> pVar, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$mediaData = media;
            this.$uuid = str;
            this.$clientState = qVar;
            this.this$0 = sendMediaUseCase;
            this.$uiEffect = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$mediaData, this.$uuid, this.$clientState, this.this$0, this.$uiEffect, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x03f2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:101:0x03f3  */
        /* JADX WARN: Code duplicated, block: B:108:0x0419  */
        /* JADX WARN: Code duplicated, block: B:85:0x032a  */
        /* JADX WARN: Code duplicated, block: B:86:0x032d  */
        /* JADX WARN: Code duplicated, block: B:93:0x0343  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            A a10;
            Block.Builder builderWithType;
            Uri uri;
            ConversationClientState value;
            ConversationClientState conversationClientState;
            LinkedHashMap linkedHashMap;
            Object compressedMediaData;
            F fA;
            Object objD;
            MediaData.Media media;
            ConversationClientState value2;
            ConversationClientState conversationClientState2;
            LinkedHashMap linkedHashMap2;
            MediaData.Media media2;
            NetworkResponse networkResponse;
            PendingMessage pendingMessage;
            PendingMessage pendingMessageCopy$default;
            q<ConversationClientState> qVar;
            String str;
            ConversationClientState value3;
            ConversationClientState conversationClientState3;
            LinkedHashMap linkedHashMap3;
            Upload uploadBuild;
            Block.Builder builderWithType2;
            NetworkResponse networkResponse2;
            Object objS;
            MediaData.Media media3;
            SendMessageUseCase sendMessageUseCase;
            q<ConversationClientState> qVar2;
            List listK;
            String str2;
            NetworkResponse.Success success;
            String publicUrl;
            Upload.Builder builder;
            Upload uploadBuild2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            F f10 = (F) this.L$1;
                            media = (MediaData.Media) this.L$0;
                            b.b(obj);
                            fA = f10;
                            objD = obj;
                            networkResponse = (NetworkResponse) objD;
                            if (!(networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError) || (networkResponse instanceof NetworkResponse.ServerError)) {
                                pendingMessage = this.$clientState.getValue().getPendingMessages().get(this.$uuid);
                                if (pendingMessage != null) {
                                    pendingMessageCopy$default = PendingMessage.copy$default(pendingMessage, null, false, new PendingMessage.FailedImageUploadData(this.$uuid, media), 3, null);
                                    qVar = this.$clientState;
                                    str = this.$uuid;
                                    do {
                                        value3 = qVar.getValue();
                                        conversationClientState3 = value3;
                                        linkedHashMap3 = new LinkedHashMap();
                                        linkedHashMap3.putAll(conversationClientState3.getPendingMessages());
                                        linkedHashMap3.put(str, pendingMessageCopy$default);
                                    } while (!qVar.d(value3, conversationClientState3.copy((1048574 & 1) != 0 ? conversationClientState3.pendingMessages : linkedHashMap3, (1048574 & 2) != 0 ? conversationClientState3.conversation : null, (1048574 & 4) != 0 ? conversationClientState3.conversationId : null, (1048574 & 8) != 0 ? conversationClientState3.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState3.composerState : null, (1048574 & 32) != 0 ? conversationClientState3.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState3.launchMode : null, (1048574 & 128) != 0 ? conversationClientState3.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState3.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState3.networkState : null, (1048574 & 1024) != 0 ? conversationClientState3.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState3.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState3.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState3.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState3.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState3.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState3.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState3.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState3.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState3.dismissedPrivacyNotice : false)));
                                }
                                media2 = media;
                            } else {
                                if (!(networkResponse instanceof NetworkResponse.Success)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                uploadBuild = ((Upload.Builder) ((NetworkResponse.Success) networkResponse).getBody()).build();
                                if (media instanceof MediaData.Media.Image) {
                                    MediaData.Media.Image image = (MediaData.Media.Image) media;
                                    builderWithType2 = new Block.Builder().withUrl(uploadBuild.getPublicUrl()).withWidth(image.getWidth()).withHeight(image.getHeight()).withType(BlockType.IMAGE.getSerializedName());
                                } else if (media instanceof MediaData.Media.Video) {
                                    if (fA != null) {
                                        this.L$0 = media;
                                        this.L$1 = uploadBuild;
                                        this.label = 4;
                                        objS = fA.s(this);
                                        if (objS == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    } else {
                                        networkResponse2 = null;
                                    }
                                    if (networkResponse2 instanceof NetworkResponse.Success) {
                                        success = (NetworkResponse.Success) networkResponse2;
                                    } else {
                                        success = null;
                                    }
                                    if (success != null || (builder = (Upload.Builder) success.getBody()) == null || (uploadBuild2 = builder.build()) == null) {
                                        publicUrl = null;
                                    } else {
                                        publicUrl = uploadBuild2.getPublicUrl();
                                    }
                                    MediaData.Media.Video video = (MediaData.Media.Video) media;
                                    builderWithType2 = new Block.Builder().withUrl(uploadBuild.getPublicUrl()).withWidth(video.getWidth()).withHeight(video.getHeight()).withDuration(video.getDuration()).withThumbnailUrl(publicUrl).withType(BlockType.VIDEOFILE.getSerializedName());
                                } else {
                                    if (!(media instanceof MediaData.Media.Other)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    MediaData.Media.Other other = (MediaData.Media.Other) media;
                                    builderWithType2 = new Block.Builder().withAttachments(M1.k(new BlockAttachment.Builder().withName(other.getFileName()).withId(uploadBuild.getId()).withSize(other.getSize()).withUrl(uploadBuild.getPublicUrl()).withContentType(other.getMimeType()).build())).withType(BlockType.ATTACHMENTLIST.getSerializedName());
                                }
                                media3 = media;
                                sendMessageUseCase = this.this$0.getSendMessageUseCase();
                                qVar2 = this.$clientState;
                                listK = M1.k(builderWithType2);
                                str2 = this.$uuid;
                                this.L$0 = media3;
                                this.L$1 = null;
                                this.label = 5;
                                if (SendMessageUseCase.invoke$default(sendMessageUseCase, qVar2, listK, str2, false, this, 8, null) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                media2 = media3;
                            }
                        } else if (i10 == 4) {
                            uploadBuild = (Upload) this.L$1;
                            media = (MediaData.Media) this.L$0;
                            b.b(obj);
                            objS = obj;
                        } else if (i10 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        networkResponse2 = (NetworkResponse) objS;
                        if (networkResponse2 instanceof NetworkResponse.Success) {
                            success = (NetworkResponse.Success) networkResponse2;
                        } else {
                            success = null;
                        }
                        if (success != null) {
                            publicUrl = null;
                        } else {
                            publicUrl = null;
                        }
                        MediaData.Media.Video video2 = (MediaData.Media.Video) media;
                        builderWithType2 = new Block.Builder().withUrl(uploadBuild.getPublicUrl()).withWidth(video2.getWidth()).withHeight(video2.getHeight()).withDuration(video2.getDuration()).withThumbnailUrl(publicUrl).withType(BlockType.VIDEOFILE.getSerializedName());
                        media3 = media;
                        sendMessageUseCase = this.this$0.getSendMessageUseCase();
                        qVar2 = this.$clientState;
                        listK = M1.k(builderWithType2);
                        str2 = this.$uuid;
                        this.L$0 = media3;
                        this.L$1 = null;
                        this.label = 5;
                        if (SendMessageUseCase.invoke$default(sendMessageUseCase, qVar2, listK, str2, false, this, 8, null) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        media2 = media3;
                    }
                    media2 = (MediaData.Media) this.L$0;
                    b.b(obj);
                } else {
                    a10 = (A) this.L$0;
                    b.b(obj);
                    compressedMediaData = obj;
                }
                MediaCompressionKt.deleteCompressedMedia(media2.getUri());
                return r.f47939a;
            }
            b.b(obj);
            a10 = (A) this.L$0;
            MediaData.Media media4 = this.$mediaData;
            if (media4 instanceof MediaData.Media.Image) {
                builderWithType = new Block.Builder().withLocalUri(((MediaData.Media.Image) this.$mediaData).getUri()).withWidth(((MediaData.Media.Image) this.$mediaData).getWidth()).withHeight(((MediaData.Media.Image) this.$mediaData).getHeight()).withType("IMAGE");
                i.b(builderWithType);
            } else if (media4 instanceof MediaData.Media.Video) {
                Block.Builder builderWithType3 = new Block.Builder().withLocalUri(((MediaData.Media.Video) this.$mediaData).getUri()).withWidth(((MediaData.Media.Video) this.$mediaData).getWidth()).withHeight(((MediaData.Media.Video) this.$mediaData).getHeight()).withType("VIDEOFILE");
                MediaData.Media.Image thumbnail = ((MediaData.Media.Video) this.$mediaData).getThumbnail();
                builderWithType = builderWithType3.withThumbnailUrl((thumbnail == null || (uri = thumbnail.getUri()) == null) ? null : uri.toString());
                i.b(builderWithType);
            } else {
                if (!(media4 instanceof MediaData.Media.Other)) {
                    throw new NoWhenBranchMatchedException();
                }
                builderWithType = new Block.Builder().withAttachments(M1.k(new BlockAttachment.Builder().withName(((MediaData.Media.Other) this.$mediaData).getFileName()).withUrl(((MediaData.Media.Other) this.$mediaData).getUri().toString()).withContentType(((MediaData.Media.Other) this.$mediaData).getMimeType()).build())).withType("LOCAL_ATTACHMENT");
                i.b(builderWithType);
            }
            Part partBuild = new Part.Builder().withBlocks(M1.k(builderWithType)).withParticipantIsAdmin(false).withClientAssignedUuid(this.$uuid).build();
            partBuild.setParticipant(new Participant.Builder().withId(this.this$0.userIdentity.getIntercomId()).build());
            partBuild.setMessageState(Part.MessageState.SENDING);
            q<ConversationClientState> qVar3 = this.$clientState;
            String str3 = this.$uuid;
            do {
                value = qVar3.getValue();
                conversationClientState = value;
                linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(conversationClientState.getPendingMessages());
                linkedHashMap.put(str3, new PendingMessage(partBuild, false, null));
            } while (!qVar3.d(value, conversationClientState.copy((1048574 & 1) != 0 ? conversationClientState.pendingMessages : linkedHashMap, (1048574 & 2) != 0 ? conversationClientState.conversation : null, (1048574 & 4) != 0 ? conversationClientState.conversationId : null, (1048574 & 8) != 0 ? conversationClientState.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState.composerState : null, (1048574 & 32) != 0 ? conversationClientState.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState.launchMode : null, (1048574 & 128) != 0 ? conversationClientState.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState.networkState : null, (1048574 & 1024) != 0 ? conversationClientState.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState.dismissedPrivacyNotice : false)));
            MediaData.Media media5 = this.$mediaData;
            Context context = this.this$0.applicationContext;
            this.L$0 = a10;
            this.label = 1;
            compressedMediaData = MediaCompressionKt.getCompressedMediaData(media5, context, this);
            if (compressedMediaData == coroutineSingletons) {
                return coroutineSingletons;
            }
            MediaData.Media media6 = (MediaData.Media) compressedMediaData;
            if (media6.getSize() > ((AttachmentSettings) this.this$0.attachmentSettings.invoke()).getUploadSizeLimit()) {
                q<ConversationClientState> qVar4 = this.$clientState;
                String str4 = this.$uuid;
                do {
                    value2 = qVar4.getValue();
                    conversationClientState2 = value2;
                    Map<String, PendingMessage> pendingMessages = conversationClientState2.getPendingMessages();
                    linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry<String, PendingMessage> entry : pendingMessages.entrySet()) {
                        if (!i.a(str4, entry.getKey())) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                } while (!qVar4.d(value2, conversationClientState2.copy((1048574 & 1) != 0 ? conversationClientState2.pendingMessages : linkedHashMap2, (1048574 & 2) != 0 ? conversationClientState2.conversation : null, (1048574 & 4) != 0 ? conversationClientState2.conversationId : null, (1048574 & 8) != 0 ? conversationClientState2.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState2.composerState : null, (1048574 & 32) != 0 ? conversationClientState2.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState2.launchMode : null, (1048574 & 128) != 0 ? conversationClientState2.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState2.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState2.networkState : null, (1048574 & 1024) != 0 ? conversationClientState2.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState2.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState2.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState2.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState2.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState2.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState2.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState2.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState2.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState2.dismissedPrivacyNotice : false)));
                kotlinx.coroutines.flow.p<ConversationUiEffect> pVar = this.$uiEffect;
                ConversationUiEffect.ShowUploadSizeLimitDialog showUploadSizeLimitDialog = new ConversationUiEffect.ShowUploadSizeLimitDialog(((AttachmentSettings) this.this$0.attachmentSettings.invoke()).getUploadSizeLimitMB());
                this.L$0 = media6;
                this.label = 2;
                if (pVar.emit(showUploadSizeLimitDialog, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                media2 = media6;
            } else {
                fA = (!(media6 instanceof MediaData.Media.Video) || ((MediaData.Media.Video) media6).getThumbnail() == null) ? null : C2680e.a(a10, null, new SendMediaUseCase$sendMediaNewWay$2$thumbnailUpload$1(this.this$0, media6, null), 3);
                G gA = C2680e.a(a10, null, new SendMediaUseCase$sendMediaNewWay$2$mediaUpload$1(this.this$0, media6, null), 3);
                this.L$0 = media6;
                this.L$1 = fA;
                this.label = 3;
                objD = gA.D(this);
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.f43038b;
                if (objD == coroutineSingletons) {
                    return coroutineSingletons;
                }
                media = media6;
                networkResponse = (NetworkResponse) objD;
                if (networkResponse instanceof NetworkResponse.ClientError) {
                }
                pendingMessage = this.$clientState.getValue().getPendingMessages().get(this.$uuid);
                if (pendingMessage != null) {
                    pendingMessageCopy$default = PendingMessage.copy$default(pendingMessage, null, false, new PendingMessage.FailedImageUploadData(this.$uuid, media), 3, null);
                    qVar = this.$clientState;
                    str = this.$uuid;
                    do {
                        value3 = qVar.getValue();
                        conversationClientState3 = value3;
                        linkedHashMap3 = new LinkedHashMap();
                        linkedHashMap3.putAll(conversationClientState3.getPendingMessages());
                        linkedHashMap3.put(str, pendingMessageCopy$default);
                    } while (!qVar.d(value3, conversationClientState3.copy((1048574 & 1) != 0 ? conversationClientState3.pendingMessages : linkedHashMap3, (1048574 & 2) != 0 ? conversationClientState3.conversation : null, (1048574 & 4) != 0 ? conversationClientState3.conversationId : null, (1048574 & 8) != 0 ? conversationClientState3.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState3.composerState : null, (1048574 & 32) != 0 ? conversationClientState3.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState3.launchMode : null, (1048574 & 128) != 0 ? conversationClientState3.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState3.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState3.networkState : null, (1048574 & 1024) != 0 ? conversationClientState3.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState3.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState3.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState3.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState3.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState3.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState3.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState3.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState3.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState3.dismissedPrivacyNotice : false)));
                }
                media2 = media;
            }
            MediaCompressionKt.deleteCompressedMedia(media2.getUri());
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass2) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    public SendMediaUseCase(SendMessageUseCase sendMessageUseCase, ConversationRepository conversationRepository, UserIdentity userIdentity, Context applicationContext, Ia.a<AttachmentSettings> attachmentSettings) {
        i.e(sendMessageUseCase, "sendMessageUseCase");
        i.e(conversationRepository, "conversationRepository");
        i.e(userIdentity, "userIdentity");
        i.e(applicationContext, "applicationContext");
        i.e(attachmentSettings, "attachmentSettings");
        this.sendMessageUseCase = sendMessageUseCase;
        this.conversationRepository = conversationRepository;
        this.userIdentity = userIdentity;
        this.applicationContext = applicationContext;
        this.attachmentSettings = attachmentSettings;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AttachmentSettings _init_$lambda$0() {
        return ((AppConfig) o.b()).getAttachmentSettings();
    }

    public static /* synthetic */ Object invoke$default(SendMediaUseCase sendMediaUseCase, q qVar, kotlinx.coroutines.flow.p pVar, MediaData.Media media, String str, kotlin.coroutines.c cVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str = UUID.randomUUID().toString();
        }
        return sendMediaUseCase.invoke(qVar, pVar, media, str, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:82:0x0323  */
    /* JADX WARN: Code duplicated, block: B:84:0x0336  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public final Object sendMedia(q<ConversationClientState> qVar, kotlinx.coroutines.flow.p<ConversationUiEffect> pVar, MediaData.Media media, String str, kotlin.coroutines.c<? super r> cVar) {
        AnonymousClass1 anonymousClass1;
        Block.Builder builderWithType;
        ConversationClientState value;
        ConversationClientState conversationClientState;
        LinkedHashMap linkedHashMap;
        SendMediaUseCase sendMediaUseCase;
        kotlinx.coroutines.flow.p pVar2;
        q qVar2;
        String str2;
        MediaData.Media media2;
        Object value2;
        ConversationClientState conversationClientState2;
        LinkedHashMap linkedHashMap2;
        NetworkResponse networkResponse;
        PendingMessage pendingMessage;
        PendingMessage pendingMessageCopy$default;
        Object value3;
        ConversationClientState conversationClientState3;
        LinkedHashMap linkedHashMap3;
        Block.Builder builderWithType2;
        q qVar3 = qVar;
        String str3 = str;
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
        Object compressedMediaData = anonymousClass2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = anonymousClass2.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        media2 = (MediaData.Media) anonymousClass2.L$3;
                        String str4 = (String) anonymousClass2.L$2;
                        q qVar4 = (q) anonymousClass2.L$1;
                        sendMediaUseCase = (SendMediaUseCase) anonymousClass2.L$0;
                        b.b(compressedMediaData);
                        str2 = str4;
                        qVar2 = qVar4;
                        networkResponse = (NetworkResponse) compressedMediaData;
                        if (!(networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError) || (networkResponse instanceof NetworkResponse.ServerError)) {
                            pendingMessage = ((ConversationClientState) qVar2.getValue()).getPendingMessages().get(str2);
                            if (pendingMessage != null) {
                                pendingMessageCopy$default = PendingMessage.copy$default(pendingMessage, null, false, new PendingMessage.FailedImageUploadData(str2, media2), 3, null);
                                do {
                                    value3 = qVar2.getValue();
                                    conversationClientState3 = (ConversationClientState) value3;
                                    linkedHashMap3 = new LinkedHashMap();
                                    linkedHashMap3.putAll(conversationClientState3.getPendingMessages());
                                    linkedHashMap3.put(str2, pendingMessageCopy$default);
                                } while (!qVar2.d(value3, conversationClientState3.copy((1048574 & 1) != 0 ? conversationClientState3.pendingMessages : linkedHashMap3, (1048574 & 2) != 0 ? conversationClientState3.conversation : null, (1048574 & 4) != 0 ? conversationClientState3.conversationId : null, (1048574 & 8) != 0 ? conversationClientState3.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState3.composerState : null, (1048574 & 32) != 0 ? conversationClientState3.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState3.launchMode : null, (1048574 & 128) != 0 ? conversationClientState3.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState3.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState3.networkState : null, (1048574 & 1024) != 0 ? conversationClientState3.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState3.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState3.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState3.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState3.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState3.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState3.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState3.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState3.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState3.dismissedPrivacyNotice : false)));
                            }
                        } else {
                            if (!(networkResponse instanceof NetworkResponse.Success)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Upload uploadBuild = ((Upload.Builder) ((NetworkResponse.Success) networkResponse).getBody()).build();
                            if (media2 instanceof MediaData.Media.Image) {
                                MediaData.Media.Image image = (MediaData.Media.Image) media2;
                                builderWithType2 = new Block.Builder().withUrl(uploadBuild.getPublicUrl()).withWidth(image.getWidth()).withHeight(image.getHeight()).withType(BlockType.IMAGE.getSerializedName());
                            } else {
                                if (!(media2 instanceof MediaData.Media.Video) && !(media2 instanceof MediaData.Media.Other)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                builderWithType2 = new Block.Builder().withAttachments(M1.k(new BlockAttachment.Builder().withName(media2.getFileName()).withId(uploadBuild.getId()).withSize(media2.getSize()).withUrl(uploadBuild.getPublicUrl()).withContentType(media2.getMimeType()).build())).withType(BlockType.ATTACHMENTLIST.getSerializedName());
                            }
                            SendMessageUseCase sendMessageUseCase = sendMediaUseCase.sendMessageUseCase;
                            List listK = M1.k(builderWithType2);
                            anonymousClass2.L$0 = media2;
                            anonymousClass2.L$1 = null;
                            anonymousClass2.L$2 = null;
                            anonymousClass2.L$3 = null;
                            anonymousClass2.label = 4;
                            if (SendMessageUseCase.invoke$default(sendMessageUseCase, qVar2, listK, str2, false, anonymousClass2, 8, null) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                media2 = (MediaData.Media) anonymousClass2.L$0;
                b.b(compressedMediaData);
            } else {
                String str5 = (String) anonymousClass2.L$3;
                pVar2 = (kotlinx.coroutines.flow.p) anonymousClass2.L$2;
                q qVar5 = (q) anonymousClass2.L$1;
                sendMediaUseCase = (SendMediaUseCase) anonymousClass2.L$0;
                b.b(compressedMediaData);
                str3 = str5;
                qVar3 = qVar5;
            }
            MediaCompressionKt.deleteCompressedMedia(media2.getUri());
            return r.f47939a;
        }
        b.b(compressedMediaData);
        if (media instanceof MediaData.Media.Image) {
            MediaData.Media.Image image2 = (MediaData.Media.Image) media;
            builderWithType = new Block.Builder().withLocalUri(image2.getUri()).withWidth(image2.getWidth()).withHeight(image2.getHeight()).withType("IMAGE");
            i.b(builderWithType);
        } else {
            if (!(media instanceof MediaData.Media.Video) && !(media instanceof MediaData.Media.Other)) {
                throw new NoWhenBranchMatchedException();
            }
            builderWithType = new Block.Builder().withAttachments(M1.k(new BlockAttachment.Builder().withName(media.getFileName()).withUrl(media.getUri().toString()).withContentType(media.getMimeType()).build())).withType("LOCAL_ATTACHMENT");
            i.b(builderWithType);
        }
        Part partBuild = new Part.Builder().withBlocks(M1.k(builderWithType)).withParticipantIsAdmin(false).withClientAssignedUuid(str3).build();
        partBuild.setParticipant(new Participant.Builder().withId(this.userIdentity.getIntercomId()).build());
        partBuild.setMessageState(Part.MessageState.SENDING);
        do {
            value = qVar.getValue();
            conversationClientState = value;
            linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(conversationClientState.getPendingMessages());
            linkedHashMap.put(str3, new PendingMessage(partBuild, false, null));
        } while (!qVar3.d(value, conversationClientState.copy((1048574 & 1) != 0 ? conversationClientState.pendingMessages : linkedHashMap, (1048574 & 2) != 0 ? conversationClientState.conversation : null, (1048574 & 4) != 0 ? conversationClientState.conversationId : null, (1048574 & 8) != 0 ? conversationClientState.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState.composerState : null, (1048574 & 32) != 0 ? conversationClientState.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState.launchMode : null, (1048574 & 128) != 0 ? conversationClientState.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState.networkState : null, (1048574 & 1024) != 0 ? conversationClientState.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState.dismissedPrivacyNotice : false)));
        Context context = this.applicationContext;
        anonymousClass2.L$0 = this;
        anonymousClass2.L$1 = qVar3;
        anonymousClass2.L$2 = pVar;
        anonymousClass2.L$3 = str3;
        anonymousClass2.label = 1;
        compressedMediaData = MediaCompressionKt.getCompressedMediaData(media, context, anonymousClass2);
        if (compressedMediaData == coroutineSingletons) {
            return coroutineSingletons;
        }
        sendMediaUseCase = this;
        pVar2 = pVar;
        MediaData.Media media3 = (MediaData.Media) compressedMediaData;
        if (media3.getSize() > sendMediaUseCase.attachmentSettings.invoke().getUploadSizeLimit()) {
            do {
                value2 = qVar3.getValue();
                conversationClientState2 = (ConversationClientState) value2;
                Map<String, PendingMessage> pendingMessages = conversationClientState2.getPendingMessages();
                linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, PendingMessage> entry : pendingMessages.entrySet()) {
                    if (!i.a(str3, entry.getKey())) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
            } while (!qVar3.d(value2, conversationClientState2.copy((1048574 & 1) != 0 ? conversationClientState2.pendingMessages : linkedHashMap2, (1048574 & 2) != 0 ? conversationClientState2.conversation : null, (1048574 & 4) != 0 ? conversationClientState2.conversationId : null, (1048574 & 8) != 0 ? conversationClientState2.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState2.composerState : null, (1048574 & 32) != 0 ? conversationClientState2.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState2.launchMode : null, (1048574 & 128) != 0 ? conversationClientState2.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState2.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState2.networkState : null, (1048574 & 1024) != 0 ? conversationClientState2.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState2.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState2.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState2.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState2.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState2.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState2.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState2.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState2.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState2.dismissedPrivacyNotice : false)));
            ConversationUiEffect.ShowUploadSizeLimitDialog showUploadSizeLimitDialog = new ConversationUiEffect.ShowUploadSizeLimitDialog(sendMediaUseCase.attachmentSettings.invoke().getUploadSizeLimitMB());
            anonymousClass2.L$0 = media3;
            anonymousClass2.L$1 = null;
            anonymousClass2.L$2 = null;
            anonymousClass2.L$3 = null;
            anonymousClass2.label = 2;
            if (pVar2.emit(showUploadSizeLimitDialog, anonymousClass2) == coroutineSingletons) {
                return coroutineSingletons;
            }
            media2 = media3;
        } else {
            ConversationRepository conversationRepository = sendMediaUseCase.conversationRepository;
            anonymousClass2.L$0 = sendMediaUseCase;
            anonymousClass2.L$1 = qVar3;
            anonymousClass2.L$2 = str3;
            anonymousClass2.L$3 = media3;
            anonymousClass2.label = 3;
            Object objUploadMedia = conversationRepository.uploadMedia(media3, anonymousClass2);
            if (objUploadMedia == coroutineSingletons) {
                return coroutineSingletons;
            }
            qVar2 = qVar3;
            str2 = str3;
            media2 = media3;
            compressedMediaData = objUploadMedia;
            networkResponse = (NetworkResponse) compressedMediaData;
            if (networkResponse instanceof NetworkResponse.ClientError) {
                pendingMessage = ((ConversationClientState) qVar2.getValue()).getPendingMessages().get(str2);
                if (pendingMessage != null) {
                    pendingMessageCopy$default = PendingMessage.copy$default(pendingMessage, null, false, new PendingMessage.FailedImageUploadData(str2, media2), 3, null);
                    do {
                        value3 = qVar2.getValue();
                        conversationClientState3 = (ConversationClientState) value3;
                        linkedHashMap3 = new LinkedHashMap();
                        linkedHashMap3.putAll(conversationClientState3.getPendingMessages());
                        linkedHashMap3.put(str2, pendingMessageCopy$default);
                    } while (!qVar2.d(value3, conversationClientState3.copy((1048574 & 1) != 0 ? conversationClientState3.pendingMessages : linkedHashMap3, (1048574 & 2) != 0 ? conversationClientState3.conversation : null, (1048574 & 4) != 0 ? conversationClientState3.conversationId : null, (1048574 & 8) != 0 ? conversationClientState3.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState3.composerState : null, (1048574 & 32) != 0 ? conversationClientState3.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState3.launchMode : null, (1048574 & 128) != 0 ? conversationClientState3.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState3.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState3.networkState : null, (1048574 & 1024) != 0 ? conversationClientState3.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState3.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState3.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState3.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState3.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState3.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState3.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState3.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState3.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState3.dismissedPrivacyNotice : false)));
                }
            } else {
                pendingMessage = ((ConversationClientState) qVar2.getValue()).getPendingMessages().get(str2);
                if (pendingMessage != null) {
                    pendingMessageCopy$default = PendingMessage.copy$default(pendingMessage, null, false, new PendingMessage.FailedImageUploadData(str2, media2), 3, null);
                    do {
                        value3 = qVar2.getValue();
                        conversationClientState3 = (ConversationClientState) value3;
                        linkedHashMap3 = new LinkedHashMap();
                        linkedHashMap3.putAll(conversationClientState3.getPendingMessages());
                        linkedHashMap3.put(str2, pendingMessageCopy$default);
                    } while (!qVar2.d(value3, conversationClientState3.copy((1048574 & 1) != 0 ? conversationClientState3.pendingMessages : linkedHashMap3, (1048574 & 2) != 0 ? conversationClientState3.conversation : null, (1048574 & 4) != 0 ? conversationClientState3.conversationId : null, (1048574 & 8) != 0 ? conversationClientState3.currentlyTypingState : null, (1048574 & 16) != 0 ? conversationClientState3.composerState : null, (1048574 & 32) != 0 ? conversationClientState3.bottomSheetState : null, (1048574 & 64) != 0 ? conversationClientState3.launchMode : null, (1048574 & 128) != 0 ? conversationClientState3.lastNetworkCall : null, (1048574 & 256) != 0 ? conversationClientState3.articleMetadata : null, (1048574 & 512) != 0 ? conversationClientState3.networkState : null, (1048574 & 1024) != 0 ? conversationClientState3.failedAttributeIdentifiers : null, (1048574 & 2048) != 0 ? conversationClientState3.loadingAttributeIdentifiers : null, (1048574 & 4096) != 0 ? conversationClientState3.finStreamingData : null, (1048574 & 8192) != 0 ? conversationClientState3.openMessengerResponse : null, (1048574 & 16384) != 0 ? conversationClientState3.unreadConversationsCount : 0, (1048574 & 32768) != 0 ? conversationClientState3.unreadTicketsCount : 0, (1048574 & 65536) != 0 ? conversationClientState3.floatingIndicatorState : null, (1048574 & 131072) != 0 ? conversationClientState3.newMessageId : null, (1048574 & 262144) != 0 ? conversationClientState3.isConversationScrolled : false, (1048574 & 524288) != 0 ? conversationClientState3.dismissedPrivacyNotice : false)));
                }
            }
        }
        MediaCompressionKt.deleteCompressedMedia(media2.getUri());
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendMediaNewWay(q<ConversationClientState> qVar, kotlinx.coroutines.flow.p<ConversationUiEffect> pVar, MediaData.Media media, String str, kotlin.coroutines.c<? super r> cVar) {
        Object objD = B.d(new AnonymousClass2(media, str, qVar, this, pVar, null), cVar);
        return objD == CoroutineSingletons.f43038b ? objD : r.f47939a;
    }

    public static /* synthetic */ Object sendMediaNewWay$default(SendMediaUseCase sendMediaUseCase, q qVar, kotlinx.coroutines.flow.p pVar, MediaData.Media media, String str, kotlin.coroutines.c cVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str = UUID.randomUUID().toString();
        }
        return sendMediaUseCase.sendMediaNewWay(qVar, pVar, media, str, cVar);
    }

    public final SendMessageUseCase getSendMessageUseCase() {
        return this.sendMessageUseCase;
    }

    public final Object invoke(q<ConversationClientState> qVar, kotlinx.coroutines.flow.p<ConversationUiEffect> pVar, MediaData.Media media, String str, kotlin.coroutines.c<? super r> cVar) {
        Object objSendMedia = sendMedia(qVar, pVar, media, str, cVar);
        return objSendMedia == CoroutineSingletons.f43038b ? objSendMedia : r.f47939a;
    }

    public /* synthetic */ SendMediaUseCase(SendMessageUseCase sendMessageUseCase, ConversationRepository conversationRepository, UserIdentity userIdentity, Context context, Ia.a aVar, int i10, e eVar) {
        this(sendMessageUseCase, conversationRepository, (i10 & 4) != 0 ? Injector.get().getUserIdentity() : userIdentity, (i10 & 8) != 0 ? Injector.get().getApplication() : context, (i10 & 16) != 0 ? new C2402q(1) : aVar);
    }
}
