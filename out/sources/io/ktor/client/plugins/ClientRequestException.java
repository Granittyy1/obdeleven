package io.ktor.client.plugins;

/* JADX INFO: compiled from: DefaultResponseValidation.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ClientRequestException extends ResponseException {
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientRequestException(io.ktor.client.statement.c response, String cachedResponseText) {
        super(response, cachedResponseText);
        kotlin.jvm.internal.i.e(response, "response");
        kotlin.jvm.internal.i.e(cachedResponseText, "cachedResponseText");
        this.message = "Client request(" + response.b().c().getMethod().f40488a + ' ' + response.b().c().k() + ") invalid: " + response.f() + ". Text: \"" + cachedResponseText + '\"';
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
