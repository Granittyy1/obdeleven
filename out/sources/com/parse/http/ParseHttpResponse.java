package com.parse.http;

import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ParseHttpResponse {
    private final InputStream content;
    private final String contentType;
    private final Map<String, String> headers;
    private final String reasonPhrase;
    private final int statusCode;
    private final long totalSize;

    public static final class Builder {
        private InputStream content;
        private String contentType;
        private String reasonPhrase;
        private int statusCode;
        private long totalSize = -1;
        private Map<String, String> headers = new HashMap();

        public ParseHttpResponse build() {
            return new ParseHttpResponse(this);
        }

        public Builder setContent(InputStream inputStream) {
            this.content = inputStream;
            return this;
        }

        public Builder setContentType(String str) {
            this.contentType = str;
            return this;
        }

        public Builder setHeaders(Map<String, String> map) {
            this.headers = new HashMap(map);
            return this;
        }

        public Builder setReasonPhrase(String str) {
            this.reasonPhrase = str;
            return this;
        }

        public Builder setStatusCode(int i10) {
            this.statusCode = i10;
            return this;
        }

        public Builder setTotalSize(long j) {
            this.totalSize = j;
            return this;
        }
    }

    public InputStream getContent() {
        return this.content;
    }

    public String getReasonPhrase() {
        return this.reasonPhrase;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public long getTotalSize() {
        return this.totalSize;
    }

    private ParseHttpResponse(Builder builder) {
        this.statusCode = builder.statusCode;
        this.content = builder.content;
        this.totalSize = builder.totalSize;
        this.reasonPhrase = builder.reasonPhrase;
        this.headers = Collections.unmodifiableMap(new HashMap(builder.headers));
        this.contentType = builder.contentType;
    }
}
