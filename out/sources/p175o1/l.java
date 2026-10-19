package p175o1;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: compiled from: AudioTimestampPoller.java */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f45107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f45109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f45110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f45111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f45112f;

    /* JADX INFO: compiled from: AudioTimestampPoller.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioTrack f45113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AudioTimestamp f45114b = new AudioTimestamp();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f45115c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f45116d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f45117e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f45118f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f45119g;

        public a(AudioTrack audioTrack) {
            this.f45113a = audioTrack;
        }
    }

    public l(AudioTrack audioTrack) {
        this.f45107a = new a(audioTrack);
        a();
    }

    public final void a() {
        if (this.f45107a != null) {
            b(0);
        }
    }

    public final void b(int i10) {
        this.f45108b = i10;
        if (i10 == 0) {
            this.f45111e = 0L;
            this.f45112f = -1L;
            this.f45109c = System.nanoTime() / 1000;
            this.f45110d = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f45110d = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f45110d = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.f45110d = 500000L;
        }
    }
}
