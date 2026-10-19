package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
final class ProviderFactory {
    public static Provider getInstance() {
        try {
            return new PullProvider();
        } catch (Throwable unused) {
            return new DocumentProvider();
        }
    }
}
