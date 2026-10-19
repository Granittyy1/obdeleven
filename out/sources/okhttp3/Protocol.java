package okhttp3;

import java.io.IOException;

/* JADX INFO: compiled from: Protocol.kt */
/* JADX INFO: loaded from: classes2.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    private final String protocol;

    /* JADX INFO: compiled from: Protocol.kt */
    public static final class a {
        public static Protocol a(String str) throws IOException {
            Protocol protocol = Protocol.HTTP_1_0;
            if (!str.equals(protocol.protocol)) {
                protocol = Protocol.HTTP_1_1;
                if (!str.equals(protocol.protocol)) {
                    protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                    if (!str.equals(protocol.protocol)) {
                        protocol = Protocol.HTTP_2;
                        if (!str.equals(protocol.protocol)) {
                            protocol = Protocol.SPDY_3;
                            if (!str.equals(protocol.protocol)) {
                                protocol = Protocol.QUIC;
                                if (!str.equals(protocol.protocol)) {
                                    throw new IOException("Unexpected protocol: ".concat(str));
                                }
                            }
                        }
                    }
                }
            }
            return protocol;
        }
    }

    Protocol(String str) {
        this.protocol = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.protocol;
    }
}
