package io.intercom.android.sdk.m5.upload.data;

import android.content.Context;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import okhttp3.r;
import okhttp3.y;
import p241t7.b;
import p318zb.InterfaceC2840g;

/* JADX INFO: compiled from: UploadRequestBody.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class UploadRequestBody extends y {
    private static final int BUFFER_SIZE = 2048;
    private final Context context;
    private final MediaData.Media media;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: UploadRequestBody.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public UploadRequestBody(Context context, MediaData.Media media) {
        i.e(context, "context");
        i.e(media, "media");
        this.context = context;
        this.media = media;
    }

    @Override // okhttp3.y
    public long contentLength() {
        return this.media.getSize();
    }

    @Override // okhttp3.y
    public r contentType() {
        Pattern pattern = r.f45588d;
        return r.a.b(this.media.getMimeType());
    }

    @Override // okhttp3.y
    public void writeTo(InterfaceC2840g sink) throws IOException {
        i.e(sink, "sink");
        InputStream inputStreamOpenInputStream = this.context.getContentResolver().openInputStream(this.media.getUri());
        if (inputStreamOpenInputStream == null) {
            return;
        }
        try {
            byte[] bArr = new byte[BUFFER_SIZE];
            while (true) {
                int i10 = inputStreamOpenInputStream.read(bArr);
                if (i10 == -1) {
                    p293xa.r rVar = p293xa.r.f47939a;
                    b.n(inputStreamOpenInputStream, null);
                    return;
                }
                sink.a(bArr, 0, i10);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b.n(inputStreamOpenInputStream, th);
                throw th2;
            }
        }
    }
}
