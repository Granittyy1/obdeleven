package io.intercom.android.sdk.models;

import com.google.gson.i;

/* JADX INFO: loaded from: classes3.dex */
public class Sheet {
    private final String body;

    public static final class Builder {
        i sheet_request_body;
        String sheet_title;

        public Sheet build() {
            return new Sheet(this);
        }
    }

    public Sheet(Builder builder) {
        i iVar = builder.sheet_request_body;
        this.body = iVar == null ? "" : iVar.toString();
    }

    public String getBody() {
        return this.body;
    }
}
