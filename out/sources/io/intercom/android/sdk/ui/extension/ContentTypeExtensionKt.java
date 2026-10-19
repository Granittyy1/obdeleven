package io.intercom.android.sdk.ui.extension;

import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import kotlin.jvm.internal.i;
import kotlin.text.n;

/* JADX INFO: compiled from: ContentTypeExtension.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ContentTypeExtensionKt {
    public static final boolean isAudio(String str) {
        i.e(str, "<this>");
        return n.J(str, "audio", false);
    }

    public static final boolean isDocument(String str) {
        i.e(str, "<this>");
        return n.J(str, "application", false) || n.J(str, AttributeType.TEXT, false);
    }

    public static final boolean isImage(String str) {
        i.e(str, "<this>");
        return n.J(str, AppearanceType.IMAGE, false);
    }

    public static final boolean isPdf(String str) {
        i.e(str, "<this>");
        return n.J(str, "pdf", false);
    }

    public static final boolean isVideo(String str) {
        i.e(str, "<this>");
        return n.J(str, "video", false);
    }
}
