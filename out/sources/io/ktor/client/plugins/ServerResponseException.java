package io.ktor.client.plugins;

/* JADX INFO: compiled from: DefaultResponseValidation.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ServerResponseException extends ResponseException {
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerResponseException(io.ktor.client.statement.c response, String cachedResponseText) {
        super(response, cachedResponseText);
        kotlin.jvm.internal.i.e(response, "response");
        kotlin.jvm.internal.i.e(cachedResponseText, "cachedResponseText");
        this.message = "Server error(" + response.b().c().getMethod().f40488a + ' ' + response.b().c().k() + ": " + response.f() + ". Text: \"" + cachedResponseText + '\"';
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
