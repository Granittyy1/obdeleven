package io.ktor.client.plugins;

/* JADX INFO: compiled from: DefaultResponseValidation.kt */
/* JADX INFO: loaded from: classes.dex */
public class ResponseException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseException(io.ktor.client.statement.c response, String cachedResponseText) {
        super("Bad response: " + response + ". Text: \"" + cachedResponseText + '\"');
        kotlin.jvm.internal.i.e(response, "response");
        kotlin.jvm.internal.i.e(cachedResponseText, "cachedResponseText");
    }
}
