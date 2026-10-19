package com.parse;

import com.parse.http.ParseHttpBody;
import com.parse.http.ParseHttpRequest;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
class ParseRESTFileCommand extends ParseRESTCommand {
    private final String contentType;
    private final byte[] data;
    private final File file;

    public static class Builder extends ParseRESTCommand.Init<Builder> {
        private File file;
        private byte[] data = null;
        private String contentType = null;

        public Builder() {
            method(ParseHttpRequest.Method.POST);
        }

        public ParseRESTFileCommand build() {
            return new ParseRESTFileCommand(this);
        }

        public Builder contentType(String str) {
            this.contentType = str;
            return this;
        }

        public Builder data(byte[] bArr) {
            this.data = bArr;
            return this;
        }

        public Builder file(File file) {
            this.file = file;
            return this;
        }

        public Builder fileName(String str) {
            return httpPath(B7.b.c("files/", str));
        }

        @Override // com.parse.ParseRESTCommand.Init
        public Builder self() {
            return this;
        }
    }

    public ParseRESTFileCommand(Builder builder) {
        super(builder);
        if (builder.file != null && builder.data != null) {
            throw new IllegalArgumentException("File and data can not be set at the same time");
        }
        this.data = builder.data;
        this.contentType = builder.contentType;
        this.file = builder.file;
    }

    @Override // com.parse.ParseRESTCommand, com.parse.ParseRequest
    public ParseHttpBody newBody(ProgressCallback progressCallback) {
        if (progressCallback == null) {
            byte[] bArr = this.data;
            return bArr != null ? new ParseByteArrayHttpBody(bArr, this.contentType) : new ParseFileHttpBody(this.file, this.contentType);
        }
        byte[] bArr2 = this.data;
        return bArr2 != null ? new ParseCountingByteArrayHttpBody(bArr2, this.contentType, progressCallback) : new ParseCountingFileHttpBody(this.file, this.contentType, progressCallback);
    }
}
