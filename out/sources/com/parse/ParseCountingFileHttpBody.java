package com.parse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
class ParseCountingFileHttpBody extends ParseFileHttpBody {
    private final ProgressCallback progressCallback;

    public ParseCountingFileHttpBody(File file, String str, ProgressCallback progressCallback) {
        super(file, str);
        this.progressCallback = progressCallback;
    }

    @Override // com.parse.ParseFileHttpBody, com.parse.http.ParseHttpBody
    public void writeTo(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        FileInputStream fileInputStream = new FileInputStream(this.file);
        try {
            byte[] bArr = new byte[4096];
            long length = this.file.length();
            long j = 0;
            while (true) {
                int i10 = fileInputStream.read(bArr);
                if (-1 == i10) {
                    ParseIOUtils.closeQuietly((InputStream) fileInputStream);
                    return;
                }
                outputStream.write(bArr, 0, i10);
                j += (long) i10;
                ProgressCallback progressCallback = this.progressCallback;
                if (progressCallback != null) {
                    progressCallback.done(Integer.valueOf((int) ((100 * j) / length)));
                }
            }
        } catch (Throwable th) {
            ParseIOUtils.closeQuietly((InputStream) fileInputStream);
            throw th;
        }
    }
}
