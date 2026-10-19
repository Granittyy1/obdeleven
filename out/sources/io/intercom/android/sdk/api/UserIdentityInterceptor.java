package io.intercom.android.sdk.api;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import java.io.IOException;
import okhttp3.q;
import okhttp3.z;

/* JADX INFO: loaded from: classes3.dex */
class UserIdentityInterceptor implements q {
    private static final String NO_USER_IDENTITY = "A network request was made with no user registered on this device.Please call registerUnidentifiedUser() or registerIdentifiedUser(Registration).";
    private static final String USER_IDENTITY_CHANGED = "registered user changed while this request was in flight";
    private final Twig twig = LumberMill.getLogger();
    private final UserIdentity userIdentity;

    public UserIdentityInterceptor(UserIdentity userIdentity) {
        this.userIdentity = userIdentity;
    }

    @Override // okhttp3.q
    public z intercept(q.a aVar) throws IOException {
        if (!this.userIdentity.identityExists()) {
            if (!this.userIdentity.isSoftReset() || !aVar.request().f45661a.f45579i.contains("device_tokens") || !aVar.request().f45662b.equals("PUT")) {
                throw new IOException(NO_USER_IDENTITY);
            }
            this.twig.internal("interceptor", "removing device token - proceeding");
            return aVar.a(aVar.request());
        }
        String fingerprint = this.userIdentity.getFingerprint();
        z zVarA = aVar.a(aVar.request());
        if (fingerprint.equals(this.userIdentity.getFingerprint())) {
            this.twig.internal("interceptor", "proceeding");
            return zVarA;
        }
        this.twig.internal("interceptor", "halting: user identity changed");
        zVarA.f45686h.close();
        throw new IOException(USER_IDENTITY_CHANGED);
    }
}
