package com.google.firebase.inappmessaging;

import com.google.protobuf.C2078u;

/* JADX INFO: loaded from: classes3.dex */
public enum DismissType implements C2078u.a {
    UNKNOWN_DISMISS_TYPE(0),
    AUTO(1),
    CLICK(2),
    SWIPE(3);

    private final int value;

    public static final class a implements C2078u.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28141a = new a();

        @Override // com.google.protobuf.C2078u.b
        public final boolean a(int i10) {
            DismissType dismissType;
            if (i10 == 0) {
                dismissType = DismissType.UNKNOWN_DISMISS_TYPE;
            } else if (i10 == 1) {
                dismissType = DismissType.AUTO;
            } else if (i10 != 2) {
                dismissType = i10 != 3 ? null : DismissType.SWIPE;
            } else {
                dismissType = DismissType.CLICK;
            }
            return dismissType != null;
        }
    }

    DismissType(int i10) {
        this.value = i10;
    }

    @Override // com.google.protobuf.C2078u.a
    public final int a() {
        return this.value;
    }
}
