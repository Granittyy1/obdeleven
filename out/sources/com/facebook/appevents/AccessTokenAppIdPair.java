package com.facebook.appevents;

import java.io.ObjectStreamException;
import java.io.Serializable;
import kotlin.jvm.internal.i;
import p165n4.s;

/* JADX INFO: compiled from: AccessTokenAppIdPair.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AccessTokenAppIdPair implements Serializable {
    private static final long serialVersionUID = 1;
    private final String accessTokenString;
    private final String applicationId;

    /* JADX INFO: compiled from: AccessTokenAppIdPair.kt */
    public static final class SerializationProxyV1 implements Serializable {
        private static final long serialVersionUID = -2488473066578201069L;
        private final String accessTokenString;
        private final String appId;

        public SerializationProxyV1(String str, String appId) {
            i.e(appId, "appId");
            this.accessTokenString = str;
            this.appId = appId;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new AccessTokenAppIdPair(this.accessTokenString, this.appId);
        }
    }

    public AccessTokenAppIdPair(String str, String applicationId) {
        i.e(applicationId, "applicationId");
        this.applicationId = applicationId;
        this.accessTokenString = s.y(str) ? null : str;
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new SerializationProxyV1(this.accessTokenString, this.applicationId);
    }

    public final String a() {
        return this.accessTokenString;
    }

    public final String b() {
        return this.applicationId;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AccessTokenAppIdPair)) {
            return false;
        }
        AccessTokenAppIdPair accessTokenAppIdPair = (AccessTokenAppIdPair) obj;
        return s.a(accessTokenAppIdPair.accessTokenString, this.accessTokenString) && s.a(accessTokenAppIdPair.applicationId, this.applicationId);
    }

    public final int hashCode() {
        String str = this.accessTokenString;
        return (str == null ? 0 : str.hashCode()) ^ this.applicationId.hashCode();
    }
}
