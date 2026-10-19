package com.google.firebase.installations.remote;

/* JADX INFO: compiled from: AutoValue_TokenResult.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends TokenResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f28250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TokenResult.ResponseCode f28251c;

    /* JADX INFO: compiled from: AutoValue_TokenResult.java */
    public static final class a extends TokenResult.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f28252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f28253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TokenResult.ResponseCode f28254c;

        public final b a() {
            String str = this.f28253b == null ? " tokenExpirationTimestamp" : "";
            if (str.isEmpty()) {
                return new b(this.f28252a, this.f28253b.longValue(), this.f28254c);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public b(String str, long j, TokenResult.ResponseCode responseCode) {
        this.f28249a = str;
        this.f28250b = j;
        this.f28251c = responseCode;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public final TokenResult.ResponseCode b() {
        return this.f28251c;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public final String c() {
        return this.f28249a;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public final long d() {
        return this.f28250b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        String str = this.f28249a;
        if (str != null ? str.equals(tokenResult.c()) : tokenResult.c() == null) {
            if (this.f28250b == tokenResult.d()) {
                TokenResult.ResponseCode responseCode = this.f28251c;
                if (responseCode == null) {
                    if (tokenResult.b() == null) {
                        return true;
                    }
                } else if (responseCode.equals(tokenResult.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f28249a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.f28250b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        TokenResult.ResponseCode responseCode = this.f28251c;
        return (responseCode != null ? responseCode.hashCode() : 0) ^ i10;
    }

    public final String toString() {
        return "TokenResult{token=" + this.f28249a + ", tokenExpirationTimestamp=" + this.f28250b + ", responseCode=" + this.f28251c + "}";
    }
}
