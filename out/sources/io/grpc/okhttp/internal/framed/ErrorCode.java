package io.grpc.okhttp.internal.framed;

/* JADX INFO: loaded from: classes3.dex */
public enum ErrorCode {
    NO_ERROR(0, -1, 0),
    PROTOCOL_ERROR(1, 1, 1),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_STREAM(1, 2, -1),
    /* JADX INFO: Fake field, exist only in values array */
    STREAM_ALREADY_CLOSED(1, 4, -1),
    /* JADX INFO: Fake field, exist only in values array */
    STREAM_IN_USE(1, 8, -1),
    /* JADX INFO: Fake field, exist only in values array */
    STREAM_ALREADY_CLOSED(1, 9, -1),
    INTERNAL_ERROR(2, 6, 2),
    FLOW_CONTROL_ERROR(3, 7, -1),
    STREAM_CLOSED(5, -1, -1),
    FRAME_TOO_LARGE(6, 11, -1),
    REFUSED_STREAM(7, 3, -1),
    CANCEL(8, 5, -1),
    COMPRESSION_ERROR(9, -1, -1),
    CONNECT_ERROR(10, -1, -1),
    ENHANCE_YOUR_CALM(11, -1, -1),
    INADEQUATE_SECURITY(12, -1, -1),
    /* JADX INFO: Fake field, exist only in values array */
    HTTP_1_1_REQUIRED(13, -1, -1),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_CREDENTIALS(-1, 10, -1);

    public final int httpCode;
    public final int spdyGoAwayCode;
    public final int spdyRstCode;

    ErrorCode(int i10, int i11, int i12) {
        this.httpCode = i10;
        this.spdyRstCode = i11;
        this.spdyGoAwayCode = i12;
    }
}
