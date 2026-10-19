package org.koin.compose.error;

/* JADX INFO: compiled from: UnknownKoinContext.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UnknownKoinContext extends RuntimeException {
    public UnknownKoinContext() {
        super("No Koin context has been provided");
    }
}
