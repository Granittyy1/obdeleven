package io.intercom.android.sdk.blocks;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.lib.VideoProvider;
import io.intercom.android.sdk.blocks.lib.interfaces.VideoBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.blocks.views.VideoPreviewView;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.IntentUtils;
import java.io.IOException;
import okhttp3.A;
import okhttp3.InterfaceC2754e;
import okhttp3.f;
import okhttp3.z;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class Video implements VideoBlock {
    private final Api api;
    private final Provider<AppConfig> appConfigProvider;
    private final StyleType style;
    private final Twig twig = LumberMill.getLogger();

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.Video$2, reason: invalid class name */
    public class AnonymousClass2 implements f {
        final /* synthetic */ String val$id;
        final /* synthetic */ VideoPreviewView val$previewView;
        final /* synthetic */ ImageView val$videoImageView;

        public AnonymousClass2(VideoPreviewView videoPreviewView, ImageView imageView, String str) {
            this.val$previewView = videoPreviewView;
            this.val$videoImageView = imageView;
            this.val$id = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onResponse$0(VideoPreviewView videoPreviewView, String str, String str2) {
            Video.this.createThumbnail(videoPreviewView, B7.b.c("https://player.vimeo.com/video/", str), str2);
        }

        @Override // okhttp3.f
        public void onFailure(InterfaceC2754e interfaceC2754e, IOException iOException) {
            this.val$previewView.showFailedImage();
        }

        @Override // okhttp3.f
        public void onResponse(InterfaceC2754e interfaceC2754e, z zVar) {
            if (zVar.h()) {
                A a10 = zVar.f45686h;
                try {
                    if (a10 != null) {
                        try {
                            try {
                                final String string = new JSONArray(a10.i()).getJSONObject(0).getString("thumbnail_large");
                                ImageView imageView = this.val$videoImageView;
                                final VideoPreviewView videoPreviewView = this.val$previewView;
                                final String str = this.val$id;
                                imageView.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.b
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f38055b.lambda$onResponse$0(videoPreviewView, str, string);
                                    }
                                });
                            } catch (JSONException e10) {
                                e10.printStackTrace();
                            }
                        } catch (IOException e11) {
                            Video.this.twig.internal("ErrorObject", "Couldn't read response body: " + e11.getMessage());
                        }
                    }
                } finally {
                    a10.close();
                }
            }
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.Video$3, reason: invalid class name */
    public class AnonymousClass3 implements f {
        final /* synthetic */ String val$id;
        final /* synthetic */ VideoPreviewView val$previewView;
        final /* synthetic */ ImageView val$videoImageView;

        public AnonymousClass3(VideoPreviewView videoPreviewView, String str, ImageView imageView) {
            this.val$previewView = videoPreviewView;
            this.val$id = str;
            this.val$videoImageView = imageView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onResponse$0(VideoPreviewView videoPreviewView, String str, String str2) {
            Video.this.createThumbnail(videoPreviewView, str, str2);
        }

        @Override // okhttp3.f
        public void onFailure(InterfaceC2754e interfaceC2754e, IOException iOException) {
            this.val$previewView.showFailedImage();
        }

        @Override // okhttp3.f
        public void onResponse(InterfaceC2754e interfaceC2754e, z zVar) {
            if (!zVar.h()) {
                this.val$previewView.showFailedImage();
                return;
            }
            final String str = "https://www.useloom.com/embed/" + this.val$id;
            final String thumbnailUrlFromOembedResponse = Video.this.getThumbnailUrlFromOembedResponse(zVar);
            ImageView imageView = this.val$videoImageView;
            final VideoPreviewView videoPreviewView = this.val$previewView;
            imageView.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38059b.lambda$onResponse$0(videoPreviewView, str, thumbnailUrlFromOembedResponse);
                }
            });
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.Video$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider;

        static {
            int[] iArr = new int[VideoProvider.values().length];
            $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider = iArr;
            try {
                iArr[VideoProvider.WISTIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider[VideoProvider.YOUTUBE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider[VideoProvider.VIMEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider[VideoProvider.LOOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public Video(StyleType styleType, Api api, Provider<AppConfig> provider) {
        this.style = styleType;
        this.api = api;
        this.appConfigProvider = provider;
    }

    private void addClickListenerOnThumbnailView(final ImageView imageView, final String str) {
        if (this.style != StyleType.CHAT_FULL) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.blocks.Video.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent.setFlags(268435456);
                    IntentUtils.safelyOpenIntent(imageView.getContext(), intent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getThumbnailUrlFromOembedResponse(z zVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                try {
                    JSONObject jSONObject2 = new JSONObject(zVar.f45686h.i());
                    zVar.f45686h.close();
                    jSONObject = jSONObject2;
                } catch (JSONException e10) {
                    e10.printStackTrace();
                    zVar.f45686h.close();
                }
            } catch (IOException e11) {
                this.twig.internal("ErrorObject", "Couldn't read response body: " + e11.getMessage());
                zVar.f45686h.close();
            }
            String strOptString = jSONObject.optString("thumbnail_url");
            int iIndexOf = strOptString.indexOf("?image_crop_resized");
            return iIndexOf > 0 ? strOptString.substring(0, iIndexOf) : strOptString;
        } catch (Throwable th) {
            zVar.f45686h.close();
            throw th;
        }
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.VideoBlock
    public View addVideo(String str, VideoProvider videoProvider, String str2, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        WebView webView = new WebView(viewGroup.getContext());
        BlockUtils.createLayoutParams(webView, -1, 480);
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(VideoUrlUtilKt.getEmbedUrl(videoProvider, str2));
        return webView;
    }

    public void createThumbnail(VideoPreviewView videoPreviewView, String str, String str2) {
        videoPreviewView.displayThumbnail(str2);
        addClickListenerOnThumbnailView(videoPreviewView.getThumbnailImageView(), str);
    }

    public void fetchThumbnail(VideoProvider videoProvider, final String str, final VideoPreviewView videoPreviewView) {
        final ImageView thumbnailImageView = videoPreviewView.getThumbnailImageView();
        int i10 = AnonymousClass5.$SwitchMap$io$intercom$android$sdk$blocks$lib$VideoProvider[videoProvider.ordinal()];
        if (i10 == 1) {
            this.api.getVideo(B7.b.c("https://fast.wistia.com/oembed?url=https://home.wistia.com/medias/", str), new f() { // from class: io.intercom.android.sdk.blocks.Video.1
                @Override // okhttp3.f
                public void onFailure(InterfaceC2754e interfaceC2754e, IOException iOException) {
                    videoPreviewView.showFailedImage();
                }

                @Override // okhttp3.f
                public void onResponse(InterfaceC2754e interfaceC2754e, z zVar) {
                    if (!zVar.h()) {
                        videoPreviewView.showFailedImage();
                        return;
                    }
                    final String str2 = "https://fast.wistia.net/embed/iframe/" + str;
                    final String thumbnailUrlFromOembedResponse = Video.this.getThumbnailUrlFromOembedResponse(zVar);
                    thumbnailImageView.post(new Runnable() { // from class: io.intercom.android.sdk.blocks.Video.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            Video.this.createThumbnail(videoPreviewView, str2, thumbnailUrlFromOembedResponse);
                        }
                    });
                }
            });
            return;
        }
        if (i10 == 2) {
            createThumbnail(videoPreviewView, B7.b.c("https://www.youtube.com/watch?v=", str), androidx.compose.foundation.gestures.d.b("https://img.youtube.com/vi/", str, "/default.jpg"));
            return;
        }
        if (i10 == 3) {
            this.api.getVideo(androidx.compose.foundation.gestures.d.b("https://vimeo.com/api/v2/video/", str, ".json"), new AnonymousClass2(videoPreviewView, thumbnailImageView, str));
        } else {
            if (i10 != 4) {
                return;
            }
            this.api.getVideo(B7.b.c("https://www.useloom.com/v1/oembed?url=https://www.useloom.com/embed/", str), new AnonymousClass3(videoPreviewView, str, thumbnailImageView));
        }
    }
}
