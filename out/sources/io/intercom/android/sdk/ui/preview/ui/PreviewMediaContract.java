package io.intercom.android.sdk.ui.preview.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: IntercomPreviewActivity.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PreviewMediaContract extends p076g.a<IntercomPreviewArgs, List<Uri>> {
    public static final int $stable = 0;

    @Override // p076g.a
    public Intent createIntent(Context context, IntercomPreviewArgs input) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(input, "input");
        return IntercomPreviewActivity.Companion.createIntent(context, input);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0023  */
    @Override // p076g.a
    public List<Uri> parseResult(int i10, Intent intent) {
        List<Uri> listC;
        if (i10 != -1) {
            intent = null;
        }
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                listC = EmptyList.f42983b;
            } else {
                listC = Build.VERSION.SDK_INT >= 34 ? w0.b.a.c(extras, "MEDIA_RESULT_URIS", Uri.class) : extras.getParcelableArrayList("MEDIA_RESULT_URIS");
                if (listC == null) {
                    listC = EmptyList.f42983b;
                }
            }
            if (listC != null) {
                return listC;
            }
        }
        return EmptyList.f42983b;
    }
}
