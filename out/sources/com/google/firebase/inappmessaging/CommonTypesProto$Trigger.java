package com.google.firebase.inappmessaging;

import com.google.protobuf.C2078u;

/* JADX INFO: loaded from: classes3.dex */
public enum CommonTypesProto$Trigger implements C2078u.a {
    UNKNOWN_TRIGGER(0),
    APP_LAUNCH(1),
    ON_FOREGROUND(2),
    UNRECOGNIZED(-1);

    private final int value;

    CommonTypesProto$Trigger(int i10) {
        this.value = i10;
    }

    @Override // com.google.protobuf.C2078u.a
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
