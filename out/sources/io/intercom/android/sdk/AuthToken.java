package io.intercom.android.sdk;

/* JADX INFO: compiled from: AuthToken.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AuthToken {
    public static final int $stable = 8;
    private String name;
    private String token;

    public AuthToken(String name, String token) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(token, "token");
        this.name = name;
        this.token = token;
    }

    public static /* synthetic */ AuthToken copy$default(AuthToken authToken, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = authToken.name;
        }
        if ((i10 & 2) != 0) {
            str2 = authToken.token;
        }
        return authToken.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.token;
    }

    public final AuthToken copy(String name, String token) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(token, "token");
        return new AuthToken(name, token);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthToken)) {
            return false;
        }
        AuthToken authToken = (AuthToken) obj;
        return kotlin.jvm.internal.i.a(this.name, authToken.name) && kotlin.jvm.internal.i.a(this.token, authToken.token);
    }

    public final String getName() {
        return this.name;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.token.hashCode() + (this.name.hashCode() * 31);
    }

    public final void setName(String str) {
        kotlin.jvm.internal.i.e(str, "<set-?>");
        this.name = str;
    }

    public final void setToken(String str) {
        kotlin.jvm.internal.i.e(str, "<set-?>");
        this.token = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AuthToken(name=");
        sb2.append(this.name);
        sb2.append(", token=");
        return B7.b.g(sb2, this.token, ')');
    }
}
