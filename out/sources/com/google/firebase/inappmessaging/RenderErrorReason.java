package com.google.firebase.inappmessaging;

import com.google.protobuf.C2078u;

/* JADX INFO: loaded from: classes3.dex */
public enum RenderErrorReason implements C2078u.a {
    UNSPECIFIED_RENDER_ERROR(0),
    IMAGE_FETCH_ERROR(1),
    IMAGE_DISPLAY_ERROR(2),
    IMAGE_UNSUPPORTED_FORMAT(3);

    private final int value;

    public static final class a implements C2078u.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28174a = new a();

        @Override // com.google.protobuf.C2078u.b
        public final boolean a(int i10) {
            RenderErrorReason renderErrorReason;
            if (i10 == 0) {
                renderErrorReason = RenderErrorReason.UNSPECIFIED_RENDER_ERROR;
            } else if (i10 == 1) {
                renderErrorReason = RenderErrorReason.IMAGE_FETCH_ERROR;
            } else if (i10 != 2) {
                renderErrorReason = i10 != 3 ? null : RenderErrorReason.IMAGE_UNSUPPORTED_FORMAT;
            } else {
                renderErrorReason = RenderErrorReason.IMAGE_DISPLAY_ERROR;
            }
            return renderErrorReason != null;
        }
    }

    RenderErrorReason(int i10) {
        this.value = i10;
    }

    @Override // com.google.protobuf.C2078u.a
    public final int a() {
        return this.value;
    }
}
