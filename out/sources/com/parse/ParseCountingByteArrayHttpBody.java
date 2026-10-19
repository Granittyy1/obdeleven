package com.parse;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
class ParseCountingByteArrayHttpBody extends ParseByteArrayHttpBody {
    private final ProgressCallback progressCallback;

    public ParseCountingByteArrayHttpBody(byte[] bArr, String str, ProgressCallback progressCallback) {
        super(bArr, str);
        this.progressCallback = progressCallback;
    }

    @Override // com.parse.ParseByteArrayHttpBody, com.parse.http.ParseHttpBody
    public void writeTo(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        int length = this.content.length;
        int i10 = 0;
        while (i10 < length) {
            int iMin = Math.min(length - i10, 4096);
            outputStream.write(this.content, i10, iMin);
            outputStream.flush();
            ProgressCallback progressCallback = this.progressCallback;
            if (progressCallback != null) {
                i10 += iMin;
                progressCallback.done(Integer.valueOf((i10 * 100) / length));
            }
        }
    }
}
