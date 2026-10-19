package p090h1;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import p078g1.C2198d;
import p114j1.A;

/* JADX INFO: compiled from: AudioFocusRequestCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f35717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f35718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2198d f35719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f35720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AudioFocusRequest f35721f;

    /* JADX INFO: renamed from: h1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AudioFocusRequestCompat.java */
    public static final class C0374a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f35722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C2198d f35723b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f35724c;
    }

    /* JADX INFO: compiled from: AudioFocusRequestCompat.java */
    public static class b implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f35725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AudioManager.OnAudioFocusChangeListener f35726b;

        public b(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.f35726b = onAudioFocusChangeListener;
            Looper looper = handler.getLooper();
            int i10 = A.f40996a;
            this.f35725a = new Handler(looper, null);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(final int i10) {
            A.I(this.f35725a, new Runnable() { // from class: h1.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35727b.f35726b.onAudioFocusChange(i10);
                }
            });
        }
    }

    public a(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, C2198d c2198d, boolean z10) {
        this.f35716a = i10;
        this.f35718c = handler;
        this.f35719d = c2198d;
        this.f35720e = z10;
        int i11 = A.f40996a;
        if (i11 < 26) {
            this.f35717b = new b(onAudioFocusChangeListener, handler);
        } else {
            this.f35717b = onAudioFocusChangeListener;
        }
        if (i11 >= 26) {
            this.f35721f = new AudioFocusRequest.Builder(i10).setAudioAttributes(c2198d.a().f35246a).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f35721f = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f35716a == aVar.f35716a && this.f35720e == aVar.f35720e && Objects.equals(this.f35717b, aVar.f35717b) && Objects.equals(this.f35718c, aVar.f35718c) && Objects.equals(this.f35719d, aVar.f35719d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f35716a), this.f35717b, this.f35718c, this.f35719d, Boolean.valueOf(this.f35720e));
    }
}
