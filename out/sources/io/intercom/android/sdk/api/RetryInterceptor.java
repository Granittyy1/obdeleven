package io.intercom.android.sdk.api;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.q;
import okhttp3.z;

/* JADX INFO: loaded from: classes3.dex */
class RetryInterceptor implements q {
    private static final int MAX_RETRIES = 3;
    private final Sleeper sleeper;

    public static class Sleeper {
        public void sleep(int i10) {
            try {
                TimeUnit.SECONDS.sleep(i10);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public RetryInterceptor(Sleeper sleeper) {
        this.sleeper = sleeper;
    }

    public static int getRetryTimer(int i10) {
        return (int) Math.pow(2.0d, i10);
    }

    @Override // okhttp3.q
    public z intercept(q.a aVar) throws IOException {
        int i10 = 0;
        while (i10 <= 3) {
            try {
                return aVar.a(aVar.request());
            } catch (IOException e10) {
                if (i10 == 3) {
                    throw e10;
                }
                i10++;
                this.sleeper.sleep(getRetryTimer(i10));
            }
        }
        throw new IOException("request failed due to network errors");
    }
}
