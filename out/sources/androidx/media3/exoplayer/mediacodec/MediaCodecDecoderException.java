package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.decoder.DecoderException;
import p114j1.A;

/* JADX INFO: loaded from: classes.dex */
public class MediaCodecDecoderException extends DecoderException {
    public final d codecInfo;
    public final String diagnosticInfo;
    public final int errorCode;

    public MediaCodecDecoderException(IllegalStateException illegalStateException, d dVar) {
        StringBuilder sb2 = new StringBuilder("Decoder failed: ");
        sb2.append(dVar == null ? null : dVar.f18575a);
        super(sb2.toString(), illegalStateException);
        this.codecInfo = dVar;
        boolean z10 = illegalStateException instanceof MediaCodec.CodecException;
        String diagnosticInfo = z10 ? ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo() : null;
        this.diagnosticInfo = diagnosticInfo;
        this.errorCode = A.f40996a >= 23 ? z10 ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0 : A.r(diagnosticInfo);
    }
}
