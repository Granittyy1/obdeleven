package io.intercom.android.sdk.blocks;

import android.text.TextUtils;
import android.view.View;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.utilities.LinkOpener;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: CarouselImageClickListener.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CarouselImageClickListener implements ImageClickListener {
    public static final int $stable = 8;
    private final Api api;

    public CarouselImageClickListener(Api api) {
        i.e(api, "api");
        this.api = api;
    }

    @Override // io.intercom.android.sdk.blocks.ImageClickListener
    public void onImageClicked(String imageUrl, String linkUrl, View imageView, int i10, int i11) {
        i.e(imageUrl, "imageUrl");
        i.e(linkUrl, "linkUrl");
        i.e(imageView, "imageView");
        if (TextUtils.isEmpty(linkUrl)) {
            return;
        }
        LinkOpener.handleUrl(linkUrl, imageView.getContext(), this.api);
    }
}
