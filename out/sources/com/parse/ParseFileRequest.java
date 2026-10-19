package com.parse;

import com.parse.boltsinternal.Task;
import com.parse.http.ParseHttpRequest;
import com.parse.http.ParseHttpResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
class ParseFileRequest extends ParseRequest<Void> {
    private final File tempFile;

    public ParseFileRequest(ParseHttpRequest.Method method, String str, File file) {
        super(method, str);
        this.tempFile = file;
    }

    @Override // com.parse.ParseRequest
    public Task<Void> onResponseAsync(final ParseHttpResponse parseHttpResponse, final ProgressCallback progressCallback) {
        int statusCode = parseHttpResponse.getStatusCode();
        if ((statusCode < 200 || statusCode >= 300) && statusCode != 304) {
            return Task.forError(new ParseException(100, O.a.f(this.method == ParseHttpRequest.Method.GET ? "Download from" : "Upload to", " file server failed. ", parseHttpResponse.getReasonPhrase())));
        }
        if (this.method != ParseHttpRequest.Method.GET) {
            return null;
        }
        return Task.call(new Callable<Void>() { // from class: com.parse.ParseFileRequest.1
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                FileOutputStream fileOutputStreamOpenOutputStream;
                long totalSize = parseHttpResponse.getTotalSize();
                InputStream inputStream = null;
                try {
                    InputStream content = parseHttpResponse.getContent();
                    try {
                        fileOutputStreamOpenOutputStream = ParseFileUtils.openOutputStream(ParseFileRequest.this.tempFile);
                        try {
                            byte[] bArr = new byte[32768];
                            long j = 0;
                            while (true) {
                                int i10 = content.read(bArr, 0, 32768);
                                if (i10 == -1) {
                                    ParseIOUtils.closeQuietly(content);
                                    ParseIOUtils.closeQuietly((OutputStream) fileOutputStreamOpenOutputStream);
                                    return null;
                                }
                                fileOutputStreamOpenOutputStream.write(bArr, 0, i10);
                                j += (long) i10;
                                if (progressCallback != null && totalSize != -1) {
                                    progressCallback.done(Integer.valueOf(Math.round((j / totalSize) * 100.0f)));
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            inputStream = content;
                            ParseIOUtils.closeQuietly(inputStream);
                            ParseIOUtils.closeQuietly((OutputStream) fileOutputStreamOpenOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStreamOpenOutputStream = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStreamOpenOutputStream = null;
                }
            }
        }, ParseExecutors.io());
    }
}
