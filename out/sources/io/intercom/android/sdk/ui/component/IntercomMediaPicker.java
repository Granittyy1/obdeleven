package io.intercom.android.sdk.ui.component;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: MediaPickerButton.kt */
/* JADX INFO: loaded from: classes.dex */
final class IntercomMediaPicker extends p076g.a<String, List<? extends Uri>> {
    private final int maxSelectionCount;
    private final MediaType mediaType;
    private final Set<String> trustedFileExtensions;

    /* JADX INFO: compiled from: MediaPickerButton.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaType.values().length];
            try {
                iArr[MediaType.All.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaType.DocumentOnly.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaType.ImageAndVideo.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MediaType.ImageOnly.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MediaType.VideOnly.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public IntercomMediaPicker(MediaType mediaType, Set<String> trustedFileExtensions, int i10) {
        kotlin.jvm.internal.i.e(mediaType, "mediaType");
        kotlin.jvm.internal.i.e(trustedFileExtensions, "trustedFileExtensions");
        this.mediaType = mediaType;
        this.trustedFileExtensions = trustedFileExtensions;
        this.maxSelectionCount = i10;
    }

    private final String[] getAllMimeTypes() {
        Set<String> set = this.trustedFileExtensions;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension((String) it.next());
            if (mimeTypeFromExtension != null) {
                arrayList.add(mimeTypeFromExtension);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private final List<Uri> getClipDataUris(Intent intent) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Uri data = intent.getData();
        if (data != null) {
            linkedHashSet.add(data);
        }
        ClipData clipData = intent.getClipData();
        if (clipData == null && linkedHashSet.isEmpty()) {
            return EmptyList.f42983b;
        }
        if (clipData != null) {
            int itemCount = clipData.getItemCount();
            for (int i10 = 0; i10 < itemCount; i10++) {
                Uri uri = clipData.getItemAt(i10).getUri();
                if (uri != null) {
                    linkedHashSet.add(uri);
                }
            }
        }
        return new ArrayList(linkedHashSet);
    }

    private final String[] getDocumentMimeTypes() {
        String[] allMimeTypes = getAllMimeTypes();
        ArrayList arrayList = new ArrayList();
        for (String str : allMimeTypes) {
            if (kotlin.text.n.J(str, "application", false) || kotlin.text.n.J(str, AttributeType.TEXT, false)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private final String[] getImageMimeTypes() {
        String[] allMimeTypes = getAllMimeTypes();
        ArrayList arrayList = new ArrayList();
        for (String str : allMimeTypes) {
            if (kotlin.text.n.J(str, AppearanceType.IMAGE, false)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private final Intent getIntent(String str) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.mediaType.ordinal()];
        if (i10 == 1) {
            Intent intentPutExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").putExtra("android.intent.extra.MIME_TYPES", getAllMimeTypes()).setType(str).putExtra("android.intent.extra.ALLOW_MULTIPLE", this.maxSelectionCount > 1);
            kotlin.jvm.internal.i.b(intentPutExtra);
            return intentPutExtra;
        }
        if (i10 == 2) {
            return getNativePickerIntent(getDocumentMimeTypes());
        }
        if (i10 == 3) {
            return MediaPickerButtonKt.isPhotoPickerAvailable() ? getPhotoPickerIntent((String[]) Q3.d.H(getImageMimeTypes(), getVideoMimeTypes())) : getNativePickerIntent((String[]) Q3.d.H(getImageMimeTypes(), getVideoMimeTypes()));
        }
        if (i10 == 4) {
            return MediaPickerButtonKt.isPhotoPickerAvailable() ? getPhotoPickerIntent(getImageMimeTypes()) : getNativePickerIntent(getImageMimeTypes());
        }
        if (i10 == 5) {
            return MediaPickerButtonKt.isPhotoPickerAvailable() ? getPhotoPickerIntent(getVideoMimeTypes()) : getNativePickerIntent(getVideoMimeTypes());
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Intent getNativePickerIntent(String[] strArr) {
        Intent intentPutExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType((String) kotlin.collections.k.P(strArr)).putExtra("android.intent.extra.MIME_TYPES", strArr).addFlags(1).putExtra("android.intent.extra.ALLOW_MULTIPLE", this.maxSelectionCount > 1);
        kotlin.jvm.internal.i.d(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    private final Intent getPhotoPickerIntent(String[] strArr) {
        Intent intent = new Intent("android.provider.action.PICK_IMAGES");
        intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
        int i10 = this.maxSelectionCount;
        if (i10 > 1) {
            if (i10 > MediaStore.getPickImagesMaxLimit()) {
                throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()");
            }
            intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.maxSelectionCount);
        }
        return intent;
    }

    private final String[] getVideoMimeTypes() {
        String[] allMimeTypes = getAllMimeTypes();
        ArrayList arrayList = new ArrayList();
        for (String str : allMimeTypes) {
            if (kotlin.text.n.J(str, "video", false)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // p076g.a
    public Intent createIntent(Context context, String input) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(input, "input");
        return getIntent(input);
    }

    @Override // p076g.a
    public List<? extends Uri> parseResult(int i10, Intent intent) {
        List<Uri> clipDataUris;
        if (i10 != -1) {
            intent = null;
        }
        return (intent == null || (clipDataUris = getClipDataUris(intent)) == null) ? EmptyList.f42983b : clipDataUris;
    }
}
