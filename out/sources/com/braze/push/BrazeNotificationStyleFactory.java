package com.braze.push;

import Ia.a;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.app.A;
import androidx.core.app.B;
import androidx.core.app.s;
import androidx.core.app.t;
import androidx.core.app.v;
import androidx.core.app.y;
import androidx.core.graphics.drawable.IconCompat;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazeDateFormat;
import com.braze.enums.BrazeViewBounds;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.support.HtmlUtils;
import com.braze.support.BrazeImageUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.text.n;

/* JADX INFO: compiled from: BrazeNotificationStyleFactory.kt */
/* JADX INFO: loaded from: classes.dex */
public class BrazeNotificationStyleFactory {
    private static final int BIG_PICTURE_STYLE_IMAGE_HEIGHT = 192;
    public static final Companion Companion = new Companion(null);
    private static final String STORY_SET_GRAVITY = "setGravity";
    private static final String STORY_SET_VISIBILITY = "setVisibility";

    /* JADX INFO: compiled from: BrazeNotificationStyleFactory.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private final PendingIntent createStoryPageClickedPendingIntent(Context context, BrazeNotificationPayload brazeNotificationPayload, BrazeNotificationPayload.PushStoryPage pushStoryPage) {
            Intent intent = new Intent(Constants.BRAZE_STORY_CLICKED_ACTION).setClass(context, NotificationTrampolineActivity.class);
            i.d(intent, "Intent(Constants.BRAZE_S…lineActivity::class.java)");
            intent.setFlags(intent.getFlags() | BrazeDeeplinkHandler.Companion.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_PUSH_STORY_PAGE_CLICK));
            intent.putExtras(brazeNotificationPayload.getNotificationExtras());
            intent.putExtra(Constants.BRAZE_ACTION_URI_KEY, pushStoryPage.getDeeplink());
            intent.putExtra(Constants.BRAZE_ACTION_USE_WEBVIEW_KEY, pushStoryPage.getUseWebview());
            intent.putExtra(Constants.BRAZE_STORY_PAGE_ID, pushStoryPage.getStoryPageId());
            intent.putExtra(Constants.BRAZE_CAMPAIGN_ID, pushStoryPage.getCampaignId());
            intent.putExtra(Constants.BRAZE_PUSH_NOTIFICATION_ID, BrazeNotificationUtils.getNotificationId(brazeNotificationPayload));
            PendingIntent activity = PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent, IntentUtils.getImmutablePendingIntentFlags());
            i.d(activity, "getActivity(\n           …tentFlags()\n            )");
            return activity;
        }

        private final PendingIntent createStoryTraversedPendingIntent(Context context, Bundle bundle, int i10) {
            Intent intent = new Intent(Constants.BRAZE_STORY_TRAVERSE_CLICKED_ACTION).setClass(context, BrazeNotificationUtils.getNotificationReceiverClass());
            i.d(intent, "Intent(Constants.BRAZE_S…otificationReceiverClass)");
            if (bundle != null) {
                bundle.putInt(Constants.BRAZE_STORY_INDEX_KEY, i10);
                intent.putExtras(bundle);
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, 1073741824 | IntentUtils.getImmutablePendingIntentFlags());
            i.d(broadcast, "getBroadcast(\n          …      flags\n            )");
            return broadcast;
        }

        private final boolean isRemoteViewNotificationAvailableSpaceConstrained(Context context) {
            return Build.VERSION.SDK_INT >= 31 && context.getApplicationContext().getApplicationInfo().targetSdkVersion >= 31;
        }

        private final boolean populatePushStoryPage(RemoteViews remoteViews, BrazeNotificationPayload brazeNotificationPayload, BrazeNotificationPayload.PushStoryPage pushStoryPage) {
            Context context = brazeNotificationPayload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$populatePushStoryPage$1
                    @Override // Ia.a
                    public final String invoke() {
                        return "Push story page cannot render without a context";
                    }
                }, 3, (Object) null);
                return false;
            }
            BrazeConfigurationProvider configurationProvider = brazeNotificationPayload.getConfigurationProvider();
            if (configurationProvider == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$populatePushStoryPage$2
                    @Override // Ia.a
                    public final String invoke() {
                        return "Push story page cannot render without a configuration provider";
                    }
                }, 3, (Object) null);
                return false;
            }
            String bitmapUrl = pushStoryPage.getBitmapUrl();
            if (bitmapUrl == null || n.S(bitmapUrl)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$populatePushStoryPage$3
                    @Override // Ia.a
                    public final String invoke() {
                        return "Push story page image url invalid";
                    }
                }, 3, (Object) null);
                return false;
            }
            Bitmap pushBitmapFromUrl = Braze.Companion.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, brazeNotificationPayload.getNotificationExtras(), bitmapUrl, BrazeViewBounds.NOTIFICATION_ONE_IMAGE_STORY);
            if (pushBitmapFromUrl == null) {
                return false;
            }
            remoteViews.setImageViewBitmap(R.id.com_braze_story_image_view, pushBitmapFromUrl);
            String title = pushStoryPage.getTitle();
            if (title == null || n.S(title)) {
                remoteViews.setInt(R.id.com_braze_story_text_view_container, BrazeNotificationStyleFactory.STORY_SET_VISIBILITY, 8);
            } else {
                remoteViews.setTextViewText(R.id.com_braze_story_text_view, HtmlUtils.getHtmlSpannedTextIfEnabled(title, configurationProvider));
                remoteViews.setInt(R.id.com_braze_story_text_view_container, BrazeNotificationStyleFactory.STORY_SET_GRAVITY, pushStoryPage.getTitleGravity());
            }
            String subtitle = pushStoryPage.getSubtitle();
            if (subtitle == null || n.S(subtitle)) {
                remoteViews.setInt(R.id.com_braze_story_text_view_small_container, BrazeNotificationStyleFactory.STORY_SET_VISIBILITY, 8);
            } else {
                remoteViews.setTextViewText(R.id.com_braze_story_text_view_small, HtmlUtils.getHtmlSpannedTextIfEnabled(subtitle, configurationProvider));
                remoteViews.setInt(R.id.com_braze_story_text_view_small_container, BrazeNotificationStyleFactory.STORY_SET_GRAVITY, pushStoryPage.getSubtitleGravity());
            }
            remoteViews.setOnClickPendingIntent(R.id.com_braze_story_relative_layout, createStoryPageClickedPendingIntent(context, brazeNotificationPayload, pushStoryPage));
            return true;
        }

        public final s getBigPictureNotificationStyle(BrazeNotificationPayload payload) {
            final String bigImageUrl;
            i.e(payload, "payload");
            Context context = payload.getContext();
            if (context == null || (bigImageUrl = payload.getBigImageUrl()) == null || n.S(bigImageUrl)) {
                return null;
            }
            Bitmap pushBitmapFromUrl = Braze.Companion.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, payload.getNotificationExtras(), bigImageUrl, BrazeViewBounds.NOTIFICATION_EXPANDED_IMAGE);
            if (pushBitmapFromUrl == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getBigPictureNotificationStyle$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return "Failed to download image bitmap for big picture notification style. Url: " + bigImageUrl;
                    }
                }, 3, (Object) null);
                return null;
            }
            try {
                if (pushBitmapFromUrl.getWidth() > pushBitmapFromUrl.getHeight()) {
                    int pixelsFromDensityAndDp = BrazeImageUtils.getPixelsFromDensityAndDp(BrazeImageUtils.getDensityDpi(context), BrazeNotificationStyleFactory.BIG_PICTURE_STYLE_IMAGE_HEIGHT);
                    int i10 = pixelsFromDensityAndDp * 2;
                    int displayWidthPixels = BrazeImageUtils.getDisplayWidthPixels(context);
                    if (i10 > displayWidthPixels) {
                        i10 = displayWidthPixels;
                    }
                    try {
                        pushBitmapFromUrl = Bitmap.createScaledBitmap(pushBitmapFromUrl, i10, pixelsFromDensityAndDp, true);
                    } catch (Exception e10) {
                        BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getBigPictureNotificationStyle$2
                            @Override // Ia.a
                            public final String invoke() {
                                return "Failed to scale image bitmap, using original.";
                            }
                        });
                    }
                }
                if (pushBitmapFromUrl == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getBigPictureNotificationStyle$3
                        @Override // Ia.a
                        public final String invoke() {
                            return "Bitmap download failed for push notification. No image will be included with the notification.";
                        }
                    }, 2, (Object) null);
                    return null;
                }
                s sVar = new s();
                sVar.f16782a = IconCompat.c(pushBitmapFromUrl);
                setBigPictureSummaryAndTitle(sVar, payload);
                return sVar;
            } catch (Exception e11) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e11, new a<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getBigPictureNotificationStyle$4
                    @Override // Ia.a
                    public final String invoke() {
                        return "Failed to create Big Picture Style.";
                    }
                });
                return null;
            }
        }

        public final t getBigTextNotificationStyle(BrazeNotificationPayload payload) {
            CharSequence htmlSpannedTextIfEnabled;
            i.e(payload, "payload");
            t tVar = new t();
            BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
            if (configurationProvider == null) {
                return tVar;
            }
            String contentText = payload.getContentText();
            if (contentText != null && (htmlSpannedTextIfEnabled = HtmlUtils.getHtmlSpannedTextIfEnabled(contentText, configurationProvider)) != null) {
                tVar.f16786a = v.b(htmlSpannedTextIfEnabled);
            }
            String bigSummaryText = payload.getBigSummaryText();
            if (bigSummaryText != null) {
                tVar.b(HtmlUtils.getHtmlSpannedTextIfEnabled(bigSummaryText, configurationProvider));
            }
            String bigTitleText = payload.getBigTitleText();
            if (bigTitleText != null) {
                tVar.a(HtmlUtils.getHtmlSpannedTextIfEnabled(bigTitleText, configurationProvider));
            }
            return tVar;
        }

        public final A getConversationalPushStyle(v notificationBuilder, BrazeNotificationPayload payload) {
            i.e(notificationBuilder, "notificationBuilder");
            i.e(payload, "payload");
            try {
                Map<String, BrazeNotificationPayload.ConversationPerson> conversationPersonMap = payload.getConversationPersonMap();
                BrazeNotificationPayload.ConversationPerson conversationPerson = conversationPersonMap.get(payload.getConversationReplyPersonId());
                if (conversationPerson == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getConversationalPushStyle$1
                        @Override // Ia.a
                        public final String invoke() {
                            return "Reply person does not exist in mapping. Not rendering a style";
                        }
                    }, 3, (Object) null);
                    return null;
                }
                A a10 = new A(conversationPerson.getPerson());
                Iterator<BrazeNotificationPayload.ConversationMessage> it = payload.getConversationMessages().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        a10.f16670e = Boolean.valueOf(conversationPersonMap.size() > 1);
                        notificationBuilder.f16819y = payload.getConversationShortcutId();
                        return a10;
                    }
                    final BrazeNotificationPayload.ConversationMessage next = it.next();
                    BrazeNotificationPayload.ConversationPerson conversationPerson2 = conversationPersonMap.get(next.getPersonId());
                    if (conversationPerson2 == null) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getConversationalPushStyle$2
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final String invoke() {
                                return "Message person does not exist in mapping. Not rendering a style. " + next;
                            }
                        }, 3, (Object) null);
                        return null;
                    }
                    A.d dVar = new A.d(next.getMessage(), next.getTimestamp(), conversationPerson2.getPerson());
                    ArrayList arrayList = a10.f16666a;
                    arrayList.add(dVar);
                    if (arrayList.size() > 25) {
                        arrayList.remove(0);
                    }
                }
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getConversationalPushStyle$3
                    @Override // Ia.a
                    public final String invoke() {
                        return "Failed to create conversation push style. Returning null.";
                    }
                });
                return null;
            }
        }

        public final B getInlineImageStyle(BrazeNotificationPayload payload, v notificationBuilder) {
            i.e(payload, "payload");
            i.e(notificationBuilder, "notificationBuilder");
            Context context = payload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getInlineImageStyle$1
                    @Override // Ia.a
                    public final String invoke() {
                        return "Inline Image Push cannot render without a context";
                    }
                }, 3, (Object) null);
                return null;
            }
            String bigImageUrl = payload.getBigImageUrl();
            if (bigImageUrl == null || n.S(bigImageUrl)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getInlineImageStyle$2
                    @Override // Ia.a
                    public final String invoke() {
                        return "Inline Image Push image url invalid";
                    }
                }, 3, (Object) null);
                return null;
            }
            Bundle notificationExtras = payload.getNotificationExtras();
            Bitmap pushBitmapFromUrl = Braze.Companion.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, notificationExtras, bigImageUrl, BrazeViewBounds.NOTIFICATION_INLINE_PUSH_IMAGE);
            if (pushBitmapFromUrl == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getInlineImageStyle$3
                    @Override // Ia.a
                    public final String invoke() {
                        return "Inline Image Push failed to get image bitmap";
                    }
                }, 3, (Object) null);
                return null;
            }
            boolean zIsRemoteViewNotificationAvailableSpaceConstrained = isRemoteViewNotificationAvailableSpaceConstrained(context);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), zIsRemoteViewNotificationAvailableSpaceConstrained ? R.layout.com_braze_push_inline_image_constrained : R.layout.com_braze_notification_inline_image);
            BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
            Icon iconCreateWithResource = Icon.createWithResource(context, configurationProvider.getSmallNotificationIconResourceId());
            i.d(iconCreateWithResource, "createWithResource(\n    …nResourceId\n            )");
            Integer accentColor = payload.getAccentColor();
            if (accentColor != null) {
                iconCreateWithResource.setTint(accentColor.intValue());
            }
            remoteViews.setImageViewIcon(R.id.com_braze_inline_image_push_app_icon, iconCreateWithResource);
            PackageManager packageManager = context.getPackageManager();
            try {
                ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(0L)) : packageManager.getApplicationInfo(context.getPackageName(), 0);
                i.d(applicationInfo, "{\n                if (Bu…          }\n            }");
                CharSequence applicationLabel = packageManager.getApplicationLabel(applicationInfo);
                i.c(applicationLabel, "null cannot be cast to non-null type kotlin.String");
                remoteViews.setTextViewText(R.id.com_braze_inline_image_push_app_name_text, HtmlUtils.getHtmlSpannedTextIfEnabled((String) applicationLabel, configurationProvider));
                remoteViews.setTextViewText(R.id.com_braze_inline_image_push_time_text, DateTimeUtils.formatDateNow(BrazeDateFormat.CLOCK_12_HOUR));
                String string = notificationExtras.getString(Constants.BRAZE_PUSH_TITLE_KEY);
                if (string != null) {
                    remoteViews.setTextViewText(R.id.com_braze_inline_image_push_title_text, HtmlUtils.getHtmlSpannedTextIfEnabled(string, configurationProvider));
                }
                String string2 = notificationExtras.getString(Constants.BRAZE_PUSH_CONTENT_KEY);
                if (string2 != null) {
                    remoteViews.setTextViewText(R.id.com_braze_inline_image_push_content_text, HtmlUtils.getHtmlSpannedTextIfEnabled(string2, configurationProvider));
                }
                notificationBuilder.f16816v = remoteViews;
                if (zIsRemoteViewNotificationAvailableSpaceConstrained) {
                    notificationBuilder.e(pushBitmapFromUrl);
                    return new y();
                }
                remoteViews.setImageViewBitmap(R.id.com_braze_inline_image_push_side_image, pushBitmapFromUrl);
                return new NoOpSentinelStyle();
            } catch (PackageManager.NameNotFoundException e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getInlineImageStyle$applicationInfo$1
                    @Override // Ia.a
                    public final String invoke() {
                        return "Inline Image Push application info was null";
                    }
                });
                return null;
            }
        }

        public final B getNotificationStyle(v notificationBuilder, BrazeNotificationPayload payload) {
            B bigPictureNotificationStyle;
            i.e(notificationBuilder, "notificationBuilder");
            i.e(payload, "payload");
            if (payload.isPushStory() && payload.getContext() != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getNotificationStyle$1
                    @Override // Ia.a
                    public final String invoke() {
                        return "Rendering push notification with DecoratedCustomViewStyle (Story)";
                    }
                }, 3, (Object) null);
                bigPictureNotificationStyle = getStoryStyle(notificationBuilder, payload);
            } else if (payload.isConversationalPush()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getNotificationStyle$2
                    @Override // Ia.a
                    public final String invoke() {
                        return "Rendering conversational push";
                    }
                }, 3, (Object) null);
                bigPictureNotificationStyle = getConversationalPushStyle(notificationBuilder, payload);
            } else if (payload.getBigImageUrl() == null) {
                bigPictureNotificationStyle = null;
            } else if (payload.isInlineImagePush()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getNotificationStyle$3
                    @Override // Ia.a
                    public final String invoke() {
                        return "Rendering push notification with custom inline image style";
                    }
                }, 3, (Object) null);
                bigPictureNotificationStyle = getInlineImageStyle(payload, notificationBuilder);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getNotificationStyle$4
                    @Override // Ia.a
                    public final String invoke() {
                        return "Rendering push notification with BigPictureStyle";
                    }
                }, 3, (Object) null);
                bigPictureNotificationStyle = getBigPictureNotificationStyle(payload);
            }
            if (bigPictureNotificationStyle != null) {
                return bigPictureNotificationStyle;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getNotificationStyle$5
                @Override // Ia.a
                public final String invoke() {
                    return "Rendering push notification with BigTextStyle";
                }
            }, 3, (Object) null);
            return getBigTextNotificationStyle(payload);
        }

        public final y getStoryStyle(v notificationBuilder, BrazeNotificationPayload payload) {
            i.e(notificationBuilder, "notificationBuilder");
            i.e(payload, "payload");
            Context context = payload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getStoryStyle$1
                    @Override // Ia.a
                    public final String invoke() {
                        return "Push story page cannot render without a context";
                    }
                }, 3, (Object) null);
                return null;
            }
            List<BrazeNotificationPayload.PushStoryPage> pushStoryPages = payload.getPushStoryPages();
            int pushStoryPageIndex = payload.getPushStoryPageIndex();
            BrazeNotificationPayload.PushStoryPage pushStoryPage = pushStoryPages.get(pushStoryPageIndex);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.com_braze_push_story_one_image);
            if (!populatePushStoryPage(remoteViews, payload, pushStoryPage)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$getStoryStyle$2
                    @Override // Ia.a
                    public final String invoke() {
                        return "Push story page was not populated correctly. Not using DecoratedCustomViewStyle.";
                    }
                }, 2, (Object) null);
                return null;
            }
            Bundle notificationExtras = payload.getNotificationExtras();
            y yVar = new y();
            int size = pushStoryPages.size();
            remoteViews.setOnClickPendingIntent(R.id.com_braze_story_button_previous, createStoryTraversedPendingIntent(context, notificationExtras, ((pushStoryPageIndex - 1) + size) % size));
            remoteViews.setOnClickPendingIntent(R.id.com_braze_story_button_next, createStoryTraversedPendingIntent(context, notificationExtras, (pushStoryPageIndex + 1) % size));
            notificationBuilder.f16817w = remoteViews;
            notificationBuilder.d(8, true);
            return yVar;
        }

        public final void setBigPictureSummaryAndTitle(s bigPictureNotificationStyle, BrazeNotificationPayload payload) {
            String contentText;
            i.e(bigPictureNotificationStyle, "bigPictureNotificationStyle");
            i.e(payload, "payload");
            BrazeConfigurationProvider configurationProvider = payload.getConfigurationProvider();
            if (configurationProvider == null) {
                return;
            }
            String bigSummaryText = payload.getBigSummaryText();
            String bigTitleText = payload.getBigTitleText();
            String summaryText = payload.getSummaryText();
            if (bigSummaryText != null) {
                bigPictureNotificationStyle.c(HtmlUtils.getHtmlSpannedTextIfEnabled(bigSummaryText, configurationProvider));
            }
            if (bigTitleText != null) {
                bigPictureNotificationStyle.b(HtmlUtils.getHtmlSpannedTextIfEnabled(bigTitleText, configurationProvider));
            }
            if (summaryText == null && bigSummaryText == null && (contentText = payload.getContentText()) != null) {
                bigPictureNotificationStyle.c(HtmlUtils.getHtmlSpannedTextIfEnabled(contentText, configurationProvider));
            }
        }

        public final void setStyleIfSupported(v notificationBuilder, BrazeNotificationPayload payload) {
            i.e(notificationBuilder, "notificationBuilder");
            i.e(payload, "payload");
            B notificationStyle = getNotificationStyle(notificationBuilder, payload);
            if (notificationStyle instanceof NoOpSentinelStyle) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.push.BrazeNotificationStyleFactory$Companion$setStyleIfSupported$1
                @Override // Ia.a
                public final String invoke() {
                    return "Setting style for notification";
                }
            }, 3, (Object) null);
            notificationBuilder.g(notificationStyle);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: BrazeNotificationStyleFactory.kt */
    public static final class NoOpSentinelStyle extends B {
    }

    public static final void setBigPictureSummaryAndTitle(s sVar, BrazeNotificationPayload brazeNotificationPayload) {
        Companion.setBigPictureSummaryAndTitle(sVar, brazeNotificationPayload);
    }

    public static final void setStyleIfSupported(v vVar, BrazeNotificationPayload brazeNotificationPayload) {
        Companion.setStyleIfSupported(vVar, brazeNotificationPayload);
    }
}
