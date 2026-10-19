package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class VideoFrameProcessingException extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f17864b = 0;
    public final long presentationTimeUs;

    public VideoFrameProcessingException(Exception exc) {
        super(exc);
        this.presentationTimeUs = -9223372036854775807L;
    }
}
