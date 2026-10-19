package com.google.firebase.inappmessaging;

import com.google.protobuf.C2078u;

/* JADX INFO: loaded from: classes3.dex */
public enum FetchErrorReason implements C2078u.a {
    UNSPECIFIED_FETCH_ERROR(0),
    SERVER_ERROR(1),
    CLIENT_ERROR(2),
    NETWORK_ERROR(3);

    private final int value;

    public static final class a implements C2078u.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28152a = new a();

        @Override // com.google.protobuf.C2078u.b
        public final boolean a(int i10) {
            FetchErrorReason fetchErrorReason;
            if (i10 == 0) {
                fetchErrorReason = FetchErrorReason.UNSPECIFIED_FETCH_ERROR;
            } else if (i10 == 1) {
                fetchErrorReason = FetchErrorReason.SERVER_ERROR;
            } else if (i10 != 2) {
                fetchErrorReason = i10 != 3 ? null : FetchErrorReason.NETWORK_ERROR;
            } else {
                fetchErrorReason = FetchErrorReason.CLIENT_ERROR;
            }
            return fetchErrorReason != null;
        }
    }

    FetchErrorReason(int i10) {
        this.value = i10;
    }

    @Override // com.google.protobuf.C2078u.a
    public final int a() {
        return this.value;
    }
}
