package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.graphics.drawable.Drawable;
import coil.ImageLoaders;
import coil.request.g;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: IntercomCoil.kt */
/* JADX INFO: loaded from: classes.dex */
public final class IntercomCoilKt {
    public static final void loadIntercomImage(Context context, g imageRequest) {
        i.e(context, "context");
        i.e(imageRequest, "imageRequest");
        IntercomImageLoaderKt.getImageLoader(context).b(imageRequest);
    }

    public static final Drawable loadIntercomImageBlocking(Context context, g imageRequest) {
        i.e(context, "context");
        i.e(imageRequest, "imageRequest");
        return ImageLoaders.a(IntercomImageLoaderKt.getImageLoader(context), imageRequest).a();
    }
}
