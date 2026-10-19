package com.braze.ui.inappmessage.utils;

import Aa.c;
import Ia.a;
import Ia.p;
import android.content.Context;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazeViewBounds;
import com.braze.enums.inappmessage.MessageType;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageWithImage;
import com.braze.models.inappmessage.IInAppMessageZippedAssetHtml;
import com.braze.models.inappmessage.InAppMessageFull;
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.support.BrazeLogger;
import com.braze.support.WebContentUtils;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import java.io.File;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import kotlinx.coroutines.internal.q;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: BackgroundInAppMessagePreparer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BackgroundInAppMessagePreparer {
    public static final BackgroundInAppMessagePreparer INSTANCE = new BackgroundInAppMessagePreparer();

    /* JADX INFO: compiled from: BackgroundInAppMessagePreparer.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.HTML_FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.SLIDEUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.MODAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2, reason: invalid class name */
    /* JADX INFO: compiled from: BackgroundInAppMessagePreparer.kt */
    @c(c = "com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2", f = "BackgroundInAppMessagePreparer.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ IInAppMessage $inAppMessage;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(IInAppMessage iInAppMessage, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$inAppMessage = iInAppMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return BackgroundInAppMessagePreparer.this.new AnonymousClass2(this.$inAppMessage, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, BackgroundInAppMessagePreparer.this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.displayPreparedInAppMessage.2.1
                @Override // Ia.a
                public final String invoke() {
                    return "Displaying in-app message.";
                }
            }, 3, (Object) null);
            BrazeInAppMessageManager.Companion.getInstance().displayInAppMessage(this.$inAppMessage, false);
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass2) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BackgroundInAppMessagePreparer.kt */
    @c(c = "com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1", f = "BackgroundInAppMessagePreparer.kt", l = {R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle}, m = "invokeSuspend")
    public static final class C17431 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ IInAppMessage $inAppMessageToPrepare;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17431(IInAppMessage iInAppMessage, kotlin.coroutines.c<? super C17431> cVar) {
            super(2, cVar);
            this.$inAppMessageToPrepare = iInAppMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            C17431 c17431 = new C17431(this.$inAppMessageToPrepare, cVar);
            c17431.L$0 = obj;
            return c17431;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            Exception e10;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                Object objDisplayPreparedInAppMessage = (A) this.L$0;
                try {
                    BackgroundInAppMessagePreparer backgroundInAppMessagePreparer = BackgroundInAppMessagePreparer.INSTANCE;
                    IInAppMessage iInAppMessagePrepareInAppMessage = backgroundInAppMessagePreparer.prepareInAppMessage(this.$inAppMessageToPrepare);
                    if (iInAppMessagePrepareInAppMessage == null) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, objDisplayPreparedInAppMessage, BrazeLogger.Priority.W, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageForDisplay.1.1
                            @Override // Ia.a
                            public final String invoke() {
                                return "Cannot display the in-app message because the in-app message was null.";
                            }
                        }, 2, (Object) null);
                    } else {
                        this.L$0 = objDisplayPreparedInAppMessage;
                        this.label = 1;
                        objDisplayPreparedInAppMessage = backgroundInAppMessagePreparer.displayPreparedInAppMessage(iInAppMessagePrepareInAppMessage, this);
                        if (objDisplayPreparedInAppMessage == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } catch (Exception e11) {
                    obj2 = objDisplayPreparedInAppMessage;
                    e10 = e11;
                    BrazeLogger.INSTANCE.brazelog(obj2, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageForDisplay.1.2
                        @Override // Ia.a
                        public final String invoke() {
                            return "Caught error while preparing in app message in background";
                        }
                    });
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = (A) this.L$0;
                try {
                    b.b(obj);
                } catch (Exception e12) {
                    e10 = e12;
                    BrazeLogger.INSTANCE.brazelog(obj2, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageForDisplay.1.2
                        @Override // Ia.a
                        public final String invoke() {
                            return "Caught error while preparing in app message in background";
                        }
                    });
                }
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((C17431) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    private BackgroundInAppMessagePreparer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object displayPreparedInAppMessage(IInAppMessage iInAppMessage, kotlin.coroutines.c<? super r> cVar) throws Throwable {
        Sa.b bVar = N.f43198a;
        Object objF = C2680e.f(q.f43500a, new AnonymousClass2(iInAppMessage, null), cVar);
        return objF == CoroutineSingletons.f43038b ? objF : r.f47939a;
    }

    private final BrazeViewBounds getViewBoundsByType(IInAppMessage iInAppMessage) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[iInAppMessage.getMessageType().ordinal()];
        if (i10 != 3) {
            return i10 != 4 ? BrazeViewBounds.NO_BOUNDS : BrazeViewBounds.IN_APP_MESSAGE_MODAL;
        }
        return BrazeViewBounds.IN_APP_MESSAGE_SLIDEUP;
    }

    private final boolean handleLocalImage(final String str, IInAppMessageWithImage iInAppMessageWithImage, IBrazeImageLoader iBrazeImageLoader, Context context, IInAppMessage iInAppMessage, BrazeViewBounds brazeViewBounds) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.handleLocalImage.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                return "Passing in-app message local image url to image loader: " + str;
            }
        }, 2, (Object) null);
        iInAppMessageWithImage.setBitmap(iBrazeImageLoader.getInAppMessageBitmapFromUrl(context, iInAppMessage, str, brazeViewBounds));
        if (iInAppMessageWithImage.getBitmap() != null) {
            iInAppMessageWithImage.setImageDownloadSuccessful(true);
            return true;
        }
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.handleLocalImage.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                return "Removing local image url from IAM since it could not be loaded. URL: " + str;
            }
        }, 3, (Object) null);
        iInAppMessageWithImage.setLocalImageUrl(null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IInAppMessage prepareInAppMessage(IInAppMessage iInAppMessage) {
        if (iInAppMessage.isControl()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessage.1
                @Override // Ia.a
                public final String invoke() {
                    return "Skipping in-app message preparation for control in-app message.";
                }
            }, 3, (Object) null);
            return iInAppMessage;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessage.2
            @Override // Ia.a
            public final String invoke() {
                return "Starting asynchronous in-app message preparation for message.";
            }
        }, 3, (Object) null);
        int i10 = WhenMappings.$EnumSwitchMapping$0[iInAppMessage.getMessageType().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                prepareInAppMessageWithHtml((InAppMessageHtml) iInAppMessage);
            } else if (!prepareInAppMessageWithBitmapDownload(iInAppMessage)) {
                BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessage.4
                    @Override // Ia.a
                    public final String invoke() {
                        return "In-app message image download failed. Cannot display in-app message.";
                    }
                }, 2, (Object) null);
                return null;
            }
        } else if (!prepareInAppMessageWithZippedAssetHtml((IInAppMessageZippedAssetHtml) iInAppMessage)) {
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessage.3
                @Override // Ia.a
                public final String invoke() {
                    return "Html in-app message zip asset download failed. Cannot display in-app message.";
                }
            }, 2, (Object) null);
            return null;
        }
        return iInAppMessage;
    }

    public static final void prepareInAppMessageForDisplay(IInAppMessage inAppMessageToPrepare) {
        i.e(inAppMessageToPrepare, "inAppMessageToPrepare");
        C2680e.c(BrazeCoroutineScope.INSTANCE, null, null, new C17431(inAppMessageToPrepare, null), 3);
    }

    public static final boolean prepareInAppMessageWithBitmapDownload(IInAppMessage iInAppMessage) {
        if (!(iInAppMessage instanceof IInAppMessageWithImage)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageWithBitmapDownload.1
                @Override // Ia.a
                public final String invoke() {
                    return "Cannot prepare non IInAppMessageWithImage object with bitmap download.";
                }
            }, 3, (Object) null);
            return false;
        }
        IInAppMessageWithImage iInAppMessageWithImage = (IInAppMessageWithImage) iInAppMessage;
        if (iInAppMessageWithImage.getBitmap() != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.I, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageWithBitmapDownload.2
                @Override // Ia.a
                public final String invoke() {
                    return "In-app message already contains image bitmap. Not downloading image from URL.";
                }
            }, 2, (Object) null);
            iInAppMessageWithImage.setImageDownloadSuccessful(true);
            return true;
        }
        BackgroundInAppMessagePreparer backgroundInAppMessagePreparer = INSTANCE;
        BrazeViewBounds viewBoundsByType = backgroundInAppMessagePreparer.getViewBoundsByType(iInAppMessage);
        Context applicationContext = BrazeInAppMessageManager.Companion.getInstance().getApplicationContext();
        if (applicationContext == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, backgroundInAppMessagePreparer, BrazeLogger.Priority.W, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageWithBitmapDownload.3
                @Override // Ia.a
                public final String invoke() {
                    return "BrazeInAppMessageManager applicationContext is null. Not downloading image.";
                }
            }, 2, (Object) null);
            return false;
        }
        IBrazeImageLoader imageLoader = Braze.Companion.getInstance(applicationContext).getImageLoader();
        String localImageUrl = iInAppMessageWithImage.getLocalImageUrl();
        if (localImageUrl != null && !n.S(localImageUrl) && backgroundInAppMessagePreparer.handleLocalImage(localImageUrl, iInAppMessageWithImage, imageLoader, applicationContext, iInAppMessage, viewBoundsByType)) {
            return true;
        }
        final String remoteImageUrl = iInAppMessageWithImage.getRemoteImageUrl();
        if (remoteImageUrl != null && !n.S(remoteImageUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, backgroundInAppMessagePreparer, BrazeLogger.Priority.I, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageWithBitmapDownload.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "In-app message has remote image url. Downloading image at url: " + remoteImageUrl;
                }
            }, 2, (Object) null);
            iInAppMessageWithImage.setBitmap(imageLoader.getInAppMessageBitmapFromUrl(applicationContext, iInAppMessage, remoteImageUrl, viewBoundsByType));
            if (iInAppMessageWithImage.getBitmap() == null) {
                return false;
            }
            iInAppMessageWithImage.setImageDownloadSuccessful(true);
            return true;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.W;
        BrazeLogger.brazelog$default(brazeLogger, backgroundInAppMessagePreparer, priority, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageWithBitmapDownload.5
            @Override // Ia.a
            public final String invoke() {
                return "In-app message has no remote image url. Not downloading image.";
            }
        }, 2, (Object) null);
        if (!(iInAppMessageWithImage instanceof InAppMessageFull)) {
            return true;
        }
        BrazeLogger.brazelog$default(brazeLogger, backgroundInAppMessagePreparer, priority, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageWithBitmapDownload.6
            @Override // Ia.a
            public final String invoke() {
                return "In-app message full has no remote image url yet is required to have an image. Failing message display.";
            }
        }, 2, (Object) null);
        return false;
    }

    public static final boolean prepareInAppMessageWithZippedAssetHtml(final IInAppMessageZippedAssetHtml inAppMessageHtml) {
        i.e(inAppMessageHtml, "inAppMessageHtml");
        final String localAssetsDirectoryUrl = inAppMessageHtml.getLocalAssetsDirectoryUrl();
        if (localAssetsDirectoryUrl != null && !n.S(localAssetsDirectoryUrl) && new File(localAssetsDirectoryUrl).exists()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.I, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageWithZippedAssetHtml.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Local assets for html in-app message are already populated. Not downloading assets. Location = " + localAssetsDirectoryUrl;
                }
            }, 2, (Object) null);
            return true;
        }
        String assetsZipRemoteUrl = inAppMessageHtml.getAssetsZipRemoteUrl();
        if (assetsZipRemoteUrl == null || n.S(assetsZipRemoteUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.I, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageWithZippedAssetHtml.2
                @Override // Ia.a
                public final String invoke() {
                    return "Html in-app message has no remote asset zip. Continuing with in-app message preparation.";
                }
            }, 2, (Object) null);
            return true;
        }
        Context applicationContext = BrazeInAppMessageManager.Companion.getInstance().getApplicationContext();
        if (applicationContext == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageWithZippedAssetHtml.3
                @Override // Ia.a
                public final String invoke() {
                    return "BrazeInAppMessageManager applicationContext is null. Not downloading image.";
                }
            }, 2, (Object) null);
            return false;
        }
        final String localHtmlUrlFromRemoteUrl = WebContentUtils.getLocalHtmlUrlFromRemoteUrl(WebContentUtils.getHtmlInAppMessageAssetCacheDirectory(applicationContext), assetsZipRemoteUrl);
        if (localHtmlUrlFromRemoteUrl == null || n.S(localHtmlUrlFromRemoteUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageWithZippedAssetHtml.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Download of html content to local directory failed for remote url: " + inAppMessageHtml.getAssetsZipRemoteUrl() + " . Returned local url is: " + localHtmlUrlFromRemoteUrl;
                }
            }, 2, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageWithZippedAssetHtml.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                return "Local url for html in-app message assets is " + localHtmlUrlFromRemoteUrl;
            }
        }, 3, (Object) null);
        inAppMessageHtml.setLocalAssetsDirectoryUrl(localHtmlUrlFromRemoteUrl);
        return true;
    }

    public final void prepareInAppMessageWithHtml(InAppMessageHtml inAppMessage) {
        i.e(inAppMessage, "inAppMessage");
        if (inAppMessage.getLocalPrefetchedAssetPaths().isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageWithHtml.1
                @Override // Ia.a
                public final String invoke() {
                    return "HTML in-app message does not have prefetched assets. Not performing any substitutions.";
                }
            }, 3, (Object) null);
            return;
        }
        String message = inAppMessage.getMessage();
        if (message == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer.prepareInAppMessageWithHtml.2
                @Override // Ia.a
                public final String invoke() {
                    return "HTML in-app message does not have message. Not performing any substitutions.";
                }
            }, 3, (Object) null);
        } else {
            inAppMessage.setMessage(WebContentUtils.replacePrefetchedUrlsWithLocalAssets(message, inAppMessage.getLocalPrefetchedAssetPaths()));
        }
    }
}
