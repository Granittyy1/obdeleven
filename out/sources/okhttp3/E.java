package okhttp3;

import okio.ByteString;

/* JADX INFO: compiled from: WebSocketListener.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class E {
    public void onClosed(D webSocket, int i10, String reason) {
        kotlin.jvm.internal.i.e(webSocket, "webSocket");
        kotlin.jvm.internal.i.e(reason, "reason");
    }

    public void onClosing(D webSocket, int i10, String reason) {
        kotlin.jvm.internal.i.e(webSocket, "webSocket");
        kotlin.jvm.internal.i.e(reason, "reason");
    }

    public void onFailure(D webSocket, Throwable t8, z zVar) {
        kotlin.jvm.internal.i.e(webSocket, "webSocket");
        kotlin.jvm.internal.i.e(t8, "t");
    }

    public void onMessage(D webSocket, String text) {
        kotlin.jvm.internal.i.e(webSocket, "webSocket");
        kotlin.jvm.internal.i.e(text, "text");
    }

    public void onOpen(D webSocket, z response) {
        kotlin.jvm.internal.i.e(webSocket, "webSocket");
        kotlin.jvm.internal.i.e(response, "response");
    }

    public void onMessage(D webSocket, ByteString bytes) {
        kotlin.jvm.internal.i.e(webSocket, "webSocket");
        kotlin.jvm.internal.i.e(bytes, "bytes");
    }
}
